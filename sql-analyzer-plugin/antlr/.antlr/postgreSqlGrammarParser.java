// Generated from /home/feriano/Documentos/Felipe/F/UNAL/Lenguajes/Repos/SQL-Analyzer/sql-analyzer-plugin/antlr/postgreSqlGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class postgreSqlGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, VARCHAR=2, INT=3, NUMERIC=4, TEXT=5, DATE=6, TIMESTAMP=7, BOOL=8, 
		SERIAL=9, BIGSERIAL=10, UUID=11, JSON=12, JSONB=13, BYTEA=14, FLOAT=15, 
		REAL=16, DOUBLE=17, DECIMAL=18, MONEY=19, SMALLINT=20, BIGINT=21, CHAR=22, 
		BIT=23, INTERVAL=24, SELECT=25, WITH=26, FROM=27, WHERE=28, GROUP=29, 
		BY=30, HAVING=31, ORDER=32, ASC=33, DESC=34, AND=35, OR=36, NOT=37, AS=38, 
		ON=39, IS=40, NULL=41, LIKE=42, BETWEEN=43, NATURAL=44, CASE=45, WHEN=46, 
		THEN=47, ELSE=48, END=49, CREATE=50, FUNCTION=51, RETURNS=52, INNER=53, 
		LEFT=54, RIGHT=55, FULL=56, JOIN=57, COUNT=58, SUM=59, AVG=60, MIN=61, 
		MAX=62, ARRAY_AGG=63, STRING_AGG=64, BOOL_AND=65, BOOL_OR=66, VAR_POP=67, 
		VAR_SAMP=68, STDDEV_POP=69, STDDEV_SAMP=70, OFFSET=71, FETCH=72, FIRST=73, 
		ROWS=74, ONLY=75, STRING=76, NUMBER=77, STAR=78, COMMA=79, SEMI=80, DOT=81, 
		LPAREN=82, RPAREN=83, EQ=84, NEQ=85, LT=86, LTE=87, GT=88, GTE=89, LINE_COMMENT=90, 
		BLOCK_COMMENT=91, WS=92;
	public static final int
		RULE_sql_stmt = 0, RULE_select_stmt = 1, RULE_function_stmt = 2, RULE_data_type = 3, 
		RULE_function_params = 4, RULE_func_body = 5, RULE_limit_offset_clause = 6, 
		RULE_with_clause = 7, RULE_cte = 8, RULE_result_column = 9, RULE_join_clause = 10, 
		RULE_standard_join = 11, RULE_natural_join = 12, RULE_join_type = 13, 
		RULE_natural_join_type = 14, RULE_table_reference = 15, RULE_table_name = 16, 
		RULE_alias = 17, RULE_group_by_clause = 18, RULE_group_by_item = 19, RULE_order_by_clause = 20, 
		RULE_order_by_item = 21, RULE_agg_func = 22, RULE_expr = 23, RULE_case_expr = 24, 
		RULE_when_clause = 25, RULE_function_call = 26, RULE_function_arg = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"sql_stmt", "select_stmt", "function_stmt", "data_type", "function_params", 
			"func_body", "limit_offset_clause", "with_clause", "cte", "result_column", 
			"join_clause", "standard_join", "natural_join", "join_type", "natural_join_type", 
			"table_reference", "table_name", "alias", "group_by_clause", "group_by_item", 
			"order_by_clause", "order_by_item", "agg_func", "expr", "case_expr", 
			"when_clause", "function_call", "function_arg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'VARCHAR'", "'INT'", "'NUMERIC'", "'TEXT'", "'DATE'", "'TIMESTAMP'", 
			"'BOOL'", "'SERIAL'", "'BIGSERIAL'", "'UUID'", "'JSON'", "'JSONB'", "'BYTEA'", 
			"'FLOAT'", "'REAL'", "'DOUBLE'", "'DECIMAL'", "'MONEY'", "'SMALLINT'", 
			"'BIGINT'", "'CHAR'", "'BIT'", "'INTERVAL'", "'SELECT'", "'WITH'", "'FROM'", 
			"'WHERE'", "'GROUP'", "'BY'", "'HAVING'", "'ORDER'", "'ASC'", "'DESC'", 
			"'AND'", "'OR'", "'NOT'", "'AS'", "'ON'", "'IS'", "'NULL'", "'LIKE'", 
			"'BETWEEN'", "'NATURAL'", "'CASE'", "'WHEN'", "'THEN'", "'ELSE'", "'END'", 
			"'CREATE'", "'FUNCTION'", "'RETURNS'", "'INNER'", "'LEFT'", "'RIGHT'", 
			"'FULL'", "'JOIN'", "'COUNT'", "'SUM'", "'AVG'", "'MIN'", "'MAX'", "'ARRAY_AGG'", 
			"'STRING_AGG'", "'BOOL_AND'", "'BOOL_OR'", "'VAR_POP'", "'VAR_SAMP'", 
			"'STDDEV_POP'", "'STDDEV_SAMP'", "'OFFSET'", "'FETCH'", "'FIRST'", "'ROWS'", 
			"'ONLY'", null, null, "'*'", "','", "';'", "'.'", "'('", "')'", "'='", 
			"'!='", "'<'", "'<='", "'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "VARCHAR", "INT", "NUMERIC", "TEXT", "DATE", "TIMESTAMP", 
			"BOOL", "SERIAL", "BIGSERIAL", "UUID", "JSON", "JSONB", "BYTEA", "FLOAT", 
			"REAL", "DOUBLE", "DECIMAL", "MONEY", "SMALLINT", "BIGINT", "CHAR", "BIT", 
			"INTERVAL", "SELECT", "WITH", "FROM", "WHERE", "GROUP", "BY", "HAVING", 
			"ORDER", "ASC", "DESC", "AND", "OR", "NOT", "AS", "ON", "IS", "NULL", 
			"LIKE", "BETWEEN", "NATURAL", "CASE", "WHEN", "THEN", "ELSE", "END", 
			"CREATE", "FUNCTION", "RETURNS", "INNER", "LEFT", "RIGHT", "FULL", "JOIN", 
			"COUNT", "SUM", "AVG", "MIN", "MAX", "ARRAY_AGG", "STRING_AGG", "BOOL_AND", 
			"BOOL_OR", "VAR_POP", "VAR_SAMP", "STDDEV_POP", "STDDEV_SAMP", "OFFSET", 
			"FETCH", "FIRST", "ROWS", "ONLY", "STRING", "NUMBER", "STAR", "COMMA", 
			"SEMI", "DOT", "LPAREN", "RPAREN", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", 
			"LINE_COMMENT", "BLOCK_COMMENT", "WS"
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
	public String getGrammarFileName() { return "postgreSqlGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public postgreSqlGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_stmtContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(postgreSqlGrammarParser.SEMI, 0); }
		public Function_stmtContext function_stmt() {
			return getRuleContext(Function_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sql_stmt);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				select_stmt();
				setState(57);
				match(SEMI);
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				function_stmt();
				setState(60);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Select_stmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(postgreSqlGrammarParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(postgreSqlGrammarParser.FROM, 0); }
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public TerminalNode STAR() { return getToken(postgreSqlGrammarParser.STAR, 0); }
		public TerminalNode WITH() { return getToken(postgreSqlGrammarParser.WITH, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public List<Join_clauseContext> join_clause() {
			return getRuleContexts(Join_clauseContext.class);
		}
		public Join_clauseContext join_clause(int i) {
			return getRuleContext(Join_clauseContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(postgreSqlGrammarParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(postgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(postgreSqlGrammarParser.COMMA, i);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(64);
				match(WITH);
				setState(65);
				with_clause();
				}
			}

			setState(68);
			match(SELECT);
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(69);
				match(STAR);
				}
				break;
			case 2:
				{
				{
				setState(70);
				result_column();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(71);
					match(COMMA);
					setState(72);
					result_column();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(80);
			match(FROM);
			setState(81);
			table_reference();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 279240769083015168L) != 0)) {
				{
				{
				setState(82);
				join_clause();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(88);
				match(WHERE);
				setState(89);
				expr(0);
				}
			}

			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(92);
				group_by_clause();
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(95);
				order_by_clause();
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(postgreSqlGrammarParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(postgreSqlGrammarParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(postgreSqlGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(postgreSqlGrammarParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(postgreSqlGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(postgreSqlGrammarParser.RPAREN, 0); }
		public TerminalNode RETURNS() { return getToken(postgreSqlGrammarParser.RETURNS, 0); }
		public TerminalNode AS() { return getToken(postgreSqlGrammarParser.AS, 0); }
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Function_paramsContext function_params() {
			return getRuleContext(Function_paramsContext.class,0);
		}
		public Function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_stmt; }
	}

	public final Function_stmtContext function_stmt() throws RecognitionException {
		Function_stmtContext _localctx = new Function_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(CREATE);
			setState(99);
			match(FUNCTION);
			setState(100);
			match(ID);
			setState(101);
			match(LPAREN);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(102);
				function_params();
				}
			}

			setState(105);
			match(RPAREN);
			setState(106);
			match(RETURNS);
			setState(107);
			match(ID);
			setState(108);
			match(AS);
			setState(109);
			func_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode VARCHAR() { return getToken(postgreSqlGrammarParser.VARCHAR, 0); }
		public TerminalNode LPAREN() { return getToken(postgreSqlGrammarParser.LPAREN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(postgreSqlGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(postgreSqlGrammarParser.NUMBER, i);
		}
		public TerminalNode RPAREN() { return getToken(postgreSqlGrammarParser.RPAREN, 0); }
		public TerminalNode INT() { return getToken(postgreSqlGrammarParser.INT, 0); }
		public TerminalNode NUMERIC() { return getToken(postgreSqlGrammarParser.NUMERIC, 0); }
		public TerminalNode COMMA() { return getToken(postgreSqlGrammarParser.COMMA, 0); }
		public TerminalNode TEXT() { return getToken(postgreSqlGrammarParser.TEXT, 0); }
		public TerminalNode DATE() { return getToken(postgreSqlGrammarParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(postgreSqlGrammarParser.TIMESTAMP, 0); }
		public TerminalNode BOOL() { return getToken(postgreSqlGrammarParser.BOOL, 0); }
		public TerminalNode SERIAL() { return getToken(postgreSqlGrammarParser.SERIAL, 0); }
		public TerminalNode BIGSERIAL() { return getToken(postgreSqlGrammarParser.BIGSERIAL, 0); }
		public TerminalNode UUID() { return getToken(postgreSqlGrammarParser.UUID, 0); }
		public TerminalNode JSON() { return getToken(postgreSqlGrammarParser.JSON, 0); }
		public TerminalNode JSONB() { return getToken(postgreSqlGrammarParser.JSONB, 0); }
		public TerminalNode BYTEA() { return getToken(postgreSqlGrammarParser.BYTEA, 0); }
		public TerminalNode FLOAT() { return getToken(postgreSqlGrammarParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(postgreSqlGrammarParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(postgreSqlGrammarParser.DOUBLE, 0); }
		public TerminalNode DECIMAL() { return getToken(postgreSqlGrammarParser.DECIMAL, 0); }
		public TerminalNode MONEY() { return getToken(postgreSqlGrammarParser.MONEY, 0); }
		public TerminalNode SMALLINT() { return getToken(postgreSqlGrammarParser.SMALLINT, 0); }
		public TerminalNode BIGINT() { return getToken(postgreSqlGrammarParser.BIGINT, 0); }
		public TerminalNode CHAR() { return getToken(postgreSqlGrammarParser.CHAR, 0); }
		public TerminalNode BIT() { return getToken(postgreSqlGrammarParser.BIT, 0); }
		public TerminalNode INTERVAL() { return getToken(postgreSqlGrammarParser.INTERVAL, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_data_type);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(VARCHAR);
				setState(112);
				match(LPAREN);
				setState(113);
				match(NUMBER);
				setState(114);
				match(RPAREN);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(INT);
				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(NUMERIC);
				setState(117);
				match(LPAREN);
				setState(118);
				match(NUMBER);
				setState(119);
				match(COMMA);
				setState(120);
				match(NUMBER);
				setState(121);
				match(RPAREN);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(TEXT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				match(TIMESTAMP);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				match(BOOL);
				}
				break;
			case SERIAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				match(SERIAL);
				}
				break;
			case BIGSERIAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				match(BIGSERIAL);
				}
				break;
			case UUID:
				enterOuterAlt(_localctx, 10);
				{
				setState(128);
				match(UUID);
				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 11);
				{
				setState(129);
				match(JSON);
				}
				break;
			case JSONB:
				enterOuterAlt(_localctx, 12);
				{
				setState(130);
				match(JSONB);
				}
				break;
			case BYTEA:
				enterOuterAlt(_localctx, 13);
				{
				setState(131);
				match(BYTEA);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 14);
				{
				setState(132);
				match(FLOAT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 15);
				{
				setState(133);
				match(REAL);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 16);
				{
				setState(134);
				match(DOUBLE);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 17);
				{
				setState(135);
				match(DECIMAL);
				setState(136);
				match(LPAREN);
				setState(137);
				match(NUMBER);
				setState(138);
				match(COMMA);
				setState(139);
				match(NUMBER);
				setState(140);
				match(RPAREN);
				}
				break;
			case MONEY:
				enterOuterAlt(_localctx, 18);
				{
				setState(141);
				match(MONEY);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 19);
				{
				setState(142);
				match(SMALLINT);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 20);
				{
				setState(143);
				match(BIGINT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 21);
				{
				setState(144);
				match(CHAR);
				setState(145);
				match(LPAREN);
				setState(146);
				match(NUMBER);
				setState(147);
				match(RPAREN);
				}
				break;
			case BIT:
				enterOuterAlt(_localctx, 22);
				{
				setState(148);
				match(BIT);
				setState(149);
				match(LPAREN);
				setState(150);
				match(NUMBER);
				setState(151);
				match(RPAREN);
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 23);
				{
				setState(152);
				match(INTERVAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_paramsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(postgreSqlGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(postgreSqlGrammarParser.ID, i);
		}
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(postgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(postgreSqlGrammarParser.COMMA, i);
		}
		public Function_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_params; }
	}

	public final Function_paramsContext function_params() throws RecognitionException {
		Function_paramsContext _localctx = new Function_paramsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			setState(156);
			data_type();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(157);
				match(COMMA);
				setState(158);
				match(ID);
				setState(159);
				data_type();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_bodyContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Limit_offset_clauseContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(postgreSqlGrammarParser.OFFSET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ROWS() { return getTokens(postgreSqlGrammarParser.ROWS); }
		public TerminalNode ROWS(int i) {
			return getToken(postgreSqlGrammarParser.ROWS, i);
		}
		public TerminalNode FETCH() { return getToken(postgreSqlGrammarParser.FETCH, 0); }
		public TerminalNode FIRST() { return getToken(postgreSqlGrammarParser.FIRST, 0); }
		public TerminalNode ONLY() { return getToken(postgreSqlGrammarParser.ONLY, 0); }
		public Limit_offset_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_offset_clause; }
	}

	public final Limit_offset_clauseContext limit_offset_clause() throws RecognitionException {
		Limit_offset_clauseContext _localctx = new Limit_offset_clauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_limit_offset_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(167);
				match(OFFSET);
				setState(168);
				expr(0);
				setState(169);
				match(ROWS);
				}
			}

			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FETCH) {
				{
				setState(173);
				match(FETCH);
				setState(174);
				match(FIRST);
				setState(175);
				expr(0);
				setState(176);
				match(ROWS);
				setState(177);
				match(ONLY);
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(postgreSqlGrammarParser.WITH, 0); }
		public List<CteContext> cte() {
			return getRuleContexts(CteContext.class);
		}
		public CteContext cte(int i) {
			return getRuleContext(CteContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(postgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(postgreSqlGrammarParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(WITH);
			setState(182);
			cte();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(183);
				match(COMMA);
				setState(184);
				cte();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(postgreSqlGrammarParser.ID, 0); }
		public TerminalNode AS() { return getToken(postgreSqlGrammarParser.AS, 0); }
		public TerminalNode LPAREN() { return getToken(postgreSqlGrammarParser.LPAREN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(postgreSqlGrammarParser.RPAREN, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(ID);
			setState(191);
			match(AS);
			setState(192);
			match(LPAREN);
			setState(193);
			select_stmt();
			setState(194);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(postgreSqlGrammarParser.STAR, 0); }
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(postgreSqlGrammarParser.DOT, 0); }
		public TerminalNode ID() { return getToken(postgreSqlGrammarParser.ID, 0); }
		public Agg_funcContext agg_func() {
			return getRuleContext(Agg_funcContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(postgreSqlGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(postgreSqlGrammarParser.RPAREN, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_result_column);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				table_reference();
				setState(198);
				match(DOT);
				setState(199);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				table_reference();
				setState(202);
				match(DOT);
				setState(203);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				agg_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				match(ID);
				setState(208);
				match(LPAREN);
				setState(209);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Join_clauseContext extends ParserRuleContext {
		public Standard_joinContext standard_join() {
			return getRuleContext(Standard_joinContext.class,0);
		}
		public Natural_joinContext natural_join() {
			return getRuleContext(Natural_joinContext.class,0);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_join_clause);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				standard_join();
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				natural_join();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Standard_joinContext extends ParserRuleContext {
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public TerminalNode ON() { return getToken(postgreSqlGrammarParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Standard_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standard_join; }
	}

	public final Standard_joinContext standard_join() throws RecognitionException {
		Standard_joinContext _localctx = new Standard_joinContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_standard_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			join_type();
			setState(217);
			table_reference();
			setState(218);
			match(ON);
			setState(219);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Natural_joinContext extends ParserRuleContext {
		public Natural_join_typeContext natural_join_type() {
			return getRuleContext(Natural_join_typeContext.class,0);
		}
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public Natural_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natural_join; }
	}

	public final Natural_joinContext natural_join() throws RecognitionException {
		Natural_joinContext _localctx = new Natural_joinContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_natural_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			natural_join_type();
			setState(222);
			table_reference();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Join_typeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(postgreSqlGrammarParser.INNER, 0); }
		public TerminalNode JOIN() { return getToken(postgreSqlGrammarParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(postgreSqlGrammarParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(postgreSqlGrammarParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(postgreSqlGrammarParser.FULL, 0); }
		public Join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_type; }
	}

	public final Join_typeContext join_type() throws RecognitionException {
		Join_typeContext _localctx = new Join_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_join_type);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(INNER);
				setState(225);
				match(JOIN);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(LEFT);
				setState(227);
				match(JOIN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(RIGHT);
				setState(229);
				match(JOIN);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				match(FULL);
				setState(231);
				match(JOIN);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(JOIN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Natural_join_typeContext extends ParserRuleContext {
		public TerminalNode NATURAL() { return getToken(postgreSqlGrammarParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(postgreSqlGrammarParser.JOIN, 0); }
		public TerminalNode INNER() { return getToken(postgreSqlGrammarParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(postgreSqlGrammarParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(postgreSqlGrammarParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(postgreSqlGrammarParser.FULL, 0); }
		public Natural_join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natural_join_type; }
	}

	public final Natural_join_typeContext natural_join_type() throws RecognitionException {
		Natural_join_typeContext _localctx = new Natural_join_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_natural_join_type);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(NATURAL);
				setState(236);
				match(JOIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(NATURAL);
				setState(238);
				match(INNER);
				setState(239);
				match(JOIN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(NATURAL);
				setState(241);
				match(LEFT);
				setState(242);
				match(JOIN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(NATURAL);
				setState(244);
				match(RIGHT);
				setState(245);
				match(JOIN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				match(NATURAL);
				setState(247);
				match(FULL);
				setState(248);
				match(JOIN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Table_referenceContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_table_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			table_name();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==AS) {
				{
				setState(252);
				alias();
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(postgreSqlGrammarParser.ID, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(postgreSqlGrammarParser.AS, 0); }
		public TerminalNode ID() { return getToken(postgreSqlGrammarParser.ID, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_alias);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(257);
				match(AS);
				setState(258);
				match(ID);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(postgreSqlGrammarParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(postgreSqlGrammarParser.BY, 0); }
		public List<Group_by_itemContext> group_by_item() {
			return getRuleContexts(Group_by_itemContext.class);
		}
		public Group_by_itemContext group_by_item(int i) {
			return getRuleContext(Group_by_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(postgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(postgreSqlGrammarParser.COMMA, i);
		}
		public TerminalNode HAVING() { return getToken(postgreSqlGrammarParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_group_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(GROUP);
			setState(263);
			match(BY);
			setState(264);
			group_by_item();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(265);
				match(COMMA);
				setState(266);
				group_by_item();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(272);
				match(HAVING);
				setState(273);
				expr(0);
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class Group_by_itemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(postgreSqlGrammarParser.ID, 0); }
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(postgreSqlGrammarParser.DOT, 0); }
		public Agg_funcContext agg_func() {
			return getRuleContext(Agg_funcContext.class,0);
		}
		public Group_by_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_item; }
	}

	public final Group_by_itemContext group_by_item() throws RecognitionException {
		Group_by_itemContext _localctx = new Group_by_itemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_group_by_item);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				table_reference();
				setState(278);
				match(DOT);
				setState(279);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				agg_func();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(postgreSqlGrammarParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(postgreSqlGrammarParser.BY, 0); }
		public List<Order_by_itemContext> order_by_item() {
			return getRuleContexts(Order_by_itemContext.class);
		}
		public Order_by_itemContext order_by_item(int i) {
			return getRuleContext(Order_by_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(postgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(postgreSqlGrammarParser.COMMA, i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_order_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(ORDER);
			setState(285);
			match(BY);
			setState(286);
			order_by_item();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(287);
				match(COMMA);
				setState(288);
				order_by_item();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_itemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(postgreSqlGrammarParser.ID, 0); }
		public TerminalNode ASC() { return getToken(postgreSqlGrammarParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(postgreSqlGrammarParser.DESC, 0); }
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(postgreSqlGrammarParser.DOT, 0); }
		public Order_by_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_item; }
	}

	public final Order_by_itemContext order_by_item() throws RecognitionException {
		Order_by_itemContext _localctx = new Order_by_itemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_order_by_item);
		int _la;
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(ID);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(295);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				table_reference();
				setState(299);
				match(DOT);
				setState(300);
				match(ID);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(301);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class Agg_funcContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(postgreSqlGrammarParser.COUNT, 0); }
		public TerminalNode LPAREN() { return getToken(postgreSqlGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(postgreSqlGrammarParser.RPAREN, 0); }
		public TerminalNode STAR() { return getToken(postgreSqlGrammarParser.STAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUM() { return getToken(postgreSqlGrammarParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(postgreSqlGrammarParser.AVG, 0); }
		public TerminalNode MIN() { return getToken(postgreSqlGrammarParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(postgreSqlGrammarParser.MAX, 0); }
		public TerminalNode ARRAY_AGG() { return getToken(postgreSqlGrammarParser.ARRAY_AGG, 0); }
		public TerminalNode STRING_AGG() { return getToken(postgreSqlGrammarParser.STRING_AGG, 0); }
		public TerminalNode COMMA() { return getToken(postgreSqlGrammarParser.COMMA, 0); }
		public TerminalNode STRING() { return getToken(postgreSqlGrammarParser.STRING, 0); }
		public TerminalNode BOOL_AND() { return getToken(postgreSqlGrammarParser.BOOL_AND, 0); }
		public TerminalNode BOOL_OR() { return getToken(postgreSqlGrammarParser.BOOL_OR, 0); }
		public TerminalNode VAR_POP() { return getToken(postgreSqlGrammarParser.VAR_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(postgreSqlGrammarParser.VAR_SAMP, 0); }
		public TerminalNode STDDEV_POP() { return getToken(postgreSqlGrammarParser.STDDEV_POP, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(postgreSqlGrammarParser.STDDEV_SAMP, 0); }
		public TerminalNode ID() { return getToken(postgreSqlGrammarParser.ID, 0); }
		public Agg_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agg_func; }
	}

	public final Agg_funcContext agg_func() throws RecognitionException {
		Agg_funcContext _localctx = new Agg_funcContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_agg_func);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(COUNT);
				setState(307);
				match(LPAREN);
				setState(310);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(308);
					match(STAR);
					}
					break;
				case ID:
				case NOT:
				case CASE:
				case LPAREN:
					{
					setState(309);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(312);
				match(RPAREN);
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(SUM);
				setState(314);
				match(LPAREN);
				setState(315);
				expr(0);
				setState(316);
				match(RPAREN);
				}
				break;
			case AVG:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(AVG);
				setState(319);
				match(LPAREN);
				setState(320);
				expr(0);
				setState(321);
				match(RPAREN);
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				match(MIN);
				setState(324);
				match(LPAREN);
				setState(325);
				expr(0);
				setState(326);
				match(RPAREN);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 5);
				{
				setState(328);
				match(MAX);
				setState(329);
				match(LPAREN);
				setState(330);
				expr(0);
				setState(331);
				match(RPAREN);
				}
				break;
			case ARRAY_AGG:
				enterOuterAlt(_localctx, 6);
				{
				setState(333);
				match(ARRAY_AGG);
				setState(334);
				match(LPAREN);
				setState(335);
				expr(0);
				setState(336);
				match(RPAREN);
				}
				break;
			case STRING_AGG:
				enterOuterAlt(_localctx, 7);
				{
				setState(338);
				match(STRING_AGG);
				setState(339);
				match(LPAREN);
				setState(340);
				expr(0);
				setState(341);
				match(COMMA);
				setState(342);
				match(STRING);
				setState(343);
				match(RPAREN);
				}
				break;
			case BOOL_AND:
				enterOuterAlt(_localctx, 8);
				{
				setState(345);
				match(BOOL_AND);
				setState(346);
				match(LPAREN);
				setState(347);
				expr(0);
				setState(348);
				match(RPAREN);
				}
				break;
			case BOOL_OR:
				enterOuterAlt(_localctx, 9);
				{
				setState(350);
				match(BOOL_OR);
				setState(351);
				match(LPAREN);
				setState(352);
				expr(0);
				setState(353);
				match(RPAREN);
				}
				break;
			case VAR_POP:
				enterOuterAlt(_localctx, 10);
				{
				setState(355);
				match(VAR_POP);
				setState(356);
				match(LPAREN);
				setState(357);
				expr(0);
				setState(358);
				match(RPAREN);
				}
				break;
			case VAR_SAMP:
				enterOuterAlt(_localctx, 11);
				{
				setState(360);
				match(VAR_SAMP);
				setState(361);
				match(LPAREN);
				setState(362);
				expr(0);
				setState(363);
				match(RPAREN);
				}
				break;
			case STDDEV_POP:
				enterOuterAlt(_localctx, 12);
				{
				setState(365);
				match(STDDEV_POP);
				setState(366);
				match(LPAREN);
				setState(367);
				expr(0);
				setState(368);
				match(RPAREN);
				}
				break;
			case STDDEV_SAMP:
				enterOuterAlt(_localctx, 13);
				{
				setState(370);
				match(STDDEV_SAMP);
				setState(371);
				match(LPAREN);
				setState(372);
				expr(0);
				setState(373);
				match(RPAREN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 14);
				{
				setState(375);
				match(ID);
				setState(376);
				match(LPAREN);
				setState(377);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(postgreSqlGrammarParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(postgreSqlGrammarParser.ID, 0); }
		public TerminalNode EQ() { return getToken(postgreSqlGrammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(postgreSqlGrammarParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(postgreSqlGrammarParser.LT, 0); }
		public TerminalNode LTE() { return getToken(postgreSqlGrammarParser.LTE, 0); }
		public TerminalNode GT() { return getToken(postgreSqlGrammarParser.GT, 0); }
		public TerminalNode GTE() { return getToken(postgreSqlGrammarParser.GTE, 0); }
		public TerminalNode STRING() { return getToken(postgreSqlGrammarParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(postgreSqlGrammarParser.NUMBER, 0); }
		public TerminalNode IS() { return getToken(postgreSqlGrammarParser.IS, 0); }
		public TerminalNode NULL() { return getToken(postgreSqlGrammarParser.NULL, 0); }
		public TerminalNode LIKE() { return getToken(postgreSqlGrammarParser.LIKE, 0); }
		public TerminalNode BETWEEN() { return getToken(postgreSqlGrammarParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(postgreSqlGrammarParser.AND, 0); }
		public TerminalNode LPAREN() { return getToken(postgreSqlGrammarParser.LPAREN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(postgreSqlGrammarParser.RPAREN, 0); }
		public Case_exprContext case_expr() {
			return getRuleContext(Case_exprContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode OR() { return getToken(postgreSqlGrammarParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(381);
				match(NOT);
				setState(382);
				expr(8);
				}
				break;
			case 2:
				{
				setState(383);
				match(ID);
				setState(384);
				_la = _input.LA(1);
				if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 63L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(385);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(386);
				match(ID);
				setState(387);
				match(IS);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(388);
					match(NOT);
					}
				}

				setState(391);
				match(NULL);
				}
				break;
			case 4:
				{
				setState(392);
				match(ID);
				setState(393);
				match(LIKE);
				setState(394);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(395);
				match(ID);
				setState(396);
				match(BETWEEN);
				setState(397);
				expr(0);
				setState(398);
				match(AND);
				setState(399);
				expr(4);
				}
				break;
			case 6:
				{
				setState(401);
				match(LPAREN);
				setState(402);
				select_stmt();
				setState(403);
				match(RPAREN);
				}
				break;
			case 7:
				{
				setState(405);
				case_expr();
				}
				break;
			case 8:
				{
				setState(406);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(415);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(409);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(410);
						match(AND);
						setState(411);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(412);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(413);
						match(OR);
						setState(414);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_exprContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(postgreSqlGrammarParser.CASE, 0); }
		public TerminalNode END() { return getToken(postgreSqlGrammarParser.END, 0); }
		public List<When_clauseContext> when_clause() {
			return getRuleContexts(When_clauseContext.class);
		}
		public When_clauseContext when_clause(int i) {
			return getRuleContext(When_clauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(postgreSqlGrammarParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NULL() { return getToken(postgreSqlGrammarParser.NULL, 0); }
		public Case_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expr; }
	}

	public final Case_exprContext case_expr() throws RecognitionException {
		Case_exprContext _localctx = new Case_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_case_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(CASE);
			setState(422); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(421);
				when_clause();
				}
				}
				setState(424); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(426);
				match(ELSE);
				setState(429);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case NOT:
				case CASE:
				case LPAREN:
					{
					setState(427);
					expr(0);
					}
					break;
				case NULL:
					{
					setState(428);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(433);
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

	@SuppressWarnings("CheckReturnValue")
	public static class When_clauseContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(postgreSqlGrammarParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(postgreSqlGrammarParser.THEN, 0); }
		public When_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_clause; }
	}

	public final When_clauseContext when_clause() throws RecognitionException {
		When_clauseContext _localctx = new When_clauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_when_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(WHEN);
			setState(436);
			expr(0);
			setState(437);
			match(THEN);
			setState(438);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(postgreSqlGrammarParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(postgreSqlGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(postgreSqlGrammarParser.RPAREN, 0); }
		public List<Function_argContext> function_arg() {
			return getRuleContexts(Function_argContext.class);
		}
		public Function_argContext function_arg(int i) {
			return getRuleContext(Function_argContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(postgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(postgreSqlGrammarParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(ID);
			setState(441);
			match(LPAREN);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35321811042306L) != 0) || _la==LPAREN) {
				{
				setState(442);
				function_arg();
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(443);
					match(COMMA);
					setState(444);
					function_arg();
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(452);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Function_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_arg; }
	}

	public final Function_argContext function_arg() throws RecognitionException {
		Function_argContext _localctx = new Function_argContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_function_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			expr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\\\u01c9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000?\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001J\b"+
		"\u0001\n\u0001\f\u0001M\t\u0001\u0003\u0001O\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001T\b\u0001\n\u0001\f\u0001W\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001[\b\u0001\u0001\u0001\u0003\u0001^\b\u0001"+
		"\u0001\u0001\u0003\u0001a\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002h\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u009a\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u00a1\b\u0004\n\u0004\f\u0004\u00a4\t\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ac\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00b4\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00ba\b\u0007\n\u0007\f\u0007\u00bd\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00d3\b\t\u0001\n\u0001\n\u0003\n\u00d7\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ea"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00fa\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00fe\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0105\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u010c\b\u0012\n\u0012\f\u0012"+
		"\u010f\t\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0113\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u011b\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u0122\b\u0014\n\u0014\f\u0014\u0125\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0129\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u012f\b\u0015\u0003\u0015\u0131\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0137\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u017b\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0186"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0198"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u01a0\b\u0017\n\u0017\f\u0017\u01a3\t\u0017\u0001\u0018"+
		"\u0001\u0018\u0004\u0018\u01a7\b\u0018\u000b\u0018\f\u0018\u01a8\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01ae\b\u0018\u0003\u0018\u01b0"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u01be\b\u001a\n\u001a\f\u001a\u01c1\t\u001a\u0003\u001a"+
		"\u01c3\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0000\u0001.\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0003\u0001\u0000!\""+
		"\u0001\u0000TY\u0001\u0000LM\u0204\u0000>\u0001\u0000\u0000\u0000\u0002"+
		"B\u0001\u0000\u0000\u0000\u0004b\u0001\u0000\u0000\u0000\u0006\u0099\u0001"+
		"\u0000\u0000\u0000\b\u009b\u0001\u0000\u0000\u0000\n\u00a5\u0001\u0000"+
		"\u0000\u0000\f\u00ab\u0001\u0000\u0000\u0000\u000e\u00b5\u0001\u0000\u0000"+
		"\u0000\u0010\u00be\u0001\u0000\u0000\u0000\u0012\u00d2\u0001\u0000\u0000"+
		"\u0000\u0014\u00d6\u0001\u0000\u0000\u0000\u0016\u00d8\u0001\u0000\u0000"+
		"\u0000\u0018\u00dd\u0001\u0000\u0000\u0000\u001a\u00e9\u0001\u0000\u0000"+
		"\u0000\u001c\u00f9\u0001\u0000\u0000\u0000\u001e\u00fb\u0001\u0000\u0000"+
		"\u0000 \u00ff\u0001\u0000\u0000\u0000\"\u0104\u0001\u0000\u0000\u0000"+
		"$\u0106\u0001\u0000\u0000\u0000&\u011a\u0001\u0000\u0000\u0000(\u011c"+
		"\u0001\u0000\u0000\u0000*\u0130\u0001\u0000\u0000\u0000,\u017a\u0001\u0000"+
		"\u0000\u0000.\u0197\u0001\u0000\u0000\u00000\u01a4\u0001\u0000\u0000\u0000"+
		"2\u01b3\u0001\u0000\u0000\u00004\u01b8\u0001\u0000\u0000\u00006\u01c6"+
		"\u0001\u0000\u0000\u000089\u0003\u0002\u0001\u00009:\u0005P\u0000\u0000"+
		":?\u0001\u0000\u0000\u0000;<\u0003\u0004\u0002\u0000<=\u0005P\u0000\u0000"+
		"=?\u0001\u0000\u0000\u0000>8\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000"+
		"\u0000?\u0001\u0001\u0000\u0000\u0000@A\u0005\u001a\u0000\u0000AC\u0003"+
		"\u000e\u0007\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DN\u0005\u0019\u0000\u0000EO\u0005N\u0000\u0000"+
		"FK\u0003\u0012\t\u0000GH\u0005O\u0000\u0000HJ\u0003\u0012\t\u0000IG\u0001"+
		"\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000NE\u0001\u0000\u0000\u0000NF\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u001b\u0000\u0000QU\u0003\u001e\u000f\u0000RT\u0003"+
		"\u0014\n\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VZ\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000XY\u0005\u001c\u0000\u0000Y[\u0003.\u0017\u0000"+
		"ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000"+
		"\u0000\\^\u0003$\u0012\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^`\u0001\u0000\u0000\u0000_a\u0003(\u0014\u0000`_\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000a\u0003\u0001\u0000\u0000\u0000"+
		"bc\u00052\u0000\u0000cd\u00053\u0000\u0000de\u0005\u0001\u0000\u0000e"+
		"g\u0005R\u0000\u0000fh\u0003\b\u0004\u0000gf\u0001\u0000\u0000\u0000g"+
		"h\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005S\u0000\u0000"+
		"jk\u00054\u0000\u0000kl\u0005\u0001\u0000\u0000lm\u0005&\u0000\u0000m"+
		"n\u0003\n\u0005\u0000n\u0005\u0001\u0000\u0000\u0000op\u0005\u0002\u0000"+
		"\u0000pq\u0005R\u0000\u0000qr\u0005M\u0000\u0000r\u009a\u0005S\u0000\u0000"+
		"s\u009a\u0005\u0003\u0000\u0000tu\u0005\u0004\u0000\u0000uv\u0005R\u0000"+
		"\u0000vw\u0005M\u0000\u0000wx\u0005O\u0000\u0000xy\u0005M\u0000\u0000"+
		"y\u009a\u0005S\u0000\u0000z\u009a\u0005\u0005\u0000\u0000{\u009a\u0005"+
		"\u0006\u0000\u0000|\u009a\u0005\u0007\u0000\u0000}\u009a\u0005\b\u0000"+
		"\u0000~\u009a\u0005\t\u0000\u0000\u007f\u009a\u0005\n\u0000\u0000\u0080"+
		"\u009a\u0005\u000b\u0000\u0000\u0081\u009a\u0005\f\u0000\u0000\u0082\u009a"+
		"\u0005\r\u0000\u0000\u0083\u009a\u0005\u000e\u0000\u0000\u0084\u009a\u0005"+
		"\u000f\u0000\u0000\u0085\u009a\u0005\u0010\u0000\u0000\u0086\u009a\u0005"+
		"\u0011\u0000\u0000\u0087\u0088\u0005\u0012\u0000\u0000\u0088\u0089\u0005"+
		"R\u0000\u0000\u0089\u008a\u0005M\u0000\u0000\u008a\u008b\u0005O\u0000"+
		"\u0000\u008b\u008c\u0005M\u0000\u0000\u008c\u009a\u0005S\u0000\u0000\u008d"+
		"\u009a\u0005\u0013\u0000\u0000\u008e\u009a\u0005\u0014\u0000\u0000\u008f"+
		"\u009a\u0005\u0015\u0000\u0000\u0090\u0091\u0005\u0016\u0000\u0000\u0091"+
		"\u0092\u0005R\u0000\u0000\u0092\u0093\u0005M\u0000\u0000\u0093\u009a\u0005"+
		"S\u0000\u0000\u0094\u0095\u0005\u0017\u0000\u0000\u0095\u0096\u0005R\u0000"+
		"\u0000\u0096\u0097\u0005M\u0000\u0000\u0097\u009a\u0005S\u0000\u0000\u0098"+
		"\u009a\u0005\u0018\u0000\u0000\u0099o\u0001\u0000\u0000\u0000\u0099s\u0001"+
		"\u0000\u0000\u0000\u0099t\u0001\u0000\u0000\u0000\u0099z\u0001\u0000\u0000"+
		"\u0000\u0099{\u0001\u0000\u0000\u0000\u0099|\u0001\u0000\u0000\u0000\u0099"+
		"}\u0001\u0000\u0000\u0000\u0099~\u0001\u0000\u0000\u0000\u0099\u007f\u0001"+
		"\u0000\u0000\u0000\u0099\u0080\u0001\u0000\u0000\u0000\u0099\u0081\u0001"+
		"\u0000\u0000\u0000\u0099\u0082\u0001\u0000\u0000\u0000\u0099\u0083\u0001"+
		"\u0000\u0000\u0000\u0099\u0084\u0001\u0000\u0000\u0000\u0099\u0085\u0001"+
		"\u0000\u0000\u0000\u0099\u0086\u0001\u0000\u0000\u0000\u0099\u0087\u0001"+
		"\u0000\u0000\u0000\u0099\u008d\u0001\u0000\u0000\u0000\u0099\u008e\u0001"+
		"\u0000\u0000\u0000\u0099\u008f\u0001\u0000\u0000\u0000\u0099\u0090\u0001"+
		"\u0000\u0000\u0000\u0099\u0094\u0001\u0000\u0000\u0000\u0099\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u0007\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"\u0001\u0000\u0000\u009c\u00a2\u0003\u0006\u0003\u0000\u009d\u009e\u0005"+
		"O\u0000\u0000\u009e\u009f\u0005\u0001\u0000\u0000\u009f\u00a1\u0003\u0006"+
		"\u0003\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\t\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0003.\u0017\u0000\u00a6\u000b\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0005G\u0000\u0000\u00a8\u00a9\u0003.\u0017\u0000\u00a9\u00aa"+
		"\u0005J\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00b3\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0005H\u0000\u0000\u00ae\u00af\u0005I\u0000"+
		"\u0000\u00af\u00b0\u0003.\u0017\u0000\u00b0\u00b1\u0005J\u0000\u0000\u00b1"+
		"\u00b2\u0005K\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\r\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005\u001a\u0000\u0000\u00b6\u00bb\u0003"+
		"\u0010\b\u0000\u00b7\u00b8\u0005O\u0000\u0000\u00b8\u00ba\u0003\u0010"+
		"\b\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u000f\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0005\u0001\u0000\u0000\u00bf\u00c0\u0005&\u0000\u0000"+
		"\u00c0\u00c1\u0005R\u0000\u0000\u00c1\u00c2\u0003\u0002\u0001\u0000\u00c2"+
		"\u00c3\u0005S\u0000\u0000\u00c3\u0011\u0001\u0000\u0000\u0000\u00c4\u00d3"+
		"\u0005N\u0000\u0000\u00c5\u00c6\u0003\u001e\u000f\u0000\u00c6\u00c7\u0005"+
		"Q\u0000\u0000\u00c7\u00c8\u0005N\u0000\u0000\u00c8\u00d3\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0003\u001e\u000f\u0000\u00ca\u00cb\u0005Q\u0000\u0000"+
		"\u00cb\u00cc\u0005\u0001\u0000\u0000\u00cc\u00d3\u0001\u0000\u0000\u0000"+
		"\u00cd\u00d3\u0005\u0001\u0000\u0000\u00ce\u00d3\u0003,\u0016\u0000\u00cf"+
		"\u00d0\u0005\u0001\u0000\u0000\u00d0\u00d1\u0005R\u0000\u0000\u00d1\u00d3"+
		"\u0005S\u0000\u0000\u00d2\u00c4\u0001\u0000\u0000\u0000\u00d2\u00c5\u0001"+
		"\u0000\u0000\u0000\u00d2\u00c9\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d3\u0013\u0001\u0000\u0000\u0000\u00d4\u00d7\u0003"+
		"\u0016\u000b\u0000\u00d5\u00d7\u0003\u0018\f\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u0015\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0003\u001a\r\u0000\u00d9\u00da\u0003\u001e\u000f"+
		"\u0000\u00da\u00db\u0005\'\u0000\u0000\u00db\u00dc\u0003.\u0017\u0000"+
		"\u00dc\u0017\u0001\u0000\u0000\u0000\u00dd\u00de\u0003\u001c\u000e\u0000"+
		"\u00de\u00df\u0003\u001e\u000f\u0000\u00df\u0019\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u00055\u0000\u0000\u00e1\u00ea\u00059\u0000\u0000\u00e2\u00e3"+
		"\u00056\u0000\u0000\u00e3\u00ea\u00059\u0000\u0000\u00e4\u00e5\u00057"+
		"\u0000\u0000\u00e5\u00ea\u00059\u0000\u0000\u00e6\u00e7\u00058\u0000\u0000"+
		"\u00e7\u00ea\u00059\u0000\u0000\u00e8\u00ea\u00059\u0000\u0000\u00e9\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e2\u0001\u0000\u0000\u0000\u00e9\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000\u00e9\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ea\u001b\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0005,\u0000\u0000\u00ec\u00fa\u00059\u0000\u0000\u00ed\u00ee\u0005,"+
		"\u0000\u0000\u00ee\u00ef\u00055\u0000\u0000\u00ef\u00fa\u00059\u0000\u0000"+
		"\u00f0\u00f1\u0005,\u0000\u0000\u00f1\u00f2\u00056\u0000\u0000\u00f2\u00fa"+
		"\u00059\u0000\u0000\u00f3\u00f4\u0005,\u0000\u0000\u00f4\u00f5\u00057"+
		"\u0000\u0000\u00f5\u00fa\u00059\u0000\u0000\u00f6\u00f7\u0005,\u0000\u0000"+
		"\u00f7\u00f8\u00058\u0000\u0000\u00f8\u00fa\u00059\u0000\u0000\u00f9\u00eb"+
		"\u0001\u0000\u0000\u0000\u00f9\u00ed\u0001\u0000\u0000\u0000\u00f9\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f3\u0001\u0000\u0000\u0000\u00f9\u00f6"+
		"\u0001\u0000\u0000\u0000\u00fa\u001d\u0001\u0000\u0000\u0000\u00fb\u00fd"+
		"\u0003 \u0010\u0000\u00fc\u00fe\u0003\"\u0011\u0000\u00fd\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u001f\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0005\u0001\u0000\u0000\u0100!\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0005&\u0000\u0000\u0102\u0105\u0005\u0001\u0000"+
		"\u0000\u0103\u0105\u0005\u0001\u0000\u0000\u0104\u0101\u0001\u0000\u0000"+
		"\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105#\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0005\u001d\u0000\u0000\u0107\u0108\u0005\u001e\u0000\u0000"+
		"\u0108\u010d\u0003&\u0013\u0000\u0109\u010a\u0005O\u0000\u0000\u010a\u010c"+
		"\u0003&\u0013\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010f\u0001"+
		"\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001"+
		"\u0000\u0000\u0000\u010e\u0112\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0005\u001f\u0000\u0000\u0111\u0113\u0003"+
		".\u0017\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000"+
		"\u0000\u0000\u0113%\u0001\u0000\u0000\u0000\u0114\u011b\u0005\u0001\u0000"+
		"\u0000\u0115\u0116\u0003\u001e\u000f\u0000\u0116\u0117\u0005Q\u0000\u0000"+
		"\u0117\u0118\u0005\u0001\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000"+
		"\u0119\u011b\u0003,\u0016\u0000\u011a\u0114\u0001\u0000\u0000\u0000\u011a"+
		"\u0115\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b"+
		"\'\u0001\u0000\u0000\u0000\u011c\u011d\u0005 \u0000\u0000\u011d\u011e"+
		"\u0005\u001e\u0000\u0000\u011e\u0123\u0003*\u0015\u0000\u011f\u0120\u0005"+
		"O\u0000\u0000\u0120\u0122\u0003*\u0015\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124)\u0001\u0000\u0000\u0000"+
		"\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0128\u0005\u0001\u0000\u0000"+
		"\u0127\u0129\u0007\u0000\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u0131\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0003\u001e\u000f\u0000\u012b\u012c\u0005Q\u0000\u0000\u012c"+
		"\u012e\u0005\u0001\u0000\u0000\u012d\u012f\u0007\u0000\u0000\u0000\u012e"+
		"\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f"+
		"\u0131\u0001\u0000\u0000\u0000\u0130\u0126\u0001\u0000\u0000\u0000\u0130"+
		"\u012a\u0001\u0000\u0000\u0000\u0131+\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0005:\u0000\u0000\u0133\u0136\u0005R\u0000\u0000\u0134\u0137\u0005N"+
		"\u0000\u0000\u0135\u0137\u0003.\u0017\u0000\u0136\u0134\u0001\u0000\u0000"+
		"\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000"+
		"\u0000\u0138\u017b\u0005S\u0000\u0000\u0139\u013a\u0005;\u0000\u0000\u013a"+
		"\u013b\u0005R\u0000\u0000\u013b\u013c\u0003.\u0017\u0000\u013c\u013d\u0005"+
		"S\u0000\u0000\u013d\u017b\u0001\u0000\u0000\u0000\u013e\u013f\u0005<\u0000"+
		"\u0000\u013f\u0140\u0005R\u0000\u0000\u0140\u0141\u0003.\u0017\u0000\u0141"+
		"\u0142\u0005S\u0000\u0000\u0142\u017b\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0005=\u0000\u0000\u0144\u0145\u0005R\u0000\u0000\u0145\u0146\u0003."+
		"\u0017\u0000\u0146\u0147\u0005S\u0000\u0000\u0147\u017b\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0005>\u0000\u0000\u0149\u014a\u0005R\u0000\u0000\u014a"+
		"\u014b\u0003.\u0017\u0000\u014b\u014c\u0005S\u0000\u0000\u014c\u017b\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0005?\u0000\u0000\u014e\u014f\u0005R\u0000"+
		"\u0000\u014f\u0150\u0003.\u0017\u0000\u0150\u0151\u0005S\u0000\u0000\u0151"+
		"\u017b\u0001\u0000\u0000\u0000\u0152\u0153\u0005@\u0000\u0000\u0153\u0154"+
		"\u0005R\u0000\u0000\u0154\u0155\u0003.\u0017\u0000\u0155\u0156\u0005O"+
		"\u0000\u0000\u0156\u0157\u0005L\u0000\u0000\u0157\u0158\u0005S\u0000\u0000"+
		"\u0158\u017b\u0001\u0000\u0000\u0000\u0159\u015a\u0005A\u0000\u0000\u015a"+
		"\u015b\u0005R\u0000\u0000\u015b\u015c\u0003.\u0017\u0000\u015c\u015d\u0005"+
		"S\u0000\u0000\u015d\u017b\u0001\u0000\u0000\u0000\u015e\u015f\u0005B\u0000"+
		"\u0000\u015f\u0160\u0005R\u0000\u0000\u0160\u0161\u0003.\u0017\u0000\u0161"+
		"\u0162\u0005S\u0000\u0000\u0162\u017b\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0005C\u0000\u0000\u0164\u0165\u0005R\u0000\u0000\u0165\u0166\u0003."+
		"\u0017\u0000\u0166\u0167\u0005S\u0000\u0000\u0167\u017b\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0005D\u0000\u0000\u0169\u016a\u0005R\u0000\u0000\u016a"+
		"\u016b\u0003.\u0017\u0000\u016b\u016c\u0005S\u0000\u0000\u016c\u017b\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u0005E\u0000\u0000\u016e\u016f\u0005R\u0000"+
		"\u0000\u016f\u0170\u0003.\u0017\u0000\u0170\u0171\u0005S\u0000\u0000\u0171"+
		"\u017b\u0001\u0000\u0000\u0000\u0172\u0173\u0005F\u0000\u0000\u0173\u0174"+
		"\u0005R\u0000\u0000\u0174\u0175\u0003.\u0017\u0000\u0175\u0176\u0005S"+
		"\u0000\u0000\u0176\u017b\u0001\u0000\u0000\u0000\u0177\u0178\u0005\u0001"+
		"\u0000\u0000\u0178\u0179\u0005R\u0000\u0000\u0179\u017b\u0005S\u0000\u0000"+
		"\u017a\u0132\u0001\u0000\u0000\u0000\u017a\u0139\u0001\u0000\u0000\u0000"+
		"\u017a\u013e\u0001\u0000\u0000\u0000\u017a\u0143\u0001\u0000\u0000\u0000"+
		"\u017a\u0148\u0001\u0000\u0000\u0000\u017a\u014d\u0001\u0000\u0000\u0000"+
		"\u017a\u0152\u0001\u0000\u0000\u0000\u017a\u0159\u0001\u0000\u0000\u0000"+
		"\u017a\u015e\u0001\u0000\u0000\u0000\u017a\u0163\u0001\u0000\u0000\u0000"+
		"\u017a\u0168\u0001\u0000\u0000\u0000\u017a\u016d\u0001\u0000\u0000\u0000"+
		"\u017a\u0172\u0001\u0000\u0000\u0000\u017a\u0177\u0001\u0000\u0000\u0000"+
		"\u017b-\u0001\u0000\u0000\u0000\u017c\u017d\u0006\u0017\uffff\uffff\u0000"+
		"\u017d\u017e\u0005%\u0000\u0000\u017e\u0198\u0003.\u0017\b\u017f\u0180"+
		"\u0005\u0001\u0000\u0000\u0180\u0181\u0007\u0001\u0000\u0000\u0181\u0198"+
		"\u0007\u0002\u0000\u0000\u0182\u0183\u0005\u0001\u0000\u0000\u0183\u0185"+
		"\u0005(\u0000\u0000\u0184\u0186\u0005%\u0000\u0000\u0185\u0184\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000"+
		"\u0000\u0000\u0187\u0198\u0005)\u0000\u0000\u0188\u0189\u0005\u0001\u0000"+
		"\u0000\u0189\u018a\u0005*\u0000\u0000\u018a\u0198\u0005L\u0000\u0000\u018b"+
		"\u018c\u0005\u0001\u0000\u0000\u018c\u018d\u0005+\u0000\u0000\u018d\u018e"+
		"\u0003.\u0017\u0000\u018e\u018f\u0005#\u0000\u0000\u018f\u0190\u0003."+
		"\u0017\u0004\u0190\u0198\u0001\u0000\u0000\u0000\u0191\u0192\u0005R\u0000"+
		"\u0000\u0192\u0193\u0003\u0002\u0001\u0000\u0193\u0194\u0005S\u0000\u0000"+
		"\u0194\u0198\u0001\u0000\u0000\u0000\u0195\u0198\u00030\u0018\u0000\u0196"+
		"\u0198\u00034\u001a\u0000\u0197\u017c\u0001\u0000\u0000\u0000\u0197\u017f"+
		"\u0001\u0000\u0000\u0000\u0197\u0182\u0001\u0000\u0000\u0000\u0197\u0188"+
		"\u0001\u0000\u0000\u0000\u0197\u018b\u0001\u0000\u0000\u0000\u0197\u0191"+
		"\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0196"+
		"\u0001\u0000\u0000\u0000\u0198\u01a1\u0001\u0000\u0000\u0000\u0199\u019a"+
		"\n\n\u0000\u0000\u019a\u019b\u0005#\u0000\u0000\u019b\u01a0\u0003.\u0017"+
		"\u000b\u019c\u019d\n\t\u0000\u0000\u019d\u019e\u0005$\u0000\u0000\u019e"+
		"\u01a0\u0003.\u0017\n\u019f\u0199\u0001\u0000\u0000\u0000\u019f\u019c"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1\u019f"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2/\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a6\u0005"+
		"-\u0000\u0000\u01a5\u01a7\u00032\u0019\u0000\u01a6\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01af\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ad\u00050\u0000\u0000\u01ab\u01ae\u0003.\u0017\u0000\u01ac"+
		"\u01ae\u0005)\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ae\u01b0\u0001\u0000\u0000\u0000\u01af\u01aa"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b2\u00051\u0000\u0000\u01b21\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b4\u0005.\u0000\u0000\u01b4\u01b5\u0003.\u0017\u0000"+
		"\u01b5\u01b6\u0005/\u0000\u0000\u01b6\u01b7\u0003.\u0017\u0000\u01b73"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005\u0001\u0000\u0000\u01b9\u01c2"+
		"\u0005R\u0000\u0000\u01ba\u01bf\u00036\u001b\u0000\u01bb\u01bc\u0005O"+
		"\u0000\u0000\u01bc\u01be\u00036\u001b\u0000\u01bd\u01bb\u0001\u0000\u0000"+
		"\u0000\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2\u01ba\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c5\u0005S\u0000\u0000\u01c55\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c7\u0003.\u0017\u0000\u01c77\u0001\u0000\u0000\u0000&>BKNUZ]`g\u0099"+
		"\u00a2\u00ab\u00b3\u00bb\u00d2\u00d6\u00e9\u00f9\u00fd\u0104\u010d\u0112"+
		"\u011a\u0123\u0128\u012e\u0130\u0136\u017a\u0185\u0197\u019f\u01a1\u01a8"+
		"\u01ad\u01af\u01bf\u01c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}