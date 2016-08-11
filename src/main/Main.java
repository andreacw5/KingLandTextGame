package main;

import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;

/**
 * King Land, The Roleplay gaming
 * Build V. 0.1.3 - DEVELOP
 * @Author:AndreaZago
 */

public class Main {

    private boolean mistic = true;
    private String country;
    private String language;

    public boolean isMistic() {
        return mistic;
    }

    public Main(String country, String language) {
        this.country = country;
        this.language = language;
    }

    public void setMistic(boolean mistic) {
        this.mistic = mistic;
    }

    public void initialize() {

        /**
         * Caricamento Traduzioni...
         */

        Locale currentLocale;
        ResourceBundle messages;

        currentLocale = new Locale(this.language, this.country);

        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);

        System.out.println("WelcomeDialog.monitor1.pack.Start");

        // Avvio WelcomeDialog
        WelcomeDialog monitor1 = new WelcomeDialog();
        monitor1.setWelcome1(messages.getString("welcome"));
        monitor1.setWelcome2(messages.getString("dial1"));
        monitor1.setWelcome3(messages.getString("dial2"));
        monitor1.pack();
        monitor1.setVisible(true);

        /**
         *  Generazione Array e Random
         */

        // Dati player
        Hero hero1 = new Hero(messages.getString("hero0"));
        Hero hero2 = new Hero(messages.getString("hero1"));
        Hero hero4 = new Hero(messages.getString("hero2"));
        Hero hero5 = new Hero(messages.getString("hero3"));

        // Array degli eroi
        Hero[] theHero = new Hero[4];
        theHero[0] = hero1;
        theHero[1] = hero2;
        theHero[2] = hero4;
        theHero[3] = hero5;

        // Generatore di eroe
        Random k = new Random();
        k.nextInt(4);
        int herogen = k.nextInt(3);

        // Dati mostro
        Monster moster1 = new Monster(messages.getString("monster0"));
        Monster moster2 = new Monster(messages.getString("monster1"));
        Monster moster4 = new Monster(messages.getString("monster2"));
        Monster moster5 = new Monster(messages.getString("monster3"));
        Monster moster6 = new Monster(messages.getString("monster4"));
        Monster moster7 = new Monster(messages.getString("monster5"));
        Monster moster8 = new Monster(messages.getString("monster6"));

        // Array dei mostri
        Monster[] theMonsters = new Monster[7];
        theMonsters[0] = moster1;
        theMonsters[1] = moster2;
        theMonsters[2] = moster4;
        theMonsters[3] = moster5;
        theMonsters[4] = moster6;
        theMonsters[5] = moster7;
        theMonsters[6] = moster8;


        // Generazione avversario
        Random n = new Random();
        n.nextInt(6);
        int yell = n.nextInt(6);

        // Avvio LoadingDialog

        System.out.println("LoadingScreen.loading.pack.Start");
        LoadingScreen loading = new LoadingScreen();
        loading.pack();
        loading.setVisible(true);

        /**
         *  Avvio dei Dialog di Battaglia...
         */

        while (isMistic()) {

            /**
             * AVVIO showPlayerDialog
             * Qui si avvia il dialog ShowPlayer, che mostra i nomi dei personaggi di gioco!
             */

            Random generator = new Random();

            System.out.println("ShowPlay.caratt.pack.Start");

            ShowPlayer caratt = new ShowPlayer();
            caratt.setShow1(messages.getString("characters"));
            caratt.setShow2((messages.getString("yourHero")) + " " + theHero[herogen].name);
            caratt.setShow4("(Atk: " + theHero[herogen].attack() + " - Dif: " + theHero[herogen].defence() + " - HP: " + theHero[herogen].healt() + ")");
            caratt.setShow3((messages.getString("yourEnemy")) + " " + theMonsters[yell].name);
            caratt.setShow5("(Atk: " + theMonsters[yell].attack() + " - Dif: " + theMonsters[yell].defence() + " - HP: " + theMonsters[yell].healt() + ")");
            caratt.pack();
            caratt.setVisible(true);

            /**
             * AVVIO ShowBattleDialog
             */

            boolean attacker = generator.nextBoolean();

            if (attacker = true) {
                System.out.println("War.Dialog.Start.True.Player");
            } else {
                System.out.println("War.Dialog.Start.False.Player");
            }

            if (attacker) {

                /**
                 * ATTACCO
                 */

                ShowBattle player = new ShowBattle();
                player.setWar1(messages.getString("characters"));
                player.setWar2(theHero[herogen].name + " " + (messages.getString("attack1")));
                int dice = generator.nextInt(6) + 1 + generator.nextInt(6) + 1;
                int attackValue = theHero[herogen].attack() + dice;
                player.setWar3((messages.getString("enemyAttack")) + " " + theHero[herogen].attack() + " " + (messages.getString("attack2")));
                player.setWar4((messages.getString("critical")) + " " + dice);
                if (attackValue > theMonsters[yell].defence()) {

                    // Successo attacco, danni inflitti
                    player.setWar5((messages.getString("yourAttack")) + " " + theHero[herogen].name + " " + (messages.getString("attack3")));
                    int restmonster1 = theMonsters[yell].healt() - theHero[herogen].attack();

                    if (restmonster1 >= 0) {

                        // Mostro morto
                        player.setWar6(messages.getString("deadMonster"));


                    } else {

                        //Attacco Fallito
                        player.setWar7(messages.getString("notSuccess"));

                    }

                }

                System.out.println("War.ShowBattle.player.End");
                player.pack();
                player.setVisible(true);

            } else {

                /**
                 * DIFESA
                 */

                ShowBattleEnemy enemy4 = new ShowBattleEnemy();
                enemy4.setWarE1(messages.getString("characters"));
                enemy4.setWarE2(theMonsters[yell].name + " " + (messages.getString("underAttack")));
                int dice = generator.nextInt(6) + 1 + generator.nextInt(6) + 1;
                int attackValue = theMonsters[yell].attack() + dice;
                enemy4.setWarE3((messages.getString("criticalDefence")) + " " + dice);
                enemy4.setWarE4((messages.getString("yourEnemyAttack")) + " " + theMonsters[yell].attack());
                if (attackValue > theHero[herogen].defence()) {

                    // Successo attacco, danni inflitti
                    int resthero1 = theHero[herogen].healt() - theMonsters[yell].attack();
                    enemy4.setWarE5(messages.getString("successAttack" + ", " + "healtHViewer" + " " + resthero1));

                    if (resthero1 >= 0) {

                        // Eroe Morto
                        enemy4.setWarE6(messages.getString("playerDead"));

                    } else {

                        // Attacco Fallito del Mostro
                        enemy4.setWarE7(messages.getString("lostAttack"));

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
        endTable.setValuationTitle(messages.getString("valuationTitle"));
        endTable.setValuation(messages.getString("valuation"));
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