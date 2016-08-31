package main;

import main.gui.*;
import main.gui.weap.WeapSelector;
import main.gui.armor.ArmorSelector;
import main.gui.player.PlayerSelector;
import main.manager.ArmorManager;
import main.manager.CharacterManager;
import main.manager.WeaponManager;
import main.model.armor.Armor;
import main.model.character.hero.Hero;
import main.model.character.monster.*;
import main.model.character.story.StoryCharacter;
import main.model.weapon.hero.HeroWeap;
import main.util.MessageUtils;

import java.util.Random;
import java.util.logging.Level;

/***********************************************
 King Land, The Roleplay gaming
 Build V. 1.0.1
 @Author:AndreaZago
 ************************************************/

public class Main {

    private boolean mistic = true;

    private boolean isMistic() {
        return mistic;
    }

    private Main(String country, String language) {
        MessageUtils.init( country, language );
    }

    public void setMistic(boolean mistic) {
        this.mistic = mistic;
    }

    private static void log(String aMessage){
        System.out.println(aMessage);
    }

    private void initialize() throws InterruptedException {

        /*
          Caricamento Traduzioni...
         */

        log("WelcomeDialog.welcomeDialog.pack.Start");

        // Avvio WelcomeDialog
        WelcomeDialog welcomeDialog = new WelcomeDialog();
        welcomeDialog.setWelcome1(MessageUtils.getLocalizedString( "welcome"));
        welcomeDialog.setWelcome2(MessageUtils.getLocalizedString( "dial1"));
        welcomeDialog.setWelcome3(MessageUtils.getLocalizedString( "dial2"));
        welcomeDialog.pack();
        welcomeDialog.setVisible(true);

        // Avvio LoadingDialog
        log("LoadingScreen.loadingScreen.pack.Start");
        LoadingScreen loadingScreen = new LoadingScreen();
        loadingScreen.pack();
        loadingScreen.setVisible(true);

        while (isMistic()) {

            log("isMistic.While.Start");

            /*
               Generazione Array e Random
             */

            CharacterManager characterManager = new CharacterManager();

            // Array degli eroi
            Hero[] theHero = new Hero[3];
            theHero[0] = characterManager.getHero( CharacterManager.ARMORED_SAMURAI );
            theHero[1] = characterManager.getHero( CharacterManager.RED_KNIGHT );
            theHero[2] = characterManager.getHero( CharacterManager.GOLDEN_KNIGHT );

            // Array dei mostri
            Monster[] theMonsters = new Monster[3];
            theMonsters[0] =  characterManager.getMonster( CharacterManager.THUG );
            theMonsters[1] =  characterManager.getMonster( CharacterManager.OGRE );
            theMonsters[2] =  characterManager.getMonster( CharacterManager.DARKNESS_KNIGHT );

            // Array Personaggi della storia
            StoryCharacter[] theStoryC = new StoryCharacter[2];
            theStoryC[0] = characterManager.getStoryCharacter(CharacterManager.EXECUTIONER);
            theStoryC[1] = characterManager.getStoryCharacter(CharacterManager.KING_VLAD);

            /*
              AVVIO PlayerSelector
              Qui si avvia il Dialog PlayerSelector permettendo all'utente di scegliere il proprio eroe
             */

            log("listOfHero.ArrayList.pack.Start");

            // Avvio dialog
            PlayerSelector secplayer = new PlayerSelector(theHero);

            /*
              AVVIO WeaponSelector
              Qui si avvia il dialog WeaponSelector, permettendo all'utente di scegliere la propria arma!
             */

            Random generator = new Random();

            WeaponManager weaponManager = new WeaponManager();

            HeroWeap[] weaponsA = new HeroWeap[3];
            weaponsA[0] = weaponManager.getHeroWeapon( WeaponManager.ALABARD_WEAPON );
            weaponsA[1] = weaponManager.getHeroWeapon( WeaponManager.HAMMER_WEAPON );
            weaponsA[2] = weaponManager.getHeroWeapon( WeaponManager.SWORD_WEAPON );

            log("weapons.getWeapon.WeaponManager.new");

            WeapSelector secweapon = new WeapSelector(weaponsA);
            secplayer.getSelectedHero().setWeapon( secweapon.getSelectedWeapon() );

            /*
              AVVIO ArmorSelector
              Qui si avvia il dialog ArmorSelector, permettendo all'utente di scegliere la propria armatura!
             */

            log("listOfArmor.ArrayList.pack.Start");

            ArmorManager armorManager = new ArmorManager();

            //Lista delle armature
            Armor[] armorList = new Armor[3];
            armorList[0] = armorManager.getArmor( ArmorManager.FIRE_ARMOR );
            armorList[1] = armorManager.getArmor( ArmorManager.KRUNE_ARMOR );
            armorList[2] = armorManager.getArmor( ArmorManager.MARKART_ARMOR );

            // Avvio dialog
            ArmorSelector secarmor = new ArmorSelector(armorList);
            secplayer.getSelectedHero().setArmor( secarmor.getCurrentArmor() );

            /*
              AVVIO showPlayerDialog
              Qui si avvia il dialog ShowPlayer, che mostra i nomi dei personaggi di gioco!
             */

            log("ShowPlay.caratt.pack.Start");

            ShowSelectedCharacter showSelectedCharacter;
            Monster monster;
            switch (generator.nextInt(3)){
                case 0:
                    monster = characterManager.getMonster( CharacterManager.OGRE );
                    monster.setArmor( armorManager.getArmor( ArmorManager.FIRE_ARMOR ) );
                    monster.setWeapon( weaponManager.getMonsterWeapon( WeaponManager.MACE_WEAPON ) );
                    showSelectedCharacter = new ShowSelectedCharacter(secplayer.getSelectedHero(), monster);
                    showSelectedCharacter.setYourEnemy((MessageUtils.getLocalizedString( "yourEnemy" )));
                    showSelectedCharacter.setYourHero((MessageUtils.getLocalizedString( "yourHero" )));
                    break;
                case 1:
                    monster = characterManager.getMonster( CharacterManager.DARKNESS_KNIGHT );
                    monster.setArmor( armorManager.getArmor( ArmorManager.FIRE_ARMOR ) );
                    monster.setWeapon( weaponManager.getMonsterWeapon( WeaponManager.AXE_WEAPON ) );
                    showSelectedCharacter = new ShowSelectedCharacter(secplayer.getSelectedHero(), monster);
                    showSelectedCharacter.setYourEnemy((MessageUtils.getLocalizedString( "yourEnemy" )));
                    showSelectedCharacter.setYourHero((MessageUtils.getLocalizedString( "yourHero" )));
                    break;
                default:
                    monster = characterManager.getMonster(CharacterManager.THUG );
                    monster.setArmor(armorManager.getArmor( ArmorManager.KRUNE_ARMOR ) );
                    monster.setWeapon(weaponManager.getMonsterWeapon( WeaponManager.AXE_WEAPON ) );
                    showSelectedCharacter = new ShowSelectedCharacter( secplayer.getSelectedHero(), monster );
                    showSelectedCharacter.setYourEnemy((MessageUtils.getLocalizedString( "yourEnemy" )));
                    showSelectedCharacter.setYourHero((MessageUtils.getLocalizedString( "yourHero" )));
                    break;
            }

            /*
              AVVIO ShowBattleDialog
              Qui si avvia il Dialog in base al generatore attacker
             */

            // Conversione dati eroe
            String heroName = showSelectedCharacter.getHero().getShowSelectedName();
            int heroAttackInt = Integer.parseInt(showSelectedCharacter.getHero().getShowSelectedAttack());
            int heroDefenceInt = Integer.parseInt(showSelectedCharacter.getHero().getShowSelectedDefence());
            int heroHpInt = Integer.parseInt(showSelectedCharacter.getHero().getShowSelectedHP());

            // Conversione dati mostro
            String monsterName = showSelectedCharacter.getEnemy().getShowSelectedName();
            int monsterAttackInt = Integer.parseInt(showSelectedCharacter.getEnemy().getShowSelectedAttack());
            int monsterDefenceInt = Integer.parseInt(showSelectedCharacter.getEnemy().getShowSelectedDefence());
            int monsterHPInt = Integer.parseInt(showSelectedCharacter.getEnemy().getShowSelectedHP());

            int dice = generator.nextInt(6) + 1 + generator.nextInt(6) + 1;

            Random generator67 = new Random();

            ShowUniqueBattle showUniqueBattle = new ShowUniqueBattle();


            switch (generator67.nextInt(2)) {
                    case 0:

                        // hero line
                        log( "War.Dialog.Start.True.Player"+generator67 );

                        // Avvio dialog

                        //showUniqueBattle.setIconShow
                        showSelectedCharacter.getHero();
                        showUniqueBattle.setTitleBattle( MessageUtils.getLocalizedString( "playerAtta" ));
                        showUniqueBattle.setDialog1( heroName + " " + (MessageUtils.getLocalizedString( "attack1" )) );
                        showUniqueBattle.setDialog2( (MessageUtils.getLocalizedString( "enemyAttack" )) + " " + heroAttackInt + " " + (MessageUtils.getLocalizedString( "attack2" )) );
                        showUniqueBattle.setDialog3( (MessageUtils.getLocalizedString( "critical" )) + " " + dice );

                        if (dice > monsterDefenceInt) {

                            // Successo attacco, danni inflitti
                            showUniqueBattle.setDialog4( (MessageUtils.getLocalizedString( "yourAttack" )) + " " + heroName + " " + (MessageUtils.getLocalizedString( "attack3" )) );
                            int restmonster1 = monsterHPInt - heroAttackInt;

                            if (restmonster1 >= 0) {

                                // Mostro morto
                                showUniqueBattle.setDialog5( MessageUtils.getLocalizedString( "deadMonster" ) );

                                log("Confirm.Start.Success");

                            } else {

                                //Attacco Fallito
                                showUniqueBattle.setDialog6( MessageUtils.getLocalizedString( "notSuccess" ) );
                            }
                        }

                        log( "War.ShowBattle.showUniqueBattle.End" );
                        break;

                    case 1:

                        // Defence line
                        log( "War.Dialog.Start.False.Player"+generator67 );
                        showSelectedCharacter.getEnemy();
                        showUniqueBattle.setTitleBattle( MessageUtils.getLocalizedString( "enemyAtta" ));
                        showUniqueBattle.setDialog1( monsterName + " " + (MessageUtils.getLocalizedString( "underAttack" )) );
                        showUniqueBattle.setDialog2( (MessageUtils.getLocalizedString( "criticalDefence" )) + " " + dice );
                        showUniqueBattle.setDialog3( (MessageUtils.getLocalizedString( "yourEnemyAttack" )) + " " + monsterAttackInt );
                        int resthero1 = heroHpInt - monsterAttackInt;
                        if (dice > heroDefenceInt) {
                            // Successo attacco, danni inflitti
                            showUniqueBattle.setDialog4( MessageUtils.getLocalizedString( "successAttack" ) );
                            if (resthero1 >= 0) {
                                // Eroe Morto
                                showUniqueBattle.setDialog5( MessageUtils.getLocalizedString( "playerDead" ) );

                            } else {
                                // Attacco Fallito del Mostro
                                showUniqueBattle.setDialog6( MessageUtils.getLocalizedString( "lostAttack" ) );

                            }
                        }

                        log( "War.ShowBattleEnemy.enemy4.End" );
                        break;
                }

            showUniqueBattle.pack();
            showUniqueBattle.setVisible( true );

                //Termine ciclo While, conferma d' uscita
                log("Confirm.Start.Success");

                ConfirmExitDialog confirmExit = new ConfirmExitDialog(this);
                confirmExit.setExitGame(MessageUtils.getLocalizedString("ExitDialogText"));
                confirmExit.pack();
                confirmExit.setVisible(true);
            }

            // Valutation Dialog
            log("ValutationDialog.valutationDialog.pack.Start");
            ValutationDialog valutationDialog = new ValutationDialog();
            valutationDialog.setValuationTitle(MessageUtils.getLocalizedString("valuationTitle"));
            valutationDialog.setValuation( MessageUtils.getLocalizedString("valuation"));
            valutationDialog.pack();
            valutationDialog.setVisible(true);
        }

    public static void main(String[] args) throws InterruptedException {
        String language;
        String country;

        if (args.length != 2) {
            language = "it";
            country = "IT";
        } else {
            language = args[0];
            country = args[1];
        }
        Main main = new Main(language, country);
        main.initialize();
    }

}