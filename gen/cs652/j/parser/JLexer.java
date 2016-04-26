// Generated from /Users/xyz/Desktop/Th111-vtable/src/cs652/j/parser/J.g4 by ANTLR 4.5
package cs652.j.parser;

import cs652.j.semantics.*; // You will need these for stuff in "returns" clauses
import org.antlr.symbols.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, CLASS=3, ELSE=4, EXTENDS=5, IF=6, INT=7, NEW=8, RETURN=9, 
		THIS=10, VOID=11, WHILE=12, IntegerLiteral=13, FloatingPointLiteral=14, 
		BooleanLiteral=15, CharacterLiteral=16, StringLiteral=17, NullLiteral=18, 
		LPAREN=19, RPAREN=20, LBRACE=21, RBRACE=22, LBRACK=23, RBRACK=24, SEMI=25, 
		COMMA=26, DOT=27, ASSIGN=28, GT=29, LT=30, BANG=31, TILDE=32, QUESTION=33, 
		COLON=34, EQUAL=35, LE=36, GE=37, NOTEQUAL=38, AND=39, OR=40, INC=41, 
		DEC=42, ADD=43, SUB=44, MUL=45, DIV=46, BITAND=47, BITOR=48, CARET=49, 
		MOD=50, ADD_ASSIGN=51, SUB_ASSIGN=52, MUL_ASSIGN=53, DIV_ASSIGN=54, AND_ASSIGN=55, 
		OR_ASSIGN=56, XOR_ASSIGN=57, MOD_ASSIGN=58, LSHIFT_ASSIGN=59, RSHIFT_ASSIGN=60, 
		URSHIFT_ASSIGN=61, Identifier=62, AT=63, ELLIPSIS=64, COMMENT=65, LINE_COMMENT=66, 
		WS=67;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "CLASS", "ELSE", "EXTENDS", "IF", "INT", "NEW", "RETURN", 
		"THIS", "VOID", "WHILE", "IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", 
		"Digits", "Digit", "NonZeroDigit", "DigitOrUnderscore", "Underscores", 
		"HexNumeral", "HexDigits", "HexDigit", "HexDigitOrUnderscore", "OctalNumeral", 
		"OctalDigits", "OctalDigit", "OctalDigitOrUnderscore", "BinaryNumeral", 
		"BinaryDigits", "BinaryDigit", "BinaryDigitOrUnderscore", "FloatingPointLiteral", 
		"DecimalFloatingPointLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", "HexSignificand", 
		"BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", "CharacterLiteral", 
		"SingleCharacter", "StringLiteral", "StringCharacters", "StringCharacter", 
		"EscapeSequence", "OctalEscape", "UnicodeEscape", "ZeroToThree", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "JavaLetter", 
		"JavaLetterOrDigit", "AT", "ELLIPSIS", "COMMENT", "LINE_COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'float'", "'printf'", "'class'", "'else'", "'extends'", "'if'", 
		"'int'", "'new'", "'return'", "'this'", "'void'", "'while'", null, null, 
		null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
		"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, 
		"'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "CLASS", "ELSE", "EXTENDS", "IF", "INT", "NEW", "RETURN", 
		"THIS", "VOID", "WHILE", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"CharacterLiteral", "StringLiteral", "NullLiteral", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
		"GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
		"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
		"BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", "ELLIPSIS", "COMMENT", 
		"LINE_COMMENT", "WS"
	};
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


	public JLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "J.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 102:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 103:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2E\u02d3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u0124\n\16\3\17\3\17\5\17\u0128\n"+
		"\17\3\20\3\20\5\20\u012c\n\20\3\21\3\21\5\21\u0130\n\21\3\22\3\22\5\22"+
		"\u0134\n\22\3\23\3\23\3\24\3\24\3\24\5\24\u013b\n\24\3\24\3\24\3\24\5"+
		"\24\u0140\n\24\5\24\u0142\n\24\3\25\3\25\7\25\u0146\n\25\f\25\16\25\u0149"+
		"\13\25\3\25\5\25\u014c\n\25\3\26\3\26\5\26\u0150\n\26\3\27\3\27\3\30\3"+
		"\30\5\30\u0156\n\30\3\31\6\31\u0159\n\31\r\31\16\31\u015a\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\7\33\u0163\n\33\f\33\16\33\u0166\13\33\3\33\5\33\u0169"+
		"\n\33\3\34\3\34\3\35\3\35\5\35\u016f\n\35\3\36\3\36\5\36\u0173\n\36\3"+
		"\36\3\36\3\37\3\37\7\37\u0179\n\37\f\37\16\37\u017c\13\37\3\37\5\37\u017f"+
		"\n\37\3 \3 \3!\3!\5!\u0185\n!\3\"\3\"\3\"\3\"\3#\3#\7#\u018d\n#\f#\16"+
		"#\u0190\13#\3#\5#\u0193\n#\3$\3$\3%\3%\5%\u0199\n%\3&\3&\5&\u019d\n&\3"+
		"\'\3\'\3\'\5\'\u01a2\n\'\3\'\5\'\u01a5\n\'\3\'\5\'\u01a8\n\'\3\'\3\'\3"+
		"\'\5\'\u01ad\n\'\3\'\5\'\u01b0\n\'\3\'\3\'\3\'\5\'\u01b5\n\'\3\'\3\'\3"+
		"\'\5\'\u01ba\n\'\3(\3(\3(\3)\3)\3*\5*\u01c2\n*\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3-\5-\u01cd\n-\3.\3.\5.\u01d1\n.\3.\3.\3.\5.\u01d6\n.\3.\3.\5.\u01da"+
		"\n.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5"+
		"\61\u01ea\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01f4\n\62"+
		"\3\63\3\63\3\64\3\64\5\64\u01fa\n\64\3\64\3\64\3\65\6\65\u01ff\n\65\r"+
		"\65\16\65\u0200\3\66\3\66\5\66\u0205\n\66\3\67\3\67\3\67\3\67\5\67\u020b"+
		"\n\67\38\38\38\38\38\38\38\38\38\38\38\58\u0218\n8\39\39\39\39\39\39\3"+
		"9\3:\3:\3;\3;\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3"+
		"C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3L\3M\3M\3M\3"+
		"N\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3T\3T\3U\3U\3V\3"+
		"V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3\\\3]\3]\3]\3^\3^\3^\3_\3_\3"+
		"_\3`\3`\3`\3a\3a\3a\3b\3b\3b\3c\3c\3c\3d\3d\3d\3d\3e\3e\3e\3e\3f\3f\3"+
		"f\3f\3f\3g\3g\7g\u0297\ng\fg\16g\u029a\13g\3h\3h\3h\3h\3h\3h\5h\u02a2"+
		"\nh\3i\3i\3i\3i\3i\3i\5i\u02aa\ni\3j\3j\3k\3k\3k\3k\3l\3l\3l\3l\7l\u02b6"+
		"\nl\fl\16l\u02b9\13l\3l\3l\3l\3l\3l\3m\3m\3m\3m\7m\u02c4\nm\fm\16m\u02c7"+
		"\13m\3m\3m\3m\3m\3n\6n\u02ce\nn\rn\16n\u02cf\3n\3n\3\u02b7\2o\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37\2!\2#"+
		"\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K"+
		"\20M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\21c\22e\2g\23i\2k\2m\2o\2q\2s\2u\24"+
		"w\25y\26{\27}\30\177\31\u0081\32\u0083\33\u0085\34\u0087\35\u0089\36\u008b"+
		"\37\u008d \u008f!\u0091\"\u0093#\u0095$\u0097%\u0099&\u009b\'\u009d(\u009f"+
		")\u00a1*\u00a3+\u00a5,\u00a7-\u00a9.\u00ab/\u00ad\60\u00af\61\u00b1\62"+
		"\u00b3\63\u00b5\64\u00b7\65\u00b9\66\u00bb\67\u00bd8\u00bf9\u00c1:\u00c3"+
		";\u00c5<\u00c7=\u00c9>\u00cb?\u00cd@\u00cf\2\u00d1\2\u00d3A\u00d5B\u00d7"+
		"C\u00d9D\u00dbE\3\2\30\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2"+
		"DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\4\2))^^\4\2$$^^\n\2"+
		"$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802"+
		"\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\3\2\f\f\5\2\13\f\17\17\"\"\u02e1"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2K\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2g\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2"+
		"\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5"+
		"\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\3\u00dd\3\2\2"+
		"\2\5\u00e3\3\2\2\2\7\u00ea\3\2\2\2\t\u00f0\3\2\2\2\13\u00f5\3\2\2\2\r"+
		"\u00fd\3\2\2\2\17\u0100\3\2\2\2\21\u0104\3\2\2\2\23\u0108\3\2\2\2\25\u010f"+
		"\3\2\2\2\27\u0114\3\2\2\2\31\u0119\3\2\2\2\33\u0123\3\2\2\2\35\u0125\3"+
		"\2\2\2\37\u0129\3\2\2\2!\u012d\3\2\2\2#\u0131\3\2\2\2%\u0135\3\2\2\2\'"+
		"\u0141\3\2\2\2)\u0143\3\2\2\2+\u014f\3\2\2\2-\u0151\3\2\2\2/\u0155\3\2"+
		"\2\2\61\u0158\3\2\2\2\63\u015c\3\2\2\2\65\u0160\3\2\2\2\67\u016a\3\2\2"+
		"\29\u016e\3\2\2\2;\u0170\3\2\2\2=\u0176\3\2\2\2?\u0180\3\2\2\2A\u0184"+
		"\3\2\2\2C\u0186\3\2\2\2E\u018a\3\2\2\2G\u0194\3\2\2\2I\u0198\3\2\2\2K"+
		"\u019c\3\2\2\2M\u01b9\3\2\2\2O\u01bb\3\2\2\2Q\u01be\3\2\2\2S\u01c1\3\2"+
		"\2\2U\u01c5\3\2\2\2W\u01c7\3\2\2\2Y\u01c9\3\2\2\2[\u01d9\3\2\2\2]\u01db"+
		"\3\2\2\2_\u01de\3\2\2\2a\u01e9\3\2\2\2c\u01f3\3\2\2\2e\u01f5\3\2\2\2g"+
		"\u01f7\3\2\2\2i\u01fe\3\2\2\2k\u0204\3\2\2\2m\u020a\3\2\2\2o\u0217\3\2"+
		"\2\2q\u0219\3\2\2\2s\u0220\3\2\2\2u\u0222\3\2\2\2w\u0227\3\2\2\2y\u0229"+
		"\3\2\2\2{\u022b\3\2\2\2}\u022d\3\2\2\2\177\u022f\3\2\2\2\u0081\u0231\3"+
		"\2\2\2\u0083\u0233\3\2\2\2\u0085\u0235\3\2\2\2\u0087\u0237\3\2\2\2\u0089"+
		"\u0239\3\2\2\2\u008b\u023b\3\2\2\2\u008d\u023d\3\2\2\2\u008f\u023f\3\2"+
		"\2\2\u0091\u0241\3\2\2\2\u0093\u0243\3\2\2\2\u0095\u0245\3\2\2\2\u0097"+
		"\u0247\3\2\2\2\u0099\u024a\3\2\2\2\u009b\u024d\3\2\2\2\u009d\u0250\3\2"+
		"\2\2\u009f\u0253\3\2\2\2\u00a1\u0256\3\2\2\2\u00a3\u0259\3\2\2\2\u00a5"+
		"\u025c\3\2\2\2\u00a7\u025f\3\2\2\2\u00a9\u0261\3\2\2\2\u00ab\u0263\3\2"+
		"\2\2\u00ad\u0265\3\2\2\2\u00af\u0267\3\2\2\2\u00b1\u0269\3\2\2\2\u00b3"+
		"\u026b\3\2\2\2\u00b5\u026d\3\2\2\2\u00b7\u026f\3\2\2\2\u00b9\u0272\3\2"+
		"\2\2\u00bb\u0275\3\2\2\2\u00bd\u0278\3\2\2\2\u00bf\u027b\3\2\2\2\u00c1"+
		"\u027e\3\2\2\2\u00c3\u0281\3\2\2\2\u00c5\u0284\3\2\2\2\u00c7\u0287\3\2"+
		"\2\2\u00c9\u028b\3\2\2\2\u00cb\u028f\3\2\2\2\u00cd\u0294\3\2\2\2\u00cf"+
		"\u02a1\3\2\2\2\u00d1\u02a9\3\2\2\2\u00d3\u02ab\3\2\2\2\u00d5\u02ad\3\2"+
		"\2\2\u00d7\u02b1\3\2\2\2\u00d9\u02bf\3\2\2\2\u00db\u02cd\3\2\2\2\u00dd"+
		"\u00de\7h\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7c\2\2"+
		"\u00e1\u00e2\7v\2\2\u00e2\4\3\2\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7t"+
		"\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9"+
		"\7h\2\2\u00e9\6\3\2\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed"+
		"\7c\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7u\2\2\u00ef\b\3\2\2\2\u00f0\u00f1"+
		"\7g\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7g\2\2\u00f4"+
		"\n\3\2\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7z\2\2\u00f7\u00f8\7v\2\2\u00f8"+
		"\u00f9\7g\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7f\2\2\u00fb\u00fc\7u\2\2"+
		"\u00fc\f\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7h\2\2\u00ff\16\3\2\2"+
		"\2\u0100\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103\7v\2\2\u0103\20\3"+
		"\2\2\2\u0104\u0105\7p\2\2\u0105\u0106\7g\2\2\u0106\u0107\7y\2\2\u0107"+
		"\22\3\2\2\2\u0108\u0109\7t\2\2\u0109\u010a\7g\2\2\u010a\u010b\7v\2\2\u010b"+
		"\u010c\7w\2\2\u010c\u010d\7t\2\2\u010d\u010e\7p\2\2\u010e\24\3\2\2\2\u010f"+
		"\u0110\7v\2\2\u0110\u0111\7j\2\2\u0111\u0112\7k\2\2\u0112\u0113\7u\2\2"+
		"\u0113\26\3\2\2\2\u0114\u0115\7x\2\2\u0115\u0116\7q\2\2\u0116\u0117\7"+
		"k\2\2\u0117\u0118\7f\2\2\u0118\30\3\2\2\2\u0119\u011a\7y\2\2\u011a\u011b"+
		"\7j\2\2\u011b\u011c\7k\2\2\u011c\u011d\7n\2\2\u011d\u011e\7g\2\2\u011e"+
		"\32\3\2\2\2\u011f\u0124\5\35\17\2\u0120\u0124\5\37\20\2\u0121\u0124\5"+
		"!\21\2\u0122\u0124\5#\22\2\u0123\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\34\3\2\2\2\u0125\u0127\5\'\24"+
		"\2\u0126\u0128\5%\23\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\36"+
		"\3\2\2\2\u0129\u012b\5\63\32\2\u012a\u012c\5%\23\2\u012b\u012a\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012c \3\2\2\2\u012d\u012f\5;\36\2\u012e\u0130\5"+
		"%\23\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\"\3\2\2\2\u0131\u0133"+
		"\5C\"\2\u0132\u0134\5%\23\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"$\3\2\2\2\u0135\u0136\t\2\2\2\u0136&\3\2\2\2\u0137\u0142\7\62\2\2\u0138"+
		"\u013f\5-\27\2\u0139\u013b\5)\25\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u0140\3\2\2\2\u013c\u013d\5\61\31\2\u013d\u013e\5)\25\2\u013e"+
		"\u0140\3\2\2\2\u013f\u013a\3\2\2\2\u013f\u013c\3\2\2\2\u0140\u0142\3\2"+
		"\2\2\u0141\u0137\3\2\2\2\u0141\u0138\3\2\2\2\u0142(\3\2\2\2\u0143\u014b"+
		"\5+\26\2\u0144\u0146\5/\30\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u014a\u014c\5+\26\2\u014b\u0147\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"*\3\2\2\2\u014d\u0150\7\62\2\2\u014e\u0150\5-\27\2\u014f\u014d\3\2\2\2"+
		"\u014f\u014e\3\2\2\2\u0150,\3\2\2\2\u0151\u0152\t\3\2\2\u0152.\3\2\2\2"+
		"\u0153\u0156\5+\26\2\u0154\u0156\7a\2\2\u0155\u0153\3\2\2\2\u0155\u0154"+
		"\3\2\2\2\u0156\60\3\2\2\2\u0157\u0159\7a\2\2\u0158\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\62\3\2\2"+
		"\2\u015c\u015d\7\62\2\2\u015d\u015e\t\4\2\2\u015e\u015f\5\65\33\2\u015f"+
		"\64\3\2\2\2\u0160\u0168\5\67\34\2\u0161\u0163\59\35\2\u0162\u0161\3\2"+
		"\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\5\67\34\2\u0168\u0164\3"+
		"\2\2\2\u0168\u0169\3\2\2\2\u0169\66\3\2\2\2\u016a\u016b\t\5\2\2\u016b"+
		"8\3\2\2\2\u016c\u016f\5\67\34\2\u016d\u016f\7a\2\2\u016e\u016c\3\2\2\2"+
		"\u016e\u016d\3\2\2\2\u016f:\3\2\2\2\u0170\u0172\7\62\2\2\u0171\u0173\5"+
		"\61\31\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\5=\37\2\u0175<\3\2\2\2\u0176\u017e\5? \2\u0177\u0179\5A!\2\u0178"+
		"\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017f\5? \2\u017e\u017a"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f>\3\2\2\2\u0180\u0181\t\6\2\2\u0181"+
		"@\3\2\2\2\u0182\u0185\5? \2\u0183\u0185\7a\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0183\3\2\2\2\u0185B\3\2\2\2\u0186\u0187\7\62\2\2\u0187\u0188\t\7\2\2"+
		"\u0188\u0189\5E#\2\u0189D\3\2\2\2\u018a\u0192\5G$\2\u018b\u018d\5I%\2"+
		"\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0193\5G$\2\u0192"+
		"\u018e\3\2\2\2\u0192\u0193\3\2\2\2\u0193F\3\2\2\2\u0194\u0195\t\b\2\2"+
		"\u0195H\3\2\2\2\u0196\u0199\5G$\2\u0197\u0199\7a\2\2\u0198\u0196\3\2\2"+
		"\2\u0198\u0197\3\2\2\2\u0199J\3\2\2\2\u019a\u019d\5M\'\2\u019b\u019d\5"+
		"Y-\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019dL\3\2\2\2\u019e\u019f"+
		"\5)\25\2\u019f\u01a1\7\60\2\2\u01a0\u01a2\5)\25\2\u01a1\u01a0\3\2\2\2"+
		"\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a5\5O(\2\u01a4\u01a3"+
		"\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a8\5W,\2\u01a7"+
		"\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ba\3\2\2\2\u01a9\u01aa\7\60"+
		"\2\2\u01aa\u01ac\5)\25\2\u01ab\u01ad\5O(\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad"+
		"\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01b0\5W,\2\u01af\u01ae\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01ba\3\2\2\2\u01b1\u01b2\5)\25\2\u01b2\u01b4\5O"+
		"(\2\u01b3\u01b5\5W,\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01ba"+
		"\3\2\2\2\u01b6\u01b7\5)\25\2\u01b7\u01b8\5W,\2\u01b8\u01ba\3\2\2\2\u01b9"+
		"\u019e\3\2\2\2\u01b9\u01a9\3\2\2\2\u01b9\u01b1\3\2\2\2\u01b9\u01b6\3\2"+
		"\2\2\u01baN\3\2\2\2\u01bb\u01bc\5Q)\2\u01bc\u01bd\5S*\2\u01bdP\3\2\2\2"+
		"\u01be\u01bf\t\t\2\2\u01bfR\3\2\2\2\u01c0\u01c2\5U+\2\u01c1\u01c0\3\2"+
		"\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\5)\25\2\u01c4"+
		"T\3\2\2\2\u01c5\u01c6\t\n\2\2\u01c6V\3\2\2\2\u01c7\u01c8\t\13\2\2\u01c8"+
		"X\3\2\2\2\u01c9\u01ca\5[.\2\u01ca\u01cc\5]/\2\u01cb\u01cd\5W,\2\u01cc"+
		"\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cdZ\3\2\2\2\u01ce\u01d0\5\63\32"+
		"\2\u01cf\u01d1\7\60\2\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01da\3\2\2\2\u01d2\u01d3\7\62\2\2\u01d3\u01d5\t\4\2\2\u01d4\u01d6\5"+
		"\65\33\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\7\60\2\2\u01d8\u01da\5\65\33\2\u01d9\u01ce\3\2\2\2\u01d9\u01d2"+
		"\3\2\2\2\u01da\\\3\2\2\2\u01db\u01dc\5_\60\2\u01dc\u01dd\5S*\2\u01dd^"+
		"\3\2\2\2\u01de\u01df\t\f\2\2\u01df`\3\2\2\2\u01e0\u01e1\7v\2\2\u01e1\u01e2"+
		"\7t\2\2\u01e2\u01e3\7w\2\2\u01e3\u01ea\7g\2\2\u01e4\u01e5\7h\2\2\u01e5"+
		"\u01e6\7c\2\2\u01e6\u01e7\7n\2\2\u01e7\u01e8\7u\2\2\u01e8\u01ea\7g\2\2"+
		"\u01e9\u01e0\3\2\2\2\u01e9\u01e4\3\2\2\2\u01eab\3\2\2\2\u01eb\u01ec\7"+
		")\2\2\u01ec\u01ed\5e\63\2\u01ed\u01ee\7)\2\2\u01ee\u01f4\3\2\2\2\u01ef"+
		"\u01f0\7)\2\2\u01f0\u01f1\5m\67\2\u01f1\u01f2\7)\2\2\u01f2\u01f4\3\2\2"+
		"\2\u01f3\u01eb\3\2\2\2\u01f3\u01ef\3\2\2\2\u01f4d\3\2\2\2\u01f5\u01f6"+
		"\n\r\2\2\u01f6f\3\2\2\2\u01f7\u01f9\7$\2\2\u01f8\u01fa\5i\65\2\u01f9\u01f8"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\7$\2\2\u01fc"+
		"h\3\2\2\2\u01fd\u01ff\5k\66\2\u01fe\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2"+
		"\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201j\3\2\2\2\u0202\u0205\n"+
		"\16\2\2\u0203\u0205\5m\67\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205"+
		"l\3\2\2\2\u0206\u0207\7^\2\2\u0207\u020b\t\17\2\2\u0208\u020b\5o8\2\u0209"+
		"\u020b\5q9\2\u020a\u0206\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2"+
		"\2\u020bn\3\2\2\2\u020c\u020d\7^\2\2\u020d\u0218\5? \2\u020e\u020f\7^"+
		"\2\2\u020f\u0210\5? \2\u0210\u0211\5? \2\u0211\u0218\3\2\2\2\u0212\u0213"+
		"\7^\2\2\u0213\u0214\5s:\2\u0214\u0215\5? \2\u0215\u0216\5? \2\u0216\u0218"+
		"\3\2\2\2\u0217\u020c\3\2\2\2\u0217\u020e\3\2\2\2\u0217\u0212\3\2\2\2\u0218"+
		"p\3\2\2\2\u0219\u021a\7^\2\2\u021a\u021b\7w\2\2\u021b\u021c\5\67\34\2"+
		"\u021c\u021d\5\67\34\2\u021d\u021e\5\67\34\2\u021e\u021f\5\67\34\2\u021f"+
		"r\3\2\2\2\u0220\u0221\t\20\2\2\u0221t\3\2\2\2\u0222\u0223\7p\2\2\u0223"+
		"\u0224\7w\2\2\u0224\u0225\7n\2\2\u0225\u0226\7n\2\2\u0226v\3\2\2\2\u0227"+
		"\u0228\7*\2\2\u0228x\3\2\2\2\u0229\u022a\7+\2\2\u022az\3\2\2\2\u022b\u022c"+
		"\7}\2\2\u022c|\3\2\2\2\u022d\u022e\7\177\2\2\u022e~\3\2\2\2\u022f\u0230"+
		"\7]\2\2\u0230\u0080\3\2\2\2\u0231\u0232\7_\2\2\u0232\u0082\3\2\2\2\u0233"+
		"\u0234\7=\2\2\u0234\u0084\3\2\2\2\u0235\u0236\7.\2\2\u0236\u0086\3\2\2"+
		"\2\u0237\u0238\7\60\2\2\u0238\u0088\3\2\2\2\u0239\u023a\7?\2\2\u023a\u008a"+
		"\3\2\2\2\u023b\u023c\7@\2\2\u023c\u008c\3\2\2\2\u023d\u023e\7>\2\2\u023e"+
		"\u008e\3\2\2\2\u023f\u0240\7#\2\2\u0240\u0090\3\2\2\2\u0241\u0242\7\u0080"+
		"\2\2\u0242\u0092\3\2\2\2\u0243\u0244\7A\2\2\u0244\u0094\3\2\2\2\u0245"+
		"\u0246\7<\2\2\u0246\u0096\3\2\2\2\u0247\u0248\7?\2\2\u0248\u0249\7?\2"+
		"\2\u0249\u0098\3\2\2\2\u024a\u024b\7>\2\2\u024b\u024c\7?\2\2\u024c\u009a"+
		"\3\2\2\2\u024d\u024e\7@\2\2\u024e\u024f\7?\2\2\u024f\u009c\3\2\2\2\u0250"+
		"\u0251\7#\2\2\u0251\u0252\7?\2\2\u0252\u009e\3\2\2\2\u0253\u0254\7(\2"+
		"\2\u0254\u0255\7(\2\2\u0255\u00a0\3\2\2\2\u0256\u0257\7~\2\2\u0257\u0258"+
		"\7~\2\2\u0258\u00a2\3\2\2\2\u0259\u025a\7-\2\2\u025a\u025b\7-\2\2\u025b"+
		"\u00a4\3\2\2\2\u025c\u025d\7/\2\2\u025d\u025e\7/\2\2\u025e\u00a6\3\2\2"+
		"\2\u025f\u0260\7-\2\2\u0260\u00a8\3\2\2\2\u0261\u0262\7/\2\2\u0262\u00aa"+
		"\3\2\2\2\u0263\u0264\7,\2\2\u0264\u00ac\3\2\2\2\u0265\u0266\7\61\2\2\u0266"+
		"\u00ae\3\2\2\2\u0267\u0268\7(\2\2\u0268\u00b0\3\2\2\2\u0269\u026a\7~\2"+
		"\2\u026a\u00b2\3\2\2\2\u026b\u026c\7`\2\2\u026c\u00b4\3\2\2\2\u026d\u026e"+
		"\7\'\2\2\u026e\u00b6\3\2\2\2\u026f\u0270\7-\2\2\u0270\u0271\7?\2\2\u0271"+
		"\u00b8\3\2\2\2\u0272\u0273\7/\2\2\u0273\u0274\7?\2\2\u0274\u00ba\3\2\2"+
		"\2\u0275\u0276\7,\2\2\u0276\u0277\7?\2\2\u0277\u00bc\3\2\2\2\u0278\u0279"+
		"\7\61\2\2\u0279\u027a\7?\2\2\u027a\u00be\3\2\2\2\u027b\u027c\7(\2\2\u027c"+
		"\u027d\7?\2\2\u027d\u00c0\3\2\2\2\u027e\u027f\7~\2\2\u027f\u0280\7?\2"+
		"\2\u0280\u00c2\3\2\2\2\u0281\u0282\7`\2\2\u0282\u0283\7?\2\2\u0283\u00c4"+
		"\3\2\2\2\u0284\u0285\7\'\2\2\u0285\u0286\7?\2\2\u0286\u00c6\3\2\2\2\u0287"+
		"\u0288\7>\2\2\u0288\u0289\7>\2\2\u0289\u028a\7?\2\2\u028a\u00c8\3\2\2"+
		"\2\u028b\u028c\7@\2\2\u028c\u028d\7@\2\2\u028d\u028e\7?\2\2\u028e\u00ca"+
		"\3\2\2\2\u028f\u0290\7@\2\2\u0290\u0291\7@\2\2\u0291\u0292\7@\2\2\u0292"+
		"\u0293\7?\2\2\u0293\u00cc\3\2\2\2\u0294\u0298\5\u00cfh\2\u0295\u0297\5"+
		"\u00d1i\2\u0296\u0295\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296\3\2\2\2"+
		"\u0298\u0299\3\2\2\2\u0299\u00ce\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u02a2"+
		"\t\21\2\2\u029c\u029d\n\22\2\2\u029d\u02a2\6h\2\2\u029e\u029f\t\23\2\2"+
		"\u029f\u02a0\t\24\2\2\u02a0\u02a2\6h\3\2\u02a1\u029b\3\2\2\2\u02a1\u029c"+
		"\3\2\2\2\u02a1\u029e\3\2\2\2\u02a2\u00d0\3\2\2\2\u02a3\u02aa\t\25\2\2"+
		"\u02a4\u02a5\n\22\2\2\u02a5\u02aa\6i\4\2\u02a6\u02a7\t\23\2\2\u02a7\u02a8"+
		"\t\24\2\2\u02a8\u02aa\6i\5\2\u02a9\u02a3\3\2\2\2\u02a9\u02a4\3\2\2\2\u02a9"+
		"\u02a6\3\2\2\2\u02aa\u00d2\3\2\2\2\u02ab\u02ac\7B\2\2\u02ac\u00d4\3\2"+
		"\2\2\u02ad\u02ae\7\60\2\2\u02ae\u02af\7\60\2\2\u02af\u02b0\7\60\2\2\u02b0"+
		"\u00d6\3\2\2\2\u02b1\u02b2\7\61\2\2\u02b2\u02b3\7,\2\2\u02b3\u02b7\3\2"+
		"\2\2\u02b4\u02b6\13\2\2\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02b7\3\2"+
		"\2\2\u02ba\u02bb\7,\2\2\u02bb\u02bc\7\61\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"\u02be\bl\2\2\u02be\u00d8\3\2\2\2\u02bf\u02c0\7\61\2\2\u02c0\u02c1\7\61"+
		"\2\2\u02c1\u02c5\3\2\2\2\u02c2\u02c4\n\26\2\2\u02c3\u02c2\3\2\2\2\u02c4"+
		"\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\3\2"+
		"\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\7\f\2\2\u02c9\u02ca\3\2\2\2\u02ca"+
		"\u02cb\bm\2\2\u02cb\u00da\3\2\2\2\u02cc\u02ce\t\27\2\2\u02cd\u02cc\3\2"+
		"\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0"+
		"\u02d1\3\2\2\2\u02d1\u02d2\bn\2\2\u02d2\u00dc\3\2\2\2\64\2\u0123\u0127"+
		"\u012b\u012f\u0133\u013a\u013f\u0141\u0147\u014b\u014f\u0155\u015a\u0164"+
		"\u0168\u016e\u0172\u017a\u017e\u0184\u018e\u0192\u0198\u019c\u01a1\u01a4"+
		"\u01a7\u01ac\u01af\u01b4\u01b9\u01c1\u01cc\u01d0\u01d5\u01d9\u01e9\u01f3"+
		"\u01f9\u0200\u0204\u020a\u0217\u0298\u02a1\u02a9\u02b7\u02c5\u02cf\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}