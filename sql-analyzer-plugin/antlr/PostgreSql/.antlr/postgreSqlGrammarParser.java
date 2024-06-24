// Generated from /home/feriano/Documentos/Felipe/F/UNAL/Lenguajes/Repos/SQL-Analyzer/sql-analyzer-plugin/antlr/PostgreSql/postgreSqlGrammar.g4 by ANTLR 4.13.1
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
		ROWS=74, ONLY=75, TABLE=76, UNIQUE=77, PRIMARY=78, KEY=79, DEFAULT=80, 
		FOREIGN=81, REFERENCES=82, INDEX=83, DROP=84, ALTER=85, RENAME=86, CONSTRAINT=87, 
		TO=88, ADD=89, COLUMN=90, DATABASE=91, IF=92, EXISTS=93, STRING=94, NUMBER=95, 
		STAR=96, COMMA=97, SEMI=98, DOT=99, LPAREN=100, RPAREN=101, EQ=102, NEQ=103, 
		LT=104, LTE=105, GT=106, GTE=107, PLUS=108, MINUS=109, SLASH=110, INSERT=111, 
		INTO=112, VALUES=113, UPDATE=114, SET=115, DELETE=116, LINE_COMMENT=117, 
		BLOCK_COMMENT=118, WS=119;
	public static final int
		RULE_sql_stmt = 0, RULE_select_stmt = 1, RULE_function_stmt = 2, RULE_data_type = 3, 
		RULE_function_params = 4, RULE_func_body = 5, RULE_create_table_stmt = 6, 
		RULE_column_def = 7, RULE_column_constraint = 8, RULE_table_constraint = 9, 
		RULE_column_list = 10, RULE_create_index_stmt = 11, RULE_create_database_stmt = 12, 
		RULE_drop_stmt = 13, RULE_alter_table_stmt = 14, RULE_alter_table_action = 15, 
		RULE_insert_stmt = 16, RULE_insert_values = 17, RULE_update_stmt = 18, 
		RULE_update_assignment = 19, RULE_delete_stmt = 20, RULE_value = 21, RULE_limit_offset_clause = 22, 
		RULE_with_clause = 23, RULE_cte = 24, RULE_result_column = 25, RULE_join_clause = 26, 
		RULE_standard_join = 27, RULE_natural_join = 28, RULE_join_type = 29, 
		RULE_natural_join_type = 30, RULE_table_reference = 31, RULE_table_name = 32, 
		RULE_alias = 33, RULE_group_by_clause = 34, RULE_group_by_item = 35, RULE_order_by_clause = 36, 
		RULE_order_by_item = 37, RULE_agg_func = 38, RULE_expr = 39, RULE_arith_expr = 40, 
		RULE_atom = 41, RULE_case_expr = 42, RULE_when_clause = 43, RULE_function_call = 44, 
		RULE_function_arg = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"sql_stmt", "select_stmt", "function_stmt", "data_type", "function_params", 
			"func_body", "create_table_stmt", "column_def", "column_constraint", 
			"table_constraint", "column_list", "create_index_stmt", "create_database_stmt", 
			"drop_stmt", "alter_table_stmt", "alter_table_action", "insert_stmt", 
			"insert_values", "update_stmt", "update_assignment", "delete_stmt", "value", 
			"limit_offset_clause", "with_clause", "cte", "result_column", "join_clause", 
			"standard_join", "natural_join", "join_type", "natural_join_type", "table_reference", 
			"table_name", "alias", "group_by_clause", "group_by_item", "order_by_clause", 
			"order_by_item", "agg_func", "expr", "arith_expr", "atom", "case_expr", 
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
			"'ONLY'", "'TABLE'", "'UNIQUE'", "'PRIMARY'", "'KEY'", "'DEFAULT'", "'FOREIGN'", 
			"'REFERENCES'", "'INDEX'", "'DROP'", "'ALTER'", "'RENAME'", "'CONSTRAINT'", 
			"'TO'", "'ADD'", "'COLUMN'", "'DATABASE'", "'IF'", "'EXISTS'", null, 
			null, "'*'", "','", "';'", "'.'", "'('", "')'", "'='", "'!='", "'<'", 
			"'<='", "'>'", "'>='", "'+'", "'-'", "'/'", "'INSERT'", "'INTO'", "'VALUES'", 
			"'UPDATE'", "'SET'", "'DELETE'"
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
			"FETCH", "FIRST", "ROWS", "ONLY", "TABLE", "UNIQUE", "PRIMARY", "KEY", 
			"DEFAULT", "FOREIGN", "REFERENCES", "INDEX", "DROP", "ALTER", "RENAME", 
			"CONSTRAINT", "TO", "ADD", "COLUMN", "DATABASE", "IF", "EXISTS", "STRING", 
			"NUMBER", "STAR", "COMMA", "SEMI", "DOT", "LPAREN", "RPAREN", "EQ", "NEQ", 
			"LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "SLASH", "INSERT", "INTO", 
			"VALUES", "UPDATE", "SET", "DELETE", "LINE_COMMENT", "BLOCK_COMMENT", 
			"WS"
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
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_database_stmtContext create_database_stmt() {
			return getRuleContext(Create_database_stmtContext.class,0);
		}
		public Drop_stmtContext drop_stmt() {
			return getRuleContext(Drop_stmtContext.class,0);
		}
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				select_stmt();
				setState(93);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				function_stmt();
				setState(96);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				create_table_stmt();
				setState(99);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				create_index_stmt();
				setState(102);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				create_database_stmt();
				setState(105);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				drop_stmt();
				setState(108);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				alter_table_stmt();
				setState(111);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
				insert_stmt();
				setState(114);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(116);
				update_stmt();
				setState(117);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(119);
				delete_stmt();
				setState(120);
				match(SEMI);
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
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(124);
				match(WITH);
				setState(125);
				with_clause();
				}
			}

			setState(128);
			match(SELECT);
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(129);
				match(STAR);
				}
				break;
			case 2:
				{
				{
				setState(130);
				result_column();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(131);
					match(COMMA);
					setState(132);
					result_column();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(140);
			match(FROM);
			setState(141);
			table_reference();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 279240769083015168L) != 0)) {
				{
				{
				setState(142);
				join_clause();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(148);
				match(WHERE);
				setState(149);
				expr(0);
				}
			}

			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(152);
				group_by_clause();
				}
			}

			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(155);
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
			setState(158);
			match(CREATE);
			setState(159);
			match(FUNCTION);
			setState(160);
			match(ID);
			setState(161);
			match(LPAREN);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(162);
				function_params();
				}
			}

			setState(165);
			match(RPAREN);
			setState(166);
			match(RETURNS);
			setState(167);
			match(ID);
			setState(168);
			match(AS);
			setState(169);
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
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(VARCHAR);
				setState(172);
				match(LPAREN);
				setState(173);
				match(NUMBER);
				setState(174);
				match(RPAREN);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(INT);
				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(NUMERIC);
				setState(177);
				match(LPAREN);
				setState(178);
				match(NUMBER);
				setState(179);
				match(COMMA);
				setState(180);
				match(NUMBER);
				setState(181);
				match(RPAREN);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(TEXT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				match(TIMESTAMP);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				match(BOOL);
				}
				break;
			case SERIAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				match(SERIAL);
				}
				break;
			case BIGSERIAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(187);
				match(BIGSERIAL);
				}
				break;
			case UUID:
				enterOuterAlt(_localctx, 10);
				{
				setState(188);
				match(UUID);
				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 11);
				{
				setState(189);
				match(JSON);
				}
				break;
			case JSONB:
				enterOuterAlt(_localctx, 12);
				{
				setState(190);
				match(JSONB);
				}
				break;
			case BYTEA:
				enterOuterAlt(_localctx, 13);
				{
				setState(191);
				match(BYTEA);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 14);
				{
				setState(192);
				match(FLOAT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 15);
				{
				setState(193);
				match(REAL);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 16);
				{
				setState(194);
				match(DOUBLE);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 17);
				{
				setState(195);
				match(DECIMAL);
				setState(196);
				match(LPAREN);
				setState(197);
				match(NUMBER);
				setState(198);
				match(COMMA);
				setState(199);
				match(NUMBER);
				setState(200);
				match(RPAREN);
				}
				break;
			case MONEY:
				enterOuterAlt(_localctx, 18);
				{
				setState(201);
				match(MONEY);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 19);
				{
				setState(202);
				match(SMALLINT);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 20);
				{
				setState(203);
				match(BIGINT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 21);
				{
				setState(204);
				match(CHAR);
				setState(205);
				match(LPAREN);
				setState(206);
				match(NUMBER);
				setState(207);
				match(RPAREN);
				}
				break;
			case BIT:
				enterOuterAlt(_localctx, 22);
				{
				setState(208);
				match(BIT);
				setState(209);
				match(LPAREN);
				setState(210);
				match(NUMBER);
				setState(211);
				match(RPAREN);
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 23);
				{
				setState(212);
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
			setState(215);
			match(ID);
			setState(216);
			data_type();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(217);
				match(COMMA);
				setState(218);
				match(ID);
				setState(219);
				data_type();
				}
				}
				setState(224);
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
			setState(225);
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
	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(postgreSqlGrammarParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(postgreSqlGrammarParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(postgreSqlGrammarParser.LPAREN, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(postgreSqlGrammarParser.RPAREN, 0); }
		public TerminalNode IF() { return getToken(postgreSqlGrammarParser.IF, 0); }
		public TerminalNode NOT() { return getToken(postgreSqlGrammarParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(postgreSqlGrammarParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(postgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(postgreSqlGrammarParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(CREATE);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(228);
				match(IF);
				setState(229);
				match(NOT);
				setState(230);
				match(EXISTS);
				}
			}

			setState(233);
			match(TABLE);
			setState(234);
			table_name();
			setState(235);
			match(LPAREN);
			setState(236);
			column_def();
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237);
					match(COMMA);
					setState(238);
					column_def();
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(244);
				match(COMMA);
				setState(245);
				table_constraint();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
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
	public static class Column_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(postgreSqlGrammarParser.ID, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(ID);
			setState(254);
			data_type();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 12094627905537L) != 0)) {
				{
				{
				setState(255);
				column_constraint();
				}
				}
				setState(260);
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
	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(postgreSqlGrammarParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(postgreSqlGrammarParser.NULL, 0); }
		public TerminalNode UNIQUE() { return getToken(postgreSqlGrammarParser.UNIQUE, 0); }
		public TerminalNode PRIMARY() { return getToken(postgreSqlGrammarParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(postgreSqlGrammarParser.KEY, 0); }
		public TerminalNode DEFAULT() { return getToken(postgreSqlGrammarParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_column_constraint);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(NOT);
				setState(262);
				match(NULL);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(UNIQUE);
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(PRIMARY);
				setState(265);
				match(KEY);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				match(DEFAULT);
				setState(267);
				expr(0);
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
	public static class Table_constraintContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(postgreSqlGrammarParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(postgreSqlGrammarParser.KEY, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(postgreSqlGrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(postgreSqlGrammarParser.LPAREN, i);
		}
		public List<Column_listContext> column_list() {
			return getRuleContexts(Column_listContext.class);
		}
		public Column_listContext column_list(int i) {
			return getRuleContext(Column_listContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(postgreSqlGrammarParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(postgreSqlGrammarParser.RPAREN, i);
		}
		public TerminalNode UNIQUE() { return getToken(postgreSqlGrammarParser.UNIQUE, 0); }
		public TerminalNode FOREIGN() { return getToken(postgreSqlGrammarParser.FOREIGN, 0); }
		public TerminalNode REFERENCES() { return getToken(postgreSqlGrammarParser.REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_table_constraint);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(PRIMARY);
				setState(271);
				match(KEY);
				setState(272);
				match(LPAREN);
				setState(273);
				column_list();
				setState(274);
				match(RPAREN);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(UNIQUE);
				setState(277);
				match(LPAREN);
				setState(278);
				column_list();
				setState(279);
				match(RPAREN);
				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(FOREIGN);
				setState(282);
				match(KEY);
				setState(283);
				match(LPAREN);
				setState(284);
				column_list();
				setState(285);
				match(RPAREN);
				setState(286);
				match(REFERENCES);
				setState(287);
				table_name();
				setState(288);
				match(LPAREN);
				setState(289);
				column_list();
				setState(290);
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
	public static class Column_listContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(postgreSqlGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(postgreSqlGrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(postgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(postgreSqlGrammarParser.COMMA, i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(ID);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(295);
				match(COMMA);
				setState(296);
				match(ID);
				}
				}
				setState(301);
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
	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(postgreSqlGrammarParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(postgreSqlGrammarParser.INDEX, 0); }
		public TerminalNode ID() { return getToken(postgreSqlGrammarParser.ID, 0); }
		public TerminalNode ON() { return getToken(postgreSqlGrammarParser.ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(postgreSqlGrammarParser.LPAREN, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(postgreSqlGrammarParser.RPAREN, 0); }
		public TerminalNode UNIQUE() { return getToken(postgreSqlGrammarParser.UNIQUE, 0); }
		public TerminalNode IF() { return getToken(postgreSqlGrammarParser.IF, 0); }
		public TerminalNode NOT() { return getToken(postgreSqlGrammarParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(postgreSqlGrammarParser.EXISTS, 0); }
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(CREATE);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(303);
				match(UNIQUE);
				}
			}

			setState(306);
			match(INDEX);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(307);
				match(IF);
				setState(308);
				match(NOT);
				setState(309);
				match(EXISTS);
				}
			}

			setState(312);
			match(ID);
			setState(313);
			match(ON);
			setState(314);
			table_name();
			setState(315);
			match(LPAREN);
			setState(316);
			column_list();
			setState(317);
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
	public static class Create_database_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(postgreSqlGrammarParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(postgreSqlGrammarParser.DATABASE, 0); }
		public TerminalNode ID() { return getToken(postgreSqlGrammarParser.ID, 0); }
		public TerminalNode IF() { return getToken(postgreSqlGrammarParser.IF, 0); }
		public TerminalNode NOT() { return getToken(postgreSqlGrammarParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(postgreSqlGrammarParser.EXISTS, 0); }
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt; }
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_database_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(CREATE);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(320);
				match(IF);
				setState(321);
				match(NOT);
				setState(322);
				match(EXISTS);
				}
			}

			setState(325);
			match(DATABASE);
			setState(326);
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
	public static class Drop_stmtContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(postgreSqlGrammarParser.DROP, 0); }
		public TerminalNode ID() { return getToken(postgreSqlGrammarParser.ID, 0); }
		public TerminalNode TABLE() { return getToken(postgreSqlGrammarParser.TABLE, 0); }
		public TerminalNode INDEX() { return getToken(postgreSqlGrammarParser.INDEX, 0); }
		public TerminalNode DATABASE() { return getToken(postgreSqlGrammarParser.DATABASE, 0); }
		public TerminalNode FUNCTION() { return getToken(postgreSqlGrammarParser.FUNCTION, 0); }
		public TerminalNode IF() { return getToken(postgreSqlGrammarParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(postgreSqlGrammarParser.EXISTS, 0); }
		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmt; }
	}

	public final Drop_stmtContext drop_stmt() throws RecognitionException {
		Drop_stmtContext _localctx = new Drop_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_drop_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(DROP);
			setState(329);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 1103840149505L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(330);
				match(IF);
				setState(331);
				match(EXISTS);
				}
			}

			setState(334);
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
	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(postgreSqlGrammarParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(postgreSqlGrammarParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Alter_table_actionContext alter_table_action() {
			return getRuleContext(Alter_table_actionContext.class,0);
		}
		public TerminalNode IF() { return getToken(postgreSqlGrammarParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(postgreSqlGrammarParser.EXISTS, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(ALTER);
			setState(337);
			match(TABLE);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(338);
				match(IF);
				setState(339);
				match(EXISTS);
				}
			}

			setState(342);
			table_name();
			setState(343);
			alter_table_action();
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
	public static class Alter_table_actionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(postgreSqlGrammarParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(postgreSqlGrammarParser.COLUMN, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public TerminalNode DROP() { return getToken(postgreSqlGrammarParser.DROP, 0); }
		public List<TerminalNode> ID() { return getTokens(postgreSqlGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(postgreSqlGrammarParser.ID, i);
		}
		public TerminalNode IF() { return getToken(postgreSqlGrammarParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(postgreSqlGrammarParser.EXISTS, 0); }
		public TerminalNode RENAME() { return getToken(postgreSqlGrammarParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(postgreSqlGrammarParser.TO, 0); }
		public TerminalNode CONSTRAINT() { return getToken(postgreSqlGrammarParser.CONSTRAINT, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_action; }
	}

	public final Alter_table_actionContext alter_table_action() throws RecognitionException {
		Alter_table_actionContext _localctx = new Alter_table_actionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alter_table_action);
		int _la;
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(ADD);
				setState(346);
				match(COLUMN);
				setState(347);
				column_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(DROP);
				setState(349);
				match(COLUMN);
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(350);
					match(IF);
					setState(351);
					match(EXISTS);
					}
				}

				setState(354);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(RENAME);
				setState(356);
				match(COLUMN);
				setState(357);
				match(ID);
				setState(358);
				match(TO);
				setState(359);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				match(ADD);
				setState(361);
				match(CONSTRAINT);
				setState(362);
				table_constraint();
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
	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(postgreSqlGrammarParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(postgreSqlGrammarParser.INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(postgreSqlGrammarParser.VALUES, 0); }
		public List<Insert_valuesContext> insert_values() {
			return getRuleContexts(Insert_valuesContext.class);
		}
		public Insert_valuesContext insert_values(int i) {
			return getRuleContext(Insert_valuesContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(postgreSqlGrammarParser.LPAREN, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(postgreSqlGrammarParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(postgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(postgreSqlGrammarParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_insert_stmt);
		int _la;
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(INSERT);
				setState(366);
				match(INTO);
				setState(367);
				table_name();
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(368);
					match(LPAREN);
					setState(369);
					column_list();
					setState(370);
					match(RPAREN);
					}
				}

				setState(374);
				match(VALUES);
				setState(375);
				insert_values();
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(376);
					match(COMMA);
					setState(377);
					insert_values();
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(INSERT);
				setState(384);
				match(INTO);
				setState(385);
				table_name();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(386);
					match(LPAREN);
					setState(387);
					column_list();
					setState(388);
					match(RPAREN);
					}
				}

				setState(392);
				select_stmt();
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
	public static class Insert_valuesContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(postgreSqlGrammarParser.LPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(postgreSqlGrammarParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(postgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(postgreSqlGrammarParser.COMMA, i);
		}
		public Insert_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_values; }
	}

	public final Insert_valuesContext insert_values() throws RecognitionException {
		Insert_valuesContext _localctx = new Insert_valuesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_insert_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(LPAREN);
			setState(397);
			value();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(398);
				match(COMMA);
				setState(399);
				value();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
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
	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(postgreSqlGrammarParser.UPDATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode SET() { return getToken(postgreSqlGrammarParser.SET, 0); }
		public List<Update_assignmentContext> update_assignment() {
			return getRuleContexts(Update_assignmentContext.class);
		}
		public Update_assignmentContext update_assignment(int i) {
			return getRuleContext(Update_assignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(postgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(postgreSqlGrammarParser.COMMA, i);
		}
		public TerminalNode WHERE() { return getToken(postgreSqlGrammarParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(UPDATE);
			setState(408);
			table_name();
			setState(409);
			match(SET);
			setState(410);
			update_assignment();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(411);
				match(COMMA);
				setState(412);
				update_assignment();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(418);
				match(WHERE);
				setState(419);
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
	public static class Update_assignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(postgreSqlGrammarParser.ID, 0); }
		public TerminalNode EQ() { return getToken(postgreSqlGrammarParser.EQ, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Update_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_assignment; }
	}

	public final Update_assignmentContext update_assignment() throws RecognitionException {
		Update_assignmentContext _localctx = new Update_assignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_update_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(ID);
			setState(423);
			match(EQ);
			setState(424);
			value();
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
	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(postgreSqlGrammarParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(postgreSqlGrammarParser.FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(postgreSqlGrammarParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(DELETE);
			setState(427);
			match(FROM);
			setState(428);
			table_name();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(429);
				match(WHERE);
				setState(430);
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(postgreSqlGrammarParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(postgreSqlGrammarParser.NUMBER, 0); }
		public TerminalNode NULL() { return getToken(postgreSqlGrammarParser.NULL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				expr(0);
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
		enterRule(_localctx, 44, RULE_limit_offset_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(439);
				match(OFFSET);
				setState(440);
				expr(0);
				setState(441);
				match(ROWS);
				}
			}

			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FETCH) {
				{
				setState(445);
				match(FETCH);
				setState(446);
				match(FIRST);
				setState(447);
				expr(0);
				setState(448);
				match(ROWS);
				setState(449);
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
		enterRule(_localctx, 46, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(WITH);
			setState(454);
			cte();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(455);
				match(COMMA);
				setState(456);
				cte();
				}
				}
				setState(461);
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
		enterRule(_localctx, 48, RULE_cte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(ID);
			setState(463);
			match(AS);
			setState(464);
			match(LPAREN);
			setState(465);
			select_stmt();
			setState(466);
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
		enterRule(_localctx, 50, RULE_result_column);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				table_reference();
				setState(470);
				match(DOT);
				setState(471);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
				table_reference();
				setState(474);
				match(DOT);
				setState(475);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(477);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(478);
				agg_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(479);
				match(ID);
				setState(480);
				match(LPAREN);
				setState(481);
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
		enterRule(_localctx, 52, RULE_join_clause);
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				standard_join();
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
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
		enterRule(_localctx, 54, RULE_standard_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			join_type();
			setState(489);
			table_reference();
			setState(490);
			match(ON);
			setState(491);
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
		enterRule(_localctx, 56, RULE_natural_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			natural_join_type();
			setState(494);
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
		enterRule(_localctx, 58, RULE_join_type);
		try {
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				match(INNER);
				setState(497);
				match(JOIN);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				match(LEFT);
				setState(499);
				match(JOIN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				match(RIGHT);
				setState(501);
				match(JOIN);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(502);
				match(FULL);
				setState(503);
				match(JOIN);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(504);
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
		enterRule(_localctx, 60, RULE_natural_join_type);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				match(NATURAL);
				setState(508);
				match(JOIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				match(NATURAL);
				setState(510);
				match(INNER);
				setState(511);
				match(JOIN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(512);
				match(NATURAL);
				setState(513);
				match(LEFT);
				setState(514);
				match(JOIN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(515);
				match(NATURAL);
				setState(516);
				match(RIGHT);
				setState(517);
				match(JOIN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(518);
				match(NATURAL);
				setState(519);
				match(FULL);
				setState(520);
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
		enterRule(_localctx, 62, RULE_table_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			table_name();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==AS) {
				{
				setState(524);
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
		enterRule(_localctx, 64, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
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
		enterRule(_localctx, 66, RULE_alias);
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(529);
				match(AS);
				setState(530);
				match(ID);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
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
		enterRule(_localctx, 68, RULE_group_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(GROUP);
			setState(535);
			match(BY);
			setState(536);
			group_by_item();
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(537);
				match(COMMA);
				setState(538);
				group_by_item();
				}
				}
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(544);
				match(HAVING);
				setState(545);
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
		enterRule(_localctx, 70, RULE_group_by_item);
		try {
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				table_reference();
				setState(550);
				match(DOT);
				setState(551);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(553);
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
		enterRule(_localctx, 72, RULE_order_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(ORDER);
			setState(557);
			match(BY);
			setState(558);
			order_by_item();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(559);
				match(COMMA);
				setState(560);
				order_by_item();
				}
				}
				setState(565);
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
		enterRule(_localctx, 74, RULE_order_by_item);
		int _la;
		try {
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				match(ID);
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(567);
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
				setState(570);
				table_reference();
				setState(571);
				match(DOT);
				setState(572);
				match(ID);
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(573);
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
		enterRule(_localctx, 76, RULE_agg_func);
		try {
			setState(650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(COUNT);
				setState(579);
				match(LPAREN);
				setState(582);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(580);
					match(STAR);
					}
					break;
				case ID:
				case NOT:
				case CASE:
				case NUMBER:
				case LPAREN:
					{
					setState(581);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(584);
				match(RPAREN);
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(SUM);
				setState(586);
				match(LPAREN);
				setState(587);
				expr(0);
				setState(588);
				match(RPAREN);
				}
				break;
			case AVG:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				match(AVG);
				setState(591);
				match(LPAREN);
				setState(592);
				expr(0);
				setState(593);
				match(RPAREN);
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(595);
				match(MIN);
				setState(596);
				match(LPAREN);
				setState(597);
				expr(0);
				setState(598);
				match(RPAREN);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 5);
				{
				setState(600);
				match(MAX);
				setState(601);
				match(LPAREN);
				setState(602);
				expr(0);
				setState(603);
				match(RPAREN);
				}
				break;
			case ARRAY_AGG:
				enterOuterAlt(_localctx, 6);
				{
				setState(605);
				match(ARRAY_AGG);
				setState(606);
				match(LPAREN);
				setState(607);
				expr(0);
				setState(608);
				match(RPAREN);
				}
				break;
			case STRING_AGG:
				enterOuterAlt(_localctx, 7);
				{
				setState(610);
				match(STRING_AGG);
				setState(611);
				match(LPAREN);
				setState(612);
				expr(0);
				setState(613);
				match(COMMA);
				setState(614);
				match(STRING);
				setState(615);
				match(RPAREN);
				}
				break;
			case BOOL_AND:
				enterOuterAlt(_localctx, 8);
				{
				setState(617);
				match(BOOL_AND);
				setState(618);
				match(LPAREN);
				setState(619);
				expr(0);
				setState(620);
				match(RPAREN);
				}
				break;
			case BOOL_OR:
				enterOuterAlt(_localctx, 9);
				{
				setState(622);
				match(BOOL_OR);
				setState(623);
				match(LPAREN);
				setState(624);
				expr(0);
				setState(625);
				match(RPAREN);
				}
				break;
			case VAR_POP:
				enterOuterAlt(_localctx, 10);
				{
				setState(627);
				match(VAR_POP);
				setState(628);
				match(LPAREN);
				setState(629);
				expr(0);
				setState(630);
				match(RPAREN);
				}
				break;
			case VAR_SAMP:
				enterOuterAlt(_localctx, 11);
				{
				setState(632);
				match(VAR_SAMP);
				setState(633);
				match(LPAREN);
				setState(634);
				expr(0);
				setState(635);
				match(RPAREN);
				}
				break;
			case STDDEV_POP:
				enterOuterAlt(_localctx, 12);
				{
				setState(637);
				match(STDDEV_POP);
				setState(638);
				match(LPAREN);
				setState(639);
				expr(0);
				setState(640);
				match(RPAREN);
				}
				break;
			case STDDEV_SAMP:
				enterOuterAlt(_localctx, 13);
				{
				setState(642);
				match(STDDEV_SAMP);
				setState(643);
				match(LPAREN);
				setState(644);
				expr(0);
				setState(645);
				match(RPAREN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 14);
				{
				setState(647);
				match(ID);
				setState(648);
				match(LPAREN);
				setState(649);
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
		public Arith_exprContext arith_expr() {
			return getRuleContext(Arith_exprContext.class,0);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(653);
				match(NOT);
				setState(654);
				expr(9);
				}
				break;
			case 2:
				{
				setState(655);
				arith_expr(0);
				}
				break;
			case 3:
				{
				setState(656);
				match(ID);
				setState(657);
				_la = _input.LA(1);
				if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 63L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(658);
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
			case 4:
				{
				setState(659);
				match(ID);
				setState(660);
				match(IS);
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(661);
					match(NOT);
					}
				}

				setState(664);
				match(NULL);
				}
				break;
			case 5:
				{
				setState(665);
				match(ID);
				setState(666);
				match(LIKE);
				setState(667);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(668);
				match(ID);
				setState(669);
				match(BETWEEN);
				setState(670);
				expr(0);
				setState(671);
				match(AND);
				setState(672);
				expr(4);
				}
				break;
			case 7:
				{
				setState(674);
				match(LPAREN);
				setState(675);
				select_stmt();
				setState(676);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(678);
				case_expr();
				}
				break;
			case 9:
				{
				setState(679);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(688);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(682);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(683);
						match(AND);
						setState(684);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(685);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(686);
						match(OR);
						setState(687);
						expr(11);
						}
						break;
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
	public static class Arith_exprContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<Arith_exprContext> arith_expr() {
			return getRuleContexts(Arith_exprContext.class);
		}
		public Arith_exprContext arith_expr(int i) {
			return getRuleContext(Arith_exprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(postgreSqlGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(postgreSqlGrammarParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(postgreSqlGrammarParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(postgreSqlGrammarParser.SLASH, 0); }
		public Arith_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expr; }
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		return arith_expr(0);
	}

	private Arith_exprContext arith_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, _parentState);
		Arith_exprContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_arith_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(694);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(708);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new Arith_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_expr);
						setState(696);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(697);
						match(PLUS);
						setState(698);
						arith_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new Arith_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_expr);
						setState(699);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(700);
						match(MINUS);
						setState(701);
						arith_expr(5);
						}
						break;
					case 3:
						{
						_localctx = new Arith_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_expr);
						setState(702);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(703);
						match(STAR);
						setState(704);
						arith_expr(4);
						}
						break;
					case 4:
						{
						_localctx = new Arith_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_expr);
						setState(705);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(706);
						match(SLASH);
						setState(707);
						arith_expr(3);
						}
						break;
					}
					} 
				}
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(postgreSqlGrammarParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(postgreSqlGrammarParser.NUMBER, 0); }
		public TerminalNode LPAREN() { return getToken(postgreSqlGrammarParser.LPAREN, 0); }
		public Arith_exprContext arith_expr() {
			return getRuleContext(Arith_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(postgreSqlGrammarParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_atom);
		try {
			setState(719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
				match(NUMBER);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(715);
				match(LPAREN);
				setState(716);
				arith_expr(0);
				setState(717);
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
		enterRule(_localctx, 84, RULE_case_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(CASE);
			setState(723); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(722);
				when_clause();
				}
				}
				setState(725); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(727);
				match(ELSE);
				setState(730);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case NOT:
				case CASE:
				case NUMBER:
				case LPAREN:
					{
					setState(728);
					expr(0);
					}
					break;
				case NULL:
					{
					setState(729);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(734);
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
		enterRule(_localctx, 86, RULE_when_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(WHEN);
			setState(737);
			expr(0);
			setState(738);
			match(THEN);
			setState(739);
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
		enterRule(_localctx, 88, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(ID);
			setState(742);
			match(LPAREN);
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35321811042306L) != 0) || _la==NUMBER || _la==LPAREN) {
				{
				setState(743);
				function_arg();
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(744);
					match(COMMA);
					setState(745);
					function_arg();
					}
					}
					setState(750);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(753);
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
		enterRule(_localctx, 90, RULE_function_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
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
		case 39:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 40:
			return arith_expr_sempred((Arith_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean arith_expr_sempred(Arith_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001w\u02f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000{\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u007f"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u0086\b\u0001\n\u0001\f\u0001\u0089\t\u0001\u0003\u0001\u008b\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0090\b\u0001\n"+
		"\u0001\f\u0001\u0093\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0097"+
		"\b\u0001\u0001\u0001\u0003\u0001\u009a\b\u0001\u0001\u0001\u0003\u0001"+
		"\u009d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u00a4\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00d6\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00dd\b\u0004\n\u0004"+
		"\f\u0004\u00e0\t\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00e8\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00f0\b\u0006"+
		"\n\u0006\f\u0006\u00f3\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00f7"+
		"\b\u0006\n\u0006\f\u0006\u00fa\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0101\b\u0007\n\u0007\f\u0007\u0104"+
		"\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u010d\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0125\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u012a\b\n\n\n\f\n\u012d\t\n\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0131\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0137\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0144\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u014d\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0155\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0161\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u016c\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0175\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u017b\b\u0010\n\u0010\f\u0010"+
		"\u017e\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0187\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u018b\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u0191\b\u0011\n\u0011\f\u0011\u0194\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u019e\b\u0012\n\u0012\f\u0012\u01a1\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u01a5\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u01b0\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u01b6\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u01bc\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u01c4\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u01ca\b\u0017\n\u0017\f\u0017\u01cd"+
		"\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01e3\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01e7\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u01fa\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u020a\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u020e\b\u001f"+
		"\u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u0215\b!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u021c\b\"\n\"\f\"\u021f\t\"\u0001\"\u0001\""+
		"\u0003\"\u0223\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u022b"+
		"\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u0232\b$\n$\f$\u0235\t$"+
		"\u0001%\u0001%\u0003%\u0239\b%\u0001%\u0001%\u0001%\u0001%\u0003%\u023f"+
		"\b%\u0003%\u0241\b%\u0001&\u0001&\u0001&\u0001&\u0003&\u0247\b&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u028b\b&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0297"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u02a9"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u02b1\b\'"+
		"\n\'\f\'\u02b4\t\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u02c5\b(\n("+
		"\f(\u02c8\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u02d0\b"+
		")\u0001*\u0001*\u0004*\u02d4\b*\u000b*\f*\u02d5\u0001*\u0001*\u0001*\u0003"+
		"*\u02db\b*\u0003*\u02dd\b*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u02eb\b,\n,\f,\u02ee\t,\u0003"+
		",\u02f0\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0000\u0002NP.\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u0004\u0004\u000033LLSS[[\u0001"+
		"\u0000!\"\u0001\u0000fk\u0001\u0000^_\u034c\u0000z\u0001\u0000\u0000\u0000"+
		"\u0002~\u0001\u0000\u0000\u0000\u0004\u009e\u0001\u0000\u0000\u0000\u0006"+
		"\u00d5\u0001\u0000\u0000\u0000\b\u00d7\u0001\u0000\u0000\u0000\n\u00e1"+
		"\u0001\u0000\u0000\u0000\f\u00e3\u0001\u0000\u0000\u0000\u000e\u00fd\u0001"+
		"\u0000\u0000\u0000\u0010\u010c\u0001\u0000\u0000\u0000\u0012\u0124\u0001"+
		"\u0000\u0000\u0000\u0014\u0126\u0001\u0000\u0000\u0000\u0016\u012e\u0001"+
		"\u0000\u0000\u0000\u0018\u013f\u0001\u0000\u0000\u0000\u001a\u0148\u0001"+
		"\u0000\u0000\u0000\u001c\u0150\u0001\u0000\u0000\u0000\u001e\u016b\u0001"+
		"\u0000\u0000\u0000 \u018a\u0001\u0000\u0000\u0000\"\u018c\u0001\u0000"+
		"\u0000\u0000$\u0197\u0001\u0000\u0000\u0000&\u01a6\u0001\u0000\u0000\u0000"+
		"(\u01aa\u0001\u0000\u0000\u0000*\u01b5\u0001\u0000\u0000\u0000,\u01bb"+
		"\u0001\u0000\u0000\u0000.\u01c5\u0001\u0000\u0000\u00000\u01ce\u0001\u0000"+
		"\u0000\u00002\u01e2\u0001\u0000\u0000\u00004\u01e6\u0001\u0000\u0000\u0000"+
		"6\u01e8\u0001\u0000\u0000\u00008\u01ed\u0001\u0000\u0000\u0000:\u01f9"+
		"\u0001\u0000\u0000\u0000<\u0209\u0001\u0000\u0000\u0000>\u020b\u0001\u0000"+
		"\u0000\u0000@\u020f\u0001\u0000\u0000\u0000B\u0214\u0001\u0000\u0000\u0000"+
		"D\u0216\u0001\u0000\u0000\u0000F\u022a\u0001\u0000\u0000\u0000H\u022c"+
		"\u0001\u0000\u0000\u0000J\u0240\u0001\u0000\u0000\u0000L\u028a\u0001\u0000"+
		"\u0000\u0000N\u02a8\u0001\u0000\u0000\u0000P\u02b5\u0001\u0000\u0000\u0000"+
		"R\u02cf\u0001\u0000\u0000\u0000T\u02d1\u0001\u0000\u0000\u0000V\u02e0"+
		"\u0001\u0000\u0000\u0000X\u02e5\u0001\u0000\u0000\u0000Z\u02f3\u0001\u0000"+
		"\u0000\u0000\\]\u0003\u0002\u0001\u0000]^\u0005b\u0000\u0000^{\u0001\u0000"+
		"\u0000\u0000_`\u0003\u0004\u0002\u0000`a\u0005b\u0000\u0000a{\u0001\u0000"+
		"\u0000\u0000bc\u0003\f\u0006\u0000cd\u0005b\u0000\u0000d{\u0001\u0000"+
		"\u0000\u0000ef\u0003\u0016\u000b\u0000fg\u0005b\u0000\u0000g{\u0001\u0000"+
		"\u0000\u0000hi\u0003\u0018\f\u0000ij\u0005b\u0000\u0000j{\u0001\u0000"+
		"\u0000\u0000kl\u0003\u001a\r\u0000lm\u0005b\u0000\u0000m{\u0001\u0000"+
		"\u0000\u0000no\u0003\u001c\u000e\u0000op\u0005b\u0000\u0000p{\u0001\u0000"+
		"\u0000\u0000qr\u0003 \u0010\u0000rs\u0005b\u0000\u0000s{\u0001\u0000\u0000"+
		"\u0000tu\u0003$\u0012\u0000uv\u0005b\u0000\u0000v{\u0001\u0000\u0000\u0000"+
		"wx\u0003(\u0014\u0000xy\u0005b\u0000\u0000y{\u0001\u0000\u0000\u0000z"+
		"\\\u0001\u0000\u0000\u0000z_\u0001\u0000\u0000\u0000zb\u0001\u0000\u0000"+
		"\u0000ze\u0001\u0000\u0000\u0000zh\u0001\u0000\u0000\u0000zk\u0001\u0000"+
		"\u0000\u0000zn\u0001\u0000\u0000\u0000zq\u0001\u0000\u0000\u0000zt\u0001"+
		"\u0000\u0000\u0000zw\u0001\u0000\u0000\u0000{\u0001\u0001\u0000\u0000"+
		"\u0000|}\u0005\u001a\u0000\u0000}\u007f\u0003.\u0017\u0000~|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u008a\u0005\u0019\u0000\u0000\u0081\u008b\u0005`\u0000\u0000"+
		"\u0082\u0087\u00032\u0019\u0000\u0083\u0084\u0005a\u0000\u0000\u0084\u0086"+
		"\u00032\u0019\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0089\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u008a\u0081\u0001\u0000\u0000\u0000\u008a\u0082\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\u001b\u0000\u0000\u008d\u0091\u0003>\u001f\u0000\u008e\u0090\u00034\u001a"+
		"\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0096\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005\u001c\u0000\u0000\u0095\u0097\u0003N\'\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u009a\u0003D\"\u0000\u0099"+
		"\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		"\u009c\u0001\u0000\u0000\u0000\u009b\u009d\u0003H$\u0000\u009c\u009b\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u0003\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u00052\u0000\u0000\u009f\u00a0\u00053\u0000"+
		"\u0000\u00a0\u00a1\u0005\u0001\u0000\u0000\u00a1\u00a3\u0005d\u0000\u0000"+
		"\u00a2\u00a4\u0003\b\u0004\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005e\u0000\u0000\u00a6\u00a7\u00054\u0000\u0000\u00a7\u00a8\u0005"+
		"\u0001\u0000\u0000\u00a8\u00a9\u0005&\u0000\u0000\u00a9\u00aa\u0003\n"+
		"\u0005\u0000\u00aa\u0005\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0002"+
		"\u0000\u0000\u00ac\u00ad\u0005d\u0000\u0000\u00ad\u00ae\u0005_\u0000\u0000"+
		"\u00ae\u00d6\u0005e\u0000\u0000\u00af\u00d6\u0005\u0003\u0000\u0000\u00b0"+
		"\u00b1\u0005\u0004\u0000\u0000\u00b1\u00b2\u0005d\u0000\u0000\u00b2\u00b3"+
		"\u0005_\u0000\u0000\u00b3\u00b4\u0005a\u0000\u0000\u00b4\u00b5\u0005_"+
		"\u0000\u0000\u00b5\u00d6\u0005e\u0000\u0000\u00b6\u00d6\u0005\u0005\u0000"+
		"\u0000\u00b7\u00d6\u0005\u0006\u0000\u0000\u00b8\u00d6\u0005\u0007\u0000"+
		"\u0000\u00b9\u00d6\u0005\b\u0000\u0000\u00ba\u00d6\u0005\t\u0000\u0000"+
		"\u00bb\u00d6\u0005\n\u0000\u0000\u00bc\u00d6\u0005\u000b\u0000\u0000\u00bd"+
		"\u00d6\u0005\f\u0000\u0000\u00be\u00d6\u0005\r\u0000\u0000\u00bf\u00d6"+
		"\u0005\u000e\u0000\u0000\u00c0\u00d6\u0005\u000f\u0000\u0000\u00c1\u00d6"+
		"\u0005\u0010\u0000\u0000\u00c2\u00d6\u0005\u0011\u0000\u0000\u00c3\u00c4"+
		"\u0005\u0012\u0000\u0000\u00c4\u00c5\u0005d\u0000\u0000\u00c5\u00c6\u0005"+
		"_\u0000\u0000\u00c6\u00c7\u0005a\u0000\u0000\u00c7\u00c8\u0005_\u0000"+
		"\u0000\u00c8\u00d6\u0005e\u0000\u0000\u00c9\u00d6\u0005\u0013\u0000\u0000"+
		"\u00ca\u00d6\u0005\u0014\u0000\u0000\u00cb\u00d6\u0005\u0015\u0000\u0000"+
		"\u00cc\u00cd\u0005\u0016\u0000\u0000\u00cd\u00ce\u0005d\u0000\u0000\u00ce"+
		"\u00cf\u0005_\u0000\u0000\u00cf\u00d6\u0005e\u0000\u0000\u00d0\u00d1\u0005"+
		"\u0017\u0000\u0000\u00d1\u00d2\u0005d\u0000\u0000\u00d2\u00d3\u0005_\u0000"+
		"\u0000\u00d3\u00d6\u0005e\u0000\u0000\u00d4\u00d6\u0005\u0018\u0000\u0000"+
		"\u00d5\u00ab\u0001\u0000\u0000\u0000\u00d5\u00af\u0001\u0000\u0000\u0000"+
		"\u00d5\u00b0\u0001\u0000\u0000\u0000\u00d5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00d5\u00b7\u0001\u0000\u0000\u0000\u00d5\u00b8\u0001\u0000\u0000\u0000"+
		"\u00d5\u00b9\u0001\u0000\u0000\u0000\u00d5\u00ba\u0001\u0000\u0000\u0000"+
		"\u00d5\u00bb\u0001\u0000\u0000\u0000\u00d5\u00bc\u0001\u0000\u0000\u0000"+
		"\u00d5\u00bd\u0001\u0000\u0000\u0000\u00d5\u00be\u0001\u0000\u0000\u0000"+
		"\u00d5\u00bf\u0001\u0000\u0000\u0000\u00d5\u00c0\u0001\u0000\u0000\u0000"+
		"\u00d5\u00c1\u0001\u0000\u0000\u0000\u00d5\u00c2\u0001\u0000\u0000\u0000"+
		"\u00d5\u00c3\u0001\u0000\u0000\u0000\u00d5\u00c9\u0001\u0000\u0000\u0000"+
		"\u00d5\u00ca\u0001\u0000\u0000\u0000\u00d5\u00cb\u0001\u0000\u0000\u0000"+
		"\u00d5\u00cc\u0001\u0000\u0000\u0000\u00d5\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u0007\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0005\u0001\u0000\u0000\u00d8\u00de\u0003\u0006\u0003\u0000"+
		"\u00d9\u00da\u0005a\u0000\u0000\u00da\u00db\u0005\u0001\u0000\u0000\u00db"+
		"\u00dd\u0003\u0006\u0003\u0000\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dd"+
		"\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0001\u0000\u0000\u0000\u00df\t\u0001\u0000\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003N\'\u0000\u00e2\u000b\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e7\u00052\u0000\u0000\u00e4\u00e5\u0005\\"+
		"\u0000\u0000\u00e5\u00e6\u0005%\u0000\u0000\u00e6\u00e8\u0005]\u0000\u0000"+
		"\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005L\u0000\u0000\u00ea"+
		"\u00eb\u0003@ \u0000\u00eb\u00ec\u0005d\u0000\u0000\u00ec\u00f1\u0003"+
		"\u000e\u0007\u0000\u00ed\u00ee\u0005a\u0000\u0000\u00ee\u00f0\u0003\u000e"+
		"\u0007\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f8\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0005a\u0000\u0000\u00f5\u00f7\u0003\u0012\t"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0005e\u0000\u0000\u00fc\r\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0005\u0001\u0000\u0000\u00fe\u0102\u0003\u0006\u0003\u0000"+
		"\u00ff\u0101\u0003\u0010\b\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0001\u0000\u0000\u0000\u0103\u000f\u0001\u0000\u0000\u0000\u0104"+
		"\u0102\u0001\u0000\u0000\u0000\u0105\u0106\u0005%\u0000\u0000\u0106\u010d"+
		"\u0005)\u0000\u0000\u0107\u010d\u0005M\u0000\u0000\u0108\u0109\u0005N"+
		"\u0000\u0000\u0109\u010d\u0005O\u0000\u0000\u010a\u010b\u0005P\u0000\u0000"+
		"\u010b\u010d\u0003N\'\u0000\u010c\u0105\u0001\u0000\u0000\u0000\u010c"+
		"\u0107\u0001\u0000\u0000\u0000\u010c\u0108\u0001\u0000\u0000\u0000\u010c"+
		"\u010a\u0001\u0000\u0000\u0000\u010d\u0011\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0005N\u0000\u0000\u010f\u0110\u0005O\u0000\u0000\u0110\u0111\u0005"+
		"d\u0000\u0000\u0111\u0112\u0003\u0014\n\u0000\u0112\u0113\u0005e\u0000"+
		"\u0000\u0113\u0125\u0001\u0000\u0000\u0000\u0114\u0115\u0005M\u0000\u0000"+
		"\u0115\u0116\u0005d\u0000\u0000\u0116\u0117\u0003\u0014\n\u0000\u0117"+
		"\u0118\u0005e\u0000\u0000\u0118\u0125\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0005Q\u0000\u0000\u011a\u011b\u0005O\u0000\u0000\u011b\u011c\u0005d"+
		"\u0000\u0000\u011c\u011d\u0003\u0014\n\u0000\u011d\u011e\u0005e\u0000"+
		"\u0000\u011e\u011f\u0005R\u0000\u0000\u011f\u0120\u0003@ \u0000\u0120"+
		"\u0121\u0005d\u0000\u0000\u0121\u0122\u0003\u0014\n\u0000\u0122\u0123"+
		"\u0005e\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u010e\u0001"+
		"\u0000\u0000\u0000\u0124\u0114\u0001\u0000\u0000\u0000\u0124\u0119\u0001"+
		"\u0000\u0000\u0000\u0125\u0013\u0001\u0000\u0000\u0000\u0126\u012b\u0005"+
		"\u0001\u0000\u0000\u0127\u0128\u0005a\u0000\u0000\u0128\u012a\u0005\u0001"+
		"\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000"+
		"\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000"+
		"\u0000\u0000\u012c\u0015\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000"+
		"\u0000\u0000\u012e\u0130\u00052\u0000\u0000\u012f\u0131\u0005M\u0000\u0000"+
		"\u0130\u012f\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000"+
		"\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0136\u0005S\u0000\u0000\u0133"+
		"\u0134\u0005\\\u0000\u0000\u0134\u0135\u0005%\u0000\u0000\u0135\u0137"+
		"\u0005]\u0000\u0000\u0136\u0133\u0001\u0000\u0000\u0000\u0136\u0137\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0005"+
		"\u0001\u0000\u0000\u0139\u013a\u0005\'\u0000\u0000\u013a\u013b\u0003@"+
		" \u0000\u013b\u013c\u0005d\u0000\u0000\u013c\u013d\u0003\u0014\n\u0000"+
		"\u013d\u013e\u0005e\u0000\u0000\u013e\u0017\u0001\u0000\u0000\u0000\u013f"+
		"\u0143\u00052\u0000\u0000\u0140\u0141\u0005\\\u0000\u0000\u0141\u0142"+
		"\u0005%\u0000\u0000\u0142\u0144\u0005]\u0000\u0000\u0143\u0140\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0005[\u0000\u0000\u0146\u0147\u0005\u0001\u0000"+
		"\u0000\u0147\u0019\u0001\u0000\u0000\u0000\u0148\u0149\u0005T\u0000\u0000"+
		"\u0149\u014c\u0007\u0000\u0000\u0000\u014a\u014b\u0005\\\u0000\u0000\u014b"+
		"\u014d\u0005]\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0005\u0001\u0000\u0000\u014f\u001b\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0005U\u0000\u0000\u0151\u0154\u0005L\u0000\u0000\u0152\u0153\u0005\\"+
		"\u0000\u0000\u0153\u0155\u0005]\u0000\u0000\u0154\u0152\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0003@ \u0000\u0157\u0158\u0003\u001e\u000f\u0000\u0158"+
		"\u001d\u0001\u0000\u0000\u0000\u0159\u015a\u0005Y\u0000\u0000\u015a\u015b"+
		"\u0005Z\u0000\u0000\u015b\u016c\u0003\u000e\u0007\u0000\u015c\u015d\u0005"+
		"T\u0000\u0000\u015d\u0160\u0005Z\u0000\u0000\u015e\u015f\u0005\\\u0000"+
		"\u0000\u015f\u0161\u0005]\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000"+
		"\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000"+
		"\u0162\u016c\u0005\u0001\u0000\u0000\u0163\u0164\u0005V\u0000\u0000\u0164"+
		"\u0165\u0005Z\u0000\u0000\u0165\u0166\u0005\u0001\u0000\u0000\u0166\u0167"+
		"\u0005X\u0000\u0000\u0167\u016c\u0005\u0001\u0000\u0000\u0168\u0169\u0005"+
		"Y\u0000\u0000\u0169\u016a\u0005W\u0000\u0000\u016a\u016c\u0003\u0012\t"+
		"\u0000\u016b\u0159\u0001\u0000\u0000\u0000\u016b\u015c\u0001\u0000\u0000"+
		"\u0000\u016b\u0163\u0001\u0000\u0000\u0000\u016b\u0168\u0001\u0000\u0000"+
		"\u0000\u016c\u001f\u0001\u0000\u0000\u0000\u016d\u016e\u0005o\u0000\u0000"+
		"\u016e\u016f\u0005p\u0000\u0000\u016f\u0174\u0003@ \u0000\u0170\u0171"+
		"\u0005d\u0000\u0000\u0171\u0172\u0003\u0014\n\u0000\u0172\u0173\u0005"+
		"e\u0000\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174\u0170\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0005q\u0000\u0000\u0177\u017c\u0003\"\u0011"+
		"\u0000\u0178\u0179\u0005a\u0000\u0000\u0179\u017b\u0003\"\u0011\u0000"+
		"\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000"+
		"\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000"+
		"\u017d\u018b\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0005o\u0000\u0000\u0180\u0181\u0005p\u0000\u0000\u0181\u0186"+
		"\u0003@ \u0000\u0182\u0183\u0005d\u0000\u0000\u0183\u0184\u0003\u0014"+
		"\n\u0000\u0184\u0185\u0005e\u0000\u0000\u0185\u0187\u0001\u0000\u0000"+
		"\u0000\u0186\u0182\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0003\u0002\u0001"+
		"\u0000\u0189\u018b\u0001\u0000\u0000\u0000\u018a\u016d\u0001\u0000\u0000"+
		"\u0000\u018a\u017f\u0001\u0000\u0000\u0000\u018b!\u0001\u0000\u0000\u0000"+
		"\u018c\u018d\u0005d\u0000\u0000\u018d\u0192\u0003*\u0015\u0000\u018e\u018f"+
		"\u0005a\u0000\u0000\u018f\u0191\u0003*\u0015\u0000\u0190\u018e\u0001\u0000"+
		"\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0195\u0001\u0000"+
		"\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0196\u0005e\u0000"+
		"\u0000\u0196#\u0001\u0000\u0000\u0000\u0197\u0198\u0005r\u0000\u0000\u0198"+
		"\u0199\u0003@ \u0000\u0199\u019a\u0005s\u0000\u0000\u019a\u019f\u0003"+
		"&\u0013\u0000\u019b\u019c\u0005a\u0000\u0000\u019c\u019e\u0003&\u0013"+
		"\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000\u0000"+
		"\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a4\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a3\u0005\u001c\u0000\u0000\u01a3\u01a5\u0003N\'\u0000"+
		"\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a5%\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005\u0001\u0000\u0000\u01a7"+
		"\u01a8\u0005f\u0000\u0000\u01a8\u01a9\u0003*\u0015\u0000\u01a9\'\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0005t\u0000\u0000\u01ab\u01ac\u0005\u001b"+
		"\u0000\u0000\u01ac\u01af\u0003@ \u0000\u01ad\u01ae\u0005\u001c\u0000\u0000"+
		"\u01ae\u01b0\u0003N\'\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b0)\u0001\u0000\u0000\u0000\u01b1\u01b6"+
		"\u0005^\u0000\u0000\u01b2\u01b6\u0005_\u0000\u0000\u01b3\u01b6\u0005)"+
		"\u0000\u0000\u01b4\u01b6\u0003N\'\u0000\u01b5\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b6+\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\u0005G\u0000\u0000\u01b8\u01b9\u0003N\'\u0000\u01b9\u01ba"+
		"\u0005J\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb\u01b7\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01c3\u0001"+
		"\u0000\u0000\u0000\u01bd\u01be\u0005H\u0000\u0000\u01be\u01bf\u0005I\u0000"+
		"\u0000\u01bf\u01c0\u0003N\'\u0000\u01c0\u01c1\u0005J\u0000\u0000\u01c1"+
		"\u01c2\u0005K\u0000\u0000\u01c2\u01c4\u0001\u0000\u0000\u0000\u01c3\u01bd"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4-\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c6\u0005\u001a\u0000\u0000\u01c6\u01cb\u0003"+
		"0\u0018\u0000\u01c7\u01c8\u0005a\u0000\u0000\u01c8\u01ca\u00030\u0018"+
		"\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cc/\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cf\u0005\u0001\u0000\u0000\u01cf\u01d0\u0005&\u0000\u0000\u01d0"+
		"\u01d1\u0005d\u0000\u0000\u01d1\u01d2\u0003\u0002\u0001\u0000\u01d2\u01d3"+
		"\u0005e\u0000\u0000\u01d31\u0001\u0000\u0000\u0000\u01d4\u01e3\u0005`"+
		"\u0000\u0000\u01d5\u01d6\u0003>\u001f\u0000\u01d6\u01d7\u0005c\u0000\u0000"+
		"\u01d7\u01d8\u0005`\u0000\u0000\u01d8\u01e3\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0003>\u001f\u0000\u01da\u01db\u0005c\u0000\u0000\u01db\u01dc\u0005"+
		"\u0001\u0000\u0000\u01dc\u01e3\u0001\u0000\u0000\u0000\u01dd\u01e3\u0005"+
		"\u0001\u0000\u0000\u01de\u01e3\u0003L&\u0000\u01df\u01e0\u0005\u0001\u0000"+
		"\u0000\u01e0\u01e1\u0005d\u0000\u0000\u01e1\u01e3\u0005e\u0000\u0000\u01e2"+
		"\u01d4\u0001\u0000\u0000\u0000\u01e2\u01d5\u0001\u0000\u0000\u0000\u01e2"+
		"\u01d9\u0001\u0000\u0000\u0000\u01e2\u01dd\u0001\u0000\u0000\u0000\u01e2"+
		"\u01de\u0001\u0000\u0000\u0000\u01e2\u01df\u0001\u0000\u0000\u0000\u01e3"+
		"3\u0001\u0000\u0000\u0000\u01e4\u01e7\u00036\u001b\u0000\u01e5\u01e7\u0003"+
		"8\u001c\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e75\u0001\u0000\u0000\u0000\u01e8\u01e9\u0003:\u001d\u0000"+
		"\u01e9\u01ea\u0003>\u001f\u0000\u01ea\u01eb\u0005\'\u0000\u0000\u01eb"+
		"\u01ec\u0003N\'\u0000\u01ec7\u0001\u0000\u0000\u0000\u01ed\u01ee\u0003"+
		"<\u001e\u0000\u01ee\u01ef\u0003>\u001f\u0000\u01ef9\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u00055\u0000\u0000\u01f1\u01fa\u00059\u0000\u0000\u01f2"+
		"\u01f3\u00056\u0000\u0000\u01f3\u01fa\u00059\u0000\u0000\u01f4\u01f5\u0005"+
		"7\u0000\u0000\u01f5\u01fa\u00059\u0000\u0000\u01f6\u01f7\u00058\u0000"+
		"\u0000\u01f7\u01fa\u00059\u0000\u0000\u01f8\u01fa\u00059\u0000\u0000\u01f9"+
		"\u01f0\u0001\u0000\u0000\u0000\u01f9\u01f2\u0001\u0000\u0000\u0000\u01f9"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f9\u01f6\u0001\u0000\u0000\u0000\u01f9"+
		"\u01f8\u0001\u0000\u0000\u0000\u01fa;\u0001\u0000\u0000\u0000\u01fb\u01fc"+
		"\u0005,\u0000\u0000\u01fc\u020a\u00059\u0000\u0000\u01fd\u01fe\u0005,"+
		"\u0000\u0000\u01fe\u01ff\u00055\u0000\u0000\u01ff\u020a\u00059\u0000\u0000"+
		"\u0200\u0201\u0005,\u0000\u0000\u0201\u0202\u00056\u0000\u0000\u0202\u020a"+
		"\u00059\u0000\u0000\u0203\u0204\u0005,\u0000\u0000\u0204\u0205\u00057"+
		"\u0000\u0000\u0205\u020a\u00059\u0000\u0000\u0206\u0207\u0005,\u0000\u0000"+
		"\u0207\u0208\u00058\u0000\u0000\u0208\u020a\u00059\u0000\u0000\u0209\u01fb"+
		"\u0001\u0000\u0000\u0000\u0209\u01fd\u0001\u0000\u0000\u0000\u0209\u0200"+
		"\u0001\u0000\u0000\u0000\u0209\u0203\u0001\u0000\u0000\u0000\u0209\u0206"+
		"\u0001\u0000\u0000\u0000\u020a=\u0001\u0000\u0000\u0000\u020b\u020d\u0003"+
		"@ \u0000\u020c\u020e\u0003B!\u0000\u020d\u020c\u0001\u0000\u0000\u0000"+
		"\u020d\u020e\u0001\u0000\u0000\u0000\u020e?\u0001\u0000\u0000\u0000\u020f"+
		"\u0210\u0005\u0001\u0000\u0000\u0210A\u0001\u0000\u0000\u0000\u0211\u0212"+
		"\u0005&\u0000\u0000\u0212\u0215\u0005\u0001\u0000\u0000\u0213\u0215\u0005"+
		"\u0001\u0000\u0000\u0214\u0211\u0001\u0000\u0000\u0000\u0214\u0213\u0001"+
		"\u0000\u0000\u0000\u0215C\u0001\u0000\u0000\u0000\u0216\u0217\u0005\u001d"+
		"\u0000\u0000\u0217\u0218\u0005\u001e\u0000\u0000\u0218\u021d\u0003F#\u0000"+
		"\u0219\u021a\u0005a\u0000\u0000\u021a\u021c\u0003F#\u0000\u021b\u0219"+
		"\u0001\u0000\u0000\u0000\u021c\u021f\u0001\u0000\u0000\u0000\u021d\u021b"+
		"\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u0222"+
		"\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\u0005\u001f\u0000\u0000\u0221\u0223\u0003N\'\u0000\u0222\u0220\u0001"+
		"\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223E\u0001\u0000"+
		"\u0000\u0000\u0224\u022b\u0005\u0001\u0000\u0000\u0225\u0226\u0003>\u001f"+
		"\u0000\u0226\u0227\u0005c\u0000\u0000\u0227\u0228\u0005\u0001\u0000\u0000"+
		"\u0228\u022b\u0001\u0000\u0000\u0000\u0229\u022b\u0003L&\u0000\u022a\u0224"+
		"\u0001\u0000\u0000\u0000\u022a\u0225\u0001\u0000\u0000\u0000\u022a\u0229"+
		"\u0001\u0000\u0000\u0000\u022bG\u0001\u0000\u0000\u0000\u022c\u022d\u0005"+
		" \u0000\u0000\u022d\u022e\u0005\u001e\u0000\u0000\u022e\u0233\u0003J%"+
		"\u0000\u022f\u0230\u0005a\u0000\u0000\u0230\u0232\u0003J%\u0000\u0231"+
		"\u022f\u0001\u0000\u0000\u0000\u0232\u0235\u0001\u0000\u0000\u0000\u0233"+
		"\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234"+
		"I\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0236\u0238"+
		"\u0005\u0001\u0000\u0000\u0237\u0239\u0007\u0001\u0000\u0000\u0238\u0237"+
		"\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u0241"+
		"\u0001\u0000\u0000\u0000\u023a\u023b\u0003>\u001f\u0000\u023b\u023c\u0005"+
		"c\u0000\u0000\u023c\u023e\u0005\u0001\u0000\u0000\u023d\u023f\u0007\u0001"+
		"\u0000\u0000\u023e\u023d\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000"+
		"\u0000\u0000\u023f\u0241\u0001\u0000\u0000\u0000\u0240\u0236\u0001\u0000"+
		"\u0000\u0000\u0240\u023a\u0001\u0000\u0000\u0000\u0241K\u0001\u0000\u0000"+
		"\u0000\u0242\u0243\u0005:\u0000\u0000\u0243\u0246\u0005d\u0000\u0000\u0244"+
		"\u0247\u0005`\u0000\u0000\u0245\u0247\u0003N\'\u0000\u0246\u0244\u0001"+
		"\u0000\u0000\u0000\u0246\u0245\u0001\u0000\u0000\u0000\u0247\u0248\u0001"+
		"\u0000\u0000\u0000\u0248\u028b\u0005e\u0000\u0000\u0249\u024a\u0005;\u0000"+
		"\u0000\u024a\u024b\u0005d\u0000\u0000\u024b\u024c\u0003N\'\u0000\u024c"+
		"\u024d\u0005e\u0000\u0000\u024d\u028b\u0001\u0000\u0000\u0000\u024e\u024f"+
		"\u0005<\u0000\u0000\u024f\u0250\u0005d\u0000\u0000\u0250\u0251\u0003N"+
		"\'\u0000\u0251\u0252\u0005e\u0000\u0000\u0252\u028b\u0001\u0000\u0000"+
		"\u0000\u0253\u0254\u0005=\u0000\u0000\u0254\u0255\u0005d\u0000\u0000\u0255"+
		"\u0256\u0003N\'\u0000\u0256\u0257\u0005e\u0000\u0000\u0257\u028b\u0001"+
		"\u0000\u0000\u0000\u0258\u0259\u0005>\u0000\u0000\u0259\u025a\u0005d\u0000"+
		"\u0000\u025a\u025b\u0003N\'\u0000\u025b\u025c\u0005e\u0000\u0000\u025c"+
		"\u028b\u0001\u0000\u0000\u0000\u025d\u025e\u0005?\u0000\u0000\u025e\u025f"+
		"\u0005d\u0000\u0000\u025f\u0260\u0003N\'\u0000\u0260\u0261\u0005e\u0000"+
		"\u0000\u0261\u028b\u0001\u0000\u0000\u0000\u0262\u0263\u0005@\u0000\u0000"+
		"\u0263\u0264\u0005d\u0000\u0000\u0264\u0265\u0003N\'\u0000\u0265\u0266"+
		"\u0005a\u0000\u0000\u0266\u0267\u0005^\u0000\u0000\u0267\u0268\u0005e"+
		"\u0000\u0000\u0268\u028b\u0001\u0000\u0000\u0000\u0269\u026a\u0005A\u0000"+
		"\u0000\u026a\u026b\u0005d\u0000\u0000\u026b\u026c\u0003N\'\u0000\u026c"+
		"\u026d\u0005e\u0000\u0000\u026d\u028b\u0001\u0000\u0000\u0000\u026e\u026f"+
		"\u0005B\u0000\u0000\u026f\u0270\u0005d\u0000\u0000\u0270\u0271\u0003N"+
		"\'\u0000\u0271\u0272\u0005e\u0000\u0000\u0272\u028b\u0001\u0000\u0000"+
		"\u0000\u0273\u0274\u0005C\u0000\u0000\u0274\u0275\u0005d\u0000\u0000\u0275"+
		"\u0276\u0003N\'\u0000\u0276\u0277\u0005e\u0000\u0000\u0277\u028b\u0001"+
		"\u0000\u0000\u0000\u0278\u0279\u0005D\u0000\u0000\u0279\u027a\u0005d\u0000"+
		"\u0000\u027a\u027b\u0003N\'\u0000\u027b\u027c\u0005e\u0000\u0000\u027c"+
		"\u028b\u0001\u0000\u0000\u0000\u027d\u027e\u0005E\u0000\u0000\u027e\u027f"+
		"\u0005d\u0000\u0000\u027f\u0280\u0003N\'\u0000\u0280\u0281\u0005e\u0000"+
		"\u0000\u0281\u028b\u0001\u0000\u0000\u0000\u0282\u0283\u0005F\u0000\u0000"+
		"\u0283\u0284\u0005d\u0000\u0000\u0284\u0285\u0003N\'\u0000\u0285\u0286"+
		"\u0005e\u0000\u0000\u0286\u028b\u0001\u0000\u0000\u0000\u0287\u0288\u0005"+
		"\u0001\u0000\u0000\u0288\u0289\u0005d\u0000\u0000\u0289\u028b\u0005e\u0000"+
		"\u0000\u028a\u0242\u0001\u0000\u0000\u0000\u028a\u0249\u0001\u0000\u0000"+
		"\u0000\u028a\u024e\u0001\u0000\u0000\u0000\u028a\u0253\u0001\u0000\u0000"+
		"\u0000\u028a\u0258\u0001\u0000\u0000\u0000\u028a\u025d\u0001\u0000\u0000"+
		"\u0000\u028a\u0262\u0001\u0000\u0000\u0000\u028a\u0269\u0001\u0000\u0000"+
		"\u0000\u028a\u026e\u0001\u0000\u0000\u0000\u028a\u0273\u0001\u0000\u0000"+
		"\u0000\u028a\u0278\u0001\u0000\u0000\u0000\u028a\u027d\u0001\u0000\u0000"+
		"\u0000\u028a\u0282\u0001\u0000\u0000\u0000\u028a\u0287\u0001\u0000\u0000"+
		"\u0000\u028bM\u0001\u0000\u0000\u0000\u028c\u028d\u0006\'\uffff\uffff"+
		"\u0000\u028d\u028e\u0005%\u0000\u0000\u028e\u02a9\u0003N\'\t\u028f\u02a9"+
		"\u0003P(\u0000\u0290\u0291\u0005\u0001\u0000\u0000\u0291\u0292\u0007\u0002"+
		"\u0000\u0000\u0292\u02a9\u0007\u0003\u0000\u0000\u0293\u0294\u0005\u0001"+
		"\u0000\u0000\u0294\u0296\u0005(\u0000\u0000\u0295\u0297\u0005%\u0000\u0000"+
		"\u0296\u0295\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000"+
		"\u0297\u0298\u0001\u0000\u0000\u0000\u0298\u02a9\u0005)\u0000\u0000\u0299"+
		"\u029a\u0005\u0001\u0000\u0000\u029a\u029b\u0005*\u0000\u0000\u029b\u02a9"+
		"\u0005^\u0000\u0000\u029c\u029d\u0005\u0001\u0000\u0000\u029d\u029e\u0005"+
		"+\u0000\u0000\u029e\u029f\u0003N\'\u0000\u029f\u02a0\u0005#\u0000\u0000"+
		"\u02a0\u02a1\u0003N\'\u0004\u02a1\u02a9\u0001\u0000\u0000\u0000\u02a2"+
		"\u02a3\u0005d\u0000\u0000\u02a3\u02a4\u0003\u0002\u0001\u0000\u02a4\u02a5"+
		"\u0005e\u0000\u0000\u02a5\u02a9\u0001\u0000\u0000\u0000\u02a6\u02a9\u0003"+
		"T*\u0000\u02a7\u02a9\u0003X,\u0000\u02a8\u028c\u0001\u0000\u0000\u0000"+
		"\u02a8\u028f\u0001\u0000\u0000\u0000\u02a8\u0290\u0001\u0000\u0000\u0000"+
		"\u02a8\u0293\u0001\u0000\u0000\u0000\u02a8\u0299\u0001\u0000\u0000\u0000"+
		"\u02a8\u029c\u0001\u0000\u0000\u0000\u02a8\u02a2\u0001\u0000\u0000\u0000"+
		"\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a8\u02a7\u0001\u0000\u0000\u0000"+
		"\u02a9\u02b2\u0001\u0000\u0000\u0000\u02aa\u02ab\n\u000b\u0000\u0000\u02ab"+
		"\u02ac\u0005#\u0000\u0000\u02ac\u02b1\u0003N\'\f\u02ad\u02ae\n\n\u0000"+
		"\u0000\u02ae\u02af\u0005$\u0000\u0000\u02af\u02b1\u0003N\'\u000b\u02b0"+
		"\u02aa\u0001\u0000\u0000\u0000\u02b0\u02ad\u0001\u0000\u0000\u0000\u02b1"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b2"+
		"\u02b3\u0001\u0000\u0000\u0000\u02b3O\u0001\u0000\u0000\u0000\u02b4\u02b2"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b6\u0006(\uffff\uffff\u0000\u02b6\u02b7"+
		"\u0003R)\u0000\u02b7\u02c6\u0001\u0000\u0000\u0000\u02b8\u02b9\n\u0005"+
		"\u0000\u0000\u02b9\u02ba\u0005l\u0000\u0000\u02ba\u02c5\u0003P(\u0006"+
		"\u02bb\u02bc\n\u0004\u0000\u0000\u02bc\u02bd\u0005m\u0000\u0000\u02bd"+
		"\u02c5\u0003P(\u0005\u02be\u02bf\n\u0003\u0000\u0000\u02bf\u02c0\u0005"+
		"`\u0000\u0000\u02c0\u02c5\u0003P(\u0004\u02c1\u02c2\n\u0002\u0000\u0000"+
		"\u02c2\u02c3\u0005n\u0000\u0000\u02c3\u02c5\u0003P(\u0003\u02c4\u02b8"+
		"\u0001\u0000\u0000\u0000\u02c4\u02bb\u0001\u0000\u0000\u0000\u02c4\u02be"+
		"\u0001\u0000\u0000\u0000\u02c4\u02c1\u0001\u0000\u0000\u0000\u02c5\u02c8"+
		"\u0001\u0000\u0000\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c6\u02c7"+
		"\u0001\u0000\u0000\u0000\u02c7Q\u0001\u0000\u0000\u0000\u02c8\u02c6\u0001"+
		"\u0000\u0000\u0000\u02c9\u02d0\u0005\u0001\u0000\u0000\u02ca\u02d0\u0005"+
		"_\u0000\u0000\u02cb\u02cc\u0005d\u0000\u0000\u02cc\u02cd\u0003P(\u0000"+
		"\u02cd\u02ce\u0005e\u0000\u0000\u02ce\u02d0\u0001\u0000\u0000\u0000\u02cf"+
		"\u02c9\u0001\u0000\u0000\u0000\u02cf\u02ca\u0001\u0000\u0000\u0000\u02cf"+
		"\u02cb\u0001\u0000\u0000\u0000\u02d0S\u0001\u0000\u0000\u0000\u02d1\u02d3"+
		"\u0005-\u0000\u0000\u02d2\u02d4\u0003V+\u0000\u02d3\u02d2\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d3\u0001\u0000"+
		"\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000\u0000\u02d6\u02dc\u0001\u0000"+
		"\u0000\u0000\u02d7\u02da\u00050\u0000\u0000\u02d8\u02db\u0003N\'\u0000"+
		"\u02d9\u02db\u0005)\u0000\u0000\u02da\u02d8\u0001\u0000\u0000\u0000\u02da"+
		"\u02d9\u0001\u0000\u0000\u0000\u02db\u02dd\u0001\u0000\u0000\u0000\u02dc"+
		"\u02d7\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd"+
		"\u02de\u0001\u0000\u0000\u0000\u02de\u02df\u00051\u0000\u0000\u02dfU\u0001"+
		"\u0000\u0000\u0000\u02e0\u02e1\u0005.\u0000\u0000\u02e1\u02e2\u0003N\'"+
		"\u0000\u02e2\u02e3\u0005/\u0000\u0000\u02e3\u02e4\u0003N\'\u0000\u02e4"+
		"W\u0001\u0000\u0000\u0000\u02e5\u02e6\u0005\u0001\u0000\u0000\u02e6\u02ef"+
		"\u0005d\u0000\u0000\u02e7\u02ec\u0003Z-\u0000\u02e8\u02e9\u0005a\u0000"+
		"\u0000\u02e9\u02eb\u0003Z-\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02eb"+
		"\u02ee\u0001\u0000\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ec"+
		"\u02ed\u0001\u0000\u0000\u0000\u02ed\u02f0\u0001\u0000\u0000\u0000\u02ee"+
		"\u02ec\u0001\u0000\u0000\u0000\u02ef\u02e7\u0001\u0000\u0000\u0000\u02ef"+
		"\u02f0\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1"+
		"\u02f2\u0005e\u0000\u0000\u02f2Y\u0001\u0000\u0000\u0000\u02f3\u02f4\u0003"+
		"N\'\u0000\u02f4[\u0001\u0000\u0000\u0000@z~\u0087\u008a\u0091\u0096\u0099"+
		"\u009c\u00a3\u00d5\u00de\u00e7\u00f1\u00f8\u0102\u010c\u0124\u012b\u0130"+
		"\u0136\u0143\u014c\u0154\u0160\u016b\u0174\u017c\u0186\u018a\u0192\u019f"+
		"\u01a4\u01af\u01b5\u01bb\u01c3\u01cb\u01e2\u01e6\u01f9\u0209\u020d\u0214"+
		"\u021d\u0222\u022a\u0233\u0238\u023e\u0240\u0246\u028a\u0296\u02a8\u02b0"+
		"\u02b2\u02c4\u02c6\u02cf\u02d5\u02da\u02dc\u02ec\u02ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}