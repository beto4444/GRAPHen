// Generated from C:/Users/keste/IdeaProjects/GRAPHen_Polnische_Graphcomputersprache/src\GRAPHen.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GRAPHenParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
<<<<<<< HEAD
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, WS=44, POS_NUMBER=45, 
		NUMBER=46, IDENTIFIER=47, TEXT=48, LETTER=49, NODE_KW=50, EDGE_KW=51, 
		VAL_KW=52, COL_KW=53, NODE_SPEC=54, EDGE_CPEC=55, GRAPH_KW=56, DIGHRAPH_KW=57, 
		NODE_ORD=58, COL_G=59, GEN=60, COLOR=61, HEXDIGIT=62, LINE_TYPE=63, NODE_SHAPE=64;
=======
		T__38=39, T__39=40, T__40=41, T__41=42, WS=43, POS_NUMBER=44, NUMBER=45, 
		IDENTIFIER=46, LETTER=47, NODE_KW=48, EDGE_KW=49, VAL_KW=50, COL_KW=51, 
		NODE_SPEC=52, EDGE_CPEC=53, GRAPH_KW=54, DIGHRAPH_KW=55, NODE_ORD=56, 
		COL_G=57, GEN=58, COLOR=59, HEXDIGIT=60, LINE_TYPE=61, NODE_SHAPE=62;
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_node_definition = 2, RULE_node_inline = 3, 
		RULE_node_properties = 4, RULE_edge_definition = 5, RULE_edge_inline = 6, 
		RULE_edge_properties = 7, RULE_graph_definition = 8, RULE_digraph_definition = 9, 
		RULE_edge_list = 10, RULE_edge_relation = 11, RULE_dedge_list = 12, RULE_dedge_relation = 13, 
		RULE_graph_function = 14, RULE_graph_function_statement = 15, RULE_fileFormat = 16, 
		RULE_exportToFileFunc = 17, RULE_graph_add = 18, RULE_digraph_add = 19, 
		RULE_graph_substract = 20, RULE_digraph_substract = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "node_definition", "node_inline", "node_properties", 
			"edge_definition", "edge_inline", "edge_properties", "graph_definition", 
			"digraph_definition", "edge_list", "edge_relation", "dedge_list", "dedge_relation", 
			"graph_function", "graph_function_statement", "fileFormat", "exportToFileFunc", 
			"graph_add", "digraph_add", "graph_substract", "digraph_substract"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
<<<<<<< HEAD
			null, "'Node '", "'{'", "'};'", "'}'", "'NodeContents '", "', '", "'fillColor '", 
			"','", "'borderColor '", "'nodeShape '", "'nodeSize '", "'borderWidth '", 
			"'borderLineShape '", "'Edge '", "'Num_color '", "'lineWidth'", "'Color '", 
			"'lineType'", "'Graph '", "'}.'", "';'", "'='", "'Digraph '", "'.'", 
			"'('", "'<->'", "'<-> '", "')'", "'->'", "'-> '", "'NodeOrderDown({'", 
			"'})'", "'colorEdges()'", "'colorNodes()'", "'clearEdges()'", "'.png'", 
			"'.svg'", "'.gren'", "'export('", "'format'", "'fileName'", "'+'", "'-'", 
			null, null, null, null, null, null, "'Node'", "'Edge'", "'Val'", "'Color'", 
			"'Nodetype'", "'Edgetype'", "'Graph'", "'Digraph'", "'NodeOrderDown'", 
			"'Graphcolor'", "'Generate'"
=======
			null, "'Node '", "'{'", "'};'", "'}'", "'Num_color '", "', '", "'fillColor '", 
			"','", "'borderColor '", "'nodeShape '", "'nodeSize '", "'borderWidth '", 
			"'borderLineShape '", "'Edge '", "'lineWidth'", "'Color '", "'lineType'", 
			"'Graph '", "'}.'", "';'", "'='", "'Digraph '", "'.'", "'('", "'<->'", 
			"'<-> '", "')'", "'->'", "'-> '", "'NodeOrderDown({'", "'})'", "'colorEdges()'", 
			"'colorNodes()'", "'clearEdges()'", "'.png'", "'.svg'", "'.gren'", "'export('", 
			"'format'", "'fileName'", "'+'", "'-'", null, null, null, null, null, 
			"'Node'", "'Edge'", "'Val'", "'Color'", "'Nodetype'", "'Edgetype'", "'Graph'", 
			"'Digraph'", "'NodeOrderDown'", "'Graphcolor'", "'Generate'"
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
<<<<<<< HEAD
			null, null, null, null, null, null, null, null, "WS", "POS_NUMBER", "NUMBER", 
			"IDENTIFIER", "TEXT", "LETTER", "NODE_KW", "EDGE_KW", "VAL_KW", "COL_KW", 
			"NODE_SPEC", "EDGE_CPEC", "GRAPH_KW", "DIGHRAPH_KW", "NODE_ORD", "COL_G", 
			"GEN", "COLOR", "HEXDIGIT", "LINE_TYPE", "NODE_SHAPE"
=======
			null, null, null, null, null, null, null, "WS", "POS_NUMBER", "NUMBER", 
			"IDENTIFIER", "LETTER", "NODE_KW", "EDGE_KW", "VAL_KW", "COL_KW", "NODE_SPEC", 
			"EDGE_CPEC", "GRAPH_KW", "DIGHRAPH_KW", "NODE_ORD", "COL_G", "GEN", "COLOR", 
			"HEXDIGIT", "LINE_TYPE", "NODE_SHAPE"
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
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
	public String getGrammarFileName() { return "GRAPHen.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GRAPHenParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GRAPHenParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				statement();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
<<<<<<< HEAD
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 140737497284610L) != 0) );
=======
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 70368748650498L) != 0) );
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
			}
			setState(49);
			match(EOF);
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
	public static class StatementContext extends ParserRuleContext {
		public Node_definitionContext node_definition() {
			return getRuleContext(Node_definitionContext.class,0);
		}
		public Edge_definitionContext edge_definition() {
			return getRuleContext(Edge_definitionContext.class,0);
		}
		public Digraph_definitionContext digraph_definition() {
			return getRuleContext(Digraph_definitionContext.class,0);
		}
		public Graph_definitionContext graph_definition() {
			return getRuleContext(Graph_definitionContext.class,0);
		}
		public Graph_function_statementContext graph_function_statement() {
			return getRuleContext(Graph_function_statementContext.class,0);
		}
		public Graph_addContext graph_add() {
			return getRuleContext(Graph_addContext.class,0);
		}
		public Graph_substractContext graph_substract() {
			return getRuleContext(Graph_substractContext.class,0);
		}
		public Digraph_addContext digraph_add() {
			return getRuleContext(Digraph_addContext.class,0);
		}
		public Digraph_substractContext digraph_substract() {
			return getRuleContext(Digraph_substractContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				node_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				edge_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				digraph_definition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				graph_definition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				graph_function_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				graph_add();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(57);
				graph_substract();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(58);
				digraph_add();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(59);
				digraph_substract();
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
	public static class Node_definitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GRAPHenParser.IDENTIFIER, 0); }
		public Node_propertiesContext node_properties() {
			return getRuleContext(Node_propertiesContext.class,0);
		}
		public Node_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterNode_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitNode_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitNode_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_definitionContext node_definition() throws RecognitionException {
		Node_definitionContext _localctx = new Node_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_node_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__0);
			setState(63);
			match(IDENTIFIER);
			setState(64);
			match(T__1);
			setState(65);
			node_properties();
			setState(66);
			match(T__2);
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
	public static class Node_inlineContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GRAPHenParser.IDENTIFIER, 0); }
		public Node_propertiesContext node_properties() {
			return getRuleContext(Node_propertiesContext.class,0);
		}
		public Node_inlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_inline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterNode_inline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitNode_inline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitNode_inline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_inlineContext node_inline() throws RecognitionException {
		Node_inlineContext _localctx = new Node_inlineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_node_inline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__0);
			setState(69);
			match(IDENTIFIER);
			setState(70);
			match(T__1);
			setState(71);
			node_properties();
			setState(72);
			match(T__3);
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
	public static class Node_propertiesContext extends ParserRuleContext {
		public List<TerminalNode> COLOR() { return getTokens(GRAPHenParser.COLOR); }
		public TerminalNode COLOR(int i) {
			return getToken(GRAPHenParser.COLOR, i);
		}
		public TerminalNode NODE_SHAPE() { return getToken(GRAPHenParser.NODE_SHAPE, 0); }
		public List<TerminalNode> POS_NUMBER() { return getTokens(GRAPHenParser.POS_NUMBER); }
		public TerminalNode POS_NUMBER(int i) {
			return getToken(GRAPHenParser.POS_NUMBER, i);
		}
		public TerminalNode LINE_TYPE() { return getToken(GRAPHenParser.LINE_TYPE, 0); }
<<<<<<< HEAD
		public TerminalNode TEXT() { return getToken(GRAPHenParser.TEXT, 0); }
=======
		public TerminalNode NUMBER() { return getToken(GRAPHenParser.NUMBER, 0); }
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
		public Node_propertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterNode_properties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitNode_properties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitNode_properties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_propertiesContext node_properties() throws RecognitionException {
		Node_propertiesContext _localctx = new Node_propertiesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_node_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(74);
				match(T__4);
<<<<<<< HEAD
				{
				setState(75);
				match(TEXT);
=======
				setState(75);
				_la = _input.LA(1);
				if ( !(_la==POS_NUMBER || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				}
				}
			}

			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(78);
				match(T__5);
				setState(79);
				match(T__6);
				setState(80);
				match(COLOR);
				}
				break;
			}
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(83);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(84);
				match(T__8);
				setState(85);
				match(COLOR);
				}
				break;
			}
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(88);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(89);
				match(T__9);
				setState(90);
				match(NODE_SHAPE);
				}
				break;
			}
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(94);
				match(T__10);
				setState(95);
				match(POS_NUMBER);
				}
				break;
			}
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(98);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(99);
				match(T__11);
				setState(100);
				match(POS_NUMBER);
				}
				break;
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__7) {
				{
				setState(103);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(104);
				match(T__12);
				setState(105);
				match(LINE_TYPE);
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
	public static class Edge_definitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GRAPHenParser.IDENTIFIER, 0); }
		public Edge_propertiesContext edge_properties() {
			return getRuleContext(Edge_propertiesContext.class,0);
		}
		public Edge_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterEdge_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitEdge_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitEdge_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_definitionContext edge_definition() throws RecognitionException {
		Edge_definitionContext _localctx = new Edge_definitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_edge_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__13);
			setState(109);
			match(IDENTIFIER);
			setState(110);
			match(T__1);
			setState(111);
			edge_properties();
			setState(112);
			match(T__2);
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
	public static class Edge_inlineContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GRAPHenParser.IDENTIFIER, 0); }
		public Edge_propertiesContext edge_properties() {
			return getRuleContext(Edge_propertiesContext.class,0);
		}
		public Edge_inlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_inline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterEdge_inline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitEdge_inline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitEdge_inline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_inlineContext edge_inline() throws RecognitionException {
		Edge_inlineContext _localctx = new Edge_inlineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_edge_inline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__13);
			setState(115);
			match(IDENTIFIER);
			setState(116);
			match(T__1);
			setState(117);
			edge_properties();
			setState(118);
			match(T__3);
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
	public static class Edge_propertiesContext extends ParserRuleContext {
		public TerminalNode LINE_TYPE() { return getToken(GRAPHenParser.LINE_TYPE, 0); }
		public TerminalNode COLOR() { return getToken(GRAPHenParser.COLOR, 0); }
		public TerminalNode NUMBER() { return getToken(GRAPHenParser.NUMBER, 0); }
<<<<<<< HEAD
		public TerminalNode POS_NUMBER() { return getToken(GRAPHenParser.POS_NUMBER, 0); }
=======
		public List<TerminalNode> POS_NUMBER() { return getTokens(GRAPHenParser.POS_NUMBER); }
		public TerminalNode POS_NUMBER(int i) {
			return getToken(GRAPHenParser.POS_NUMBER, i);
		}
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
		public Edge_propertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterEdge_properties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitEdge_properties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitEdge_properties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_propertiesContext edge_properties() throws RecognitionException {
		Edge_propertiesContext _localctx = new Edge_propertiesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_edge_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
<<<<<<< HEAD
			if (_la==T__14) {
				{
				setState(120);
				match(T__14);
				{
				setState(121);
				match(NUMBER);
=======
			if (_la==T__4) {
				{
				setState(120);
				match(T__4);
				setState(121);
				_la = _input.LA(1);
				if ( !(_la==POS_NUMBER || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				}
				}
			}

			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(124);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(125);
<<<<<<< HEAD
				match(T__15);
=======
				match(T__14);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				setState(126);
				match(POS_NUMBER);
				}
				}
				break;
			}
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(129);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(130);
<<<<<<< HEAD
				match(T__16);
=======
				match(T__15);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				setState(131);
				match(COLOR);
				}
				break;
			}
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
<<<<<<< HEAD
			match(T__17);
=======
			match(T__16);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
			setState(136);
			match(LINE_TYPE);
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
	public static class Graph_definitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GRAPHenParser.IDENTIFIER, 0); }
		public Graph_addContext graph_add() {
			return getRuleContext(Graph_addContext.class,0);
		}
		public Graph_substractContext graph_substract() {
			return getRuleContext(Graph_substractContext.class,0);
		}
		public Edge_listContext edge_list() {
			return getRuleContext(Edge_listContext.class,0);
		}
		public Graph_functionContext graph_function() {
			return getRuleContext(Graph_functionContext.class,0);
		}
		public Graph_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterGraph_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitGraph_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitGraph_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graph_definitionContext graph_definition() throws RecognitionException {
		Graph_definitionContext _localctx = new Graph_definitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_graph_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
<<<<<<< HEAD
			match(T__18);
=======
			match(T__17);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
			setState(139);
			match(IDENTIFIER);
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				{
				setState(140);
				match(T__1);
				setState(141);
				edge_list();
				setState(148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(142);
					match(T__2);
					}
					break;
<<<<<<< HEAD
				case T__19:
					{
					{
					setState(143);
					match(T__19);
=======
				case T__18:
					{
					{
					setState(143);
					match(T__18);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
					setState(144);
					graph_function();
					}
					setState(146);
<<<<<<< HEAD
					match(T__20);
=======
					match(T__19);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 2:
				{
				setState(150);
<<<<<<< HEAD
				match(T__21);
=======
				match(T__20);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				setState(151);
				graph_add();
				}
				break;
			case 3:
				{
				setState(152);
<<<<<<< HEAD
				match(T__21);
=======
				match(T__20);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				setState(153);
				graph_substract();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Digraph_definitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GRAPHenParser.IDENTIFIER, 0); }
		public Digraph_addContext digraph_add() {
			return getRuleContext(Digraph_addContext.class,0);
		}
		public Digraph_substractContext digraph_substract() {
			return getRuleContext(Digraph_substractContext.class,0);
		}
		public Dedge_listContext dedge_list() {
			return getRuleContext(Dedge_listContext.class,0);
		}
		public Graph_functionContext graph_function() {
			return getRuleContext(Graph_functionContext.class,0);
		}
		public Digraph_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digraph_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterDigraph_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitDigraph_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitDigraph_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Digraph_definitionContext digraph_definition() throws RecognitionException {
		Digraph_definitionContext _localctx = new Digraph_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_digraph_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
<<<<<<< HEAD
			match(T__22);
=======
			match(T__21);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
			setState(157);
			match(IDENTIFIER);
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				{
				setState(158);
				match(T__1);
				setState(159);
				dedge_list();
				setState(160);
				match(T__3);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
<<<<<<< HEAD
				if (_la==T__23) {
					{
					setState(161);
					match(T__23);
=======
				if (_la==T__22) {
					{
					setState(161);
					match(T__22);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
					setState(162);
					graph_function();
					}
				}

				setState(165);
<<<<<<< HEAD
				match(T__20);
=======
				match(T__19);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				}
				}
				break;
			case 2:
				{
				setState(167);
<<<<<<< HEAD
				match(T__21);
=======
				match(T__20);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				setState(168);
				digraph_add();
				}
				break;
			case 3:
				{
				setState(169);
<<<<<<< HEAD
				match(T__21);
=======
				match(T__20);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				setState(170);
				digraph_substract();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Edge_listContext extends ParserRuleContext {
		public List<Edge_relationContext> edge_relation() {
			return getRuleContexts(Edge_relationContext.class);
		}
		public Edge_relationContext edge_relation(int i) {
			return getRuleContext(Edge_relationContext.class,i);
		}
		public Edge_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterEdge_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitEdge_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitEdge_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_listContext edge_list() throws RecognitionException {
		Edge_listContext _localctx = new Edge_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_edge_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			edge_relation();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__7) {
				{
				{
				setState(174);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(175);
				edge_relation();
				}
				}
				setState(180);
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
	public static class Edge_relationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GRAPHenParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GRAPHenParser.IDENTIFIER, i);
		}
		public List<Node_inlineContext> node_inline() {
			return getRuleContexts(Node_inlineContext.class);
		}
		public Node_inlineContext node_inline(int i) {
			return getRuleContext(Node_inlineContext.class,i);
		}
		public Edge_inlineContext edge_inline() {
			return getRuleContext(Edge_inlineContext.class,0);
		}
		public Edge_relationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterEdge_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitEdge_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitEdge_relation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_relationContext edge_relation() throws RecognitionException {
		Edge_relationContext _localctx = new Edge_relationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_edge_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(181);
				match(IDENTIFIER);
				}
				break;
			case T__0:
				{
				setState(182);
				node_inline();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(185);
<<<<<<< HEAD
			match(T__24);
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
=======
			match(T__23);
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(187);
				match(IDENTIFIER);
				}
				break;
			case T__13:
				{
				setState(188);
				edge_inline();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(191);
<<<<<<< HEAD
			match(T__27);
=======
			match(T__26);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(194);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(192);
					match(IDENTIFIER);
					}
					break;
				case T__0:
					{
					setState(193);
					node_inline();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==IDENTIFIER );
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
	public static class Dedge_listContext extends ParserRuleContext {
		public List<Dedge_relationContext> dedge_relation() {
			return getRuleContexts(Dedge_relationContext.class);
		}
		public Dedge_relationContext dedge_relation(int i) {
			return getRuleContext(Dedge_relationContext.class,i);
		}
		public Dedge_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dedge_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterDedge_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitDedge_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitDedge_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dedge_listContext dedge_list() throws RecognitionException {
		Dedge_listContext _localctx = new Dedge_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dedge_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			dedge_relation();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__7) {
				{
				{
				setState(199);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(200);
				dedge_relation();
				}
				}
				setState(205);
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
	public static class Dedge_relationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GRAPHenParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GRAPHenParser.IDENTIFIER, i);
		}
		public List<Node_inlineContext> node_inline() {
			return getRuleContexts(Node_inlineContext.class);
		}
		public Node_inlineContext node_inline(int i) {
			return getRuleContext(Node_inlineContext.class,i);
		}
		public Edge_inlineContext edge_inline() {
			return getRuleContext(Edge_inlineContext.class,0);
		}
		public Dedge_relationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dedge_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterDedge_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitDedge_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitDedge_relation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dedge_relationContext dedge_relation() throws RecognitionException {
		Dedge_relationContext _localctx = new Dedge_relationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dedge_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(206);
				match(IDENTIFIER);
				}
				break;
			case T__0:
				{
				setState(207);
				node_inline();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(210);
<<<<<<< HEAD
			match(T__24);
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__29) ) {
=======
			match(T__23);
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(212);
				match(IDENTIFIER);
				}
				break;
			case T__13:
				{
				setState(213);
				edge_inline();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(216);
<<<<<<< HEAD
			match(T__27);
=======
			match(T__26);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(219);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(217);
					match(IDENTIFIER);
					}
					break;
				case T__0:
					{
					setState(218);
					node_inline();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==IDENTIFIER );
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
	public static class Graph_functionContext extends ParserRuleContext {
		public ExportToFileFuncContext exportToFileFunc() {
			return getRuleContext(ExportToFileFuncContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(GRAPHenParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GRAPHenParser.IDENTIFIER, i);
		}
		public Graph_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterGraph_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitGraph_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitGraph_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graph_functionContext graph_function() throws RecognitionException {
		Graph_functionContext _localctx = new Graph_functionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_graph_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
<<<<<<< HEAD
			case T__38:
=======
			case T__37:
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				{
				setState(223);
				exportToFileFunc();
				}
				break;
<<<<<<< HEAD
			case T__30:
				{
				setState(224);
				match(T__30);
=======
			case T__29:
				{
				setState(224);
				match(T__29);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				setState(225);
				match(IDENTIFIER);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5 || _la==T__7) {
					{
					{
					setState(226);
					_la = _input.LA(1);
					if ( !(_la==T__5 || _la==T__7) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(227);
					match(IDENTIFIER);
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
<<<<<<< HEAD
=======
				match(T__30);
				}
				break;
			case T__31:
				{
				setState(234);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				match(T__31);
				}
				break;
			case T__32:
				{
<<<<<<< HEAD
				setState(234);
=======
				setState(235);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				match(T__32);
				}
				break;
			case T__33:
				{
<<<<<<< HEAD
				setState(235);
				match(T__33);
				}
				break;
			case T__34:
				{
				setState(236);
				match(T__34);
=======
				setState(236);
				match(T__33);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Graph_function_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GRAPHenParser.IDENTIFIER, 0); }
		public Graph_functionContext graph_function() {
			return getRuleContext(Graph_functionContext.class,0);
		}
		public Graph_function_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_function_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterGraph_function_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitGraph_function_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitGraph_function_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graph_function_statementContext graph_function_statement() throws RecognitionException {
		Graph_function_statementContext _localctx = new Graph_function_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_graph_function_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(IDENTIFIER);
			setState(240);
<<<<<<< HEAD
			match(T__23);
			setState(241);
			graph_function();
			setState(242);
			match(T__20);
=======
			match(T__22);
			setState(241);
			graph_function();
			setState(242);
			match(T__19);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
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
	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fileFormat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
<<<<<<< HEAD
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337152L) != 0)) ) {
=======
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExportToFileFuncContext extends ParserRuleContext {
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GRAPHenParser.IDENTIFIER, 0); }
		public ExportToFileFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportToFileFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterExportToFileFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitExportToFileFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitExportToFileFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportToFileFuncContext exportToFileFunc() throws RecognitionException {
		ExportToFileFuncContext _localctx = new ExportToFileFuncContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exportToFileFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
<<<<<<< HEAD
			match(T__38);
			setState(247);
			match(T__39);
=======
			match(T__37);
			setState(247);
			match(T__38);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
			setState(248);
			fileFormat();
			setState(249);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(250);
<<<<<<< HEAD
			match(T__40);
			setState(251);
			match(IDENTIFIER);
			setState(252);
			match(T__27);
=======
			match(T__39);
			setState(251);
			match(IDENTIFIER);
			setState(252);
			match(T__26);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
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
	public static class Graph_addContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GRAPHenParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GRAPHenParser.IDENTIFIER, i);
		}
		public List<Graph_definitionContext> graph_definition() {
			return getRuleContexts(Graph_definitionContext.class);
		}
		public Graph_definitionContext graph_definition(int i) {
			return getRuleContext(Graph_definitionContext.class,i);
		}
		public Graph_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterGraph_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitGraph_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitGraph_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graph_addContext graph_add() throws RecognitionException {
		Graph_addContext _localctx = new Graph_addContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_graph_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(254);
				match(IDENTIFIER);
				}
				break;
<<<<<<< HEAD
			case T__18:
=======
			case T__17:
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				{
				setState(255);
				graph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(258);
<<<<<<< HEAD
			match(T__41);
=======
			match(T__40);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(259);
				match(IDENTIFIER);
				}
				break;
<<<<<<< HEAD
			case T__18:
=======
			case T__17:
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				{
				setState(260);
				graph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Digraph_addContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GRAPHenParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GRAPHenParser.IDENTIFIER, i);
		}
		public List<Digraph_definitionContext> digraph_definition() {
			return getRuleContexts(Digraph_definitionContext.class);
		}
		public Digraph_definitionContext digraph_definition(int i) {
			return getRuleContext(Digraph_definitionContext.class,i);
		}
		public Digraph_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digraph_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterDigraph_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitDigraph_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitDigraph_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Digraph_addContext digraph_add() throws RecognitionException {
		Digraph_addContext _localctx = new Digraph_addContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_digraph_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(263);
				match(IDENTIFIER);
				}
				break;
<<<<<<< HEAD
			case T__22:
=======
			case T__21:
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				{
				setState(264);
				digraph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(267);
<<<<<<< HEAD
			match(T__41);
=======
			match(T__40);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(268);
				match(IDENTIFIER);
				}
				break;
<<<<<<< HEAD
			case T__22:
=======
			case T__21:
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				{
				setState(269);
				digraph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Graph_substractContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GRAPHenParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GRAPHenParser.IDENTIFIER, i);
		}
		public List<Graph_definitionContext> graph_definition() {
			return getRuleContexts(Graph_definitionContext.class);
		}
		public Graph_definitionContext graph_definition(int i) {
			return getRuleContext(Graph_definitionContext.class,i);
		}
		public Graph_substractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_substract; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterGraph_substract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitGraph_substract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitGraph_substract(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graph_substractContext graph_substract() throws RecognitionException {
		Graph_substractContext _localctx = new Graph_substractContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_graph_substract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(272);
				match(IDENTIFIER);
				}
				break;
<<<<<<< HEAD
			case T__18:
=======
			case T__17:
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				{
				setState(273);
				graph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(276);
<<<<<<< HEAD
			match(T__42);
=======
			match(T__41);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(277);
				match(IDENTIFIER);
				}
				break;
<<<<<<< HEAD
			case T__18:
=======
			case T__17:
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				{
				setState(278);
				graph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(281);
<<<<<<< HEAD
			match(T__20);
=======
			match(T__19);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
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
	public static class Digraph_substractContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GRAPHenParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GRAPHenParser.IDENTIFIER, i);
		}
		public List<Digraph_definitionContext> digraph_definition() {
			return getRuleContexts(Digraph_definitionContext.class);
		}
		public Digraph_definitionContext digraph_definition(int i) {
			return getRuleContext(Digraph_definitionContext.class,i);
		}
		public Digraph_substractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digraph_substract; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterDigraph_substract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitDigraph_substract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitDigraph_substract(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Digraph_substractContext digraph_substract() throws RecognitionException {
		Digraph_substractContext _localctx = new Digraph_substractContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_digraph_substract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(283);
				match(IDENTIFIER);
				}
				break;
<<<<<<< HEAD
			case T__22:
=======
			case T__21:
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				{
				setState(284);
				digraph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(287);
<<<<<<< HEAD
			match(T__42);
=======
			match(T__41);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(288);
				match(IDENTIFIER);
				}
				break;
<<<<<<< HEAD
			case T__22:
=======
			case T__21:
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
				{
				setState(289);
				digraph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(292);
<<<<<<< HEAD
			match(T__20);
=======
			match(T__19);
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
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
<<<<<<< HEAD
		"\u0004\u0001@\u0127\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
=======
		"\u0004\u0001>\u0127\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0004\u0000.\b\u0000\u000b\u0000\f\u0000/\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004M\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004R\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004W\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\\\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004a\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004f\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004k\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"{\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0080\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0085\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0095\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u009b\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00a4\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00ac\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u00b1\b\n"+
		"\n\n\f\n\u00b4\t\n\u0001\u000b\u0001\u000b\u0003\u000b\u00b8\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00be\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00c3\b\u000b\u000b\u000b\f"+
		"\u000b\u00c4\u0001\f\u0001\f\u0001\f\u0005\f\u00ca\b\f\n\f\f\f\u00cd\t"+
		"\f\u0001\r\u0001\r\u0003\r\u00d1\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00d7\b\r\u0001\r\u0001\r\u0001\r\u0004\r\u00dc\b\r\u000b\r\f\r\u00dd"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00e5\b\u000e\n\u000e\f\u000e\u00e8\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00ee\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u0101\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0106\b\u0012\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u010a\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u010f"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0113\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0118\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u011e\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0123\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0000\u0000\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
<<<<<<< HEAD
		"\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0004\u0002\u0000\u0006\u0006"+
		"\b\b\u0001\u0000\u001a\u001b\u0001\u0000\u001d\u001e\u0001\u0000$&\u0140"+
		"\u0000-\u0001\u0000\u0000\u0000\u0002<\u0001\u0000\u0000\u0000\u0004>"+
		"\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000\u0000\bL\u0001\u0000"+
		"\u0000\u0000\nl\u0001\u0000\u0000\u0000\fr\u0001\u0000\u0000\u0000\u000e"+
		"z\u0001\u0000\u0000\u0000\u0010\u008a\u0001\u0000\u0000\u0000\u0012\u009c"+
		"\u0001\u0000\u0000\u0000\u0014\u00ad\u0001\u0000\u0000\u0000\u0016\u00b7"+
		"\u0001\u0000\u0000\u0000\u0018\u00c6\u0001\u0000\u0000\u0000\u001a\u00d0"+
		"\u0001\u0000\u0000\u0000\u001c\u00ed\u0001\u0000\u0000\u0000\u001e\u00ef"+
		"\u0001\u0000\u0000\u0000 \u00f4\u0001\u0000\u0000\u0000\"\u00f6\u0001"+
		"\u0000\u0000\u0000$\u0100\u0001\u0000\u0000\u0000&\u0109\u0001\u0000\u0000"+
		"\u0000(\u0112\u0001\u0000\u0000\u0000*\u011d\u0001\u0000\u0000\u0000,"+
		".\u0003\u0002\u0001\u0000-,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u000012\u0005\u0000\u0000\u00012\u0001\u0001\u0000\u0000\u0000"+
		"3=\u0003\u0004\u0002\u00004=\u0003\n\u0005\u00005=\u0003\u0012\t\u0000"+
		"6=\u0003\u0010\b\u00007=\u0003\u001e\u000f\u00008=\u0003$\u0012\u0000"+
		"9=\u0003(\u0014\u0000:=\u0003&\u0013\u0000;=\u0003*\u0015\u0000<3\u0001"+
		"\u0000\u0000\u0000<4\u0001\u0000\u0000\u0000<5\u0001\u0000\u0000\u0000"+
		"<6\u0001\u0000\u0000\u0000<7\u0001\u0000\u0000\u0000<8\u0001\u0000\u0000"+
		"\u0000<9\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<;\u0001\u0000"+
		"\u0000\u0000=\u0003\u0001\u0000\u0000\u0000>?\u0005\u0001\u0000\u0000"+
		"?@\u0005/\u0000\u0000@A\u0005\u0002\u0000\u0000AB\u0003\b\u0004\u0000"+
		"BC\u0005\u0003\u0000\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0005\u0001"+
		"\u0000\u0000EF\u0005/\u0000\u0000FG\u0005\u0002\u0000\u0000GH\u0003\b"+
		"\u0004\u0000HI\u0005\u0004\u0000\u0000I\u0007\u0001\u0000\u0000\u0000"+
		"JK\u0005\u0005\u0000\u0000KM\u00050\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000MQ\u0001\u0000\u0000\u0000NO\u0005\u0006\u0000"+
		"\u0000OP\u0005\u0007\u0000\u0000PR\u0005=\u0000\u0000QN\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RV\u0001\u0000\u0000\u0000ST\u0007\u0000"+
		"\u0000\u0000TU\u0005\t\u0000\u0000UW\u0005=\u0000\u0000VS\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000W[\u0001\u0000\u0000\u0000XY\u0007"+
		"\u0000\u0000\u0000YZ\u0005\n\u0000\u0000Z\\\u0005@\u0000\u0000[X\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\`\u0001\u0000\u0000\u0000"+
		"]^\u0007\u0000\u0000\u0000^_\u0005\u000b\u0000\u0000_a\u0005-\u0000\u0000"+
		"`]\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ae\u0001\u0000\u0000"+
		"\u0000bc\u0007\u0000\u0000\u0000cd\u0005\f\u0000\u0000df\u0005-\u0000"+
		"\u0000eb\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fj\u0001\u0000"+
		"\u0000\u0000gh\u0007\u0000\u0000\u0000hi\u0005\r\u0000\u0000ik\u0005?"+
		"\u0000\u0000jg\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\t\u0001"+
		"\u0000\u0000\u0000lm\u0005\u000e\u0000\u0000mn\u0005/\u0000\u0000no\u0005"+
		"\u0002\u0000\u0000op\u0003\u000e\u0007\u0000pq\u0005\u0003\u0000\u0000"+
		"q\u000b\u0001\u0000\u0000\u0000rs\u0005\u000e\u0000\u0000st\u0005/\u0000"+
		"\u0000tu\u0005\u0002\u0000\u0000uv\u0003\u000e\u0007\u0000vw\u0005\u0004"+
		"\u0000\u0000w\r\u0001\u0000\u0000\u0000xy\u0005\u000f\u0000\u0000y{\u0005"+
		".\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u007f"+
		"\u0001\u0000\u0000\u0000|}\u0007\u0000\u0000\u0000}~\u0005\u0010\u0000"+
		"\u0000~\u0080\u0005-\u0000\u0000\u007f|\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0084\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0007\u0000\u0000\u0000\u0082\u0083\u0005\u0011\u0000\u0000\u0083"+
		"\u0085\u0005=\u0000\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0007\u0000\u0000\u0000\u0087\u0088\u0005\u0012\u0000\u0000\u0088\u0089"+
		"\u0005?\u0000\u0000\u0089\u000f\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		"\u0013\u0000\u0000\u008b\u009a\u0005/\u0000\u0000\u008c\u008d\u0005\u0002"+
		"\u0000\u0000\u008d\u0094\u0003\u0014\n\u0000\u008e\u0095\u0005\u0003\u0000"+
		"\u0000\u008f\u0090\u0005\u0014\u0000\u0000\u0090\u0091\u0003\u001c\u000e"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0015\u0000"+
		"\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u008e\u0001\u0000\u0000"+
		"\u0000\u0094\u008f\u0001\u0000\u0000\u0000\u0095\u009b\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005\u0016\u0000\u0000\u0097\u009b\u0003$\u0012\u0000"+
		"\u0098\u0099\u0005\u0016\u0000\u0000\u0099\u009b\u0003(\u0014\u0000\u009a"+
		"\u008c\u0001\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000\u0000\u009a"+
		"\u0098\u0001\u0000\u0000\u0000\u009b\u0011\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005\u0017\u0000\u0000\u009d\u00ab\u0005/\u0000\u0000\u009e\u009f"+
		"\u0005\u0002\u0000\u0000\u009f\u00a0\u0003\u0018\f\u0000\u00a0\u00a3\u0005"+
		"\u0004\u0000\u0000\u00a1\u00a2\u0005\u0018\u0000\u0000\u00a2\u00a4\u0003"+
		"\u001c\u000e\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		"\u0015\u0000\u0000\u00a6\u00ac\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"\u0016\u0000\u0000\u00a8\u00ac\u0003&\u0013\u0000\u00a9\u00aa\u0005\u0016"+
		"\u0000\u0000\u00aa\u00ac\u0003*\u0015\u0000\u00ab\u009e\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ac\u0013\u0001\u0000\u0000\u0000\u00ad\u00b2\u0003\u0016\u000b"+
		"\u0000\u00ae\u00af\u0007\u0000\u0000\u0000\u00af\u00b1\u0003\u0016\u000b"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u0015\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b8\u0005/\u0000\u0000\u00b6\u00b8\u0003\u0006\u0003\u0000"+
		"\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0019\u0000\u0000"+
		"\u00ba\u00bd\u0007\u0001\u0000\u0000\u00bb\u00be\u0005/\u0000\u0000\u00bc"+
		"\u00be\u0003\f\u0006\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c2"+
		"\u0005\u001c\u0000\u0000\u00c0\u00c3\u0005/\u0000\u0000\u00c1\u00c3\u0003"+
		"\u0006\u0003\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u0017\u0001"+
		"\u0000\u0000\u0000\u00c6\u00cb\u0003\u001a\r\u0000\u00c7\u00c8\u0007\u0000"+
		"\u0000\u0000\u00c8\u00ca\u0003\u001a\r\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u0019\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d1\u0005/\u0000\u0000"+
		"\u00cf\u00d1\u0003\u0006\u0003\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005\u0019\u0000\u0000\u00d3\u00d6\u0007\u0002\u0000\u0000"+
		"\u00d4\u00d7\u0005/\u0000\u0000\u00d5\u00d7\u0003\f\u0006\u0000\u00d6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\u00db\u0005\u001c\u0000\u0000\u00d9"+
		"\u00dc\u0005/\u0000\u0000\u00da\u00dc\u0003\u0006\u0003\u0000\u00db\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u001b\u0001\u0000\u0000\u0000\u00df\u00ee"+
		"\u0003\"\u0011\u0000\u00e0\u00e1\u0005\u001f\u0000\u0000\u00e1\u00e6\u0005"+
		"/\u0000\u0000\u00e2\u00e3\u0007\u0000\u0000\u0000\u00e3\u00e5\u0005/\u0000"+
		"\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ee\u0005 \u0000\u0000\u00ea\u00ee\u0005!\u0000\u0000\u00eb"+
		"\u00ee\u0005\"\u0000\u0000\u00ec\u00ee\u0005#\u0000\u0000\u00ed\u00df"+
		"\u0001\u0000\u0000\u0000\u00ed\u00e0\u0001\u0000\u0000\u0000\u00ed\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ee\u001d\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0005/\u0000\u0000\u00f0\u00f1\u0005\u0018\u0000\u0000\u00f1\u00f2\u0003"+
		"\u001c\u000e\u0000\u00f2\u00f3\u0005\u0015\u0000\u0000\u00f3\u001f\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0007\u0003\u0000\u0000\u00f5!\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005\'\u0000\u0000\u00f7\u00f8\u0005(\u0000"+
		"\u0000\u00f8\u00f9\u0003 \u0010\u0000\u00f9\u00fa\u0007\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0005)\u0000\u0000\u00fb\u00fc\u0005/\u0000\u0000\u00fc\u00fd"+
		"\u0005\u001c\u0000\u0000\u00fd#\u0001\u0000\u0000\u0000\u00fe\u0101\u0005"+
		"/\u0000\u0000\u00ff\u0101\u0003\u0010\b\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u0102\u0105\u0005*\u0000\u0000\u0103\u0106\u0005/\u0000\u0000"+
		"\u0104\u0106\u0003\u0010\b\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105"+
		"\u0104\u0001\u0000\u0000\u0000\u0106%\u0001\u0000\u0000\u0000\u0107\u010a"+
		"\u0005/\u0000\u0000\u0108\u010a\u0003\u0012\t\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001"+
		"\u0000\u0000\u0000\u010b\u010e\u0005*\u0000\u0000\u010c\u010f\u0005/\u0000"+
		"\u0000\u010d\u010f\u0003\u0012\t\u0000\u010e\u010c\u0001\u0000\u0000\u0000"+
		"\u010e\u010d\u0001\u0000\u0000\u0000\u010f\'\u0001\u0000\u0000\u0000\u0110"+
		"\u0113\u0005/\u0000\u0000\u0111\u0113\u0003\u0010\b\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0001\u0000\u0000\u0000\u0114\u0117\u0005+\u0000\u0000\u0115\u0118\u0005"+
		"/\u0000\u0000\u0116\u0118\u0003\u0010\b\u0000\u0117\u0115\u0001\u0000"+
		"\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0005\u0015\u0000\u0000\u011a)\u0001\u0000\u0000"+
		"\u0000\u011b\u011e\u0005/\u0000\u0000\u011c\u011e\u0003\u0012\t\u0000"+
		"\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0122\u0005+\u0000\u0000\u0120"+
		"\u0123\u0005/\u0000\u0000\u0121\u0123\u0003\u0012\t\u0000\u0122\u0120"+
		"\u0001\u0000\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u0015\u0000\u0000\u0125+\u0001"+
		"\u0000\u0000\u0000$/<LQV[`ejz\u007f\u0084\u0094\u009a\u00a3\u00ab\u00b2"+
		"\u00b7\u00bd\u00c2\u00c4\u00cb\u00d0\u00d6\u00db\u00dd\u00e6\u00ed\u0100"+
		"\u0105\u0109\u010e\u0112\u0117\u011d\u0122";
=======
		"\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0005\u0001\u0000,-\u0002"+
		"\u0000\u0006\u0006\b\b\u0001\u0000\u0019\u001a\u0001\u0000\u001c\u001d"+
		"\u0001\u0000#%\u0140\u0000-\u0001\u0000\u0000\u0000\u0002<\u0001\u0000"+
		"\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000\u0000"+
		"\bL\u0001\u0000\u0000\u0000\nl\u0001\u0000\u0000\u0000\fr\u0001\u0000"+
		"\u0000\u0000\u000ez\u0001\u0000\u0000\u0000\u0010\u008a\u0001\u0000\u0000"+
		"\u0000\u0012\u009c\u0001\u0000\u0000\u0000\u0014\u00ad\u0001\u0000\u0000"+
		"\u0000\u0016\u00b7\u0001\u0000\u0000\u0000\u0018\u00c6\u0001\u0000\u0000"+
		"\u0000\u001a\u00d0\u0001\u0000\u0000\u0000\u001c\u00ed\u0001\u0000\u0000"+
		"\u0000\u001e\u00ef\u0001\u0000\u0000\u0000 \u00f4\u0001\u0000\u0000\u0000"+
		"\"\u00f6\u0001\u0000\u0000\u0000$\u0100\u0001\u0000\u0000\u0000&\u0109"+
		"\u0001\u0000\u0000\u0000(\u0112\u0001\u0000\u0000\u0000*\u011d\u0001\u0000"+
		"\u0000\u0000,.\u0003\u0002\u0001\u0000-,\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u000012\u0005\u0000\u0000\u00012\u0001\u0001\u0000"+
		"\u0000\u00003=\u0003\u0004\u0002\u00004=\u0003\n\u0005\u00005=\u0003\u0012"+
		"\t\u00006=\u0003\u0010\b\u00007=\u0003\u001e\u000f\u00008=\u0003$\u0012"+
		"\u00009=\u0003(\u0014\u0000:=\u0003&\u0013\u0000;=\u0003*\u0015\u0000"+
		"<3\u0001\u0000\u0000\u0000<4\u0001\u0000\u0000\u0000<5\u0001\u0000\u0000"+
		"\u0000<6\u0001\u0000\u0000\u0000<7\u0001\u0000\u0000\u0000<8\u0001\u0000"+
		"\u0000\u0000<9\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<;\u0001"+
		"\u0000\u0000\u0000=\u0003\u0001\u0000\u0000\u0000>?\u0005\u0001\u0000"+
		"\u0000?@\u0005.\u0000\u0000@A\u0005\u0002\u0000\u0000AB\u0003\b\u0004"+
		"\u0000BC\u0005\u0003\u0000\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0005"+
		"\u0001\u0000\u0000EF\u0005.\u0000\u0000FG\u0005\u0002\u0000\u0000GH\u0003"+
		"\b\u0004\u0000HI\u0005\u0004\u0000\u0000I\u0007\u0001\u0000\u0000\u0000"+
		"JK\u0005\u0005\u0000\u0000KM\u0007\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MQ\u0001\u0000\u0000\u0000NO\u0005\u0006"+
		"\u0000\u0000OP\u0005\u0007\u0000\u0000PR\u0005;\u0000\u0000QN\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RV\u0001\u0000\u0000\u0000ST\u0007"+
		"\u0001\u0000\u0000TU\u0005\t\u0000\u0000UW\u0005;\u0000\u0000VS\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W[\u0001\u0000\u0000\u0000"+
		"XY\u0007\u0001\u0000\u0000YZ\u0005\n\u0000\u0000Z\\\u0005>\u0000\u0000"+
		"[X\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\`\u0001\u0000\u0000"+
		"\u0000]^\u0007\u0001\u0000\u0000^_\u0005\u000b\u0000\u0000_a\u0005,\u0000"+
		"\u0000`]\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ae\u0001\u0000"+
		"\u0000\u0000bc\u0007\u0001\u0000\u0000cd\u0005\f\u0000\u0000df\u0005,"+
		"\u0000\u0000eb\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fj\u0001"+
		"\u0000\u0000\u0000gh\u0007\u0001\u0000\u0000hi\u0005\r\u0000\u0000ik\u0005"+
		"=\u0000\u0000jg\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\t\u0001"+
		"\u0000\u0000\u0000lm\u0005\u000e\u0000\u0000mn\u0005.\u0000\u0000no\u0005"+
		"\u0002\u0000\u0000op\u0003\u000e\u0007\u0000pq\u0005\u0003\u0000\u0000"+
		"q\u000b\u0001\u0000\u0000\u0000rs\u0005\u000e\u0000\u0000st\u0005.\u0000"+
		"\u0000tu\u0005\u0002\u0000\u0000uv\u0003\u000e\u0007\u0000vw\u0005\u0004"+
		"\u0000\u0000w\r\u0001\u0000\u0000\u0000xy\u0005\u0005\u0000\u0000y{\u0007"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{\u007f\u0001\u0000\u0000\u0000|}\u0007\u0001\u0000\u0000}~\u0005\u000f"+
		"\u0000\u0000~\u0080\u0005,\u0000\u0000\u007f|\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0084\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0007\u0001\u0000\u0000\u0082\u0083\u0005\u0010\u0000\u0000"+
		"\u0083\u0085\u0005;\u0000\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0007\u0001\u0000\u0000\u0087\u0088\u0005\u0011\u0000\u0000\u0088"+
		"\u0089\u0005=\u0000\u0000\u0089\u000f\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005\u0012\u0000\u0000\u008b\u009a\u0005.\u0000\u0000\u008c\u008d\u0005"+
		"\u0002\u0000\u0000\u008d\u0094\u0003\u0014\n\u0000\u008e\u0095\u0005\u0003"+
		"\u0000\u0000\u008f\u0090\u0005\u0013\u0000\u0000\u0090\u0091\u0003\u001c"+
		"\u000e\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0014"+
		"\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u008e\u0001\u0000"+
		"\u0000\u0000\u0094\u008f\u0001\u0000\u0000\u0000\u0095\u009b\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005\u0015\u0000\u0000\u0097\u009b\u0003$\u0012"+
		"\u0000\u0098\u0099\u0005\u0015\u0000\u0000\u0099\u009b\u0003(\u0014\u0000"+
		"\u009a\u008c\u0001\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u0011\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0005\u0016\u0000\u0000\u009d\u00ab\u0005.\u0000\u0000\u009e"+
		"\u009f\u0005\u0002\u0000\u0000\u009f\u00a0\u0003\u0018\f\u0000\u00a0\u00a3"+
		"\u0005\u0004\u0000\u0000\u00a1\u00a2\u0005\u0017\u0000\u0000\u00a2\u00a4"+
		"\u0003\u001c\u000e\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0005\u0014\u0000\u0000\u00a6\u00ac\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005\u0015\u0000\u0000\u00a8\u00ac\u0003&\u0013\u0000\u00a9\u00aa\u0005"+
		"\u0015\u0000\u0000\u00aa\u00ac\u0003*\u0015\u0000\u00ab\u009e\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ac\u0013\u0001\u0000\u0000\u0000\u00ad\u00b2\u0003\u0016"+
		"\u000b\u0000\u00ae\u00af\u0007\u0001\u0000\u0000\u00af\u00b1\u0003\u0016"+
		"\u000b\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u0015\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b8\u0005.\u0000\u0000\u00b6\u00b8\u0003\u0006\u0003"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0018\u0000"+
		"\u0000\u00ba\u00bd\u0007\u0002\u0000\u0000\u00bb\u00be\u0005.\u0000\u0000"+
		"\u00bc\u00be\u0003\f\u0006\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c2\u0005\u001b\u0000\u0000\u00c0\u00c3\u0005.\u0000\u0000\u00c1\u00c3"+
		"\u0003\u0006\u0003\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u0017"+
		"\u0001\u0000\u0000\u0000\u00c6\u00cb\u0003\u001a\r\u0000\u00c7\u00c8\u0007"+
		"\u0001\u0000\u0000\u00c8\u00ca\u0003\u001a\r\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u0019\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d1\u0005.\u0000"+
		"\u0000\u00cf\u00d1\u0003\u0006\u0003\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0005\u0018\u0000\u0000\u00d3\u00d6\u0007\u0003\u0000"+
		"\u0000\u00d4\u00d7\u0005.\u0000\u0000\u00d5\u00d7\u0003\f\u0006\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00db\u0005\u001b\u0000\u0000"+
		"\u00d9\u00dc\u0005.\u0000\u0000\u00da\u00dc\u0003\u0006\u0003\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de\u001b\u0001\u0000\u0000\u0000\u00df"+
		"\u00ee\u0003\"\u0011\u0000\u00e0\u00e1\u0005\u001e\u0000\u0000\u00e1\u00e6"+
		"\u0005.\u0000\u0000\u00e2\u00e3\u0007\u0001\u0000\u0000\u00e3\u00e5\u0005"+
		".\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ee\u0005\u001f\u0000\u0000\u00ea\u00ee\u0005 \u0000"+
		"\u0000\u00eb\u00ee\u0005!\u0000\u0000\u00ec\u00ee\u0005\"\u0000\u0000"+
		"\u00ed\u00df\u0001\u0000\u0000\u0000\u00ed\u00e0\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u001d\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0005.\u0000\u0000\u00f0\u00f1\u0005\u0017\u0000\u0000\u00f1"+
		"\u00f2\u0003\u001c\u000e\u0000\u00f2\u00f3\u0005\u0014\u0000\u0000\u00f3"+
		"\u001f\u0001\u0000\u0000\u0000\u00f4\u00f5\u0007\u0004\u0000\u0000\u00f5"+
		"!\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005&\u0000\u0000\u00f7\u00f8\u0005"+
		"\'\u0000\u0000\u00f8\u00f9\u0003 \u0010\u0000\u00f9\u00fa\u0007\u0001"+
		"\u0000\u0000\u00fa\u00fb\u0005(\u0000\u0000\u00fb\u00fc\u0005.\u0000\u0000"+
		"\u00fc\u00fd\u0005\u001b\u0000\u0000\u00fd#\u0001\u0000\u0000\u0000\u00fe"+
		"\u0101\u0005.\u0000\u0000\u00ff\u0101\u0003\u0010\b\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0001\u0000\u0000\u0000\u0102\u0105\u0005)\u0000\u0000\u0103\u0106\u0005"+
		".\u0000\u0000\u0104\u0106\u0003\u0010\b\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106%\u0001\u0000\u0000"+
		"\u0000\u0107\u010a\u0005.\u0000\u0000\u0108\u010a\u0003\u0012\t\u0000"+
		"\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010e\u0005)\u0000\u0000\u010c"+
		"\u010f\u0005.\u0000\u0000\u010d\u010f\u0003\u0012\t\u0000\u010e\u010c"+
		"\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\'\u0001"+
		"\u0000\u0000\u0000\u0110\u0113\u0005.\u0000\u0000\u0111\u0113\u0003\u0010"+
		"\b\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0117\u0005*\u0000\u0000"+
		"\u0115\u0118\u0005.\u0000\u0000\u0116\u0118\u0003\u0010\b\u0000\u0117"+
		"\u0115\u0001\u0000\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u0014\u0000\u0000\u011a"+
		")\u0001\u0000\u0000\u0000\u011b\u011e\u0005.\u0000\u0000\u011c\u011e\u0003"+
		"\u0012\t\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011c\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0122\u0005*\u0000"+
		"\u0000\u0120\u0123\u0005.\u0000\u0000\u0121\u0123\u0003\u0012\t\u0000"+
		"\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u0014\u0000\u0000"+
		"\u0125+\u0001\u0000\u0000\u0000$/<LQV[`ejz\u007f\u0084\u0094\u009a\u00a3"+
		"\u00ab\u00b2\u00b7\u00bd\u00c2\u00c4\u00cb\u00d0\u00d6\u00db\u00dd\u00e6"+
		"\u00ed\u0100\u0105\u0109\u010e\u0112\u0117\u011d\u0122";
>>>>>>> 898ed96869aaef56a49dc6379fd7993789be94b1
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}