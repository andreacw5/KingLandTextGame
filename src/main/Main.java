package main;

import main.gui.*;
import main.model.hero.ArmoredSamurai;
import main.model.hero.GoldenKnight;
import main.model.hero.Hero;
import main.model.hero.RedKnight;
import main.model.monster.*;
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

        // Dati player
        ArmoredSamurai hero1 = new ArmoredSamurai("hero0","/icon/Hero/armored-samurai-royalty-free-game-art.png");
        GoldenKnight hero2 = new GoldenKnight("hero1","/icon/Hero/Golden_Knight_featured.png");
        RedKnight hero3 = new RedKnight("hero2","/icon/Hero/red-knight-game-art-character-featured-2.png");

        // Array degli eroi
        Hero[] theHero = new Hero[3];
        theHero[0] = hero1;
        theHero[1] = hero2;
        theHero[2] = hero3;

        // Generatore di eroe
        Random k = new Random();
        k.nextInt(3);
        int herogen = k.nextInt(3);

        // Dati mostro
        DarknessKnight moster1 = new DarknessKnight("monster0", "/icon/Monster/Darkness_Knight_Featured.png");
        Thug moster2 = new Thug("monster1", "/icon/Monster/thug.png");
        Ogre moster3 = new Ogre("monster2", "/icon/Monster/ogre.png");

        // Array dei mostri
        Monster[] theMonsters = new Monster[3];
        theMonsters[0] = moster1;
        theMonsters[1] = moster2;
        theMonsters[2] = moster3;


        // Generazione avversario
        Random n = new Random();
        n.nextInt(3);
        int yell = n.nextInt(3);

        /**
         *  Avvio dei Dialog di Battaglia...
         */

        while (isMistic()) {

            /**
             * AVVIO PlayerSelector
             * Qui si avvia il Dialog PlayerSelector permettendo all'utente di scegliere il proprio eroe
             * ASSOCIAZIONI: Player; PlayerPanel; PlayerSelector
             */

            System.out.println("listOfHero.ArrayList.pack.Start");

            //Lista dei player
            ArrayList listOfHero = new ArrayList<Player>();
            listOfHero.add(new Player(MessageUtils.getLocalizedString( "hero0"),"22","5","75",MessageUtils.getLocalizedString( "story")));
            listOfHero.add(new Player(MessageUtils.getLocalizedString( "hero1"),"19","8","70",MessageUtils.getLocalizedString( "story1")));
            listOfHero.add(new Player(MessageUtils.getLocalizedString( "hero2"),"21","4","72",MessageUtils.getLocalizedString( "story2")));


            // Avvio dialog
            PlayerSelector secplayer = new PlayerSelector(listOfHero);
            secplayer.setInfoPlayer(MessageUtils.getLocalizedString( "infoPlayer"));
            secplayer.setInfoSelected(MessageUtils.getLocalizedString( "infoSelected"));
            secplayer.pack();
            secplayer.setVisible(true);


            /**
             * AVVIO WeaponSelector
             * Qui si avvia il dialog WeaponSelector, permettendo all'utente di scegliere la propria arma!ù
             * ASSOCIAZIONI: Weapon; WeaponSelector; WeapPanel
             */

            Random generator = new Random();

            System.out.println("listOfWeapon.ArrayList.pack.Start");

            //Lista delle armi
            ArrayList listOfWeapon = new ArrayList<Weapon>();
            listOfWeapon.add(new Weapon("Martello Supremo!", "ND", "ND"));
            listOfWeapon.add(new Weapon("Spada Imperiale", "ND", "ND"));
            listOfWeapon.add(new Weapon("Spada d'oriente", "ND", "ND"));

            // Avvio dialog
            WeapSelector secarm = new WeapSelector(listOfWeapon);
            secarm.setInfoWeap(MessageUtils.getLocalizedString( "infoWeap"));
            secarm.setInfoSelected(MessageUtils.getLocalizedString( "infoSelected"));
            secarm.pack();
            secarm.setVisible(true);

            /**
             * AVVIO ArmorSelector
             * Qui si avvia il dialog ArmorSelector, permettendo all'utente di scegliere la propria armatura!
             * ASSOCIAZIONI: Armor; ArmorSelector; ArmoPanel
             */

            System.out.println("listOfArmor.ArrayList.pack.Start");

            //Lista delle armature
            ArrayList listOfArmor = new ArrayList<Armor>();
            listOfArmor.add(new Armor("Armatura di Krune", "Difesa", "Attacco Bonus"));
            listOfArmor.add(new Armor("Armatura del Fuoco", "Forgia", "Runa"));
            listOfArmor.add(new Armor("Armatura di Markart", "Difesa", "Munizioni"));


            // Avvio dialog
            ArmorSelector secarmor = new ArmorSelector(listOfArmor);
            secarmor.setInfoArmor(MessageUtils.getLocalizedString( "infoArmor"));
            secarmor.setInfoSelected(MessageUtils.getLocalizedString( "infoSelected"));
            secarmor.pack();
            secarmor.setVisible(true);


            /**
             * AVVIO showPlayerDialog
             * Qui si avvia il dialog ShowPlayer, che mostra i nomi dei personaggi di gioco!
             */

            System.out.println("ShowPlay.caratt.pack.Start");
            ShowPlayer caratt = new ShowPlayer();

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