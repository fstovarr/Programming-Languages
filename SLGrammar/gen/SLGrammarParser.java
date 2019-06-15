// Generated from /home/fabiotovar/Proyectos/Programming Languages/AntlrTutorial/grammar/SLGrammarParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, ID=2, CONST=3, TK_ASSIGN=4, TK_STRING=5, INT_NUMBER=6, REAL_NUMBER=7, 
		EXP_NUMBER=8, PREDEF_CONST_POS=9, PREDEF_CONST_NEG=10, DATA_TYPE=11, VAR=12, 
		VECTOR=13, TK_LEFT_BRACE=14, TK_RIGHT_BRACE=15, MATRIX=16, TK_COMMA=17, 
		RECORD=18, TK_LEFT_BRACKET=19, TK_RIGHT_BRACKET=20, TK_DOUBLE_POINT=21, 
		START=22, END=23, SUBROUTINE=24, RETURNS=25, TK_LEFT_PAR=26, TK_RIGHT_PAR=27, 
		REF=28;
	public static final int
		RULE_file = 0, RULE_declarations = 1, RULE_const_declarations = 2, RULE_types_declarations = 3, 
		RULE_var_declarations = 4, RULE_simple_variables = 5, RULE_simple_variable_aux = 6, 
		RULE_body = 7, RULE_subroutines = 8, RULE_parameters = 9, RULE_param_declaration = 10, 
		RULE_param_declaration_aux = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "declarations", "const_declarations", "types_declarations", "var_declarations", 
			"simple_variables", "simple_variable_aux", "body", "subroutines", "parameters", 
			"param_declaration", "param_declaration_aux"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "ID", "CONST", "TK_ASSIGN", "TK_STRING", "INT_NUMBER", 
			"REAL_NUMBER", "EXP_NUMBER", "PREDEF_CONST_POS", "PREDEF_CONST_NEG", 
			"DATA_TYPE", "VAR", "VECTOR", "TK_LEFT_BRACE", "TK_RIGHT_BRACE", "MATRIX", 
			"TK_COMMA", "RECORD", "TK_LEFT_BRACKET", "TK_RIGHT_BRACKET", "TK_DOUBLE_POINT", 
			"START", "END", "SUBROUTINE", "RETURNS", "TK_LEFT_PAR", "TK_RIGHT_PAR", 
			"REF"
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

	@Override
	public String getGrammarFileName() { return "SLGrammarParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SLGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public SubroutinesContext subroutines() {
			return getRuleContext(SubroutinesContext.class,0);
		}
		public TerminalNode PROGRAMA() { return getToken(SLGrammarParser.PROGRAMA, 0); }
		public TerminalNode ID() { return getToken(SLGrammarParser.ID, 0); }
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLGrammarParserVisitor ) return ((SLGrammarParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAMA) {
				{
				setState(24);
				match(PROGRAMA);
				setState(25);
				match(ID);
				}
			}

			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << DATA_TYPE) | (1L << VAR))) != 0)) {
				{
				{
				setState(28);
				declarations();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			body();
			setState(35);
			subroutines();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public Const_declarationsContext const_declarations() {
			return getRuleContext(Const_declarationsContext.class,0);
		}
		public Types_declarationsContext types_declarations() {
			return getRuleContext(Types_declarationsContext.class,0);
		}
		public Var_declarationsContext var_declarations() {
			return getRuleContext(Var_declarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLGrammarParserVisitor ) return ((SLGrammarParserVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				const_declarations();
				}
				break;
			case DATA_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				types_declarations();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				var_declarations();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_declarationsContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(SLGrammarParser.CONST, 0); }
		public List<TerminalNode> ID() { return getTokens(SLGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SLGrammarParser.ID, i);
		}
		public List<TerminalNode> TK_ASSIGN() { return getTokens(SLGrammarParser.TK_ASSIGN); }
		public TerminalNode TK_ASSIGN(int i) {
			return getToken(SLGrammarParser.TK_ASSIGN, i);
		}
		public List<TerminalNode> TK_STRING() { return getTokens(SLGrammarParser.TK_STRING); }
		public TerminalNode TK_STRING(int i) {
			return getToken(SLGrammarParser.TK_STRING, i);
		}
		public List<TerminalNode> INT_NUMBER() { return getTokens(SLGrammarParser.INT_NUMBER); }
		public TerminalNode INT_NUMBER(int i) {
			return getToken(SLGrammarParser.INT_NUMBER, i);
		}
		public List<TerminalNode> REAL_NUMBER() { return getTokens(SLGrammarParser.REAL_NUMBER); }
		public TerminalNode REAL_NUMBER(int i) {
			return getToken(SLGrammarParser.REAL_NUMBER, i);
		}
		public List<TerminalNode> EXP_NUMBER() { return getTokens(SLGrammarParser.EXP_NUMBER); }
		public TerminalNode EXP_NUMBER(int i) {
			return getToken(SLGrammarParser.EXP_NUMBER, i);
		}
		public List<TerminalNode> PREDEF_CONST_POS() { return getTokens(SLGrammarParser.PREDEF_CONST_POS); }
		public TerminalNode PREDEF_CONST_POS(int i) {
			return getToken(SLGrammarParser.PREDEF_CONST_POS, i);
		}
		public List<TerminalNode> PREDEF_CONST_NEG() { return getTokens(SLGrammarParser.PREDEF_CONST_NEG); }
		public TerminalNode PREDEF_CONST_NEG(int i) {
			return getToken(SLGrammarParser.PREDEF_CONST_NEG, i);
		}
		public Const_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).enterConst_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).exitConst_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLGrammarParserVisitor ) return ((SLGrammarParserVisitor<? extends T>)visitor).visitConst_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_declarationsContext const_declarations() throws RecognitionException {
		Const_declarationsContext _localctx = new Const_declarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_const_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(CONST);
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				match(ID);
				setState(44);
				match(TK_ASSIGN);
				setState(45);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_STRING) | (1L << INT_NUMBER) | (1L << REAL_NUMBER) | (1L << EXP_NUMBER) | (1L << PREDEF_CONST_POS) | (1L << PREDEF_CONST_NEG))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Types_declarationsContext extends ParserRuleContext {
		public TerminalNode DATA_TYPE() { return getToken(SLGrammarParser.DATA_TYPE, 0); }
		public Types_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).enterTypes_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).exitTypes_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLGrammarParserVisitor ) return ((SLGrammarParserVisitor<? extends T>)visitor).visitTypes_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Types_declarationsContext types_declarations() throws RecognitionException {
		Types_declarationsContext _localctx = new Types_declarationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_types_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(DATA_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declarationsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SLGrammarParser.VAR, 0); }
		public List<Simple_variablesContext> simple_variables() {
			return getRuleContexts(Simple_variablesContext.class);
		}
		public Simple_variablesContext simple_variables(int i) {
			return getRuleContext(Simple_variablesContext.class,i);
		}
		public Var_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).enterVar_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).exitVar_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLGrammarParserVisitor ) return ((SLGrammarParserVisitor<? extends T>)visitor).visitVar_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declarationsContext var_declarations() throws RecognitionException {
		Var_declarationsContext _localctx = new Var_declarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(VAR);
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				simple_variables();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_variablesContext extends ParserRuleContext {
		public Simple_variable_auxContext simple_variable_aux() {
			return getRuleContext(Simple_variable_auxContext.class,0);
		}
		public TerminalNode DATA_TYPE() { return getToken(SLGrammarParser.DATA_TYPE, 0); }
		public TerminalNode VECTOR() { return getToken(SLGrammarParser.VECTOR, 0); }
		public TerminalNode TK_LEFT_BRACE() { return getToken(SLGrammarParser.TK_LEFT_BRACE, 0); }
		public List<TerminalNode> INT_NUMBER() { return getTokens(SLGrammarParser.INT_NUMBER); }
		public TerminalNode INT_NUMBER(int i) {
			return getToken(SLGrammarParser.INT_NUMBER, i);
		}
		public TerminalNode TK_RIGHT_BRACE() { return getToken(SLGrammarParser.TK_RIGHT_BRACE, 0); }
		public TerminalNode MATRIX() { return getToken(SLGrammarParser.MATRIX, 0); }
		public List<TerminalNode> TK_COMMA() { return getTokens(SLGrammarParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(SLGrammarParser.TK_COMMA, i);
		}
		public TerminalNode RECORD() { return getToken(SLGrammarParser.RECORD, 0); }
		public TerminalNode TK_LEFT_BRACKET() { return getToken(SLGrammarParser.TK_LEFT_BRACKET, 0); }
		public TerminalNode TK_RIGHT_BRACKET() { return getToken(SLGrammarParser.TK_RIGHT_BRACKET, 0); }
		public List<Simple_variablesContext> simple_variables() {
			return getRuleContexts(Simple_variablesContext.class);
		}
		public Simple_variablesContext simple_variables(int i) {
			return getRuleContext(Simple_variablesContext.class,i);
		}
		public Simple_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).enterSimple_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).exitSimple_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLGrammarParserVisitor ) return ((SLGrammarParserVisitor<? extends T>)visitor).visitSimple_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_variablesContext simple_variables() throws RecognitionException {
		Simple_variablesContext _localctx = new Simple_variablesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simple_variables);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				simple_variable_aux();
				setState(59);
				match(DATA_TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				simple_variable_aux();
				setState(62);
				match(VECTOR);
				setState(63);
				match(TK_LEFT_BRACE);
				setState(64);
				match(INT_NUMBER);
				setState(65);
				match(TK_RIGHT_BRACE);
				setState(66);
				match(DATA_TYPE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				simple_variable_aux();
				setState(69);
				match(MATRIX);
				setState(70);
				match(TK_LEFT_BRACE);
				setState(71);
				match(INT_NUMBER);
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(72);
					match(TK_COMMA);
					setState(73);
					match(INT_NUMBER);
					}
					}
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_COMMA );
				setState(78);
				match(TK_RIGHT_BRACE);
				setState(79);
				match(DATA_TYPE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				simple_variable_aux();
				setState(82);
				match(RECORD);
				setState(83);
				match(TK_LEFT_BRACKET);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(84);
					simple_variables();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(TK_RIGHT_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_variable_auxContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SLGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SLGrammarParser.ID, i);
		}
		public TerminalNode TK_DOUBLE_POINT() { return getToken(SLGrammarParser.TK_DOUBLE_POINT, 0); }
		public List<TerminalNode> TK_COMMA() { return getTokens(SLGrammarParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(SLGrammarParser.TK_COMMA, i);
		}
		public Simple_variable_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_variable_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).enterSimple_variable_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).exitSimple_variable_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLGrammarParserVisitor ) return ((SLGrammarParserVisitor<? extends T>)visitor).visitSimple_variable_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_variable_auxContext simple_variable_aux() throws RecognitionException {
		Simple_variable_auxContext _localctx = new Simple_variable_auxContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simple_variable_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(ID);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMMA) {
				{
				{
				setState(95);
				match(TK_COMMA);
				setState(96);
				match(ID);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(TK_DOUBLE_POINT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(SLGrammarParser.START, 0); }
		public TerminalNode END() { return getToken(SLGrammarParser.END, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLGrammarParserVisitor ) return ((SLGrammarParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(START);
			setState(105);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubroutinesContext extends ParserRuleContext {
		public TerminalNode SUBROUTINE() { return getToken(SLGrammarParser.SUBROUTINE, 0); }
		public TerminalNode ID() { return getToken(SLGrammarParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(SLGrammarParser.RETURNS, 0); }
		public TerminalNode DATA_TYPE() { return getToken(SLGrammarParser.DATA_TYPE, 0); }
		public SubroutinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).enterSubroutines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).exitSubroutines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLGrammarParserVisitor ) return ((SLGrammarParserVisitor<? extends T>)visitor).visitSubroutines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutinesContext subroutines() throws RecognitionException {
		SubroutinesContext _localctx = new SubroutinesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subroutines);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBROUTINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(SUBROUTINE);
				setState(108);
				match(ID);
				setState(109);
				parameters();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURNS) {
					{
					setState(110);
					match(RETURNS);
					setState(111);
					match(DATA_TYPE);
					}
				}

				setState(114);
				declarations();
				setState(115);
				body();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode TK_LEFT_PAR() { return getToken(SLGrammarParser.TK_LEFT_PAR, 0); }
		public TerminalNode TK_RIGHT_PAR() { return getToken(SLGrammarParser.TK_RIGHT_PAR, 0); }
		public Param_declarationContext param_declaration() {
			return getRuleContext(Param_declarationContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLGrammarParserVisitor ) return ((SLGrammarParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(TK_LEFT_PAR);
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(121);
				param_declaration();
				}
				break;
			}
			setState(124);
			match(TK_RIGHT_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLGrammarParser.ID, 0); }
		public Param_declaration_auxContext param_declaration_aux() {
			return getRuleContext(Param_declaration_auxContext.class,0);
		}
		public TerminalNode REF() { return getToken(SLGrammarParser.REF, 0); }
		public Param_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).enterParam_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).exitParam_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLGrammarParserVisitor ) return ((SLGrammarParserVisitor<? extends T>)visitor).visitParam_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_declarationContext param_declaration() throws RecognitionException {
		Param_declarationContext _localctx = new Param_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_param_declaration);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REF) {
					{
					setState(126);
					match(REF);
					}
				}

				setState(129);
				match(ID);
				setState(130);
				param_declaration_aux();
				}
				break;
			case TK_RIGHT_PAR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_declaration_auxContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SLGrammarParser.ID, 0); }
		public Param_declaration_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_declaration_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).enterParam_declaration_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLGrammarParserListener ) ((SLGrammarParserListener)listener).exitParam_declaration_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLGrammarParserVisitor ) return ((SLGrammarParserVisitor<? extends T>)visitor).visitParam_declaration_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_declaration_auxContext param_declaration_aux() throws RecognitionException {
		Param_declaration_auxContext _localctx = new Param_declaration_auxContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_param_declaration_aux);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(ID);
				}
				break;
			case TK_RIGHT_PAR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u008d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\5\2\35\n\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\6\4\61\n\4\r\4\16\4\62"+
		"\3\5\3\5\3\6\3\6\6\69\n\6\r\6\16\6:\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7M\n\7\r\7\16\7N\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\7\3\7\5\7_\n\7\3\b\3\b\3\b\7\bd\n\b"+
		"\f\b\16\bg\13\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\ns\n\n\3\n\3"+
		"\n\3\n\3\n\5\ny\n\n\3\13\3\13\5\13}\n\13\3\13\3\13\3\f\5\f\u0082\n\f\3"+
		"\f\3\f\3\f\5\f\u0087\n\f\3\r\3\r\5\r\u008b\n\r\3\r\2\2\16\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\2\3\3\2\7\f\2\u0092\2\34\3\2\2\2\4*\3\2\2\2\6,\3\2"+
		"\2\2\b\64\3\2\2\2\n\66\3\2\2\2\f^\3\2\2\2\16`\3\2\2\2\20j\3\2\2\2\22x"+
		"\3\2\2\2\24z\3\2\2\2\26\u0086\3\2\2\2\30\u008a\3\2\2\2\32\33\7\3\2\2\33"+
		"\35\7\4\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35!\3\2\2\2\36 \5\4\3\2\37\36"+
		"\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\5\20"+
		"\t\2%&\5\22\n\2&\3\3\2\2\2\'+\5\6\4\2(+\5\b\5\2)+\5\n\6\2*\'\3\2\2\2*"+
		"(\3\2\2\2*)\3\2\2\2+\5\3\2\2\2,\60\7\5\2\2-.\7\4\2\2./\7\6\2\2/\61\t\2"+
		"\2\2\60-\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\7\3\2\2"+
		"\2\64\65\7\r\2\2\65\t\3\2\2\2\668\7\16\2\2\679\5\f\7\28\67\3\2\2\29:\3"+
		"\2\2\2:8\3\2\2\2:;\3\2\2\2;\13\3\2\2\2<=\5\16\b\2=>\7\r\2\2>_\3\2\2\2"+
		"?@\5\16\b\2@A\7\17\2\2AB\7\20\2\2BC\7\b\2\2CD\7\21\2\2DE\7\r\2\2E_\3\2"+
		"\2\2FG\5\16\b\2GH\7\22\2\2HI\7\20\2\2IL\7\b\2\2JK\7\23\2\2KM\7\b\2\2L"+
		"J\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\21\2\2QR\7\r\2\2"+
		"R_\3\2\2\2ST\5\16\b\2TU\7\24\2\2UY\7\25\2\2VX\5\f\7\2WV\3\2\2\2X[\3\2"+
		"\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\26\2\2]_\3\2\2\2^<"+
		"\3\2\2\2^?\3\2\2\2^F\3\2\2\2^S\3\2\2\2_\r\3\2\2\2`e\7\4\2\2ab\7\23\2\2"+
		"bd\7\4\2\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2"+
		"hi\7\27\2\2i\17\3\2\2\2jk\7\30\2\2kl\7\31\2\2l\21\3\2\2\2mn\7\32\2\2n"+
		"o\7\4\2\2or\5\24\13\2pq\7\33\2\2qs\7\r\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2"+
		"\2tu\5\4\3\2uv\5\20\t\2vy\3\2\2\2wy\3\2\2\2xm\3\2\2\2xw\3\2\2\2y\23\3"+
		"\2\2\2z|\7\34\2\2{}\5\26\f\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\35\2"+
		"\2\177\25\3\2\2\2\u0080\u0082\7\36\2\2\u0081\u0080\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\4\2\2\u0084\u0087\5\30\r\2"+
		"\u0085\u0087\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0085\3\2\2\2\u0087\27"+
		"\3\2\2\2\u0088\u008b\7\4\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\31\3\2\2\2\21\34!*\62:NY^erx|\u0081\u0086\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}