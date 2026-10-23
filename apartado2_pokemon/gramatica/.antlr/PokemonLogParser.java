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
		SETUP=1, ACTIVE_SPOT=2, BENCH=3, ACTIVE=4, POKEMON=5, TURN=6, FOR=7, THE=8, 
		TO=9, IN=10, A=11, ON=12, THEIR=13, DECK=14, INTO=15, NOW=16, WITH=17, 
		BECOME=18, HEADS=19, TAILS=20, OPENING=21, COIN=22, FLIP=23, FIRST=24, 
		TOSS=25, CARD=26, HAND=27, DAMAGE=28, PRIZE=29, ALL=30, BREAKDOWN=31, 
		BASE=32, TOTAL=33, ITEM=34, FROM=35, BE=36, GO=37, CHOOSE=38, DECIDE=39, 
		WIN=40, CONCEDE=41, DRAW=42, ADD=43, PLAY=44, ATTACH=45, EVOLVE=46, USE=47, 
		RETREAT=48, MOVE=49, SHUFFLE=50, DISCARD=51, SWITCH_VERB=52, KNOCK_OUT=53, 
		TAKE=54, END=55, ID_CARD=56, DOT=57, DASH=58, COMMA=59, BULLET=60, EXCLAMATION=61, 
		COLON=62, PAREN_IZQ=63, PAREN_DER=64, NUM=65, ID_TOKEN=66, WS=67;
	public static final int
		RULE_start_game = 0, RULE_setup_block = 1, RULE_coin_selection = 2, RULE_coin_result = 3, 
		RULE_first_decision = 4, RULE_drew_result = 5, RULE_cards_list = 6, RULE_initial_play = 7, 
		RULE_players_turns = 8, RULE_player_starts_turn = 9, RULE_player_ends_turn = 10, 
		RULE_player_plays = 11, RULE_player_draw_card = 12, RULE_player_sub_draw = 13, 
		RULE_player_shuffled = 14, RULE_player_discarded = 15, RULE_discard_one_card = 16, 
		RULE_discard_multiple_cards = 17, RULE_player_played_card = 18, RULE_player_plays_active_spot = 19, 
		RULE_player_plays_bench = 20, RULE_player_attaches_card = 21, RULE_player_evolve = 22, 
		RULE_player_retreated = 23, RULE_player_switch = 24, RULE_player_used_ability = 25, 
		RULE_player_attack = 26, RULE_player_moved = 27, RULE_damage_breakdown = 28, 
		RULE_base_damage = 29, RULE_item_damage = 30, RULE_total_damage = 31, 
		RULE_fight_consequence = 32, RULE_player_won = 33, RULE_id_player = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_game", "setup_block", "coin_selection", "coin_result", "first_decision", 
			"drew_result", "cards_list", "initial_play", "players_turns", "player_starts_turn", 
			"player_ends_turn", "player_plays", "player_draw_card", "player_sub_draw", 
			"player_shuffled", "player_discarded", "discard_one_card", "discard_multiple_cards", 
			"player_played_card", "player_plays_active_spot", "player_plays_bench", 
			"player_attaches_card", "player_evolve", "player_retreated", "player_switch", 
			"player_used_ability", "player_attack", "player_moved", "damage_breakdown", 
			"base_damage", "item_damage", "total_damage", "fight_consequence", "player_won", 
			"id_player"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Setup'", "'Active Spot'", "'Bench'", "'Active'", "'Pok\\u00E9mon'", 
			null, "'for'", "'the'", "'to'", "'in'", null, "'on'", "'their'", "'deck'", 
			"'into'", "'now'", "'with'", "'become'", "'heads'", "'tails'", "'opening'", 
			"'coin'", "'flip'", "'first'", "'toss'", null, "'hand'", null, "'Prize'", 
			"'All'", "'breakdown'", "'Base'", "'Total'", "'Item'", "'from'", null, 
			"'go'", "'chose'", "'decided'", null, "'conceded'", null, "'added'", 
			"'played'", "'attached'", "'evolved'", "'used'", "'retreated'", "'moved'", 
			"'shuffled'", "'discarded'", "'switched'", "'Knocked Out'", null, "'ended'", 
			null, "'.'", "'-'", "','", "'\\u2022'", "'!'", "':'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SETUP", "ACTIVE_SPOT", "BENCH", "ACTIVE", "POKEMON", "TURN", "FOR", 
			"THE", "TO", "IN", "A", "ON", "THEIR", "DECK", "INTO", "NOW", "WITH", 
			"BECOME", "HEADS", "TAILS", "OPENING", "COIN", "FLIP", "FIRST", "TOSS", 
			"CARD", "HAND", "DAMAGE", "PRIZE", "ALL", "BREAKDOWN", "BASE", "TOTAL", 
			"ITEM", "FROM", "BE", "GO", "CHOOSE", "DECIDE", "WIN", "CONCEDE", "DRAW", 
			"ADD", "PLAY", "ATTACH", "EVOLVE", "USE", "RETREAT", "MOVE", "SHUFFLE", 
			"DISCARD", "SWITCH_VERB", "KNOCK_OUT", "TAKE", "END", "ID_CARD", "DOT", 
			"DASH", "COMMA", "BULLET", "EXCLAMATION", "COLON", "PAREN_IZQ", "PAREN_DER", 
			"NUM", "ID_TOKEN", "WS"
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
			setState(70);
			setup_block();
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				players_turns();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID_TOKEN );
			setState(76);
			player_won();
			setState(77);
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
			setState(79);
			match(SETUP);
			setState(80);
			coin_selection();
			setState(81);
			coin_result();
			setState(82);
			first_decision();
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(83);
					drew_result();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					initial_play();
					}
					} 
				}
				setState(94);
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
			setState(95);
			id_player();
			setState(96);
			match(CHOOSE);
			setState(97);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(98);
			match(FOR);
			setState(99);
			match(THE);
			setState(100);
			match(OPENING);
			setState(101);
			match(COIN);
			setState(102);
			match(FLIP);
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
			setState(105);
			id_player();
			setState(106);
			match(WIN);
			setState(107);
			match(THE);
			setState(108);
			match(COIN);
			setState(109);
			match(TOSS);
			setState(110);
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
			setState(112);
			id_player();
			setState(113);
			match(DECIDE);
			setState(114);
			match(TO);
			setState(115);
			match(GO);
			setState(116);
			match(FIRST);
			setState(117);
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
			setState(119);
			id_player();
			setState(120);
			match(DRAW);
			setState(121);
			match(NUM);
			setState(122);
			match(CARD);
			setState(123);
			match(FOR);
			setState(124);
			match(THE);
			setState(125);
			match(OPENING);
			setState(126);
			match(HAND);
			setState(127);
			match(DOT);
			setState(128);
			match(DASH);
			setState(129);
			match(NUM);
			setState(130);
			match(DRAW);
			setState(131);
			match(CARD);
			setState(132);
			match(DOT);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(133);
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
			setState(136);
			match(BULLET);
			setState(137);
			match(ID_CARD);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(138);
				match(COMMA);
				setState(139);
				match(ID_CARD);
				}
				}
				setState(144);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				player_plays_active_spot();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
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
		public List<Player_playsContext> player_plays() {
			return getRuleContexts(Player_playsContext.class);
		}
		public Player_playsContext player_plays(int i) {
			return getRuleContext(Player_playsContext.class,i);
		}
		public Player_ends_turnContext player_ends_turn() {
			return getRuleContext(Player_ends_turnContext.class,0);
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
			setState(149);
			player_starts_turn();
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					player_plays();
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(156);
				player_ends_turn();
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
			setState(159);
			id_player();
			setState(160);
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
			setState(162);
			id_player();
			setState(163);
			match(END);
			setState(164);
			match(THEIR);
			setState(165);
			match(TURN);
			setState(166);
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
		public Player_discardedContext player_discarded() {
			return getRuleContext(Player_discardedContext.class,0);
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
		public Player_movedContext player_moved() {
			return getRuleContext(Player_movedContext.class,0);
		}
		public Fight_consequenceContext fight_consequence() {
			return getRuleContext(Fight_consequenceContext.class,0);
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				player_draw_card();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				player_played_card();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				player_plays_active_spot();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				player_plays_bench();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				player_attaches_card();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				player_shuffled();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				player_discarded();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				player_sub_draw();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				player_evolve();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(177);
				player_retreated();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(178);
				player_switch();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(179);
				player_used_ability();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(180);
				player_attack();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(181);
				player_moved();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(182);
				fight_consequence();
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
			setState(185);
			id_player();
			setState(186);
			match(DRAW);
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A:
				{
				setState(187);
				match(A);
				setState(188);
				match(CARD);
				}
				break;
			case ID_CARD:
				{
				setState(189);
				match(ID_CARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(192);
			match(DOT);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(193);
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
			setState(196);
			match(DASH);
			setState(197);
			id_player();
			setState(198);
			match(DRAW);
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_CARD:
				{
				setState(199);
				match(ID_CARD);
				}
				break;
			case NUM:
				{
				setState(200);
				match(NUM);
				setState(201);
				match(CARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(204);
			match(DOT);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(205);
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
			setState(208);
			match(DASH);
			setState(209);
			id_player();
			setState(210);
			match(SHUFFLE);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(211);
				match(NUM);
				setState(212);
				match(CARD);
				setState(213);
				match(INTO);
				}
			}

			setState(216);
			match(THEIR);
			setState(217);
			match(DECK);
			setState(218);
			match(DOT);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(219);
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
	public static class Player_discardedContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public Discard_one_cardContext discard_one_card() {
			return getRuleContext(Discard_one_cardContext.class,0);
		}
		public Discard_multiple_cardsContext discard_multiple_cards() {
			return getRuleContext(Discard_multiple_cardsContext.class,0);
		}
		public Player_discardedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_discarded; }
	}

	public final Player_discardedContext player_discarded() throws RecognitionException {
		Player_discardedContext _localctx = new Player_discardedContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_player_discarded);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(DASH);
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(223);
				discard_one_card();
				}
				break;
			case 2:
				{
				setState(224);
				discard_multiple_cards();
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
	public static class Discard_one_cardContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode DISCARD() { return getToken(PokemonLogParser.DISCARD, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Discard_one_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discard_one_card; }
	}

	public final Discard_one_cardContext discard_one_card() throws RecognitionException {
		Discard_one_cardContext _localctx = new Discard_one_cardContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_discard_one_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			id_player();
			setState(228);
			match(DISCARD);
			setState(229);
			match(ID_CARD);
			setState(230);
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
	public static class Discard_multiple_cardsContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode DISCARD() { return getToken(PokemonLogParser.DISCARD, 0); }
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public TerminalNode CARD() { return getToken(PokemonLogParser.CARD, 0); }
		public TerminalNode BE() { return getToken(PokemonLogParser.BE, 0); }
		public TerminalNode FROM() { return getToken(PokemonLogParser.FROM, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public Cards_listContext cards_list() {
			return getRuleContext(Cards_listContext.class,0);
		}
		public Discard_multiple_cardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discard_multiple_cards; }
	}

	public final Discard_multiple_cardsContext discard_multiple_cards() throws RecognitionException {
		Discard_multiple_cardsContext _localctx = new Discard_multiple_cardsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_discard_multiple_cards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_TOKEN:
				{
				setState(232);
				id_player();
				setState(233);
				match(DISCARD);
				setState(234);
				match(NUM);
				setState(235);
				match(CARD);
				}
				break;
			case NUM:
				{
				setState(237);
				match(NUM);
				setState(238);
				match(CARD);
				setState(239);
				match(BE);
				setState(240);
				match(DISCARD);
				setState(241);
				match(FROM);
				setState(242);
				id_player();
				setState(243);
				match(ID_CARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(247);
			match(DOT);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(248);
				cards_list();
				}
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
		enterRule(_localctx, 36, RULE_player_played_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			id_player();
			setState(252);
			match(PLAY);
			setState(253);
			match(ID_CARD);
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
	public static class Player_plays_active_spotContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode PLAY() { return getToken(PokemonLogParser.PLAY, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode ACTIVE_SPOT() { return getToken(PokemonLogParser.ACTIVE_SPOT, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public TerminalNode BE() { return getToken(PokemonLogParser.BE, 0); }
		public TerminalNode NOW() { return getToken(PokemonLogParser.NOW, 0); }
		public TerminalNode IN() { return getToken(PokemonLogParser.IN, 0); }
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public Player_plays_active_spotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_plays_active_spot; }
	}

	public final Player_plays_active_spotContext player_plays_active_spot() throws RecognitionException {
		Player_plays_active_spotContext _localctx = new Player_plays_active_spotContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_player_plays_active_spot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			id_player();
			setState(257);
			match(PLAY);
			setState(258);
			match(ID_CARD);
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BE:
				{
				setState(259);
				match(BE);
				setState(260);
				match(NOW);
				setState(261);
				match(IN);
				}
				break;
			case TO:
				{
				setState(262);
				match(TO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(265);
			match(THE);
			setState(266);
			match(ACTIVE_SPOT);
			setState(267);
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
		enterRule(_localctx, 40, RULE_player_plays_bench);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			id_player();
			setState(270);
			match(PLAY);
			setState(271);
			match(ID_CARD);
			setState(272);
			match(TO);
			setState(273);
			match(THE);
			setState(274);
			match(BENCH);
			setState(275);
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
		enterRule(_localctx, 42, RULE_player_attaches_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			id_player();
			setState(278);
			match(ATTACH);
			setState(279);
			match(ID_CARD);
			setState(280);
			match(TO);
			setState(281);
			match(ID_CARD);
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(282);
				match(ON);
				setState(283);
				match(THE);
				setState(284);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(285);
				match(IN);
				setState(286);
				match(THE);
				setState(287);
				match(ACTIVE_SPOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(290);
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
		enterRule(_localctx, 44, RULE_player_evolve);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			id_player();
			setState(293);
			match(EVOLVE);
			setState(294);
			match(ID_CARD);
			setState(295);
			match(TO);
			setState(296);
			match(ID_CARD);
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				{
				setState(297);
				match(IN);
				setState(298);
				match(THE);
				setState(299);
				match(ACTIVE_SPOT);
				}
				break;
			case ON:
				{
				setState(300);
				match(ON);
				setState(301);
				match(THE);
				setState(302);
				match(BENCH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(305);
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
		enterRule(_localctx, 46, RULE_player_retreated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			id_player();
			setState(308);
			match(RETREAT);
			setState(309);
			match(ID_CARD);
			setState(310);
			match(TO);
			setState(311);
			match(THE);
			setState(312);
			match(BENCH);
			setState(313);
			match(DOT);
			setState(314);
			match(DASH);
			setState(315);
			match(NUM);
			setState(316);
			match(CARD);
			setState(317);
			match(BE);
			setState(318);
			match(DISCARD);
			setState(319);
			match(FROM);
			setState(320);
			id_player();
			setState(321);
			match(ID_CARD);
			setState(322);
			match(DOT);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(323);
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
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
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
		public TerminalNode BE() { return getToken(PokemonLogParser.BE, 0); }
		public TerminalNode SWITCH_VERB() { return getToken(PokemonLogParser.SWITCH_VERB, 0); }
		public TerminalNode WITH() { return getToken(PokemonLogParser.WITH, 0); }
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public TerminalNode BECOME() { return getToken(PokemonLogParser.BECOME, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode ACTIVE() { return getToken(PokemonLogParser.ACTIVE, 0); }
		public TerminalNode POKEMON() { return getToken(PokemonLogParser.POKEMON, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Player_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_switch; }
	}

	public final Player_switchContext player_switch() throws RecognitionException {
		Player_switchContext _localctx = new Player_switchContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_player_switch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(DASH);
			setState(327);
			id_player();
			setState(328);
			match(ID_CARD);
			setState(329);
			match(BE);
			setState(330);
			match(SWITCH_VERB);
			setState(331);
			match(WITH);
			setState(332);
			id_player();
			setState(333);
			match(ID_CARD);
			setState(334);
			match(TO);
			setState(335);
			match(BECOME);
			setState(336);
			match(THE);
			setState(337);
			match(ACTIVE);
			setState(338);
			match(POKEMON);
			setState(339);
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
		enterRule(_localctx, 50, RULE_player_used_ability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			id_player();
			setState(342);
			match(ID_CARD);
			setState(343);
			match(USE);
			setState(344);
			match(ID_CARD);
			setState(345);
			match(DOT);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(346);
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
		public List<Fight_consequenceContext> fight_consequence() {
			return getRuleContexts(Fight_consequenceContext.class);
		}
		public Fight_consequenceContext fight_consequence(int i) {
			return getRuleContext(Fight_consequenceContext.class,i);
		}
		public Player_attackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_attack; }
	}

	public final Player_attackContext player_attack() throws RecognitionException {
		Player_attackContext _localctx = new Player_attackContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_player_attack);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			id_player();
			setState(350);
			match(ID_CARD);
			setState(351);
			match(USE);
			setState(352);
			match(ID_CARD);
			setState(353);
			match(ON);
			setState(354);
			id_player();
			setState(355);
			match(ID_CARD);
			setState(356);
			match(FOR);
			setState(357);
			match(NUM);
			setState(358);
			match(DAMAGE);
			setState(359);
			match(DOT);
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(360);
				damage_breakdown();
				}
				break;
			}
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(363);
					fight_consequence();
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	public static class Player_movedContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public List<Id_playerContext> id_player() {
			return getRuleContexts(Id_playerContext.class);
		}
		public Id_playerContext id_player(int i) {
			return getRuleContext(Id_playerContext.class,i);
		}
		public TerminalNode MOVE() { return getToken(PokemonLogParser.MOVE, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public TerminalNode THEIR() { return getToken(PokemonLogParser.THEIR, 0); }
		public TerminalNode HAND() { return getToken(PokemonLogParser.HAND, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Player_movedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_moved; }
	}

	public final Player_movedContext player_moved() throws RecognitionException {
		Player_movedContext _localctx = new Player_movedContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_player_moved);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(DASH);
			setState(370);
			id_player();
			setState(371);
			match(MOVE);
			setState(372);
			id_player();
			setState(373);
			match(ID_CARD);
			setState(374);
			match(TO);
			setState(375);
			match(THEIR);
			setState(376);
			match(HAND);
			setState(377);
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
	public static class Damage_breakdownContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public TerminalNode DAMAGE() { return getToken(PokemonLogParser.DAMAGE, 0); }
		public TerminalNode BREAKDOWN() { return getToken(PokemonLogParser.BREAKDOWN, 0); }
		public TerminalNode COLON() { return getToken(PokemonLogParser.COLON, 0); }
		public Base_damageContext base_damage() {
			return getRuleContext(Base_damageContext.class,0);
		}
		public Item_damageContext item_damage() {
			return getRuleContext(Item_damageContext.class,0);
		}
		public Total_damageContext total_damage() {
			return getRuleContext(Total_damageContext.class,0);
		}
		public Damage_breakdownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage_breakdown; }
	}

	public final Damage_breakdownContext damage_breakdown() throws RecognitionException {
		Damage_breakdownContext _localctx = new Damage_breakdownContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_damage_breakdown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(DASH);
			setState(380);
			match(DAMAGE);
			setState(381);
			match(BREAKDOWN);
			setState(382);
			match(COLON);
			setState(383);
			base_damage();
			setState(384);
			item_damage();
			setState(385);
			total_damage();
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
	public static class Base_damageContext extends ParserRuleContext {
		public TerminalNode BULLET() { return getToken(PokemonLogParser.BULLET, 0); }
		public TerminalNode BASE() { return getToken(PokemonLogParser.BASE, 0); }
		public List<TerminalNode> DAMAGE() { return getTokens(PokemonLogParser.DAMAGE); }
		public TerminalNode DAMAGE(int i) {
			return getToken(PokemonLogParser.DAMAGE, i);
		}
		public TerminalNode COLON() { return getToken(PokemonLogParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public Base_damageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_damage; }
	}

	public final Base_damageContext base_damage() throws RecognitionException {
		Base_damageContext _localctx = new Base_damageContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_base_damage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(BULLET);
			setState(388);
			match(BASE);
			setState(389);
			match(DAMAGE);
			setState(390);
			match(COLON);
			setState(391);
			match(NUM);
			setState(392);
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
	public static class Item_damageContext extends ParserRuleContext {
		public TerminalNode BULLET() { return getToken(PokemonLogParser.BULLET, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(PokemonLogParser.PAREN_IZQ, 0); }
		public TerminalNode ITEM() { return getToken(PokemonLogParser.ITEM, 0); }
		public TerminalNode PAREN_DER() { return getToken(PokemonLogParser.PAREN_DER, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public TerminalNode COLON() { return getToken(PokemonLogParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public TerminalNode DAMAGE() { return getToken(PokemonLogParser.DAMAGE, 0); }
		public Item_damageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_damage; }
	}

	public final Item_damageContext item_damage() throws RecognitionException {
		Item_damageContext _localctx = new Item_damageContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_item_damage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(BULLET);
			setState(395);
			match(PAREN_IZQ);
			setState(396);
			match(ITEM);
			setState(397);
			match(PAREN_DER);
			setState(398);
			match(ID_CARD);
			setState(399);
			match(COLON);
			setState(400);
			match(NUM);
			setState(401);
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
	public static class Total_damageContext extends ParserRuleContext {
		public TerminalNode BULLET() { return getToken(PokemonLogParser.BULLET, 0); }
		public TerminalNode TOTAL() { return getToken(PokemonLogParser.TOTAL, 0); }
		public List<TerminalNode> DAMAGE() { return getTokens(PokemonLogParser.DAMAGE); }
		public TerminalNode DAMAGE(int i) {
			return getToken(PokemonLogParser.DAMAGE, i);
		}
		public TerminalNode COLON() { return getToken(PokemonLogParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public Total_damageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_total_damage; }
	}

	public final Total_damageContext total_damage() throws RecognitionException {
		Total_damageContext _localctx = new Total_damageContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_total_damage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(BULLET);
			setState(404);
			match(TOTAL);
			setState(405);
			match(DAMAGE);
			setState(406);
			match(COLON);
			setState(407);
			match(NUM);
			setState(408);
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
	public static class Fight_consequenceContext extends ParserRuleContext {
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
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public TerminalNode CARD() { return getToken(PokemonLogParser.CARD, 0); }
		public TerminalNode DISCARD() { return getToken(PokemonLogParser.DISCARD, 0); }
		public TerminalNode FROM() { return getToken(PokemonLogParser.FROM, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Cards_listContext cards_list() {
			return getRuleContext(Cards_listContext.class,0);
		}
		public TerminalNode TAKE() { return getToken(PokemonLogParser.TAKE, 0); }
		public TerminalNode PRIZE() { return getToken(PokemonLogParser.PRIZE, 0); }
		public TerminalNode A() { return getToken(PokemonLogParser.A, 0); }
		public TerminalNode ADD() { return getToken(PokemonLogParser.ADD, 0); }
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public TerminalNode HAND() { return getToken(PokemonLogParser.HAND, 0); }
		public TerminalNode NOW() { return getToken(PokemonLogParser.NOW, 0); }
		public TerminalNode IN() { return getToken(PokemonLogParser.IN, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode ACTIVE_SPOT() { return getToken(PokemonLogParser.ACTIVE_SPOT, 0); }
		public Player_attaches_cardContext player_attaches_card() {
			return getRuleContext(Player_attaches_cardContext.class,0);
		}
		public TerminalNode DAMAGE() { return getToken(PokemonLogParser.DAMAGE, 0); }
		public Fight_consequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fight_consequence; }
	}

	public final Fight_consequenceContext fight_consequence() throws RecognitionException {
		Fight_consequenceContext _localctx = new Fight_consequenceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fight_consequence);
		int _la;
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				id_player();
				setState(411);
				match(ID_CARD);
				setState(412);
				match(BE);
				setState(413);
				match(KNOCK_OUT);
				setState(414);
				match(EXCLAMATION);
				setState(435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(415);
					match(DASH);
					setState(416);
					match(NUM);
					setState(417);
					match(CARD);
					setState(418);
					match(BE);
					setState(419);
					match(DISCARD);
					setState(420);
					match(FROM);
					setState(421);
					id_player();
					setState(422);
					match(ID_CARD);
					setState(423);
					match(DOT);
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BULLET) {
						{
						setState(424);
						cards_list();
						}
					}

					}
					break;
				case 2:
					{
					setState(427);
					match(ID_CARD);
					setState(428);
					match(BE);
					setState(429);
					match(DISCARD);
					setState(430);
					match(FROM);
					setState(431);
					id_player();
					setState(432);
					match(ID_CARD);
					setState(433);
					match(DOT);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				id_player();
				setState(438);
				match(TAKE);
				setState(439);
				_la = _input.LA(1);
				if ( !(_la==A || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(440);
				match(PRIZE);
				setState(441);
				match(CARD);
				setState(442);
				match(DOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case A:
					{
					setState(444);
					match(A);
					setState(445);
					match(CARD);
					}
					break;
				case ID_CARD:
					{
					setState(446);
					match(ID_CARD);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(449);
				match(BE);
				setState(450);
				match(ADD);
				setState(451);
				match(TO);
				setState(452);
				id_player();
				setState(453);
				match(HAND);
				setState(454);
				match(DOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				id_player();
				setState(457);
				match(ID_CARD);
				setState(458);
				match(BE);
				setState(459);
				match(NOW);
				setState(460);
				match(IN);
				setState(461);
				match(THE);
				setState(462);
				match(ACTIVE_SPOT);
				setState(463);
				match(DOT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(465);
				match(DASH);
				setState(466);
				player_attaches_card();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(467);
				match(DASH);
				setState(468);
				id_player();
				setState(469);
				match(ID_CARD);
				setState(470);
				match(TAKE);
				setState(471);
				match(NUM);
				setState(472);
				match(DAMAGE);
				setState(473);
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
		enterRule(_localctx, 66, RULE_player_won);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(ALL);
			setState(478);
			match(PRIZE);
			setState(479);
			match(CARD);
			setState(480);
			match(TAKE);
			setState(481);
			match(DOT);
			setState(482);
			id_player();
			setState(483);
			match(WIN);
			setState(484);
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
		enterRule(_localctx, 68, RULE_id_player);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
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
		"\u0004\u0001C\u01e9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0001\u0000\u0004\u0000I\b\u0000\u000b\u0000\f\u0000J\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001U\b\u0001\n\u0001\f\u0001X\t\u0001\u0001\u0001"+
		"\u0005\u0001[\b\u0001\n\u0001\f\u0001^\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0087\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u008d\b\u0006\n\u0006\f\u0006\u0090\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0094\b\u0007\u0001\b\u0001\b\u0005\b\u0098"+
		"\b\b\n\b\f\b\u009b\t\b\u0001\b\u0003\b\u009e\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00b8\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u00bf\b\f\u0001\f\u0001\f\u0003\f\u00c3\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00cb\b\r\u0001\r\u0001\r\u0003"+
		"\r\u00cf\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00d7\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00dd\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00e2\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00f6\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00fa\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0108\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0121\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0130\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0145\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u015c\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u016a\b\u001a"+
		"\u0001\u001a\u0005\u001a\u016d\b\u001a\n\u001a\f\u001a\u0170\t\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u01aa\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u01b4\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u01c0\b \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u01dc\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0000\u0000#\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BD\u0000\u0002\u0001\u0000\u0013\u0014\u0002\u0000\u000b"+
		"\u000bAA\u01f4\u0000F\u0001\u0000\u0000\u0000\u0002O\u0001\u0000\u0000"+
		"\u0000\u0004_\u0001\u0000\u0000\u0000\u0006i\u0001\u0000\u0000\u0000\b"+
		"p\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000\u0000\f\u0088\u0001\u0000"+
		"\u0000\u0000\u000e\u0093\u0001\u0000\u0000\u0000\u0010\u0095\u0001\u0000"+
		"\u0000\u0000\u0012\u009f\u0001\u0000\u0000\u0000\u0014\u00a2\u0001\u0000"+
		"\u0000\u0000\u0016\u00b7\u0001\u0000\u0000\u0000\u0018\u00b9\u0001\u0000"+
		"\u0000\u0000\u001a\u00c4\u0001\u0000\u0000\u0000\u001c\u00d0\u0001\u0000"+
		"\u0000\u0000\u001e\u00de\u0001\u0000\u0000\u0000 \u00e3\u0001\u0000\u0000"+
		"\u0000\"\u00f5\u0001\u0000\u0000\u0000$\u00fb\u0001\u0000\u0000\u0000"+
		"&\u0100\u0001\u0000\u0000\u0000(\u010d\u0001\u0000\u0000\u0000*\u0115"+
		"\u0001\u0000\u0000\u0000,\u0124\u0001\u0000\u0000\u0000.\u0133\u0001\u0000"+
		"\u0000\u00000\u0146\u0001\u0000\u0000\u00002\u0155\u0001\u0000\u0000\u0000"+
		"4\u015d\u0001\u0000\u0000\u00006\u0171\u0001\u0000\u0000\u00008\u017b"+
		"\u0001\u0000\u0000\u0000:\u0183\u0001\u0000\u0000\u0000<\u018a\u0001\u0000"+
		"\u0000\u0000>\u0193\u0001\u0000\u0000\u0000@\u01db\u0001\u0000\u0000\u0000"+
		"B\u01dd\u0001\u0000\u0000\u0000D\u01e6\u0001\u0000\u0000\u0000FH\u0003"+
		"\u0002\u0001\u0000GI\u0003\u0010\b\u0000HG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LM\u0003B!\u0000MN\u0005\u0000\u0000\u0001N"+
		"\u0001\u0001\u0000\u0000\u0000OP\u0005\u0001\u0000\u0000PQ\u0003\u0004"+
		"\u0002\u0000QR\u0003\u0006\u0003\u0000RV\u0003\b\u0004\u0000SU\u0003\n"+
		"\u0005\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\\\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000Y[\u0003\u000e\u0007\u0000ZY\u0001\u0000\u0000"+
		"\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]\u0003\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"_`\u0003D\"\u0000`a\u0005&\u0000\u0000ab\u0007\u0000\u0000\u0000bc\u0005"+
		"\u0007\u0000\u0000cd\u0005\b\u0000\u0000de\u0005\u0015\u0000\u0000ef\u0005"+
		"\u0016\u0000\u0000fg\u0005\u0017\u0000\u0000gh\u00059\u0000\u0000h\u0005"+
		"\u0001\u0000\u0000\u0000ij\u0003D\"\u0000jk\u0005(\u0000\u0000kl\u0005"+
		"\b\u0000\u0000lm\u0005\u0016\u0000\u0000mn\u0005\u0019\u0000\u0000no\u0005"+
		"9\u0000\u0000o\u0007\u0001\u0000\u0000\u0000pq\u0003D\"\u0000qr\u0005"+
		"\'\u0000\u0000rs\u0005\t\u0000\u0000st\u0005%\u0000\u0000tu\u0005\u0018"+
		"\u0000\u0000uv\u00059\u0000\u0000v\t\u0001\u0000\u0000\u0000wx\u0003D"+
		"\"\u0000xy\u0005*\u0000\u0000yz\u0005A\u0000\u0000z{\u0005\u001a\u0000"+
		"\u0000{|\u0005\u0007\u0000\u0000|}\u0005\b\u0000\u0000}~\u0005\u0015\u0000"+
		"\u0000~\u007f\u0005\u001b\u0000\u0000\u007f\u0080\u00059\u0000\u0000\u0080"+
		"\u0081\u0005:\u0000\u0000\u0081\u0082\u0005A\u0000\u0000\u0082\u0083\u0005"+
		"*\u0000\u0000\u0083\u0084\u0005\u001a\u0000\u0000\u0084\u0086\u00059\u0000"+
		"\u0000\u0085\u0087\u0003\f\u0006\u0000\u0086\u0085\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u000b\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0005<\u0000\u0000\u0089\u008e\u00058\u0000\u0000\u008a\u008b"+
		"\u0005;\u0000\u0000\u008b\u008d\u00058\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\r\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0094\u0003&\u0013\u0000"+
		"\u0092\u0094\u0003(\u0014\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u000f\u0001\u0000\u0000\u0000\u0095"+
		"\u0099\u0003\u0012\t\u0000\u0096\u0098\u0003\u0016\u000b\u0000\u0097\u0096"+
		"\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009d"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009e"+
		"\u0003\u0014\n\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u0011\u0001\u0000\u0000\u0000\u009f\u00a0\u0003"+
		"D\"\u0000\u00a0\u00a1\u0005\u0006\u0000\u0000\u00a1\u0013\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0003D\"\u0000\u00a3\u00a4\u00057\u0000\u0000"+
		"\u00a4\u00a5\u0005\r\u0000\u0000\u00a5\u00a6\u0005\u0006\u0000\u0000\u00a6"+
		"\u00a7\u00059\u0000\u0000\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8\u00b8"+
		"\u0003\u0018\f\u0000\u00a9\u00b8\u0003$\u0012\u0000\u00aa\u00b8\u0003"+
		"&\u0013\u0000\u00ab\u00b8\u0003(\u0014\u0000\u00ac\u00b8\u0003*\u0015"+
		"\u0000\u00ad\u00b8\u0003\u001c\u000e\u0000\u00ae\u00b8\u0003\u001e\u000f"+
		"\u0000\u00af\u00b8\u0003\u001a\r\u0000\u00b0\u00b8\u0003,\u0016\u0000"+
		"\u00b1\u00b8\u0003.\u0017\u0000\u00b2\u00b8\u00030\u0018\u0000\u00b3\u00b8"+
		"\u00032\u0019\u0000\u00b4\u00b8\u00034\u001a\u0000\u00b5\u00b8\u00036"+
		"\u001b\u0000\u00b6\u00b8\u0003@ \u0000\u00b7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00b7\u00a9\u0001\u0000\u0000\u0000\u00b7\u00aa\u0001\u0000\u0000\u0000"+
		"\u00b7\u00ab\u0001\u0000\u0000\u0000\u00b7\u00ac\u0001\u0000\u0000\u0000"+
		"\u00b7\u00ad\u0001\u0000\u0000\u0000\u00b7\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b7\u00af\u0001\u0000\u0000\u0000\u00b7\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b1\u0001\u0000\u0000\u0000\u00b7\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b7\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b8\u0017\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003D\"\u0000\u00ba"+
		"\u00be\u0005*\u0000\u0000\u00bb\u00bc\u0005\u000b\u0000\u0000\u00bc\u00bf"+
		"\u0005\u001a\u0000\u0000\u00bd\u00bf\u00058\u0000\u0000\u00be\u00bb\u0001"+
		"\u0000\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c2\u00059\u0000\u0000\u00c1\u00c3\u0003\f"+
		"\u0006\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u0019\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005:\u0000"+
		"\u0000\u00c5\u00c6\u0003D\"\u0000\u00c6\u00ca\u0005*\u0000\u0000\u00c7"+
		"\u00cb\u00058\u0000\u0000\u00c8\u00c9\u0005A\u0000\u0000\u00c9\u00cb\u0005"+
		"\u001a\u0000\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005"+
		"9\u0000\u0000\u00cd\u00cf\u0003\f\u0006\u0000\u00ce\u00cd\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u001b\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0005:\u0000\u0000\u00d1\u00d2\u0003D\"\u0000"+
		"\u00d2\u00d6\u00052\u0000\u0000\u00d3\u00d4\u0005A\u0000\u0000\u00d4\u00d5"+
		"\u0005\u001a\u0000\u0000\u00d5\u00d7\u0005\u000f\u0000\u0000\u00d6\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\r\u0000\u0000\u00d9\u00da\u0005"+
		"\u000e\u0000\u0000\u00da\u00dc\u00059\u0000\u0000\u00db\u00dd\u0003\f"+
		"\u0006\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u001d\u0001\u0000\u0000\u0000\u00de\u00e1\u0005:\u0000"+
		"\u0000\u00df\u00e2\u0003 \u0010\u0000\u00e0\u00e2\u0003\"\u0011\u0000"+
		"\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e2\u001f\u0001\u0000\u0000\u0000\u00e3\u00e4\u0003D\"\u0000\u00e4"+
		"\u00e5\u00053\u0000\u0000\u00e5\u00e6\u00058\u0000\u0000\u00e6\u00e7\u0005"+
		"9\u0000\u0000\u00e7!\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003D\"\u0000"+
		"\u00e9\u00ea\u00053\u0000\u0000\u00ea\u00eb\u0005A\u0000\u0000\u00eb\u00ec"+
		"\u0005\u001a\u0000\u0000\u00ec\u00f6\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0005A\u0000\u0000\u00ee\u00ef\u0005\u001a\u0000\u0000\u00ef\u00f0\u0005"+
		"$\u0000\u0000\u00f0\u00f1\u00053\u0000\u0000\u00f1\u00f2\u0005#\u0000"+
		"\u0000\u00f2\u00f3\u0003D\"\u0000\u00f3\u00f4\u00058\u0000\u0000\u00f4"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f5\u00e8\u0001\u0000\u0000\u0000\u00f5"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f9\u00059\u0000\u0000\u00f8\u00fa\u0003\f\u0006\u0000\u00f9\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa#\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0003D\"\u0000\u00fc\u00fd\u0005,\u0000"+
		"\u0000\u00fd\u00fe\u00058\u0000\u0000\u00fe\u00ff\u00059\u0000\u0000\u00ff"+
		"%\u0001\u0000\u0000\u0000\u0100\u0101\u0003D\"\u0000\u0101\u0102\u0005"+
		",\u0000\u0000\u0102\u0107\u00058\u0000\u0000\u0103\u0104\u0005$\u0000"+
		"\u0000\u0104\u0105\u0005\u0010\u0000\u0000\u0105\u0108\u0005\n\u0000\u0000"+
		"\u0106\u0108\u0005\t\u0000\u0000\u0107\u0103\u0001\u0000\u0000\u0000\u0107"+
		"\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0005\b\u0000\u0000\u010a\u010b\u0005\u0002\u0000\u0000\u010b\u010c"+
		"\u00059\u0000\u0000\u010c\'\u0001\u0000\u0000\u0000\u010d\u010e\u0003"+
		"D\"\u0000\u010e\u010f\u0005,\u0000\u0000\u010f\u0110\u00058\u0000\u0000"+
		"\u0110\u0111\u0005\t\u0000\u0000\u0111\u0112\u0005\b\u0000\u0000\u0112"+
		"\u0113\u0005\u0003\u0000\u0000\u0113\u0114\u00059\u0000\u0000\u0114)\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0003D\"\u0000\u0116\u0117\u0005-\u0000"+
		"\u0000\u0117\u0118\u00058\u0000\u0000\u0118\u0119\u0005\t\u0000\u0000"+
		"\u0119\u0120\u00058\u0000\u0000\u011a\u011b\u0005\f\u0000\u0000\u011b"+
		"\u011c\u0005\b\u0000\u0000\u011c\u0121\u0005\u0003\u0000\u0000\u011d\u011e"+
		"\u0005\n\u0000\u0000\u011e\u011f\u0005\b\u0000\u0000\u011f\u0121\u0005"+
		"\u0002\u0000\u0000\u0120\u011a\u0001\u0000\u0000\u0000\u0120\u011d\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0005"+
		"9\u0000\u0000\u0123+\u0001\u0000\u0000\u0000\u0124\u0125\u0003D\"\u0000"+
		"\u0125\u0126\u0005.\u0000\u0000\u0126\u0127\u00058\u0000\u0000\u0127\u0128"+
		"\u0005\t\u0000\u0000\u0128\u012f\u00058\u0000\u0000\u0129\u012a\u0005"+
		"\n\u0000\u0000\u012a\u012b\u0005\b\u0000\u0000\u012b\u0130\u0005\u0002"+
		"\u0000\u0000\u012c\u012d\u0005\f\u0000\u0000\u012d\u012e\u0005\b\u0000"+
		"\u0000\u012e\u0130\u0005\u0003\u0000\u0000\u012f\u0129\u0001\u0000\u0000"+
		"\u0000\u012f\u012c\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u00059\u0000\u0000\u0132-\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0003D\"\u0000\u0134\u0135\u00050\u0000\u0000\u0135\u0136\u0005"+
		"8\u0000\u0000\u0136\u0137\u0005\t\u0000\u0000\u0137\u0138\u0005\b\u0000"+
		"\u0000\u0138\u0139\u0005\u0003\u0000\u0000\u0139\u013a\u00059\u0000\u0000"+
		"\u013a\u013b\u0005:\u0000\u0000\u013b\u013c\u0005A\u0000\u0000\u013c\u013d"+
		"\u0005\u001a\u0000\u0000\u013d\u013e\u0005$\u0000\u0000\u013e\u013f\u0005"+
		"3\u0000\u0000\u013f\u0140\u0005#\u0000\u0000\u0140\u0141\u0003D\"\u0000"+
		"\u0141\u0142\u00058\u0000\u0000\u0142\u0144\u00059\u0000\u0000\u0143\u0145"+
		"\u0003\f\u0006\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0144\u0145\u0001"+
		"\u0000\u0000\u0000\u0145/\u0001\u0000\u0000\u0000\u0146\u0147\u0005:\u0000"+
		"\u0000\u0147\u0148\u0003D\"\u0000\u0148\u0149\u00058\u0000\u0000\u0149"+
		"\u014a\u0005$\u0000\u0000\u014a\u014b\u00054\u0000\u0000\u014b\u014c\u0005"+
		"\u0011\u0000\u0000\u014c\u014d\u0003D\"\u0000\u014d\u014e\u00058\u0000"+
		"\u0000\u014e\u014f\u0005\t\u0000\u0000\u014f\u0150\u0005\u0012\u0000\u0000"+
		"\u0150\u0151\u0005\b\u0000\u0000\u0151\u0152\u0005\u0004\u0000\u0000\u0152"+
		"\u0153\u0005\u0005\u0000\u0000\u0153\u0154\u00059\u0000\u0000\u01541\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0003D\"\u0000\u0156\u0157\u00058\u0000"+
		"\u0000\u0157\u0158\u0005/\u0000\u0000\u0158\u0159\u00058\u0000\u0000\u0159"+
		"\u015b\u00059\u0000\u0000\u015a\u015c\u0003\f\u0006\u0000\u015b\u015a"+
		"\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c3\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0003D\"\u0000\u015e\u015f\u00058\u0000"+
		"\u0000\u015f\u0160\u0005/\u0000\u0000\u0160\u0161\u00058\u0000\u0000\u0161"+
		"\u0162\u0005\f\u0000\u0000\u0162\u0163\u0003D\"\u0000\u0163\u0164\u0005"+
		"8\u0000\u0000\u0164\u0165\u0005\u0007\u0000\u0000\u0165\u0166\u0005A\u0000"+
		"\u0000\u0166\u0167\u0005\u001c\u0000\u0000\u0167\u0169\u00059\u0000\u0000"+
		"\u0168\u016a\u00038\u001c\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0001\u0000\u0000\u0000\u016a\u016e\u0001\u0000\u0000\u0000\u016b"+
		"\u016d\u0003@ \u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016d\u0170\u0001"+
		"\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001"+
		"\u0000\u0000\u0000\u016f5\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0005:\u0000\u0000\u0172\u0173\u0003D\"\u0000"+
		"\u0173\u0174\u00051\u0000\u0000\u0174\u0175\u0003D\"\u0000\u0175\u0176"+
		"\u00058\u0000\u0000\u0176\u0177\u0005\t\u0000\u0000\u0177\u0178\u0005"+
		"\r\u0000\u0000\u0178\u0179\u0005\u001b\u0000\u0000\u0179\u017a\u00059"+
		"\u0000\u0000\u017a7\u0001\u0000\u0000\u0000\u017b\u017c\u0005:\u0000\u0000"+
		"\u017c\u017d\u0005\u001c\u0000\u0000\u017d\u017e\u0005\u001f\u0000\u0000"+
		"\u017e\u017f\u0005>\u0000\u0000\u017f\u0180\u0003:\u001d\u0000\u0180\u0181"+
		"\u0003<\u001e\u0000\u0181\u0182\u0003>\u001f\u0000\u01829\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0005<\u0000\u0000\u0184\u0185\u0005 \u0000\u0000"+
		"\u0185\u0186\u0005\u001c\u0000\u0000\u0186\u0187\u0005>\u0000\u0000\u0187"+
		"\u0188\u0005A\u0000\u0000\u0188\u0189\u0005\u001c\u0000\u0000\u0189;\u0001"+
		"\u0000\u0000\u0000\u018a\u018b\u0005<\u0000\u0000\u018b\u018c\u0005?\u0000"+
		"\u0000\u018c\u018d\u0005\"\u0000\u0000\u018d\u018e\u0005@\u0000\u0000"+
		"\u018e\u018f\u00058\u0000\u0000\u018f\u0190\u0005>\u0000\u0000\u0190\u0191"+
		"\u0005A\u0000\u0000\u0191\u0192\u0005\u001c\u0000\u0000\u0192=\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0005<\u0000\u0000\u0194\u0195\u0005!\u0000\u0000"+
		"\u0195\u0196\u0005\u001c\u0000\u0000\u0196\u0197\u0005>\u0000\u0000\u0197"+
		"\u0198\u0005A\u0000\u0000\u0198\u0199\u0005\u001c\u0000\u0000\u0199?\u0001"+
		"\u0000\u0000\u0000\u019a\u019b\u0003D\"\u0000\u019b\u019c\u00058\u0000"+
		"\u0000\u019c\u019d\u0005$\u0000\u0000\u019d\u019e\u00055\u0000\u0000\u019e"+
		"\u01b3\u0005=\u0000\u0000\u019f\u01a0\u0005:\u0000\u0000\u01a0\u01a1\u0005"+
		"A\u0000\u0000\u01a1\u01a2\u0005\u001a\u0000\u0000\u01a2\u01a3\u0005$\u0000"+
		"\u0000\u01a3\u01a4\u00053\u0000\u0000\u01a4\u01a5\u0005#\u0000\u0000\u01a5"+
		"\u01a6\u0003D\"\u0000\u01a6\u01a7\u00058\u0000\u0000\u01a7\u01a9\u0005"+
		"9\u0000\u0000\u01a8\u01aa\u0003\f\u0006\u0000\u01a9\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01b4\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u00058\u0000\u0000\u01ac\u01ad\u0005$\u0000\u0000"+
		"\u01ad\u01ae\u00053\u0000\u0000\u01ae\u01af\u0005#\u0000\u0000\u01af\u01b0"+
		"\u0003D\"\u0000\u01b0\u01b1\u00058\u0000\u0000\u01b1\u01b2\u00059\u0000"+
		"\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3\u019f\u0001\u0000\u0000"+
		"\u0000\u01b3\u01ab\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b4\u01dc\u0001\u0000\u0000\u0000\u01b5\u01b6\u0003D\"\u0000"+
		"\u01b6\u01b7\u00056\u0000\u0000\u01b7\u01b8\u0007\u0001\u0000\u0000\u01b8"+
		"\u01b9\u0005\u001d\u0000\u0000\u01b9\u01ba\u0005\u001a\u0000\u0000\u01ba"+
		"\u01bb\u00059\u0000\u0000\u01bb\u01dc\u0001\u0000\u0000\u0000\u01bc\u01bd"+
		"\u0005\u000b\u0000\u0000\u01bd\u01c0\u0005\u001a\u0000\u0000\u01be\u01c0"+
		"\u00058\u0000\u0000\u01bf\u01bc\u0001\u0000\u0000\u0000\u01bf\u01be\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005"+
		"$\u0000\u0000\u01c2\u01c3\u0005+\u0000\u0000\u01c3\u01c4\u0005\t\u0000"+
		"\u0000\u01c4\u01c5\u0003D\"\u0000\u01c5\u01c6\u0005\u001b\u0000\u0000"+
		"\u01c6\u01c7\u00059\u0000\u0000\u01c7\u01dc\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c9\u0003D\"\u0000\u01c9\u01ca\u00058\u0000\u0000\u01ca\u01cb\u0005"+
		"$\u0000\u0000\u01cb\u01cc\u0005\u0010\u0000\u0000\u01cc\u01cd\u0005\n"+
		"\u0000\u0000\u01cd\u01ce\u0005\b\u0000\u0000\u01ce\u01cf\u0005\u0002\u0000"+
		"\u0000\u01cf\u01d0\u00059\u0000\u0000\u01d0\u01dc\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0005:\u0000\u0000\u01d2\u01dc\u0003*\u0015\u0000\u01d3\u01d4"+
		"\u0005:\u0000\u0000\u01d4\u01d5\u0003D\"\u0000\u01d5\u01d6\u00058\u0000"+
		"\u0000\u01d6\u01d7\u00056\u0000\u0000\u01d7\u01d8\u0005A\u0000\u0000\u01d8"+
		"\u01d9\u0005\u001c\u0000\u0000\u01d9\u01da\u00059\u0000\u0000\u01da\u01dc"+
		"\u0001\u0000\u0000\u0000\u01db\u019a\u0001\u0000\u0000\u0000\u01db\u01b5"+
		"\u0001\u0000\u0000\u0000\u01db\u01bf\u0001\u0000\u0000\u0000\u01db\u01c8"+
		"\u0001\u0000\u0000\u0000\u01db\u01d1\u0001\u0000\u0000\u0000\u01db\u01d3"+
		"\u0001\u0000\u0000\u0000\u01dcA\u0001\u0000\u0000\u0000\u01dd\u01de\u0005"+
		"\u001e\u0000\u0000\u01de\u01df\u0005\u001d\u0000\u0000\u01df\u01e0\u0005"+
		"\u001a\u0000\u0000\u01e0\u01e1\u00056\u0000\u0000\u01e1\u01e2\u00059\u0000"+
		"\u0000\u01e2\u01e3\u0003D\"\u0000\u01e3\u01e4\u0005(\u0000\u0000\u01e4"+
		"\u01e5\u00059\u0000\u0000\u01e5C\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005"+
		"B\u0000\u0000\u01e7E\u0001\u0000\u0000\u0000\u001dJV\\\u0086\u008e\u0093"+
		"\u0099\u009d\u00b7\u00be\u00c2\u00ca\u00ce\u00d6\u00dc\u00e1\u00f5\u00f9"+
		"\u0107\u0120\u012f\u0144\u015b\u0169\u016e\u01a9\u01b3\u01bf\u01db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}