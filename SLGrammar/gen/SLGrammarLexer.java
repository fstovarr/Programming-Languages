// Generated from /home/fabiotovar/Proyectos/Programming Languages/AntlrTutorial/grammar/SLGrammarLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RESERVED=1, PROGRAM=2, SUBROUTINE=3, RETURNS=4, DATA_TYPE=5, TYPE_STRING=6, 
		TYPE_NUMBER=7, TYPE_LOGIC=8, REF=9, START=10, END=11, VAR=12, CONST=13, 
		VECTOR=14, MATRIX=15, RECORD=16, PREDEF_CONST_POS=17, PREDEF_CONST_NEG=18, 
		INT_NUMBER=19, REAL_NUMBER=20, EXP_NUMBER=21, CHAR=22, TK_PLUS=23, TK_MINUS=24, 
		TK_ASTERISK=25, TK_DIVISION=26, TK_POWER=27, TK_MOD=28, TK_NOT_EQUAL=29, 
		TK_EQUAL=30, TK_GREATER_EQUAL=31, TK_GREATER=32, TK_LESS_EQUAL=33, TK_LESS=34, 
		TK_ASSIGN=35, TK_SEMICOLON=36, TK_DOUBLE_POINT=37, TK_POINT=38, TK_COMMA=39, 
		TK_LEFT_PAR=40, TK_RIGHT_PAR=41, TK_LEFT_BRACE=42, TK_RIGHT_BRACE=43, 
		TK_LEFT_BRACKET=44, TK_RIGHT_BRACKET=45, ID=46, SPACES=47, COMMENT=48, 
		TK_STRING=49, LITERAL=50;
	public static final int
		STR1=1, LIT1=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "STR1", "LIT1"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RESERVED", "PROGRAM", "SUBROUTINE", "RETURNS", "DATA_TYPE", "TYPE_STRING", 
			"TYPE_NUMBER", "TYPE_LOGIC", "REF", "START", "END", "VAR", "CONST", "VECTOR", 
			"MATRIX", "RECORD", "PREDEF_CONST_POS", "PREDEF_CONST_NEG", "INT_NUMBER", 
			"REAL_NUMBER", "EXP_NUMBER", "DIGIT", "START_STR", "START_LIT", "CHAR", 
			"TK_PLUS", "TK_MINUS", "TK_ASTERISK", "TK_DIVISION", "TK_POWER", "TK_MOD", 
			"TK_NOT_EQUAL", "TK_EQUAL", "TK_GREATER_EQUAL", "TK_GREATER", "TK_LESS_EQUAL", 
			"TK_LESS", "TK_ASSIGN", "TK_SEMICOLON", "TK_DOUBLE_POINT", "TK_POINT", 
			"TK_COMMA", "TK_LEFT_PAR", "TK_RIGHT_PAR", "TK_LEFT_BRACE", "TK_RIGHT_BRACE", 
			"TK_LEFT_BRACKET", "TK_RIGHT_BRACKET", "ID", "SPACES", "COMMENT", "MULTILINE_COMMENT", 
			"SINGLE_LINE_COMMENT", "TK_STRING", "TEXT", "LITERAL", "TEXT_LIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'programa'", "'subrutina'", "'retorna'", null, "'cadena'", 
			"'numerico'", "'logico'", "'ref'", "'inicio'", "'fin'", "'var'", "'const'", 
			"'vector'", "'matriz'", "'registro'", null, null, null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'<>'", "'=='", "'>='", "'>'", 
			"'<='", "'<'", "'='", "';'", "':'", "'.'", "','", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", null, null, null, "'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RESERVED", "PROGRAM", "SUBROUTINE", "RETURNS", "DATA_TYPE", "TYPE_STRING", 
			"TYPE_NUMBER", "TYPE_LOGIC", "REF", "START", "END", "VAR", "CONST", "VECTOR", 
			"MATRIX", "RECORD", "PREDEF_CONST_POS", "PREDEF_CONST_NEG", "INT_NUMBER", 
			"REAL_NUMBER", "EXP_NUMBER", "CHAR", "TK_PLUS", "TK_MINUS", "TK_ASTERISK", 
			"TK_DIVISION", "TK_POWER", "TK_MOD", "TK_NOT_EQUAL", "TK_EQUAL", "TK_GREATER_EQUAL", 
			"TK_GREATER", "TK_LESS_EQUAL", "TK_LESS", "TK_ASSIGN", "TK_SEMICOLON", 
			"TK_DOUBLE_POINT", "TK_POINT", "TK_COMMA", "TK_LEFT_PAR", "TK_RIGHT_PAR", 
			"TK_LEFT_BRACE", "TK_RIGHT_BRACE", "TK_LEFT_BRACKET", "TK_RIGHT_BRACKET", 
			"ID", "SPACES", "COMMENT", "TK_STRING", "LITERAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SLGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SLGrammarLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u01fa\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
		"\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4"+
		"*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00ea\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u010a\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0159\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0162\n\23\3\24\5\24\u0165\n\24\3\24\6\24\u0168"+
		"\n\24\r\24\16\24\u0169\3\25\3\25\3\25\6\25\u016f\n\25\r\25\16\25\u0170"+
		"\3\26\3\26\5\26\u0175\n\26\3\26\3\26\5\26\u0179\n\26\3\26\6\26\u017c\n"+
		"\26\r\26\16\26\u017d\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\7\62\u01c4\n\62\f\62\16\62\u01c7\13\62\3\63\6\63\u01ca"+
		"\n\63\r\63\16\63\u01cb\3\63\3\63\3\64\3\64\5\64\u01d2\n\64\3\64\3\64\3"+
		"\65\3\65\3\65\3\65\7\65\u01da\n\65\f\65\16\65\u01dd\13\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\7\66\u01e6\n\66\f\66\16\66\u01e9\13\66\3\67\3"+
		"\67\3\67\3\67\38\38\38\38\39\39\39\39\3:\3:\3:\3:\3\u01db\2;\5\3\7\4\t"+
		"\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%"+
		"\23\'\24)\25+\26-\27/\2\61\2\63\2\65\30\67\319\32;\33=\34?\35A\36C\37"+
		"E G!I\"K#M$O%Q&S\'U(W)Y*[+],_-a.c/e\60g\61i\62k\2m\2o\63q\2s\64u\2\5\2"+
		"\3\4\n\3\2//\4\2GGgg\4\2--//\3\2\62;\7\2C\\aac|\u00d3\u00d3\u00f3\u00f3"+
		"\b\2\62;C\\aac|\u00d3\u00d3\u00f3\u00f3\5\2\13\f\17\17\"\"\3\2\f\f\2\u0218"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\3o\3\2\2\2\3q\3\2\2\2\4s\3\2\2\2\4u\3\2\2\2"+
		"\5\u00e9\3\2\2\2\7\u00eb\3\2\2\2\t\u00f4\3\2\2\2\13\u00fe\3\2\2\2\r\u0109"+
		"\3\2\2\2\17\u010b\3\2\2\2\21\u0112\3\2\2\2\23\u011b\3\2\2\2\25\u0122\3"+
		"\2\2\2\27\u0126\3\2\2\2\31\u012d\3\2\2\2\33\u0131\3\2\2\2\35\u0135\3\2"+
		"\2\2\37\u013b\3\2\2\2!\u0142\3\2\2\2#\u0149\3\2\2\2%\u0158\3\2\2\2\'\u0161"+
		"\3\2\2\2)\u0164\3\2\2\2+\u016b\3\2\2\2-\u0174\3\2\2\2/\u017f\3\2\2\2\61"+
		"\u0181\3\2\2\2\63\u0186\3\2\2\2\65\u018b\3\2\2\2\67\u018f\3\2\2\29\u0191"+
		"\3\2\2\2;\u0193\3\2\2\2=\u0195\3\2\2\2?\u0197\3\2\2\2A\u0199\3\2\2\2C"+
		"\u019b\3\2\2\2E\u019e\3\2\2\2G\u01a1\3\2\2\2I\u01a4\3\2\2\2K\u01a6\3\2"+
		"\2\2M\u01a9\3\2\2\2O\u01ab\3\2\2\2Q\u01ad\3\2\2\2S\u01af\3\2\2\2U\u01b1"+
		"\3\2\2\2W\u01b3\3\2\2\2Y\u01b5\3\2\2\2[\u01b7\3\2\2\2]\u01b9\3\2\2\2_"+
		"\u01bb\3\2\2\2a\u01bd\3\2\2\2c\u01bf\3\2\2\2e\u01c1\3\2\2\2g\u01c9\3\2"+
		"\2\2i\u01d1\3\2\2\2k\u01d5\3\2\2\2m\u01e1\3\2\2\2o\u01ea\3\2\2\2q\u01ee"+
		"\3\2\2\2s\u01f2\3\2\2\2u\u01f6\3\2\2\2wx\7c\2\2xy\7p\2\2y\u00ea\7f\2\2"+
		"z{\7c\2\2{|\7t\2\2|}\7e\2\2}~\7j\2\2~\177\7k\2\2\177\u0080\7x\2\2\u0080"+
		"\u00ea\7q\2\2\u0081\u0082\7e\2\2\u0082\u0083\7c\2\2\u0083\u0084\7u\2\2"+
		"\u0084\u00ea\7q\2\2\u0085\u0086\7e\2\2\u0086\u0087\7q\2\2\u0087\u0088"+
		"\7p\2\2\u0088\u0089\7u\2\2\u0089\u008a\7v\2\2\u008a\u008b\7c\2\2\u008b"+
		"\u008c\7p\2\2\u008c\u008d\7v\2\2\u008d\u008e\7g\2\2\u008e\u00ea\7u\2\2"+
		"\u008f\u0090\7f\2\2\u0090\u0091\7g\2\2\u0091\u0092\7u\2\2\u0092\u0093"+
		"\7f\2\2\u0093\u00ea\7g\2\2\u0094\u0095\7g\2\2\u0095\u0096\7x\2\2\u0096"+
		"\u0097\7c\2\2\u0097\u00ea\7n\2\2\u0098\u0099\7j\2\2\u0099\u009a\7c\2\2"+
		"\u009a\u009b\7u\2\2\u009b\u009c\7v\2\2\u009c\u00ea\7c\2\2\u009d\u009e"+
		"\7k\2\2\u009e\u009f\7o\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1\7t\2\2\u00a1"+
		"\u00a2\7k\2\2\u00a2\u00a3\7o\2\2\u00a3\u00a4\7k\2\2\u00a4\u00ea\7t\2\2"+
		"\u00a5\u00a6\7n\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7g\2\2\u00a8\u00ea"+
		"\7t\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ea\7d\2\2\u00ac"+
		"\u00ad\7n\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7d\2\2\u00af\u00b0\7g\2\2"+
		"\u00b0\u00b1\7z\2\2\u00b1\u00ea\7v\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4"+
		"\7k\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7v\2\2\u00b7"+
		"\u00b8\7t\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ea\7u\2\2\u00ba\u00bb\7p\2\2"+
		"\u00bb\u00bc\7q\2\2\u00bc\u00ea\7v\2\2\u00bd\u00be\7q\2\2\u00be\u00ea"+
		"\7t\2\2\u00bf\u00c0\7r\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7u\2\2\u00c2"+
		"\u00ea\7q\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7i\2\2"+
		"\u00c6\u00c7\7k\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca"+
		"\7t\2\2\u00ca\u00ea\7q\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\u00ce\7r\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7k\2\2"+
		"\u00d1\u00ea\7t\2\2\u00d2\u00d3\7u\2\2\u00d3\u00ea\7k\2\2\u00d4\u00d5"+
		"\7u\2\2\u00d5\u00d6\7k\2\2\u00d6\u00ea\7p\2\2\u00d7\u00d8\7u\2\2\u00d8"+
		"\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da\u00ea\7q\2\2\u00db\u00dc\7v\2\2"+
		"\u00dc\u00dd\7k\2\2\u00dd\u00de\7r\2\2\u00de\u00df\7q\2\2\u00df\u00ea"+
		"\7u\2\2\u00e0\u00e1\7x\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7t\2\2\u00e3"+
		"\u00e4\7k\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7d\2\2\u00e6\u00e7\7n\2\2"+
		"\u00e7\u00e8\7g\2\2\u00e8\u00ea\7u\2\2\u00e9w\3\2\2\2\u00e9z\3\2\2\2\u00e9"+
		"\u0081\3\2\2\2\u00e9\u0085\3\2\2\2\u00e9\u008f\3\2\2\2\u00e9\u0094\3\2"+
		"\2\2\u00e9\u0098\3\2\2\2\u00e9\u009d\3\2\2\2\u00e9\u00a5\3\2\2\2\u00e9"+
		"\u00a9\3\2\2\2\u00e9\u00ac\3\2\2\2\u00e9\u00b2\3\2\2\2\u00e9\u00ba\3\2"+
		"\2\2\u00e9\u00bd\3\2\2\2\u00e9\u00bf\3\2\2\2\u00e9\u00c3\3\2\2\2\u00e9"+
		"\u00cb\3\2\2\2\u00e9\u00d2\3\2\2\2\u00e9\u00d4\3\2\2\2\u00e9\u00d7\3\2"+
		"\2\2\u00e9\u00db\3\2\2\2\u00e9\u00e0\3\2\2\2\u00ea\6\3\2\2\2\u00eb\u00ec"+
		"\7r\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7i\2\2\u00ef"+
		"\u00f0\7t\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7o\2\2\u00f2\u00f3\7c\2\2"+
		"\u00f3\b\3\2\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7d"+
		"\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb"+
		"\7k\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7c\2\2\u00fd\n\3\2\2\2\u00fe\u00ff"+
		"\7t\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7v\2\2\u0101\u0102\7q\2\2\u0102"+
		"\u0103\7t\2\2\u0103\u0104\7p\2\2\u0104\u0105\7c\2\2\u0105\f\3\2\2\2\u0106"+
		"\u010a\5\17\7\2\u0107\u010a\5\21\b\2\u0108\u010a\5\23\t\2\u0109\u0106"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\16\3\2\2\2\u010b"+
		"\u010c\7e\2\2\u010c\u010d\7c\2\2\u010d\u010e\7f\2\2\u010e\u010f\7g\2\2"+
		"\u010f\u0110\7p\2\2\u0110\u0111\7c\2\2\u0111\20\3\2\2\2\u0112\u0113\7"+
		"p\2\2\u0113\u0114\7w\2\2\u0114\u0115\7o\2\2\u0115\u0116\7g\2\2\u0116\u0117"+
		"\7t\2\2\u0117\u0118\7k\2\2\u0118\u0119\7e\2\2\u0119\u011a\7q\2\2\u011a"+
		"\22\3\2\2\2\u011b\u011c\7n\2\2\u011c\u011d\7q\2\2\u011d\u011e\7i\2\2\u011e"+
		"\u011f\7k\2\2\u011f\u0120\7e\2\2\u0120\u0121\7q\2\2\u0121\24\3\2\2\2\u0122"+
		"\u0123\7t\2\2\u0123\u0124\7g\2\2\u0124\u0125\7h\2\2\u0125\26\3\2\2\2\u0126"+
		"\u0127\7k\2\2\u0127\u0128\7p\2\2\u0128\u0129\7k\2\2\u0129\u012a\7e\2\2"+
		"\u012a\u012b\7k\2\2\u012b\u012c\7q\2\2\u012c\30\3\2\2\2\u012d\u012e\7"+
		"h\2\2\u012e\u012f\7k\2\2\u012f\u0130\7p\2\2\u0130\32\3\2\2\2\u0131\u0132"+
		"\7x\2\2\u0132\u0133\7c\2\2\u0133\u0134\7t\2\2\u0134\34\3\2\2\2\u0135\u0136"+
		"\7e\2\2\u0136\u0137\7q\2\2\u0137\u0138\7p\2\2\u0138\u0139\7u\2\2\u0139"+
		"\u013a\7v\2\2\u013a\36\3\2\2\2\u013b\u013c\7x\2\2\u013c\u013d\7g\2\2\u013d"+
		"\u013e\7e\2\2\u013e\u013f\7v\2\2\u013f\u0140\7q\2\2\u0140\u0141\7t\2\2"+
		"\u0141 \3\2\2\2\u0142\u0143\7o\2\2\u0143\u0144\7c\2\2\u0144\u0145\7v\2"+
		"\2\u0145\u0146\7t\2\2\u0146\u0147\7k\2\2\u0147\u0148\7|\2\2\u0148\"\3"+
		"\2\2\2\u0149\u014a\7t\2\2\u014a\u014b\7g\2\2\u014b\u014c\7i\2\2\u014c"+
		"\u014d\7k\2\2\u014d\u014e\7u\2\2\u014e\u014f\7v\2\2\u014f\u0150\7t\2\2"+
		"\u0150\u0151\7q\2\2\u0151$\3\2\2\2\u0152\u0153\7V\2\2\u0153\u0154\7T\2"+
		"\2\u0154\u0155\7W\2\2\u0155\u0159\7G\2\2\u0156\u0157\7U\2\2\u0157\u0159"+
		"\7K\2\2\u0158\u0152\3\2\2\2\u0158\u0156\3\2\2\2\u0159&\3\2\2\2\u015a\u015b"+
		"\7H\2\2\u015b\u015c\7C\2\2\u015c\u015d\7N\2\2\u015d\u015e\7U\2\2\u015e"+
		"\u0162\7G\2\2\u015f\u0160\7P\2\2\u0160\u0162\7Q\2\2\u0161\u015a\3\2\2"+
		"\2\u0161\u015f\3\2\2\2\u0162(\3\2\2\2\u0163\u0165\t\2\2\2\u0164\u0163"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0168\5/\27\2\u0167"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a*\3\2\2\2\u016b\u016c\5)\24\2\u016c\u016e\7\60\2\2\u016d\u016f"+
		"\5/\27\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171,\3\2\2\2\u0172\u0175\5)\24\2\u0173\u0175\5+\25\2"+
		"\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178"+
		"\t\3\2\2\u0177\u0179\t\4\2\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017b\3\2\2\2\u017a\u017c\5/\27\2\u017b\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e.\3\2\2\2\u017f\u0180"+
		"\t\5\2\2\u0180\60\3\2\2\2\u0181\u0182\7$\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\b\30\2\2\u0184\u0185\b\30\3\2\u0185\62\3\2\2\2\u0186\u0187\7)\2"+
		"\2\u0187\u0188\3\2\2\2\u0188\u0189\b\31\2\2\u0189\u018a\b\31\4\2\u018a"+
		"\64\3\2\2\2\u018b\u018c\7)\2\2\u018c\u018d\13\2\2\2\u018d\u018e\7)\2\2"+
		"\u018e\66\3\2\2\2\u018f\u0190\7-\2\2\u01908\3\2\2\2\u0191\u0192\7/\2\2"+
		"\u0192:\3\2\2\2\u0193\u0194\7,\2\2\u0194<\3\2\2\2\u0195\u0196\7\61\2\2"+
		"\u0196>\3\2\2\2\u0197\u0198\7`\2\2\u0198@\3\2\2\2\u0199\u019a\7\'\2\2"+
		"\u019aB\3\2\2\2\u019b\u019c\7>\2\2\u019c\u019d\7@\2\2\u019dD\3\2\2\2\u019e"+
		"\u019f\7?\2\2\u019f\u01a0\7?\2\2\u01a0F\3\2\2\2\u01a1\u01a2\7@\2\2\u01a2"+
		"\u01a3\7?\2\2\u01a3H\3\2\2\2\u01a4\u01a5\7@\2\2\u01a5J\3\2\2\2\u01a6\u01a7"+
		"\7>\2\2\u01a7\u01a8\7?\2\2\u01a8L\3\2\2\2\u01a9\u01aa\7>\2\2\u01aaN\3"+
		"\2\2\2\u01ab\u01ac\7?\2\2\u01acP\3\2\2\2\u01ad\u01ae\7=\2\2\u01aeR\3\2"+
		"\2\2\u01af\u01b0\7<\2\2\u01b0T\3\2\2\2\u01b1\u01b2\7\60\2\2\u01b2V\3\2"+
		"\2\2\u01b3\u01b4\7.\2\2\u01b4X\3\2\2\2\u01b5\u01b6\7*\2\2\u01b6Z\3\2\2"+
		"\2\u01b7\u01b8\7+\2\2\u01b8\\\3\2\2\2\u01b9\u01ba\7]\2\2\u01ba^\3\2\2"+
		"\2\u01bb\u01bc\7_\2\2\u01bc`\3\2\2\2\u01bd\u01be\7}\2\2\u01beb\3\2\2\2"+
		"\u01bf\u01c0\7\177\2\2\u01c0d\3\2\2\2\u01c1\u01c5\t\6\2\2\u01c2\u01c4"+
		"\t\7\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6f\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01ca\t\b\2\2"+
		"\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\b\63\5\2\u01ceh\3\2\2\2\u01cf"+
		"\u01d2\5k\65\2\u01d0\u01d2\5m\66\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2"+
		"\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\b\64\5\2\u01d4j\3\2\2\2\u01d5\u01d6"+
		"\7\61\2\2\u01d6\u01d7\7,\2\2\u01d7\u01db\3\2\2\2\u01d8\u01da\13\2\2\2"+
		"\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01dc\3\2\2\2\u01db\u01d9"+
		"\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\7,\2\2\u01df"+
		"\u01e0\7\61\2\2\u01e0l\3\2\2\2\u01e1\u01e2\7\61\2\2\u01e2\u01e3\7\61\2"+
		"\2\u01e3\u01e7\3\2\2\2\u01e4\u01e6\n\t\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9"+
		"\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8n\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01eb\7$\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\b\67"+
		"\6\2\u01edp\3\2\2\2\u01ee\u01ef\n\t\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1"+
		"\b8\2\2\u01f1r\3\2\2\2\u01f2\u01f3\7)\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5"+
		"\b9\6\2\u01f5t\3\2\2\2\u01f6\u01f7\13\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01f9\b:\2\2\u01f9v\3\2\2\2\24\2\3\4\u00e9\u0109\u0158\u0161\u0164\u0169"+
		"\u0170\u0174\u0178\u017d\u01c5\u01cb\u01d1\u01db\u01e7\7\5\2\2\7\3\2\7"+
		"\4\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}