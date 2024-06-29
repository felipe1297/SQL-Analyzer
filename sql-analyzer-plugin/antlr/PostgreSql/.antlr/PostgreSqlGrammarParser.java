// Generated from /home/feriano/Documentos/Felipe/F/UNAL/Lenguajes/Repos/SQL-Analyzer/sql-analyzer-plugin/antlr/PostgreSql/PostgreSqlGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PostgreSqlGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARCHAR=1, INT=2, NUMERIC=3, TEXT=4, DATE=5, TIMESTAMP=6, BOOL=7, SERIAL=8, 
		BIGSERIAL=9, UUID=10, JSON=11, JSONB=12, BYTEA=13, FLOAT=14, REAL=15, 
		DOUBLE=16, DECIMAL=17, MONEY=18, SMALLINT=19, BIGINT=20, CHAR=21, BIT=22, 
		INTERVAL=23, AUTOINCREMENT=24, SELECT=25, WITH=26, FROM=27, WHERE=28, 
		GROUP=29, BY=30, HAVING=31, ORDER=32, ASC=33, DESC=34, AND=35, OR=36, 
		NOT=37, AS=38, ON=39, IS=40, NULL=41, LIKE=42, BETWEEN=43, NATURAL=44, 
		CASE=45, WHEN=46, THEN=47, ELSE=48, END=49, CREATE=50, FUNCTION=51, RETURNS=52, 
		INNER=53, LEFT=54, RIGHT=55, FULL=56, JOIN=57, COUNT=58, SUM=59, AVG=60, 
		MIN=61, MAX=62, ARRAY_AGG=63, STRING_AGG=64, BOOL_AND=65, BOOL_OR=66, 
		VAR_POP=67, VAR_SAMP=68, STDDEV_POP=69, STDDEV_SAMP=70, OFFSET=71, FETCH=72, 
		FIRST=73, ROWS=74, ONLY=75, DISTINCT=76, TABLE=77, UNIQUE=78, PRIMARY=79, 
		KEY=80, DEFAULT=81, FOREIGN=82, REFERENCES=83, INDEX=84, DROP=85, ALTER=86, 
		RENAME=87, CONSTRAINT=88, TO=89, ADD=90, COLUMN=91, DATABASE=92, IF=93, 
		EXISTS=94, STRING=95, NUMBER=96, STAR=97, COMMA=98, SEMI=99, DOT=100, 
		LPAREN=101, RPAREN=102, EQ=103, NEQ=104, LT=105, LTE=106, GT=107, GTE=108, 
		PLUS=109, MINUS=110, SLASH=111, INSERT=112, INTO=113, VALUES=114, UPDATE=115, 
		SET=116, DELETE=117, LINE_COMMENT=118, BLOCK_COMMENT=119, WS=120, ID=121;
	public static final int
		RULE_initial = 0, RULE_sql_stmt = 1, RULE_select_stmt = 2, RULE_function_stmt = 3, 
		RULE_data_type = 4, RULE_function_params = 5, RULE_func_body = 6, RULE_create_table_stmt = 7, 
		RULE_column_def = 8, RULE_column_constraint = 9, RULE_table_constraint = 10, 
		RULE_column_list = 11, RULE_create_index_stmt = 12, RULE_create_database_stmt = 13, 
		RULE_drop_stmt = 14, RULE_alter_table_stmt = 15, RULE_alter_table_action = 16, 
		RULE_insert_stmt = 17, RULE_insert_values = 18, RULE_update_stmt = 19, 
		RULE_update_assignment = 20, RULE_delete_stmt = 21, RULE_value = 22, RULE_limit_offset_clause = 23, 
		RULE_with_clause = 24, RULE_cte = 25, RULE_result_column = 26, RULE_join_clause = 27, 
		RULE_standard_join = 28, RULE_natural_join = 29, RULE_join_type = 30, 
		RULE_natural_join_type = 31, RULE_table_reference = 32, RULE_table_name = 33, 
		RULE_alias = 34, RULE_group_by_clause = 35, RULE_group_by_item = 36, RULE_order_by_clause = 37, 
		RULE_order_by_item = 38, RULE_agg_func = 39, RULE_expr = 40, RULE_arith_expr = 41, 
		RULE_atom = 42, RULE_case_expr = 43, RULE_when_clause = 44, RULE_function_call = 45, 
		RULE_function_arg = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"initial", "sql_stmt", "select_stmt", "function_stmt", "data_type", "function_params", 
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'*'", "','", "';'", "'.'", "'('", "')'", "'='", "'!='", "'<'", 
			"'<='", "'>'", "'>='", "'+'", "'-'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VARCHAR", "INT", "NUMERIC", "TEXT", "DATE", "TIMESTAMP", "BOOL", 
			"SERIAL", "BIGSERIAL", "UUID", "JSON", "JSONB", "BYTEA", "FLOAT", "REAL", 
			"DOUBLE", "DECIMAL", "MONEY", "SMALLINT", "BIGINT", "CHAR", "BIT", "INTERVAL", 
			"AUTOINCREMENT", "SELECT", "WITH", "FROM", "WHERE", "GROUP", "BY", "HAVING", 
			"ORDER", "ASC", "DESC", "AND", "OR", "NOT", "AS", "ON", "IS", "NULL", 
			"LIKE", "BETWEEN", "NATURAL", "CASE", "WHEN", "THEN", "ELSE", "END", 
			"CREATE", "FUNCTION", "RETURNS", "INNER", "LEFT", "RIGHT", "FULL", "JOIN", 
			"COUNT", "SUM", "AVG", "MIN", "MAX", "ARRAY_AGG", "STRING_AGG", "BOOL_AND", 
			"BOOL_OR", "VAR_POP", "VAR_SAMP", "STDDEV_POP", "STDDEV_SAMP", "OFFSET", 
			"FETCH", "FIRST", "ROWS", "ONLY", "DISTINCT", "TABLE", "UNIQUE", "PRIMARY", 
			"KEY", "DEFAULT", "FOREIGN", "REFERENCES", "INDEX", "DROP", "ALTER", 
			"RENAME", "CONSTRAINT", "TO", "ADD", "COLUMN", "DATABASE", "IF", "EXISTS", 
			"STRING", "NUMBER", "STAR", "COMMA", "SEMI", "DOT", "LPAREN", "RPAREN", 
			"EQ", "NEQ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "SLASH", "INSERT", 
			"INTO", "VALUES", "UPDATE", "SET", "DELETE", "LINE_COMMENT", "BLOCK_COMMENT", 
			"WS", "ID"
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
	public String getGrammarFileName() { return "PostgreSqlGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PostgreSqlGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitialContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public InitialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial; }
	}

	public final InitialContext initial() throws RecognitionException {
		InitialContext _localctx = new InitialContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_initial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			sql_stmt();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900007505920L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 5502926851L) != 0)) {
				{
				{
				setState(95);
				sql_stmt();
				}
				}
				setState(100);
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
	public static class Sql_stmtContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PostgreSqlGrammarParser.SEMI, 0); }
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
		enterRule(_localctx, 2, RULE_sql_stmt);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				select_stmt();
				setState(102);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				function_stmt();
				setState(105);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				create_table_stmt();
				setState(108);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				create_index_stmt();
				setState(111);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				create_database_stmt();
				setState(114);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				drop_stmt();
				setState(117);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				alter_table_stmt();
				setState(120);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(122);
				insert_stmt();
				setState(123);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(125);
				update_stmt();
				setState(126);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(128);
				delete_stmt();
				setState(129);
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
		public TerminalNode SELECT() { return getToken(PostgreSqlGrammarParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(PostgreSqlGrammarParser.FROM, 0); }
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public TerminalNode STAR() { return getToken(PostgreSqlGrammarParser.STAR, 0); }
		public TerminalNode WITH() { return getToken(PostgreSqlGrammarParser.WITH, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(PostgreSqlGrammarParser.DISTINCT, 0); }
		public List<Join_clauseContext> join_clause() {
			return getRuleContexts(Join_clauseContext.class);
		}
		public Join_clauseContext join_clause(int i) {
			return getRuleContext(Join_clauseContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(PostgreSqlGrammarParser.WHERE, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(PostgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSqlGrammarParser.COMMA, i);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(133);
				match(WITH);
				setState(134);
				with_clause();
				}
			}

			setState(137);
			match(SELECT);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(138);
				match(DISTINCT);
				}
			}

			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(141);
				match(STAR);
				}
				break;
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case ARRAY_AGG:
			case STRING_AGG:
			case BOOL_AND:
			case BOOL_OR:
			case VAR_POP:
			case VAR_SAMP:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case LPAREN:
			case ID:
				{
				{
				setState(142);
				result_column();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(143);
					match(COMMA);
					setState(144);
					result_column();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(152);
			match(FROM);
			setState(153);
			table_reference();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 279240769083015168L) != 0)) {
				{
				{
				setState(154);
				join_clause();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(160);
				match(WHERE);
				setState(161);
				expr(0);
				}
			}

			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(164);
				group_by_clause();
				}
			}

			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(167);
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
		public TerminalNode CREATE() { return getToken(PostgreSqlGrammarParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(PostgreSqlGrammarParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(PostgreSqlGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostgreSqlGrammarParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(PostgreSqlGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PostgreSqlGrammarParser.RPAREN, 0); }
		public TerminalNode RETURNS() { return getToken(PostgreSqlGrammarParser.RETURNS, 0); }
		public TerminalNode AS() { return getToken(PostgreSqlGrammarParser.AS, 0); }
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
		enterRule(_localctx, 6, RULE_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(CREATE);
			setState(171);
			match(FUNCTION);
			setState(172);
			match(ID);
			setState(173);
			match(LPAREN);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(174);
				function_params();
				}
			}

			setState(177);
			match(RPAREN);
			setState(178);
			match(RETURNS);
			setState(179);
			match(ID);
			setState(180);
			match(AS);
			setState(181);
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
		public TerminalNode VARCHAR() { return getToken(PostgreSqlGrammarParser.VARCHAR, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSqlGrammarParser.LPAREN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(PostgreSqlGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PostgreSqlGrammarParser.NUMBER, i);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSqlGrammarParser.RPAREN, 0); }
		public TerminalNode INT() { return getToken(PostgreSqlGrammarParser.INT, 0); }
		public TerminalNode NUMERIC() { return getToken(PostgreSqlGrammarParser.NUMERIC, 0); }
		public TerminalNode COMMA() { return getToken(PostgreSqlGrammarParser.COMMA, 0); }
		public TerminalNode TEXT() { return getToken(PostgreSqlGrammarParser.TEXT, 0); }
		public TerminalNode DATE() { return getToken(PostgreSqlGrammarParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(PostgreSqlGrammarParser.TIMESTAMP, 0); }
		public TerminalNode BOOL() { return getToken(PostgreSqlGrammarParser.BOOL, 0); }
		public TerminalNode SERIAL() { return getToken(PostgreSqlGrammarParser.SERIAL, 0); }
		public TerminalNode BIGSERIAL() { return getToken(PostgreSqlGrammarParser.BIGSERIAL, 0); }
		public TerminalNode UUID() { return getToken(PostgreSqlGrammarParser.UUID, 0); }
		public TerminalNode JSON() { return getToken(PostgreSqlGrammarParser.JSON, 0); }
		public TerminalNode JSONB() { return getToken(PostgreSqlGrammarParser.JSONB, 0); }
		public TerminalNode BYTEA() { return getToken(PostgreSqlGrammarParser.BYTEA, 0); }
		public TerminalNode FLOAT() { return getToken(PostgreSqlGrammarParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(PostgreSqlGrammarParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(PostgreSqlGrammarParser.DOUBLE, 0); }
		public TerminalNode DECIMAL() { return getToken(PostgreSqlGrammarParser.DECIMAL, 0); }
		public TerminalNode MONEY() { return getToken(PostgreSqlGrammarParser.MONEY, 0); }
		public TerminalNode SMALLINT() { return getToken(PostgreSqlGrammarParser.SMALLINT, 0); }
		public TerminalNode BIGINT() { return getToken(PostgreSqlGrammarParser.BIGINT, 0); }
		public TerminalNode CHAR() { return getToken(PostgreSqlGrammarParser.CHAR, 0); }
		public TerminalNode BIT() { return getToken(PostgreSqlGrammarParser.BIT, 0); }
		public TerminalNode INTERVAL() { return getToken(PostgreSqlGrammarParser.INTERVAL, 0); }
		public TerminalNode AUTOINCREMENT() { return getToken(PostgreSqlGrammarParser.AUTOINCREMENT, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_data_type);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(VARCHAR);
				setState(184);
				match(LPAREN);
				setState(185);
				match(NUMBER);
				setState(186);
				match(RPAREN);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(INT);
				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(NUMERIC);
				setState(189);
				match(LPAREN);
				setState(190);
				match(NUMBER);
				setState(191);
				match(COMMA);
				setState(192);
				match(NUMBER);
				setState(193);
				match(RPAREN);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(TEXT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				match(TIMESTAMP);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 7);
				{
				setState(197);
				match(BOOL);
				}
				break;
			case SERIAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(198);
				match(SERIAL);
				}
				break;
			case BIGSERIAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(199);
				match(BIGSERIAL);
				}
				break;
			case UUID:
				enterOuterAlt(_localctx, 10);
				{
				setState(200);
				match(UUID);
				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 11);
				{
				setState(201);
				match(JSON);
				}
				break;
			case JSONB:
				enterOuterAlt(_localctx, 12);
				{
				setState(202);
				match(JSONB);
				}
				break;
			case BYTEA:
				enterOuterAlt(_localctx, 13);
				{
				setState(203);
				match(BYTEA);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 14);
				{
				setState(204);
				match(FLOAT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 15);
				{
				setState(205);
				match(REAL);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 16);
				{
				setState(206);
				match(DOUBLE);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 17);
				{
				setState(207);
				match(DECIMAL);
				setState(208);
				match(LPAREN);
				setState(209);
				match(NUMBER);
				setState(210);
				match(COMMA);
				setState(211);
				match(NUMBER);
				setState(212);
				match(RPAREN);
				}
				break;
			case MONEY:
				enterOuterAlt(_localctx, 18);
				{
				setState(213);
				match(MONEY);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 19);
				{
				setState(214);
				match(SMALLINT);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 20);
				{
				setState(215);
				match(BIGINT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 21);
				{
				setState(216);
				match(CHAR);
				setState(217);
				match(LPAREN);
				setState(218);
				match(NUMBER);
				setState(219);
				match(RPAREN);
				}
				break;
			case BIT:
				enterOuterAlt(_localctx, 22);
				{
				setState(220);
				match(BIT);
				setState(221);
				match(LPAREN);
				setState(222);
				match(NUMBER);
				setState(223);
				match(RPAREN);
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 23);
				{
				setState(224);
				match(INTERVAL);
				}
				break;
			case AUTOINCREMENT:
				enterOuterAlt(_localctx, 24);
				{
				setState(225);
				match(AUTOINCREMENT);
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
		public List<TerminalNode> ID() { return getTokens(PostgreSqlGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostgreSqlGrammarParser.ID, i);
		}
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSqlGrammarParser.COMMA, i);
		}
		public Function_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_params; }
	}

	public final Function_paramsContext function_params() throws RecognitionException {
		Function_paramsContext _localctx = new Function_paramsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ID);
			setState(229);
			data_type();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(230);
				match(COMMA);
				setState(231);
				match(ID);
				setState(232);
				data_type();
				}
				}
				setState(237);
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
		enterRule(_localctx, 12, RULE_func_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		public TerminalNode CREATE() { return getToken(PostgreSqlGrammarParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSqlGrammarParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PostgreSqlGrammarParser.LPAREN, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSqlGrammarParser.RPAREN, 0); }
		public TerminalNode IF() { return getToken(PostgreSqlGrammarParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSqlGrammarParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSqlGrammarParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSqlGrammarParser.COMMA, i);
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
		enterRule(_localctx, 14, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(CREATE);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(241);
				match(IF);
				setState(242);
				match(NOT);
				setState(243);
				match(EXISTS);
				}
			}

			setState(246);
			match(TABLE);
			setState(247);
			table_name();
			setState(248);
			match(LPAREN);
			setState(249);
			column_def();
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
					match(COMMA);
					setState(251);
					column_def();
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(257);
				match(COMMA);
				setState(258);
				table_constraint();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
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
		public TerminalNode ID() { return getToken(PostgreSqlGrammarParser.ID, 0); }
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
		enterRule(_localctx, 16, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(ID);
			setState(267);
			data_type();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 24189255811073L) != 0)) {
				{
				{
				setState(268);
				column_constraint();
				}
				}
				setState(273);
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
		public TerminalNode NOT() { return getToken(PostgreSqlGrammarParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(PostgreSqlGrammarParser.NULL, 0); }
		public TerminalNode UNIQUE() { return getToken(PostgreSqlGrammarParser.UNIQUE, 0); }
		public TerminalNode PRIMARY() { return getToken(PostgreSqlGrammarParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(PostgreSqlGrammarParser.KEY, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSqlGrammarParser.DEFAULT, 0); }
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
		enterRule(_localctx, 18, RULE_column_constraint);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(NOT);
				setState(275);
				match(NULL);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(UNIQUE);
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(PRIMARY);
				setState(278);
				match(KEY);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				match(DEFAULT);
				setState(280);
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
		public TerminalNode PRIMARY() { return getToken(PostgreSqlGrammarParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(PostgreSqlGrammarParser.KEY, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(PostgreSqlGrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(PostgreSqlGrammarParser.LPAREN, i);
		}
		public List<Column_listContext> column_list() {
			return getRuleContexts(Column_listContext.class);
		}
		public Column_listContext column_list(int i) {
			return getRuleContext(Column_listContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(PostgreSqlGrammarParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PostgreSqlGrammarParser.RPAREN, i);
		}
		public TerminalNode UNIQUE() { return getToken(PostgreSqlGrammarParser.UNIQUE, 0); }
		public TerminalNode FOREIGN() { return getToken(PostgreSqlGrammarParser.FOREIGN, 0); }
		public TerminalNode REFERENCES() { return getToken(PostgreSqlGrammarParser.REFERENCES, 0); }
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
		enterRule(_localctx, 20, RULE_table_constraint);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(PRIMARY);
				setState(284);
				match(KEY);
				setState(285);
				match(LPAREN);
				setState(286);
				column_list();
				setState(287);
				match(RPAREN);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(UNIQUE);
				setState(290);
				match(LPAREN);
				setState(291);
				column_list();
				setState(292);
				match(RPAREN);
				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(FOREIGN);
				setState(295);
				match(KEY);
				setState(296);
				match(LPAREN);
				setState(297);
				column_list();
				setState(298);
				match(RPAREN);
				setState(299);
				match(REFERENCES);
				setState(300);
				table_name();
				setState(301);
				match(LPAREN);
				setState(302);
				column_list();
				setState(303);
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
		public List<TerminalNode> ID() { return getTokens(PostgreSqlGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostgreSqlGrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSqlGrammarParser.COMMA, i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(ID);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(308);
				match(COMMA);
				setState(309);
				match(ID);
				}
				}
				setState(314);
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
		public TerminalNode CREATE() { return getToken(PostgreSqlGrammarParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSqlGrammarParser.INDEX, 0); }
		public TerminalNode ID() { return getToken(PostgreSqlGrammarParser.ID, 0); }
		public TerminalNode ON() { return getToken(PostgreSqlGrammarParser.ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PostgreSqlGrammarParser.LPAREN, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSqlGrammarParser.RPAREN, 0); }
		public TerminalNode UNIQUE() { return getToken(PostgreSqlGrammarParser.UNIQUE, 0); }
		public TerminalNode IF() { return getToken(PostgreSqlGrammarParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSqlGrammarParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSqlGrammarParser.EXISTS, 0); }
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(CREATE);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(316);
				match(UNIQUE);
				}
			}

			setState(319);
			match(INDEX);
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
			match(ID);
			setState(326);
			match(ON);
			setState(327);
			table_name();
			setState(328);
			match(LPAREN);
			setState(329);
			column_list();
			setState(330);
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
		public TerminalNode CREATE() { return getToken(PostgreSqlGrammarParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(PostgreSqlGrammarParser.DATABASE, 0); }
		public TerminalNode ID() { return getToken(PostgreSqlGrammarParser.ID, 0); }
		public TerminalNode IF() { return getToken(PostgreSqlGrammarParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSqlGrammarParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSqlGrammarParser.EXISTS, 0); }
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt; }
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_database_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(CREATE);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(333);
				match(IF);
				setState(334);
				match(NOT);
				setState(335);
				match(EXISTS);
				}
			}

			setState(338);
			match(DATABASE);
			setState(339);
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
		public TerminalNode DROP() { return getToken(PostgreSqlGrammarParser.DROP, 0); }
		public TerminalNode ID() { return getToken(PostgreSqlGrammarParser.ID, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSqlGrammarParser.TABLE, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSqlGrammarParser.INDEX, 0); }
		public TerminalNode DATABASE() { return getToken(PostgreSqlGrammarParser.DATABASE, 0); }
		public TerminalNode FUNCTION() { return getToken(PostgreSqlGrammarParser.FUNCTION, 0); }
		public TerminalNode IF() { return getToken(PostgreSqlGrammarParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSqlGrammarParser.EXISTS, 0); }
		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmt; }
	}

	public final Drop_stmtContext drop_stmt() throws RecognitionException {
		Drop_stmtContext _localctx = new Drop_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_drop_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(DROP);
			setState(342);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 2207680299009L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(343);
				match(IF);
				setState(344);
				match(EXISTS);
				}
			}

			setState(347);
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
		public TerminalNode ALTER() { return getToken(PostgreSqlGrammarParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSqlGrammarParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Alter_table_actionContext alter_table_action() {
			return getRuleContext(Alter_table_actionContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSqlGrammarParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSqlGrammarParser.EXISTS, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(ALTER);
			setState(350);
			match(TABLE);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(351);
				match(IF);
				setState(352);
				match(EXISTS);
				}
			}

			setState(355);
			table_name();
			setState(356);
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
		public TerminalNode ADD() { return getToken(PostgreSqlGrammarParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(PostgreSqlGrammarParser.COLUMN, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public TerminalNode DROP() { return getToken(PostgreSqlGrammarParser.DROP, 0); }
		public List<TerminalNode> ID() { return getTokens(PostgreSqlGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostgreSqlGrammarParser.ID, i);
		}
		public TerminalNode IF() { return getToken(PostgreSqlGrammarParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSqlGrammarParser.EXISTS, 0); }
		public TerminalNode RENAME() { return getToken(PostgreSqlGrammarParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PostgreSqlGrammarParser.TO, 0); }
		public TerminalNode CONSTRAINT() { return getToken(PostgreSqlGrammarParser.CONSTRAINT, 0); }
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
		enterRule(_localctx, 32, RULE_alter_table_action);
		int _la;
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(ADD);
				setState(359);
				match(COLUMN);
				setState(360);
				column_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(DROP);
				setState(362);
				match(COLUMN);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(363);
					match(IF);
					setState(364);
					match(EXISTS);
					}
				}

				setState(367);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				match(RENAME);
				setState(369);
				match(COLUMN);
				setState(370);
				match(ID);
				setState(371);
				match(TO);
				setState(372);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				match(ADD);
				setState(374);
				match(CONSTRAINT);
				setState(375);
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
		public TerminalNode INSERT() { return getToken(PostgreSqlGrammarParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(PostgreSqlGrammarParser.INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(PostgreSqlGrammarParser.VALUES, 0); }
		public List<Insert_valuesContext> insert_values() {
			return getRuleContexts(Insert_valuesContext.class);
		}
		public Insert_valuesContext insert_values(int i) {
			return getRuleContext(Insert_valuesContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(PostgreSqlGrammarParser.LPAREN, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSqlGrammarParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSqlGrammarParser.COMMA, i);
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
		enterRule(_localctx, 34, RULE_insert_stmt);
		int _la;
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(INSERT);
				setState(379);
				match(INTO);
				setState(380);
				table_name();
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(381);
					match(LPAREN);
					setState(382);
					column_list();
					setState(383);
					match(RPAREN);
					}
				}

				setState(387);
				match(VALUES);
				setState(388);
				insert_values();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(389);
					match(COMMA);
					setState(390);
					insert_values();
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(INSERT);
				setState(397);
				match(INTO);
				setState(398);
				table_name();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(399);
					match(LPAREN);
					setState(400);
					column_list();
					setState(401);
					match(RPAREN);
					}
				}

				setState(405);
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
		public TerminalNode LPAREN() { return getToken(PostgreSqlGrammarParser.LPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSqlGrammarParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSqlGrammarParser.COMMA, i);
		}
		public Insert_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_values; }
	}

	public final Insert_valuesContext insert_values() throws RecognitionException {
		Insert_valuesContext _localctx = new Insert_valuesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_insert_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(LPAREN);
			setState(410);
			value();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(411);
				match(COMMA);
				setState(412);
				value();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
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
		public TerminalNode UPDATE() { return getToken(PostgreSqlGrammarParser.UPDATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode SET() { return getToken(PostgreSqlGrammarParser.SET, 0); }
		public List<Update_assignmentContext> update_assignment() {
			return getRuleContexts(Update_assignmentContext.class);
		}
		public Update_assignmentContext update_assignment(int i) {
			return getRuleContext(Update_assignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSqlGrammarParser.COMMA, i);
		}
		public TerminalNode WHERE() { return getToken(PostgreSqlGrammarParser.WHERE, 0); }
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
		enterRule(_localctx, 38, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(UPDATE);
			setState(421);
			table_name();
			setState(422);
			match(SET);
			setState(423);
			update_assignment();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(424);
				match(COMMA);
				setState(425);
				update_assignment();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(431);
				match(WHERE);
				setState(432);
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
		public TerminalNode ID() { return getToken(PostgreSqlGrammarParser.ID, 0); }
		public TerminalNode EQ() { return getToken(PostgreSqlGrammarParser.EQ, 0); }
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
		enterRule(_localctx, 40, RULE_update_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(ID);
			setState(436);
			match(EQ);
			setState(437);
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
		public TerminalNode DELETE() { return getToken(PostgreSqlGrammarParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(PostgreSqlGrammarParser.FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(PostgreSqlGrammarParser.WHERE, 0); }
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
		enterRule(_localctx, 42, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(DELETE);
			setState(440);
			match(FROM);
			setState(441);
			table_name();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(442);
				match(WHERE);
				setState(443);
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
		public TerminalNode STRING() { return getToken(PostgreSqlGrammarParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(PostgreSqlGrammarParser.NUMBER, 0); }
		public TerminalNode NULL() { return getToken(PostgreSqlGrammarParser.NULL, 0); }
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
		enterRule(_localctx, 44, RULE_value);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
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
		public TerminalNode OFFSET() { return getToken(PostgreSqlGrammarParser.OFFSET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ROWS() { return getTokens(PostgreSqlGrammarParser.ROWS); }
		public TerminalNode ROWS(int i) {
			return getToken(PostgreSqlGrammarParser.ROWS, i);
		}
		public TerminalNode FETCH() { return getToken(PostgreSqlGrammarParser.FETCH, 0); }
		public TerminalNode FIRST() { return getToken(PostgreSqlGrammarParser.FIRST, 0); }
		public TerminalNode ONLY() { return getToken(PostgreSqlGrammarParser.ONLY, 0); }
		public Limit_offset_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_offset_clause; }
	}

	public final Limit_offset_clauseContext limit_offset_clause() throws RecognitionException {
		Limit_offset_clauseContext _localctx = new Limit_offset_clauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_limit_offset_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(452);
				match(OFFSET);
				setState(453);
				expr(0);
				setState(454);
				match(ROWS);
				}
			}

			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FETCH) {
				{
				setState(458);
				match(FETCH);
				setState(459);
				match(FIRST);
				setState(460);
				expr(0);
				setState(461);
				match(ROWS);
				setState(462);
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
		public TerminalNode WITH() { return getToken(PostgreSqlGrammarParser.WITH, 0); }
		public List<CteContext> cte() {
			return getRuleContexts(CteContext.class);
		}
		public CteContext cte(int i) {
			return getRuleContext(CteContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSqlGrammarParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(WITH);
			setState(467);
			cte();
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(468);
				match(COMMA);
				setState(469);
				cte();
				}
				}
				setState(474);
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
		public TerminalNode ID() { return getToken(PostgreSqlGrammarParser.ID, 0); }
		public TerminalNode AS() { return getToken(PostgreSqlGrammarParser.AS, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSqlGrammarParser.LPAREN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSqlGrammarParser.RPAREN, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(ID);
			setState(476);
			match(AS);
			setState(477);
			match(LPAREN);
			setState(478);
			select_stmt();
			setState(479);
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
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PostgreSqlGrammarParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(PostgreSqlGrammarParser.STAR, 0); }
		public TerminalNode ID() { return getToken(PostgreSqlGrammarParser.ID, 0); }
		public Agg_funcContext agg_func() {
			return getRuleContext(Agg_funcContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PostgreSqlGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PostgreSqlGrammarParser.RPAREN, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_result_column);
		try {
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				table_reference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				table_reference();
				setState(483);
				match(DOT);
				setState(484);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				table_reference();
				setState(487);
				match(DOT);
				setState(488);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(490);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(491);
				agg_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(492);
				match(ID);
				setState(493);
				match(LPAREN);
				setState(494);
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
		enterRule(_localctx, 54, RULE_join_clause);
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				standard_join();
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
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
		public TerminalNode ON() { return getToken(PostgreSqlGrammarParser.ON, 0); }
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
		enterRule(_localctx, 56, RULE_standard_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			join_type();
			setState(502);
			table_reference();
			setState(503);
			match(ON);
			setState(504);
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
		enterRule(_localctx, 58, RULE_natural_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			natural_join_type();
			setState(507);
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
		public TerminalNode INNER() { return getToken(PostgreSqlGrammarParser.INNER, 0); }
		public TerminalNode JOIN() { return getToken(PostgreSqlGrammarParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(PostgreSqlGrammarParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(PostgreSqlGrammarParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(PostgreSqlGrammarParser.FULL, 0); }
		public Join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_type; }
	}

	public final Join_typeContext join_type() throws RecognitionException {
		Join_typeContext _localctx = new Join_typeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_join_type);
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(INNER);
				setState(510);
				match(JOIN);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				match(LEFT);
				setState(512);
				match(JOIN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				match(RIGHT);
				setState(514);
				match(JOIN);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(515);
				match(FULL);
				setState(516);
				match(JOIN);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(517);
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
		public TerminalNode NATURAL() { return getToken(PostgreSqlGrammarParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(PostgreSqlGrammarParser.JOIN, 0); }
		public TerminalNode INNER() { return getToken(PostgreSqlGrammarParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(PostgreSqlGrammarParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(PostgreSqlGrammarParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(PostgreSqlGrammarParser.FULL, 0); }
		public Natural_join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natural_join_type; }
	}

	public final Natural_join_typeContext natural_join_type() throws RecognitionException {
		Natural_join_typeContext _localctx = new Natural_join_typeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_natural_join_type);
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(NATURAL);
				setState(521);
				match(JOIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				match(NATURAL);
				setState(523);
				match(INNER);
				setState(524);
				match(JOIN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				match(NATURAL);
				setState(526);
				match(LEFT);
				setState(527);
				match(JOIN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(528);
				match(NATURAL);
				setState(529);
				match(RIGHT);
				setState(530);
				match(JOIN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(531);
				match(NATURAL);
				setState(532);
				match(FULL);
				setState(533);
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
		public TerminalNode LPAREN() { return getToken(PostgreSqlGrammarParser.LPAREN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSqlGrammarParser.RPAREN, 0); }
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_table_reference);
		int _la;
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				table_name();
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(537);
					alias();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				match(LPAREN);
				setState(541);
				select_stmt();
				setState(542);
				match(RPAREN);
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==ID) {
					{
					setState(543);
					alias();
					}
				}

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
	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSqlGrammarParser.ID, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
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
		public TerminalNode AS() { return getToken(PostgreSqlGrammarParser.AS, 0); }
		public TerminalNode ID() { return getToken(PostgreSqlGrammarParser.ID, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_alias);
		try {
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(550);
				match(AS);
				setState(551);
				match(ID);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
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
		public TerminalNode GROUP() { return getToken(PostgreSqlGrammarParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(PostgreSqlGrammarParser.BY, 0); }
		public List<Group_by_itemContext> group_by_item() {
			return getRuleContexts(Group_by_itemContext.class);
		}
		public Group_by_itemContext group_by_item(int i) {
			return getRuleContext(Group_by_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSqlGrammarParser.COMMA, i);
		}
		public TerminalNode HAVING() { return getToken(PostgreSqlGrammarParser.HAVING, 0); }
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
		enterRule(_localctx, 70, RULE_group_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(GROUP);
			setState(556);
			match(BY);
			setState(557);
			group_by_item();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(558);
				match(COMMA);
				setState(559);
				group_by_item();
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(565);
				match(HAVING);
				setState(566);
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
		public TerminalNode ID() { return getToken(PostgreSqlGrammarParser.ID, 0); }
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PostgreSqlGrammarParser.DOT, 0); }
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
		enterRule(_localctx, 72, RULE_group_by_item);
		try {
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				match(ID);
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
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
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
		public TerminalNode ORDER() { return getToken(PostgreSqlGrammarParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(PostgreSqlGrammarParser.BY, 0); }
		public List<Order_by_itemContext> order_by_item() {
			return getRuleContexts(Order_by_itemContext.class);
		}
		public Order_by_itemContext order_by_item(int i) {
			return getRuleContext(Order_by_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSqlGrammarParser.COMMA, i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_order_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(ORDER);
			setState(578);
			match(BY);
			setState(579);
			order_by_item();
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(580);
				match(COMMA);
				setState(581);
				order_by_item();
				}
				}
				setState(586);
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
		public TerminalNode ID() { return getToken(PostgreSqlGrammarParser.ID, 0); }
		public TerminalNode ASC() { return getToken(PostgreSqlGrammarParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PostgreSqlGrammarParser.DESC, 0); }
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PostgreSqlGrammarParser.DOT, 0); }
		public Order_by_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_item; }
	}

	public final Order_by_itemContext order_by_item() throws RecognitionException {
		Order_by_itemContext _localctx = new Order_by_itemContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_order_by_item);
		int _la;
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				match(ID);
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(588);
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
				setState(591);
				table_reference();
				setState(592);
				match(DOT);
				setState(593);
				match(ID);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(594);
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
		public TerminalNode COUNT() { return getToken(PostgreSqlGrammarParser.COUNT, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSqlGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PostgreSqlGrammarParser.RPAREN, 0); }
		public TerminalNode STAR() { return getToken(PostgreSqlGrammarParser.STAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUM() { return getToken(PostgreSqlGrammarParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(PostgreSqlGrammarParser.AVG, 0); }
		public TerminalNode MIN() { return getToken(PostgreSqlGrammarParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(PostgreSqlGrammarParser.MAX, 0); }
		public TerminalNode ARRAY_AGG() { return getToken(PostgreSqlGrammarParser.ARRAY_AGG, 0); }
		public TerminalNode STRING_AGG() { return getToken(PostgreSqlGrammarParser.STRING_AGG, 0); }
		public TerminalNode COMMA() { return getToken(PostgreSqlGrammarParser.COMMA, 0); }
		public TerminalNode STRING() { return getToken(PostgreSqlGrammarParser.STRING, 0); }
		public TerminalNode BOOL_AND() { return getToken(PostgreSqlGrammarParser.BOOL_AND, 0); }
		public TerminalNode BOOL_OR() { return getToken(PostgreSqlGrammarParser.BOOL_OR, 0); }
		public TerminalNode VAR_POP() { return getToken(PostgreSqlGrammarParser.VAR_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(PostgreSqlGrammarParser.VAR_SAMP, 0); }
		public TerminalNode STDDEV_POP() { return getToken(PostgreSqlGrammarParser.STDDEV_POP, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(PostgreSqlGrammarParser.STDDEV_SAMP, 0); }
		public TerminalNode ID() { return getToken(PostgreSqlGrammarParser.ID, 0); }
		public Agg_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agg_func; }
	}

	public final Agg_funcContext agg_func() throws RecognitionException {
		Agg_funcContext _localctx = new Agg_funcContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_agg_func);
		try {
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				match(COUNT);
				setState(600);
				match(LPAREN);
				setState(603);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(601);
					match(STAR);
					}
					break;
				case NOT:
				case CASE:
				case STRING:
				case NUMBER:
				case LPAREN:
				case ID:
					{
					setState(602);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(605);
				match(RPAREN);
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				match(SUM);
				setState(607);
				match(LPAREN);
				setState(608);
				expr(0);
				setState(609);
				match(RPAREN);
				}
				break;
			case AVG:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				match(AVG);
				setState(612);
				match(LPAREN);
				setState(613);
				expr(0);
				setState(614);
				match(RPAREN);
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(616);
				match(MIN);
				setState(617);
				match(LPAREN);
				setState(618);
				expr(0);
				setState(619);
				match(RPAREN);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 5);
				{
				setState(621);
				match(MAX);
				setState(622);
				match(LPAREN);
				setState(623);
				expr(0);
				setState(624);
				match(RPAREN);
				}
				break;
			case ARRAY_AGG:
				enterOuterAlt(_localctx, 6);
				{
				setState(626);
				match(ARRAY_AGG);
				setState(627);
				match(LPAREN);
				setState(628);
				expr(0);
				setState(629);
				match(RPAREN);
				}
				break;
			case STRING_AGG:
				enterOuterAlt(_localctx, 7);
				{
				setState(631);
				match(STRING_AGG);
				setState(632);
				match(LPAREN);
				setState(633);
				expr(0);
				setState(634);
				match(COMMA);
				setState(635);
				match(STRING);
				setState(636);
				match(RPAREN);
				}
				break;
			case BOOL_AND:
				enterOuterAlt(_localctx, 8);
				{
				setState(638);
				match(BOOL_AND);
				setState(639);
				match(LPAREN);
				setState(640);
				expr(0);
				setState(641);
				match(RPAREN);
				}
				break;
			case BOOL_OR:
				enterOuterAlt(_localctx, 9);
				{
				setState(643);
				match(BOOL_OR);
				setState(644);
				match(LPAREN);
				setState(645);
				expr(0);
				setState(646);
				match(RPAREN);
				}
				break;
			case VAR_POP:
				enterOuterAlt(_localctx, 10);
				{
				setState(648);
				match(VAR_POP);
				setState(649);
				match(LPAREN);
				setState(650);
				expr(0);
				setState(651);
				match(RPAREN);
				}
				break;
			case VAR_SAMP:
				enterOuterAlt(_localctx, 11);
				{
				setState(653);
				match(VAR_SAMP);
				setState(654);
				match(LPAREN);
				setState(655);
				expr(0);
				setState(656);
				match(RPAREN);
				}
				break;
			case STDDEV_POP:
				enterOuterAlt(_localctx, 12);
				{
				setState(658);
				match(STDDEV_POP);
				setState(659);
				match(LPAREN);
				setState(660);
				expr(0);
				setState(661);
				match(RPAREN);
				}
				break;
			case STDDEV_SAMP:
				enterOuterAlt(_localctx, 13);
				{
				setState(663);
				match(STDDEV_SAMP);
				setState(664);
				match(LPAREN);
				setState(665);
				expr(0);
				setState(666);
				match(RPAREN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 14);
				{
				setState(668);
				match(ID);
				setState(669);
				match(LPAREN);
				setState(670);
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
		public TerminalNode NOT() { return getToken(PostgreSqlGrammarParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Arith_exprContext arith_expr() {
			return getRuleContext(Arith_exprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(PostgreSqlGrammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(PostgreSqlGrammarParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(PostgreSqlGrammarParser.LT, 0); }
		public TerminalNode LTE() { return getToken(PostgreSqlGrammarParser.LTE, 0); }
		public TerminalNode GT() { return getToken(PostgreSqlGrammarParser.GT, 0); }
		public TerminalNode GTE() { return getToken(PostgreSqlGrammarParser.GTE, 0); }
		public List<TerminalNode> STRING() { return getTokens(PostgreSqlGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PostgreSqlGrammarParser.STRING, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PostgreSqlGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PostgreSqlGrammarParser.NUMBER, i);
		}
		public List<TerminalNode> ID() { return getTokens(PostgreSqlGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostgreSqlGrammarParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PostgreSqlGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PostgreSqlGrammarParser.DOT, i);
		}
		public TerminalNode IS() { return getToken(PostgreSqlGrammarParser.IS, 0); }
		public TerminalNode NULL() { return getToken(PostgreSqlGrammarParser.NULL, 0); }
		public TerminalNode LIKE() { return getToken(PostgreSqlGrammarParser.LIKE, 0); }
		public TerminalNode BETWEEN() { return getToken(PostgreSqlGrammarParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(PostgreSqlGrammarParser.AND, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSqlGrammarParser.LPAREN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSqlGrammarParser.RPAREN, 0); }
		public Case_exprContext case_expr() {
			return getRuleContext(Case_exprContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode OR() { return getToken(PostgreSqlGrammarParser.OR, 0); }
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(674);
				match(NOT);
				setState(675);
				expr(9);
				}
				break;
			case 2:
				{
				setState(676);
				arith_expr(0);
				}
				break;
			case 3:
				{
				setState(684);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(677);
					match(STRING);
					}
					break;
				case NUMBER:
					{
					setState(678);
					match(NUMBER);
					}
					break;
				case ID:
					{
					{
					setState(679);
					match(ID);
					setState(682);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOT) {
						{
						setState(680);
						match(DOT);
						setState(681);
						match(ID);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(686);
				_la = _input.LA(1);
				if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 63L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(694);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(687);
					match(STRING);
					}
					break;
				case NUMBER:
					{
					setState(688);
					match(NUMBER);
					}
					break;
				case ID:
					{
					{
					setState(689);
					match(ID);
					setState(692);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(690);
						match(DOT);
						setState(691);
						match(ID);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				{
				setState(696);
				match(ID);
				setState(697);
				match(IS);
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(698);
					match(NOT);
					}
				}

				setState(701);
				match(NULL);
				}
				break;
			case 5:
				{
				setState(702);
				match(ID);
				setState(703);
				match(LIKE);
				setState(704);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(705);
				match(ID);
				setState(706);
				match(BETWEEN);
				setState(707);
				expr(0);
				setState(708);
				match(AND);
				setState(709);
				expr(4);
				}
				break;
			case 7:
				{
				setState(711);
				match(LPAREN);
				setState(712);
				select_stmt();
				setState(713);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(715);
				case_expr();
				}
				break;
			case 9:
				{
				setState(716);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(727);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(725);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(719);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(720);
						match(AND);
						setState(721);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(722);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(723);
						match(OR);
						setState(724);
						expr(11);
						}
						break;
					}
					} 
				}
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		public TerminalNode PLUS() { return getToken(PostgreSqlGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PostgreSqlGrammarParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(PostgreSqlGrammarParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(PostgreSqlGrammarParser.SLASH, 0); }
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_arith_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(731);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(745);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						_localctx = new Arith_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_expr);
						setState(733);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(734);
						match(PLUS);
						setState(735);
						arith_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new Arith_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_expr);
						setState(736);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(737);
						match(MINUS);
						setState(738);
						arith_expr(5);
						}
						break;
					case 3:
						{
						_localctx = new Arith_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_expr);
						setState(739);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(740);
						match(STAR);
						setState(741);
						arith_expr(4);
						}
						break;
					case 4:
						{
						_localctx = new Arith_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arith_expr);
						setState(742);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(743);
						match(SLASH);
						setState(744);
						arith_expr(3);
						}
						break;
					}
					} 
				}
				setState(749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
		public TerminalNode ID() { return getToken(PostgreSqlGrammarParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(PostgreSqlGrammarParser.NUMBER, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSqlGrammarParser.LPAREN, 0); }
		public Arith_exprContext arith_expr() {
			return getRuleContext(Arith_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSqlGrammarParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_atom);
		try {
			setState(756);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				match(NUMBER);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(752);
				match(LPAREN);
				setState(753);
				arith_expr(0);
				setState(754);
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
		public TerminalNode CASE() { return getToken(PostgreSqlGrammarParser.CASE, 0); }
		public TerminalNode END() { return getToken(PostgreSqlGrammarParser.END, 0); }
		public List<When_clauseContext> when_clause() {
			return getRuleContexts(When_clauseContext.class);
		}
		public When_clauseContext when_clause(int i) {
			return getRuleContext(When_clauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PostgreSqlGrammarParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NULL() { return getToken(PostgreSqlGrammarParser.NULL, 0); }
		public Case_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expr; }
	}

	public final Case_exprContext case_expr() throws RecognitionException {
		Case_exprContext _localctx = new Case_exprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_case_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(CASE);
			setState(760); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(759);
				when_clause();
				}
				}
				setState(762); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(764);
				match(ELSE);
				setState(767);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
				case CASE:
				case STRING:
				case NUMBER:
				case LPAREN:
				case ID:
					{
					setState(765);
					expr(0);
					}
					break;
				case NULL:
					{
					setState(766);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(771);
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
		public TerminalNode WHEN() { return getToken(PostgreSqlGrammarParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(PostgreSqlGrammarParser.THEN, 0); }
		public When_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_clause; }
	}

	public final When_clauseContext when_clause() throws RecognitionException {
		When_clauseContext _localctx = new When_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_when_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(WHEN);
			setState(774);
			expr(0);
			setState(775);
			match(THEN);
			setState(776);
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
		public TerminalNode ID() { return getToken(PostgreSqlGrammarParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSqlGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PostgreSqlGrammarParser.RPAREN, 0); }
		public List<Function_argContext> function_arg() {
			return getRuleContexts(Function_argContext.class);
		}
		public Function_argContext function_arg(int i) {
			return getRuleContext(Function_argContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSqlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSqlGrammarParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(ID);
			setState(779);
			match(LPAREN);
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT || _la==CASE || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 67108931L) != 0)) {
				{
				setState(780);
				function_arg();
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(781);
					match(COMMA);
					setState(782);
					function_arg();
					}
					}
					setState(787);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(790);
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
		enterRule(_localctx, 92, RULE_function_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
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
		case 40:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 41:
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
		"\u0004\u0001y\u031b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0001\u0000\u0001\u0000\u0005\u0000a\b\u0000\n"+
		"\u0000\f\u0000d\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0084\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u0088\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u008c\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0092"+
		"\b\u0002\n\u0002\f\u0002\u0095\t\u0002\u0003\u0002\u0097\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u009c\b\u0002\n\u0002\f\u0002"+
		"\u009f\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00a3\b\u0002\u0001"+
		"\u0002\u0003\u0002\u00a6\b\u0002\u0001\u0002\u0003\u0002\u00a9\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00b0\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00e3\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00ea\b\u0005\n\u0005"+
		"\f\u0005\u00ed\t\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00f5\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00fd\b\u0007"+
		"\n\u0007\f\u0007\u0100\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0104"+
		"\b\u0007\n\u0007\f\u0007\u0107\t\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u010e\b\b\n\b\f\b\u0111\t\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u011a\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0132\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0137\b\u000b\n\u000b\f\u000b\u013a\t\u000b\u0001\f\u0001\f\u0003"+
		"\f\u013e\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0144\b\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0151\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u015a\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0162"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u016e"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0179\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0182\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0188\b\u0011\n\u0011\f\u0011\u018b\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0194\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0198\b"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u019e"+
		"\b\u0012\n\u0012\f\u0012\u01a1\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u01ab\b\u0013\n\u0013\f\u0013\u01ae\t\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u01b2\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01bd"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01c3"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01c9"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u01d1\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u01d7\b\u0018\n\u0018\f\u0018\u01da\t\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u01f0\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u01f4\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0207\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0217\b\u001f"+
		"\u0001 \u0001 \u0003 \u021b\b \u0001 \u0001 \u0001 \u0001 \u0003 \u0221"+
		"\b \u0003 \u0223\b \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0003\"\u022a"+
		"\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u0231\b#\n#\f#\u0234\t"+
		"#\u0001#\u0001#\u0003#\u0238\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u0240\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u0247\b%\n"+
		"%\f%\u024a\t%\u0001&\u0001&\u0003&\u024e\b&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u0254\b&\u0003&\u0256\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u025c\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u02a0\b\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u02ab\b(\u0003(\u02ad"+
		"\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u02b5\b(\u0003(\u02b7"+
		"\b(\u0001(\u0001(\u0001(\u0003(\u02bc\b(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u02ce\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005"+
		"(\u02d6\b(\n(\f(\u02d9\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u02ea"+
		"\b)\n)\f)\u02ed\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u02f5"+
		"\b*\u0001+\u0001+\u0004+\u02f9\b+\u000b+\f+\u02fa\u0001+\u0001+\u0001"+
		"+\u0003+\u0300\b+\u0003+\u0302\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u0310\b-\n-\f-\u0313"+
		"\t-\u0003-\u0315\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0000\u0002PR/"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\\u0000\u0003\u0004\u0000"+
		"33MMTT\\\\\u0001\u0000!\"\u0001\u0000gl\u037b\u0000^\u0001\u0000\u0000"+
		"\u0000\u0002\u0083\u0001\u0000\u0000\u0000\u0004\u0087\u0001\u0000\u0000"+
		"\u0000\u0006\u00aa\u0001\u0000\u0000\u0000\b\u00e2\u0001\u0000\u0000\u0000"+
		"\n\u00e4\u0001\u0000\u0000\u0000\f\u00ee\u0001\u0000\u0000\u0000\u000e"+
		"\u00f0\u0001\u0000\u0000\u0000\u0010\u010a\u0001\u0000\u0000\u0000\u0012"+
		"\u0119\u0001\u0000\u0000\u0000\u0014\u0131\u0001\u0000\u0000\u0000\u0016"+
		"\u0133\u0001\u0000\u0000\u0000\u0018\u013b\u0001\u0000\u0000\u0000\u001a"+
		"\u014c\u0001\u0000\u0000\u0000\u001c\u0155\u0001\u0000\u0000\u0000\u001e"+
		"\u015d\u0001\u0000\u0000\u0000 \u0178\u0001\u0000\u0000\u0000\"\u0197"+
		"\u0001\u0000\u0000\u0000$\u0199\u0001\u0000\u0000\u0000&\u01a4\u0001\u0000"+
		"\u0000\u0000(\u01b3\u0001\u0000\u0000\u0000*\u01b7\u0001\u0000\u0000\u0000"+
		",\u01c2\u0001\u0000\u0000\u0000.\u01c8\u0001\u0000\u0000\u00000\u01d2"+
		"\u0001\u0000\u0000\u00002\u01db\u0001\u0000\u0000\u00004\u01ef\u0001\u0000"+
		"\u0000\u00006\u01f3\u0001\u0000\u0000\u00008\u01f5\u0001\u0000\u0000\u0000"+
		":\u01fa\u0001\u0000\u0000\u0000<\u0206\u0001\u0000\u0000\u0000>\u0216"+
		"\u0001\u0000\u0000\u0000@\u0222\u0001\u0000\u0000\u0000B\u0224\u0001\u0000"+
		"\u0000\u0000D\u0229\u0001\u0000\u0000\u0000F\u022b\u0001\u0000\u0000\u0000"+
		"H\u023f\u0001\u0000\u0000\u0000J\u0241\u0001\u0000\u0000\u0000L\u0255"+
		"\u0001\u0000\u0000\u0000N\u029f\u0001\u0000\u0000\u0000P\u02cd\u0001\u0000"+
		"\u0000\u0000R\u02da\u0001\u0000\u0000\u0000T\u02f4\u0001\u0000\u0000\u0000"+
		"V\u02f6\u0001\u0000\u0000\u0000X\u0305\u0001\u0000\u0000\u0000Z\u030a"+
		"\u0001\u0000\u0000\u0000\\\u0318\u0001\u0000\u0000\u0000^b\u0003\u0002"+
		"\u0001\u0000_a\u0003\u0002\u0001\u0000`_\u0001\u0000\u0000\u0000ad\u0001"+
		"\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"c\u0001\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0003\u0004"+
		"\u0002\u0000fg\u0005c\u0000\u0000g\u0084\u0001\u0000\u0000\u0000hi\u0003"+
		"\u0006\u0003\u0000ij\u0005c\u0000\u0000j\u0084\u0001\u0000\u0000\u0000"+
		"kl\u0003\u000e\u0007\u0000lm\u0005c\u0000\u0000m\u0084\u0001\u0000\u0000"+
		"\u0000no\u0003\u0018\f\u0000op\u0005c\u0000\u0000p\u0084\u0001\u0000\u0000"+
		"\u0000qr\u0003\u001a\r\u0000rs\u0005c\u0000\u0000s\u0084\u0001\u0000\u0000"+
		"\u0000tu\u0003\u001c\u000e\u0000uv\u0005c\u0000\u0000v\u0084\u0001\u0000"+
		"\u0000\u0000wx\u0003\u001e\u000f\u0000xy\u0005c\u0000\u0000y\u0084\u0001"+
		"\u0000\u0000\u0000z{\u0003\"\u0011\u0000{|\u0005c\u0000\u0000|\u0084\u0001"+
		"\u0000\u0000\u0000}~\u0003&\u0013\u0000~\u007f\u0005c\u0000\u0000\u007f"+
		"\u0084\u0001\u0000\u0000\u0000\u0080\u0081\u0003*\u0015\u0000\u0081\u0082"+
		"\u0005c\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083e\u0001\u0000"+
		"\u0000\u0000\u0083h\u0001\u0000\u0000\u0000\u0083k\u0001\u0000\u0000\u0000"+
		"\u0083n\u0001\u0000\u0000\u0000\u0083q\u0001\u0000\u0000\u0000\u0083t"+
		"\u0001\u0000\u0000\u0000\u0083w\u0001\u0000\u0000\u0000\u0083z\u0001\u0000"+
		"\u0000\u0000\u0083}\u0001\u0000\u0000\u0000\u0083\u0080\u0001\u0000\u0000"+
		"\u0000\u0084\u0003\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u001a\u0000"+
		"\u0000\u0086\u0088\u00030\u0018\u0000\u0087\u0085\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u008b\u0005\u0019\u0000\u0000\u008a\u008c\u0005L\u0000\u0000\u008b"+
		"\u008a\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u0096\u0001\u0000\u0000\u0000\u008d\u0097\u0005a\u0000\u0000\u008e\u0093"+
		"\u00034\u001a\u0000\u008f\u0090\u0005b\u0000\u0000\u0090\u0092\u00034"+
		"\u001a\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0096\u008d\u0001\u0000\u0000\u0000\u0096\u008e\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u001b"+
		"\u0000\u0000\u0099\u009d\u0003@ \u0000\u009a\u009c\u00036\u001b\u0000"+
		"\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u00a2\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0005\u001c\u0000\u0000\u00a1\u00a3\u0003P(\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a6\u0003F#\u0000\u00a5\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a9\u0003J%\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u0005\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u00052\u0000\u0000\u00ab\u00ac\u00053\u0000\u0000\u00ac\u00ad"+
		"\u0005y\u0000\u0000\u00ad\u00af\u0005e\u0000\u0000\u00ae\u00b0\u0003\n"+
		"\u0005\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005f\u0000"+
		"\u0000\u00b2\u00b3\u00054\u0000\u0000\u00b3\u00b4\u0005y\u0000\u0000\u00b4"+
		"\u00b5\u0005&\u0000\u0000\u00b5\u00b6\u0003\f\u0006\u0000\u00b6\u0007"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0001\u0000\u0000\u00b8\u00b9"+
		"\u0005e\u0000\u0000\u00b9\u00ba\u0005`\u0000\u0000\u00ba\u00e3\u0005f"+
		"\u0000\u0000\u00bb\u00e3\u0005\u0002\u0000\u0000\u00bc\u00bd\u0005\u0003"+
		"\u0000\u0000\u00bd\u00be\u0005e\u0000\u0000\u00be\u00bf\u0005`\u0000\u0000"+
		"\u00bf\u00c0\u0005b\u0000\u0000\u00c0\u00c1\u0005`\u0000\u0000\u00c1\u00e3"+
		"\u0005f\u0000\u0000\u00c2\u00e3\u0005\u0004\u0000\u0000\u00c3\u00e3\u0005"+
		"\u0005\u0000\u0000\u00c4\u00e3\u0005\u0006\u0000\u0000\u00c5\u00e3\u0005"+
		"\u0007\u0000\u0000\u00c6\u00e3\u0005\b\u0000\u0000\u00c7\u00e3\u0005\t"+
		"\u0000\u0000\u00c8\u00e3\u0005\n\u0000\u0000\u00c9\u00e3\u0005\u000b\u0000"+
		"\u0000\u00ca\u00e3\u0005\f\u0000\u0000\u00cb\u00e3\u0005\r\u0000\u0000"+
		"\u00cc\u00e3\u0005\u000e\u0000\u0000\u00cd\u00e3\u0005\u000f\u0000\u0000"+
		"\u00ce\u00e3\u0005\u0010\u0000\u0000\u00cf\u00d0\u0005\u0011\u0000\u0000"+
		"\u00d0\u00d1\u0005e\u0000\u0000\u00d1\u00d2\u0005`\u0000\u0000\u00d2\u00d3"+
		"\u0005b\u0000\u0000\u00d3\u00d4\u0005`\u0000\u0000\u00d4\u00e3\u0005f"+
		"\u0000\u0000\u00d5\u00e3\u0005\u0012\u0000\u0000\u00d6\u00e3\u0005\u0013"+
		"\u0000\u0000\u00d7\u00e3\u0005\u0014\u0000\u0000\u00d8\u00d9\u0005\u0015"+
		"\u0000\u0000\u00d9\u00da\u0005e\u0000\u0000\u00da\u00db\u0005`\u0000\u0000"+
		"\u00db\u00e3\u0005f\u0000\u0000\u00dc\u00dd\u0005\u0016\u0000\u0000\u00dd"+
		"\u00de\u0005e\u0000\u0000\u00de\u00df\u0005`\u0000\u0000\u00df\u00e3\u0005"+
		"f\u0000\u0000\u00e0\u00e3\u0005\u0017\u0000\u0000\u00e1\u00e3\u0005\u0018"+
		"\u0000\u0000\u00e2\u00b7\u0001\u0000\u0000\u0000\u00e2\u00bb\u0001\u0000"+
		"\u0000\u0000\u00e2\u00bc\u0001\u0000\u0000\u0000\u00e2\u00c2\u0001\u0000"+
		"\u0000\u0000\u00e2\u00c3\u0001\u0000\u0000\u0000\u00e2\u00c4\u0001\u0000"+
		"\u0000\u0000\u00e2\u00c5\u0001\u0000\u0000\u0000\u00e2\u00c6\u0001\u0000"+
		"\u0000\u0000\u00e2\u00c7\u0001\u0000\u0000\u0000\u00e2\u00c8\u0001\u0000"+
		"\u0000\u0000\u00e2\u00c9\u0001\u0000\u0000\u0000\u00e2\u00ca\u0001\u0000"+
		"\u0000\u0000\u00e2\u00cb\u0001\u0000\u0000\u0000\u00e2\u00cc\u0001\u0000"+
		"\u0000\u0000\u00e2\u00cd\u0001\u0000\u0000\u0000\u00e2\u00ce\u0001\u0000"+
		"\u0000\u0000\u00e2\u00cf\u0001\u0000\u0000\u0000\u00e2\u00d5\u0001\u0000"+
		"\u0000\u0000\u00e2\u00d6\u0001\u0000\u0000\u0000\u00e2\u00d7\u0001\u0000"+
		"\u0000\u0000\u00e2\u00d8\u0001\u0000\u0000\u0000\u00e2\u00dc\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\t\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005y\u0000"+
		"\u0000\u00e5\u00eb\u0003\b\u0004\u0000\u00e6\u00e7\u0005b\u0000\u0000"+
		"\u00e7\u00e8\u0005y\u0000\u0000\u00e8\u00ea\u0003\b\u0004\u0000\u00e9"+
		"\u00e6\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"\u000b\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0003P(\u0000\u00ef\r\u0001\u0000\u0000\u0000\u00f0\u00f4\u0005"+
		"2\u0000\u0000\u00f1\u00f2\u0005]\u0000\u0000\u00f2\u00f3\u0005%\u0000"+
		"\u0000\u00f3\u00f5\u0005^\u0000\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0005M\u0000\u0000\u00f7\u00f8\u0003B!\u0000\u00f8\u00f9"+
		"\u0005e\u0000\u0000\u00f9\u00fe\u0003\u0010\b\u0000\u00fa\u00fb\u0005"+
		"b\u0000\u0000\u00fb\u00fd\u0003\u0010\b\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0105\u0001\u0000"+
		"\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0102\u0005b\u0000"+
		"\u0000\u0102\u0104\u0003\u0014\n\u0000\u0103\u0101\u0001\u0000\u0000\u0000"+
		"\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000"+
		"\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109\u0005f\u0000\u0000\u0109"+
		"\u000f\u0001\u0000\u0000\u0000\u010a\u010b\u0005y\u0000\u0000\u010b\u010f"+
		"\u0003\b\u0004\u0000\u010c\u010e\u0003\u0012\t\u0000\u010d\u010c\u0001"+
		"\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0011\u0001"+
		"\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113\u0005"+
		"%\u0000\u0000\u0113\u011a\u0005)\u0000\u0000\u0114\u011a\u0005N\u0000"+
		"\u0000\u0115\u0116\u0005O\u0000\u0000\u0116\u011a\u0005P\u0000\u0000\u0117"+
		"\u0118\u0005Q\u0000\u0000\u0118\u011a\u0003P(\u0000\u0119\u0112\u0001"+
		"\u0000\u0000\u0000\u0119\u0114\u0001\u0000\u0000\u0000\u0119\u0115\u0001"+
		"\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u0013\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0005O\u0000\u0000\u011c\u011d\u0005P\u0000"+
		"\u0000\u011d\u011e\u0005e\u0000\u0000\u011e\u011f\u0003\u0016\u000b\u0000"+
		"\u011f\u0120\u0005f\u0000\u0000\u0120\u0132\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0005N\u0000\u0000\u0122\u0123\u0005e\u0000\u0000\u0123\u0124\u0003"+
		"\u0016\u000b\u0000\u0124\u0125\u0005f\u0000\u0000\u0125\u0132\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0005R\u0000\u0000\u0127\u0128\u0005P\u0000\u0000"+
		"\u0128\u0129\u0005e\u0000\u0000\u0129\u012a\u0003\u0016\u000b\u0000\u012a"+
		"\u012b\u0005f\u0000\u0000\u012b\u012c\u0005S\u0000\u0000\u012c\u012d\u0003"+
		"B!\u0000\u012d\u012e\u0005e\u0000\u0000\u012e\u012f\u0003\u0016\u000b"+
		"\u0000\u012f\u0130\u0005f\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000"+
		"\u0131\u011b\u0001\u0000\u0000\u0000\u0131\u0121\u0001\u0000\u0000\u0000"+
		"\u0131\u0126\u0001\u0000\u0000\u0000\u0132\u0015\u0001\u0000\u0000\u0000"+
		"\u0133\u0138\u0005y\u0000\u0000\u0134\u0135\u0005b\u0000\u0000\u0135\u0137"+
		"\u0005y\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u013a\u0001"+
		"\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001"+
		"\u0000\u0000\u0000\u0139\u0017\u0001\u0000\u0000\u0000\u013a\u0138\u0001"+
		"\u0000\u0000\u0000\u013b\u013d\u00052\u0000\u0000\u013c\u013e\u0005N\u0000"+
		"\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000"+
		"\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0143\u0005T\u0000\u0000"+
		"\u0140\u0141\u0005]\u0000\u0000\u0141\u0142\u0005%\u0000\u0000\u0142\u0144"+
		"\u0005^\u0000\u0000\u0143\u0140\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0005"+
		"y\u0000\u0000\u0146\u0147\u0005\'\u0000\u0000\u0147\u0148\u0003B!\u0000"+
		"\u0148\u0149\u0005e\u0000\u0000\u0149\u014a\u0003\u0016\u000b\u0000\u014a"+
		"\u014b\u0005f\u0000\u0000\u014b\u0019\u0001\u0000\u0000\u0000\u014c\u0150"+
		"\u00052\u0000\u0000\u014d\u014e\u0005]\u0000\u0000\u014e\u014f\u0005%"+
		"\u0000\u0000\u014f\u0151\u0005^\u0000\u0000\u0150\u014d\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0005\\\u0000\u0000\u0153\u0154\u0005y\u0000\u0000"+
		"\u0154\u001b\u0001\u0000\u0000\u0000\u0155\u0156\u0005U\u0000\u0000\u0156"+
		"\u0159\u0007\u0000\u0000\u0000\u0157\u0158\u0005]\u0000\u0000\u0158\u015a"+
		"\u0005^\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001"+
		"\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u0005"+
		"y\u0000\u0000\u015c\u001d\u0001\u0000\u0000\u0000\u015d\u015e\u0005V\u0000"+
		"\u0000\u015e\u0161\u0005M\u0000\u0000\u015f\u0160\u0005]\u0000\u0000\u0160"+
		"\u0162\u0005^\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0003B!\u0000\u0164\u0165\u0003 \u0010\u0000\u0165\u001f\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u0005Z\u0000\u0000\u0167\u0168\u0005[\u0000\u0000"+
		"\u0168\u0179\u0003\u0010\b\u0000\u0169\u016a\u0005U\u0000\u0000\u016a"+
		"\u016d\u0005[\u0000\u0000\u016b\u016c\u0005]\u0000\u0000\u016c\u016e\u0005"+
		"^\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0179\u0005y\u0000"+
		"\u0000\u0170\u0171\u0005W\u0000\u0000\u0171\u0172\u0005[\u0000\u0000\u0172"+
		"\u0173\u0005y\u0000\u0000\u0173\u0174\u0005Y\u0000\u0000\u0174\u0179\u0005"+
		"y\u0000\u0000\u0175\u0176\u0005Z\u0000\u0000\u0176\u0177\u0005X\u0000"+
		"\u0000\u0177\u0179\u0003\u0014\n\u0000\u0178\u0166\u0001\u0000\u0000\u0000"+
		"\u0178\u0169\u0001\u0000\u0000\u0000\u0178\u0170\u0001\u0000\u0000\u0000"+
		"\u0178\u0175\u0001\u0000\u0000\u0000\u0179!\u0001\u0000\u0000\u0000\u017a"+
		"\u017b\u0005p\u0000\u0000\u017b\u017c\u0005q\u0000\u0000\u017c\u0181\u0003"+
		"B!\u0000\u017d\u017e\u0005e\u0000\u0000\u017e\u017f\u0003\u0016\u000b"+
		"\u0000\u017f\u0180\u0005f\u0000\u0000\u0180\u0182\u0001\u0000\u0000\u0000"+
		"\u0181\u017d\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000"+
		"\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0184\u0005r\u0000\u0000\u0184"+
		"\u0189\u0003$\u0012\u0000\u0185\u0186\u0005b\u0000\u0000\u0186\u0188\u0003"+
		"$\u0012\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000"+
		"\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000"+
		"\u0000\u0000\u018a\u0198\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000"+
		"\u0000\u0000\u018c\u018d\u0005p\u0000\u0000\u018d\u018e\u0005q\u0000\u0000"+
		"\u018e\u0193\u0003B!\u0000\u018f\u0190\u0005e\u0000\u0000\u0190\u0191"+
		"\u0003\u0016\u000b\u0000\u0191\u0192\u0005f\u0000\u0000\u0192\u0194\u0001"+
		"\u0000\u0000\u0000\u0193\u018f\u0001\u0000\u0000\u0000\u0193\u0194\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0003"+
		"\u0004\u0002\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u017a\u0001"+
		"\u0000\u0000\u0000\u0197\u018c\u0001\u0000\u0000\u0000\u0198#\u0001\u0000"+
		"\u0000\u0000\u0199\u019a\u0005e\u0000\u0000\u019a\u019f\u0003,\u0016\u0000"+
		"\u019b\u019c\u0005b\u0000\u0000\u019c\u019e\u0003,\u0016\u0000\u019d\u019b"+
		"\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u019d"+
		"\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0005f\u0000\u0000\u01a3%\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005s"+
		"\u0000\u0000\u01a5\u01a6\u0003B!\u0000\u01a6\u01a7\u0005t\u0000\u0000"+
		"\u01a7\u01ac\u0003(\u0014\u0000\u01a8\u01a9\u0005b\u0000\u0000\u01a9\u01ab"+
		"\u0003(\u0014\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001"+
		"\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ad\u01b1\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001"+
		"\u0000\u0000\u0000\u01af\u01b0\u0005\u001c\u0000\u0000\u01b0\u01b2\u0003"+
		"P(\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b2\'\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005y\u0000\u0000"+
		"\u01b4\u01b5\u0005g\u0000\u0000\u01b5\u01b6\u0003,\u0016\u0000\u01b6)"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005u\u0000\u0000\u01b8\u01b9\u0005"+
		"\u001b\u0000\u0000\u01b9\u01bc\u0003B!\u0000\u01ba\u01bb\u0005\u001c\u0000"+
		"\u0000\u01bb\u01bd\u0003P(\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bd+\u0001\u0000\u0000\u0000\u01be\u01c3"+
		"\u0005_\u0000\u0000\u01bf\u01c3\u0005`\u0000\u0000\u01c0\u01c3\u0005)"+
		"\u0000\u0000\u01c1\u01c3\u0003P(\u0000\u01c2\u01be\u0001\u0000\u0000\u0000"+
		"\u01c2\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c3-\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c5\u0005G\u0000\u0000\u01c5\u01c6\u0003P(\u0000\u01c6\u01c7\u0005"+
		"J\u0000\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000\u01c8\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01d0\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cb\u0005H\u0000\u0000\u01cb\u01cc\u0005I\u0000\u0000"+
		"\u01cc\u01cd\u0003P(\u0000\u01cd\u01ce\u0005J\u0000\u0000\u01ce\u01cf"+
		"\u0005K\u0000\u0000\u01cf\u01d1\u0001\u0000\u0000\u0000\u01d0\u01ca\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1/\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d3\u0005\u001a\u0000\u0000\u01d3\u01d8\u00032\u0019"+
		"\u0000\u01d4\u01d5\u0005b\u0000\u0000\u01d5\u01d7\u00032\u0019\u0000\u01d6"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9"+
		"1\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01db\u01dc"+
		"\u0005y\u0000\u0000\u01dc\u01dd\u0005&\u0000\u0000\u01dd\u01de\u0005e"+
		"\u0000\u0000\u01de\u01df\u0003\u0004\u0002\u0000\u01df\u01e0\u0005f\u0000"+
		"\u0000\u01e03\u0001\u0000\u0000\u0000\u01e1\u01f0\u0003@ \u0000\u01e2"+
		"\u01e3\u0003@ \u0000\u01e3\u01e4\u0005d\u0000\u0000\u01e4\u01e5\u0005"+
		"a\u0000\u0000\u01e5\u01f0\u0001\u0000\u0000\u0000\u01e6\u01e7\u0003@ "+
		"\u0000\u01e7\u01e8\u0005d\u0000\u0000\u01e8\u01e9\u0005y\u0000\u0000\u01e9"+
		"\u01f0\u0001\u0000\u0000\u0000\u01ea\u01f0\u0005y\u0000\u0000\u01eb\u01f0"+
		"\u0003N\'\u0000\u01ec\u01ed\u0005y\u0000\u0000\u01ed\u01ee\u0005e\u0000"+
		"\u0000\u01ee\u01f0\u0005f\u0000\u0000\u01ef\u01e1\u0001\u0000\u0000\u0000"+
		"\u01ef\u01e2\u0001\u0000\u0000\u0000\u01ef\u01e6\u0001\u0000\u0000\u0000"+
		"\u01ef\u01ea\u0001\u0000\u0000\u0000\u01ef\u01eb\u0001\u0000\u0000\u0000"+
		"\u01ef\u01ec\u0001\u0000\u0000\u0000\u01f05\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f4\u00038\u001c\u0000\u01f2\u01f4\u0003:\u001d\u0000\u01f3\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f47\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\u0003<\u001e\u0000\u01f6\u01f7\u0003@ \u0000"+
		"\u01f7\u01f8\u0005\'\u0000\u0000\u01f8\u01f9\u0003P(\u0000\u01f99\u0001"+
		"\u0000\u0000\u0000\u01fa\u01fb\u0003>\u001f\u0000\u01fb\u01fc\u0003@ "+
		"\u0000\u01fc;\u0001\u0000\u0000\u0000\u01fd\u01fe\u00055\u0000\u0000\u01fe"+
		"\u0207\u00059\u0000\u0000\u01ff\u0200\u00056\u0000\u0000\u0200\u0207\u0005"+
		"9\u0000\u0000\u0201\u0202\u00057\u0000\u0000\u0202\u0207\u00059\u0000"+
		"\u0000\u0203\u0204\u00058\u0000\u0000\u0204\u0207\u00059\u0000\u0000\u0205"+
		"\u0207\u00059\u0000\u0000\u0206\u01fd\u0001\u0000\u0000\u0000\u0206\u01ff"+
		"\u0001\u0000\u0000\u0000\u0206\u0201\u0001\u0000\u0000\u0000\u0206\u0203"+
		"\u0001\u0000\u0000\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0207=\u0001"+
		"\u0000\u0000\u0000\u0208\u0209\u0005,\u0000\u0000\u0209\u0217\u00059\u0000"+
		"\u0000\u020a\u020b\u0005,\u0000\u0000\u020b\u020c\u00055\u0000\u0000\u020c"+
		"\u0217\u00059\u0000\u0000\u020d\u020e\u0005,\u0000\u0000\u020e\u020f\u0005"+
		"6\u0000\u0000\u020f\u0217\u00059\u0000\u0000\u0210\u0211\u0005,\u0000"+
		"\u0000\u0211\u0212\u00057\u0000\u0000\u0212\u0217\u00059\u0000\u0000\u0213"+
		"\u0214\u0005,\u0000\u0000\u0214\u0215\u00058\u0000\u0000\u0215\u0217\u0005"+
		"9\u0000\u0000\u0216\u0208\u0001\u0000\u0000\u0000\u0216\u020a\u0001\u0000"+
		"\u0000\u0000\u0216\u020d\u0001\u0000\u0000\u0000\u0216\u0210\u0001\u0000"+
		"\u0000\u0000\u0216\u0213\u0001\u0000\u0000\u0000\u0217?\u0001\u0000\u0000"+
		"\u0000\u0218\u021a\u0003B!\u0000\u0219\u021b\u0003D\"\u0000\u021a\u0219"+
		"\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u0223"+
		"\u0001\u0000\u0000\u0000\u021c\u021d\u0005e\u0000\u0000\u021d\u021e\u0003"+
		"\u0004\u0002\u0000\u021e\u0220\u0005f\u0000\u0000\u021f\u0221\u0003D\""+
		"\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000"+
		"\u0000\u0221\u0223\u0001\u0000\u0000\u0000\u0222\u0218\u0001\u0000\u0000"+
		"\u0000\u0222\u021c\u0001\u0000\u0000\u0000\u0223A\u0001\u0000\u0000\u0000"+
		"\u0224\u0225\u0005y\u0000\u0000\u0225C\u0001\u0000\u0000\u0000\u0226\u0227"+
		"\u0005&\u0000\u0000\u0227\u022a\u0005y\u0000\u0000\u0228\u022a\u0005y"+
		"\u0000\u0000\u0229\u0226\u0001\u0000\u0000\u0000\u0229\u0228\u0001\u0000"+
		"\u0000\u0000\u022aE\u0001\u0000\u0000\u0000\u022b\u022c\u0005\u001d\u0000"+
		"\u0000\u022c\u022d\u0005\u001e\u0000\u0000\u022d\u0232\u0003H$\u0000\u022e"+
		"\u022f\u0005b\u0000\u0000\u022f\u0231\u0003H$\u0000\u0230\u022e\u0001"+
		"\u0000\u0000\u0000\u0231\u0234\u0001\u0000\u0000\u0000\u0232\u0230\u0001"+
		"\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0237\u0001"+
		"\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0235\u0236\u0005"+
		"\u001f\u0000\u0000\u0236\u0238\u0003P(\u0000\u0237\u0235\u0001\u0000\u0000"+
		"\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238G\u0001\u0000\u0000\u0000"+
		"\u0239\u0240\u0005y\u0000\u0000\u023a\u023b\u0003@ \u0000\u023b\u023c"+
		"\u0005d\u0000\u0000\u023c\u023d\u0005y\u0000\u0000\u023d\u0240\u0001\u0000"+
		"\u0000\u0000\u023e\u0240\u0003N\'\u0000\u023f\u0239\u0001\u0000\u0000"+
		"\u0000\u023f\u023a\u0001\u0000\u0000\u0000\u023f\u023e\u0001\u0000\u0000"+
		"\u0000\u0240I\u0001\u0000\u0000\u0000\u0241\u0242\u0005 \u0000\u0000\u0242"+
		"\u0243\u0005\u001e\u0000\u0000\u0243\u0248\u0003L&\u0000\u0244\u0245\u0005"+
		"b\u0000\u0000\u0245\u0247\u0003L&\u0000\u0246\u0244\u0001\u0000\u0000"+
		"\u0000\u0247\u024a\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000\u0000"+
		"\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249K\u0001\u0000\u0000\u0000"+
		"\u024a\u0248\u0001\u0000\u0000\u0000\u024b\u024d\u0005y\u0000\u0000\u024c"+
		"\u024e\u0007\u0001\u0000\u0000\u024d\u024c\u0001\u0000\u0000\u0000\u024d"+
		"\u024e\u0001\u0000\u0000\u0000\u024e\u0256\u0001\u0000\u0000\u0000\u024f"+
		"\u0250\u0003@ \u0000\u0250\u0251\u0005d\u0000\u0000\u0251\u0253\u0005"+
		"y\u0000\u0000\u0252\u0254\u0007\u0001\u0000\u0000\u0253\u0252\u0001\u0000"+
		"\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0256\u0001\u0000"+
		"\u0000\u0000\u0255\u024b\u0001\u0000\u0000\u0000\u0255\u024f\u0001\u0000"+
		"\u0000\u0000\u0256M\u0001\u0000\u0000\u0000\u0257\u0258\u0005:\u0000\u0000"+
		"\u0258\u025b\u0005e\u0000\u0000\u0259\u025c\u0005a\u0000\u0000\u025a\u025c"+
		"\u0003P(\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b\u025a\u0001\u0000"+
		"\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u02a0\u0005f\u0000"+
		"\u0000\u025e\u025f\u0005;\u0000\u0000\u025f\u0260\u0005e\u0000\u0000\u0260"+
		"\u0261\u0003P(\u0000\u0261\u0262\u0005f\u0000\u0000\u0262\u02a0\u0001"+
		"\u0000\u0000\u0000\u0263\u0264\u0005<\u0000\u0000\u0264\u0265\u0005e\u0000"+
		"\u0000\u0265\u0266\u0003P(\u0000\u0266\u0267\u0005f\u0000\u0000\u0267"+
		"\u02a0\u0001\u0000\u0000\u0000\u0268\u0269\u0005=\u0000\u0000\u0269\u026a"+
		"\u0005e\u0000\u0000\u026a\u026b\u0003P(\u0000\u026b\u026c\u0005f\u0000"+
		"\u0000\u026c\u02a0\u0001\u0000\u0000\u0000\u026d\u026e\u0005>\u0000\u0000"+
		"\u026e\u026f\u0005e\u0000\u0000\u026f\u0270\u0003P(\u0000\u0270\u0271"+
		"\u0005f\u0000\u0000\u0271\u02a0\u0001\u0000\u0000\u0000\u0272\u0273\u0005"+
		"?\u0000\u0000\u0273\u0274\u0005e\u0000\u0000\u0274\u0275\u0003P(\u0000"+
		"\u0275\u0276\u0005f\u0000\u0000\u0276\u02a0\u0001\u0000\u0000\u0000\u0277"+
		"\u0278\u0005@\u0000\u0000\u0278\u0279\u0005e\u0000\u0000\u0279\u027a\u0003"+
		"P(\u0000\u027a\u027b\u0005b\u0000\u0000\u027b\u027c\u0005_\u0000\u0000"+
		"\u027c\u027d\u0005f\u0000\u0000\u027d\u02a0\u0001\u0000\u0000\u0000\u027e"+
		"\u027f\u0005A\u0000\u0000\u027f\u0280\u0005e\u0000\u0000\u0280\u0281\u0003"+
		"P(\u0000\u0281\u0282\u0005f\u0000\u0000\u0282\u02a0\u0001\u0000\u0000"+
		"\u0000\u0283\u0284\u0005B\u0000\u0000\u0284\u0285\u0005e\u0000\u0000\u0285"+
		"\u0286\u0003P(\u0000\u0286\u0287\u0005f\u0000\u0000\u0287\u02a0\u0001"+
		"\u0000\u0000\u0000\u0288\u0289\u0005C\u0000\u0000\u0289\u028a\u0005e\u0000"+
		"\u0000\u028a\u028b\u0003P(\u0000\u028b\u028c\u0005f\u0000\u0000\u028c"+
		"\u02a0\u0001\u0000\u0000\u0000\u028d\u028e\u0005D\u0000\u0000\u028e\u028f"+
		"\u0005e\u0000\u0000\u028f\u0290\u0003P(\u0000\u0290\u0291\u0005f\u0000"+
		"\u0000\u0291\u02a0\u0001\u0000\u0000\u0000\u0292\u0293\u0005E\u0000\u0000"+
		"\u0293\u0294\u0005e\u0000\u0000\u0294\u0295\u0003P(\u0000\u0295\u0296"+
		"\u0005f\u0000\u0000\u0296\u02a0\u0001\u0000\u0000\u0000\u0297\u0298\u0005"+
		"F\u0000\u0000\u0298\u0299\u0005e\u0000\u0000\u0299\u029a\u0003P(\u0000"+
		"\u029a\u029b\u0005f\u0000\u0000\u029b\u02a0\u0001\u0000\u0000\u0000\u029c"+
		"\u029d\u0005y\u0000\u0000\u029d\u029e\u0005e\u0000\u0000\u029e\u02a0\u0005"+
		"f\u0000\u0000\u029f\u0257\u0001\u0000\u0000\u0000\u029f\u025e\u0001\u0000"+
		"\u0000\u0000\u029f\u0263\u0001\u0000\u0000\u0000\u029f\u0268\u0001\u0000"+
		"\u0000\u0000\u029f\u026d\u0001\u0000\u0000\u0000\u029f\u0272\u0001\u0000"+
		"\u0000\u0000\u029f\u0277\u0001\u0000\u0000\u0000\u029f\u027e\u0001\u0000"+
		"\u0000\u0000\u029f\u0283\u0001\u0000\u0000\u0000\u029f\u0288\u0001\u0000"+
		"\u0000\u0000\u029f\u028d\u0001\u0000\u0000\u0000\u029f\u0292\u0001\u0000"+
		"\u0000\u0000\u029f\u0297\u0001\u0000\u0000\u0000\u029f\u029c\u0001\u0000"+
		"\u0000\u0000\u02a0O\u0001\u0000\u0000\u0000\u02a1\u02a2\u0006(\uffff\uffff"+
		"\u0000\u02a2\u02a3\u0005%\u0000\u0000\u02a3\u02ce\u0003P(\t\u02a4\u02ce"+
		"\u0003R)\u0000\u02a5\u02ad\u0005_\u0000\u0000\u02a6\u02ad\u0005`\u0000"+
		"\u0000\u02a7\u02aa\u0005y\u0000\u0000\u02a8\u02a9\u0005d\u0000\u0000\u02a9"+
		"\u02ab\u0005y\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02aa\u02ab"+
		"\u0001\u0000\u0000\u0000\u02ab\u02ad\u0001\u0000\u0000\u0000\u02ac\u02a5"+
		"\u0001\u0000\u0000\u0000\u02ac\u02a6\u0001\u0000\u0000\u0000\u02ac\u02a7"+
		"\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae\u02b6"+
		"\u0007\u0002\u0000\u0000\u02af\u02b7\u0005_\u0000\u0000\u02b0\u02b7\u0005"+
		"`\u0000\u0000\u02b1\u02b4\u0005y\u0000\u0000\u02b2\u02b3\u0005d\u0000"+
		"\u0000\u02b3\u02b5\u0005y\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b7\u0001\u0000\u0000\u0000"+
		"\u02b6\u02af\u0001\u0000\u0000\u0000\u02b6\u02b0\u0001\u0000\u0000\u0000"+
		"\u02b6\u02b1\u0001\u0000\u0000\u0000\u02b7\u02ce\u0001\u0000\u0000\u0000"+
		"\u02b8\u02b9\u0005y\u0000\u0000\u02b9\u02bb\u0005(\u0000\u0000\u02ba\u02bc"+
		"\u0005%\u0000\u0000\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001"+
		"\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02ce\u0005"+
		")\u0000\u0000\u02be\u02bf\u0005y\u0000\u0000\u02bf\u02c0\u0005*\u0000"+
		"\u0000\u02c0\u02ce\u0005_\u0000\u0000\u02c1\u02c2\u0005y\u0000\u0000\u02c2"+
		"\u02c3\u0005+\u0000\u0000\u02c3\u02c4\u0003P(\u0000\u02c4\u02c5\u0005"+
		"#\u0000\u0000\u02c5\u02c6\u0003P(\u0004\u02c6\u02ce\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c8\u0005e\u0000\u0000\u02c8\u02c9\u0003\u0004\u0002\u0000"+
		"\u02c9\u02ca\u0005f\u0000\u0000\u02ca\u02ce\u0001\u0000\u0000\u0000\u02cb"+
		"\u02ce\u0003V+\u0000\u02cc\u02ce\u0003Z-\u0000\u02cd\u02a1\u0001\u0000"+
		"\u0000\u0000\u02cd\u02a4\u0001\u0000\u0000\u0000\u02cd\u02ac\u0001\u0000"+
		"\u0000\u0000\u02cd\u02b8\u0001\u0000\u0000\u0000\u02cd\u02be\u0001\u0000"+
		"\u0000\u0000\u02cd\u02c1\u0001\u0000\u0000\u0000\u02cd\u02c7\u0001\u0000"+
		"\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02cc\u0001\u0000"+
		"\u0000\u0000\u02ce\u02d7\u0001\u0000\u0000\u0000\u02cf\u02d0\n\u000b\u0000"+
		"\u0000\u02d0\u02d1\u0005#\u0000\u0000\u02d1\u02d6\u0003P(\f\u02d2\u02d3"+
		"\n\n\u0000\u0000\u02d3\u02d4\u0005$\u0000\u0000\u02d4\u02d6\u0003P(\u000b"+
		"\u02d5\u02cf\u0001\u0000\u0000\u0000\u02d5\u02d2\u0001\u0000\u0000\u0000"+
		"\u02d6\u02d9\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8Q\u0001\u0000\u0000\u0000\u02d9"+
		"\u02d7\u0001\u0000\u0000\u0000\u02da\u02db\u0006)\uffff\uffff\u0000\u02db"+
		"\u02dc\u0003T*\u0000\u02dc\u02eb\u0001\u0000\u0000\u0000\u02dd\u02de\n"+
		"\u0005\u0000\u0000\u02de\u02df\u0005m\u0000\u0000\u02df\u02ea\u0003R)"+
		"\u0006\u02e0\u02e1\n\u0004\u0000\u0000\u02e1\u02e2\u0005n\u0000\u0000"+
		"\u02e2\u02ea\u0003R)\u0005\u02e3\u02e4\n\u0003\u0000\u0000\u02e4\u02e5"+
		"\u0005a\u0000\u0000\u02e5\u02ea\u0003R)\u0004\u02e6\u02e7\n\u0002\u0000"+
		"\u0000\u02e7\u02e8\u0005o\u0000\u0000\u02e8\u02ea\u0003R)\u0003\u02e9"+
		"\u02dd\u0001\u0000\u0000\u0000\u02e9\u02e0\u0001\u0000\u0000\u0000\u02e9"+
		"\u02e3\u0001\u0000\u0000\u0000\u02e9\u02e6\u0001\u0000\u0000\u0000\u02ea"+
		"\u02ed\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02eb"+
		"\u02ec\u0001\u0000\u0000\u0000\u02ecS\u0001\u0000\u0000\u0000\u02ed\u02eb"+
		"\u0001\u0000\u0000\u0000\u02ee\u02f5\u0005y\u0000\u0000\u02ef\u02f5\u0005"+
		"`\u0000\u0000\u02f0\u02f1\u0005e\u0000\u0000\u02f1\u02f2\u0003R)\u0000"+
		"\u02f2\u02f3\u0005f\u0000\u0000\u02f3\u02f5\u0001\u0000\u0000\u0000\u02f4"+
		"\u02ee\u0001\u0000\u0000\u0000\u02f4\u02ef\u0001\u0000\u0000\u0000\u02f4"+
		"\u02f0\u0001\u0000\u0000\u0000\u02f5U\u0001\u0000\u0000\u0000\u02f6\u02f8"+
		"\u0005-\u0000\u0000\u02f7\u02f9\u0003X,\u0000\u02f8\u02f7\u0001\u0000"+
		"\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02f8\u0001\u0000"+
		"\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u0301\u0001\u0000"+
		"\u0000\u0000\u02fc\u02ff\u00050\u0000\u0000\u02fd\u0300\u0003P(\u0000"+
		"\u02fe\u0300\u0005)\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000\u02ff"+
		"\u02fe\u0001\u0000\u0000\u0000\u0300\u0302\u0001\u0000\u0000\u0000\u0301"+
		"\u02fc\u0001\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302"+
		"\u0303\u0001\u0000\u0000\u0000\u0303\u0304\u00051\u0000\u0000\u0304W\u0001"+
		"\u0000\u0000\u0000\u0305\u0306\u0005.\u0000\u0000\u0306\u0307\u0003P("+
		"\u0000\u0307\u0308\u0005/\u0000\u0000\u0308\u0309\u0003P(\u0000\u0309"+
		"Y\u0001\u0000\u0000\u0000\u030a\u030b\u0005y\u0000\u0000\u030b\u0314\u0005"+
		"e\u0000\u0000\u030c\u0311\u0003\\.\u0000\u030d\u030e\u0005b\u0000\u0000"+
		"\u030e\u0310\u0003\\.\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u0310"+
		"\u0313\u0001\u0000\u0000\u0000\u0311\u030f\u0001\u0000\u0000\u0000\u0311"+
		"\u0312\u0001\u0000\u0000\u0000\u0312\u0315\u0001\u0000\u0000\u0000\u0313"+
		"\u0311\u0001\u0000\u0000\u0000\u0314\u030c\u0001\u0000\u0000\u0000\u0314"+
		"\u0315\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316"+
		"\u0317\u0005f\u0000\u0000\u0317[\u0001\u0000\u0000\u0000\u0318\u0319\u0003"+
		"P(\u0000\u0319]\u0001\u0000\u0000\u0000Hb\u0083\u0087\u008b\u0093\u0096"+
		"\u009d\u00a2\u00a5\u00a8\u00af\u00e2\u00eb\u00f4\u00fe\u0105\u010f\u0119"+
		"\u0131\u0138\u013d\u0143\u0150\u0159\u0161\u016d\u0178\u0181\u0189\u0193"+
		"\u0197\u019f\u01ac\u01b1\u01bc\u01c2\u01c8\u01d0\u01d8\u01ef\u01f3\u0206"+
		"\u0216\u021a\u0220\u0222\u0229\u0232\u0237\u023f\u0248\u024d\u0253\u0255"+
		"\u025b\u029f\u02aa\u02ac\u02b4\u02b6\u02bb\u02cd\u02d5\u02d7\u02e9\u02eb"+
		"\u02f4\u02fa\u02ff\u0301\u0311\u0314";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}