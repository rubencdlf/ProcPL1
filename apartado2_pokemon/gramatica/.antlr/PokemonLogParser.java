// Generated from /Users/rubens/Documents/ProcPL1/apartado2_pokemon/gramatica/PokemonLog.g4 by ANTLR 4.13.1
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
		SETUP=1, ACTIVE_SPOT=2, BENCH=3, ACTIVE=4, POKEMON=5, TURN=6, FOR=7, THE=8, 
		TO=9, IN=10, A=11, ON=12, THEIR=13, DECK=14, INTO=15, NOW=16, WITH=17, 
		BECOME=18, HEADS=19, TAILS=20, OPENING=21, COIN=22, FLIP=23, FIRST=24, 
		TOSS=25, CARD=26, HAND=27, DAMAGE=28, PRIZE=29, ALL=30, BREAKDOWN=31, 
		BASE=32, TOTAL=33, ITEM=34, FROM=35, PRIME_CATCHER=36, BOSS_ORDERS=37, 
		BE=38, GO=39, CHOOSE=40, DECIDE=41, WIN=42, CONCEDE=43, DRAW=44, ADD=45, 
		PLAY=46, ATTACH=47, EVOLVE=48, USE=49, RETREAT=50, MOVE=51, SHUFFLE=52, 
		DISCARD=53, SWITCH_VERB=54, KNOCK_OUT=55, TAKE=56, END=57, ID_CARD=58, 
		DOT=59, DASH=60, COMMA=61, BULLET=62, EXCLAMATION=63, COLON=64, PAREN_IZQ=65, 
		PAREN_DER=66, NUM=67, ID_TOKEN=68, WS=69;
	public static final int
		RULE_start_game = 0, RULE_setup_block = 1, RULE_coin_selection = 2, RULE_coin_result = 3, 
		RULE_first_decision = 4, RULE_drew_result = 5, RULE_cards_list = 6, RULE_initial_play = 7, 
		RULE_players_turns = 8, RULE_player_starts_turn = 9, RULE_player_ends_turn = 10, 
		RULE_player_plays = 11, RULE_player_draw_card = 12, RULE_player_sub_draw = 13, 
		RULE_player_shuffled = 14, RULE_player_played_card = 15, RULE_player_plays_active_spot = 16, 
		RULE_player_plays_bench = 17, RULE_player_attaches_card = 18, RULE_player_evolve = 19, 
		RULE_player_retreated = 20, RULE_player_switch = 21, RULE_player_used_ability = 22, 
		RULE_player_attack = 23, RULE_damage_breakdown = 24, RULE_consecuencia_combate = 25, 
		RULE_player_won = 26, RULE_id_player = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_game", "setup_block", "coin_selection", "coin_result", "first_decision", 
			"drew_result", "cards_list", "initial_play", "players_turns", "player_starts_turn", 
			"player_ends_turn", "player_plays", "player_draw_card", "player_sub_draw", 
			"player_shuffled", "player_played_card", "player_plays_active_spot", 
			"player_plays_bench", "player_attaches_card", "player_evolve", "player_retreated", 
			"player_switch", "player_used_ability", "player_attack", "damage_breakdown", 
			"consecuencia_combate", "player_won", "id_player"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Setup'", "'Active Spot'", "'Bench'", "'Active'", "'Pok\\u00E9mon'", 
			null, "'for'", "'the'", "'to'", "'in'", "'a'", "'on'", "'their'", "'deck'", 
			"'into'", "'now'", "'with'", "'become'", "'heads'", "'tails'", "'opening'", 
			"'coin'", "'flip'", "'first'", "'toss'", null, "'hand'", "'damage'", 
			"'Prize'", "'All'", "'breakdown'", "'Base'", "'Total'", "'Item'", "'from'", 
			"'Prime Catcher'", "'Boss's Orders'", null, "'go'", "'chose'", "'decided'", 
			null, "'conceded'", null, "'added'", "'played'", "'attached'", "'evolved'", 
			"'used'", "'retreated'", "'moved'", "'shuffled'", "'discarded'", "'switched'", 
			"'Knocked Out'", null, "'ended'", null, "'.'", "'-'", "','", "'\\u2022'", 
			"'!'", "':'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SETUP", "ACTIVE_SPOT", "BENCH", "ACTIVE", "POKEMON", "TURN", "FOR", 
			"THE", "TO", "IN", "A", "ON", "THEIR", "DECK", "INTO", "NOW", "WITH", 
			"BECOME", "HEADS", "TAILS", "OPENING", "COIN", "FLIP", "FIRST", "TOSS", 
			"CARD", "HAND", "DAMAGE", "PRIZE", "ALL", "BREAKDOWN", "BASE", "TOTAL", 
			"ITEM", "FROM", "PRIME_CATCHER", "BOSS_ORDERS", "BE", "GO", "CHOOSE", 
			"DECIDE", "WIN", "CONCEDE", "DRAW", "ADD", "PLAY", "ATTACH", "EVOLVE", 
			"USE", "RETREAT", "MOVE", "SHUFFLE", "DISCARD", "SWITCH_VERB", "KNOCK_OUT", 
			"TAKE", "END", "ID_CARD", "DOT", "DASH", "COMMA", "BULLET", "EXCLAMATION", 
			"COLON", "PAREN_IZQ", "PAREN_DER", "NUM", "ID_TOKEN", "WS"
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
		public Player_wonContext player_won() {
			return getRuleContext(Player_wonContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PokemonLogParser.EOF, 0); }
		public List<Players_turnsContext> players_turns() {
			return getRuleContexts(Players_turnsContext.class);
		}
		public Players_turnsContext players_turns(int i) {
			return getRuleContext(Players_turnsContext.class,i);
		}
		public Start_gameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_game; }
	}

	public final Start_gameContext start_game() throws RecognitionException {
		Start_gameContext _localctx = new Start_gameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_game);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			setup_block();
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				players_turns();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID_TOKEN );
			setState(62);
			player_won();
			setState(63);
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
			setState(65);
			match(SETUP);
			setState(66);
			coin_selection();
			setState(67);
			coin_result();
			setState(68);
			first_decision();
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(69);
					drew_result();
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(75);
					initial_play();
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class Coin_selectionContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
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
			setState(81);
			id_player();
			setState(82);
			match(CHOOSE);
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(84);
			match(FOR);
			setState(85);
			match(THE);
			setState(86);
			match(OPENING);
			setState(87);
			match(COIN);
			setState(88);
			match(FLIP);
			setState(89);
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
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
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
			setState(91);
			id_player();
			setState(92);
			match(WIN);
			setState(93);
			match(THE);
			setState(94);
			match(COIN);
			setState(95);
			match(TOSS);
			setState(96);
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
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
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
			setState(98);
			id_player();
			setState(99);
			match(DECIDE);
			setState(100);
			match(TO);
			setState(101);
			match(GO);
			setState(102);
			match(FIRST);
			setState(103);
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
	public static class Drew_resultContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_drew_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			id_player();
			setState(106);
			match(DRAW);
			setState(107);
			match(NUM);
			setState(108);
			match(CARD);
			setState(109);
			match(FOR);
			setState(110);
			match(THE);
			setState(111);
			match(OPENING);
			setState(112);
			match(HAND);
			setState(113);
			match(DOT);
			setState(114);
			match(DASH);
			setState(115);
			match(NUM);
			setState(116);
			match(DRAW);
			setState(117);
			match(CARD);
			setState(118);
			match(DOT);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(119);
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
	public static class Cards_listContext extends ParserRuleContext {
		public TerminalNode BULLET() { return getToken(PokemonLogParser.BULLET, 0); }
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
		enterRule(_localctx, 12, RULE_cards_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(BULLET);
			setState(123);
			match(ID_CARD);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(124);
				match(COMMA);
				setState(125);
				match(ID_CARD);
				}
				}
				setState(130);
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
	public static class Initial_playContext extends ParserRuleContext {
		public Player_plays_active_spotContext player_plays_active_spot() {
			return getRuleContext(Player_plays_active_spotContext.class,0);
		}
		public Player_plays_benchContext player_plays_bench() {
			return getRuleContext(Player_plays_benchContext.class,0);
		}
		public Initial_playContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_play; }
	}

	public final Initial_playContext initial_play() throws RecognitionException {
		Initial_playContext _localctx = new Initial_playContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_initial_play);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				player_plays_active_spot();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				player_plays_bench();
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
	public static class Players_turnsContext extends ParserRuleContext {
		public Player_starts_turnContext player_starts_turn() {
			return getRuleContext(Player_starts_turnContext.class,0);
		}
		public Player_ends_turnContext player_ends_turn() {
			return getRuleContext(Player_ends_turnContext.class,0);
		}
		public List<Player_playsContext> player_plays() {
			return getRuleContexts(Player_playsContext.class);
		}
		public Player_playsContext player_plays(int i) {
			return getRuleContext(Player_playsContext.class,i);
		}
		public Players_turnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_players_turns; }
	}

	public final Players_turnsContext players_turns() throws RecognitionException {
		Players_turnsContext _localctx = new Players_turnsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_players_turns);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			player_starts_turn();
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					player_plays();
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(142);
			player_ends_turn();
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
	public static class Player_starts_turnContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode TURN() { return getToken(PokemonLogParser.TURN, 0); }
		public Player_starts_turnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_starts_turn; }
	}

	public final Player_starts_turnContext player_starts_turn() throws RecognitionException {
		Player_starts_turnContext _localctx = new Player_starts_turnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_player_starts_turn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			id_player();
			setState(145);
			match(TURN);
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
	public static class Player_ends_turnContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode END() { return getToken(PokemonLogParser.END, 0); }
		public TerminalNode THEIR() { return getToken(PokemonLogParser.THEIR, 0); }
		public TerminalNode TURN() { return getToken(PokemonLogParser.TURN, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Player_ends_turnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_ends_turn; }
	}

	public final Player_ends_turnContext player_ends_turn() throws RecognitionException {
		Player_ends_turnContext _localctx = new Player_ends_turnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_player_ends_turn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			id_player();
			setState(148);
			match(END);
			setState(149);
			match(THEIR);
			setState(150);
			match(TURN);
			setState(151);
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
	public static class Player_playsContext extends ParserRuleContext {
		public Player_draw_cardContext player_draw_card() {
			return getRuleContext(Player_draw_cardContext.class,0);
		}
		public Player_played_cardContext player_played_card() {
			return getRuleContext(Player_played_cardContext.class,0);
		}
		public Player_plays_active_spotContext player_plays_active_spot() {
			return getRuleContext(Player_plays_active_spotContext.class,0);
		}
		public Player_plays_benchContext player_plays_bench() {
			return getRuleContext(Player_plays_benchContext.class,0);
		}
		public Player_attaches_cardContext player_attaches_card() {
			return getRuleContext(Player_attaches_cardContext.class,0);
		}
		public Player_shuffledContext player_shuffled() {
			return getRuleContext(Player_shuffledContext.class,0);
		}
		public Player_sub_drawContext player_sub_draw() {
			return getRuleContext(Player_sub_drawContext.class,0);
		}
		public Player_evolveContext player_evolve() {
			return getRuleContext(Player_evolveContext.class,0);
		}
		public Player_retreatedContext player_retreated() {
			return getRuleContext(Player_retreatedContext.class,0);
		}
		public Player_switchContext player_switch() {
			return getRuleContext(Player_switchContext.class,0);
		}
		public Player_used_abilityContext player_used_ability() {
			return getRuleContext(Player_used_abilityContext.class,0);
		}
		public Player_attackContext player_attack() {
			return getRuleContext(Player_attackContext.class,0);
		}
		public Consecuencia_combateContext consecuencia_combate() {
			return getRuleContext(Consecuencia_combateContext.class,0);
		}
		public Player_playsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_plays; }
	}

	public final Player_playsContext player_plays() throws RecognitionException {
		Player_playsContext _localctx = new Player_playsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_player_plays);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				player_draw_card();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				player_played_card();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				player_plays_active_spot();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				player_plays_bench();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				player_attaches_card();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				player_shuffled();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				player_sub_draw();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				player_evolve();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(161);
				player_retreated();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(162);
				player_switch();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(163);
				player_used_ability();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(164);
				player_attack();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(165);
				consecuencia_combate();
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
	public static class Player_draw_cardContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode DRAW() { return getToken(PokemonLogParser.DRAW, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public TerminalNode A() { return getToken(PokemonLogParser.A, 0); }
		public TerminalNode CARD() { return getToken(PokemonLogParser.CARD, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public Cards_listContext cards_list() {
			return getRuleContext(Cards_listContext.class,0);
		}
		public Player_draw_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_draw_card; }
	}

	public final Player_draw_cardContext player_draw_card() throws RecognitionException {
		Player_draw_cardContext _localctx = new Player_draw_cardContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_player_draw_card);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			id_player();
			setState(169);
			match(DRAW);
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A:
				{
				setState(170);
				match(A);
				setState(171);
				match(CARD);
				}
				break;
			case ID_CARD:
				{
				setState(172);
				match(ID_CARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(175);
			match(DOT);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(176);
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
	public static class Player_sub_drawContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode DRAW() { return getToken(PokemonLogParser.DRAW, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public TerminalNode CARD() { return getToken(PokemonLogParser.CARD, 0); }
		public Cards_listContext cards_list() {
			return getRuleContext(Cards_listContext.class,0);
		}
		public Player_sub_drawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_sub_draw; }
	}

	public final Player_sub_drawContext player_sub_draw() throws RecognitionException {
		Player_sub_drawContext _localctx = new Player_sub_drawContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_player_sub_draw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(DASH);
			setState(180);
			id_player();
			setState(181);
			match(DRAW);
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_CARD:
				{
				setState(182);
				match(ID_CARD);
				}
				break;
			case NUM:
				{
				setState(183);
				match(NUM);
				setState(184);
				match(CARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(187);
			match(DOT);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(188);
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
	public static class Player_shuffledContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode SHUFFLE() { return getToken(PokemonLogParser.SHUFFLE, 0); }
		public TerminalNode THEIR() { return getToken(PokemonLogParser.THEIR, 0); }
		public TerminalNode DECK() { return getToken(PokemonLogParser.DECK, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public TerminalNode CARD() { return getToken(PokemonLogParser.CARD, 0); }
		public TerminalNode INTO() { return getToken(PokemonLogParser.INTO, 0); }
		public Cards_listContext cards_list() {
			return getRuleContext(Cards_listContext.class,0);
		}
		public Player_shuffledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_shuffled; }
	}

	public final Player_shuffledContext player_shuffled() throws RecognitionException {
		Player_shuffledContext _localctx = new Player_shuffledContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_player_shuffled);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(DASH);
			setState(192);
			id_player();
			setState(193);
			match(SHUFFLE);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(194);
				match(NUM);
				setState(195);
				match(CARD);
				setState(196);
				match(INTO);
				}
			}

			setState(199);
			match(THEIR);
			setState(200);
			match(DECK);
			setState(201);
			match(DOT);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(202);
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
	public static class Player_played_cardContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode PLAY() { return getToken(PokemonLogParser.PLAY, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Player_played_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_played_card; }
	}

	public final Player_played_cardContext player_played_card() throws RecognitionException {
		Player_played_cardContext _localctx = new Player_played_cardContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_player_played_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			id_player();
			setState(206);
			match(PLAY);
			setState(207);
			match(ID_CARD);
			setState(208);
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
	public static class Player_plays_active_spotContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode PLAY() { return getToken(PokemonLogParser.PLAY, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode ACTIVE_SPOT() { return getToken(PokemonLogParser.ACTIVE_SPOT, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Player_plays_active_spotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_plays_active_spot; }
	}

	public final Player_plays_active_spotContext player_plays_active_spot() throws RecognitionException {
		Player_plays_active_spotContext _localctx = new Player_plays_active_spotContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_player_plays_active_spot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			id_player();
			setState(211);
			match(PLAY);
			setState(212);
			match(ID_CARD);
			setState(213);
			match(TO);
			setState(214);
			match(THE);
			setState(215);
			match(ACTIVE_SPOT);
			setState(216);
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
	public static class Player_plays_benchContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode PLAY() { return getToken(PokemonLogParser.PLAY, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode BENCH() { return getToken(PokemonLogParser.BENCH, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Player_plays_benchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_plays_bench; }
	}

	public final Player_plays_benchContext player_plays_bench() throws RecognitionException {
		Player_plays_benchContext _localctx = new Player_plays_benchContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_player_plays_bench);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			id_player();
			setState(219);
			match(PLAY);
			setState(220);
			match(ID_CARD);
			setState(221);
			match(TO);
			setState(222);
			match(THE);
			setState(223);
			match(BENCH);
			setState(224);
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
	public static class Player_attaches_cardContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(PokemonLogParser.ATTACH, 0); }
		public List<TerminalNode> ID_CARD() { return getTokens(PokemonLogParser.ID_CARD); }
		public TerminalNode ID_CARD(int i) {
			return getToken(PokemonLogParser.ID_CARD, i);
		}
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public TerminalNode ON() { return getToken(PokemonLogParser.ON, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode BENCH() { return getToken(PokemonLogParser.BENCH, 0); }
		public TerminalNode IN() { return getToken(PokemonLogParser.IN, 0); }
		public TerminalNode ACTIVE_SPOT() { return getToken(PokemonLogParser.ACTIVE_SPOT, 0); }
		public Player_attaches_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_attaches_card; }
	}

	public final Player_attaches_cardContext player_attaches_card() throws RecognitionException {
		Player_attaches_cardContext _localctx = new Player_attaches_cardContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_player_attaches_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			id_player();
			setState(227);
			match(ATTACH);
			setState(228);
			match(ID_CARD);
			setState(229);
			match(TO);
			setState(230);
			match(ID_CARD);
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(231);
				match(ON);
				setState(232);
				match(THE);
				setState(233);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(234);
				match(IN);
				setState(235);
				match(THE);
				setState(236);
				match(ACTIVE_SPOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(239);
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
	public static class Player_evolveContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode EVOLVE() { return getToken(PokemonLogParser.EVOLVE, 0); }
		public List<TerminalNode> ID_CARD() { return getTokens(PokemonLogParser.ID_CARD); }
		public TerminalNode ID_CARD(int i) {
			return getToken(PokemonLogParser.ID_CARD, i);
		}
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public TerminalNode IN() { return getToken(PokemonLogParser.IN, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode ACTIVE_SPOT() { return getToken(PokemonLogParser.ACTIVE_SPOT, 0); }
		public TerminalNode ON() { return getToken(PokemonLogParser.ON, 0); }
		public TerminalNode BENCH() { return getToken(PokemonLogParser.BENCH, 0); }
		public Player_evolveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_evolve; }
	}

	public final Player_evolveContext player_evolve() throws RecognitionException {
		Player_evolveContext _localctx = new Player_evolveContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_player_evolve);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			id_player();
			setState(242);
			match(EVOLVE);
			setState(243);
			match(ID_CARD);
			setState(244);
			match(TO);
			setState(245);
			match(ID_CARD);
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				{
				setState(246);
				match(IN);
				setState(247);
				match(THE);
				setState(248);
				match(ACTIVE_SPOT);
				}
				break;
			case ON:
				{
				setState(249);
				match(ON);
				setState(250);
				match(THE);
				setState(251);
				match(BENCH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(254);
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
	public static class Player_retreatedContext extends ParserRuleContext {
		public List<Id_playerContext> id_player() {
			return getRuleContexts(Id_playerContext.class);
		}
		public Id_playerContext id_player(int i) {
			return getRuleContext(Id_playerContext.class,i);
		}
		public TerminalNode RETREAT() { return getToken(PokemonLogParser.RETREAT, 0); }
		public List<TerminalNode> ID_CARD() { return getTokens(PokemonLogParser.ID_CARD); }
		public TerminalNode ID_CARD(int i) {
			return getToken(PokemonLogParser.ID_CARD, i);
		}
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode BENCH() { return getToken(PokemonLogParser.BENCH, 0); }
		public List<TerminalNode> DOT() { return getTokens(PokemonLogParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PokemonLogParser.DOT, i);
		}
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public TerminalNode CARD() { return getToken(PokemonLogParser.CARD, 0); }
		public TerminalNode BE() { return getToken(PokemonLogParser.BE, 0); }
		public TerminalNode DISCARD() { return getToken(PokemonLogParser.DISCARD, 0); }
		public TerminalNode FROM() { return getToken(PokemonLogParser.FROM, 0); }
		public Cards_listContext cards_list() {
			return getRuleContext(Cards_listContext.class,0);
		}
		public Player_retreatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_retreated; }
	}

	public final Player_retreatedContext player_retreated() throws RecognitionException {
		Player_retreatedContext _localctx = new Player_retreatedContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_player_retreated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			id_player();
			setState(257);
			match(RETREAT);
			setState(258);
			match(ID_CARD);
			setState(259);
			match(TO);
			setState(260);
			match(THE);
			setState(261);
			match(BENCH);
			setState(262);
			match(DOT);
			setState(263);
			match(DASH);
			setState(264);
			match(NUM);
			setState(265);
			match(CARD);
			setState(266);
			match(BE);
			setState(267);
			match(DISCARD);
			setState(268);
			match(FROM);
			setState(269);
			id_player();
			setState(270);
			match(ID_CARD);
			setState(271);
			match(DOT);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(272);
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
	public static class Player_switchContext extends ParserRuleContext {
		public List<Id_playerContext> id_player() {
			return getRuleContexts(Id_playerContext.class);
		}
		public Id_playerContext id_player(int i) {
			return getRuleContext(Id_playerContext.class,i);
		}
		public TerminalNode PLAY() { return getToken(PokemonLogParser.PLAY, 0); }
		public List<TerminalNode> ID_CARD() { return getTokens(PokemonLogParser.ID_CARD); }
		public TerminalNode ID_CARD(int i) {
			return getToken(PokemonLogParser.ID_CARD, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PokemonLogParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PokemonLogParser.DOT, i);
		}
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public List<TerminalNode> BE() { return getTokens(PokemonLogParser.BE); }
		public TerminalNode BE(int i) {
			return getToken(PokemonLogParser.BE, i);
		}
		public TerminalNode SWITCH_VERB() { return getToken(PokemonLogParser.SWITCH_VERB, 0); }
		public TerminalNode WITH() { return getToken(PokemonLogParser.WITH, 0); }
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public TerminalNode BECOME() { return getToken(PokemonLogParser.BECOME, 0); }
		public List<TerminalNode> THE() { return getTokens(PokemonLogParser.THE); }
		public TerminalNode THE(int i) {
			return getToken(PokemonLogParser.THE, i);
		}
		public TerminalNode ACTIVE() { return getToken(PokemonLogParser.ACTIVE, 0); }
		public TerminalNode POKEMON() { return getToken(PokemonLogParser.POKEMON, 0); }
		public TerminalNode NOW() { return getToken(PokemonLogParser.NOW, 0); }
		public TerminalNode IN() { return getToken(PokemonLogParser.IN, 0); }
		public TerminalNode ACTIVE_SPOT() { return getToken(PokemonLogParser.ACTIVE_SPOT, 0); }
		public Player_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_switch; }
	}

	public final Player_switchContext player_switch() throws RecognitionException {
		Player_switchContext _localctx = new Player_switchContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_player_switch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			id_player();
			setState(276);
			match(PLAY);
			setState(277);
			match(ID_CARD);
			setState(278);
			match(DOT);
			setState(279);
			match(DASH);
			setState(280);
			id_player();
			setState(281);
			match(ID_CARD);
			setState(282);
			match(BE);
			setState(283);
			match(SWITCH_VERB);
			setState(284);
			match(WITH);
			setState(285);
			id_player();
			setState(286);
			match(ID_CARD);
			setState(287);
			match(TO);
			setState(288);
			match(BECOME);
			setState(289);
			match(THE);
			setState(290);
			match(ACTIVE);
			setState(291);
			match(POKEMON);
			setState(292);
			match(DOT);
			setState(293);
			id_player();
			setState(294);
			match(ID_CARD);
			setState(295);
			match(BE);
			setState(296);
			match(NOW);
			setState(297);
			match(IN);
			setState(298);
			match(THE);
			setState(299);
			match(ACTIVE_SPOT);
			setState(300);
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
	public static class Player_used_abilityContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public List<TerminalNode> ID_CARD() { return getTokens(PokemonLogParser.ID_CARD); }
		public TerminalNode ID_CARD(int i) {
			return getToken(PokemonLogParser.ID_CARD, i);
		}
		public TerminalNode USE() { return getToken(PokemonLogParser.USE, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Cards_listContext cards_list() {
			return getRuleContext(Cards_listContext.class,0);
		}
		public Player_used_abilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_used_ability; }
	}

	public final Player_used_abilityContext player_used_ability() throws RecognitionException {
		Player_used_abilityContext _localctx = new Player_used_abilityContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_player_used_ability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			id_player();
			setState(303);
			match(ID_CARD);
			setState(304);
			match(USE);
			setState(305);
			match(ID_CARD);
			setState(306);
			match(DOT);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(307);
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
	public static class Player_attackContext extends ParserRuleContext {
		public List<Id_playerContext> id_player() {
			return getRuleContexts(Id_playerContext.class);
		}
		public Id_playerContext id_player(int i) {
			return getRuleContext(Id_playerContext.class,i);
		}
		public List<TerminalNode> ID_CARD() { return getTokens(PokemonLogParser.ID_CARD); }
		public TerminalNode ID_CARD(int i) {
			return getToken(PokemonLogParser.ID_CARD, i);
		}
		public TerminalNode USE() { return getToken(PokemonLogParser.USE, 0); }
		public TerminalNode ON() { return getToken(PokemonLogParser.ON, 0); }
		public TerminalNode FOR() { return getToken(PokemonLogParser.FOR, 0); }
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public TerminalNode DAMAGE() { return getToken(PokemonLogParser.DAMAGE, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Damage_breakdownContext damage_breakdown() {
			return getRuleContext(Damage_breakdownContext.class,0);
		}
		public Player_attackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_attack; }
	}

	public final Player_attackContext player_attack() throws RecognitionException {
		Player_attackContext _localctx = new Player_attackContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_player_attack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			id_player();
			setState(311);
			match(ID_CARD);
			setState(312);
			match(USE);
			setState(313);
			match(ID_CARD);
			setState(314);
			match(ON);
			setState(315);
			id_player();
			setState(316);
			match(ID_CARD);
			setState(317);
			match(FOR);
			setState(318);
			match(NUM);
			setState(319);
			match(DAMAGE);
			setState(320);
			match(DOT);
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(321);
				damage_breakdown();
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
	public static class Damage_breakdownContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public List<TerminalNode> DAMAGE() { return getTokens(PokemonLogParser.DAMAGE); }
		public TerminalNode DAMAGE(int i) {
			return getToken(PokemonLogParser.DAMAGE, i);
		}
		public TerminalNode BREAKDOWN() { return getToken(PokemonLogParser.BREAKDOWN, 0); }
		public List<TerminalNode> COLON() { return getTokens(PokemonLogParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PokemonLogParser.COLON, i);
		}
		public List<TerminalNode> BULLET() { return getTokens(PokemonLogParser.BULLET); }
		public TerminalNode BULLET(int i) {
			return getToken(PokemonLogParser.BULLET, i);
		}
		public TerminalNode BASE() { return getToken(PokemonLogParser.BASE, 0); }
		public List<TerminalNode> NUM() { return getTokens(PokemonLogParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(PokemonLogParser.NUM, i);
		}
		public TerminalNode PAREN_IZQ() { return getToken(PokemonLogParser.PAREN_IZQ, 0); }
		public TerminalNode ITEM() { return getToken(PokemonLogParser.ITEM, 0); }
		public TerminalNode PAREN_DER() { return getToken(PokemonLogParser.PAREN_DER, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public TerminalNode TOTAL() { return getToken(PokemonLogParser.TOTAL, 0); }
		public Damage_breakdownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage_breakdown; }
	}

	public final Damage_breakdownContext damage_breakdown() throws RecognitionException {
		Damage_breakdownContext _localctx = new Damage_breakdownContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_damage_breakdown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(DASH);
			setState(325);
			match(DAMAGE);
			setState(326);
			match(BREAKDOWN);
			setState(327);
			match(COLON);
			setState(328);
			match(BULLET);
			setState(329);
			match(BASE);
			setState(330);
			match(DAMAGE);
			setState(331);
			match(COLON);
			setState(332);
			match(NUM);
			setState(333);
			match(DAMAGE);
			setState(334);
			match(BULLET);
			setState(335);
			match(PAREN_IZQ);
			setState(336);
			match(ITEM);
			setState(337);
			match(PAREN_DER);
			setState(338);
			match(ID_CARD);
			setState(339);
			match(COLON);
			setState(340);
			match(NUM);
			setState(341);
			match(DAMAGE);
			setState(342);
			match(BULLET);
			setState(343);
			match(TOTAL);
			setState(344);
			match(DAMAGE);
			setState(345);
			match(COLON);
			setState(346);
			match(NUM);
			setState(347);
			match(DAMAGE);
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
	public static class Consecuencia_combateContext extends ParserRuleContext {
		public List<Id_playerContext> id_player() {
			return getRuleContexts(Id_playerContext.class);
		}
		public Id_playerContext id_player(int i) {
			return getRuleContext(Id_playerContext.class,i);
		}
		public List<TerminalNode> ID_CARD() { return getTokens(PokemonLogParser.ID_CARD); }
		public TerminalNode ID_CARD(int i) {
			return getToken(PokemonLogParser.ID_CARD, i);
		}
		public List<TerminalNode> BE() { return getTokens(PokemonLogParser.BE); }
		public TerminalNode BE(int i) {
			return getToken(PokemonLogParser.BE, i);
		}
		public TerminalNode KNOCK_OUT() { return getToken(PokemonLogParser.KNOCK_OUT, 0); }
		public TerminalNode EXCLAMATION() { return getToken(PokemonLogParser.EXCLAMATION, 0); }
		public List<TerminalNode> DASH() { return getTokens(PokemonLogParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(PokemonLogParser.DASH, i);
		}
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public TerminalNode CARD() { return getToken(PokemonLogParser.CARD, 0); }
		public TerminalNode DISCARD() { return getToken(PokemonLogParser.DISCARD, 0); }
		public TerminalNode FROM() { return getToken(PokemonLogParser.FROM, 0); }
		public List<TerminalNode> DOT() { return getTokens(PokemonLogParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PokemonLogParser.DOT, i);
		}
		public Cards_listContext cards_list() {
			return getRuleContext(Cards_listContext.class,0);
		}
		public TerminalNode TAKE() { return getToken(PokemonLogParser.TAKE, 0); }
		public TerminalNode PRIZE() { return getToken(PokemonLogParser.PRIZE, 0); }
		public TerminalNode A() { return getToken(PokemonLogParser.A, 0); }
		public TerminalNode ADD() { return getToken(PokemonLogParser.ADD, 0); }
		public List<TerminalNode> TO() { return getTokens(PokemonLogParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(PokemonLogParser.TO, i);
		}
		public TerminalNode HAND() { return getToken(PokemonLogParser.HAND, 0); }
		public List<TerminalNode> NOW() { return getTokens(PokemonLogParser.NOW); }
		public TerminalNode NOW(int i) {
			return getToken(PokemonLogParser.NOW, i);
		}
		public List<TerminalNode> IN() { return getTokens(PokemonLogParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(PokemonLogParser.IN, i);
		}
		public List<TerminalNode> THE() { return getTokens(PokemonLogParser.THE); }
		public TerminalNode THE(int i) {
			return getToken(PokemonLogParser.THE, i);
		}
		public List<TerminalNode> ACTIVE_SPOT() { return getTokens(PokemonLogParser.ACTIVE_SPOT); }
		public TerminalNode ACTIVE_SPOT(int i) {
			return getToken(PokemonLogParser.ACTIVE_SPOT, i);
		}
		public TerminalNode PLAY() { return getToken(PokemonLogParser.PLAY, 0); }
		public TerminalNode PRIME_CATCHER() { return getToken(PokemonLogParser.PRIME_CATCHER, 0); }
		public List<TerminalNode> SWITCH_VERB() { return getTokens(PokemonLogParser.SWITCH_VERB); }
		public TerminalNode SWITCH_VERB(int i) {
			return getToken(PokemonLogParser.SWITCH_VERB, i);
		}
		public List<TerminalNode> WITH() { return getTokens(PokemonLogParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(PokemonLogParser.WITH, i);
		}
		public List<TerminalNode> BECOME() { return getTokens(PokemonLogParser.BECOME); }
		public TerminalNode BECOME(int i) {
			return getToken(PokemonLogParser.BECOME, i);
		}
		public List<TerminalNode> ACTIVE() { return getTokens(PokemonLogParser.ACTIVE); }
		public TerminalNode ACTIVE(int i) {
			return getToken(PokemonLogParser.ACTIVE, i);
		}
		public List<TerminalNode> POKEMON() { return getTokens(PokemonLogParser.POKEMON); }
		public TerminalNode POKEMON(int i) {
			return getToken(PokemonLogParser.POKEMON, i);
		}
		public TerminalNode BOSS_ORDERS() { return getToken(PokemonLogParser.BOSS_ORDERS, 0); }
		public Consecuencia_combateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consecuencia_combate; }
	}

	public final Consecuencia_combateContext consecuencia_combate() throws RecognitionException {
		Consecuencia_combateContext _localctx = new Consecuencia_combateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_consecuencia_combate);
		int _la;
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				id_player();
				setState(350);
				match(ID_CARD);
				setState(351);
				match(BE);
				setState(352);
				match(KNOCK_OUT);
				setState(353);
				match(EXCLAMATION);
				setState(374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(354);
					match(DASH);
					setState(355);
					match(NUM);
					setState(356);
					match(CARD);
					setState(357);
					match(BE);
					setState(358);
					match(DISCARD);
					setState(359);
					match(FROM);
					setState(360);
					id_player();
					setState(361);
					match(ID_CARD);
					setState(362);
					match(DOT);
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BULLET) {
						{
						setState(363);
						cards_list();
						}
					}

					}
					break;
				case 2:
					{
					setState(366);
					match(ID_CARD);
					setState(367);
					match(BE);
					setState(368);
					match(DISCARD);
					setState(369);
					match(FROM);
					setState(370);
					id_player();
					setState(371);
					match(ID_CARD);
					setState(372);
					match(DOT);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				id_player();
				setState(377);
				match(TAKE);
				setState(378);
				_la = _input.LA(1);
				if ( !(_la==A || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(379);
				match(PRIZE);
				setState(380);
				match(CARD);
				setState(381);
				match(DOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case A:
					{
					setState(383);
					match(A);
					setState(384);
					match(CARD);
					}
					break;
				case ID_CARD:
					{
					setState(385);
					match(ID_CARD);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(388);
				match(BE);
				setState(389);
				match(ADD);
				setState(390);
				match(TO);
				setState(391);
				id_player();
				setState(392);
				match(HAND);
				setState(393);
				match(DOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(395);
				id_player();
				setState(396);
				match(ID_CARD);
				setState(397);
				match(BE);
				setState(398);
				match(NOW);
				setState(399);
				match(IN);
				setState(400);
				match(THE);
				setState(401);
				match(ACTIVE_SPOT);
				setState(402);
				match(DOT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(404);
				id_player();
				setState(405);
				match(PLAY);
				setState(406);
				match(PRIME_CATCHER);
				setState(407);
				match(DOT);
				setState(408);
				match(DASH);
				setState(409);
				id_player();
				setState(410);
				match(ID_CARD);
				setState(411);
				match(BE);
				setState(412);
				match(SWITCH_VERB);
				setState(413);
				match(WITH);
				setState(414);
				id_player();
				setState(415);
				match(ID_CARD);
				setState(416);
				match(TO);
				setState(417);
				match(BECOME);
				setState(418);
				match(THE);
				setState(419);
				match(ACTIVE);
				setState(420);
				match(POKEMON);
				setState(421);
				match(DOT);
				setState(422);
				match(DASH);
				setState(423);
				id_player();
				setState(424);
				match(ID_CARD);
				setState(425);
				match(BE);
				setState(426);
				match(SWITCH_VERB);
				setState(427);
				match(WITH);
				setState(428);
				id_player();
				setState(429);
				match(ID_CARD);
				setState(430);
				match(TO);
				setState(431);
				match(BECOME);
				setState(432);
				match(THE);
				setState(433);
				match(ACTIVE);
				setState(434);
				match(POKEMON);
				setState(435);
				match(DOT);
				setState(436);
				id_player();
				setState(437);
				match(ID_CARD);
				setState(438);
				match(BE);
				setState(439);
				match(NOW);
				setState(440);
				match(IN);
				setState(441);
				match(THE);
				setState(442);
				match(ACTIVE_SPOT);
				setState(443);
				match(DOT);
				setState(444);
				id_player();
				setState(445);
				match(ID_CARD);
				setState(446);
				match(BE);
				setState(447);
				match(NOW);
				setState(448);
				match(IN);
				setState(449);
				match(THE);
				setState(450);
				match(ACTIVE_SPOT);
				setState(451);
				match(DOT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(453);
				id_player();
				setState(454);
				match(PLAY);
				setState(455);
				match(BOSS_ORDERS);
				setState(456);
				match(DOT);
				setState(457);
				match(DASH);
				setState(458);
				id_player();
				setState(459);
				match(ID_CARD);
				setState(460);
				match(BE);
				setState(461);
				match(SWITCH_VERB);
				setState(462);
				match(WITH);
				setState(463);
				id_player();
				setState(464);
				match(ID_CARD);
				setState(465);
				match(TO);
				setState(466);
				match(BECOME);
				setState(467);
				match(THE);
				setState(468);
				match(ACTIVE);
				setState(469);
				match(POKEMON);
				setState(470);
				match(DOT);
				setState(471);
				id_player();
				setState(472);
				match(ID_CARD);
				setState(473);
				match(BE);
				setState(474);
				match(NOW);
				setState(475);
				match(IN);
				setState(476);
				match(THE);
				setState(477);
				match(ACTIVE_SPOT);
				setState(478);
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
		public TerminalNode ALL() { return getToken(PokemonLogParser.ALL, 0); }
		public TerminalNode PRIZE() { return getToken(PokemonLogParser.PRIZE, 0); }
		public TerminalNode CARD() { return getToken(PokemonLogParser.CARD, 0); }
		public TerminalNode TAKE() { return getToken(PokemonLogParser.TAKE, 0); }
		public List<TerminalNode> DOT() { return getTokens(PokemonLogParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PokemonLogParser.DOT, i);
		}
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode WIN() { return getToken(PokemonLogParser.WIN, 0); }
		public Player_wonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_won; }
	}

	public final Player_wonContext player_won() throws RecognitionException {
		Player_wonContext _localctx = new Player_wonContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_player_won);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(ALL);
			setState(483);
			match(PRIZE);
			setState(484);
			match(CARD);
			setState(485);
			match(TAKE);
			setState(486);
			match(DOT);
			setState(487);
			id_player();
			setState(488);
			match(WIN);
			setState(489);
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
	public static class Id_playerContext extends ParserRuleContext {
		public TerminalNode ID_TOKEN() { return getToken(PokemonLogParser.ID_TOKEN, 0); }
		public Id_playerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_player; }
	}

	public final Id_playerContext id_player() throws RecognitionException {
		Id_playerContext _localctx = new Id_playerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_id_player);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(ID_TOKEN);
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
		"\u0004\u0001E\u01ee\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0004\u0000;\b\u0000\u000b\u0000\f\u0000<\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001G\b\u0001\n\u0001\f\u0001J\t\u0001\u0001"+
		"\u0001\u0005\u0001M\b\u0001\n\u0001\f\u0001P\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005y\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u007f\b\u0006\n\u0006\f\u0006\u0082\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0086\b\u0007\u0001\b\u0001\b\u0005"+
		"\b\u008a\b\b\n\b\f\b\u008d\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00a7\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ae\b"+
		"\f\u0001\f\u0001\f\u0003\f\u00b2\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00ba\b\r\u0001\r\u0001\r\u0003\r\u00be\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00c6\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00cc\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ee\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00fd\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0112\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0135\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0143\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u016d\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0177\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0183\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u01e1\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0000\u0000\u001c\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"\u0000\u0002\u0001\u0000\u0013\u0014\u0002\u0000\u000b\u000bCC\u01f8\u0000"+
		"8\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004Q\u0001"+
		"\u0000\u0000\u0000\u0006[\u0001\u0000\u0000\u0000\bb\u0001\u0000\u0000"+
		"\u0000\ni\u0001\u0000\u0000\u0000\fz\u0001\u0000\u0000\u0000\u000e\u0085"+
		"\u0001\u0000\u0000\u0000\u0010\u0087\u0001\u0000\u0000\u0000\u0012\u0090"+
		"\u0001\u0000\u0000\u0000\u0014\u0093\u0001\u0000\u0000\u0000\u0016\u00a6"+
		"\u0001\u0000\u0000\u0000\u0018\u00a8\u0001\u0000\u0000\u0000\u001a\u00b3"+
		"\u0001\u0000\u0000\u0000\u001c\u00bf\u0001\u0000\u0000\u0000\u001e\u00cd"+
		"\u0001\u0000\u0000\u0000 \u00d2\u0001\u0000\u0000\u0000\"\u00da\u0001"+
		"\u0000\u0000\u0000$\u00e2\u0001\u0000\u0000\u0000&\u00f1\u0001\u0000\u0000"+
		"\u0000(\u0100\u0001\u0000\u0000\u0000*\u0113\u0001\u0000\u0000\u0000,"+
		"\u012e\u0001\u0000\u0000\u0000.\u0136\u0001\u0000\u0000\u00000\u0144\u0001"+
		"\u0000\u0000\u00002\u01e0\u0001\u0000\u0000\u00004\u01e2\u0001\u0000\u0000"+
		"\u00006\u01eb\u0001\u0000\u0000\u00008:\u0003\u0002\u0001\u00009;\u0003"+
		"\u0010\b\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">?\u00034\u001a\u0000?@\u0005\u0000\u0000\u0001@\u0001\u0001\u0000\u0000"+
		"\u0000AB\u0005\u0001\u0000\u0000BC\u0003\u0004\u0002\u0000CD\u0003\u0006"+
		"\u0003\u0000DH\u0003\b\u0004\u0000EG\u0003\n\u0005\u0000FE\u0001\u0000"+
		"\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IN\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000"+
		"KM\u0003\u000e\u0007\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u0003\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u00036\u001b\u0000RS\u0005"+
		"(\u0000\u0000ST\u0007\u0000\u0000\u0000TU\u0005\u0007\u0000\u0000UV\u0005"+
		"\b\u0000\u0000VW\u0005\u0015\u0000\u0000WX\u0005\u0016\u0000\u0000XY\u0005"+
		"\u0017\u0000\u0000YZ\u0005;\u0000\u0000Z\u0005\u0001\u0000\u0000\u0000"+
		"[\\\u00036\u001b\u0000\\]\u0005*\u0000\u0000]^\u0005\b\u0000\u0000^_\u0005"+
		"\u0016\u0000\u0000_`\u0005\u0019\u0000\u0000`a\u0005;\u0000\u0000a\u0007"+
		"\u0001\u0000\u0000\u0000bc\u00036\u001b\u0000cd\u0005)\u0000\u0000de\u0005"+
		"\t\u0000\u0000ef\u0005\'\u0000\u0000fg\u0005\u0018\u0000\u0000gh\u0005"+
		";\u0000\u0000h\t\u0001\u0000\u0000\u0000ij\u00036\u001b\u0000jk\u0005"+
		",\u0000\u0000kl\u0005C\u0000\u0000lm\u0005\u001a\u0000\u0000mn\u0005\u0007"+
		"\u0000\u0000no\u0005\b\u0000\u0000op\u0005\u0015\u0000\u0000pq\u0005\u001b"+
		"\u0000\u0000qr\u0005;\u0000\u0000rs\u0005<\u0000\u0000st\u0005C\u0000"+
		"\u0000tu\u0005,\u0000\u0000uv\u0005\u001a\u0000\u0000vx\u0005;\u0000\u0000"+
		"wy\u0003\f\u0006\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y\u000b\u0001\u0000\u0000\u0000z{\u0005>\u0000\u0000{\u0080\u0005:\u0000"+
		"\u0000|}\u0005=\u0000\u0000}\u007f\u0005:\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\r\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0083\u0086\u0003 \u0010\u0000\u0084\u0086"+
		"\u0003\"\u0011\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u000f\u0001\u0000\u0000\u0000\u0087\u008b\u0003"+
		"\u0012\t\u0000\u0088\u008a\u0003\u0016\u000b\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0003\u0014"+
		"\n\u0000\u008f\u0011\u0001\u0000\u0000\u0000\u0090\u0091\u00036\u001b"+
		"\u0000\u0091\u0092\u0005\u0006\u0000\u0000\u0092\u0013\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u00036\u001b\u0000\u0094\u0095\u00059\u0000\u0000\u0095"+
		"\u0096\u0005\r\u0000\u0000\u0096\u0097\u0005\u0006\u0000\u0000\u0097\u0098"+
		"\u0005;\u0000\u0000\u0098\u0015\u0001\u0000\u0000\u0000\u0099\u00a7\u0003"+
		"\u0018\f\u0000\u009a\u00a7\u0003\u001e\u000f\u0000\u009b\u00a7\u0003 "+
		"\u0010\u0000\u009c\u00a7\u0003\"\u0011\u0000\u009d\u00a7\u0003$\u0012"+
		"\u0000\u009e\u00a7\u0003\u001c\u000e\u0000\u009f\u00a7\u0003\u001a\r\u0000"+
		"\u00a0\u00a7\u0003&\u0013\u0000\u00a1\u00a7\u0003(\u0014\u0000\u00a2\u00a7"+
		"\u0003*\u0015\u0000\u00a3\u00a7\u0003,\u0016\u0000\u00a4\u00a7\u0003."+
		"\u0017\u0000\u00a5\u00a7\u00032\u0019\u0000\u00a6\u0099\u0001\u0000\u0000"+
		"\u0000\u00a6\u009a\u0001\u0000\u0000\u0000\u00a6\u009b\u0001\u0000\u0000"+
		"\u0000\u00a6\u009c\u0001\u0000\u0000\u0000\u00a6\u009d\u0001\u0000\u0000"+
		"\u0000\u00a6\u009e\u0001\u0000\u0000\u0000\u00a6\u009f\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a0\u0001\u0000\u0000\u0000\u00a6\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u0017\u0001\u0000\u0000\u0000\u00a8\u00a9\u00036\u001b\u0000"+
		"\u00a9\u00ad\u0005,\u0000\u0000\u00aa\u00ab\u0005\u000b\u0000\u0000\u00ab"+
		"\u00ae\u0005\u001a\u0000\u0000\u00ac\u00ae\u0005:\u0000\u0000\u00ad\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00b1\u0005;\u0000\u0000\u00b0\u00b2\u0003"+
		"\f\u0006\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u0019\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005<\u0000"+
		"\u0000\u00b4\u00b5\u00036\u001b\u0000\u00b5\u00b9\u0005,\u0000\u0000\u00b6"+
		"\u00ba\u0005:\u0000\u0000\u00b7\u00b8\u0005C\u0000\u0000\u00b8\u00ba\u0005"+
		"\u001a\u0000\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0005"+
		";\u0000\u0000\u00bc\u00be\u0003\f\u0006\u0000\u00bd\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u001b\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005<\u0000\u0000\u00c0\u00c1\u00036\u001b\u0000"+
		"\u00c1\u00c5\u00054\u0000\u0000\u00c2\u00c3\u0005C\u0000\u0000\u00c3\u00c4"+
		"\u0005\u001a\u0000\u0000\u00c4\u00c6\u0005\u000f\u0000\u0000\u00c5\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\r\u0000\u0000\u00c8\u00c9\u0005"+
		"\u000e\u0000\u0000\u00c9\u00cb\u0005;\u0000\u0000\u00ca\u00cc\u0003\f"+
		"\u0006\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u001d\u0001\u0000\u0000\u0000\u00cd\u00ce\u00036\u001b"+
		"\u0000\u00ce\u00cf\u0005.\u0000\u0000\u00cf\u00d0\u0005:\u0000\u0000\u00d0"+
		"\u00d1\u0005;\u0000\u0000\u00d1\u001f\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u00036\u001b\u0000\u00d3\u00d4\u0005.\u0000\u0000\u00d4\u00d5\u0005:"+
		"\u0000\u0000\u00d5\u00d6\u0005\t\u0000\u0000\u00d6\u00d7\u0005\b\u0000"+
		"\u0000\u00d7\u00d8\u0005\u0002\u0000\u0000\u00d8\u00d9\u0005;\u0000\u0000"+
		"\u00d9!\u0001\u0000\u0000\u0000\u00da\u00db\u00036\u001b\u0000\u00db\u00dc"+
		"\u0005.\u0000\u0000\u00dc\u00dd\u0005:\u0000\u0000\u00dd\u00de\u0005\t"+
		"\u0000\u0000\u00de\u00df\u0005\b\u0000\u0000\u00df\u00e0\u0005\u0003\u0000"+
		"\u0000\u00e0\u00e1\u0005;\u0000\u0000\u00e1#\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u00036\u001b\u0000\u00e3\u00e4\u0005/\u0000\u0000\u00e4\u00e5\u0005"+
		":\u0000\u0000\u00e5\u00e6\u0005\t\u0000\u0000\u00e6\u00ed\u0005:\u0000"+
		"\u0000\u00e7\u00e8\u0005\f\u0000\u0000\u00e8\u00e9\u0005\b\u0000\u0000"+
		"\u00e9\u00ee\u0005\u0003\u0000\u0000\u00ea\u00eb\u0005\n\u0000\u0000\u00eb"+
		"\u00ec\u0005\b\u0000\u0000\u00ec\u00ee\u0005\u0002\u0000\u0000\u00ed\u00e7"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005;\u0000\u0000\u00f0%\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u00036\u001b\u0000\u00f2\u00f3\u00050\u0000\u0000"+
		"\u00f3\u00f4\u0005:\u0000\u0000\u00f4\u00f5\u0005\t\u0000\u0000\u00f5"+
		"\u00fc\u0005:\u0000\u0000\u00f6\u00f7\u0005\n\u0000\u0000\u00f7\u00f8"+
		"\u0005\b\u0000\u0000\u00f8\u00fd\u0005\u0002\u0000\u0000\u00f9\u00fa\u0005"+
		"\f\u0000\u0000\u00fa\u00fb\u0005\b\u0000\u0000\u00fb\u00fd\u0005\u0003"+
		"\u0000\u0000\u00fc\u00f6\u0001\u0000\u0000\u0000\u00fc\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005;\u0000"+
		"\u0000\u00ff\'\u0001\u0000\u0000\u0000\u0100\u0101\u00036\u001b\u0000"+
		"\u0101\u0102\u00052\u0000\u0000\u0102\u0103\u0005:\u0000\u0000\u0103\u0104"+
		"\u0005\t\u0000\u0000\u0104\u0105\u0005\b\u0000\u0000\u0105\u0106\u0005"+
		"\u0003\u0000\u0000\u0106\u0107\u0005;\u0000\u0000\u0107\u0108\u0005<\u0000"+
		"\u0000\u0108\u0109\u0005C\u0000\u0000\u0109\u010a\u0005\u001a\u0000\u0000"+
		"\u010a\u010b\u0005&\u0000\u0000\u010b\u010c\u00055\u0000\u0000\u010c\u010d"+
		"\u0005#\u0000\u0000\u010d\u010e\u00036\u001b\u0000\u010e\u010f\u0005:"+
		"\u0000\u0000\u010f\u0111\u0005;\u0000\u0000\u0110\u0112\u0003\f\u0006"+
		"\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000"+
		"\u0000\u0112)\u0001\u0000\u0000\u0000\u0113\u0114\u00036\u001b\u0000\u0114"+
		"\u0115\u0005.\u0000\u0000\u0115\u0116\u0005:\u0000\u0000\u0116\u0117\u0005"+
		";\u0000\u0000\u0117\u0118\u0005<\u0000\u0000\u0118\u0119\u00036\u001b"+
		"\u0000\u0119\u011a\u0005:\u0000\u0000\u011a\u011b\u0005&\u0000\u0000\u011b"+
		"\u011c\u00056\u0000\u0000\u011c\u011d\u0005\u0011\u0000\u0000\u011d\u011e"+
		"\u00036\u001b\u0000\u011e\u011f\u0005:\u0000\u0000\u011f\u0120\u0005\t"+
		"\u0000\u0000\u0120\u0121\u0005\u0012\u0000\u0000\u0121\u0122\u0005\b\u0000"+
		"\u0000\u0122\u0123\u0005\u0004\u0000\u0000\u0123\u0124\u0005\u0005\u0000"+
		"\u0000\u0124\u0125\u0005;\u0000\u0000\u0125\u0126\u00036\u001b\u0000\u0126"+
		"\u0127\u0005:\u0000\u0000\u0127\u0128\u0005&\u0000\u0000\u0128\u0129\u0005"+
		"\u0010\u0000\u0000\u0129\u012a\u0005\n\u0000\u0000\u012a\u012b\u0005\b"+
		"\u0000\u0000\u012b\u012c\u0005\u0002\u0000\u0000\u012c\u012d\u0005;\u0000"+
		"\u0000\u012d+\u0001\u0000\u0000\u0000\u012e\u012f\u00036\u001b\u0000\u012f"+
		"\u0130\u0005:\u0000\u0000\u0130\u0131\u00051\u0000\u0000\u0131\u0132\u0005"+
		":\u0000\u0000\u0132\u0134\u0005;\u0000\u0000\u0133\u0135\u0003\f\u0006"+
		"\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000"+
		"\u0000\u0135-\u0001\u0000\u0000\u0000\u0136\u0137\u00036\u001b\u0000\u0137"+
		"\u0138\u0005:\u0000\u0000\u0138\u0139\u00051\u0000\u0000\u0139\u013a\u0005"+
		":\u0000\u0000\u013a\u013b\u0005\f\u0000\u0000\u013b\u013c\u00036\u001b"+
		"\u0000\u013c\u013d\u0005:\u0000\u0000\u013d\u013e\u0005\u0007\u0000\u0000"+
		"\u013e\u013f\u0005C\u0000\u0000\u013f\u0140\u0005\u001c\u0000\u0000\u0140"+
		"\u0142\u0005;\u0000\u0000\u0141\u0143\u00030\u0018\u0000\u0142\u0141\u0001"+
		"\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143/\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0005<\u0000\u0000\u0145\u0146\u0005\u001c\u0000"+
		"\u0000\u0146\u0147\u0005\u001f\u0000\u0000\u0147\u0148\u0005@\u0000\u0000"+
		"\u0148\u0149\u0005>\u0000\u0000\u0149\u014a\u0005 \u0000\u0000\u014a\u014b"+
		"\u0005\u001c\u0000\u0000\u014b\u014c\u0005@\u0000\u0000\u014c\u014d\u0005"+
		"C\u0000\u0000\u014d\u014e\u0005\u001c\u0000\u0000\u014e\u014f\u0005>\u0000"+
		"\u0000\u014f\u0150\u0005A\u0000\u0000\u0150\u0151\u0005\"\u0000\u0000"+
		"\u0151\u0152\u0005B\u0000\u0000\u0152\u0153\u0005:\u0000\u0000\u0153\u0154"+
		"\u0005@\u0000\u0000\u0154\u0155\u0005C\u0000\u0000\u0155\u0156\u0005\u001c"+
		"\u0000\u0000\u0156\u0157\u0005>\u0000\u0000\u0157\u0158\u0005!\u0000\u0000"+
		"\u0158\u0159\u0005\u001c\u0000\u0000\u0159\u015a\u0005@\u0000\u0000\u015a"+
		"\u015b\u0005C\u0000\u0000\u015b\u015c\u0005\u001c\u0000\u0000\u015c1\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u00036\u001b\u0000\u015e\u015f\u0005:\u0000"+
		"\u0000\u015f\u0160\u0005&\u0000\u0000\u0160\u0161\u00057\u0000\u0000\u0161"+
		"\u0176\u0005?\u0000\u0000\u0162\u0163\u0005<\u0000\u0000\u0163\u0164\u0005"+
		"C\u0000\u0000\u0164\u0165\u0005\u001a\u0000\u0000\u0165\u0166\u0005&\u0000"+
		"\u0000\u0166\u0167\u00055\u0000\u0000\u0167\u0168\u0005#\u0000\u0000\u0168"+
		"\u0169\u00036\u001b\u0000\u0169\u016a\u0005:\u0000\u0000\u016a\u016c\u0005"+
		";\u0000\u0000\u016b\u016d\u0003\f\u0006\u0000\u016c\u016b\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u0177\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0005:\u0000\u0000\u016f\u0170\u0005&\u0000\u0000"+
		"\u0170\u0171\u00055\u0000\u0000\u0171\u0172\u0005#\u0000\u0000\u0172\u0173"+
		"\u00036\u001b\u0000\u0173\u0174\u0005:\u0000\u0000\u0174\u0175\u0005;"+
		"\u0000\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0162\u0001\u0000"+
		"\u0000\u0000\u0176\u016e\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000"+
		"\u0000\u0000\u0177\u01e1\u0001\u0000\u0000\u0000\u0178\u0179\u00036\u001b"+
		"\u0000\u0179\u017a\u00058\u0000\u0000\u017a\u017b\u0007\u0001\u0000\u0000"+
		"\u017b\u017c\u0005\u001d\u0000\u0000\u017c\u017d\u0005\u001a\u0000\u0000"+
		"\u017d\u017e\u0005;\u0000\u0000\u017e\u01e1\u0001\u0000\u0000\u0000\u017f"+
		"\u0180\u0005\u000b\u0000\u0000\u0180\u0183\u0005\u001a\u0000\u0000\u0181"+
		"\u0183\u0005:\u0000\u0000\u0182\u017f\u0001\u0000\u0000\u0000\u0182\u0181"+
		"\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0185"+
		"\u0005&\u0000\u0000\u0185\u0186\u0005-\u0000\u0000\u0186\u0187\u0005\t"+
		"\u0000\u0000\u0187\u0188\u00036\u001b\u0000\u0188\u0189\u0005\u001b\u0000"+
		"\u0000\u0189\u018a\u0005;\u0000\u0000\u018a\u01e1\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u00036\u001b\u0000\u018c\u018d\u0005:\u0000\u0000\u018d\u018e"+
		"\u0005&\u0000\u0000\u018e\u018f\u0005\u0010\u0000\u0000\u018f\u0190\u0005"+
		"\n\u0000\u0000\u0190\u0191\u0005\b\u0000\u0000\u0191\u0192\u0005\u0002"+
		"\u0000\u0000\u0192\u0193\u0005;\u0000\u0000\u0193\u01e1\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u00036\u001b\u0000\u0195\u0196\u0005.\u0000\u0000\u0196"+
		"\u0197\u0005$\u0000\u0000\u0197\u0198\u0005;\u0000\u0000\u0198\u0199\u0005"+
		"<\u0000\u0000\u0199\u019a\u00036\u001b\u0000\u019a\u019b\u0005:\u0000"+
		"\u0000\u019b\u019c\u0005&\u0000\u0000\u019c\u019d\u00056\u0000\u0000\u019d"+
		"\u019e\u0005\u0011\u0000\u0000\u019e\u019f\u00036\u001b\u0000\u019f\u01a0"+
		"\u0005:\u0000\u0000\u01a0\u01a1\u0005\t\u0000\u0000\u01a1\u01a2\u0005"+
		"\u0012\u0000\u0000\u01a2\u01a3\u0005\b\u0000\u0000\u01a3\u01a4\u0005\u0004"+
		"\u0000\u0000\u01a4\u01a5\u0005\u0005\u0000\u0000\u01a5\u01a6\u0005;\u0000"+
		"\u0000\u01a6\u01a7\u0005<\u0000\u0000\u01a7\u01a8\u00036\u001b\u0000\u01a8"+
		"\u01a9\u0005:\u0000\u0000\u01a9\u01aa\u0005&\u0000\u0000\u01aa\u01ab\u0005"+
		"6\u0000\u0000\u01ab\u01ac\u0005\u0011\u0000\u0000\u01ac\u01ad\u00036\u001b"+
		"\u0000\u01ad\u01ae\u0005:\u0000\u0000\u01ae\u01af\u0005\t\u0000\u0000"+
		"\u01af\u01b0\u0005\u0012\u0000\u0000\u01b0\u01b1\u0005\b\u0000\u0000\u01b1"+
		"\u01b2\u0005\u0004\u0000\u0000\u01b2\u01b3\u0005\u0005\u0000\u0000\u01b3"+
		"\u01b4\u0005;\u0000\u0000\u01b4\u01b5\u00036\u001b\u0000\u01b5\u01b6\u0005"+
		":\u0000\u0000\u01b6\u01b7\u0005&\u0000\u0000\u01b7\u01b8\u0005\u0010\u0000"+
		"\u0000\u01b8\u01b9\u0005\n\u0000\u0000\u01b9\u01ba\u0005\b\u0000\u0000"+
		"\u01ba\u01bb\u0005\u0002\u0000\u0000\u01bb\u01bc\u0005;\u0000\u0000\u01bc"+
		"\u01bd\u00036\u001b\u0000\u01bd\u01be\u0005:\u0000\u0000\u01be\u01bf\u0005"+
		"&\u0000\u0000\u01bf\u01c0\u0005\u0010\u0000\u0000\u01c0\u01c1\u0005\n"+
		"\u0000\u0000\u01c1\u01c2\u0005\b\u0000\u0000\u01c2\u01c3\u0005\u0002\u0000"+
		"\u0000\u01c3\u01c4\u0005;\u0000\u0000\u01c4\u01e1\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c6\u00036\u001b\u0000\u01c6\u01c7\u0005.\u0000\u0000\u01c7\u01c8"+
		"\u0005%\u0000\u0000\u01c8\u01c9\u0005;\u0000\u0000\u01c9\u01ca\u0005<"+
		"\u0000\u0000\u01ca\u01cb\u00036\u001b\u0000\u01cb\u01cc\u0005:\u0000\u0000"+
		"\u01cc\u01cd\u0005&\u0000\u0000\u01cd\u01ce\u00056\u0000\u0000\u01ce\u01cf"+
		"\u0005\u0011\u0000\u0000\u01cf\u01d0\u00036\u001b\u0000\u01d0\u01d1\u0005"+
		":\u0000\u0000\u01d1\u01d2\u0005\t\u0000\u0000\u01d2\u01d3\u0005\u0012"+
		"\u0000\u0000\u01d3\u01d4\u0005\b\u0000\u0000\u01d4\u01d5\u0005\u0004\u0000"+
		"\u0000\u01d5\u01d6\u0005\u0005\u0000\u0000\u01d6\u01d7\u0005;\u0000\u0000"+
		"\u01d7\u01d8\u00036\u001b\u0000\u01d8\u01d9\u0005:\u0000\u0000\u01d9\u01da"+
		"\u0005&\u0000\u0000\u01da\u01db\u0005\u0010\u0000\u0000\u01db\u01dc\u0005"+
		"\n\u0000\u0000\u01dc\u01dd\u0005\b\u0000\u0000\u01dd\u01de\u0005\u0002"+
		"\u0000\u0000\u01de\u01df\u0005;\u0000\u0000\u01df\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e0\u015d\u0001\u0000\u0000\u0000\u01e0\u0178\u0001\u0000\u0000"+
		"\u0000\u01e0\u0182\u0001\u0000\u0000\u0000\u01e0\u018b\u0001\u0000\u0000"+
		"\u0000\u01e0\u0194\u0001\u0000\u0000\u0000\u01e0\u01c5\u0001\u0000\u0000"+
		"\u0000\u01e13\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005\u001e\u0000\u0000"+
		"\u01e3\u01e4\u0005\u001d\u0000\u0000\u01e4\u01e5\u0005\u001a\u0000\u0000"+
		"\u01e5\u01e6\u00058\u0000\u0000\u01e6\u01e7\u0005;\u0000\u0000\u01e7\u01e8"+
		"\u00036\u001b\u0000\u01e8\u01e9\u0005*\u0000\u0000\u01e9\u01ea\u0005;"+
		"\u0000\u0000\u01ea5\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005D\u0000\u0000"+
		"\u01ec7\u0001\u0000\u0000\u0000\u0017<HNx\u0080\u0085\u008b\u00a6\u00ad"+
		"\u00b1\u00b9\u00bd\u00c5\u00cb\u00ed\u00fc\u0111\u0134\u0142\u016c\u0176"+
		"\u0182\u01e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}