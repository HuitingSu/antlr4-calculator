// Generated from calculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DOUBLE=2, SCIENTIFIC_NUMBER=3, COS=4, SIN=5, TAN=6, ACOS=7, ASIN=8, 
		ATAN=9, LN=10, LOG=11, SQRT=12, LPAREN=13, RPAREN=14, PLUS=15, MINUS=16, 
		TIMES=17, DIV=18, GT=19, LT=20, EQ=21, COMMA=22, POINT=23, POW=24, PI=25, 
		EULER=26, I=27, VARIABLE=28, NUMBER=29, NEWLINE=30, WS=31;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_atom = 3;
	public static final String[] ruleNames = {
		"prog", "stat", "expr", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'cos'", "'sin'", "'tan'", "'acos'", "'asin'", 
		"'atan'", "'ln'", "'log'", "'sqrt'", "'('", "')'", "'+'", "'-'", "'*'", 
		"'/'", "'>'", "'<'", "'='", "','", "'.'", "'^'", "'pi'", null, "'i'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "DOUBLE", "SCIENTIFIC_NUMBER", "COS", "SIN", "TAN", "ACOS", 
		"ASIN", "ATAN", "LN", "LOG", "SQRT", "LPAREN", "RPAREN", "PLUS", "MINUS", 
		"TIMES", "DIV", "GT", "LT", "EQ", "COMMA", "POINT", "POW", "PI", "EULER", 
		"I", "VARIABLE", "NUMBER", "NEWLINE", "WS"
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

	@Override
	public String getGrammarFileName() { return "calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				stat();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << SCIENTIFIC_NUMBER) | (1L << COS) | (1L << SIN) | (1L << TAN) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << LN) | (1L << LOG) | (1L << SQRT) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << PI) | (1L << EULER) | (1L << VARIABLE) | (1L << NEWLINE))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(calculatorParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(calculatorParser.NEWLINE, 0); }
		public PrintExprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatContext {
		public TerminalNode VARIABLE() { return getToken(calculatorParser.VARIABLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(calculatorParser.NEWLINE, 0); }
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				expr(0);
				setState(14);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(VARIABLE);
				setState(17);
				match(EQ);
				setState(18);
				expr(0);
				setState(19);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				match(NEWLINE);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ACosineContext extends ExprContext {
		public TerminalNode ACOS() { return getToken(calculatorParser.ACOS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ACosineContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitACosine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SignedContext extends ExprContext {
		public Token op;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SignedContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitSigned(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomsContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitAtoms(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SineContext extends ExprContext {
		public TerminalNode SIN() { return getToken(calculatorParser.SIN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SineContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitSine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TangentContext extends ExprContext {
		public TerminalNode TAN() { return getToken(calculatorParser.TAN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TangentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitTangent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NaturalLogarithmContext extends ExprContext {
		public TerminalNode LN() { return getToken(calculatorParser.LN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NaturalLogarithmContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitNaturalLogarithm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ASineContext extends ExprContext {
		public TerminalNode ASIN() { return getToken(calculatorParser.ASIN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ASineContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitASine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogarithmContext extends ExprContext {
		public TerminalNode LOG() { return getToken(calculatorParser.LOG, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogarithmContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitLogarithm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SquareRootContext extends ExprContext {
		public TerminalNode SQRT() { return getToken(calculatorParser.SQRT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SquareRootContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitSquareRoot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ATangentContext extends ExprContext {
		public TerminalNode ATAN() { return getToken(calculatorParser.ATAN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ATangentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitATangent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosineContext extends ExprContext {
		public TerminalNode COS() { return getToken(calculatorParser.COS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CosineContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitCosine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				{
				_localctx = new SignedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(25);
				((SignedContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((SignedContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(26);
				atom();
				}
				break;
			case INT:
			case DOUBLE:
			case SCIENTIFIC_NUMBER:
			case LPAREN:
			case PI:
			case EULER:
			case VARIABLE:
				{
				_localctx = new AtomsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				atom();
				}
				break;
			case LOG:
				{
				_localctx = new LogarithmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				match(LOG);
				setState(29);
				match(LPAREN);
				setState(30);
				expr(0);
				setState(31);
				match(COMMA);
				setState(32);
				expr(0);
				setState(33);
				match(RPAREN);
				}
				break;
			case LN:
				{
				_localctx = new NaturalLogarithmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(LN);
				setState(36);
				match(LPAREN);
				setState(37);
				expr(0);
				setState(38);
				match(RPAREN);
				}
				break;
			case SQRT:
				{
				_localctx = new SquareRootContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(SQRT);
				setState(41);
				match(LPAREN);
				setState(42);
				expr(0);
				setState(43);
				match(RPAREN);
				}
				break;
			case SIN:
				{
				_localctx = new SineContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(SIN);
				setState(46);
				match(LPAREN);
				setState(47);
				expr(0);
				setState(48);
				match(RPAREN);
				}
				break;
			case ASIN:
				{
				_localctx = new ASineContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(ASIN);
				setState(51);
				match(LPAREN);
				setState(52);
				expr(0);
				setState(53);
				match(RPAREN);
				}
				break;
			case COS:
				{
				_localctx = new CosineContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(COS);
				setState(56);
				match(LPAREN);
				setState(57);
				expr(0);
				setState(58);
				match(RPAREN);
				}
				break;
			case ACOS:
				{
				_localctx = new ACosineContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(ACOS);
				setState(61);
				match(LPAREN);
				setState(62);
				expr(0);
				setState(63);
				match(RPAREN);
				}
				break;
			case TAN:
				{
				_localctx = new TangentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(TAN);
				setState(66);
				match(LPAREN);
				setState(67);
				expr(0);
				setState(68);
				match(RPAREN);
				}
				break;
			case ATAN:
				{
				_localctx = new ATangentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(ATAN);
				setState(71);
				match(LPAREN);
				setState(72);
				expr(0);
				setState(73);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(86);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(77);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(78);
						((PowerContext)_localctx).op = match(POW);
						setState(79);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(80);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(81);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(82);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(83);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(84);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(85);
						expr(13);
						}
						break;
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerContext extends AtomContext {
		public TerminalNode INT() { return getToken(calculatorParser.INT, 0); }
		public IntegerContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantPIContext extends AtomContext {
		public TerminalNode PI() { return getToken(calculatorParser.PI, 0); }
		public ConstantPIContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitConstantPI(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends AtomContext {
		public TerminalNode VARIABLE() { return getToken(calculatorParser.VARIABLE, 0); }
		public VariableContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracesContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(calculatorParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(calculatorParser.RPAREN, 0); }
		public BracesContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantEContext extends AtomContext {
		public TerminalNode EULER() { return getToken(calculatorParser.EULER, 0); }
		public ConstantEContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitConstantE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScientificContext extends AtomContext {
		public TerminalNode SCIENTIFIC_NUMBER() { return getToken(calculatorParser.SCIENTIFIC_NUMBER, 0); }
		public ScientificContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitScientific(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends AtomContext {
		public TerminalNode DOUBLE() { return getToken(calculatorParser.DOUBLE, 0); }
		public DoubleContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculatorVisitor ) return ((calculatorVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atom);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new DoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(DOUBLE);
				}
				break;
			case PI:
				_localctx = new ConstantPIContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(PI);
				}
				break;
			case EULER:
				_localctx = new ConstantEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(EULER);
				}
				break;
			case SCIENTIFIC_NUMBER:
				_localctx = new ScientificContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				match(SCIENTIFIC_NUMBER);
				}
				break;
			case VARIABLE:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				match(VARIABLE);
				}
				break;
			case LPAREN:
				_localctx = new BracesContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				match(LPAREN);
				setState(98);
				expr(0);
				setState(99);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!j\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4N\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4Y\n\4\f"+
		"\4\16\4\\\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5h\n\5\3\5\2"+
		"\3\6\6\2\4\6\b\2\4\3\2\21\22\3\2\23\24\2{\2\13\3\2\2\2\4\30\3\2\2\2\6"+
		"M\3\2\2\2\bg\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2\2\f\r\3\2\2\2\r\13\3\2\2\2"+
		"\r\16\3\2\2\2\16\3\3\2\2\2\17\20\5\6\4\2\20\21\7 \2\2\21\31\3\2\2\2\22"+
		"\23\7\36\2\2\23\24\7\27\2\2\24\25\5\6\4\2\25\26\7 \2\2\26\31\3\2\2\2\27"+
		"\31\7 \2\2\30\17\3\2\2\2\30\22\3\2\2\2\30\27\3\2\2\2\31\5\3\2\2\2\32\33"+
		"\b\4\1\2\33\34\t\2\2\2\34N\5\b\5\2\35N\5\b\5\2\36\37\7\r\2\2\37 \7\17"+
		"\2\2 !\5\6\4\2!\"\7\30\2\2\"#\5\6\4\2#$\7\20\2\2$N\3\2\2\2%&\7\f\2\2&"+
		"\'\7\17\2\2\'(\5\6\4\2()\7\20\2\2)N\3\2\2\2*+\7\16\2\2+,\7\17\2\2,-\5"+
		"\6\4\2-.\7\20\2\2.N\3\2\2\2/\60\7\7\2\2\60\61\7\17\2\2\61\62\5\6\4\2\62"+
		"\63\7\20\2\2\63N\3\2\2\2\64\65\7\n\2\2\65\66\7\17\2\2\66\67\5\6\4\2\67"+
		"8\7\20\2\28N\3\2\2\29:\7\6\2\2:;\7\17\2\2;<\5\6\4\2<=\7\20\2\2=N\3\2\2"+
		"\2>?\7\t\2\2?@\7\17\2\2@A\5\6\4\2AB\7\20\2\2BN\3\2\2\2CD\7\b\2\2DE\7\17"+
		"\2\2EF\5\6\4\2FG\7\20\2\2GN\3\2\2\2HI\7\13\2\2IJ\7\17\2\2JK\5\6\4\2KL"+
		"\7\20\2\2LN\3\2\2\2M\32\3\2\2\2M\35\3\2\2\2M\36\3\2\2\2M%\3\2\2\2M*\3"+
		"\2\2\2M/\3\2\2\2M\64\3\2\2\2M9\3\2\2\2M>\3\2\2\2MC\3\2\2\2MH\3\2\2\2N"+
		"Z\3\2\2\2OP\f\20\2\2PQ\7\32\2\2QY\5\6\4\21RS\f\17\2\2ST\t\3\2\2TY\5\6"+
		"\4\20UV\f\16\2\2VW\t\2\2\2WY\5\6\4\17XO\3\2\2\2XR\3\2\2\2XU\3\2\2\2Y\\"+
		"\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\7\3\2\2\2\\Z\3\2\2\2]h\7\3\2\2^h\7\4\2\2"+
		"_h\7\33\2\2`h\7\34\2\2ah\7\5\2\2bh\7\36\2\2cd\7\17\2\2de\5\6\4\2ef\7\20"+
		"\2\2fh\3\2\2\2g]\3\2\2\2g^\3\2\2\2g_\3\2\2\2g`\3\2\2\2ga\3\2\2\2gb\3\2"+
		"\2\2gc\3\2\2\2h\t\3\2\2\2\b\r\30MXZg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}