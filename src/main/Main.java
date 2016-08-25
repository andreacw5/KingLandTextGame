package main;

import main.gui.*;
import main.gui.WeapSelector;
import main.manager.ArmorManager;
import main.manager.CharacterManager;
import main.manager.WeaponManager;
import main.model.armor.Armor;
import main.model.character.hero.Hero;
import main.model.character.monster.*;
import main.model.character.story.StoryCharacter;
import main.model.weapon.hero.HeroWeap;
import main.util.MessageUtils;

import java.util.ArrayList;
import java.util.Random;

/**
 * King Land, The Roleplay gaming
 * Build V. 1.0.0 - DEVELOP
 * @Author:AndreaZago
 */

public class Main {

    private boolean mistic = true;


    public boolean isMistic() {
        return mistic;
    }

    public Main(String country, String language) {
        MessageUtils.init( country, language );
    }

    public void setMistic(boolean mistic) {
        this.mistic = mistic;
    }

    public void initialize() throws InterruptedException {

        /**
         * Caricamento Traduzioni...
         */

        System.out.println("WelcomeDialog.monitor1.pack.Start");

        // Avvio WelcomeDialog
        WelcomeDialog monitor1 = new WelcomeDialog();
        monitor1.setWelcome1(MessageUtils.getLocalizedString( "welcome"));
        monitor1.setWelcome2(MessageUtils.getLocalizedString( "dial1"));
        monitor1.setWelcome3(MessageUtils.getLocalizedString( "dial2"));
        monitor1.pack();
        monitor1.setVisible(true);

        // Avvio LoadingDialog

        System.out.println("LoadingScreen.loading.pack.Start");
        LoadingScreen loading = new LoadingScreen();
        loading.pack();
        loading.setVisible(true);

        /**
         *  Generazione Array e Random
         */

        CharacterManager characterManager = new CharacterManager();

        // Array degli eroi
        Hero[] theHero = new Hero[3];
        theHero[0] = characterManager.getHero( CharacterManager.ARMORED_SAMURAI );
        theHero[1] = characterManager.getHero( CharacterManager.RED_KNIGHT );
        theHero[2] = characterManager.getHero( CharacterManager.GOLDEN_KNIGHT );

        // Generatore di eroe
        Random k = new Random();
        k.nextInt(3);
        int herogen = k.nextInt(3);

        // Array dei mostri
        Monster[] theMonsters = new Monster[3];
        theMonsters[0] =  characterManager.getMonster( CharacterManager.THUG );
        theMonsters[1] =  characterManager.getMonster( CharacterManager.OGRE );
        theMonsters[2] =  characterManager.getMonster( CharacterManager.DARKNESS_KNIGHT );

        // Generazione avversario
        Random n = new Random();
        n.nextInt(3);
        int yell = n.nextInt(3);

        // Array Personaggi della storia
        StoryCharacter[] theStoryC = new StoryCharacter[2];
        theStoryC[0] = characterManager.getStoryCharacter(CharacterManager.EXECUTIONER);
        theStoryC[1] = characterManager.getStoryCharacter(CharacterManager.KING_VLAD);

        /**
         *  Avvio dei Dialog di Battaglia...
         */

        while (isMistic()) {

            /**
             * AVVIO PlayerSelector
             * Qui si avvia il Dialog PlayerSelector permettendo all'utente di scegliere il proprio eroe
             */

            System.out.println("listOfHero.ArrayList.pack.Start");

            // Avvio dialog
            PlayerSelector secplayer = new PlayerSelector(theHero);

            /**
             * AVVIO WeaponSelector
             * Qui si avvia il dialog WeaponSelector, permettendo all'utente di scegliere la propria arma!ù
             */

            Random generator = new Random();

            WeaponManager weaponManager = new WeaponManager();

            HeroWeap[] weaponsA = new HeroWeap[3];
            weaponsA[0] = weaponManager.getHeroWeapon( WeaponManager.ALABARD_WEAPON );
            weaponsA[1] = weaponManager.getHeroWeapon( WeaponManager.HAMMER_WEAPON );
            weaponsA[2] = weaponManager.getHeroWeapon( WeaponManager.SWORD_WEAPON );

            System.out.println("weapons.getWeapon.WeaponManager.new");

            WeapSelector secweapon = new WeapSelector(weaponsA);

            /**
             * AVVIO ArmorSelector
             * Qui si avvia il dialog ArmorSelector, permettendo all'utente di scegliere la propria armatura!
             */

            System.out.println("listOfArmor.ArrayList.pack.Start");

            ArmorManager armorManager = new ArmorManager();

            //Lista delle armature
            Armor[] armorList = new Armor[3];
            armorList[0] = armorManager.getArmor( ArmorManager.FIRE_ARMOR );
            armorList[1] = armorManager.getArmor( ArmorManager.KRUNE_ARMOR );
            armorList[2] = armorManager.getArmor( ArmorManager.MARKART_ARMOR );

            // Avvio dialog
            ArmorSelector secarmor = new ArmorSelector(armorList);


            /**
             * AVVIO showPlayerDialog
             * Qui si avvia il dialog ShowPlayer, che mostra i nomi dei personaggi di gioco!
             */

            System.out.println("ShowPlay.caratt.pack.Start");
            ShowSelectedCharacter caratt = new ShowSelectedCharacter(secplayer.getSelectedHero(), characterManager.getMonster( CharacterManager.OGRE ));

/*
            // Sezione eroe
            caratt.setShowHeroTitle( MessageUtils.getLocalizedString( "yourHero"));
            caratt.setShowHeroName(theHero[herogen].getName());
            caratt.setShowHeroWeap(secarm.getSelectedWeapText());
            caratt.setShowHeroArmor(secarmor.getSelectedArmorText());
            caratt.setShowHeroAttack(" " + theHero[herogen].getName());
            caratt.setShowHeroDefence(" " + theHero[herogen].defence());
            caratt.setShowHeroHealt(" " + theHero[herogen].healt());

            // Sezione mostro
            caratt.setShowMonsterTitle(MessageUtils.getLocalizedString( "yourEnemy"));
            caratt.setShowMonsterName(theMonsters[yell].getName());
            caratt.setShowMonsterWeap("Spada a due lame");
            caratt.setShowMonsterArmor("Vestito di pelle");
            caratt.setShowMonsterAttack(" "+theMonsters[yell].attack());
            caratt.setShowMonsterDefence(" " + theMonsters[yell].defence());
            caratt.setShowMonsterHealt(" "+ theMonsters[yell].healt());
*/

            caratt.pack();
            caratt.setVisible(true);

            /**
             * AVVIO ShowBattleDialog
             */

            Random generator67 = new Random();
            boolean attacker = generator67.nextBoolean();

            if (attacker) {

                /**
                 * ATTACCO
                 */

                System.out.println("War.Dialog.Start.True.Player");
                ShowBattle player = new ShowBattle();
                player.setWar2(theHero[herogen].getName() + " " + (MessageUtils.getLocalizedString( "attack1")));
                int dice = generator.nextInt(6) + 1 + generator.nextInt(6) + 1;
                int attackValue = theHero[herogen].attack() + dice;
                player.setWar3((MessageUtils.getLocalizedString( "enemyAttack")) + " " + theHero[herogen].attack() + " " + (MessageUtils.getLocalizedString( "attack2")));
                player.setWar4((MessageUtils.getLocalizedString( "critical")) + " " + dice);
                if (attackValue > theMonsters[yell].defence()) {

                    // Successo attacco, danni inflitti
                    player.setWar5((MessageUtils.getLocalizedString( "yourAttack")) + " " + theHero[herogen].getName() + " " + (MessageUtils.getLocalizedString( "attack3")));
                    int restmonster1 = theMonsters[yell].healt() - theHero[herogen].attack();

                    if (restmonster1 >= 0) {

                        // Mostro morto
                        player.setWar6(MessageUtils.getLocalizedString( "deadMonster"));


                    } else {

                        //Attacco Fallito
                        player.setWar7(MessageUtils.getLocalizedString( "notSuccess"));

                    }

                }

                System.out.println("War.ShowBattle.player.End");
                player.pack();
                player.setVisible(true);

            } else {

                /**
                 * DIFESA
                 */

                System.out.println("War.Dialog.Start.False.Player");
                ShowBattleEnemy enemy4 = new ShowBattleEnemy();
                enemy4.setWarE2(theMonsters[yell].getName() + " " + (MessageUtils.getLocalizedString( "underAttack")));
                int dice = generator.nextInt(6) + 1 + generator.nextInt(6) + 1;
                int attackValue = theMonsters[yell].attack() + dice;
                enemy4.setWarE3((MessageUtils.getLocalizedString( "criticalDefence")) + " " + dice);
                enemy4.setWarE4((MessageUtils.getLocalizedString( "yourEnemyAttack")) + " " + theMonsters[yell].attack());
                if (attackValue > theHero[herogen].defence()) {

                    // Successo attacco, danni inflitti
                    int resthero1 = theHero[herogen].healt() - theMonsters[yell].attack();
                    enemy4.setWarE5(MessageUtils.getLocalizedString( "successAttack"));

                    if (resthero1 >= 0) {

                        // Eroe Morto
                        enemy4.setWarE6(MessageUtils.getLocalizedString( "playerDead"));

                    } else {

                        // Attacco Fallito del Mostro
                        enemy4.setWarE7(MessageUtils.getLocalizedString( "lostAttack"));

                    }

                }

                System.out.println("War.ShowBattleEnemy.enemy4.End");
                enemy4.pack();
                enemy4.setVisible(true);

            }

            /**
             * TERMINE CICLO WHILE
             *
             * Richiesta di conferma di abbandono
             */

            System.out.println("Confirm.Start.Success");
            ConfirmExitDialog yesMan = new ConfirmExitDialog(this);
            yesMan.pack();
            yesMan.setVisible(true);

        }

        /**
         * AVVIO ValutationDialog, con valutazione da 1 a 10!
         */

        System.out.println("ValutationDialog.endTable.pack.Start");
        ValutationDialog endTable = new ValutationDialog();
        endTable.setValuationTitle( "valuationTitle");
        endTable.setValuation( "valuation");
        endTable.pack();
        endTable.setVisible(true);

    }

    public static void main(String[] args) throws InterruptedException {
        String language;
        String country;

        if (args.length != 2) {
            language = new String("it");
            country = new String("IT");
        } else {
            language = new String(args[0]);
            country = new String(args[1]);
        }
        Main main = new Main(language, country);
        main.initialize();
    }
}