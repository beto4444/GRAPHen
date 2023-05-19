// Generated from C:/Users/keste/IdeaProjects/GRAPHen_Polnische_Graphcomputersprache/src\GRAPHen.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GRAPHenLexer extends Lexer {
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
		IDENTIFIER=46, TEXT=47, LETTER=48, NODE_KW=49, EDGE_KW=50, VAL_KW=51, 
		COL_KW=52, NODE_SPEC=53, EDGE_CPEC=54, GRAPH_KW=55, DIGHRAPH_KW=56, NODE_ORD=57, 
		COL_G=58, GEN=59, COLOR=60, HEXDIGIT=61, LINE_TYPE=62, NODE_SHAPE=63;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "WS", "POS_NUMBER", "NUMBER", "IDENTIFIER", "TEXT", "LETTER", 
			"NODE_KW", "EDGE_KW", "VAL_KW", "COL_KW", "NODE_SPEC", "EDGE_CPEC", "GRAPH_KW", 
			"DIGHRAPH_KW", "NODE_ORD", "COL_G", "GEN", "COLOR", "HEXDIGIT", "LINE_TYPE", 
			"NODE_SHAPE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Node '", "'{'", "'};'", "'}'", "'nodeContents '", "', '", "'fillColor '", 
			"','", "'borderColor '", "'nodeShape '", "'nodeSize '", "'borderWidth '", 
			"'borderLineShape '", "'Edge '", "'Num_color '", "'lineWidth'", "'Color '", 
			"'lineType'", "'Graph '", "'}.'", "';'", "'='", "'Digraph '", "'.'", 
			"'('", "'<->'", "'<-> '", "')'", "'->'", "'-> '", "'clearEdges()'", "'.png'", 
			"'.svg'", "'.gren'", "'export('", "'format'", "'fileName'", "'colorNodes()'", 
			"'colorEdges()'", "'+'", "'-'", "'&&'", null, null, null, null, null, 
			null, "'Node'", "'Edge'", "'Val'", "'Color'", "'Nodetype'", "'Edgetype'", 
			"'Graph'", "'Digraph'", "'NodeOrderDown'", "'Graphcolor'", "'Generate'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "WS", "POS_NUMBER", "NUMBER", 
			"IDENTIFIER", "TEXT", "LETTER", "NODE_KW", "EDGE_KW", "VAL_KW", "COL_KW", 
			"NODE_SPEC", "EDGE_CPEC", "GRAPH_KW", "DIGHRAPH_KW", "NODE_ORD", "COL_G", 
			"GEN", "COLOR", "HEXDIGIT", "LINE_TYPE", "NODE_SHAPE"
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


	public GRAPHenLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GRAPHen.g4"; }

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
		"\u0004\u0000?\u0229\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001*\u0004*\u019a\b*\u000b*\f*\u019b\u0001*\u0001*\u0001+\u0001"+
		"+\u0005+\u01a2\b+\n+\f+\u01a5\t+\u0001,\u0001,\u0003,\u01a9\b,\u0001-"+
		"\u0001-\u0003-\u01ad\b-\u0001-\u0001-\u0005-\u01b1\b-\n-\f-\u01b4\t-\u0001"+
		".\u0004.\u01b7\b.\u000b.\f.\u01b8\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u0001"+
		"2\u00013\u00013\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0003=\u0221\b=\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0003>\u0228\b>\u0000\u0000?\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/"+
		"_0a1c2e3g4i5k6m7o8q9s:u;w<y={>}?\u0001\u0000\u0004\u0002\u0000\t\n  \u0003"+
		"\u0000\t\n\r\r  \u0002\u0000AZaz\u0003\u000009AFaf\u0232\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C"+
		"\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000"+
		"\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000"+
		"\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q"+
		"\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000"+
		"\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000"+
		"\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_"+
		"\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000"+
		"\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000"+
		"\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m"+
		"\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000"+
		"\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000"+
		"\u0000w\u0001\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000\u0000{"+
		"\u0001\u0000\u0000\u0000\u0000}\u0001\u0000\u0000\u0000\u0001\u007f\u0001"+
		"\u0000\u0000\u0000\u0003\u0085\u0001\u0000\u0000\u0000\u0005\u0087\u0001"+
		"\u0000\u0000\u0000\u0007\u008a\u0001\u0000\u0000\u0000\t\u008c\u0001\u0000"+
		"\u0000\u0000\u000b\u009a\u0001\u0000\u0000\u0000\r\u009d\u0001\u0000\u0000"+
		"\u0000\u000f\u00a8\u0001\u0000\u0000\u0000\u0011\u00aa\u0001\u0000\u0000"+
		"\u0000\u0013\u00b7\u0001\u0000\u0000\u0000\u0015\u00c2\u0001\u0000\u0000"+
		"\u0000\u0017\u00cc\u0001\u0000\u0000\u0000\u0019\u00d9\u0001\u0000\u0000"+
		"\u0000\u001b\u00ea\u0001\u0000\u0000\u0000\u001d\u00f0\u0001\u0000\u0000"+
		"\u0000\u001f\u00fb\u0001\u0000\u0000\u0000!\u0105\u0001\u0000\u0000\u0000"+
		"#\u010c\u0001\u0000\u0000\u0000%\u0115\u0001\u0000\u0000\u0000\'\u011c"+
		"\u0001\u0000\u0000\u0000)\u011f\u0001\u0000\u0000\u0000+\u0121\u0001\u0000"+
		"\u0000\u0000-\u0123\u0001\u0000\u0000\u0000/\u012c\u0001\u0000\u0000\u0000"+
		"1\u012e\u0001\u0000\u0000\u00003\u0130\u0001\u0000\u0000\u00005\u0134"+
		"\u0001\u0000\u0000\u00007\u0139\u0001\u0000\u0000\u00009\u013b\u0001\u0000"+
		"\u0000\u0000;\u013e\u0001\u0000\u0000\u0000=\u0142\u0001\u0000\u0000\u0000"+
		"?\u014f\u0001\u0000\u0000\u0000A\u0154\u0001\u0000\u0000\u0000C\u0159"+
		"\u0001\u0000\u0000\u0000E\u015f\u0001\u0000\u0000\u0000G\u0167\u0001\u0000"+
		"\u0000\u0000I\u016e\u0001\u0000\u0000\u0000K\u0177\u0001\u0000\u0000\u0000"+
		"M\u0184\u0001\u0000\u0000\u0000O\u0191\u0001\u0000\u0000\u0000Q\u0193"+
		"\u0001\u0000\u0000\u0000S\u0195\u0001\u0000\u0000\u0000U\u0199\u0001\u0000"+
		"\u0000\u0000W\u019f\u0001\u0000\u0000\u0000Y\u01a8\u0001\u0000\u0000\u0000"+
		"[\u01ac\u0001\u0000\u0000\u0000]\u01b6\u0001\u0000\u0000\u0000_\u01ba"+
		"\u0001\u0000\u0000\u0000a\u01bc\u0001\u0000\u0000\u0000c\u01c1\u0001\u0000"+
		"\u0000\u0000e\u01c6\u0001\u0000\u0000\u0000g\u01ca\u0001\u0000\u0000\u0000"+
		"i\u01d0\u0001\u0000\u0000\u0000k\u01d9\u0001\u0000\u0000\u0000m\u01e2"+
		"\u0001\u0000\u0000\u0000o\u01e8\u0001\u0000\u0000\u0000q\u01f0\u0001\u0000"+
		"\u0000\u0000s\u01fe\u0001\u0000\u0000\u0000u\u0209\u0001\u0000\u0000\u0000"+
		"w\u0212\u0001\u0000\u0000\u0000y\u021a\u0001\u0000\u0000\u0000{\u0220"+
		"\u0001\u0000\u0000\u0000}\u0227\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		"N\u0000\u0000\u0080\u0081\u0005o\u0000\u0000\u0081\u0082\u0005d\u0000"+
		"\u0000\u0082\u0083\u0005e\u0000\u0000\u0083\u0084\u0005 \u0000\u0000\u0084"+
		"\u0002\u0001\u0000\u0000\u0000\u0085\u0086\u0005{\u0000\u0000\u0086\u0004"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005}\u0000\u0000\u0088\u0089\u0005"+
		";\u0000\u0000\u0089\u0006\u0001\u0000\u0000\u0000\u008a\u008b\u0005}\u0000"+
		"\u0000\u008b\b\u0001\u0000\u0000\u0000\u008c\u008d\u0005n\u0000\u0000"+
		"\u008d\u008e\u0005o\u0000\u0000\u008e\u008f\u0005d\u0000\u0000\u008f\u0090"+
		"\u0005e\u0000\u0000\u0090\u0091\u0005C\u0000\u0000\u0091\u0092\u0005o"+
		"\u0000\u0000\u0092\u0093\u0005n\u0000\u0000\u0093\u0094\u0005t\u0000\u0000"+
		"\u0094\u0095\u0005e\u0000\u0000\u0095\u0096\u0005n\u0000\u0000\u0096\u0097"+
		"\u0005t\u0000\u0000\u0097\u0098\u0005s\u0000\u0000\u0098\u0099\u0005 "+
		"\u0000\u0000\u0099\n\u0001\u0000\u0000\u0000\u009a\u009b\u0005,\u0000"+
		"\u0000\u009b\u009c\u0005 \u0000\u0000\u009c\f\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0005f\u0000\u0000\u009e\u009f\u0005i\u0000\u0000\u009f\u00a0"+
		"\u0005l\u0000\u0000\u00a0\u00a1\u0005l\u0000\u0000\u00a1\u00a2\u0005C"+
		"\u0000\u0000\u00a2\u00a3\u0005o\u0000\u0000\u00a3\u00a4\u0005l\u0000\u0000"+
		"\u00a4\u00a5\u0005o\u0000\u0000\u00a5\u00a6\u0005r\u0000\u0000\u00a6\u00a7"+
		"\u0005 \u0000\u0000\u00a7\u000e\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		",\u0000\u0000\u00a9\u0010\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005b\u0000"+
		"\u0000\u00ab\u00ac\u0005o\u0000\u0000\u00ac\u00ad\u0005r\u0000\u0000\u00ad"+
		"\u00ae\u0005d\u0000\u0000\u00ae\u00af\u0005e\u0000\u0000\u00af\u00b0\u0005"+
		"r\u0000\u0000\u00b0\u00b1\u0005C\u0000\u0000\u00b1\u00b2\u0005o\u0000"+
		"\u0000\u00b2\u00b3\u0005l\u0000\u0000\u00b3\u00b4\u0005o\u0000\u0000\u00b4"+
		"\u00b5\u0005r\u0000\u0000\u00b5\u00b6\u0005 \u0000\u0000\u00b6\u0012\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0005n\u0000\u0000\u00b8\u00b9\u0005o\u0000"+
		"\u0000\u00b9\u00ba\u0005d\u0000\u0000\u00ba\u00bb\u0005e\u0000\u0000\u00bb"+
		"\u00bc\u0005S\u0000\u0000\u00bc\u00bd\u0005h\u0000\u0000\u00bd\u00be\u0005"+
		"a\u0000\u0000\u00be\u00bf\u0005p\u0000\u0000\u00bf\u00c0\u0005e\u0000"+
		"\u0000\u00c0\u00c1\u0005 \u0000\u0000\u00c1\u0014\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0005n\u0000\u0000\u00c3\u00c4\u0005o\u0000\u0000\u00c4\u00c5"+
		"\u0005d\u0000\u0000\u00c5\u00c6\u0005e\u0000\u0000\u00c6\u00c7\u0005S"+
		"\u0000\u0000\u00c7\u00c8\u0005i\u0000\u0000\u00c8\u00c9\u0005z\u0000\u0000"+
		"\u00c9\u00ca\u0005e\u0000\u0000\u00ca\u00cb\u0005 \u0000\u0000\u00cb\u0016"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005b\u0000\u0000\u00cd\u00ce\u0005"+
		"o\u0000\u0000\u00ce\u00cf\u0005r\u0000\u0000\u00cf\u00d0\u0005d\u0000"+
		"\u0000\u00d0\u00d1\u0005e\u0000\u0000\u00d1\u00d2\u0005r\u0000\u0000\u00d2"+
		"\u00d3\u0005W\u0000\u0000\u00d3\u00d4\u0005i\u0000\u0000\u00d4\u00d5\u0005"+
		"d\u0000\u0000\u00d5\u00d6\u0005t\u0000\u0000\u00d6\u00d7\u0005h\u0000"+
		"\u0000\u00d7\u00d8\u0005 \u0000\u0000\u00d8\u0018\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0005b\u0000\u0000\u00da\u00db\u0005o\u0000\u0000\u00db\u00dc"+
		"\u0005r\u0000\u0000\u00dc\u00dd\u0005d\u0000\u0000\u00dd\u00de\u0005e"+
		"\u0000\u0000\u00de\u00df\u0005r\u0000\u0000\u00df\u00e0\u0005L\u0000\u0000"+
		"\u00e0\u00e1\u0005i\u0000\u0000\u00e1\u00e2\u0005n\u0000\u0000\u00e2\u00e3"+
		"\u0005e\u0000\u0000\u00e3\u00e4\u0005S\u0000\u0000\u00e4\u00e5\u0005h"+
		"\u0000\u0000\u00e5\u00e6\u0005a\u0000\u0000\u00e6\u00e7\u0005p\u0000\u0000"+
		"\u00e7\u00e8\u0005e\u0000\u0000\u00e8\u00e9\u0005 \u0000\u0000\u00e9\u001a"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005E\u0000\u0000\u00eb\u00ec\u0005"+
		"d\u0000\u0000\u00ec\u00ed\u0005g\u0000\u0000\u00ed\u00ee\u0005e\u0000"+
		"\u0000\u00ee\u00ef\u0005 \u0000\u0000\u00ef\u001c\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0005N\u0000\u0000\u00f1\u00f2\u0005u\u0000\u0000\u00f2\u00f3"+
		"\u0005m\u0000\u0000\u00f3\u00f4\u0005_\u0000\u0000\u00f4\u00f5\u0005c"+
		"\u0000\u0000\u00f5\u00f6\u0005o\u0000\u0000\u00f6\u00f7\u0005l\u0000\u0000"+
		"\u00f7\u00f8\u0005o\u0000\u0000\u00f8\u00f9\u0005r\u0000\u0000\u00f9\u00fa"+
		"\u0005 \u0000\u0000\u00fa\u001e\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005"+
		"l\u0000\u0000\u00fc\u00fd\u0005i\u0000\u0000\u00fd\u00fe\u0005n\u0000"+
		"\u0000\u00fe\u00ff\u0005e\u0000\u0000\u00ff\u0100\u0005W\u0000\u0000\u0100"+
		"\u0101\u0005i\u0000\u0000\u0101\u0102\u0005d\u0000\u0000\u0102\u0103\u0005"+
		"t\u0000\u0000\u0103\u0104\u0005h\u0000\u0000\u0104 \u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0005C\u0000\u0000\u0106\u0107\u0005o\u0000\u0000\u0107"+
		"\u0108\u0005l\u0000\u0000\u0108\u0109\u0005o\u0000\u0000\u0109\u010a\u0005"+
		"r\u0000\u0000\u010a\u010b\u0005 \u0000\u0000\u010b\"\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0005l\u0000\u0000\u010d\u010e\u0005i\u0000\u0000\u010e"+
		"\u010f\u0005n\u0000\u0000\u010f\u0110\u0005e\u0000\u0000\u0110\u0111\u0005"+
		"T\u0000\u0000\u0111\u0112\u0005y\u0000\u0000\u0112\u0113\u0005p\u0000"+
		"\u0000\u0113\u0114\u0005e\u0000\u0000\u0114$\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0005G\u0000\u0000\u0116\u0117\u0005r\u0000\u0000\u0117\u0118\u0005"+
		"a\u0000\u0000\u0118\u0119\u0005p\u0000\u0000\u0119\u011a\u0005h\u0000"+
		"\u0000\u011a\u011b\u0005 \u0000\u0000\u011b&\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005}\u0000\u0000\u011d\u011e\u0005.\u0000\u0000\u011e(\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0005;\u0000\u0000\u0120*\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0005=\u0000\u0000\u0122,\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0005D\u0000\u0000\u0124\u0125\u0005i\u0000\u0000\u0125\u0126\u0005"+
		"g\u0000\u0000\u0126\u0127\u0005r\u0000\u0000\u0127\u0128\u0005a\u0000"+
		"\u0000\u0128\u0129\u0005p\u0000\u0000\u0129\u012a\u0005h\u0000\u0000\u012a"+
		"\u012b\u0005 \u0000\u0000\u012b.\u0001\u0000\u0000\u0000\u012c\u012d\u0005"+
		".\u0000\u0000\u012d0\u0001\u0000\u0000\u0000\u012e\u012f\u0005(\u0000"+
		"\u0000\u012f2\u0001\u0000\u0000\u0000\u0130\u0131\u0005<\u0000\u0000\u0131"+
		"\u0132\u0005-\u0000\u0000\u0132\u0133\u0005>\u0000\u0000\u01334\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0005<\u0000\u0000\u0135\u0136\u0005-\u0000"+
		"\u0000\u0136\u0137\u0005>\u0000\u0000\u0137\u0138\u0005 \u0000\u0000\u0138"+
		"6\u0001\u0000\u0000\u0000\u0139\u013a\u0005)\u0000\u0000\u013a8\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0005-\u0000\u0000\u013c\u013d\u0005>\u0000"+
		"\u0000\u013d:\u0001\u0000\u0000\u0000\u013e\u013f\u0005-\u0000\u0000\u013f"+
		"\u0140\u0005>\u0000\u0000\u0140\u0141\u0005 \u0000\u0000\u0141<\u0001"+
		"\u0000\u0000\u0000\u0142\u0143\u0005c\u0000\u0000\u0143\u0144\u0005l\u0000"+
		"\u0000\u0144\u0145\u0005e\u0000\u0000\u0145\u0146\u0005a\u0000\u0000\u0146"+
		"\u0147\u0005r\u0000\u0000\u0147\u0148\u0005E\u0000\u0000\u0148\u0149\u0005"+
		"d\u0000\u0000\u0149\u014a\u0005g\u0000\u0000\u014a\u014b\u0005e\u0000"+
		"\u0000\u014b\u014c\u0005s\u0000\u0000\u014c\u014d\u0005(\u0000\u0000\u014d"+
		"\u014e\u0005)\u0000\u0000\u014e>\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		".\u0000\u0000\u0150\u0151\u0005p\u0000\u0000\u0151\u0152\u0005n\u0000"+
		"\u0000\u0152\u0153\u0005g\u0000\u0000\u0153@\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0005.\u0000\u0000\u0155\u0156\u0005s\u0000\u0000\u0156\u0157\u0005"+
		"v\u0000\u0000\u0157\u0158\u0005g\u0000\u0000\u0158B\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0005.\u0000\u0000\u015a\u015b\u0005g\u0000\u0000\u015b"+
		"\u015c\u0005r\u0000\u0000\u015c\u015d\u0005e\u0000\u0000\u015d\u015e\u0005"+
		"n\u0000\u0000\u015eD\u0001\u0000\u0000\u0000\u015f\u0160\u0005e\u0000"+
		"\u0000\u0160\u0161\u0005x\u0000\u0000\u0161\u0162\u0005p\u0000\u0000\u0162"+
		"\u0163\u0005o\u0000\u0000\u0163\u0164\u0005r\u0000\u0000\u0164\u0165\u0005"+
		"t\u0000\u0000\u0165\u0166\u0005(\u0000\u0000\u0166F\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0005f\u0000\u0000\u0168\u0169\u0005o\u0000\u0000\u0169"+
		"\u016a\u0005r\u0000\u0000\u016a\u016b\u0005m\u0000\u0000\u016b\u016c\u0005"+
		"a\u0000\u0000\u016c\u016d\u0005t\u0000\u0000\u016dH\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0005f\u0000\u0000\u016f\u0170\u0005i\u0000\u0000\u0170"+
		"\u0171\u0005l\u0000\u0000\u0171\u0172\u0005e\u0000\u0000\u0172\u0173\u0005"+
		"N\u0000\u0000\u0173\u0174\u0005a\u0000\u0000\u0174\u0175\u0005m\u0000"+
		"\u0000\u0175\u0176\u0005e\u0000\u0000\u0176J\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u0005c\u0000\u0000\u0178\u0179\u0005o\u0000\u0000\u0179\u017a\u0005"+
		"l\u0000\u0000\u017a\u017b\u0005o\u0000\u0000\u017b\u017c\u0005r\u0000"+
		"\u0000\u017c\u017d\u0005N\u0000\u0000\u017d\u017e\u0005o\u0000\u0000\u017e"+
		"\u017f\u0005d\u0000\u0000\u017f\u0180\u0005e\u0000\u0000\u0180\u0181\u0005"+
		"s\u0000\u0000\u0181\u0182\u0005(\u0000\u0000\u0182\u0183\u0005)\u0000"+
		"\u0000\u0183L\u0001\u0000\u0000\u0000\u0184\u0185\u0005c\u0000\u0000\u0185"+
		"\u0186\u0005o\u0000\u0000\u0186\u0187\u0005l\u0000\u0000\u0187\u0188\u0005"+
		"o\u0000\u0000\u0188\u0189\u0005r\u0000\u0000\u0189\u018a\u0005E\u0000"+
		"\u0000\u018a\u018b\u0005d\u0000\u0000\u018b\u018c\u0005g\u0000\u0000\u018c"+
		"\u018d\u0005e\u0000\u0000\u018d\u018e\u0005s\u0000\u0000\u018e\u018f\u0005"+
		"(\u0000\u0000\u018f\u0190\u0005)\u0000\u0000\u0190N\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0005+\u0000\u0000\u0192P\u0001\u0000\u0000\u0000\u0193"+
		"\u0194\u0005-\u0000\u0000\u0194R\u0001\u0000\u0000\u0000\u0195\u0196\u0005"+
		"&\u0000\u0000\u0196\u0197\u0005&\u0000\u0000\u0197T\u0001\u0000\u0000"+
		"\u0000\u0198\u019a\u0007\u0000\u0000\u0000\u0199\u0198\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0006*\u0000\u0000\u019eV\u0001\u0000\u0000\u0000\u019f"+
		"\u01a3\u000219\u0000\u01a0\u01a2\u000209\u0000\u01a1\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4X\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a9\u00050\u0000\u0000"+
		"\u01a7\u01a9\u0003W+\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a9Z\u0001\u0000\u0000\u0000\u01aa\u01ad\u0003"+
		"_/\u0000\u01ab\u01ad\u0005_\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad\u01b2\u0001\u0000\u0000"+
		"\u0000\u01ae\u01b1\u0003_/\u0000\u01af\u01b1\u0003Y,\u0000\u01b0\u01ae"+
		"\u0001\u0000\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b3\\\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b7\b\u0001\u0000\u0000\u01b6\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9^\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0007\u0002\u0000\u0000\u01bb`\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u0005N\u0000\u0000\u01bd\u01be\u0005o\u0000\u0000\u01be\u01bf"+
		"\u0005d\u0000\u0000\u01bf\u01c0\u0005e\u0000\u0000\u01c0b\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c2\u0005E\u0000\u0000\u01c2\u01c3\u0005d\u0000\u0000"+
		"\u01c3\u01c4\u0005g\u0000\u0000\u01c4\u01c5\u0005e\u0000\u0000\u01c5d"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005V\u0000\u0000\u01c7\u01c8\u0005"+
		"a\u0000\u0000\u01c8\u01c9\u0005l\u0000\u0000\u01c9f\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cb\u0005C\u0000\u0000\u01cb\u01cc\u0005o\u0000\u0000\u01cc"+
		"\u01cd\u0005l\u0000\u0000\u01cd\u01ce\u0005o\u0000\u0000\u01ce\u01cf\u0005"+
		"r\u0000\u0000\u01cfh\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005N\u0000"+
		"\u0000\u01d1\u01d2\u0005o\u0000\u0000\u01d2\u01d3\u0005d\u0000\u0000\u01d3"+
		"\u01d4\u0005e\u0000\u0000\u01d4\u01d5\u0005t\u0000\u0000\u01d5\u01d6\u0005"+
		"y\u0000\u0000\u01d6\u01d7\u0005p\u0000\u0000\u01d7\u01d8\u0005e\u0000"+
		"\u0000\u01d8j\u0001\u0000\u0000\u0000\u01d9\u01da\u0005E\u0000\u0000\u01da"+
		"\u01db\u0005d\u0000\u0000\u01db\u01dc\u0005g\u0000\u0000\u01dc\u01dd\u0005"+
		"e\u0000\u0000\u01dd\u01de\u0005t\u0000\u0000\u01de\u01df\u0005y\u0000"+
		"\u0000\u01df\u01e0\u0005p\u0000\u0000\u01e0\u01e1\u0005e\u0000\u0000\u01e1"+
		"l\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005G\u0000\u0000\u01e3\u01e4\u0005"+
		"r\u0000\u0000\u01e4\u01e5\u0005a\u0000\u0000\u01e5\u01e6\u0005p\u0000"+
		"\u0000\u01e6\u01e7\u0005h\u0000\u0000\u01e7n\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e9\u0005D\u0000\u0000\u01e9\u01ea\u0005i\u0000\u0000\u01ea\u01eb\u0005"+
		"g\u0000\u0000\u01eb\u01ec\u0005r\u0000\u0000\u01ec\u01ed\u0005a\u0000"+
		"\u0000\u01ed\u01ee\u0005p\u0000\u0000\u01ee\u01ef\u0005h\u0000\u0000\u01ef"+
		"p\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005N\u0000\u0000\u01f1\u01f2\u0005"+
		"o\u0000\u0000\u01f2\u01f3\u0005d\u0000\u0000\u01f3\u01f4\u0005e\u0000"+
		"\u0000\u01f4\u01f5\u0005O\u0000\u0000\u01f5\u01f6\u0005r\u0000\u0000\u01f6"+
		"\u01f7\u0005d\u0000\u0000\u01f7\u01f8\u0005e\u0000\u0000\u01f8\u01f9\u0005"+
		"r\u0000\u0000\u01f9\u01fa\u0005D\u0000\u0000\u01fa\u01fb\u0005o\u0000"+
		"\u0000\u01fb\u01fc\u0005w\u0000\u0000\u01fc\u01fd\u0005n\u0000\u0000\u01fd"+
		"r\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005G\u0000\u0000\u01ff\u0200\u0005"+
		"r\u0000\u0000\u0200\u0201\u0005a\u0000\u0000\u0201\u0202\u0005p\u0000"+
		"\u0000\u0202\u0203\u0005h\u0000\u0000\u0203\u0204\u0005c\u0000\u0000\u0204"+
		"\u0205\u0005o\u0000\u0000\u0205\u0206\u0005l\u0000\u0000\u0206\u0207\u0005"+
		"o\u0000\u0000\u0207\u0208\u0005r\u0000\u0000\u0208t\u0001\u0000\u0000"+
		"\u0000\u0209\u020a\u0005G\u0000\u0000\u020a\u020b\u0005e\u0000\u0000\u020b"+
		"\u020c\u0005n\u0000\u0000\u020c\u020d\u0005e\u0000\u0000\u020d\u020e\u0005"+
		"r\u0000\u0000\u020e\u020f\u0005a\u0000\u0000\u020f\u0210\u0005t\u0000"+
		"\u0000\u0210\u0211\u0005e\u0000\u0000\u0211v\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0005#\u0000\u0000\u0213\u0214\u0003y<\u0000\u0214\u0215\u0003"+
		"y<\u0000\u0215\u0216\u0003y<\u0000\u0216\u0217\u0003y<\u0000\u0217\u0218"+
		"\u0003y<\u0000\u0218\u0219\u0003y<\u0000\u0219x\u0001\u0000\u0000\u0000"+
		"\u021a\u021b\u0007\u0003\u0000\u0000\u021bz\u0001\u0000\u0000\u0000\u021c"+
		"\u021d\u0005-\u0000\u0000\u021d\u0221\u0005-\u0000\u0000\u021e\u021f\u0005"+
		".\u0000\u0000\u021f\u0221\u0005-\u0000\u0000\u0220\u021c\u0001\u0000\u0000"+
		"\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0221|\u0001\u0000\u0000\u0000"+
		"\u0222\u0223\u0005(\u0000\u0000\u0223\u0228\u0005)\u0000\u0000\u0224\u0228"+
		"\u0002*+\u0000\u0225\u0226\u0005<\u0000\u0000\u0226\u0228\u0005>\u0000"+
		"\u0000\u0227\u0222\u0001\u0000\u0000\u0000\u0227\u0224\u0001\u0000\u0000"+
		"\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0228~\u0001\u0000\u0000\u0000"+
		"\n\u0000\u019b\u01a3\u01a8\u01ac\u01b0\u01b2\u01b8\u0220\u0227\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}