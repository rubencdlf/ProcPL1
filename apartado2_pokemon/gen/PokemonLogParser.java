// Generated from PokemonLog.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PokemonLogParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SETUP=1, ACTIVE_SPOT=2, BENCH=3, STADIUM_SPOT=4, ACTIVE=5, POKEMON=6, 
		TURN=7, CHECKUP=8, FOR=9, THE=10, TO=11, IN=12, OF=13, AN=14, A=15, ON=16, 
		AND=17, IT=18, THEM=19, THEIR=20, DECK=21, INTO=22, NOW=23, WITH=24, BECOME=25, 
		HEADS=26, TAILS=27, OPENING=28, COIN=29, FLIP=30, FIRST=31, SECOND=32, 
		TOSS=33, CARD=34, HAND=35, DAMAGE=36, PRIZE=37, ALL=38, BREAKDOWN=39, 
		BASE=40, TOTAL=41, ITEM=42, FROM=43, MULLIGAN=44, REVEALED=45, MORE_WORD=46, 
		LESS=47, BECAUSE=48, AT=49, LEAST=50, WEAKNESS=51, RESISTANCE=52, OPPONENT=53, 
		YOU=54, INACTIVE=55, TOO=56, LONG=57, NO=58, BENCHED=59, DID_NOT=60, ACTION=61, 
		TIME=62, TERA=63, EFFECT=64, PREVENTED=65, COUNTER=66, SPECIAL=67, CONDITION=68, 
		POISONED=69, BOTTOM=70, BE=71, GO=72, CHOOSE=73, DECIDE=74, WIN=75, CONCEDE=76, 
		DRAW=77, ADD=78, PLAY=79, ATTACH=80, EVOLVE=81, USE=82, RETREAT=83, MOVE=84, 
		PUT=85, PLACE=86, SHUFFLE=87, DISCARD=88, SWITCH_VERB=89, KNOCK_OUT=90, 
		TAKE=91, END=92, HEAL=93, ID_CARD=94, DOT=95, DASH=96, COMMA=97, BULLET=98, 
		EXCLAMATION=99, COLON=100, PAREN_IZQ=101, PAREN_DER=102, POSSESSIVE=103, 
		NUM=104, ID_TOKEN=105, WS=106;
	public static final int
		RULE_start_game = 0, RULE_setup_block = 1, RULE_coin_selection = 2, RULE_coin_result = 3, 
		RULE_first_decision = 4, RULE_drew_result = 5, RULE_mulligan_block = 6, 
		RULE_cards_list = 7, RULE_initial_play = 8, RULE_players_turns = 9, RULE_player_starts_turn = 10, 
		RULE_player_ends_turn = 11, RULE_pokemon_checkup = 12, RULE_player_plays = 13, 
		RULE_player_draw_card = 14, RULE_player_sub_draw = 15, RULE_player_shuffled = 16, 
		RULE_player_discarded = 17, RULE_discard_one_card = 18, RULE_discard_multiple_cards = 19, 
		RULE_player_played_card = 20, RULE_player_plays_active_spot = 21, RULE_player_plays_bench = 22, 
		RULE_player_plays_stadium = 23, RULE_player_attaches_card = 24, RULE_player_evolve = 25, 
		RULE_player_retreated = 26, RULE_player_switch = 27, RULE_tera_effect = 28, 
		RULE_player_used_ability = 29, RULE_player_attack = 30, RULE_weakness_sentence = 31, 
		RULE_player_moved = 32, RULE_player_redeemable = 33, RULE_player_inactive = 34, 
		RULE_damage_breakdown = 35, RULE_damage_item = 36, RULE_fight_consequence = 37, 
		RULE_player_won = 38, RULE_id_player = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_game", "setup_block", "coin_selection", "coin_result", "first_decision", 
			"drew_result", "mulligan_block", "cards_list", "initial_play", "players_turns", 
			"player_starts_turn", "player_ends_turn", "pokemon_checkup", "player_plays", 
			"player_draw_card", "player_sub_draw", "player_shuffled", "player_discarded", 
			"discard_one_card", "discard_multiple_cards", "player_played_card", "player_plays_active_spot", 
			"player_plays_bench", "player_plays_stadium", "player_attaches_card", 
			"player_evolve", "player_retreated", "player_switch", "tera_effect", 
			"player_used_ability", "player_attack", "weakness_sentence", "player_moved", 
			"player_redeemable", "player_inactive", "damage_breakdown", "damage_item", 
			"fight_consequence", "player_won", "id_player"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Setup'", "'Active Spot'", "'Bench'", "'Stadium spot'", "'Active'", 
			null, null, "'Checkup'", "'for'", "'the'", "'to'", "'in'", "'of'", "'an'", 
			null, "'on'", "'and'", "'it'", "'them'", "'their'", "'deck'", "'into'", 
			"'now'", "'with'", "'become'", "'heads'", "'tails'", "'opening'", "'coin'", 
			"'flip'", "'first'", "'second'", "'toss'", null, "'hand'", null, "'Prize'", 
			"'All'", "'breakdown'", "'Base'", "'Total'", "'Item'", "'from'", null, 
			null, "'more'", "'less'", "'because'", "'at'", "'least'", "'Weakness'", 
			"'Resistance'", "'Opponent'", "'You'", "'inactive'", "'too'", "'long'", 
			"'no'", "'Benched'", "'didn't'", "'action'", "'time'", "'Tera'", "'effect'", 
			"'prevented'", null, "'Special'", "'Condition'", "'Poisoned'", "'bottom'", 
			null, "'go'", "'chose'", "'decided'", null, "'conceded'", null, "'added'", 
			"'played'", "'attached'", "'evolved'", "'used'", "'retreated'", "'moved'", 
			"'put'", "'placed'", "'shuffled'", "'discarded'", "'switched'", "'Knocked Out'", 
			null, "'ended'", "'healed'", null, "'.'", "'-'", "','", null, "'!'", 
			"':'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SETUP", "ACTIVE_SPOT", "BENCH", "STADIUM_SPOT", "ACTIVE", "POKEMON", 
			"TURN", "CHECKUP", "FOR", "THE", "TO", "IN", "OF", "AN", "A", "ON", "AND", 
			"IT", "THEM", "THEIR", "DECK", "INTO", "NOW", "WITH", "BECOME", "HEADS", 
			"TAILS", "OPENING", "COIN", "FLIP", "FIRST", "SECOND", "TOSS", "CARD", 
			"HAND", "DAMAGE", "PRIZE", "ALL", "BREAKDOWN", "BASE", "TOTAL", "ITEM", 
			"FROM", "MULLIGAN", "REVEALED", "MORE_WORD", "LESS", "BECAUSE", "AT", 
			"LEAST", "WEAKNESS", "RESISTANCE", "OPPONENT", "YOU", "INACTIVE", "TOO", 
			"LONG", "NO", "BENCHED", "DID_NOT", "ACTION", "TIME", "TERA", "EFFECT", 
			"PREVENTED", "COUNTER", "SPECIAL", "CONDITION", "POISONED", "BOTTOM", 
			"BE", "GO", "CHOOSE", "DECIDE", "WIN", "CONCEDE", "DRAW", "ADD", "PLAY", 
			"ATTACH", "EVOLVE", "USE", "RETREAT", "MOVE", "PUT", "PLACE", "SHUFFLE", 
			"DISCARD", "SWITCH_VERB", "KNOCK_OUT", "TAKE", "END", "HEAL", "ID_CARD", 
			"DOT", "DASH", "COMMA", "BULLET", "EXCLAMATION", "COLON", "PAREN_IZQ", 
			"PAREN_DER", "POSSESSIVE", "NUM", "ID_TOKEN", "WS"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterStart_game(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitStart_game(this);
		}
	}

	public final Start_gameContext start_game() throws RecognitionException {
		Start_gameContext _localctx = new Start_gameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_game);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			setup_block();
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				players_turns();
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID_TOKEN );
			setState(86);
			player_won();
			setState(87);
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
		public List<Mulligan_blockContext> mulligan_block() {
			return getRuleContexts(Mulligan_blockContext.class);
		}
		public Mulligan_blockContext mulligan_block(int i) {
			return getRuleContext(Mulligan_blockContext.class,i);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterSetup_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitSetup_block(this);
		}
	}

	public final Setup_blockContext setup_block() throws RecognitionException {
		Setup_blockContext _localctx = new Setup_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setup_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(SETUP);
			setState(90);
			coin_selection();
			setState(91);
			coin_result();
			setState(92);
			first_decision();
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					drew_result();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					mulligan_block();
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
					initial_play();
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterCoin_selection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitCoin_selection(this);
		}
	}

	public final Coin_selectionContext coin_selection() throws RecognitionException {
		Coin_selectionContext _localctx = new Coin_selectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_coin_selection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			id_player();
			setState(112);
			match(CHOOSE);
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(114);
			match(FOR);
			setState(115);
			match(THE);
			setState(116);
			match(OPENING);
			setState(117);
			match(COIN);
			setState(118);
			match(FLIP);
			setState(119);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterCoin_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitCoin_result(this);
		}
	}

	public final Coin_resultContext coin_result() throws RecognitionException {
		Coin_resultContext _localctx = new Coin_resultContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_coin_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			id_player();
			setState(122);
			match(WIN);
			setState(123);
			match(THE);
			setState(124);
			match(COIN);
			setState(125);
			match(TOSS);
			setState(126);
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
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public TerminalNode FIRST() { return getToken(PokemonLogParser.FIRST, 0); }
		public TerminalNode SECOND() { return getToken(PokemonLogParser.SECOND, 0); }
		public First_decisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_decision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterFirst_decision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitFirst_decision(this);
		}
	}

	public final First_decisionContext first_decision() throws RecognitionException {
		First_decisionContext _localctx = new First_decisionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_first_decision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			id_player();
			setState(129);
			match(DECIDE);
			setState(130);
			match(TO);
			setState(131);
			match(GO);
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==SECOND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterDrew_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitDrew_result(this);
		}
	}

	public final Drew_resultContext drew_result() throws RecognitionException {
		Drew_resultContext _localctx = new Drew_resultContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_drew_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			id_player();
			setState(136);
			match(DRAW);
			setState(137);
			match(NUM);
			setState(138);
			match(CARD);
			setState(139);
			match(FOR);
			setState(140);
			match(THE);
			setState(141);
			match(OPENING);
			setState(142);
			match(HAND);
			setState(143);
			match(DOT);
			setState(144);
			match(DASH);
			setState(145);
			match(NUM);
			setState(146);
			match(DRAW);
			setState(147);
			match(CARD);
			setState(148);
			match(DOT);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH || _la==BULLET) {
				{
				setState(149);
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
	public static class Mulligan_blockContext extends ParserRuleContext {
		public List<Id_playerContext> id_player() {
			return getRuleContexts(Id_playerContext.class);
		}
		public Id_playerContext id_player(int i) {
			return getRuleContext(Id_playerContext.class,i);
		}
		public List<TerminalNode> TAKE() { return getTokens(PokemonLogParser.TAKE); }
		public TerminalNode TAKE(int i) {
			return getToken(PokemonLogParser.TAKE, i);
		}
		public List<TerminalNode> MULLIGAN() { return getTokens(PokemonLogParser.MULLIGAN); }
		public TerminalNode MULLIGAN(int i) {
			return getToken(PokemonLogParser.MULLIGAN, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PokemonLogParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PokemonLogParser.DOT, i);
		}
		public TerminalNode DRAW() { return getToken(PokemonLogParser.DRAW, 0); }
		public List<TerminalNode> NUM() { return getTokens(PokemonLogParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(PokemonLogParser.NUM, i);
		}
		public TerminalNode MORE_WORD() { return getToken(PokemonLogParser.MORE_WORD, 0); }
		public List<TerminalNode> CARD() { return getTokens(PokemonLogParser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(PokemonLogParser.CARD, i);
		}
		public TerminalNode BECAUSE() { return getToken(PokemonLogParser.BECAUSE, 0); }
		public TerminalNode AT() { return getToken(PokemonLogParser.AT, 0); }
		public TerminalNode LEAST() { return getToken(PokemonLogParser.LEAST, 0); }
		public List<Player_sub_drawContext> player_sub_draw() {
			return getRuleContexts(Player_sub_drawContext.class);
		}
		public Player_sub_drawContext player_sub_draw(int i) {
			return getRuleContext(Player_sub_drawContext.class,i);
		}
		public List<TerminalNode> A() { return getTokens(PokemonLogParser.A); }
		public TerminalNode A(int i) {
			return getToken(PokemonLogParser.A, i);
		}
		public List<TerminalNode> DASH() { return getTokens(PokemonLogParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(PokemonLogParser.DASH, i);
		}
		public List<TerminalNode> REVEALED() { return getTokens(PokemonLogParser.REVEALED); }
		public TerminalNode REVEALED(int i) {
			return getToken(PokemonLogParser.REVEALED, i);
		}
		public List<TerminalNode> FROM() { return getTokens(PokemonLogParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(PokemonLogParser.FROM, i);
		}
		public List<Cards_listContext> cards_list() {
			return getRuleContexts(Cards_listContext.class);
		}
		public Cards_listContext cards_list(int i) {
			return getRuleContext(Cards_listContext.class,i);
		}
		public Mulligan_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulligan_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterMulligan_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitMulligan_block(this);
		}
	}

	public final Mulligan_blockContext mulligan_block() throws RecognitionException {
		Mulligan_blockContext _localctx = new Mulligan_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mulligan_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(152);
					id_player();
					setState(153);
					match(TAKE);
					setState(154);
					_la = _input.LA(1);
					if ( !(_la==A || _la==NUM) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(155);
					match(MULLIGAN);
					setState(156);
					match(DOT);
					setState(166);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(157);
						match(DASH);
						setState(158);
						match(CARD);
						setState(159);
						match(REVEALED);
						setState(160);
						match(FROM);
						setState(161);
						match(MULLIGAN);
						setState(162);
						match(NUM);
						setState(164);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(163);
							cards_list();
							}
							break;
						}
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(170); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(172);
				id_player();
				setState(173);
				match(DRAW);
				setState(174);
				match(NUM);
				setState(175);
				match(MORE_WORD);
				setState(176);
				match(CARD);
				setState(177);
				match(BECAUSE);
				setState(178);
				id_player();
				setState(179);
				match(TAKE);
				setState(180);
				match(AT);
				setState(181);
				match(LEAST);
				setState(182);
				match(NUM);
				setState(183);
				match(MULLIGAN);
				setState(184);
				match(DOT);
				}
				break;
			}
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DASH) {
				{
				{
				setState(188);
				player_sub_draw();
				}
				}
				setState(193);
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
	public static class Cards_listContext extends ParserRuleContext {
		public List<TerminalNode> ID_CARD() { return getTokens(PokemonLogParser.ID_CARD); }
		public TerminalNode ID_CARD(int i) {
			return getToken(PokemonLogParser.ID_CARD, i);
		}
		public TerminalNode BULLET() { return getToken(PokemonLogParser.BULLET, 0); }
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PokemonLogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PokemonLogParser.COMMA, i);
		}
		public Cards_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cards_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterCards_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitCards_list(this);
		}
	}

	public final Cards_listContext cards_list() throws RecognitionException {
		Cards_listContext _localctx = new Cards_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cards_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !(_la==DASH || _la==BULLET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(195);
			match(ID_CARD);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(196);
				match(COMMA);
				setState(197);
				match(ID_CARD);
				}
				}
				setState(202);
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
		public Player_plays_stadiumContext player_plays_stadium() {
			return getRuleContext(Player_plays_stadiumContext.class,0);
		}
		public Initial_playContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_play; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterInitial_play(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitInitial_play(this);
		}
	}

	public final Initial_playContext initial_play() throws RecognitionException {
		Initial_playContext _localctx = new Initial_playContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_initial_play);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				player_plays_active_spot();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				player_plays_bench();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				player_plays_stadium();
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
		public Pokemon_checkupContext pokemon_checkup() {
			return getRuleContext(Pokemon_checkupContext.class,0);
		}
		public Player_ends_turnContext player_ends_turn() {
			return getRuleContext(Player_ends_turnContext.class,0);
		}
		public Players_turnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_players_turns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayers_turns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayers_turns(this);
		}
	}

	public final Players_turnsContext players_turns() throws RecognitionException {
		Players_turnsContext _localctx = new Players_turnsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_players_turns);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			player_starts_turn();
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(209);
					player_plays();
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POKEMON) {
				{
				setState(215);
				pokemon_checkup();
				}
			}

			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(218);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_starts_turn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_starts_turn(this);
		}
	}

	public final Player_starts_turnContext player_starts_turn() throws RecognitionException {
		Player_starts_turnContext _localctx = new Player_starts_turnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_player_starts_turn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			id_player();
			setState(222);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_ends_turn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_ends_turn(this);
		}
	}

	public final Player_ends_turnContext player_ends_turn() throws RecognitionException {
		Player_ends_turnContext _localctx = new Player_ends_turnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_player_ends_turn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			id_player();
			setState(225);
			match(END);
			setState(226);
			match(THEIR);
			setState(227);
			match(TURN);
			setState(228);
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
	public static class Pokemon_checkupContext extends ParserRuleContext {
		public TerminalNode POKEMON() { return getToken(PokemonLogParser.POKEMON, 0); }
		public TerminalNode CHECKUP() { return getToken(PokemonLogParser.CHECKUP, 0); }
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public TerminalNode DAMAGE() { return getToken(PokemonLogParser.DAMAGE, 0); }
		public TerminalNode COUNTER() { return getToken(PokemonLogParser.COUNTER, 0); }
		public TerminalNode BE() { return getToken(PokemonLogParser.BE, 0); }
		public TerminalNode PLACE() { return getToken(PokemonLogParser.PLACE, 0); }
		public TerminalNode ON() { return getToken(PokemonLogParser.ON, 0); }
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public TerminalNode FOR() { return getToken(PokemonLogParser.FOR, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode SPECIAL() { return getToken(PokemonLogParser.SPECIAL, 0); }
		public TerminalNode CONDITION() { return getToken(PokemonLogParser.CONDITION, 0); }
		public TerminalNode POISONED() { return getToken(PokemonLogParser.POISONED, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Pokemon_checkupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pokemon_checkup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPokemon_checkup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPokemon_checkup(this);
		}
	}

	public final Pokemon_checkupContext pokemon_checkup() throws RecognitionException {
		Pokemon_checkupContext _localctx = new Pokemon_checkupContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pokemon_checkup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(POKEMON);
			setState(231);
			match(CHECKUP);
			setState(232);
			match(NUM);
			setState(233);
			match(DAMAGE);
			setState(234);
			match(COUNTER);
			setState(235);
			match(BE);
			setState(236);
			match(PLACE);
			setState(237);
			match(ON);
			setState(238);
			id_player();
			setState(239);
			match(ID_CARD);
			setState(240);
			match(FOR);
			setState(241);
			match(THE);
			setState(242);
			match(SPECIAL);
			setState(243);
			match(CONDITION);
			setState(244);
			match(POISONED);
			setState(245);
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
		public Player_plays_stadiumContext player_plays_stadium() {
			return getRuleContext(Player_plays_stadiumContext.class,0);
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
		public Player_redeemableContext player_redeemable() {
			return getRuleContext(Player_redeemableContext.class,0);
		}
		public Player_inactiveContext player_inactive() {
			return getRuleContext(Player_inactiveContext.class,0);
		}
		public Tera_effectContext tera_effect() {
			return getRuleContext(Tera_effectContext.class,0);
		}
		public Fight_consequenceContext fight_consequence() {
			return getRuleContext(Fight_consequenceContext.class,0);
		}
		public Player_playsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_plays; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_plays(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_plays(this);
		}
	}

	public final Player_playsContext player_plays() throws RecognitionException {
		Player_playsContext _localctx = new Player_playsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_player_plays);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				player_draw_card();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				player_played_card();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				player_plays_active_spot();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				player_plays_bench();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				player_plays_stadium();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				player_attaches_card();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				player_shuffled();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				player_discarded();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(255);
				player_sub_draw();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(256);
				player_evolve();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(257);
				player_retreated();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(258);
				player_switch();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(259);
				player_used_ability();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(260);
				player_attack();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(261);
				player_moved();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(262);
				player_redeemable();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(263);
				player_inactive();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(264);
				tera_effect();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(265);
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
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public Cards_listContext cards_list() {
			return getRuleContext(Cards_listContext.class,0);
		}
		public Player_draw_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_draw_card; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_draw_card(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_draw_card(this);
		}
	}

	public final Player_draw_cardContext player_draw_card() throws RecognitionException {
		Player_draw_cardContext _localctx = new Player_draw_cardContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_player_draw_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			id_player();
			setState(269);
			match(DRAW);
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A:
				{
				setState(270);
				match(A);
				setState(271);
				match(CARD);
				}
				break;
			case ID_CARD:
				{
				setState(272);
				match(ID_CARD);
				}
				break;
			case NUM:
				{
				setState(273);
				match(NUM);
				setState(274);
				match(CARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(277);
			match(DOT);
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(278);
				cards_list();
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
	public static class Player_sub_drawContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode DRAW() { return getToken(PokemonLogParser.DRAW, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public TerminalNode A() { return getToken(PokemonLogParser.A, 0); }
		public TerminalNode CARD() { return getToken(PokemonLogParser.CARD, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public TerminalNode AND() { return getToken(PokemonLogParser.AND, 0); }
		public TerminalNode PLAY() { return getToken(PokemonLogParser.PLAY, 0); }
		public TerminalNode IT() { return getToken(PokemonLogParser.IT, 0); }
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode BENCH() { return getToken(PokemonLogParser.BENCH, 0); }
		public Cards_listContext cards_list() {
			return getRuleContext(Cards_listContext.class,0);
		}
		public TerminalNode THEM() { return getToken(PokemonLogParser.THEM, 0); }
		public Player_sub_drawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_sub_draw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_sub_draw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_sub_draw(this);
		}
	}

	public final Player_sub_drawContext player_sub_draw() throws RecognitionException {
		Player_sub_drawContext _localctx = new Player_sub_drawContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_player_sub_draw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(DASH);
			setState(282);
			id_player();
			setState(283);
			match(DRAW);
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(284);
				match(A);
				setState(285);
				match(CARD);
				}
				break;
			case 2:
				{
				setState(286);
				match(ID_CARD);
				}
				break;
			case 3:
				{
				setState(287);
				match(NUM);
				setState(288);
				match(CARD);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(289);
					match(AND);
					setState(290);
					match(PLAY);
					setState(291);
					match(THEM);
					setState(292);
					match(TO);
					setState(293);
					match(THE);
					setState(294);
					match(BENCH);
					}
				}

				}
				break;
			case 4:
				{
				setState(297);
				match(ID_CARD);
				setState(298);
				match(AND);
				setState(299);
				match(PLAY);
				setState(300);
				match(IT);
				setState(301);
				match(TO);
				setState(302);
				match(THE);
				setState(303);
				match(BENCH);
				}
				break;
			}
			setState(306);
			match(DOT);
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(307);
				cards_list();
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
	public static class Player_shuffledContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode SHUFFLE() { return getToken(PokemonLogParser.SHUFFLE, 0); }
		public TerminalNode THEIR() { return getToken(PokemonLogParser.THEIR, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public TerminalNode DECK() { return getToken(PokemonLogParser.DECK, 0); }
		public TerminalNode PRIZE() { return getToken(PokemonLogParser.PRIZE, 0); }
		public List<TerminalNode> CARD() { return getTokens(PokemonLogParser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(PokemonLogParser.CARD, i);
		}
		public TerminalNode INTO() { return getToken(PokemonLogParser.INTO, 0); }
		public Cards_listContext cards_list() {
			return getRuleContext(Cards_listContext.class,0);
		}
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public TerminalNode A() { return getToken(PokemonLogParser.A, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public Player_shuffledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_shuffled; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_shuffled(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_shuffled(this);
		}
	}

	public final Player_shuffledContext player_shuffled() throws RecognitionException {
		Player_shuffledContext _localctx = new Player_shuffledContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_player_shuffled);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(DASH);
			setState(311);
			id_player();
			setState(312);
			match(SHUFFLE);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==A || _la==ID_CARD || _la==NUM) {
				{
				setState(318);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM:
					{
					setState(313);
					match(NUM);
					setState(314);
					match(CARD);
					}
					break;
				case A:
					{
					setState(315);
					match(A);
					setState(316);
					match(CARD);
					}
					break;
				case ID_CARD:
					{
					setState(317);
					match(ID_CARD);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(320);
				match(INTO);
				}
			}

			setState(323);
			match(THEIR);
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECK:
				{
				setState(324);
				match(DECK);
				}
				break;
			case PRIZE:
				{
				setState(325);
				match(PRIZE);
				setState(326);
				match(CARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(329);
			match(DOT);
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(330);
				cards_list();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_discarded(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_discarded(this);
		}
	}

	public final Player_discardedContext player_discarded() throws RecognitionException {
		Player_discardedContext _localctx = new Player_discardedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_player_discarded);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(DASH);
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(334);
				discard_one_card();
				}
				break;
			case 2:
				{
				setState(335);
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
		public List<TerminalNode> ID_CARD() { return getTokens(PokemonLogParser.ID_CARD); }
		public TerminalNode ID_CARD(int i) {
			return getToken(PokemonLogParser.ID_CARD, i);
		}
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public TerminalNode BE() { return getToken(PokemonLogParser.BE, 0); }
		public TerminalNode FROM() { return getToken(PokemonLogParser.FROM, 0); }
		public Discard_one_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discard_one_card; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterDiscard_one_card(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitDiscard_one_card(this);
		}
	}

	public final Discard_one_cardContext discard_one_card() throws RecognitionException {
		Discard_one_cardContext _localctx = new Discard_one_cardContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_discard_one_card);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				id_player();
				setState(339);
				match(DISCARD);
				setState(340);
				match(ID_CARD);
				setState(341);
				match(DOT);
				}
				break;
			case ID_CARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(ID_CARD);
				setState(344);
				match(BE);
				setState(345);
				match(DISCARD);
				setState(346);
				match(FROM);
				setState(347);
				id_player();
				setState(348);
				match(ID_CARD);
				setState(349);
				match(DOT);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterDiscard_multiple_cards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitDiscard_multiple_cards(this);
		}
	}

	public final Discard_multiple_cardsContext discard_multiple_cards() throws RecognitionException {
		Discard_multiple_cardsContext _localctx = new Discard_multiple_cardsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_discard_multiple_cards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_TOKEN:
				{
				setState(353);
				id_player();
				setState(354);
				match(DISCARD);
				setState(355);
				match(NUM);
				setState(356);
				match(CARD);
				}
				break;
			case NUM:
				{
				setState(358);
				match(NUM);
				setState(359);
				match(CARD);
				setState(360);
				match(BE);
				setState(361);
				match(DISCARD);
				setState(362);
				match(FROM);
				setState(363);
				id_player();
				setState(364);
				match(ID_CARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(368);
			match(DOT);
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(369);
				cards_list();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_played_card(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_played_card(this);
		}
	}

	public final Player_played_cardContext player_played_card() throws RecognitionException {
		Player_played_cardContext _localctx = new Player_played_cardContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_player_played_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			id_player();
			setState(373);
			match(PLAY);
			setState(374);
			match(ID_CARD);
			setState(375);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_plays_active_spot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_plays_active_spot(this);
		}
	}

	public final Player_plays_active_spotContext player_plays_active_spot() throws RecognitionException {
		Player_plays_active_spotContext _localctx = new Player_plays_active_spotContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_player_plays_active_spot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			id_player();
			setState(378);
			match(PLAY);
			setState(379);
			match(ID_CARD);
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BE:
				{
				setState(380);
				match(BE);
				setState(381);
				match(NOW);
				setState(382);
				match(IN);
				}
				break;
			case TO:
				{
				setState(383);
				match(TO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(386);
			match(THE);
			setState(387);
			match(ACTIVE_SPOT);
			setState(388);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_plays_bench(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_plays_bench(this);
		}
	}

	public final Player_plays_benchContext player_plays_bench() throws RecognitionException {
		Player_plays_benchContext _localctx = new Player_plays_benchContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_player_plays_bench);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			id_player();
			setState(391);
			match(PLAY);
			setState(392);
			match(ID_CARD);
			setState(393);
			match(TO);
			setState(394);
			match(THE);
			setState(395);
			match(BENCH);
			setState(396);
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
	public static class Player_plays_stadiumContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode PLAY() { return getToken(PokemonLogParser.PLAY, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode STADIUM_SPOT() { return getToken(PokemonLogParser.STADIUM_SPOT, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Player_plays_stadiumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_plays_stadium; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_plays_stadium(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_plays_stadium(this);
		}
	}

	public final Player_plays_stadiumContext player_plays_stadium() throws RecognitionException {
		Player_plays_stadiumContext _localctx = new Player_plays_stadiumContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_player_plays_stadium);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			id_player();
			setState(399);
			match(PLAY);
			setState(400);
			match(ID_CARD);
			setState(401);
			match(TO);
			setState(402);
			match(THE);
			setState(403);
			match(STADIUM_SPOT);
			setState(404);
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
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public Player_attaches_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_attaches_card; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_attaches_card(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_attaches_card(this);
		}
	}

	public final Player_attaches_cardContext player_attaches_card() throws RecognitionException {
		Player_attaches_cardContext _localctx = new Player_attaches_cardContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_player_attaches_card);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH) {
				{
				setState(406);
				match(DASH);
				}
			}

			setState(409);
			id_player();
			setState(410);
			match(ATTACH);
			setState(411);
			match(ID_CARD);
			setState(412);
			match(TO);
			setState(413);
			match(ID_CARD);
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(414);
				match(ON);
				setState(415);
				match(THE);
				setState(416);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(417);
				match(IN);
				setState(418);
				match(THE);
				setState(419);
				match(ACTIVE_SPOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(422);
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
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public Player_evolveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_evolve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_evolve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_evolve(this);
		}
	}

	public final Player_evolveContext player_evolve() throws RecognitionException {
		Player_evolveContext _localctx = new Player_evolveContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_player_evolve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH) {
				{
				setState(424);
				match(DASH);
				}
			}

			setState(427);
			id_player();
			setState(428);
			match(EVOLVE);
			setState(429);
			match(ID_CARD);
			setState(430);
			match(TO);
			setState(431);
			match(ID_CARD);
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				{
				setState(432);
				match(IN);
				setState(433);
				match(THE);
				setState(434);
				match(ACTIVE_SPOT);
				}
				break;
			case ON:
				{
				setState(435);
				match(ON);
				setState(436);
				match(THE);
				setState(437);
				match(BENCH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(440);
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
		public List<TerminalNode> DASH() { return getTokens(PokemonLogParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(PokemonLogParser.DASH, i);
		}
		public List<TerminalNode> BE() { return getTokens(PokemonLogParser.BE); }
		public TerminalNode BE(int i) {
			return getToken(PokemonLogParser.BE, i);
		}
		public List<TerminalNode> DISCARD() { return getTokens(PokemonLogParser.DISCARD); }
		public TerminalNode DISCARD(int i) {
			return getToken(PokemonLogParser.DISCARD, i);
		}
		public List<TerminalNode> FROM() { return getTokens(PokemonLogParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(PokemonLogParser.FROM, i);
		}
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public TerminalNode CARD() { return getToken(PokemonLogParser.CARD, 0); }
		public Cards_listContext cards_list() {
			return getRuleContext(Cards_listContext.class,0);
		}
		public Player_retreatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_retreated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_retreated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_retreated(this);
		}
	}

	public final Player_retreatedContext player_retreated() throws RecognitionException {
		Player_retreatedContext _localctx = new Player_retreatedContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_player_retreated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			id_player();
			setState(443);
			match(RETREAT);
			setState(444);
			match(ID_CARD);
			setState(445);
			match(TO);
			setState(446);
			match(THE);
			setState(447);
			match(BENCH);
			setState(448);
			match(DOT);
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(449);
				match(DASH);
				setState(453);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM:
					{
					setState(450);
					match(NUM);
					setState(451);
					match(CARD);
					}
					break;
				case ID_CARD:
					{
					setState(452);
					match(ID_CARD);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(455);
				match(BE);
				setState(456);
				match(DISCARD);
				setState(457);
				match(FROM);
				setState(458);
				id_player();
				setState(459);
				match(ID_CARD);
				setState(460);
				match(DOT);
				setState(462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(461);
					cards_list();
					}
					break;
				}
				}
				break;
			}
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(466);
				match(DASH);
				setState(467);
				match(ID_CARD);
				setState(468);
				match(BE);
				setState(469);
				match(DISCARD);
				setState(470);
				match(FROM);
				setState(471);
				id_player();
				setState(472);
				match(ID_CARD);
				setState(473);
				match(DOT);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_switch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_switch(this);
		}
	}

	public final Player_switchContext player_switch() throws RecognitionException {
		Player_switchContext _localctx = new Player_switchContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_player_switch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(DASH);
			setState(478);
			id_player();
			setState(479);
			match(ID_CARD);
			setState(480);
			match(BE);
			setState(481);
			match(SWITCH_VERB);
			setState(482);
			match(WITH);
			setState(483);
			id_player();
			setState(484);
			match(ID_CARD);
			setState(485);
			match(TO);
			setState(486);
			match(BECOME);
			setState(487);
			match(THE);
			setState(488);
			match(ACTIVE);
			setState(489);
			match(POKEMON);
			setState(490);
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
	public static class Tera_effectContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public List<TerminalNode> ID_CARD() { return getTokens(PokemonLogParser.ID_CARD); }
		public TerminalNode ID_CARD(int i) {
			return getToken(PokemonLogParser.ID_CARD, i);
		}
		public TerminalNode POSSESSIVE() { return getToken(PokemonLogParser.POSSESSIVE, 0); }
		public TerminalNode TERA() { return getToken(PokemonLogParser.TERA, 0); }
		public TerminalNode EFFECT() { return getToken(PokemonLogParser.EFFECT, 0); }
		public List<TerminalNode> BE() { return getTokens(PokemonLogParser.BE); }
		public TerminalNode BE(int i) {
			return getToken(PokemonLogParser.BE, i);
		}
		public TerminalNode USE() { return getToken(PokemonLogParser.USE, 0); }
		public List<TerminalNode> DOT() { return getTokens(PokemonLogParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PokemonLogParser.DOT, i);
		}
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public TerminalNode DAMAGE() { return getToken(PokemonLogParser.DAMAGE, 0); }
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public TerminalNode PREVENTED() { return getToken(PokemonLogParser.PREVENTED, 0); }
		public Tera_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tera_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterTera_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitTera_effect(this);
		}
	}

	public final Tera_effectContext tera_effect() throws RecognitionException {
		Tera_effectContext _localctx = new Tera_effectContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tera_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			id_player();
			setState(493);
			match(ID_CARD);
			setState(494);
			match(POSSESSIVE);
			setState(495);
			match(TERA);
			setState(496);
			match(EFFECT);
			setState(497);
			match(BE);
			setState(498);
			match(USE);
			setState(499);
			match(DOT);
			setState(500);
			match(DASH);
			setState(501);
			match(DAMAGE);
			setState(502);
			match(TO);
			setState(503);
			match(ID_CARD);
			setState(504);
			match(BE);
			setState(505);
			match(PREVENTED);
			setState(506);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_used_ability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_used_ability(this);
		}
	}

	public final Player_used_abilityContext player_used_ability() throws RecognitionException {
		Player_used_abilityContext _localctx = new Player_used_abilityContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_player_used_ability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			id_player();
			setState(509);
			match(ID_CARD);
			setState(510);
			match(USE);
			setState(511);
			match(ID_CARD);
			setState(512);
			match(DOT);
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(513);
				cards_list();
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
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public TerminalNode ON() { return getToken(PokemonLogParser.ON, 0); }
		public TerminalNode FOR() { return getToken(PokemonLogParser.FOR, 0); }
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public TerminalNode DAMAGE() { return getToken(PokemonLogParser.DAMAGE, 0); }
		public Weakness_sentenceContext weakness_sentence() {
			return getRuleContext(Weakness_sentenceContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_attack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_attack(this);
		}
	}

	public final Player_attackContext player_attack() throws RecognitionException {
		Player_attackContext _localctx = new Player_attackContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_player_attack);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			id_player();
			setState(517);
			match(ID_CARD);
			setState(518);
			match(USE);
			setState(519);
			match(ID_CARD);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(520);
				match(ON);
				setState(521);
				id_player();
				setState(522);
				match(ID_CARD);
				setState(523);
				match(FOR);
				setState(524);
				match(NUM);
				setState(525);
				match(DAMAGE);
				}
			}

			setState(529);
			match(DOT);
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(530);
				weakness_sentence();
				}
				break;
			}
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(533);
				damage_breakdown();
				}
				break;
			}
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(536);
					fight_consequence();
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
	public static class Weakness_sentenceContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public TerminalNode TAKE() { return getToken(PokemonLogParser.TAKE, 0); }
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public TerminalNode DAMAGE() { return getToken(PokemonLogParser.DAMAGE, 0); }
		public TerminalNode BECAUSE() { return getToken(PokemonLogParser.BECAUSE, 0); }
		public TerminalNode OF() { return getToken(PokemonLogParser.OF, 0); }
		public TerminalNode ID_TOKEN() { return getToken(PokemonLogParser.ID_TOKEN, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public TerminalNode MORE_WORD() { return getToken(PokemonLogParser.MORE_WORD, 0); }
		public TerminalNode LESS() { return getToken(PokemonLogParser.LESS, 0); }
		public TerminalNode WEAKNESS() { return getToken(PokemonLogParser.WEAKNESS, 0); }
		public TerminalNode RESISTANCE() { return getToken(PokemonLogParser.RESISTANCE, 0); }
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public Weakness_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weakness_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterWeakness_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitWeakness_sentence(this);
		}
	}

	public final Weakness_sentenceContext weakness_sentence() throws RecognitionException {
		Weakness_sentenceContext _localctx = new Weakness_sentenceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_weakness_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			id_player();
			setState(543);
			match(ID_CARD);
			setState(544);
			match(TAKE);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH) {
				{
				setState(545);
				match(DASH);
				}
			}

			setState(548);
			match(NUM);
			setState(549);
			_la = _input.LA(1);
			if ( !(_la==MORE_WORD || _la==LESS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(550);
			match(DAMAGE);
			setState(551);
			match(BECAUSE);
			setState(552);
			match(OF);
			setState(553);
			match(ID_TOKEN);
			setState(554);
			_la = _input.LA(1);
			if ( !(_la==WEAKNESS || _la==RESISTANCE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(555);
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
	public static class Player_movedContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public List<Id_playerContext> id_player() {
			return getRuleContexts(Id_playerContext.class);
		}
		public Id_playerContext id_player(int i) {
			return getRuleContext(Id_playerContext.class,i);
		}
		public TerminalNode MOVE() { return getToken(PokemonLogParser.MOVE, 0); }
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public List<TerminalNode> CARD() { return getTokens(PokemonLogParser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(PokemonLogParser.CARD, i);
		}
		public TerminalNode THEIR() { return getToken(PokemonLogParser.THEIR, 0); }
		public TerminalNode HAND() { return getToken(PokemonLogParser.HAND, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode PRIZE() { return getToken(PokemonLogParser.PRIZE, 0); }
		public Cards_listContext cards_list() {
			return getRuleContext(Cards_listContext.class,0);
		}
		public Player_movedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_moved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_moved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_moved(this);
		}
	}

	public final Player_movedContext player_moved() throws RecognitionException {
		Player_movedContext _localctx = new Player_movedContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_player_moved);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(DASH);
			setState(558);
			id_player();
			setState(559);
			match(MOVE);
			setState(560);
			id_player();
			setState(564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_CARD:
				{
				setState(561);
				match(ID_CARD);
				}
				break;
			case NUM:
				{
				setState(562);
				match(NUM);
				setState(563);
				match(CARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(566);
			match(TO);
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THEIR:
				{
				setState(567);
				match(THEIR);
				setState(568);
				match(HAND);
				}
				break;
			case THE:
				{
				setState(569);
				match(THE);
				setState(570);
				match(PRIZE);
				setState(571);
				match(CARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(574);
			match(DOT);
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(575);
				cards_list();
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
	public static class Player_redeemableContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode PUT() { return getToken(PokemonLogParser.PUT, 0); }
		public TerminalNode NUM() { return getToken(PokemonLogParser.NUM, 0); }
		public TerminalNode CARD() { return getToken(PokemonLogParser.CARD, 0); }
		public TerminalNode ON() { return getToken(PokemonLogParser.ON, 0); }
		public TerminalNode THE() { return getToken(PokemonLogParser.THE, 0); }
		public TerminalNode BOTTOM() { return getToken(PokemonLogParser.BOTTOM, 0); }
		public TerminalNode OF() { return getToken(PokemonLogParser.OF, 0); }
		public TerminalNode THEIR() { return getToken(PokemonLogParser.THEIR, 0); }
		public TerminalNode DECK() { return getToken(PokemonLogParser.DECK, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Player_redeemableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_redeemable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_redeemable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_redeemable(this);
		}
	}

	public final Player_redeemableContext player_redeemable() throws RecognitionException {
		Player_redeemableContext _localctx = new Player_redeemableContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_player_redeemable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(DASH);
			setState(579);
			id_player();
			setState(580);
			match(PUT);
			setState(581);
			match(NUM);
			setState(582);
			match(CARD);
			setState(583);
			match(ON);
			setState(584);
			match(THE);
			setState(585);
			match(BOTTOM);
			setState(586);
			match(OF);
			setState(587);
			match(THEIR);
			setState(588);
			match(DECK);
			setState(589);
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
	public static class Player_inactiveContext extends ParserRuleContext {
		public Id_playerContext id_player() {
			return getRuleContext(Id_playerContext.class,0);
		}
		public TerminalNode DID_NOT() { return getToken(PokemonLogParser.DID_NOT, 0); }
		public TerminalNode TAKE() { return getToken(PokemonLogParser.TAKE, 0); }
		public TerminalNode AN() { return getToken(PokemonLogParser.AN, 0); }
		public TerminalNode ACTION() { return getToken(PokemonLogParser.ACTION, 0); }
		public TerminalNode IN() { return getToken(PokemonLogParser.IN, 0); }
		public TerminalNode TIME() { return getToken(PokemonLogParser.TIME, 0); }
		public TerminalNode DOT() { return getToken(PokemonLogParser.DOT, 0); }
		public Player_inactiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_inactive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_inactive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_inactive(this);
		}
	}

	public final Player_inactiveContext player_inactive() throws RecognitionException {
		Player_inactiveContext _localctx = new Player_inactiveContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_player_inactive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			id_player();
			setState(592);
			match(DID_NOT);
			setState(593);
			match(TAKE);
			setState(594);
			match(AN);
			setState(595);
			match(ACTION);
			setState(596);
			match(IN);
			setState(597);
			match(TIME);
			setState(598);
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
		public List<Damage_itemContext> damage_item() {
			return getRuleContexts(Damage_itemContext.class);
		}
		public Damage_itemContext damage_item(int i) {
			return getRuleContext(Damage_itemContext.class,i);
		}
		public Damage_breakdownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage_breakdown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterDamage_breakdown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitDamage_breakdown(this);
		}
	}

	public final Damage_breakdownContext damage_breakdown() throws RecognitionException {
		Damage_breakdownContext _localctx = new Damage_breakdownContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_damage_breakdown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(DASH);
			setState(601);
			match(DAMAGE);
			setState(602);
			match(BREAKDOWN);
			setState(603);
			match(COLON);
			setState(605); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(604);
				damage_item();
				}
				}
				setState(607); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BULLET );
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
	public static class Damage_itemContext extends ParserRuleContext {
		public TerminalNode BULLET() { return getToken(PokemonLogParser.BULLET, 0); }
		public TerminalNode BASE() { return getToken(PokemonLogParser.BASE, 0); }
		public List<TerminalNode> DAMAGE() { return getTokens(PokemonLogParser.DAMAGE); }
		public TerminalNode DAMAGE(int i) {
			return getToken(PokemonLogParser.DAMAGE, i);
		}
		public TerminalNode COLON() { return getToken(PokemonLogParser.COLON, 0); }
		public List<TerminalNode> NUM() { return getTokens(PokemonLogParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(PokemonLogParser.NUM, i);
		}
		public TerminalNode PAREN_IZQ() { return getToken(PokemonLogParser.PAREN_IZQ, 0); }
		public TerminalNode ITEM() { return getToken(PokemonLogParser.ITEM, 0); }
		public TerminalNode PAREN_DER() { return getToken(PokemonLogParser.PAREN_DER, 0); }
		public TerminalNode ID_CARD() { return getToken(PokemonLogParser.ID_CARD, 0); }
		public TerminalNode WEAKNESS() { return getToken(PokemonLogParser.WEAKNESS, 0); }
		public TerminalNode TO() { return getToken(PokemonLogParser.TO, 0); }
		public TerminalNode ID_TOKEN() { return getToken(PokemonLogParser.ID_TOKEN, 0); }
		public TerminalNode RESISTANCE() { return getToken(PokemonLogParser.RESISTANCE, 0); }
		public TerminalNode DASH() { return getToken(PokemonLogParser.DASH, 0); }
		public TerminalNode ATTACH() { return getToken(PokemonLogParser.ATTACH, 0); }
		public TerminalNode PRIZE() { return getToken(PokemonLogParser.PRIZE, 0); }
		public TerminalNode CARD() { return getToken(PokemonLogParser.CARD, 0); }
		public TerminalNode TOTAL() { return getToken(PokemonLogParser.TOTAL, 0); }
		public Damage_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterDamage_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitDamage_item(this);
		}
	}

	public final Damage_itemContext damage_item() throws RecognitionException {
		Damage_itemContext _localctx = new Damage_itemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_damage_item);
		int _la;
		try {
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				match(BULLET);
				setState(610);
				match(BASE);
				setState(611);
				match(DAMAGE);
				setState(612);
				match(COLON);
				setState(613);
				match(NUM);
				setState(614);
				match(DAMAGE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				match(BULLET);
				setState(616);
				match(PAREN_IZQ);
				setState(617);
				match(ITEM);
				setState(618);
				match(PAREN_DER);
				setState(619);
				match(ID_CARD);
				setState(620);
				match(COLON);
				setState(621);
				match(NUM);
				setState(622);
				match(DAMAGE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				match(BULLET);
				setState(624);
				match(WEAKNESS);
				setState(625);
				match(TO);
				setState(626);
				match(ID_TOKEN);
				setState(627);
				match(COLON);
				setState(628);
				match(NUM);
				setState(629);
				match(DAMAGE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(630);
				match(BULLET);
				setState(631);
				match(RESISTANCE);
				setState(632);
				match(TO);
				setState(633);
				match(ID_TOKEN);
				setState(634);
				match(COLON);
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DASH) {
					{
					setState(635);
					match(DASH);
					}
				}

				setState(638);
				match(NUM);
				setState(639);
				match(DAMAGE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(640);
				match(BULLET);
				setState(641);
				match(NUM);
				setState(642);
				match(ATTACH);
				setState(643);
				match(ID_TOKEN);
				setState(644);
				match(COLON);
				setState(645);
				match(NUM);
				setState(646);
				match(DAMAGE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(647);
				match(BULLET);
				setState(648);
				match(NUM);
				setState(649);
				match(PRIZE);
				setState(650);
				match(CARD);
				setState(651);
				match(COLON);
				setState(652);
				match(NUM);
				setState(653);
				match(DAMAGE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(654);
				match(BULLET);
				setState(655);
				match(DAMAGE);
				setState(656);
				match(COLON);
				setState(657);
				match(NUM);
				setState(658);
				match(DAMAGE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(659);
				match(BULLET);
				setState(660);
				match(TOTAL);
				setState(661);
				match(DAMAGE);
				setState(662);
				match(COLON);
				setState(663);
				match(NUM);
				setState(664);
				match(DAMAGE);
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
		public TerminalNode POISONED() { return getToken(PokemonLogParser.POISONED, 0); }
		public TerminalNode DAMAGE() { return getToken(PokemonLogParser.DAMAGE, 0); }
		public TerminalNode HEAL() { return getToken(PokemonLogParser.HEAL, 0); }
		public Fight_consequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fight_consequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterFight_consequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitFight_consequence(this);
		}
	}

	public final Fight_consequenceContext fight_consequence() throws RecognitionException {
		Fight_consequenceContext _localctx = new Fight_consequenceContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_fight_consequence);
		int _la;
		try {
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				id_player();
				setState(668);
				match(ID_CARD);
				setState(669);
				match(BE);
				setState(670);
				match(KNOCK_OUT);
				setState(671);
				match(EXCLAMATION);
				setState(695);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(672);
					match(DASH);
					setState(673);
					match(NUM);
					setState(674);
					match(CARD);
					setState(675);
					match(BE);
					setState(676);
					match(DISCARD);
					setState(677);
					match(FROM);
					setState(678);
					id_player();
					setState(679);
					match(ID_CARD);
					setState(680);
					match(DOT);
					setState(682);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						setState(681);
						cards_list();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(685);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DASH) {
						{
						setState(684);
						match(DASH);
						}
					}

					setState(687);
					match(ID_CARD);
					setState(688);
					match(BE);
					setState(689);
					match(DISCARD);
					setState(690);
					match(FROM);
					setState(691);
					id_player();
					setState(692);
					match(ID_CARD);
					setState(693);
					match(DOT);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				id_player();
				setState(698);
				match(TAKE);
				setState(699);
				_la = _input.LA(1);
				if ( !(_la==A || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(700);
				match(PRIZE);
				setState(701);
				match(CARD);
				setState(702);
				match(DOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(707);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case A:
					{
					setState(704);
					match(A);
					setState(705);
					match(CARD);
					}
					break;
				case ID_CARD:
					{
					setState(706);
					match(ID_CARD);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(709);
				match(BE);
				setState(710);
				match(ADD);
				setState(711);
				match(TO);
				setState(712);
				id_player();
				setState(713);
				match(HAND);
				setState(714);
				match(DOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(716);
				id_player();
				setState(717);
				match(ID_CARD);
				setState(718);
				match(BE);
				setState(719);
				match(NOW);
				setState(720);
				match(IN);
				setState(721);
				match(THE);
				setState(722);
				match(ACTIVE_SPOT);
				setState(723);
				match(DOT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(725);
				match(DASH);
				setState(726);
				id_player();
				setState(727);
				match(ID_CARD);
				setState(728);
				match(BE);
				setState(729);
				match(NOW);
				setState(730);
				match(POISONED);
				setState(731);
				match(DOT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(733);
				match(DASH);
				setState(734);
				id_player();
				setState(735);
				match(ID_CARD);
				setState(736);
				match(TAKE);
				setState(737);
				match(NUM);
				setState(738);
				match(DAMAGE);
				setState(739);
				match(DOT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(741);
				match(DASH);
				setState(742);
				id_player();
				setState(743);
				match(ID_CARD);
				setState(744);
				match(HEAL);
				setState(745);
				match(NUM);
				setState(746);
				match(DAMAGE);
				setState(747);
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
		public TerminalNode OPPONENT() { return getToken(PokemonLogParser.OPPONENT, 0); }
		public TerminalNode OF() { return getToken(PokemonLogParser.OF, 0); }
		public TerminalNode THEIR() { return getToken(PokemonLogParser.THEIR, 0); }
		public TerminalNode CONCEDE() { return getToken(PokemonLogParser.CONCEDE, 0); }
		public TerminalNode YOU() { return getToken(PokemonLogParser.YOU, 0); }
		public TerminalNode BE() { return getToken(PokemonLogParser.BE, 0); }
		public TerminalNode INACTIVE() { return getToken(PokemonLogParser.INACTIVE, 0); }
		public TerminalNode FOR() { return getToken(PokemonLogParser.FOR, 0); }
		public TerminalNode TOO() { return getToken(PokemonLogParser.TOO, 0); }
		public TerminalNode LONG() { return getToken(PokemonLogParser.LONG, 0); }
		public TerminalNode KNOCK_OUT() { return getToken(PokemonLogParser.KNOCK_OUT, 0); }
		public TerminalNode WITH() { return getToken(PokemonLogParser.WITH, 0); }
		public TerminalNode NO() { return getToken(PokemonLogParser.NO, 0); }
		public TerminalNode BENCHED() { return getToken(PokemonLogParser.BENCHED, 0); }
		public TerminalNode POKEMON() { return getToken(PokemonLogParser.POKEMON, 0); }
		public Player_wonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player_won; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterPlayer_won(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitPlayer_won(this);
		}
	}

	public final Player_wonContext player_won() throws RecognitionException {
		Player_wonContext _localctx = new Player_wonContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_player_won);
		try {
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				match(ALL);
				setState(752);
				match(PRIZE);
				setState(753);
				match(CARD);
				setState(754);
				match(TAKE);
				setState(755);
				match(DOT);
				setState(756);
				id_player();
				setState(757);
				match(WIN);
				setState(758);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				match(OPPONENT);
				setState(761);
				match(TAKE);
				setState(762);
				match(ALL);
				setState(763);
				match(OF);
				setState(764);
				match(THEIR);
				setState(765);
				match(PRIZE);
				setState(766);
				match(CARD);
				setState(767);
				match(DOT);
				setState(768);
				id_player();
				setState(769);
				match(WIN);
				setState(770);
				match(DOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				match(OPPONENT);
				setState(773);
				match(CONCEDE);
				setState(774);
				match(DOT);
				setState(775);
				id_player();
				setState(776);
				match(WIN);
				setState(777);
				match(DOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(779);
				match(YOU);
				setState(780);
				match(CONCEDE);
				setState(781);
				match(DOT);
				setState(782);
				id_player();
				setState(783);
				match(WIN);
				setState(784);
				match(DOT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(786);
				match(OPPONENT);
				setState(787);
				match(BE);
				setState(788);
				match(INACTIVE);
				setState(789);
				match(FOR);
				setState(790);
				match(TOO);
				setState(791);
				match(LONG);
				setState(792);
				match(DOT);
				setState(793);
				id_player();
				setState(794);
				match(WIN);
				setState(795);
				match(DOT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(797);
				match(KNOCK_OUT);
				setState(798);
				match(WITH);
				setState(799);
				match(NO);
				setState(800);
				match(BENCHED);
				setState(801);
				match(POKEMON);
				setState(802);
				match(DOT);
				setState(803);
				id_player();
				setState(804);
				match(WIN);
				setState(805);
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
	public static class Id_playerContext extends ParserRuleContext {
		public TerminalNode ID_TOKEN() { return getToken(PokemonLogParser.ID_TOKEN, 0); }
		public Id_playerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_player; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).enterId_player(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PokemonLogListener ) ((PokemonLogListener)listener).exitId_player(this);
		}
	}

	public final Id_playerContext id_player() throws RecognitionException {
		Id_playerContext _localctx = new Id_playerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_id_player);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
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
		"\u0004\u0001j\u032c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0004\u0000S\b\u0000\u000b\u0000\f\u0000T\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001_\b\u0001\n\u0001\f\u0001b\t\u0001\u0001\u0001"+
		"\u0005\u0001e\b\u0001\n\u0001\f\u0001h\t\u0001\u0001\u0001\u0005\u0001"+
		"k\b\u0001\n\u0001\f\u0001n\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0097\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00a5\b\u0006\u0003\u0006\u00a7\b"+
		"\u0006\u0004\u0006\u00a9\b\u0006\u000b\u0006\f\u0006\u00aa\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00bb\b\u0006\u0001\u0006\u0005\u0006\u00be\b"+
		"\u0006\n\u0006\f\u0006\u00c1\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00c7\b\u0007\n\u0007\f\u0007\u00ca\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00cf\b\b\u0001\t\u0001\t\u0005\t\u00d3\b\t"+
		"\n\t\f\t\u00d6\t\t\u0001\t\u0003\t\u00d9\b\t\u0001\t\u0003\t\u00dc\b\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u010b\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0114"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0118\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0128\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0131\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0135\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u013f\b\u0010\u0001\u0010\u0003\u0010\u0142\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0148\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u014c\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0151\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0160\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u016f\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0173"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0181\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0003"+
		"\u0018\u0198\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u01a5\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0003"+
		"\u0019\u01aa\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u01b7\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01c6\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01cf\b\u001a\u0003\u001a\u01d1\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u01dc\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0203\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0210\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0214\b"+
		"\u001e\u0001\u001e\u0003\u001e\u0217\b\u001e\u0001\u001e\u0005\u001e\u021a"+
		"\b\u001e\n\u001e\f\u001e\u021d\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0223\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0235\b \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u023d\b \u0001 \u0001 \u0003"+
		" \u0241\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0004"+
		"#\u025e\b#\u000b#\f#\u025f\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u027d\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u029a\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u02ab\b%\u0001%\u0003"+
		"%\u02ae\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u02b8\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u02c4\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0003%\u02ee\b%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u0328\b&\u0001\'\u0001\'\u0001\'\u0000\u0000(\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLN\u0000\u0006\u0001\u0000\u001a\u001b\u0001\u0000"+
		"\u001f \u0002\u0000\u000f\u000fhh\u0002\u0000``bb\u0001\u0000./\u0001"+
		"\u000034\u0361\u0000P\u0001\u0000\u0000\u0000\u0002Y\u0001\u0000\u0000"+
		"\u0000\u0004o\u0001\u0000\u0000\u0000\u0006y\u0001\u0000\u0000\u0000\b"+
		"\u0080\u0001\u0000\u0000\u0000\n\u0087\u0001\u0000\u0000\u0000\f\u00a8"+
		"\u0001\u0000\u0000\u0000\u000e\u00c2\u0001\u0000\u0000\u0000\u0010\u00ce"+
		"\u0001\u0000\u0000\u0000\u0012\u00d0\u0001\u0000\u0000\u0000\u0014\u00dd"+
		"\u0001\u0000\u0000\u0000\u0016\u00e0\u0001\u0000\u0000\u0000\u0018\u00e6"+
		"\u0001\u0000\u0000\u0000\u001a\u010a\u0001\u0000\u0000\u0000\u001c\u010c"+
		"\u0001\u0000\u0000\u0000\u001e\u0119\u0001\u0000\u0000\u0000 \u0136\u0001"+
		"\u0000\u0000\u0000\"\u014d\u0001\u0000\u0000\u0000$\u015f\u0001\u0000"+
		"\u0000\u0000&\u016e\u0001\u0000\u0000\u0000(\u0174\u0001\u0000\u0000\u0000"+
		"*\u0179\u0001\u0000\u0000\u0000,\u0186\u0001\u0000\u0000\u0000.\u018e"+
		"\u0001\u0000\u0000\u00000\u0197\u0001\u0000\u0000\u00002\u01a9\u0001\u0000"+
		"\u0000\u00004\u01ba\u0001\u0000\u0000\u00006\u01dd\u0001\u0000\u0000\u0000"+
		"8\u01ec\u0001\u0000\u0000\u0000:\u01fc\u0001\u0000\u0000\u0000<\u0204"+
		"\u0001\u0000\u0000\u0000>\u021e\u0001\u0000\u0000\u0000@\u022d\u0001\u0000"+
		"\u0000\u0000B\u0242\u0001\u0000\u0000\u0000D\u024f\u0001\u0000\u0000\u0000"+
		"F\u0258\u0001\u0000\u0000\u0000H\u0299\u0001\u0000\u0000\u0000J\u02ed"+
		"\u0001\u0000\u0000\u0000L\u0327\u0001\u0000\u0000\u0000N\u0329\u0001\u0000"+
		"\u0000\u0000PR\u0003\u0002\u0001\u0000QS\u0003\u0012\t\u0000RQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0003L&\u0000WX\u0005\u0000"+
		"\u0000\u0001X\u0001\u0001\u0000\u0000\u0000YZ\u0005\u0001\u0000\u0000"+
		"Z[\u0003\u0004\u0002\u0000[\\\u0003\u0006\u0003\u0000\\`\u0003\b\u0004"+
		"\u0000]_\u0003\n\u0005\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000af\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000ce\u0003\f\u0006\u0000dc\u0001\u0000"+
		"\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gl\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"ik\u0003\u0010\b\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0003\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0003N\'\u0000pq\u0005I\u0000"+
		"\u0000qr\u0007\u0000\u0000\u0000rs\u0005\t\u0000\u0000st\u0005\n\u0000"+
		"\u0000tu\u0005\u001c\u0000\u0000uv\u0005\u001d\u0000\u0000vw\u0005\u001e"+
		"\u0000\u0000wx\u0005_\u0000\u0000x\u0005\u0001\u0000\u0000\u0000yz\u0003"+
		"N\'\u0000z{\u0005K\u0000\u0000{|\u0005\n\u0000\u0000|}\u0005\u001d\u0000"+
		"\u0000}~\u0005!\u0000\u0000~\u007f\u0005_\u0000\u0000\u007f\u0007\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0003N\'\u0000\u0081\u0082\u0005J\u0000"+
		"\u0000\u0082\u0083\u0005\u000b\u0000\u0000\u0083\u0084\u0005H\u0000\u0000"+
		"\u0084\u0085\u0007\u0001\u0000\u0000\u0085\u0086\u0005_\u0000\u0000\u0086"+
		"\t\u0001\u0000\u0000\u0000\u0087\u0088\u0003N\'\u0000\u0088\u0089\u0005"+
		"M\u0000\u0000\u0089\u008a\u0005h\u0000\u0000\u008a\u008b\u0005\"\u0000"+
		"\u0000\u008b\u008c\u0005\t\u0000\u0000\u008c\u008d\u0005\n\u0000\u0000"+
		"\u008d\u008e\u0005\u001c\u0000\u0000\u008e\u008f\u0005#\u0000\u0000\u008f"+
		"\u0090\u0005_\u0000\u0000\u0090\u0091\u0005`\u0000\u0000\u0091\u0092\u0005"+
		"h\u0000\u0000\u0092\u0093\u0005M\u0000\u0000\u0093\u0094\u0005\"\u0000"+
		"\u0000\u0094\u0096\u0005_\u0000\u0000\u0095\u0097\u0003\u000e\u0007\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u000b\u0001\u0000\u0000\u0000\u0098\u0099\u0003N\'\u0000\u0099"+
		"\u009a\u0005[\u0000\u0000\u009a\u009b\u0007\u0002\u0000\u0000\u009b\u009c"+
		"\u0005,\u0000\u0000\u009c\u00a6\u0005_\u0000\u0000\u009d\u009e\u0005`"+
		"\u0000\u0000\u009e\u009f\u0005\"\u0000\u0000\u009f\u00a0\u0005-\u0000"+
		"\u0000\u00a0\u00a1\u0005+\u0000\u0000\u00a1\u00a2\u0005,\u0000\u0000\u00a2"+
		"\u00a4\u0005h\u0000\u0000\u00a3\u00a5\u0003\u000e\u0007\u0000\u00a4\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a6\u009d\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u0098"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003N\'\u0000\u00ad\u00ae\u0005"+
		"M\u0000\u0000\u00ae\u00af\u0005h\u0000\u0000\u00af\u00b0\u0005.\u0000"+
		"\u0000\u00b0\u00b1\u0005\"\u0000\u0000\u00b1\u00b2\u00050\u0000\u0000"+
		"\u00b2\u00b3\u0003N\'\u0000\u00b3\u00b4\u0005[\u0000\u0000\u00b4\u00b5"+
		"\u00051\u0000\u0000\u00b5\u00b6\u00052\u0000\u0000\u00b6\u00b7\u0005h"+
		"\u0000\u0000\u00b7\u00b8\u0005,\u0000\u0000\u00b8\u00b9\u0005_\u0000\u0000"+
		"\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bc\u00be\u0003\u001e\u000f\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\r\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0007\u0003\u0000\u0000\u00c3"+
		"\u00c8\u0005^\u0000\u0000\u00c4\u00c5\u0005a\u0000\u0000\u00c5\u00c7\u0005"+
		"^\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u000f\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cf\u0003*\u0015\u0000\u00cc\u00cf\u0003,\u0016\u0000"+
		"\u00cd\u00cf\u0003.\u0017\u0000\u00ce\u00cb\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u0011\u0001\u0000\u0000\u0000\u00d0\u00d4\u0003\u0014\n\u0000\u00d1\u00d3"+
		"\u0003\u001a\r\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d9\u0003\u0018\f\u0000\u00d8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00db\u0001\u0000"+
		"\u0000\u0000\u00da\u00dc\u0003\u0016\u000b\u0000\u00db\u00da\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u0013\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0003N\'\u0000\u00de\u00df\u0005\u0007\u0000"+
		"\u0000\u00df\u0015\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003N\'\u0000"+
		"\u00e1\u00e2\u0005\\\u0000\u0000\u00e2\u00e3\u0005\u0014\u0000\u0000\u00e3"+
		"\u00e4\u0005\u0007\u0000\u0000\u00e4\u00e5\u0005_\u0000\u0000\u00e5\u0017"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0006\u0000\u0000\u00e7\u00e8"+
		"\u0005\b\u0000\u0000\u00e8\u00e9\u0005h\u0000\u0000\u00e9\u00ea\u0005"+
		"$\u0000\u0000\u00ea\u00eb\u0005B\u0000\u0000\u00eb\u00ec\u0005G\u0000"+
		"\u0000\u00ec\u00ed\u0005V\u0000\u0000\u00ed\u00ee\u0005\u0010\u0000\u0000"+
		"\u00ee\u00ef\u0003N\'\u0000\u00ef\u00f0\u0005^\u0000\u0000\u00f0\u00f1"+
		"\u0005\t\u0000\u0000\u00f1\u00f2\u0005\n\u0000\u0000\u00f2\u00f3\u0005"+
		"C\u0000\u0000\u00f3\u00f4\u0005D\u0000\u0000\u00f4\u00f5\u0005E\u0000"+
		"\u0000\u00f5\u00f6\u0005_\u0000\u0000\u00f6\u0019\u0001\u0000\u0000\u0000"+
		"\u00f7\u010b\u0003\u001c\u000e\u0000\u00f8\u010b\u0003(\u0014\u0000\u00f9"+
		"\u010b\u0003*\u0015\u0000\u00fa\u010b\u0003,\u0016\u0000\u00fb\u010b\u0003"+
		".\u0017\u0000\u00fc\u010b\u00030\u0018\u0000\u00fd\u010b\u0003 \u0010"+
		"\u0000\u00fe\u010b\u0003\"\u0011\u0000\u00ff\u010b\u0003\u001e\u000f\u0000"+
		"\u0100\u010b\u00032\u0019\u0000\u0101\u010b\u00034\u001a\u0000\u0102\u010b"+
		"\u00036\u001b\u0000\u0103\u010b\u0003:\u001d\u0000\u0104\u010b\u0003<"+
		"\u001e\u0000\u0105\u010b\u0003@ \u0000\u0106\u010b\u0003B!\u0000\u0107"+
		"\u010b\u0003D\"\u0000\u0108\u010b\u00038\u001c\u0000\u0109\u010b\u0003"+
		"J%\u0000\u010a\u00f7\u0001\u0000\u0000\u0000\u010a\u00f8\u0001\u0000\u0000"+
		"\u0000\u010a\u00f9\u0001\u0000\u0000\u0000\u010a\u00fa\u0001\u0000\u0000"+
		"\u0000\u010a\u00fb\u0001\u0000\u0000\u0000\u010a\u00fc\u0001\u0000\u0000"+
		"\u0000\u010a\u00fd\u0001\u0000\u0000\u0000\u010a\u00fe\u0001\u0000\u0000"+
		"\u0000\u010a\u00ff\u0001\u0000\u0000\u0000\u010a\u0100\u0001\u0000\u0000"+
		"\u0000\u010a\u0101\u0001\u0000\u0000\u0000\u010a\u0102\u0001\u0000\u0000"+
		"\u0000\u010a\u0103\u0001\u0000\u0000\u0000\u010a\u0104\u0001\u0000\u0000"+
		"\u0000\u010a\u0105\u0001\u0000\u0000\u0000\u010a\u0106\u0001\u0000\u0000"+
		"\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u001b\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0003N\'\u0000\u010d\u0113\u0005M\u0000\u0000\u010e"+
		"\u010f\u0005\u000f\u0000\u0000\u010f\u0114\u0005\"\u0000\u0000\u0110\u0114"+
		"\u0005^\u0000\u0000\u0111\u0112\u0005h\u0000\u0000\u0112\u0114\u0005\""+
		"\u0000\u0000\u0113\u010e\u0001\u0000\u0000\u0000\u0113\u0110\u0001\u0000"+
		"\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u0115\u0117\u0005_\u0000\u0000\u0116\u0118\u0003\u000e\u0007"+
		"\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000"+
		"\u0000\u0118\u001d\u0001\u0000\u0000\u0000\u0119\u011a\u0005`\u0000\u0000"+
		"\u011a\u011b\u0003N\'\u0000\u011b\u0130\u0005M\u0000\u0000\u011c\u011d"+
		"\u0005\u000f\u0000\u0000\u011d\u0131\u0005\"\u0000\u0000\u011e\u0131\u0005"+
		"^\u0000\u0000\u011f\u0120\u0005h\u0000\u0000\u0120\u0127\u0005\"\u0000"+
		"\u0000\u0121\u0122\u0005\u0011\u0000\u0000\u0122\u0123\u0005O\u0000\u0000"+
		"\u0123\u0124\u0005\u0013\u0000\u0000\u0124\u0125\u0005\u000b\u0000\u0000"+
		"\u0125\u0126\u0005\n\u0000\u0000\u0126\u0128\u0005\u0003\u0000\u0000\u0127"+
		"\u0121\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128"+
		"\u0131\u0001\u0000\u0000\u0000\u0129\u012a\u0005^\u0000\u0000\u012a\u012b"+
		"\u0005\u0011\u0000\u0000\u012b\u012c\u0005O\u0000\u0000\u012c\u012d\u0005"+
		"\u0012\u0000\u0000\u012d\u012e\u0005\u000b\u0000\u0000\u012e\u012f\u0005"+
		"\n\u0000\u0000\u012f\u0131\u0005\u0003\u0000\u0000\u0130\u011c\u0001\u0000"+
		"\u0000\u0000\u0130\u011e\u0001\u0000\u0000\u0000\u0130\u011f\u0001\u0000"+
		"\u0000\u0000\u0130\u0129\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000"+
		"\u0000\u0000\u0132\u0134\u0005_\u0000\u0000\u0133\u0135\u0003\u000e\u0007"+
		"\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000"+
		"\u0000\u0135\u001f\u0001\u0000\u0000\u0000\u0136\u0137\u0005`\u0000\u0000"+
		"\u0137\u0138\u0003N\'\u0000\u0138\u0141\u0005W\u0000\u0000\u0139\u013a"+
		"\u0005h\u0000\u0000\u013a\u013f\u0005\"\u0000\u0000\u013b\u013c\u0005"+
		"\u000f\u0000\u0000\u013c\u013f\u0005\"\u0000\u0000\u013d\u013f\u0005^"+
		"\u0000\u0000\u013e\u0139\u0001\u0000\u0000\u0000\u013e\u013b\u0001\u0000"+
		"\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000"+
		"\u0000\u0000\u0140\u0142\u0005\u0016\u0000\u0000\u0141\u013e\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0147\u0005\u0014\u0000\u0000\u0144\u0148\u0005\u0015"+
		"\u0000\u0000\u0145\u0146\u0005%\u0000\u0000\u0146\u0148\u0005\"\u0000"+
		"\u0000\u0147\u0144\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014b\u0005_\u0000\u0000"+
		"\u014a\u014c\u0003\u000e\u0007\u0000\u014b\u014a\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0001\u0000\u0000\u0000\u014c!\u0001\u0000\u0000\u0000\u014d"+
		"\u0150\u0005`\u0000\u0000\u014e\u0151\u0003$\u0012\u0000\u014f\u0151\u0003"+
		"&\u0013\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u014f\u0001\u0000"+
		"\u0000\u0000\u0151#\u0001\u0000\u0000\u0000\u0152\u0153\u0003N\'\u0000"+
		"\u0153\u0154\u0005X\u0000\u0000\u0154\u0155\u0005^\u0000\u0000\u0155\u0156"+
		"\u0005_\u0000\u0000\u0156\u0160\u0001\u0000\u0000\u0000\u0157\u0158\u0005"+
		"^\u0000\u0000\u0158\u0159\u0005G\u0000\u0000\u0159\u015a\u0005X\u0000"+
		"\u0000\u015a\u015b\u0005+\u0000\u0000\u015b\u015c\u0003N\'\u0000\u015c"+
		"\u015d\u0005^\u0000\u0000\u015d\u015e\u0005_\u0000\u0000\u015e\u0160\u0001"+
		"\u0000\u0000\u0000\u015f\u0152\u0001\u0000\u0000\u0000\u015f\u0157\u0001"+
		"\u0000\u0000\u0000\u0160%\u0001\u0000\u0000\u0000\u0161\u0162\u0003N\'"+
		"\u0000\u0162\u0163\u0005X\u0000\u0000\u0163\u0164\u0005h\u0000\u0000\u0164"+
		"\u0165\u0005\"\u0000\u0000\u0165\u016f\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0005h\u0000\u0000\u0167\u0168\u0005\"\u0000\u0000\u0168\u0169\u0005"+
		"G\u0000\u0000\u0169\u016a\u0005X\u0000\u0000\u016a\u016b\u0005+\u0000"+
		"\u0000\u016b\u016c\u0003N\'\u0000\u016c\u016d\u0005^\u0000\u0000\u016d"+
		"\u016f\u0001\u0000\u0000\u0000\u016e\u0161\u0001\u0000\u0000\u0000\u016e"+
		"\u0166\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170"+
		"\u0172\u0005_\u0000\u0000\u0171\u0173\u0003\u000e\u0007\u0000\u0172\u0171"+
		"\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\'\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0003N\'\u0000\u0175\u0176\u0005O\u0000"+
		"\u0000\u0176\u0177\u0005^\u0000\u0000\u0177\u0178\u0005_\u0000\u0000\u0178"+
		")\u0001\u0000\u0000\u0000\u0179\u017a\u0003N\'\u0000\u017a\u017b\u0005"+
		"O\u0000\u0000\u017b\u0180\u0005^\u0000\u0000\u017c\u017d\u0005G\u0000"+
		"\u0000\u017d\u017e\u0005\u0017\u0000\u0000\u017e\u0181\u0005\f\u0000\u0000"+
		"\u017f\u0181\u0005\u000b\u0000\u0000\u0180\u017c\u0001\u0000\u0000\u0000"+
		"\u0180\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000"+
		"\u0182\u0183\u0005\n\u0000\u0000\u0183\u0184\u0005\u0002\u0000\u0000\u0184"+
		"\u0185\u0005_\u0000\u0000\u0185+\u0001\u0000\u0000\u0000\u0186\u0187\u0003"+
		"N\'\u0000\u0187\u0188\u0005O\u0000\u0000\u0188\u0189\u0005^\u0000\u0000"+
		"\u0189\u018a\u0005\u000b\u0000\u0000\u018a\u018b\u0005\n\u0000\u0000\u018b"+
		"\u018c\u0005\u0003\u0000\u0000\u018c\u018d\u0005_\u0000\u0000\u018d-\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0003N\'\u0000\u018f\u0190\u0005O\u0000"+
		"\u0000\u0190\u0191\u0005^\u0000\u0000\u0191\u0192\u0005\u000b\u0000\u0000"+
		"\u0192\u0193\u0005\n\u0000\u0000\u0193\u0194\u0005\u0004\u0000\u0000\u0194"+
		"\u0195\u0005_\u0000\u0000\u0195/\u0001\u0000\u0000\u0000\u0196\u0198\u0005"+
		"`\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0003N\'"+
		"\u0000\u019a\u019b\u0005P\u0000\u0000\u019b\u019c\u0005^\u0000\u0000\u019c"+
		"\u019d\u0005\u000b\u0000\u0000\u019d\u01a4\u0005^\u0000\u0000\u019e\u019f"+
		"\u0005\u0010\u0000\u0000\u019f\u01a0\u0005\n\u0000\u0000\u01a0\u01a5\u0005"+
		"\u0003\u0000\u0000\u01a1\u01a2\u0005\f\u0000\u0000\u01a2\u01a3\u0005\n"+
		"\u0000\u0000\u01a3\u01a5\u0005\u0002\u0000\u0000\u01a4\u019e\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a1\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a7\u0005_\u0000\u0000\u01a71\u0001\u0000\u0000\u0000"+
		"\u01a8\u01aa\u0005`\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ac\u0003N\'\u0000\u01ac\u01ad\u0005Q\u0000\u0000\u01ad\u01ae\u0005"+
		"^\u0000\u0000\u01ae\u01af\u0005\u000b\u0000\u0000\u01af\u01b6\u0005^\u0000"+
		"\u0000\u01b0\u01b1\u0005\f\u0000\u0000\u01b1\u01b2\u0005\n\u0000\u0000"+
		"\u01b2\u01b7\u0005\u0002\u0000\u0000\u01b3\u01b4\u0005\u0010\u0000\u0000"+
		"\u01b4\u01b5\u0005\n\u0000\u0000\u01b5\u01b7\u0005\u0003\u0000\u0000\u01b6"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b6\u01b3\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005_\u0000\u0000\u01b93\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bb\u0003N\'\u0000\u01bb\u01bc\u0005S\u0000"+
		"\u0000\u01bc\u01bd\u0005^\u0000\u0000\u01bd\u01be\u0005\u000b\u0000\u0000"+
		"\u01be\u01bf\u0005\n\u0000\u0000\u01bf\u01c0\u0005\u0003\u0000\u0000\u01c0"+
		"\u01d0\u0005_\u0000\u0000\u01c1\u01c5\u0005`\u0000\u0000\u01c2\u01c3\u0005"+
		"h\u0000\u0000\u01c3\u01c6\u0005\"\u0000\u0000\u01c4\u01c6\u0005^\u0000"+
		"\u0000\u01c5\u01c2\u0001\u0000\u0000\u0000\u01c5\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005G\u0000\u0000"+
		"\u01c8\u01c9\u0005X\u0000\u0000\u01c9\u01ca\u0005+\u0000\u0000\u01ca\u01cb"+
		"\u0003N\'\u0000\u01cb\u01cc\u0005^\u0000\u0000\u01cc\u01ce\u0005_\u0000"+
		"\u0000\u01cd\u01cf\u0003\u000e\u0007\u0000\u01ce\u01cd\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d0\u01c1\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d1\u01db\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005`\u0000\u0000"+
		"\u01d3\u01d4\u0005^\u0000\u0000\u01d4\u01d5\u0005G\u0000\u0000\u01d5\u01d6"+
		"\u0005X\u0000\u0000\u01d6\u01d7\u0005+\u0000\u0000\u01d7\u01d8\u0003N"+
		"\'\u0000\u01d8\u01d9\u0005^\u0000\u0000\u01d9\u01da\u0005_\u0000\u0000"+
		"\u01da\u01dc\u0001\u0000\u0000\u0000\u01db\u01d2\u0001\u0000\u0000\u0000"+
		"\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc5\u0001\u0000\u0000\u0000\u01dd"+
		"\u01de\u0005`\u0000\u0000\u01de\u01df\u0003N\'\u0000\u01df\u01e0\u0005"+
		"^\u0000\u0000\u01e0\u01e1\u0005G\u0000\u0000\u01e1\u01e2\u0005Y\u0000"+
		"\u0000\u01e2\u01e3\u0005\u0018\u0000\u0000\u01e3\u01e4\u0003N\'\u0000"+
		"\u01e4\u01e5\u0005^\u0000\u0000\u01e5\u01e6\u0005\u000b\u0000\u0000\u01e6"+
		"\u01e7\u0005\u0019\u0000\u0000\u01e7\u01e8\u0005\n\u0000\u0000\u01e8\u01e9"+
		"\u0005\u0005\u0000\u0000\u01e9\u01ea\u0005\u0006\u0000\u0000\u01ea\u01eb"+
		"\u0005_\u0000\u0000\u01eb7\u0001\u0000\u0000\u0000\u01ec\u01ed\u0003N"+
		"\'\u0000\u01ed\u01ee\u0005^\u0000\u0000\u01ee\u01ef\u0005g\u0000\u0000"+
		"\u01ef\u01f0\u0005?\u0000\u0000\u01f0\u01f1\u0005@\u0000\u0000\u01f1\u01f2"+
		"\u0005G\u0000\u0000\u01f2\u01f3\u0005R\u0000\u0000\u01f3\u01f4\u0005_"+
		"\u0000\u0000\u01f4\u01f5\u0005`\u0000\u0000\u01f5\u01f6\u0005$\u0000\u0000"+
		"\u01f6\u01f7\u0005\u000b\u0000\u0000\u01f7\u01f8\u0005^\u0000\u0000\u01f8"+
		"\u01f9\u0005G\u0000\u0000\u01f9\u01fa\u0005A\u0000\u0000\u01fa\u01fb\u0005"+
		"_\u0000\u0000\u01fb9\u0001\u0000\u0000\u0000\u01fc\u01fd\u0003N\'\u0000"+
		"\u01fd\u01fe\u0005^\u0000\u0000\u01fe\u01ff\u0005R\u0000\u0000\u01ff\u0200"+
		"\u0005^\u0000\u0000\u0200\u0202\u0005_\u0000\u0000\u0201\u0203\u0003\u000e"+
		"\u0007\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000"+
		"\u0000\u0000\u0203;\u0001\u0000\u0000\u0000\u0204\u0205\u0003N\'\u0000"+
		"\u0205\u0206\u0005^\u0000\u0000\u0206\u0207\u0005R\u0000\u0000\u0207\u020f"+
		"\u0005^\u0000\u0000\u0208\u0209\u0005\u0010\u0000\u0000\u0209\u020a\u0003"+
		"N\'\u0000\u020a\u020b\u0005^\u0000\u0000\u020b\u020c\u0005\t\u0000\u0000"+
		"\u020c\u020d\u0005h\u0000\u0000\u020d\u020e\u0005$\u0000\u0000\u020e\u0210"+
		"\u0001\u0000\u0000\u0000\u020f\u0208\u0001\u0000\u0000\u0000\u020f\u0210"+
		"\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0213"+
		"\u0005_\u0000\u0000\u0212\u0214\u0003>\u001f\u0000\u0213\u0212\u0001\u0000"+
		"\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0216\u0001\u0000"+
		"\u0000\u0000\u0215\u0217\u0003F#\u0000\u0216\u0215\u0001\u0000\u0000\u0000"+
		"\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u021b\u0001\u0000\u0000\u0000"+
		"\u0218\u021a\u0003J%\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u021a\u021d"+
		"\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021c"+
		"\u0001\u0000\u0000\u0000\u021c=\u0001\u0000\u0000\u0000\u021d\u021b\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0003N\'\u0000\u021f\u0220\u0005^\u0000"+
		"\u0000\u0220\u0222\u0005[\u0000\u0000\u0221\u0223\u0005`\u0000\u0000\u0222"+
		"\u0221\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223"+
		"\u0224\u0001\u0000\u0000\u0000\u0224\u0225\u0005h\u0000\u0000\u0225\u0226"+
		"\u0007\u0004\u0000\u0000\u0226\u0227\u0005$\u0000\u0000\u0227\u0228\u0005"+
		"0\u0000\u0000\u0228\u0229\u0005\r\u0000\u0000\u0229\u022a\u0005i\u0000"+
		"\u0000\u022a\u022b\u0007\u0005\u0000\u0000\u022b\u022c\u0005_\u0000\u0000"+
		"\u022c?\u0001\u0000\u0000\u0000\u022d\u022e\u0005`\u0000\u0000\u022e\u022f"+
		"\u0003N\'\u0000\u022f\u0230\u0005T\u0000\u0000\u0230\u0234\u0003N\'\u0000"+
		"\u0231\u0235\u0005^\u0000\u0000\u0232\u0233\u0005h\u0000\u0000\u0233\u0235"+
		"\u0005\"\u0000\u0000\u0234\u0231\u0001\u0000\u0000\u0000\u0234\u0232\u0001"+
		"\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u023c\u0005"+
		"\u000b\u0000\u0000\u0237\u0238\u0005\u0014\u0000\u0000\u0238\u023d\u0005"+
		"#\u0000\u0000\u0239\u023a\u0005\n\u0000\u0000\u023a\u023b\u0005%\u0000"+
		"\u0000\u023b\u023d\u0005\"\u0000\u0000\u023c\u0237\u0001\u0000\u0000\u0000"+
		"\u023c\u0239\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000"+
		"\u023e\u0240\u0005_\u0000\u0000\u023f\u0241\u0003\u000e\u0007\u0000\u0240"+
		"\u023f\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241"+
		"A\u0001\u0000\u0000\u0000\u0242\u0243\u0005`\u0000\u0000\u0243\u0244\u0003"+
		"N\'\u0000\u0244\u0245\u0005U\u0000\u0000\u0245\u0246\u0005h\u0000\u0000"+
		"\u0246\u0247\u0005\"\u0000\u0000\u0247\u0248\u0005\u0010\u0000\u0000\u0248"+
		"\u0249\u0005\n\u0000\u0000\u0249\u024a\u0005F\u0000\u0000\u024a\u024b"+
		"\u0005\r\u0000\u0000\u024b\u024c\u0005\u0014\u0000\u0000\u024c\u024d\u0005"+
		"\u0015\u0000\u0000\u024d\u024e\u0005_\u0000\u0000\u024eC\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0003N\'\u0000\u0250\u0251\u0005<\u0000\u0000\u0251"+
		"\u0252\u0005[\u0000\u0000\u0252\u0253\u0005\u000e\u0000\u0000\u0253\u0254"+
		"\u0005=\u0000\u0000\u0254\u0255\u0005\f\u0000\u0000\u0255\u0256\u0005"+
		">\u0000\u0000\u0256\u0257\u0005_\u0000\u0000\u0257E\u0001\u0000\u0000"+
		"\u0000\u0258\u0259\u0005`\u0000\u0000\u0259\u025a\u0005$\u0000\u0000\u025a"+
		"\u025b\u0005\'\u0000\u0000\u025b\u025d\u0005d\u0000\u0000\u025c\u025e"+
		"\u0003H$\u0000\u025d\u025c\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000"+
		"\u0000\u0000\u025f\u025d\u0001\u0000\u0000\u0000\u025f\u0260\u0001\u0000"+
		"\u0000\u0000\u0260G\u0001\u0000\u0000\u0000\u0261\u0262\u0005b\u0000\u0000"+
		"\u0262\u0263\u0005(\u0000\u0000\u0263\u0264\u0005$\u0000\u0000\u0264\u0265"+
		"\u0005d\u0000\u0000\u0265\u0266\u0005h\u0000\u0000\u0266\u029a\u0005$"+
		"\u0000\u0000\u0267\u0268\u0005b\u0000\u0000\u0268\u0269\u0005e\u0000\u0000"+
		"\u0269\u026a\u0005*\u0000\u0000\u026a\u026b\u0005f\u0000\u0000\u026b\u026c"+
		"\u0005^\u0000\u0000\u026c\u026d\u0005d\u0000\u0000\u026d\u026e\u0005h"+
		"\u0000\u0000\u026e\u029a\u0005$\u0000\u0000\u026f\u0270\u0005b\u0000\u0000"+
		"\u0270\u0271\u00053\u0000\u0000\u0271\u0272\u0005\u000b\u0000\u0000\u0272"+
		"\u0273\u0005i\u0000\u0000\u0273\u0274\u0005d\u0000\u0000\u0274\u0275\u0005"+
		"h\u0000\u0000\u0275\u029a\u0005$\u0000\u0000\u0276\u0277\u0005b\u0000"+
		"\u0000\u0277\u0278\u00054\u0000\u0000\u0278\u0279\u0005\u000b\u0000\u0000"+
		"\u0279\u027a\u0005i\u0000\u0000\u027a\u027c\u0005d\u0000\u0000\u027b\u027d"+
		"\u0005`\u0000\u0000\u027c\u027b\u0001\u0000\u0000\u0000\u027c\u027d\u0001"+
		"\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u027f\u0005"+
		"h\u0000\u0000\u027f\u029a\u0005$\u0000\u0000\u0280\u0281\u0005b\u0000"+
		"\u0000\u0281\u0282\u0005h\u0000\u0000\u0282\u0283\u0005P\u0000\u0000\u0283"+
		"\u0284\u0005i\u0000\u0000\u0284\u0285\u0005d\u0000\u0000\u0285\u0286\u0005"+
		"h\u0000\u0000\u0286\u029a\u0005$\u0000\u0000\u0287\u0288\u0005b\u0000"+
		"\u0000\u0288\u0289\u0005h\u0000\u0000\u0289\u028a\u0005%\u0000\u0000\u028a"+
		"\u028b\u0005\"\u0000\u0000\u028b\u028c\u0005d\u0000\u0000\u028c\u028d"+
		"\u0005h\u0000\u0000\u028d\u029a\u0005$\u0000\u0000\u028e\u028f\u0005b"+
		"\u0000\u0000\u028f\u0290\u0005$\u0000\u0000\u0290\u0291\u0005d\u0000\u0000"+
		"\u0291\u0292\u0005h\u0000\u0000\u0292\u029a\u0005$\u0000\u0000\u0293\u0294"+
		"\u0005b\u0000\u0000\u0294\u0295\u0005)\u0000\u0000\u0295\u0296\u0005$"+
		"\u0000\u0000\u0296\u0297\u0005d\u0000\u0000\u0297\u0298\u0005h\u0000\u0000"+
		"\u0298\u029a\u0005$\u0000\u0000\u0299\u0261\u0001\u0000\u0000\u0000\u0299"+
		"\u0267\u0001\u0000\u0000\u0000\u0299\u026f\u0001\u0000\u0000\u0000\u0299"+
		"\u0276\u0001\u0000\u0000\u0000\u0299\u0280\u0001\u0000\u0000\u0000\u0299"+
		"\u0287\u0001\u0000\u0000\u0000\u0299\u028e\u0001\u0000\u0000\u0000\u0299"+
		"\u0293\u0001\u0000\u0000\u0000\u029aI\u0001\u0000\u0000\u0000\u029b\u029c"+
		"\u0003N\'\u0000\u029c\u029d\u0005^\u0000\u0000\u029d\u029e\u0005G\u0000"+
		"\u0000\u029e\u029f\u0005Z\u0000\u0000\u029f\u02b7\u0005c\u0000\u0000\u02a0"+
		"\u02a1\u0005`\u0000\u0000\u02a1\u02a2\u0005h\u0000\u0000\u02a2\u02a3\u0005"+
		"\"\u0000\u0000\u02a3\u02a4\u0005G\u0000\u0000\u02a4\u02a5\u0005X\u0000"+
		"\u0000\u02a5\u02a6\u0005+\u0000\u0000\u02a6\u02a7\u0003N\'\u0000\u02a7"+
		"\u02a8\u0005^\u0000\u0000\u02a8\u02aa\u0005_\u0000\u0000\u02a9\u02ab\u0003"+
		"\u000e\u0007\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001"+
		"\u0000\u0000\u0000\u02ab\u02b8\u0001\u0000\u0000\u0000\u02ac\u02ae\u0005"+
		"`\u0000\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000"+
		"\u0000\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02b0\u0005^\u0000"+
		"\u0000\u02b0\u02b1\u0005G\u0000\u0000\u02b1\u02b2\u0005X\u0000\u0000\u02b2"+
		"\u02b3\u0005+\u0000\u0000\u02b3\u02b4\u0003N\'\u0000\u02b4\u02b5\u0005"+
		"^\u0000\u0000\u02b5\u02b6\u0005_\u0000\u0000\u02b6\u02b8\u0001\u0000\u0000"+
		"\u0000\u02b7\u02a0\u0001\u0000\u0000\u0000\u02b7\u02ad\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u02ee\u0001\u0000\u0000"+
		"\u0000\u02b9\u02ba\u0003N\'\u0000\u02ba\u02bb\u0005[\u0000\u0000\u02bb"+
		"\u02bc\u0007\u0002\u0000\u0000\u02bc\u02bd\u0005%\u0000\u0000\u02bd\u02be"+
		"\u0005\"\u0000\u0000\u02be\u02bf\u0005_\u0000\u0000\u02bf\u02ee\u0001"+
		"\u0000\u0000\u0000\u02c0\u02c1\u0005\u000f\u0000\u0000\u02c1\u02c4\u0005"+
		"\"\u0000\u0000\u02c2\u02c4\u0005^\u0000\u0000\u02c3\u02c0\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c6\u0005G\u0000\u0000\u02c6\u02c7\u0005N\u0000\u0000"+
		"\u02c7\u02c8\u0005\u000b\u0000\u0000\u02c8\u02c9\u0003N\'\u0000\u02c9"+
		"\u02ca\u0005#\u0000\u0000\u02ca\u02cb\u0005_\u0000\u0000\u02cb\u02ee\u0001"+
		"\u0000\u0000\u0000\u02cc\u02cd\u0003N\'\u0000\u02cd\u02ce\u0005^\u0000"+
		"\u0000\u02ce\u02cf\u0005G\u0000\u0000\u02cf\u02d0\u0005\u0017\u0000\u0000"+
		"\u02d0\u02d1\u0005\f\u0000\u0000\u02d1\u02d2\u0005\n\u0000\u0000\u02d2"+
		"\u02d3\u0005\u0002\u0000\u0000\u02d3\u02d4\u0005_\u0000\u0000\u02d4\u02ee"+
		"\u0001\u0000\u0000\u0000\u02d5\u02d6\u0005`\u0000\u0000\u02d6\u02d7\u0003"+
		"N\'\u0000\u02d7\u02d8\u0005^\u0000\u0000\u02d8\u02d9\u0005G\u0000\u0000"+
		"\u02d9\u02da\u0005\u0017\u0000\u0000\u02da\u02db\u0005E\u0000\u0000\u02db"+
		"\u02dc\u0005_\u0000\u0000\u02dc\u02ee\u0001\u0000\u0000\u0000\u02dd\u02de"+
		"\u0005`\u0000\u0000\u02de\u02df\u0003N\'\u0000\u02df\u02e0\u0005^\u0000"+
		"\u0000\u02e0\u02e1\u0005[\u0000\u0000\u02e1\u02e2\u0005h\u0000\u0000\u02e2"+
		"\u02e3\u0005$\u0000\u0000\u02e3\u02e4\u0005_\u0000\u0000\u02e4\u02ee\u0001"+
		"\u0000\u0000\u0000\u02e5\u02e6\u0005`\u0000\u0000\u02e6\u02e7\u0003N\'"+
		"\u0000\u02e7\u02e8\u0005^\u0000\u0000\u02e8\u02e9\u0005]\u0000\u0000\u02e9"+
		"\u02ea\u0005h\u0000\u0000\u02ea\u02eb\u0005$\u0000\u0000\u02eb\u02ec\u0005"+
		"_\u0000\u0000\u02ec\u02ee\u0001\u0000\u0000\u0000\u02ed\u029b\u0001\u0000"+
		"\u0000\u0000\u02ed\u02b9\u0001\u0000\u0000\u0000\u02ed\u02c3\u0001\u0000"+
		"\u0000\u0000\u02ed\u02cc\u0001\u0000\u0000\u0000\u02ed\u02d5\u0001\u0000"+
		"\u0000\u0000\u02ed\u02dd\u0001\u0000\u0000\u0000\u02ed\u02e5\u0001\u0000"+
		"\u0000\u0000\u02eeK\u0001\u0000\u0000\u0000\u02ef\u02f0\u0005&\u0000\u0000"+
		"\u02f0\u02f1\u0005%\u0000\u0000\u02f1\u02f2\u0005\"\u0000\u0000\u02f2"+
		"\u02f3\u0005[\u0000\u0000\u02f3\u02f4\u0005_\u0000\u0000\u02f4\u02f5\u0003"+
		"N\'\u0000\u02f5\u02f6\u0005K\u0000\u0000\u02f6\u02f7\u0005_\u0000\u0000"+
		"\u02f7\u0328\u0001\u0000\u0000\u0000\u02f8\u02f9\u00055\u0000\u0000\u02f9"+
		"\u02fa\u0005[\u0000\u0000\u02fa\u02fb\u0005&\u0000\u0000\u02fb\u02fc\u0005"+
		"\r\u0000\u0000\u02fc\u02fd\u0005\u0014\u0000\u0000\u02fd\u02fe\u0005%"+
		"\u0000\u0000\u02fe\u02ff\u0005\"\u0000\u0000\u02ff\u0300\u0005_\u0000"+
		"\u0000\u0300\u0301\u0003N\'\u0000\u0301\u0302\u0005K\u0000\u0000\u0302"+
		"\u0303\u0005_\u0000\u0000\u0303\u0328\u0001\u0000\u0000\u0000\u0304\u0305"+
		"\u00055\u0000\u0000\u0305\u0306\u0005L\u0000\u0000\u0306\u0307\u0005_"+
		"\u0000\u0000\u0307\u0308\u0003N\'\u0000\u0308\u0309\u0005K\u0000\u0000"+
		"\u0309\u030a\u0005_\u0000\u0000\u030a\u0328\u0001\u0000\u0000\u0000\u030b"+
		"\u030c\u00056\u0000\u0000\u030c\u030d\u0005L\u0000\u0000\u030d\u030e\u0005"+
		"_\u0000\u0000\u030e\u030f\u0003N\'\u0000\u030f\u0310\u0005K\u0000\u0000"+
		"\u0310\u0311\u0005_\u0000\u0000\u0311\u0328\u0001\u0000\u0000\u0000\u0312"+
		"\u0313\u00055\u0000\u0000\u0313\u0314\u0005G\u0000\u0000\u0314\u0315\u0005"+
		"7\u0000\u0000\u0315\u0316\u0005\t\u0000\u0000\u0316\u0317\u00058\u0000"+
		"\u0000\u0317\u0318\u00059\u0000\u0000\u0318\u0319\u0005_\u0000\u0000\u0319"+
		"\u031a\u0003N\'\u0000\u031a\u031b\u0005K\u0000\u0000\u031b\u031c\u0005"+
		"_\u0000\u0000\u031c\u0328\u0001\u0000\u0000\u0000\u031d\u031e\u0005Z\u0000"+
		"\u0000\u031e\u031f\u0005\u0018\u0000\u0000\u031f\u0320\u0005:\u0000\u0000"+
		"\u0320\u0321\u0005;\u0000\u0000\u0321\u0322\u0005\u0006\u0000\u0000\u0322"+
		"\u0323\u0005_\u0000\u0000\u0323\u0324\u0003N\'\u0000\u0324\u0325\u0005"+
		"K\u0000\u0000\u0325\u0326\u0005_\u0000\u0000\u0326\u0328\u0001\u0000\u0000"+
		"\u0000\u0327\u02ef\u0001\u0000\u0000\u0000\u0327\u02f8\u0001\u0000\u0000"+
		"\u0000\u0327\u0304\u0001\u0000\u0000\u0000\u0327\u030b\u0001\u0000\u0000"+
		"\u0000\u0327\u0312\u0001\u0000\u0000\u0000\u0327\u031d\u0001\u0000\u0000"+
		"\u0000\u0328M\u0001\u0000\u0000\u0000\u0329\u032a\u0005i\u0000\u0000\u032a"+
		"O\u0001\u0000\u0000\u00008T`fl\u0096\u00a4\u00a6\u00aa\u00ba\u00bf\u00c8"+
		"\u00ce\u00d4\u00d8\u00db\u010a\u0113\u0117\u0127\u0130\u0134\u013e\u0141"+
		"\u0147\u014b\u0150\u015f\u016e\u0172\u0180\u0197\u01a4\u01a9\u01b6\u01c5"+
		"\u01ce\u01d0\u01db\u0202\u020f\u0213\u0216\u021b\u0222\u0234\u023c\u0240"+
		"\u025f\u027c\u0299\u02aa\u02ad\u02b7\u02c3\u02ed\u0327";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}