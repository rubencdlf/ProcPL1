grammar PokemonLog;

// =========================================================================
// 1. REGLAS SINTÁCTICAS (PARSER)
// =========================================================================

// 0. Regla inicial
start_game:     setup_block 
                players_turns+ 
                player_won  
                EOF ; 

// 1. Bloque de preparación
setup_block:    SETUP 
                coin_selection 
                coin_result 
                first_decision
                drew_result* 
                initial_play* ;

coin_selection: id_player CHOOSE (HEADS | TAILS) FOR THE OPENING COIN FLIP DOT ;
coin_result:    id_player WIN THE COIN TOSS DOT ;
first_decision: id_player DECIDE TO GO FIRST DOT ;
drew_result:    id_player DRAW NUM CARD FOR THE OPENING HAND DOT 
                DASH NUM DRAW CARD DOT 
                cards_list? ;

cards_list:     BULLET ID_CARD (COMMA ID_CARD)* ;

initial_play:   player_plays_active_spot
            |   player_plays_bench ;

// 2. Bucle de turnos
players_turns:  player_starts_turn
                player_plays*
                player_ends_turn ;

// Cabeceras (El posesivo ya va incluido dentro de id_player)
player_starts_turn: id_player TURN ;
player_ends_turn:   id_player END THEIR TURN DOT ;

// Bucle de acciones
player_plays:   player_draw_card 
            |   player_played_card 
            |   player_plays_active_spot 
            |   player_plays_bench 
            |   player_attaches_card 
            |   player_shuffled
            |   player_sub_draw 
            |   player_evolve
            |   player_retreated
            |   player_switch
            |   player_used_ability
            |   player_attack 
            |   consecuencia_combate ;

// --- Acciones de robo y mazo ---
player_draw_card: id_player DRAW (A CARD | ID_CARD) DOT cards_list? ;
player_sub_draw:  DASH id_player DRAW (ID_CARD | NUM CARD) DOT cards_list? ;
player_shuffled:  DASH id_player SHUFFLE (NUM CARD INTO)? THEIR DECK DOT cards_list? ;

// --- Acciones de tablero ---
player_played_card:       id_player PLAY ID_CARD DOT ;
player_plays_active_spot: id_player PLAY ID_CARD TO THE ACTIVE_SPOT DOT ;
player_plays_bench:       id_player PLAY ID_CARD TO THE BENCH DOT ;
player_attaches_card:     id_player ATTACH ID_CARD TO ID_CARD (ON THE BENCH | IN THE ACTIVE_SPOT) DOT ;

player_evolve:            id_player EVOLVE ID_CARD TO ID_CARD (IN THE ACTIVE_SPOT | ON THE BENCH) DOT ;
player_retreated:         id_player RETREAT ID_CARD TO THE BENCH DOT DASH NUM CARD BE DISCARD FROM id_player ID_CARD DOT cards_list? ;

// --- Cambios de Pokémon ---
player_switch:            id_player PLAY ID_CARD DOT 
                          DASH id_player ID_CARD BE SWITCH_VERB WITH id_player ID_CARD TO BECOME THE ACTIVE POKEMON DOT 
                          id_player ID_CARD BE NOW IN THE ACTIVE_SPOT DOT ;

// --- Habilidades y Ataques ---
player_used_ability:      id_player ID_CARD USE ID_CARD DOT cards_list? ;

player_attack:            id_player ID_CARD USE ID_CARD ON id_player ID_CARD FOR NUM DAMAGE DOT damage_breakdown? ;

// Desglose del daño opcional tras atacar
damage_breakdown:         DASH DAMAGE BREAKDOWN COLON
                          BULLET BASE DAMAGE COLON NUM DAMAGE
                          BULLET PAREN_IZQ ITEM PAREN_DER ID_CARD COLON NUM DAMAGE
                          BULLET TOTAL DAMAGE COLON NUM DAMAGE ;

// Consecuencias independientes tras un ataque
consecuencia_combate:     id_player ID_CARD BE KNOCK_OUT EXCLAMATION (DASH NUM CARD BE DISCARD FROM id_player ID_CARD DOT cards_list? | ID_CARD BE DISCARD FROM id_player ID_CARD DOT)?
                    |     id_player TAKE (A | NUM) PRIZE CARD DOT 
                    |     (A CARD | ID_CARD) BE ADD TO id_player HAND DOT 
                    |     id_player ID_CARD BE NOW IN THE ACTIVE_SPOT DOT 
                    |     id_player PLAY PRIME_CATCHER DOT DASH id_player ID_CARD BE SWITCH_VERB WITH id_player ID_CARD TO BECOME THE ACTIVE POKEMON DOT DASH id_player ID_CARD BE SWITCH_VERB WITH id_player ID_CARD TO BECOME THE ACTIVE POKEMON DOT id_player ID_CARD BE NOW IN THE ACTIVE_SPOT DOT id_player ID_CARD BE NOW IN THE ACTIVE_SPOT DOT
                    |     id_player PLAY BOSS_ORDERS DOT DASH id_player ID_CARD BE SWITCH_VERB WITH id_player ID_CARD TO BECOME THE ACTIVE POKEMON DOT id_player ID_CARD BE NOW IN THE ACTIVE_SPOT DOT ;

// 3. Fin de la partida
player_won: ALL PRIZE CARD TAKE DOT id_player WIN DOT ;               

// Comodín para el jugador (Ahora absorbe opcionalmente el posesivo de forma nativa)
id_player: ID_TOKEN ;


// =========================================================================
// 2. REGLAS LÉXICAS (LEXER)
// =========================================================================

// --- Cabeceras y zonas ---
SETUP:       'Setup' ;
ACTIVE_SPOT: 'Active Spot' ;
BENCH:       'Bench' ;
ACTIVE:      'Active' ;
POKEMON:     'Pokémon' ; // Obligatorio UTF-8
TURN:        ('t'|'T')'urn' ;

// --- Preposiciones, artículos y palabras clave ---
FOR:        'for' ;
THE:        'the' ;
TO:         'to' ;
IN:         'in' ;
A:          'a' ;
ON:         'on' ;
THEIR:      'their' ;
DECK:       'deck' ;
INTO:       'into' ;
NOW:        'now' ;
WITH:       'with' ;
BECOME:     'become' ;
HEADS:      'heads' ;
TAILS:      'tails' ;
OPENING:    'opening' ;
COIN:       'coin' ;
FLIP:       'flip' ;
FIRST:      'first' ;
TOSS:       'toss' ;
CARD:       'card' ('s')? ;
HAND:       'hand' ;
DAMAGE:     'damage' ;
PRIZE:      'Prize' ;
ALL:        'All' ;
BREAKDOWN:  'breakdown' ;
BASE:       'Base' ;
TOTAL:      'Total' ;
ITEM:       'Item' ;
FROM:       'from' ;
PRIME_CATCHER: 'Prime Catcher' ;
BOSS_ORDERS: 'Boss\'s Orders' ;


// --- Verbos ---
BE:          'is' | 'was' | 'were' | 'are' ;
GO:          'go' ;
CHOOSE:      'chose' ;
DECIDE:      'decided' ;
WIN:         'won' | 'wins' ;
CONCEDE:     'conceded' ;
DRAW:        'drew' | 'drawn' ; 
ADD:         'added' ;
PLAY:        'played' ;
ATTACH:      'attached' ;
EVOLVE:      'evolved' ;
USE:         'used' ;
RETREAT:     'retreated' ;
MOVE:        'moved' ;
SHUFFLE:     'shuffled' ;
DISCARD:     'discarded' ;
SWITCH_VERB: 'switched' ; 
KNOCK_OUT:   'Knocked Out' ;
TAKE:        'took' | 'taken' ;
END:         'ended' ;


// ==========================================
// NOMBRES DE LAS CARTAS (El token unificado)
// ==========================================
ID_CARD: ID_POKEMON | ID_ENERGY_CARD | ID_TRAINER | ID_ABILITY | ID_ATTACK ;

fragment ID_POKEMON: 'Makuhita' | 'Okidogi' | 'Mega Lucario ex' | 'Solrock' | 'Riolu' | 'Hariyama' | 'Meowth ex' | 'Lunatone' | 'Fezandipiti ex' | 'Teal Mask Ogerpon ex' | 'Chikorita' | 'Bayleef' | 'Meganium' | 'Bulbasaur' | 'Ivysaur' | 'Mega Venusaur ex' | 'Frillish' | 'Jellicent ex' | 'Steven\'s Beldum' | 'Steven\'s Metang' | 'Steven\'s Metagross ex' | 'Mega Mawile ex' | 'Genesect ex' | 'Deino' | 'Zweilous' | 'Hydreigon ex' | 'Mew ex' | 'Latios' | 'Dusclops' | 'Dreepy' | 'Drakloak' | 'Dragapult ex' | 'Lillie\'s Clefairy ex' | 'Mega Skarmory ex' | 'N\'s Zorua' | 'N\'s Zoroark ex' | 'Pecharunt ex' | 'N\'s Darumaka' | 'N\'s Reshiram' | 'N\'s Darmanitan' | 'N\'s Zekrom' | 'Fan Rotom' | 'Hoothoot' | 'Noctowl' | 'Dusknoir' | 'Duskull' | 'Charmander' | 'Charmeleon' | 'Mega Charizard X ex' | 'Mega Charizard Y ex' | 'Oricorio ex' | 'Reshiram' | 'Electrike' | 'Mega Manectric ex' | 'Mega Eelektross ex' | 'Eelektrik' | 'Tynamo' | 'Zekrom ex' | 'Zeraora' | 'Carvanha' | 'Mega Sharpedo ex' | 'Toxtricity' | 'Toxel' | 'Munkidori' | 'Seviper' ;

fragment ID_ENERGY_CARD: 'Basic Fighting Energy' | 'Rocky Fighting Energy' | 'Basic Grass Energy' | 'Basic Psychic Energy' | 'Basic Metal Energy' | 'Basic Darkness Energy' | 'Basic Fire Energy' | 'Basic Lightning Energy' | 'Prism Energy' | 'Neo Upper Energy' | 'Legacy Energy' ;

fragment ID_TRAINER: 'Lillie\'s Determination' | 'Fighting Gong' | 'Poké Pad' | 'Switch' | 'Night Stretcher' | 'Premium Power Pro' | 'Ultra Ball' | 'Judge' | 'Tarragon' | 'Team Rocket\'s Petrel' | 'Gravity Mountain' | 'Air Balloon' | 'Bug Catching Set' | 'Forest of Vitality' | 'Wally\'s Compassion' | 'Boss\'s Orders' | 'Grand Tree' | 'Colress\'s Tenacity' | 'Lana\'s Aid' | 'Salvatore' | 'Energy Recycler' | 'Buddy-Buddy Poffin' | 'Full Metal Lab' | 'Rare Candy' | 'Dawn' | 'Unfair Stamp' | 'Black Belt\'s Training' | 'Scramble Switch' | 'Maximum Belt' | 'Energy Search' | 'Crispin' | 'N\'s Castle' | 'N\'s PP Up' | 'Hero\'s Cape' | 'Redeemable Ticket' | 'Cyrano' | 'Jamming Tower' | 'Energy Retrieval' | 'Secret Box' | 'Academy at Night' | 'Binding Mochi' | 'Janine\'s Secret Art' | 'Hilda' | 'Firebreather' | 'Battle Cage' | 'Mega Signal' | 'Precious Trolley' | 'Carmine' | 'Iris\'s Fighting Spirit' | 'Canari' | 'Grimsley\'s Move' | 'Powerglass' ;

fragment ID_ABILITY: 'Last-Ditch Catch' | 'Lunar Cycle' | 'Flip the Script' | 'Heave-Ho Catcher' | 'Teal Dance' | 'Solar Transfer' | 'Metallic Signal' | 'Trade' | 'Subjugating Chains' | 'Fan Call' | 'Cursed Blast' | 'Recon Directive' | 'Turbo Impulse' | 'Dynamotor' | 'Sinister Surge' | 'Wild Growth' | 'X-Boot' | 'Oceanic Curse' | 'Adrena-Brain' ;

fragment ID_ATTACK: 'Aura Jab' | 'Mega Brave' | 'Wild Press' | 'Accelerating Stab' | 'Jungle Dump' | 'Razor Leaf' | 'Power Press' | 'Metal Stomp' | 'Gobble Down' | 'Huge Bite' | 'Myriad Leaf Shower' | 'Sonic Ripper' | 'Bind Down' | 'Cruel Arrow' | 'Teleportation Burst' | 'Obsidian' | 'Bite' | 'Dragon Headbutt' | 'X-Boot' | 'Phantom Dive' | 'Inferno X' | 'Cosmic Beam' | 'Flash Ray' | 'Riotous Blaster' | 'Hungry Jaws' | 'Night Joker' | 'Flamebody Cannon' | 'Thunderous Rage' | 'Powerful Rage' | 'Backdraft' ;

// ==========================================
// CARACTERES ESPECIALES
// ==========================================
DOT:         '.' ;
DASH:        '-' ;
COMMA:       ',' ;
BULLET:      '•' ;
EXCLAMATION: '!' ;
COLON:       ':' ;
PAREN_IZQ:   '(' ;
PAREN_DER:   ')' ;

// ==========================================
// COMODINES
// ==========================================
NUM:      [0-9]+ ;
// Este token absorbe un nombre alfanumérico y, OPCIONALMENTE, un apóstrofe y una s pegados.
ID_TOKEN: [a-zA-Z0-9]+ (('\''|'’')'s')? ;
WS:       [ \t\r\n]+ -> skip ;