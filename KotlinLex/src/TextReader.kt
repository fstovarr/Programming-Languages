import java.io.InputStream

class TextReader(inputStream: InputStream) {
    private val reader = inputStream.reader()
    private var actualChar = 0
    private var nextChar = reader.read()
    var row = 1
        private set
    var col = 0
        private set

    fun next(): Char {
        fun consumeChar() {
            actualChar = nextChar
            nextChar = reader.read()
            col++
        }

        consumeChar()

        when (actualChar) {
            '\n'.toInt() -> {
                row++; col = 0
            }
        }

        return actualChar.toChar()
    }

    fun hasChars() = nextChar != -1
}