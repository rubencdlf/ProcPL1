// Generated from PokemonLog.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PokemonLogParser}.
 */
public interface PokemonLogListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#start_game}.
	 * @param ctx the parse tree
	 */
	void enterStart_game(PokemonLogParser.Start_gameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#start_game}.
	 * @param ctx the parse tree
	 */
	void exitStart_game(PokemonLogParser.Start_gameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#setup_block}.
	 * @param ctx the parse tree
	 */
	void enterSetup_block(PokemonLogParser.Setup_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#setup_block}.
	 * @param ctx the parse tree
	 */
	void exitSetup_block(PokemonLogParser.Setup_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#coin_selection}.
	 * @param ctx the parse tree
	 */
	void enterCoin_selection(PokemonLogParser.Coin_selectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#coin_selection}.
	 * @param ctx the parse tree
	 */
	void exitCoin_selection(PokemonLogParser.Coin_selectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#coin_result}.
	 * @param ctx the parse tree
	 */
	void enterCoin_result(PokemonLogParser.Coin_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#coin_result}.
	 * @param ctx the parse tree
	 */
	void exitCoin_result(PokemonLogParser.Coin_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#first_decision}.
	 * @param ctx the parse tree
	 */
	void enterFirst_decision(PokemonLogParser.First_decisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#first_decision}.
	 * @param ctx the parse tree
	 */
	void exitFirst_decision(PokemonLogParser.First_decisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#drew_result}.
	 * @param ctx the parse tree
	 */
	void enterDrew_result(PokemonLogParser.Drew_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#drew_result}.
	 * @param ctx the parse tree
	 */
	void exitDrew_result(PokemonLogParser.Drew_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#mulligan_block}.
	 * @param ctx the parse tree
	 */
	void enterMulligan_block(PokemonLogParser.Mulligan_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#mulligan_block}.
	 * @param ctx the parse tree
	 */
	void exitMulligan_block(PokemonLogParser.Mulligan_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#cards_list}.
	 * @param ctx the parse tree
	 */
	void enterCards_list(PokemonLogParser.Cards_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#cards_list}.
	 * @param ctx the parse tree
	 */
	void exitCards_list(PokemonLogParser.Cards_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#initial_play}.
	 * @param ctx the parse tree
	 */
	void enterInitial_play(PokemonLogParser.Initial_playContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#initial_play}.
	 * @param ctx the parse tree
	 */
	void exitInitial_play(PokemonLogParser.Initial_playContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#players_turns}.
	 * @param ctx the parse tree
	 */
	void enterPlayers_turns(PokemonLogParser.Players_turnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#players_turns}.
	 * @param ctx the parse tree
	 */
	void exitPlayers_turns(PokemonLogParser.Players_turnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_starts_turn}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_starts_turn(PokemonLogParser.Player_starts_turnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_starts_turn}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_starts_turn(PokemonLogParser.Player_starts_turnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_ends_turn}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_ends_turn(PokemonLogParser.Player_ends_turnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_ends_turn}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_ends_turn(PokemonLogParser.Player_ends_turnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#pokemon_checkup}.
	 * @param ctx the parse tree
	 */
	void enterPokemon_checkup(PokemonLogParser.Pokemon_checkupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#pokemon_checkup}.
	 * @param ctx the parse tree
	 */
	void exitPokemon_checkup(PokemonLogParser.Pokemon_checkupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_plays}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_plays(PokemonLogParser.Player_playsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_plays}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_plays(PokemonLogParser.Player_playsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_draw_card}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_draw_card(PokemonLogParser.Player_draw_cardContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_draw_card}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_draw_card(PokemonLogParser.Player_draw_cardContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_sub_draw}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_sub_draw(PokemonLogParser.Player_sub_drawContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_sub_draw}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_sub_draw(PokemonLogParser.Player_sub_drawContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_shuffled}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_shuffled(PokemonLogParser.Player_shuffledContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_shuffled}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_shuffled(PokemonLogParser.Player_shuffledContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_discarded}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_discarded(PokemonLogParser.Player_discardedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_discarded}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_discarded(PokemonLogParser.Player_discardedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#discard_one_card}.
	 * @param ctx the parse tree
	 */
	void enterDiscard_one_card(PokemonLogParser.Discard_one_cardContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#discard_one_card}.
	 * @param ctx the parse tree
	 */
	void exitDiscard_one_card(PokemonLogParser.Discard_one_cardContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#discard_multiple_cards}.
	 * @param ctx the parse tree
	 */
	void enterDiscard_multiple_cards(PokemonLogParser.Discard_multiple_cardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#discard_multiple_cards}.
	 * @param ctx the parse tree
	 */
	void exitDiscard_multiple_cards(PokemonLogParser.Discard_multiple_cardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_played_card}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_played_card(PokemonLogParser.Player_played_cardContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_played_card}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_played_card(PokemonLogParser.Player_played_cardContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_plays_active_spot}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_plays_active_spot(PokemonLogParser.Player_plays_active_spotContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_plays_active_spot}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_plays_active_spot(PokemonLogParser.Player_plays_active_spotContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_plays_bench}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_plays_bench(PokemonLogParser.Player_plays_benchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_plays_bench}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_plays_bench(PokemonLogParser.Player_plays_benchContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_plays_stadium}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_plays_stadium(PokemonLogParser.Player_plays_stadiumContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_plays_stadium}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_plays_stadium(PokemonLogParser.Player_plays_stadiumContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_attaches_card}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_attaches_card(PokemonLogParser.Player_attaches_cardContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_attaches_card}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_attaches_card(PokemonLogParser.Player_attaches_cardContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_evolve}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_evolve(PokemonLogParser.Player_evolveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_evolve}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_evolve(PokemonLogParser.Player_evolveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_retreated}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_retreated(PokemonLogParser.Player_retreatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_retreated}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_retreated(PokemonLogParser.Player_retreatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_switch}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_switch(PokemonLogParser.Player_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_switch}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_switch(PokemonLogParser.Player_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#tera_effect}.
	 * @param ctx the parse tree
	 */
	void enterTera_effect(PokemonLogParser.Tera_effectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#tera_effect}.
	 * @param ctx the parse tree
	 */
	void exitTera_effect(PokemonLogParser.Tera_effectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_used_ability}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_used_ability(PokemonLogParser.Player_used_abilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_used_ability}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_used_ability(PokemonLogParser.Player_used_abilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_attack}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_attack(PokemonLogParser.Player_attackContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_attack}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_attack(PokemonLogParser.Player_attackContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#weakness_sentence}.
	 * @param ctx the parse tree
	 */
	void enterWeakness_sentence(PokemonLogParser.Weakness_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#weakness_sentence}.
	 * @param ctx the parse tree
	 */
	void exitWeakness_sentence(PokemonLogParser.Weakness_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_moved}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_moved(PokemonLogParser.Player_movedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_moved}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_moved(PokemonLogParser.Player_movedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_redeemable}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_redeemable(PokemonLogParser.Player_redeemableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_redeemable}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_redeemable(PokemonLogParser.Player_redeemableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_inactive}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_inactive(PokemonLogParser.Player_inactiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_inactive}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_inactive(PokemonLogParser.Player_inactiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#damage_breakdown}.
	 * @param ctx the parse tree
	 */
	void enterDamage_breakdown(PokemonLogParser.Damage_breakdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#damage_breakdown}.
	 * @param ctx the parse tree
	 */
	void exitDamage_breakdown(PokemonLogParser.Damage_breakdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#damage_item}.
	 * @param ctx the parse tree
	 */
	void enterDamage_item(PokemonLogParser.Damage_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#damage_item}.
	 * @param ctx the parse tree
	 */
	void exitDamage_item(PokemonLogParser.Damage_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#fight_consequence}.
	 * @param ctx the parse tree
	 */
	void enterFight_consequence(PokemonLogParser.Fight_consequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#fight_consequence}.
	 * @param ctx the parse tree
	 */
	void exitFight_consequence(PokemonLogParser.Fight_consequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#player_won}.
	 * @param ctx the parse tree
	 */
	void enterPlayer_won(PokemonLogParser.Player_wonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#player_won}.
	 * @param ctx the parse tree
	 */
	void exitPlayer_won(PokemonLogParser.Player_wonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PokemonLogParser#id_player}.
	 * @param ctx the parse tree
	 */
	void enterId_player(PokemonLogParser.Id_playerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PokemonLogParser#id_player}.
	 * @param ctx the parse tree
	 */
	void exitId_player(PokemonLogParser.Id_playerContext ctx);
}