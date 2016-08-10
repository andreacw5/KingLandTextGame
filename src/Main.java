import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.*;

/**
 * King Land, The Roleplay gaming
 *
 * Build V. 0.1.0 - DEVELOP
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
        monitor1.pack();
        monitor1.setVisible(true);

        // Il Dialog Welcome lancia in cascata i dialog successivi in sequenza!

        // AVVIO DI UN GUI FORM
        //SampleForm myform = new SampleForm();

        // Avvio dell' applicazione
        System.out.println(messages.getString("pause"));
        Scanner alpha = new Scanner(System.in);
        int start = alpha.nextInt();
        if (start == 1) System.out.println(messages.getString("run"));
        if (start < 1 ) System.out.println(messages.getString("notRun"));

        // Dati dei PNG

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

        // Print delle Statistiche a Monitor
        System.out.println(messages.getString("characters"));
        // Player
        System.out.println((messages.getString("yourHero"))+" "+ theHero[herogen].name);

        // Monster
        System.out.println((messages.getString("yourEnemy"))+" "+ theMonsters[yell].name);
        // Interruzione per lettura 2:

        System.out.println(messages.getString("ifReady"));
        Scanner charlie = new Scanner(System.in);
        int end2 = charlie.nextInt();
        if (end2 == 1) System.out.println(messages.getString("startBattle"));

        // Battaglia tra personaggi

        int value = 1;

        boolean mistic = true;

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

        // Valutazione con punteggio 1/10

        boolean GG = true;

        ValutationDialog endTable = new ValutationDialog();
        endTable.pack();
        endTable.setVisible(true);

        /**
         *  System.out.println(messages.getString("valuationTitle"));
         *
         *  System.out.println(messages.getString("valuation"));
         *  Scanner sc1 = new Scanner(System.in);
         *  int review = sc1.nextInt();
         *  System.out.println(messages.getString("valuationThanks"));
         *  System.out.println(messages.getString("bar"));
         *  System.out.println(messages.getString("close"));
         */

    }
}
