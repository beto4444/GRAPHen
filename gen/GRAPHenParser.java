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
		T__38=39, T__39=40, T__40=41, T__41=42, WS=43, POS_NUMBER=44, NUMBER=45, 
		IDENTIFIER=46, TEXT=47, LETTER=48, COLOR=49, HEXDIGIT=50, LINE_TYPE=51, 
		NODE_SHAPE=52;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_node_definition = 2, RULE_node_inline = 3, 
		RULE_node_properties = 4, RULE_edge_definition = 5, RULE_edge_inline = 6, 
		RULE_edge_properties = 7, RULE_graph_definition = 8, RULE_digraph_definition = 9, 
		RULE_edge_list = 10, RULE_edge_relation = 11, RULE_dedge_list = 12, RULE_dedge_relation = 13, 
		RULE_graph_function = 14, RULE_graph_function_statement = 15, RULE_fileFormat = 16, 
		RULE_colorNodesFunc = 17, RULE_colorEdgesFunc = 18, RULE_graph_add = 19, 
		RULE_digraph_add = 20, RULE_graph_substract = 21, RULE_digraph_substract = 22, 
		RULE_graph_union = 23, RULE_digraph_union = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "node_definition", "node_inline", "node_properties", 
			"edge_definition", "edge_inline", "edge_properties", "graph_definition", 
			"digraph_definition", "edge_list", "edge_relation", "dedge_list", "dedge_relation", 
			"graph_function", "graph_function_statement", "fileFormat", "colorNodesFunc", 
			"colorEdgesFunc", "graph_add", "digraph_add", "graph_substract", "digraph_substract", 
			"graph_union", "digraph_union"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Node '", "'{'", "' {'", "'};'", "'}'", "'nodeContents '", "'cColor '", 
			"'cSize'", "', '", "'fillColor '", "','", "'borderColor '", "'nodeShape '", 
			"'nodeSize '", "'borderWidth '", "'borderLineShape '", "'Edge '", "'Num_color '", 
			"'lineWidth'", "'Color '", "'lineType'", "'Graph '", "'}.'", "';'", "'='", 
			"'Digraph '", "'.'", "'('", "'<->'", "'<-> '", "')'", "'->'", "'-> '", 
			"'clearEdges()'", "'.png'", "'.svg'", "'.gren'", "'colorNodes()'", "'colorEdges()'", 
			"'+'", "'-'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "WS", "POS_NUMBER", "NUMBER", 
			"IDENTIFIER", "TEXT", "LETTER", "COLOR", "HEXDIGIT", "LINE_TYPE", "NODE_SHAPE"
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
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				statement();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 70368849166338L) != 0) );
			}
			setState(55);
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
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				node_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				edge_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				digraph_definition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				graph_definition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				graph_function_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				graph_add();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				graph_substract();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(64);
				digraph_add();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(65);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__0);
			setState(69);
			match(IDENTIFIER);
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__0);
			setState(75);
			match(IDENTIFIER);
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(77);
			node_properties();
			setState(78);
			match(T__4);
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
		public TerminalNode TEXT() { return getToken(GRAPHenParser.TEXT, 0); }
		public List<TerminalNode> COLOR() { return getTokens(GRAPHenParser.COLOR); }
		public TerminalNode COLOR(int i) {
			return getToken(GRAPHenParser.COLOR, i);
		}
		public List<TerminalNode> POS_NUMBER() { return getTokens(GRAPHenParser.POS_NUMBER); }
		public TerminalNode POS_NUMBER(int i) {
			return getToken(GRAPHenParser.POS_NUMBER, i);
		}
		public TerminalNode NODE_SHAPE() { return getToken(GRAPHenParser.NODE_SHAPE, 0); }
		public TerminalNode LINE_TYPE() { return getToken(GRAPHenParser.LINE_TYPE, 0); }
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
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(80);
				match(T__5);
				setState(81);
				match(TEXT);
				}
			}

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(84);
				match(T__1);
				setState(85);
				match(T__6);
				setState(86);
				match(COLOR);
				setState(87);
				match(T__7);
				setState(88);
				match(POS_NUMBER);
				setState(89);
				match(T__4);
				}
			}

			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(92);
				match(T__8);
				setState(93);
				match(T__9);
				setState(94);
				match(COLOR);
				}
				break;
			}
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(97);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(98);
				match(T__11);
				setState(99);
				match(COLOR);
				}
				break;
			}
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(102);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(103);
				match(T__12);
				setState(104);
				match(NODE_SHAPE);
				}
				break;
			}
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(107);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(108);
				match(T__13);
				setState(109);
				match(POS_NUMBER);
				}
				break;
			}
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(112);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(113);
				match(T__14);
				setState(114);
				match(POS_NUMBER);
				}
				break;
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__10) {
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
				match(T__15);
				setState(119);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__16);
			setState(123);
			match(IDENTIFIER);
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(125);
			edge_properties();
			setState(126);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__16);
			setState(129);
			match(IDENTIFIER);
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(131);
			edge_properties();
			setState(132);
			match(T__4);
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
		public TerminalNode COLOR() { return getToken(GRAPHenParser.COLOR, 0); }
		public TerminalNode LINE_TYPE() { return getToken(GRAPHenParser.LINE_TYPE, 0); }
		public List<TerminalNode> POS_NUMBER() { return getTokens(GRAPHenParser.POS_NUMBER); }
		public TerminalNode POS_NUMBER(int i) {
			return getToken(GRAPHenParser.POS_NUMBER, i);
		}
		public TerminalNode NUMBER() { return getToken(GRAPHenParser.NUMBER, 0); }
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
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(134);
				match(T__17);
				setState(135);
				_la = _input.LA(1);
				if ( !(_la==POS_NUMBER || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(138);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(139);
				match(T__18);
				setState(140);
				match(POS_NUMBER);
				}
				}
				break;
			}
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(143);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(144);
				match(T__19);
				setState(145);
				match(COLOR);
				}
				break;
			}
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__10) {
				{
				setState(148);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
				match(T__20);
				setState(150);
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
	public static class Graph_definitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GRAPHenParser.IDENTIFIER, 0); }
		public Edge_listContext edge_list() {
			return getRuleContext(Edge_listContext.class,0);
		}
		public Graph_functionContext graph_function() {
			return getRuleContext(Graph_functionContext.class,0);
		}
		public Graph_addContext graph_add() {
			return getRuleContext(Graph_addContext.class,0);
		}
		public Graph_substractContext graph_substract() {
			return getRuleContext(Graph_substractContext.class,0);
		}
		public Graph_unionContext graph_union() {
			return getRuleContext(Graph_unionContext.class,0);
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
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__21);
				setState(154);
				match(IDENTIFIER);
				{
				setState(155);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				edge_list();
				setState(163);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(157);
					match(T__3);
					}
					break;
				case T__22:
					{
					{
					setState(158);
					match(T__22);
					setState(159);
					graph_function();
					}
					setState(161);
					match(T__23);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(T__24);
				setState(166);
				graph_add();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(T__24);
				setState(168);
				graph_substract();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(T__24);
				setState(170);
				graph_union();
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
	public static class Digraph_definitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GRAPHenParser.IDENTIFIER, 0); }
		public Digraph_addContext digraph_add() {
			return getRuleContext(Digraph_addContext.class,0);
		}
		public Digraph_substractContext digraph_substract() {
			return getRuleContext(Digraph_substractContext.class,0);
		}
		public Digraph_unionContext digraph_union() {
			return getRuleContext(Digraph_unionContext.class,0);
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
			setState(173);
			match(T__25);
			setState(174);
			match(IDENTIFIER);
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				{
				setState(175);
				match(T__1);
				setState(176);
				dedge_list();
				setState(177);
				match(T__4);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(178);
					match(T__26);
					setState(179);
					graph_function();
					}
				}

				setState(182);
				match(T__23);
				}
				}
				break;
			case 2:
				{
				setState(184);
				match(T__24);
				setState(185);
				digraph_add();
				}
				break;
			case 3:
				{
				setState(186);
				match(T__24);
				setState(187);
				digraph_substract();
				}
				break;
			case 4:
				{
				setState(188);
				match(T__24);
				setState(189);
				digraph_union();
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
			setState(192);
			edge_relation();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__10) {
				{
				{
				setState(193);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
				edge_relation();
				}
				}
				setState(199);
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
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(200);
				match(IDENTIFIER);
				}
				break;
			case T__0:
				{
				setState(201);
				node_inline();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(204);
			match(T__27);
			setState(205);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__29) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(206);
				match(IDENTIFIER);
				}
				break;
			case T__16:
				{
				setState(207);
				edge_inline();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(210);
			match(T__30);
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(213);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(211);
					match(IDENTIFIER);
					}
					break;
				case T__0:
					{
					setState(212);
					node_inline();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(215); 
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
			setState(217);
			dedge_relation();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__10) {
				{
				{
				setState(218);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(219);
				dedge_relation();
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
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(225);
				match(IDENTIFIER);
				}
				break;
			case T__0:
				{
				setState(226);
				node_inline();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(229);
			match(T__27);
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__32) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(231);
				match(IDENTIFIER);
				}
				break;
			case T__16:
				{
				setState(232);
				edge_inline();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(235);
			match(T__30);
			setState(238); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(238);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(236);
					match(IDENTIFIER);
					}
					break;
				case T__0:
					{
					setState(237);
					node_inline();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(240); 
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
		public ColorEdgesFuncContext colorEdgesFunc() {
			return getRuleContext(ColorEdgesFuncContext.class,0);
		}
		public ColorNodesFuncContext colorNodesFunc() {
			return getRuleContext(ColorNodesFuncContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				{
				setState(242);
				colorEdgesFunc();
				}
				break;
			case T__37:
				{
				setState(243);
				colorNodesFunc();
				}
				break;
			case T__33:
				{
				setState(244);
				match(T__33);
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
			setState(247);
			match(IDENTIFIER);
			setState(248);
			match(T__26);
			setState(249);
			graph_function();
			setState(250);
			match(T__23);
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
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
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
	public static class ColorNodesFuncContext extends ParserRuleContext {
		public ColorNodesFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorNodesFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterColorNodesFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitColorNodesFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitColorNodesFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorNodesFuncContext colorNodesFunc() throws RecognitionException {
		ColorNodesFuncContext _localctx = new ColorNodesFuncContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_colorNodesFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__37);
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
	public static class ColorEdgesFuncContext extends ParserRuleContext {
		public ColorEdgesFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorEdgesFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterColorEdgesFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitColorEdgesFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitColorEdgesFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorEdgesFuncContext colorEdgesFunc() throws RecognitionException {
		ColorEdgesFuncContext _localctx = new ColorEdgesFuncContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_colorEdgesFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__38);
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
		enterRule(_localctx, 38, RULE_graph_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(258);
				match(IDENTIFIER);
				}
				break;
			case T__21:
			case T__24:
				{
				setState(259);
				graph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(262);
			match(T__39);
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(263);
				match(IDENTIFIER);
				}
				break;
			case T__21:
			case T__24:
				{
				setState(264);
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
		enterRule(_localctx, 40, RULE_digraph_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(267);
				match(IDENTIFIER);
				}
				break;
			case T__25:
				{
				setState(268);
				digraph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(271);
			match(T__39);
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(272);
				match(IDENTIFIER);
				}
				break;
			case T__25:
				{
				setState(273);
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
		enterRule(_localctx, 42, RULE_graph_substract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(276);
				match(IDENTIFIER);
				}
				break;
			case T__21:
			case T__24:
				{
				setState(277);
				graph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(280);
			match(T__40);
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(281);
				match(IDENTIFIER);
				}
				break;
			case T__21:
			case T__24:
				{
				setState(282);
				graph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(285);
			match(T__23);
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
		enterRule(_localctx, 44, RULE_digraph_substract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(287);
				match(IDENTIFIER);
				}
				break;
			case T__25:
				{
				setState(288);
				digraph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(291);
			match(T__40);
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(292);
				match(IDENTIFIER);
				}
				break;
			case T__25:
				{
				setState(293);
				digraph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(296);
			match(T__23);
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
	public static class Graph_unionContext extends ParserRuleContext {
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
		public Graph_unionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterGraph_union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitGraph_union(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitGraph_union(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graph_unionContext graph_union() throws RecognitionException {
		Graph_unionContext _localctx = new Graph_unionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_graph_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(298);
				match(IDENTIFIER);
				}
				break;
			case T__21:
			case T__24:
				{
				setState(299);
				graph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(302);
			match(T__41);
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(303);
				match(IDENTIFIER);
				}
				break;
			case T__21:
			case T__24:
				{
				setState(304);
				graph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(307);
			match(T__23);
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
	public static class Digraph_unionContext extends ParserRuleContext {
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
		public Digraph_unionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digraph_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).enterDigraph_union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GRAPHenListener ) ((GRAPHenListener)listener).exitDigraph_union(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GRAPHenVisitor ) return ((GRAPHenVisitor<? extends T>)visitor).visitDigraph_union(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Digraph_unionContext digraph_union() throws RecognitionException {
		Digraph_unionContext _localctx = new Digraph_unionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_digraph_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(309);
				match(IDENTIFIER);
				}
				break;
			case T__25:
				{
				setState(310);
				digraph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(313);
			match(T__41);
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(314);
				match(IDENTIFIER);
				}
				break;
			case T__25:
				{
				setState(315);
				digraph_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(318);
			match(T__23);
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
		"\u0004\u00014\u0141\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0004\u00004\b\u0000\u000b\u0000\f\u00005\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004S\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004[\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004`\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004e\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004j\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004o\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004t\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004y\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0089\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u008e\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0093\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0098\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u00a4\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00ac\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00b5\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00bf\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u00c4"+
		"\b\n\n\n\f\n\u00c7\t\n\u0001\u000b\u0001\u000b\u0003\u000b\u00cb\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d1\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00d6\b\u000b\u000b\u000b"+
		"\f\u000b\u00d7\u0001\f\u0001\f\u0001\f\u0005\f\u00dd\b\f\n\f\f\f\u00e0"+
		"\t\f\u0001\r\u0001\r\u0003\r\u00e4\b\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u00ea\b\r\u0001\r\u0001\r\u0001\r\u0004\r\u00ef\b\r\u000b\r\f"+
		"\r\u00f0\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00f6\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0105\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u010a\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u010e\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0113\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0117\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u011c\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0122\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0127\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u012d\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0132"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0138"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u013d\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.0\u0000\u0006\u0001\u0000\u0002\u0003\u0002\u0000\t\t\u000b\u000b"+
		"\u0001\u0000,-\u0001\u0000\u001d\u001e\u0001\u0000 !\u0001\u0000#%\u015c"+
		"\u00003\u0001\u0000\u0000\u0000\u0002B\u0001\u0000\u0000\u0000\u0004D"+
		"\u0001\u0000\u0000\u0000\u0006J\u0001\u0000\u0000\u0000\bR\u0001\u0000"+
		"\u0000\u0000\nz\u0001\u0000\u0000\u0000\f\u0080\u0001\u0000\u0000\u0000"+
		"\u000e\u0088\u0001\u0000\u0000\u0000\u0010\u00ab\u0001\u0000\u0000\u0000"+
		"\u0012\u00ad\u0001\u0000\u0000\u0000\u0014\u00c0\u0001\u0000\u0000\u0000"+
		"\u0016\u00ca\u0001\u0000\u0000\u0000\u0018\u00d9\u0001\u0000\u0000\u0000"+
		"\u001a\u00e3\u0001\u0000\u0000\u0000\u001c\u00f5\u0001\u0000\u0000\u0000"+
		"\u001e\u00f7\u0001\u0000\u0000\u0000 \u00fc\u0001\u0000\u0000\u0000\""+
		"\u00fe\u0001\u0000\u0000\u0000$\u0100\u0001\u0000\u0000\u0000&\u0104\u0001"+
		"\u0000\u0000\u0000(\u010d\u0001\u0000\u0000\u0000*\u0116\u0001\u0000\u0000"+
		"\u0000,\u0121\u0001\u0000\u0000\u0000.\u012c\u0001\u0000\u0000\u00000"+
		"\u0137\u0001\u0000\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0005\u0000\u0000\u0001"+
		"8\u0001\u0001\u0000\u0000\u00009C\u0003\u0004\u0002\u0000:C\u0003\n\u0005"+
		"\u0000;C\u0003\u0012\t\u0000<C\u0003\u0010\b\u0000=C\u0003\u001e\u000f"+
		"\u0000>C\u0003&\u0013\u0000?C\u0003*\u0015\u0000@C\u0003(\u0014\u0000"+
		"AC\u0003,\u0016\u0000B9\u0001\u0000\u0000\u0000B:\u0001\u0000\u0000\u0000"+
		"B;\u0001\u0000\u0000\u0000B<\u0001\u0000\u0000\u0000B=\u0001\u0000\u0000"+
		"\u0000B>\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0003\u0001\u0000\u0000\u0000"+
		"DE\u0005\u0001\u0000\u0000EF\u0005.\u0000\u0000FG\u0007\u0000\u0000\u0000"+
		"GH\u0003\b\u0004\u0000HI\u0005\u0004\u0000\u0000I\u0005\u0001\u0000\u0000"+
		"\u0000JK\u0005\u0001\u0000\u0000KL\u0005.\u0000\u0000LM\u0007\u0000\u0000"+
		"\u0000MN\u0003\b\u0004\u0000NO\u0005\u0005\u0000\u0000O\u0007\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u0006\u0000\u0000QS\u0005/\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000SZ\u0001\u0000\u0000\u0000TU\u0005"+
		"\u0002\u0000\u0000UV\u0005\u0007\u0000\u0000VW\u00051\u0000\u0000WX\u0005"+
		"\b\u0000\u0000XY\u0005,\u0000\u0000Y[\u0005\u0005\u0000\u0000ZT\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[_\u0001\u0000\u0000\u0000"+
		"\\]\u0005\t\u0000\u0000]^\u0005\n\u0000\u0000^`\u00051\u0000\u0000_\\"+
		"\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`d\u0001\u0000\u0000"+
		"\u0000ab\u0007\u0001\u0000\u0000bc\u0005\f\u0000\u0000ce\u00051\u0000"+
		"\u0000da\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ei\u0001\u0000"+
		"\u0000\u0000fg\u0007\u0001\u0000\u0000gh\u0005\r\u0000\u0000hj\u00054"+
		"\u0000\u0000if\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jn\u0001"+
		"\u0000\u0000\u0000kl\u0007\u0001\u0000\u0000lm\u0005\u000e\u0000\u0000"+
		"mo\u0005,\u0000\u0000nk\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"os\u0001\u0000\u0000\u0000pq\u0007\u0001\u0000\u0000qr\u0005\u000f\u0000"+
		"\u0000rt\u0005,\u0000\u0000sp\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tx\u0001\u0000\u0000\u0000uv\u0007\u0001\u0000\u0000vw\u0005\u0010"+
		"\u0000\u0000wy\u00053\u0000\u0000xu\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y\t\u0001\u0000\u0000\u0000z{\u0005\u0011\u0000\u0000{|\u0005"+
		".\u0000\u0000|}\u0007\u0000\u0000\u0000}~\u0003\u000e\u0007\u0000~\u007f"+
		"\u0005\u0004\u0000\u0000\u007f\u000b\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u0011\u0000\u0000\u0081\u0082\u0005.\u0000\u0000\u0082\u0083\u0007"+
		"\u0000\u0000\u0000\u0083\u0084\u0003\u000e\u0007\u0000\u0084\u0085\u0005"+
		"\u0005\u0000\u0000\u0085\r\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0012"+
		"\u0000\u0000\u0087\u0089\u0007\u0002\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008d\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0007\u0001\u0000\u0000\u008b\u008c\u0005\u0013"+
		"\u0000\u0000\u008c\u008e\u0005,\u0000\u0000\u008d\u008a\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0092\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0007\u0001\u0000\u0000\u0090\u0091\u0005\u0014\u0000"+
		"\u0000\u0091\u0093\u00051\u0000\u0000\u0092\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0097\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0007\u0001\u0000\u0000\u0095\u0096\u0005\u0015\u0000\u0000"+
		"\u0096\u0098\u00053\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0001\u0000\u0000\u0000\u0098\u000f\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005\u0016\u0000\u0000\u009a\u009b\u0005.\u0000\u0000\u009b\u009c"+
		"\u0007\u0000\u0000\u0000\u009c\u00a3\u0003\u0014\n\u0000\u009d\u00a4\u0005"+
		"\u0004\u0000\u0000\u009e\u009f\u0005\u0017\u0000\u0000\u009f\u00a0\u0003"+
		"\u001c\u000e\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005"+
		"\u0018\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u009d\u0001"+
		"\u0000\u0000\u0000\u00a3\u009e\u0001\u0000\u0000\u0000\u00a4\u00ac\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005\u0019\u0000\u0000\u00a6\u00ac\u0003"+
		"&\u0013\u0000\u00a7\u00a8\u0005\u0019\u0000\u0000\u00a8\u00ac\u0003*\u0015"+
		"\u0000\u00a9\u00aa\u0005\u0019\u0000\u0000\u00aa\u00ac\u0003.\u0017\u0000"+
		"\u00ab\u0099\u0001\u0000\u0000\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ac\u0011\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u001a\u0000\u0000"+
		"\u00ae\u00be\u0005.\u0000\u0000\u00af\u00b0\u0005\u0002\u0000\u0000\u00b0"+
		"\u00b1\u0003\u0018\f\u0000\u00b1\u00b4\u0005\u0005\u0000\u0000\u00b2\u00b3"+
		"\u0005\u001b\u0000\u0000\u00b3\u00b5\u0003\u001c\u000e\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0018\u0000\u0000\u00b7\u00bf"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0019\u0000\u0000\u00b9\u00bf"+
		"\u0003(\u0014\u0000\u00ba\u00bb\u0005\u0019\u0000\u0000\u00bb\u00bf\u0003"+
		",\u0016\u0000\u00bc\u00bd\u0005\u0019\u0000\u0000\u00bd\u00bf\u00030\u0018"+
		"\u0000\u00be\u00af\u0001\u0000\u0000\u0000\u00be\u00b8\u0001\u0000\u0000"+
		"\u0000\u00be\u00ba\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bf\u0013\u0001\u0000\u0000\u0000\u00c0\u00c5\u0003\u0016\u000b"+
		"\u0000\u00c1\u00c2\u0007\u0001\u0000\u0000\u00c2\u00c4\u0003\u0016\u000b"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u0015\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cb\u0005.\u0000\u0000\u00c9\u00cb\u0003\u0006\u0003\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u001c\u0000\u0000"+
		"\u00cd\u00d0\u0007\u0003\u0000\u0000\u00ce\u00d1\u0005.\u0000\u0000\u00cf"+
		"\u00d1\u0003\f\u0006\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d5"+
		"\u0005\u001f\u0000\u0000\u00d3\u00d6\u0005.\u0000\u0000\u00d4\u00d6\u0003"+
		"\u0006\u0003\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u0017\u0001"+
		"\u0000\u0000\u0000\u00d9\u00de\u0003\u001a\r\u0000\u00da\u00db\u0007\u0001"+
		"\u0000\u0000\u00db\u00dd\u0003\u001a\r\u0000\u00dc\u00da\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u0019\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e4\u0005.\u0000\u0000"+
		"\u00e2\u00e4\u0003\u0006\u0003\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0005\u001c\u0000\u0000\u00e6\u00e9\u0007\u0004\u0000\u0000"+
		"\u00e7\u00ea\u0005.\u0000\u0000\u00e8\u00ea\u0003\f\u0006\u0000\u00e9"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ee\u0005\u001f\u0000\u0000\u00ec"+
		"\u00ef\u0005.\u0000\u0000\u00ed\u00ef\u0003\u0006\u0003\u0000\u00ee\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u001b\u0001\u0000\u0000\u0000\u00f2\u00f6"+
		"\u0003$\u0012\u0000\u00f3\u00f6\u0003\"\u0011\u0000\u00f4\u00f6\u0005"+
		"\"\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u001d\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0005.\u0000\u0000\u00f8\u00f9\u0005\u001b\u0000"+
		"\u0000\u00f9\u00fa\u0003\u001c\u000e\u0000\u00fa\u00fb\u0005\u0018\u0000"+
		"\u0000\u00fb\u001f\u0001\u0000\u0000\u0000\u00fc\u00fd\u0007\u0005\u0000"+
		"\u0000\u00fd!\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005&\u0000\u0000\u00ff"+
		"#\u0001\u0000\u0000\u0000\u0100\u0101\u0005\'\u0000\u0000\u0101%\u0001"+
		"\u0000\u0000\u0000\u0102\u0105\u0005.\u0000\u0000\u0103\u0105\u0003\u0010"+
		"\b\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0103\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0109\u0005(\u0000\u0000"+
		"\u0107\u010a\u0005.\u0000\u0000\u0108\u010a\u0003\u0010\b\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a"+
		"\'\u0001\u0000\u0000\u0000\u010b\u010e\u0005.\u0000\u0000\u010c\u010e"+
		"\u0003\u0012\t\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010c\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0112\u0005"+
		"(\u0000\u0000\u0110\u0113\u0005.\u0000\u0000\u0111\u0113\u0003\u0012\t"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000"+
		"\u0000\u0113)\u0001\u0000\u0000\u0000\u0114\u0117\u0005.\u0000\u0000\u0115"+
		"\u0117\u0003\u0010\b\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0115"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011b"+
		"\u0005)\u0000\u0000\u0119\u011c\u0005.\u0000\u0000\u011a\u011c\u0003\u0010"+
		"\b\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011a\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0018\u0000"+
		"\u0000\u011e+\u0001\u0000\u0000\u0000\u011f\u0122\u0005.\u0000\u0000\u0120"+
		"\u0122\u0003\u0012\t\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0120"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0126"+
		"\u0005)\u0000\u0000\u0124\u0127\u0005.\u0000\u0000\u0125\u0127\u0003\u0012"+
		"\t\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0125\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u0018\u0000"+
		"\u0000\u0129-\u0001\u0000\u0000\u0000\u012a\u012d\u0005.\u0000\u0000\u012b"+
		"\u012d\u0003\u0010\b\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012b"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0131"+
		"\u0005*\u0000\u0000\u012f\u0132\u0005.\u0000\u0000\u0130\u0132\u0003\u0010"+
		"\b\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0130\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u0018\u0000"+
		"\u0000\u0134/\u0001\u0000\u0000\u0000\u0135\u0138\u0005.\u0000\u0000\u0136"+
		"\u0138\u0003\u0012\t\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0136"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013c"+
		"\u0005*\u0000\u0000\u013a\u013d\u0005.\u0000\u0000\u013b\u013d\u0003\u0012"+
		"\t\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013b\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0005\u0018\u0000"+
		"\u0000\u013f1\u0001\u0000\u0000\u0000)5BRZ_dinsx\u0088\u008d\u0092\u0097"+
		"\u00a3\u00ab\u00b4\u00be\u00c5\u00ca\u00d0\u00d5\u00d7\u00de\u00e3\u00e9"+
		"\u00ee\u00f0\u00f5\u0104\u0109\u010d\u0112\u0116\u011b\u0121\u0126\u012c"+
		"\u0131\u0137\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}