package main;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.*;

/**
 * King Land, The Roleplay gaming
 *
 * Build V. 0.1.3 - DEVELOP
 *
 * @Author:AndreaZago
 */

public class Main {

    public static void main(String[] args)
    {

        String language;
        String country;

        if (args.length != 2) {
            language = new String("it");
            country = new String("IT");
        } else {
            language = new String(args[0]);
            country = new String(args[1]);
        }

        Locale currentLocale;
        ResourceBundle messages;

        currentLocale = new Locale(language, country);

        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);


        // LANCIO DIALOG WELCOME
        WelcomeDialog monitor1 = new WelcomeDialog();
        monitor1.setWelcome1(messages.getString("welcome"));
        monitor1.setWelcome2(messages.getString("dial1"));
        monitor1.setWelcome3(messages.getString("dial2"));
        monitor1.pack();
        monitor1.setVisible(true);

        /**
         *  AVVIO APPLICAZIONE
         *  Qui di seguito il programma avvia il caricamento delle informazioni sui personaggi,
         *  In seguito si avvia il LoadingDialog
         */

        // Dati PLAYER
        Hero hero1 = new Hero(messages.getString("hero0"));
        Hero hero2 = new Hero(messages.getString("hero1"));
        Hero hero4 = new Hero(messages.getString("hero2"));
        Hero hero5 = new Hero(messages.getString("hero3"));

        // Array eroi
        Hero[] theHero = new Hero[4];
        theHero[0] = hero1;
        theHero[1] = hero2;
        theHero[2] = hero4;
        theHero[3] = hero5;

        Random k = new Random();
        k.nextInt(4);

        int herogen = k.nextInt(3);

        // Dati MONSTER
        Monster moster1 = new Monster(messages.getString("monster0"));
        Monster moster2 = new Monster(messages.getString("monster1"));
        Monster moster4 = new Monster(messages.getString("monster2"));
        Monster moster5 = new Monster(messages.getString("monster3"));
        Monster moster6 = new Monster(messages.getString("monster4"));
        Monster moster7 = new Monster(messages.getString("monster5"));
        Monster moster8 = new Monster(messages.getString("monster6"));

        // Array mostri
        Monster[] theMonsters = new Monster[7];
        theMonsters[0] = moster1;
        theMonsters[1] = moster2;
        theMonsters[2] = moster4;
        theMonsters[3] = moster5;
        theMonsters[4] = moster6;
        theMonsters[5] = moster7;
        theMonsters[6] = moster8;


        Random n = new Random();
        n.nextInt(6);

        int yell = n.nextInt(6);

        // LANCIO DIALOG LOADING
        LoadingScreen loading = new LoadingScreen();
        loading.pack();
        loading.setVisible(true);

        /**
         * AVVIO showPlayerDialog
         * Qui si avvia il dialog ShowPlayer, che mostra i nomi dei personaggi di gioco!
         */

        ShowPlayer caratt = new ShowPlayer();
        caratt.setShow1(messages.getString("characters"));
        caratt.setShow2((messages.getString("yourHero"))+" "+ theHero[herogen].name);
        caratt.setShow3((messages.getString("yourEnemy"))+" "+ theMonsters[yell].name);
        caratt.pack();
        caratt.setVisible(true);

        /**
         *  AVVIO DELLA BATTAGLIA
         */

        int value = 1;

        boolean mistic = true;

        /**
         *
         --- MOSTRO ---
         Il mostro che affronterai in combattimento è Il mangiatore di Ciabatte (Atk: 16 - Dif: 16 - HP: 42)
         --- EROE ---
         Il tuo eroe è Il rè degli Antichi (Atk: 13 - Dif: 10 - HP: 24)
         ------------
         Il rè degli Antichi sferra un attacco massiccio!
         L'Attacco di 13 danneggia il mostro!
         Danni Critici aggiuntivi al bersaglio di 3
         Il tuo attacco non ha avuto successo!
         ------------
         --- Per riprovare premi 1 altrimenti per uscire premi 2! ---
         */

        while(mistic)
        {

            Random generator = new Random();
            // Monster
            System.out.println(messages.getString("headerMonster"));
            System.out.println((messages.getString("yourEnemy"))+" "+ theMonsters[yell].name+" (Atk: "+theMonsters[yell].attack()+" - Dif: "+theMonsters[yell].defence()+" - HP: "+theMonsters[yell].healt()+")");

            // Player
            System.out.println(messages.getString("headerHero"));
            System.out.println((messages.getString("yourHero"))+" "+ theHero[herogen].name+" (Atk: "+theHero[herogen].attack()+" - Dif: "+theHero[herogen].defence()+" - HP: "+theHero[herogen].healt()+")");

            System.out.println(messages.getString("bar"));
            boolean attacker = generator.nextBoolean();
            if (attacker) {
                System.out.println(theHero[herogen].name+" "+(messages.getString("attack1")));
                int dice = generator.nextInt(6) + 1 + generator.nextInt(6) + 1;
                int attackValue = theHero[herogen].attack() + dice;
                System.out.println((messages.getString("enemyAttack"))+" "+theHero[herogen].attack()+" "+(messages.getString("attack2")));
                System.out.println((messages.getString("critical"))+" "+dice);
                if (attackValue > theMonsters[yell].defence()) {
                    System.out.println((messages.getString("yourAttack"))+" "+theHero[herogen].name+" "+(messages.getString("attack3")));
                    int restmonster1 = theMonsters[yell].healt() - theHero[herogen].attack();

                    if (restmonster1 >= 0){
                        System.out.println(messages.getString("deadMonster"));
                    }

                    System.out.println((messages.getString("healtViewer")) +" "+ restmonster1);
                } else {
                    System.out.println(messages.getString("notSuccess"));
                }
            }else {
                System.out.println(theMonsters[yell].name+" "+(messages.getString("underAttack")));
                int dice = generator.nextInt(6) + 1 + generator.nextInt(6) + 1;
                int attackValue = theMonsters[yell].attack() + dice;
                System.out.println((messages.getString("criticalDefence"))+" "+ dice);
                System.out.println((messages.getString("yourEnemyAttack"))+" " + theMonsters[yell].attack());
                if (attackValue > theHero[herogen].defence()) {
                    System.out.println(messages.getString("successAttack"));
                    int resthero1 = theHero[herogen].healt() - theMonsters[yell].attack();
                    System.out.println((messages.getString("healtHViewer"))+" " + resthero1);
                } else {
                    System.out.println(messages.getString("lostAttack"));
                }

            }
            System.out.println(messages.getString("bar"));
            // REPEAT CONFIRM
            System.out.println(messages.getString("restart"));
            Scanner delta = new Scanner(System.in);
            int ws = delta.nextInt();
            if (ws == 2){mistic = false;
            }

        }

        /**
         * AVVIO ValutationDialog, con valutazione da 1 a 10!
         */

        ValutationDialog endTable = new ValutationDialog();
        endTable.setValuationTitle(messages.getString("valuationTitle"));
        endTable.setValuation(messages.getString("valuation"));
        endTable.setValuation1(messages.getString("valuation1"));
        endTable.pack();
        endTable.setVisible(true);



    }
}

/**
 * CALL DI UN GUI FORM
 * SampleForm myform = new SampleForm();
 */