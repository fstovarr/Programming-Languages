import java.io.File
import java.lang.Exception
import java.math.BigInteger
import java.util.concurrent.locks.Condition

class Lexer {
    private val rules: HashMap<String, TokenRule> by lazy {
        val parser = RulesParser()
        parser.parse(File("src/lexicon.lx"))
        parser.rules
    }

    val tokens = ArrayList<Token>()

    private fun tokenize(word: String): Token? {
        rules.forEach {
            //    if (it.regex.matches(word))
            //        return Token(it.name, word, 0, 0)
        }
        return null
    }

    fun analyze(file: File) {
        val textReader = TextReader(file.inputStream())
        var actualChar: Char

        while (textReader.hasChars()) {
            actualChar = textReader.next()
            when {
                actualChar == '"' -> readString(textReader)
                "[a-zA-Zñ_]".toRegex().matches(actualChar.toString()) -> readWord(textReader, actualChar)
                else -> {
                    readOtherCharacters(textReader, actualChar)
                }
            }
        }
    }

    private fun readOtherCharacters(textReader: TextReader, actualChar: Char) {
        val row = textReader.row
        val col = textReader.col

        rules.keys.forEach {
            if (it !in arrayOf("reserved", "id", "number")) {
                if (rules[it]!!.regex.matches(actualChar.toString())){
                    tokens += Token(rules[it]!!.name, row, col)
                    return@forEach
                }
            }
        }
    }

    private fun readWord(textReader: TextReader, initial: Char) {
        val row = textReader.row
        val col = textReader.col
        val string = readWhile(textReader, initial, "[a-zA-Z0-9_ñ]+".toRegex())

        if (!string.isNullOrEmpty())
            when {
                rules["reserved"]!!.regex matches string ->
                    tokens += Token(string, row, col)
                rules["id"]!!.regex matches string ->
                    tokens += Token(rules["id"]!!.name, string, row, col)
            }
    }

    private fun readWhile(
        textReader: TextReader,
        initialChar: Char,
        regex: Regex,
        ignoreSpaces: Boolean = false
    ): String? {
        val row = textReader.row
        val col = textReader.col

        return buildString {
            append(initialChar)
            var actualChar: Char = textReader.next()
            append(actualChar)

            while (textReader.hasChars()) {
                actualChar = textReader.next()
                if (!(regex matches this.toString() + actualChar)) break
                append(actualChar)
            }
            // if (!(regex matches this.toString())) throw LexicalError(row, col)
        }
    }

    private fun readUntil(
        textReader: TextReader, vararg limitChars: Char,
        ignoreSpaces: Boolean = false,
        maxChars: Int? = null
    ): String? {
        val row = textReader.row
        val col = textReader.col
        var counter = 10000

        return buildString {
            var actualChar: Char = textReader.next()
            append(actualChar)
            counter++

            while (textReader.hasChars() && actualChar !in limitChars) {
                if (maxChars != null && counter++ <= maxChars) break
                actualChar = textReader.next()
                append(actualChar)
            }
            if (actualChar !in limitChars) throw LexicalError(row, col)
        }
    }

    private fun readNumber(textReader: TextReader, initial: Char) {
        val string = buildString {
            append(initial)
        }
    }

    private fun readString(textReader: TextReader) {
        val row = textReader.row
        val col = textReader.col
        val string = readUntil(textReader, '"')

        if (!string.isNullOrEmpty())
            tokens += Token("tk_string", "\"$string", row, col)
    }
}

class LexicalError(val row: Int, val col: Int, message: String = "") : Error(message) {
    override fun toString() = ">>> Lexical error: (row: $row, col: $col) | $message"
}

fun main() {
    val lexer = Lexer()
    lexer.analyze(File("src/slexample.txt"))
    lexer.tokens.forEach {
        println(it)
    }
}