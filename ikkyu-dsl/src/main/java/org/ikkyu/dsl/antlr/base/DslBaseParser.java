// Generated from /Users/wozipa/ProductCode/ikkyu/ikkyu-dsl/src/main/antlr/DslBase.g4 by ANTLR 4.7.2

    package org.ikkyu.dsl.antlr.base;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DslBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ADD=13, AFTER=14, ALL=15, ALTER=16, ANALYZE=17, 
		AND=18, ANTI=19, ANY=20, ARCHIVE=21, ARRAY=22, AS=23, ASC=24, AT=25, AUTHORIZATION=26, 
		BETWEEN=27, BOTH=28, BUCKET=29, BUCKETS=30, BY=31, CACHE=32, CASCADE=33, 
		CASE=34, CAST=35, CHANGE=36, CHECK=37, CLEAR=38, CLUSTER=39, CLUSTERED=40, 
		CODEGEN=41, COLLATE=42, COLLECTION=43, COLUMN=44, COLUMNS=45, COMMENT=46, 
		COMMIT=47, COMPACT=48, COMPACTIONS=49, COMPUTE=50, CONCATENATE=51, CONSTRAINT=52, 
		COST=53, CREATE=54, CROSS=55, CUBE=56, CURRENT=57, CURRENT_DATE=58, CURRENT_TIME=59, 
		CURRENT_TIMESTAMP=60, CURRENT_USER=61, DATA=62, DATABASE=63, DATABASES=64, 
		DAY=65, DAYS=66, DBPROPERTIES=67, DEFINED=68, DELETE=69, DELIMITED=70, 
		DESC=71, DESCRIBE=72, DFS=73, DIRECTORIES=74, DIRECTORY=75, DISTINCT=76, 
		DISTRIBUTE=77, DROP=78, ELSE=79, END=80, ESCAPED=81, EXCEPT=82, EXCHANGE=83, 
		EXISTS=84, EXPLAIN=85, EXPORT=86, EXTENDED=87, EXTERNAL=88, EXTRACT=89, 
		FALSE=90, FETCH=91, FIELDS=92, FILEFORMAT=93, FIRST=94, FIRST_VALUE=95, 
		FOLLOWING=96, FOR=97, FOREIGN=98, FORMAT=99, FORMATTED=100, FROM=101, 
		FULL=102, FUNCTION=103, FUNCTIONS=104, GLOBAL=105, GRANT=106, GROUP=107, 
		GROUPING=108, HAVING=109, HOUR=110, HOURS=111, IF=112, IGNORE=113, IMPORT=114, 
		IN=115, INDEX=116, INDEXES=117, INNER=118, INPATH=119, INPUTFORMAT=120, 
		INSERT=121, INTERSECT=122, INTERVAL=123, INTO=124, IS=125, ITEMS=126, 
		JOIN=127, KEYS=128, LAST=129, LAST_VALUE=130, LATERAL=131, LAZY=132, LEADING=133, 
		LEFT=134, LIKE=135, LIMIT=136, LINES=137, LIST=138, LOAD=139, LOCAL=140, 
		LOCATION=141, LOCK=142, LOCKS=143, LOGICAL=144, MACRO=145, MAP=146, MICROSECOND=147, 
		MICROSECONDS=148, MILLISECOND=149, MILLISECONDS=150, MINUTE=151, MINUTES=152, 
		MONTH=153, MONTHS=154, MSCK=155, NAMESPACE=156, NAMESPACES=157, NATURAL=158, 
		NO=159, NOT=160, NULL=161, NULLS=162, OF=163, ON=164, ONLY=165, OPTION=166, 
		OPTIONS=167, OR=168, ORDER=169, OUT=170, OUTER=171, OUTPUTFORMAT=172, 
		OVER=173, OVERLAPS=174, OVERLAY=175, OVERWRITE=176, PARTITION=177, PARTITIONED=178, 
		PARTITIONS=179, PERCENTLIT=180, PIVOT=181, PLACING=182, POSITION=183, 
		PRECEDING=184, PRIMARY=185, PRINCIPALS=186, PROPERTIES=187, PURGE=188, 
		QUERY=189, RANGE=190, RECORDREADER=191, RECORDWRITER=192, RECOVER=193, 
		REDUCE=194, REFERENCES=195, REFRESH=196, RENAME=197, REPAIR=198, REPLACE=199, 
		RESET=200, RESPECT=201, RESTRICT=202, REVOKE=203, RIGHT=204, RLIKE=205, 
		ROLE=206, ROLES=207, ROLLBACK=208, ROLLUP=209, ROW=210, ROWS=211, SCHEMA=212, 
		SECOND=213, SECONDS=214, SELECT=215, SEMI=216, SEPARATED=217, SERDE=218, 
		SERDEPROPERTIES=219, SESSION_USER=220, SET=221, SETMINUS=222, SETS=223, 
		SHOW=224, SKEWED=225, SOME=226, SORT=227, SORTED=228, START=229, STATISTICS=230, 
		STORED=231, STRATIFY=232, STRUCT=233, SUBSTR=234, SUBSTRING=235, TABLE=236, 
		TABLES=237, TABLESAMPLE=238, TBLPROPERTIES=239, TEMPORARY=240, TERMINATED=241, 
		THEN=242, TO=243, TOUCH=244, TRAILING=245, TRANSACTION=246, TRANSACTIONS=247, 
		TRANSFORM=248, TRIM=249, TRUE=250, TRUNCATE=251, TYPE=252, UNARCHIVE=253, 
		UNBOUNDED=254, UNCACHE=255, UNION=256, UNIQUE=257, UNKNOWN=258, UNLOCK=259, 
		UNSET=260, UPDATE=261, USE=262, USER=263, USING=264, VALUES=265, VIEW=266, 
		WEEK=267, WEEKS=268, WHEN=269, WHERE=270, WINDOW=271, WITH=272, YEAR=273, 
		YEARS=274, EQ=275, NSEQ=276, NEQ=277, NEQJ=278, LT=279, LTE=280, GT=281, 
		GTE=282, PLUS=283, MINUS=284, ASTERISK=285, SLASH=286, PERCENT=287, DIV=288, 
		TILDE=289, AMPERSAND=290, PIPE=291, CONCAT_PIPE=292, HAT=293, STRING=294, 
		BIGINT_LITERAL=295, SMALLINT_LITERAL=296, TINYINT_LITERAL=297, INTEGER_VALUE=298, 
		DECIMAL_VALUE=299, DOUBLE_LITERAL=300, BIGDECIMAL_LITERAL=301, IDENTIFIER=302, 
		BACKQUOTED_IDENTIFIER=303, SIMPLE_COMMENT=304, BRACKETED_EMPTY_COMMENT=305, 
		BRACKETED_COMMENT=306, WS=307, UNRECOGNIZED=308, READ=309, STRINGq=310;
	public static final int
		RULE_root = 0, RULE_readDataStatement = 1, RULE_readFileStatement = 2, 
		RULE_fileType = 3, RULE_readDBTableStatement = 4, RULE_dbType = 5, RULE_writeDataStatement = 6, 
		RULE_writeFileStatement = 7, RULE_writeDBTableStatement = 8, RULE_writeType = 9, 
		RULE_assignDataStatement = 10, RULE_singleSqlStatment = 11, RULE_tableIdentifier = 12, 
		RULE_errorCapturingIdentifier = 13, RULE_errorCapturingIdentifierExtra = 14, 
		RULE_identifier = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "readDataStatement", "readFileStatement", "fileType", "readDBTableStatement", 
			"dbType", "writeDataStatement", "writeFileStatement", "writeDBTableStatement", 
			"writeType", "assignDataStatement", "singleSqlStatment", "tableIdentifier", 
			"errorCapturingIdentifier", "errorCapturingIdentifierExtra", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CSV'", "'PARQUET'", "'TXT'", "'JSON'", "'MYSQL'", "'CLICKHOUSE'", 
			"'HBASE'", "'DRUID'", "'REDIS'", "'ORACLE'", "'APPEND'", "'.'", "'ADD'", 
			"'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANTI'", "'ANY'", 
			"'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", "'BETWEEN'", 
			"'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", "'CASE'", 
			"'CAST'", "'CHANGE'", "'CHECK'", "'CLEAR'", "'CLUSTER'", "'CLUSTERED'", 
			"'CODEGEN'", "'COLLATE'", "'COLLECTION'", "'COLUMN'", "'COLUMNS'", "'COMMENT'", 
			"'COMMIT'", "'COMPACT'", "'COMPACTIONS'", "'COMPUTE'", "'CONCATENATE'", 
			"'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", 
			"'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", 
			"'DATA'", "'DATABASE'", null, "'DAY'", "'DAYS'", "'DBPROPERTIES'", "'DEFINED'", 
			"'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", "'DIRECTORIES'", 
			"'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", "'DROP'", "'ELSE'", "'END'", 
			"'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", "'EXISTS'", "'EXPLAIN'", "'EXPORT'", 
			"'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", "'FALSE'", "'FETCH'", "'FIELDS'", 
			"'FILEFORMAT'", "'FIRST'", "'FIRST_VALUE'", "'FOLLOWING'", "'FOR'", "'FOREIGN'", 
			"'FORMAT'", "'FORMATTED'", "'FROM'", "'FULL'", "'FUNCTION'", "'FUNCTIONS'", 
			"'GLOBAL'", "'GRANT'", "'GROUP'", "'GROUPING'", "'HAVING'", "'HOUR'", 
			"'HOURS'", "'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INDEX'", "'INDEXES'", 
			"'INNER'", "'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", 
			"'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", "'LAST_VALUE'", 
			"'LATERAL'", "'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'LIMIT'", "'LINES'", 
			"'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", "'LOGICAL'", 
			"'MACRO'", "'MAP'", "'MICROSECOND'", "'MICROSECONDS'", "'MILLISECOND'", 
			"'MILLISECONDS'", "'MINUTE'", "'MINUTES'", "'MONTH'", "'MONTHS'", "'MSCK'", 
			"'NAMESPACE'", "'NAMESPACES'", "'NATURAL'", "'NO'", null, "'NULL'", "'NULLS'", 
			"'OF'", "'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", "'OR'", "'ORDER'", 
			"'OUT'", "'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", "'OVERLAY'", 
			"'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", "'PERCENT'", 
			"'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", "'PRIMARY'", "'PRINCIPALS'", 
			"'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", "'RECORDREADER'", "'RECORDWRITER'", 
			"'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", "'RENAME'", "'REPAIR'", 
			"'REPLACE'", "'RESET'", "'RESPECT'", "'RESTRICT'", "'REVOKE'", "'RIGHT'", 
			null, "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", 
			"'SCHEMA'", "'SECOND'", "'SECONDS'", "'SELECT'", "'SEMI'", "'SEPARATED'", 
			"'SERDE'", "'SERDEPROPERTIES'", "'SESSION_USER'", "'SET'", "'MINUS'", 
			"'SETS'", "'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", "'SORTED'", "'START'", 
			"'STATISTICS'", "'STORED'", "'STRATIFY'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", 
			"'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", null, "'TERMINATED'", 
			"'THEN'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", "'TRANSACTIONS'", 
			"'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TYPE'", "'UNARCHIVE'", 
			"'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", "'UNKNOWN'", "'UNLOCK'", 
			"'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", "'VIEW'", 
			"'WEEK'", "'WEEKS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", "'YEAR'", 
			"'YEARS'", null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", "'||'", "'^'", 
			null, null, null, null, null, null, null, null, null, null, null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", 
			"ARCHIVE", "ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", 
			"BUCKET", "BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", 
			"CHECK", "CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", 
			"COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", 
			"CONCATENATE", "CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", 
			"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
			"DATA", "DATABASE", "DATABASES", "DAY", "DAYS", "DBPROPERTIES", "DEFINED", 
			"DELETE", "DELIMITED", "DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", 
			"DISTINCT", "DISTRIBUTE", "DROP", "ELSE", "END", "ESCAPED", "EXCEPT", 
			"EXCHANGE", "EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", 
			"FALSE", "FETCH", "FIELDS", "FILEFORMAT", "FIRST", "FIRST_VALUE", "FOLLOWING", 
			"FOR", "FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", "FUNCTION", 
			"FUNCTIONS", "GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", "HOUR", 
			"HOURS", "IF", "IGNORE", "IMPORT", "IN", "INDEX", "INDEXES", "INNER", 
			"INPATH", "INPUTFORMAT", "INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", 
			"ITEMS", "JOIN", "KEYS", "LAST", "LAST_VALUE", "LATERAL", "LAZY", "LEADING", 
			"LEFT", "LIKE", "LIMIT", "LINES", "LIST", "LOAD", "LOCAL", "LOCATION", 
			"LOCK", "LOCKS", "LOGICAL", "MACRO", "MAP", "MICROSECOND", "MICROSECONDS", 
			"MILLISECOND", "MILLISECONDS", "MINUTE", "MINUTES", "MONTH", "MONTHS", 
			"MSCK", "NAMESPACE", "NAMESPACES", "NATURAL", "NO", "NOT", "NULL", "NULLS", 
			"OF", "ON", "ONLY", "OPTION", "OPTIONS", "OR", "ORDER", "OUT", "OUTER", 
			"OUTPUTFORMAT", "OVER", "OVERLAPS", "OVERLAY", "OVERWRITE", "PARTITION", 
			"PARTITIONED", "PARTITIONS", "PERCENTLIT", "PIVOT", "PLACING", "POSITION", 
			"PRECEDING", "PRIMARY", "PRINCIPALS", "PROPERTIES", "PURGE", "QUERY", 
			"RANGE", "RECORDREADER", "RECORDWRITER", "RECOVER", "REDUCE", "REFERENCES", 
			"REFRESH", "RENAME", "REPAIR", "REPLACE", "RESET", "RESPECT", "RESTRICT", 
			"REVOKE", "RIGHT", "RLIKE", "ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", 
			"ROWS", "SCHEMA", "SECOND", "SECONDS", "SELECT", "SEMI", "SEPARATED", 
			"SERDE", "SERDEPROPERTIES", "SESSION_USER", "SET", "SETMINUS", "SETS", 
			"SHOW", "SKEWED", "SOME", "SORT", "SORTED", "START", "STATISTICS", "STORED", 
			"STRATIFY", "STRUCT", "SUBSTR", "SUBSTRING", "TABLE", "TABLES", "TABLESAMPLE", 
			"TBLPROPERTIES", "TEMPORARY", "TERMINATED", "THEN", "TO", "TOUCH", "TRAILING", 
			"TRANSACTION", "TRANSACTIONS", "TRANSFORM", "TRIM", "TRUE", "TRUNCATE", 
			"TYPE", "UNARCHIVE", "UNBOUNDED", "UNCACHE", "UNION", "UNIQUE", "UNKNOWN", 
			"UNLOCK", "UNSET", "UPDATE", "USE", "USER", "USING", "VALUES", "VIEW", 
			"WEEK", "WEEKS", "WHEN", "WHERE", "WINDOW", "WITH", "YEAR", "YEARS", 
			"EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", 
			"ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", "PIPE", 
			"CONCAT_PIPE", "HAT", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
			"TINYINT_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", 
			"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
			"BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED", 
			"READ", "STRINGq"
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
	public String getGrammarFileName() { return "DslBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enbled = false;

	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	  /**
	   * When true, ANSI SQL parsing mode is enabled.
	   */
	  public boolean ansi = false;

	public DslBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public ReadDataStatementContext readDataStatement() {
			return getRuleContext(ReadDataStatementContext.class,0);
		}
		public WriteDataStatementContext writeDataStatement() {
			return getRuleContext(WriteDataStatementContext.class,0);
		}
		public SingleSqlStatmentContext singleSqlStatment() {
			return getRuleContext(SingleSqlStatmentContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslBaseVisitor ) return ((DslBaseVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				{
				setState(32);
				readDataStatement();
				}
				break;
			case T__10:
			case OVERWRITE:
				{
				setState(33);
				writeDataStatement();
				}
				break;
			case ALTER:
			case ANALYZE:
			case CACHE:
			case CREATE:
			case DELETE:
			case DESC:
			case DESCRIBE:
			case DROP:
			case EXPLAIN:
			case FROM:
			case LOAD:
			case REFRESH:
			case REPLACE:
			case RESET:
			case SELECT:
			case SET:
			case SHOW:
			case UNCACHE:
			case UPDATE:
			case USE:
			case WITH:
				{
				setState(34);
				singleSqlStatment();
				}
				break;
			case EOF:
				break;
			default:
				break;
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

	public static class ReadDataStatementContext extends ParserRuleContext {
		public ReadFileStatementContext readFileStatement() {
			return getRuleContext(ReadFileStatementContext.class,0);
		}
		public ReadDBTableStatementContext readDBTableStatement() {
			return getRuleContext(ReadDBTableStatementContext.class,0);
		}
		public ReadDataStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readDataStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).enterReadDataStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).exitReadDataStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslBaseVisitor ) return ((DslBaseVisitor<? extends T>)visitor).visitReadDataStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadDataStatementContext readDataStatement() throws RecognitionException {
		ReadDataStatementContext _localctx = new ReadDataStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_readDataStatement);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				readFileStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				readDBTableStatement();
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

	public static class ReadFileStatementContext extends ParserRuleContext {
		public Token filePath;
		public TerminalNode READ() { return getToken(DslBaseParser.READ, 0); }
		public FileTypeContext fileType() {
			return getRuleContext(FileTypeContext.class,0);
		}
		public TerminalNode FROM() { return getToken(DslBaseParser.FROM, 0); }
		public TerminalNode STRINGq() { return getToken(DslBaseParser.STRINGq, 0); }
		public ReadFileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readFileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).enterReadFileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).exitReadFileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslBaseVisitor ) return ((DslBaseVisitor<? extends T>)visitor).visitReadFileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadFileStatementContext readFileStatement() throws RecognitionException {
		ReadFileStatementContext _localctx = new ReadFileStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_readFileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(READ);
			setState(42);
			fileType();
			setState(43);
			match(FROM);
			setState(44);
			((ReadFileStatementContext)_localctx).filePath = match(STRINGq);
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

	public static class FileTypeContext extends ParserRuleContext {
		public FileTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).enterFileType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).exitFileType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslBaseVisitor ) return ((DslBaseVisitor<? extends T>)visitor).visitFileType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileTypeContext fileType() throws RecognitionException {
		FileTypeContext _localctx = new FileTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fileType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ReadDBTableStatementContext extends ParserRuleContext {
		public IdentifierContext tableName;
		public IdentifierContext dbSource;
		public TerminalNode READ() { return getToken(DslBaseParser.READ, 0); }
		public DbTypeContext dbType() {
			return getRuleContext(DbTypeContext.class,0);
		}
		public TerminalNode FROM() { return getToken(DslBaseParser.FROM, 0); }
		public TerminalNode ON() { return getToken(DslBaseParser.ON, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ReadDBTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readDBTableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).enterReadDBTableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).exitReadDBTableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslBaseVisitor ) return ((DslBaseVisitor<? extends T>)visitor).visitReadDBTableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadDBTableStatementContext readDBTableStatement() throws RecognitionException {
		ReadDBTableStatementContext _localctx = new ReadDBTableStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_readDBTableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(READ);
			setState(49);
			dbType();
			setState(50);
			match(FROM);
			setState(51);
			((ReadDBTableStatementContext)_localctx).tableName = identifier();
			setState(52);
			match(ON);
			setState(53);
			((ReadDBTableStatementContext)_localctx).dbSource = identifier();
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

	public static class DbTypeContext extends ParserRuleContext {
		public DbTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).enterDbType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).exitDbType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslBaseVisitor ) return ((DslBaseVisitor<? extends T>)visitor).visitDbType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DbTypeContext dbType() throws RecognitionException {
		DbTypeContext _localctx = new DbTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dbType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class WriteDataStatementContext extends ParserRuleContext {
		public WriteFileStatementContext writeFileStatement() {
			return getRuleContext(WriteFileStatementContext.class,0);
		}
		public WriteDBTableStatementContext writeDBTableStatement() {
			return getRuleContext(WriteDBTableStatementContext.class,0);
		}
		public WriteDataStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeDataStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).enterWriteDataStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).exitWriteDataStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslBaseVisitor ) return ((DslBaseVisitor<? extends T>)visitor).visitWriteDataStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteDataStatementContext writeDataStatement() throws RecognitionException {
		WriteDataStatementContext _localctx = new WriteDataStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_writeDataStatement);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				writeFileStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				writeDBTableStatement();
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

	public static class WriteFileStatementContext extends ParserRuleContext {
		public IdentifierContext datasetName;
		public Token filePath;
		public WriteTypeContext writeType() {
			return getRuleContext(WriteTypeContext.class,0);
		}
		public TerminalNode INTO() { return getToken(DslBaseParser.INTO, 0); }
		public FileTypeContext fileType() {
			return getRuleContext(FileTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(DslBaseParser.STRING, 0); }
		public WriteFileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeFileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).enterWriteFileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).exitWriteFileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslBaseVisitor ) return ((DslBaseVisitor<? extends T>)visitor).visitWriteFileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteFileStatementContext writeFileStatement() throws RecognitionException {
		WriteFileStatementContext _localctx = new WriteFileStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_writeFileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			writeType();
			setState(62);
			((WriteFileStatementContext)_localctx).datasetName = identifier();
			setState(63);
			match(INTO);
			setState(64);
			fileType();
			setState(65);
			((WriteFileStatementContext)_localctx).filePath = match(STRING);
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

	public static class WriteDBTableStatementContext extends ParserRuleContext {
		public IdentifierContext datasetName;
		public IdentifierContext dbTable;
		public IdentifierContext dbSource;
		public WriteTypeContext writeType() {
			return getRuleContext(WriteTypeContext.class,0);
		}
		public TerminalNode INTO() { return getToken(DslBaseParser.INTO, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ON() { return getToken(DslBaseParser.ON, 0); }
		public WriteDBTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeDBTableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).enterWriteDBTableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).exitWriteDBTableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslBaseVisitor ) return ((DslBaseVisitor<? extends T>)visitor).visitWriteDBTableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteDBTableStatementContext writeDBTableStatement() throws RecognitionException {
		WriteDBTableStatementContext _localctx = new WriteDBTableStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_writeDBTableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			writeType();
			setState(68);
			((WriteDBTableStatementContext)_localctx).datasetName = identifier();
			setState(69);
			match(INTO);
			setState(70);
			((WriteDBTableStatementContext)_localctx).dbTable = identifier();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(71);
				match(ON);
				setState(72);
				((WriteDBTableStatementContext)_localctx).dbSource = identifier();
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

	public static class WriteTypeContext extends ParserRuleContext {
		public TerminalNode OVERWRITE() { return getToken(DslBaseParser.OVERWRITE, 0); }
		public WriteTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).enterWriteType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).exitWriteType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslBaseVisitor ) return ((DslBaseVisitor<? extends T>)visitor).visitWriteType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteTypeContext writeType() throws RecognitionException {
		WriteTypeContext _localctx = new WriteTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_writeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==OVERWRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AssignDataStatementContext extends ParserRuleContext {
		public IdentifierContext datasetName;
		public TerminalNode EQ() { return getToken(DslBaseParser.EQ, 0); }
		public ReadDataStatementContext readDataStatement() {
			return getRuleContext(ReadDataStatementContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssignDataStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignDataStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).enterAssignDataStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).exitAssignDataStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslBaseVisitor ) return ((DslBaseVisitor<? extends T>)visitor).visitAssignDataStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignDataStatementContext assignDataStatement() throws RecognitionException {
		AssignDataStatementContext _localctx = new AssignDataStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignDataStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			((AssignDataStatementContext)_localctx).datasetName = identifier();
			setState(78);
			match(EQ);
			setState(79);
			readDataStatement();
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

	public static class SingleSqlStatmentContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(DslBaseParser.USE, 0); }
		public TerminalNode SET() { return getToken(DslBaseParser.SET, 0); }
		public TerminalNode RESET() { return getToken(DslBaseParser.RESET, 0); }
		public TerminalNode CREATE() { return getToken(DslBaseParser.CREATE, 0); }
		public TerminalNode ALTER() { return getToken(DslBaseParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(DslBaseParser.DROP, 0); }
		public TerminalNode SHOW() { return getToken(DslBaseParser.SHOW, 0); }
		public TerminalNode DESC() { return getToken(DslBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(DslBaseParser.DESCRIBE, 0); }
		public TerminalNode LOAD() { return getToken(DslBaseParser.LOAD, 0); }
		public TerminalNode WITH() { return getToken(DslBaseParser.WITH, 0); }
		public TerminalNode SELECT() { return getToken(DslBaseParser.SELECT, 0); }
		public TerminalNode UPDATE() { return getToken(DslBaseParser.UPDATE, 0); }
		public TerminalNode REPLACE() { return getToken(DslBaseParser.REPLACE, 0); }
		public TerminalNode DELETE() { return getToken(DslBaseParser.DELETE, 0); }
		public TerminalNode CACHE() { return getToken(DslBaseParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(DslBaseParser.UNCACHE, 0); }
		public TerminalNode REFRESH() { return getToken(DslBaseParser.REFRESH, 0); }
		public TerminalNode FROM() { return getToken(DslBaseParser.FROM, 0); }
		public TerminalNode ANALYZE() { return getToken(DslBaseParser.ANALYZE, 0); }
		public TerminalNode EXPLAIN() { return getToken(DslBaseParser.EXPLAIN, 0); }
		public SingleSqlStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleSqlStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).enterSingleSqlStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).exitSingleSqlStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslBaseVisitor ) return ((DslBaseVisitor<? extends T>)visitor).visitSingleSqlStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleSqlStatmentContext singleSqlStatment() throws RecognitionException {
		SingleSqlStatmentContext _localctx = new SingleSqlStatmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_singleSqlStatment);
		int _la;
		try {
			int _alt;
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(USE);
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(82);
						matchWildcard();
						}
						} 
					}
					setState(87);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(SET);
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(89);
						matchWildcard();
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case RESET:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(RESET);
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(96);
						matchWildcard();
						}
						} 
					}
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(CREATE);
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(103);
						matchWildcard();
						}
						} 
					}
					setState(108);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(ALTER);
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(110);
						matchWildcard();
						}
						} 
					}
					setState(115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				match(DROP);
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(117);
						matchWildcard();
						}
						} 
					}
					setState(122);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				match(SHOW);
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(124);
						matchWildcard();
						}
						} 
					}
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case DESC:
			case DESCRIBE:
				enterOuterAlt(_localctx, 8);
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(131);
						matchWildcard();
						}
						} 
					}
					setState(136);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(137);
				match(LOAD);
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(138);
						matchWildcard();
						}
						} 
					}
					setState(143);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 10);
				{
				setState(144);
				match(WITH);
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(145);
						matchWildcard();
						}
						} 
					}
					setState(150);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 11);
				{
				setState(151);
				match(SELECT);
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(152);
						matchWildcard();
						}
						} 
					}
					setState(157);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 12);
				{
				setState(158);
				match(UPDATE);
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(159);
						matchWildcard();
						}
						} 
					}
					setState(164);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case REPLACE:
				enterOuterAlt(_localctx, 13);
				{
				setState(165);
				match(REPLACE);
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(166);
						matchWildcard();
						}
						} 
					}
					setState(171);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 14);
				{
				setState(172);
				match(DELETE);
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(173);
						matchWildcard();
						}
						} 
					}
					setState(178);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case CACHE:
				enterOuterAlt(_localctx, 15);
				{
				setState(179);
				match(CACHE);
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(180);
						matchWildcard();
						}
						} 
					}
					setState(185);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			case UNCACHE:
				enterOuterAlt(_localctx, 16);
				{
				setState(186);
				match(UNCACHE);
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(187);
						matchWildcard();
						}
						} 
					}
					setState(192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case REFRESH:
				enterOuterAlt(_localctx, 17);
				{
				setState(193);
				match(REFRESH);
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(194);
						matchWildcard();
						}
						} 
					}
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 18);
				{
				setState(200);
				match(FROM);
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(201);
						matchWildcard();
						}
						} 
					}
					setState(206);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				break;
			case ANALYZE:
				enterOuterAlt(_localctx, 19);
				{
				setState(207);
				match(ANALYZE);
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(208);
						matchWildcard();
						}
						} 
					}
					setState(213);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case EXPLAIN:
				enterOuterAlt(_localctx, 20);
				{
				setState(214);
				match(EXPLAIN);
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(215);
						matchWildcard();
						}
						} 
					}
					setState(220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslBaseVisitor ) return ((DslBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(223);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(224);
				match(T__11);
				}
				break;
			}
			setState(228);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
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

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslBaseVisitor ) return ((DslBaseVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			identifier();
			setState(231);
			errorCapturingIdentifierExtra();
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

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public List<TerminalNode> MINUS() { return getTokens(DslBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(DslBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).enterErrorCapturingIdentifierExtra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).exitErrorCapturingIdentifierExtra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslBaseVisitor ) return ((DslBaseVisitor<? extends T>)visitor).visitErrorCapturingIdentifierExtra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_errorCapturingIdentifierExtra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(233);
				match(MINUS);
				setState(234);
				identifier();
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MINUS );
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

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(DslBaseParser.IDENTIFIER, 0); }
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DslBaseListener ) ((DslBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslBaseVisitor ) return ((DslBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identifier);
		try {
			_localctx = new UnquotedIdentifierContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(IDENTIFIER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0138\u00f4\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\5\2&\n\2\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\5\b>\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\nL\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\7\rV\n"+
		"\r\f\r\16\rY\13\r\3\r\3\r\7\r]\n\r\f\r\16\r`\13\r\3\r\3\r\7\rd\n\r\f\r"+
		"\16\rg\13\r\3\r\3\r\7\rk\n\r\f\r\16\rn\13\r\3\r\3\r\7\rr\n\r\f\r\16\r"+
		"u\13\r\3\r\3\r\7\ry\n\r\f\r\16\r|\13\r\3\r\3\r\7\r\u0080\n\r\f\r\16\r"+
		"\u0083\13\r\3\r\3\r\7\r\u0087\n\r\f\r\16\r\u008a\13\r\3\r\3\r\7\r\u008e"+
		"\n\r\f\r\16\r\u0091\13\r\3\r\3\r\7\r\u0095\n\r\f\r\16\r\u0098\13\r\3\r"+
		"\3\r\7\r\u009c\n\r\f\r\16\r\u009f\13\r\3\r\3\r\7\r\u00a3\n\r\f\r\16\r"+
		"\u00a6\13\r\3\r\3\r\7\r\u00aa\n\r\f\r\16\r\u00ad\13\r\3\r\3\r\7\r\u00b1"+
		"\n\r\f\r\16\r\u00b4\13\r\3\r\3\r\7\r\u00b8\n\r\f\r\16\r\u00bb\13\r\3\r"+
		"\3\r\7\r\u00bf\n\r\f\r\16\r\u00c2\13\r\3\r\3\r\7\r\u00c6\n\r\f\r\16\r"+
		"\u00c9\13\r\3\r\3\r\7\r\u00cd\n\r\f\r\16\r\u00d0\13\r\3\r\3\r\7\r\u00d4"+
		"\n\r\f\r\16\r\u00d7\13\r\3\r\3\r\7\r\u00db\n\r\f\r\16\r\u00de\13\r\5\r"+
		"\u00e0\n\r\3\16\3\16\3\16\5\16\u00e5\n\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\6\20\u00ee\n\20\r\20\16\20\u00ef\3\21\3\21\3\21\26W^elsz\u0081\u0088"+
		"\u008f\u0096\u009d\u00a4\u00ab\u00b2\u00b9\u00c0\u00c7\u00ce\u00d5\u00dc"+
		"\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\6\3\2\3\6\3\2\7\f\4\2"+
		"\r\r\u00b2\u00b2\3\2IJ\2\u0112\2%\3\2\2\2\4)\3\2\2\2\6+\3\2\2\2\b\60\3"+
		"\2\2\2\n\62\3\2\2\2\f9\3\2\2\2\16=\3\2\2\2\20?\3\2\2\2\22E\3\2\2\2\24"+
		"M\3\2\2\2\26O\3\2\2\2\30\u00df\3\2\2\2\32\u00e4\3\2\2\2\34\u00e8\3\2\2"+
		"\2\36\u00ed\3\2\2\2 \u00f1\3\2\2\2\"&\5\4\3\2#&\5\16\b\2$&\5\30\r\2%\""+
		"\3\2\2\2%#\3\2\2\2%$\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'*\5\6\4\2(*\5\n\6\2"+
		")\'\3\2\2\2)(\3\2\2\2*\5\3\2\2\2+,\7\u0137\2\2,-\5\b\5\2-.\7g\2\2./\7"+
		"\u0138\2\2/\7\3\2\2\2\60\61\t\2\2\2\61\t\3\2\2\2\62\63\7\u0137\2\2\63"+
		"\64\5\f\7\2\64\65\7g\2\2\65\66\5 \21\2\66\67\7\u00a6\2\2\678\5 \21\28"+
		"\13\3\2\2\29:\t\3\2\2:\r\3\2\2\2;>\5\20\t\2<>\5\22\n\2=;\3\2\2\2=<\3\2"+
		"\2\2>\17\3\2\2\2?@\5\24\13\2@A\5 \21\2AB\7~\2\2BC\5\b\5\2CD\7\u0128\2"+
		"\2D\21\3\2\2\2EF\5\24\13\2FG\5 \21\2GH\7~\2\2HK\5 \21\2IJ\7\u00a6\2\2"+
		"JL\5 \21\2KI\3\2\2\2KL\3\2\2\2L\23\3\2\2\2MN\t\4\2\2N\25\3\2\2\2OP\5 "+
		"\21\2PQ\7\u0115\2\2QR\5\4\3\2R\27\3\2\2\2SW\7\u0108\2\2TV\13\2\2\2UT\3"+
		"\2\2\2VY\3\2\2\2WX\3\2\2\2WU\3\2\2\2X\u00e0\3\2\2\2YW\3\2\2\2Z^\7\u00df"+
		"\2\2[]\13\2\2\2\\[\3\2\2\2]`\3\2\2\2^_\3\2\2\2^\\\3\2\2\2_\u00e0\3\2\2"+
		"\2`^\3\2\2\2ae\7\u00ca\2\2bd\13\2\2\2cb\3\2\2\2dg\3\2\2\2ef\3\2\2\2ec"+
		"\3\2\2\2f\u00e0\3\2\2\2ge\3\2\2\2hl\78\2\2ik\13\2\2\2ji\3\2\2\2kn\3\2"+
		"\2\2lm\3\2\2\2lj\3\2\2\2m\u00e0\3\2\2\2nl\3\2\2\2os\7\22\2\2pr\13\2\2"+
		"\2qp\3\2\2\2ru\3\2\2\2st\3\2\2\2sq\3\2\2\2t\u00e0\3\2\2\2us\3\2\2\2vz"+
		"\7P\2\2wy\13\2\2\2xw\3\2\2\2y|\3\2\2\2z{\3\2\2\2zx\3\2\2\2{\u00e0\3\2"+
		"\2\2|z\3\2\2\2}\u0081\7\u00e2\2\2~\u0080\13\2\2\2\177~\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u00e0\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0088\t\5\2\2\u0085\u0087\13\2\2\2\u0086\u0085\3"+
		"\2\2\2\u0087\u008a\3\2\2\2\u0088\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u00e0\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008f\7\u008d\2\2\u008c\u008e"+
		"\13\2\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u0090\3\2\2\2"+
		"\u008f\u008d\3\2\2\2\u0090\u00e0\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0096"+
		"\7\u0112\2\2\u0093\u0095\13\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u00e0\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009d\7\u00d9\2\2\u009a\u009c\13\2\2\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u00e0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a4\7\u0107\2\2\u00a1\u00a3"+
		"\13\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a5\u00e0\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ab"+
		"\7\u00c9\2\2\u00a8\u00aa\13\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00e0\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00b2\7G\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2"+
		"\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00e0\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b9\7\"\2\2\u00b6\u00b8\13"+
		"\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00ba\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00e0\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c0\7\u0101"+
		"\2\2\u00bd\u00bf\13\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00e0\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c3\u00c7\7\u00c6\2\2\u00c4\u00c6\13\2\2\2\u00c5\u00c4\3\2\2\2"+
		"\u00c6\u00c9\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00e0"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00ce\7g\2\2\u00cb\u00cd\13\2\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00e0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d5\7\23\2\2\u00d2"+
		"\u00d4\13\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d6\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00e0\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00dc\7W\2\2\u00d9\u00db\13\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00dfS\3\2\2\2\u00dfZ\3\2\2\2\u00dfa\3\2\2\2\u00dfh\3\2"+
		"\2\2\u00dfo\3\2\2\2\u00dfv\3\2\2\2\u00df}\3\2\2\2\u00df\u0084\3\2\2\2"+
		"\u00df\u008b\3\2\2\2\u00df\u0092\3\2\2\2\u00df\u0099\3\2\2\2\u00df\u00a0"+
		"\3\2\2\2\u00df\u00a7\3\2\2\2\u00df\u00ae\3\2\2\2\u00df\u00b5\3\2\2\2\u00df"+
		"\u00bc\3\2\2\2\u00df\u00c3\3\2\2\2\u00df\u00ca\3\2\2\2\u00df\u00d1\3\2"+
		"\2\2\u00df\u00d8\3\2\2\2\u00e0\31\3\2\2\2\u00e1\u00e2\5\34\17\2\u00e2"+
		"\u00e3\7\16\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e5\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\5\34\17\2\u00e7\33\3\2\2\2\u00e8"+
		"\u00e9\5 \21\2\u00e9\u00ea\5\36\20\2\u00ea\35\3\2\2\2\u00eb\u00ec\7\u011e"+
		"\2\2\u00ec\u00ee\5 \21\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\37\3\2\2\2\u00f1\u00f2\7\u0130"+
		"\2\2\u00f2!\3\2\2\2\35%)=KW^elsz\u0081\u0088\u008f\u0096\u009d\u00a4\u00ab"+
		"\u00b2\u00b9\u00c0\u00c7\u00ce\u00d5\u00dc\u00df\u00e4\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}