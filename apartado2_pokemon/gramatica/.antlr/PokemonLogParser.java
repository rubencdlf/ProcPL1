// Generated from c:/Users/aleja/Desktop/Antlr/ProcPL1/apartado2_pokemon/gramatica/PokemonLog.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PokemonLogParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SETUP=1, FOR=2, THE=3, TO=4, HEADS=5, TAILS=6, OPENING=7, COIN=8, FLIP=9, 
		FIRST=10, TOSS=11, CARD=12, HAND=13, ACTIVE=14, SPOT=15, BENCH=16, BE=17, 
		GO=18, CHOOSE=19, DECIDE=20, WIN=21, CONCEDE=22, DRAW=23, ADD=24, PLAY=25, 
		ATTACH=26, EVOLVE=27, USE=28, RETREAT=29, MOVE=30, SHUFFLE=31, DISCARD=32, 
		SWITCH=33, KNOCK_OUT=34, TAKE=35, END=36, ID_CARD=37, DOT=38, DASH=39, 
		COMMA=40, BULLET=41, NUM=42, ID_PLAYER=43, WS=44;
	public static final int
		RULE_start_game = 0, RULE_setup_block = 1, RULE_coin_selection = 2, RULE_coin_result = 3, 
		RULE_first_decision = 4, RULE_cards_list = 5, RULE_drew_result = 6, RULE_initial_play = 7, 
		RULE_player_won = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_game", "setup_block", "coin_selection", "coin_result", "first_decision", 
			"cards_list", "drew_result", "initial_play", "player_won"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Setup'", "'for'", "'the'", "'to'", "'heads'", "'tails'", "'opening'", 
			"'coin'", "'flip'", "'first'", "'toss'", null, "'hand'", "'active'", 
			"'spot'", "'bench'", null, "'go'", "'chose'", "'decided'", null, "'conceded'", 
			null, "'added'", "'played'", "'attached'", "'evolved'", "'used'", "'retreated'", 
			"'moved'", "'shuffled'", "'discarded'", "'switched'", "'Knocked Out'", 
			null, "'ended'", null, "'.'", "'-'", "','", "'\\u2022'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SETUP", "FOR", "THE", "TO", "HEADS", "TAILS", "OPENING", "COIN", 
			"FLIP", "FIRST", "TOSS", "CARD", "HAND", "ACTIVE", "SPOT", "BENCH", "BE", 
			"GO", "CHOOSE", "DECIDE", "WIN", "CONCEDE", "DRAW", "ADD", "PLAY", "ATTACH", 
			"EVOLVE", "USE", "RETREAT", "MOVE", "SHUFFLE", "DISCARD", "SWITCH", "KNOCK_OUT", 
			"TAKE", "END", "ID_CARD", "DOT", "DASH", "COMMA", "BULLET", "NUM", "ID_PLAYER", 
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
	public String getGrammarFileName() { return "PokemonLog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PokemonLogParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Start_gameContext extends ParserRuleContext {
		public Setup_blockContext setup_block() {
			return getRuleContext(Setup_blockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PokemonLogParser.EOF, 0); }
		public Start_gameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_game; }
	}

	public final Start_gameContext start_game() throws RecognitionException {
		Start_gameContext _localctx = new Start_gameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_game);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			setup_block();
			setState(19);
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
	public static class Setup_blockContext extends ParserRuleContext {
		public TerminalNode SETUP() { return getToken(PokemonLogParser.SETUP, 0); }
		public Coin_selectionContext coin_selection() {
			return getRuleContext(Coin_selectionContext.class,0);
		}
		public Coin_resultContext coin_result() {
			return getRuleContext(Coin_resultContext.class,0);
		}
		public First_decisionContext first_decision() {
			return getRuleContext(First_decisionContext.class,0);
		}
		public Player_wonContext player_won() {
			return getRuleContext(Player_wonContext.class,0);
		}
		public List<Drew_resultContext> drew_result() {
			return getRuleContexts(Drew_resultContext.class);
		}
		public Drew_resultContext drew_result(int i) {
			return getRuleContext(Drew_resultContext.class,i);
		}
		public List<Initial_playContext> initial_play() {
			return getRuleContexts(Initial_playContext.class);
		}
		public Initial_playContext initial_play(int i) {
			return getRuleContext(Initial_playContext.class,i);
		}
		public Setup_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup_block; }
	}

	public final Setup_blockContext setup_block() throws RecognitionException {
		Setup_blockContext _localctx = new Setup_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setup_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(SETUP);
			setState(22);
			coin_selection();
			setState(23);
			coin_result();
			setState(24);
			first_decision();
			setState(28);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(25);
					drew_result();
					}
					} 
				}
				setState(30);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(31);
					initial_play();
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(37);
			player_won();
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
	public static class Coin_selectionContext extends ParserRuleContext {
		public TerminalNode ID_PLAYER() { return getToken(PokemonLogParser.ID_PLAYER, 0); }
		public TerminalNode CHOOSE() { return getToken(PokemonLogParser.CHOOSE, 0); }
		public TerminalNode FOR() { return getToken(PokemonLogParser.FOR, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode OPENING() { return getToken(PokemonLogParser.OPENING, 0); }
		public TerminalNode COIN() { return getToken(PokemonLogParser.COIN, 0); }
		public TerminalNode FLIP() { return getToken(PokemonLogParser.FLIP, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public TerminalNode HEADS() { return getToken(PokemonLogParser.HEADS, 0); }
		public TerminalNode TAILS() { return getToken(PokemonLogParser.TAILS, 0); }
		public Coin_selectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coin_selection; }
	}

	public final Coin_selectionContext coin_selection() throws RecognitionException {
		Coin_selectionContext _localctx = new Coin_selectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_coin_selection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ID_PLAYER);
			setState(40);
			match(CHOOSE);
			setState(41);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(42);
			match(FOR);
			setState(43);
			match(THE);
			setState(44);
			match(OPENING);
			setState(45);
			match(COIN);
			setState(46);
			match(FLIP);
			setState(47);
			match(DOT);
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
	public static class Coin_resultContext extends ParserRuleContext {
		public TerminalNode ID_PLAYER() { return getToken(PokemonLogParser.ID_PLAYER, 0); }
		public TerminalNode WIN() { return getToken(PokemonLogParser.WIN, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode COIN() { return getToken(PokemonLogParser.COIN, 0); }
		public TerminalNode TOSS() { return getToken(PokemonLogParser.TOSS, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Coin_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coin_result; }
	}

	public final Coin_resultContext coin_result() throws RecognitionException {
		Coin_resultContext _localctx = new Coin_resultContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_coin_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ID_PLAYER);
			setState(50);
			match(WIN);
			setState(51);
			match(THE);
			setState(52);
			match(COIN);
			setState(53);
			match(TOSS);
			setState(54);
			match(DOT);
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
	public static class First_decisionContext extends ParserRuleContext {
		public TerminalNode ID_PLAYER() { return getToken(PokemonLogParser.ID_PLAYER, 0); }
		public TerminalNode DECIDE() { return getToken(PokemonLogParser.DECIDE, 0); }
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public TerminalNode GO() { return getToken(PokemonLogParser.GO, 0); }
		public TerminalNode FIRST() { return getToken(PokemonLogParser.FIRST, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public First_decisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_decision; }
	}

	public final First_decisionContext first_decision() throws RecognitionException {
		First_decisionContext _localctx = new First_decisionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_first_decision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ID_PLAYER);
			setState(57);
			match(DECIDE);
			setState(58);
			match(TO);
			setState(59);
			match(GO);
			setState(60);
			match(FIRST);
			setState(61);
			match(DOT);
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
	public static class Cards_listContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public List<TerminalNode> ID_CARD() { return getTokens(PokemonLogParser.ID_CARD); }
		public TerminalNode ID_CARD(int i) {
			return getToken(PokemonLogParser.ID_CARD, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PokemonLogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PokemonLogParser.COMMA, i);
		}
		public Cards_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cards_list; }
	}

	public final Cards_listContext cards_list() throws RecognitionException {
		Cards_listContext _localctx = new Cards_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cards_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(DASH);
			setState(64);
			match(ID_CARD);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(65);
				match(COMMA);
				setState(66);
				match(ID_CARD);
				}
				}
				setState(71);
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
	public static class Drew_resultContext extends ParserRuleContext {
		public TerminalNode ID_PLAYER() { return getToken(PokemonLogParser.ID_PLAYER, 0); }
		public List<TerminalNode> DRAW() { return getTokens(PokemonLogParser.DRAW); }
		public TerminalNode DRAW(int i) {
			return getToken(PokemonLogParser.DRAW, i);
		}
		public List<TerminalNode> NUM() { return getTokens(PokemonLogParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(PokemonLogParser.NUM, i);
		}
		public List<TerminalNode> CARD() { return getTokens(PokemonLogParser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(PokemonLogParser.CARD, i);
		}
		public TerminalNode FOR() { return getToken(PokemonLogParser.FOR, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode OPENING() { return getToken(PokemonLogParser.OPENING, 0); }
		public TerminalNode HAND() { return getToken(PokemonLogParser.HAND, 0); }
		public List<TerminalNode> DOT() { return getTokens(PokemonLogParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PokemonLogParser.DOT, i);
		}
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public Cards_listContext cards_list() {
			return getRuleContext(Cards_listContext.class,0);
		}
		public Drew_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drew_result; }
	}

	public final Drew_resultContext drew_result() throws RecognitionException {
		Drew_resultContext _localctx = new Drew_resultContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_drew_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(ID_PLAYER);
			setState(73);
			match(DRAW);
			setState(74);
			match(NUM);
			setState(75);
			match(CARD);
			setState(76);
			match(FOR);
			setState(77);
			match(THE);
			setState(78);
			match(OPENING);
			setState(79);
			match(HAND);
			setState(80);
			match(DOT);
			setState(81);
			match(DASH);
			setState(82);
			match(NUM);
			setState(83);
			match(DRAW);
			setState(84);
			match(CARD);
			setState(85);
			match(DOT);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH) {
				{
				setState(86);
				cards_list();
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
	public static class Initial_playContext extends ParserRuleContext {
		public TerminalNode ID_PLAYER() { return getToken(PokemonLogParser.ID_PLAYER, 0); }
		public TerminalNode PLAY() { return getToken(PokemonLogParser.PLAY, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode ACTIVE() { return getToken(PokemonLogParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(PokemonLogParser.SPOT, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public TerminalNode BENCH() { return getToken(PokemonLogParser.BENCH, 0); }
		public Initial_playContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_play; }
	}

	public final Initial_playContext initial_play() throws RecognitionException {
		Initial_playContext _localctx = new Initial_playContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_initial_play);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(ID_PLAYER);
				setState(90);
				match(PLAY);
				setState(91);
				match(ID_CARD);
				setState(92);
				match(TO);
				setState(93);
				match(THE);
				setState(94);
				match(ACTIVE);
				setState(95);
				match(SPOT);
				setState(96);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(ID_PLAYER);
				setState(98);
				match(PLAY);
				setState(99);
				match(ID_CARD);
				setState(100);
				match(TO);
				setState(101);
				match(THE);
				setState(102);
				match(BENCH);
				setState(103);
				match(DOT);
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
	public static class Player_wonContext extends ParserRuleContext {
		public TerminalNode ID_PLAYER() { return getToken(PokemonLogParser.ID_PLAYER, 0); }
		public TerminalNode WIN() { return getToken(PokemonLogParser.WIN, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Player_wonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_won; }
	}

	public final Player_wonContext player_won() throws RecognitionException {
		Player_wonContext _localctx = new Player_wonContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_player_won);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID_PLAYER);
			setState(107);
			match(WIN);
			setState(108);
			match(DOT);
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
		"\u0004\u0001,o\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u001b\b\u0001\n\u0001\f\u0001\u001e"+
		"\t\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005D\b\u0005\n\u0005\f\u0005G\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006X\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007i\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0000\u0000\t"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0001\u0001\u0000\u0005"+
		"\u0006j\u0000\u0012\u0001\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000"+
		"\u0000\u0004\'\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000"+
		"\b8\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000\u0000\fH\u0001\u0000"+
		"\u0000\u0000\u000eh\u0001\u0000\u0000\u0000\u0010j\u0001\u0000\u0000\u0000"+
		"\u0012\u0013\u0003\u0002\u0001\u0000\u0013\u0014\u0005\u0000\u0000\u0001"+
		"\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0001\u0000\u0000"+
		"\u0016\u0017\u0003\u0004\u0002\u0000\u0017\u0018\u0003\u0006\u0003\u0000"+
		"\u0018\u001c\u0003\b\u0004\u0000\u0019\u001b\u0003\f\u0006\u0000\u001a"+
		"\u0019\u0001\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c"+
		"\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d"+
		"\"\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f!"+
		"\u0003\u000e\u0007\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000"+
		"\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0003\u0010\b\u0000&\u0003"+
		"\u0001\u0000\u0000\u0000\'(\u0005+\u0000\u0000()\u0005\u0013\u0000\u0000"+
		")*\u0007\u0000\u0000\u0000*+\u0005\u0002\u0000\u0000+,\u0005\u0003\u0000"+
		"\u0000,-\u0005\u0007\u0000\u0000-.\u0005\b\u0000\u0000./\u0005\t\u0000"+
		"\u0000/0\u0005&\u0000\u00000\u0005\u0001\u0000\u0000\u000012\u0005+\u0000"+
		"\u000023\u0005\u0015\u0000\u000034\u0005\u0003\u0000\u000045\u0005\b\u0000"+
		"\u000056\u0005\u000b\u0000\u000067\u0005&\u0000\u00007\u0007\u0001\u0000"+
		"\u0000\u000089\u0005+\u0000\u00009:\u0005\u0014\u0000\u0000:;\u0005\u0004"+
		"\u0000\u0000;<\u0005\u0012\u0000\u0000<=\u0005\n\u0000\u0000=>\u0005&"+
		"\u0000\u0000>\t\u0001\u0000\u0000\u0000?@\u0005\'\u0000\u0000@E\u0005"+
		"%\u0000\u0000AB\u0005(\u0000\u0000BD\u0005%\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000F\u000b\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000HI\u0005+\u0000\u0000IJ\u0005\u0017\u0000\u0000JK\u0005*\u0000\u0000"+
		"KL\u0005\f\u0000\u0000LM\u0005\u0002\u0000\u0000MN\u0005\u0003\u0000\u0000"+
		"NO\u0005\u0007\u0000\u0000OP\u0005\r\u0000\u0000PQ\u0005&\u0000\u0000"+
		"QR\u0005\'\u0000\u0000RS\u0005*\u0000\u0000ST\u0005\u0017\u0000\u0000"+
		"TU\u0005\f\u0000\u0000UW\u0005&\u0000\u0000VX\u0003\n\u0005\u0000WV\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\r\u0001\u0000\u0000\u0000"+
		"YZ\u0005+\u0000\u0000Z[\u0005\u0019\u0000\u0000[\\\u0005%\u0000\u0000"+
		"\\]\u0005\u0004\u0000\u0000]^\u0005\u0003\u0000\u0000^_\u0005\u000e\u0000"+
		"\u0000_`\u0005\u000f\u0000\u0000`i\u0005&\u0000\u0000ab\u0005+\u0000\u0000"+
		"bc\u0005\u0019\u0000\u0000cd\u0005%\u0000\u0000de\u0005\u0004\u0000\u0000"+
		"ef\u0005\u0003\u0000\u0000fg\u0005\u0010\u0000\u0000gi\u0005&\u0000\u0000"+
		"hY\u0001\u0000\u0000\u0000ha\u0001\u0000\u0000\u0000i\u000f\u0001\u0000"+
		"\u0000\u0000jk\u0005+\u0000\u0000kl\u0005\u0015\u0000\u0000lm\u0005&\u0000"+
		"\u0000m\u0011\u0001\u0000\u0000\u0000\u0005\u001c\"EWh";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}