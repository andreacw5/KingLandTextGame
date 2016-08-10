import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // LANCIO DIALOG WELCOME
        WelcomeDialog monitor1 = new WelcomeDialog();
        monitor1.pack();
        monitor1.setVisible(true);

        // Il Dialog Welcome lancia in cascata i dialog successivi in sequenza!

        //SampleForm myform = new SampleForm();
        // Avvio dell' applicazione
        System.out.println(" --- PREMI 1 PER AVVIARE ---");
        Scanner alpha = new Scanner(System.in);
        int start = alpha.nextInt();
        if (start == 1) System.out.println(" --- AVVIO IN CORSO! --- ");
        if (start < 1 ) System.out.println("Brutto!"); //da compilare meglio l' annullamento!

        // Dati dei PNG

        // Dati PLAYER
        Hero hero1 = new Hero("Il rè della Roccia");
        Hero hero2 = new Hero("Il rè della Valle");
        Hero hero4 = new Hero("Il rè del Fuoco");
        Hero hero5 = new Hero("Il rè della Sabbia");

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
        Monster moster1 = new Monster("Il Grande Pollo");
        Monster moster2 = new Monster("Il Leone di Plastica");
        Monster moster4 = new Monster("Il Bruttone");
        Monster moster5 = new Monster("La Trozzona");
        Monster moster6 = new Monster("L' Orco Malvagio");
        Monster moster7 = new Monster("Il Brutto Bananone");
        Monster moster8 = new Monster("Il Mago delle Tuniche");

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
        System.out.println("Ecco i personaggi! ");
        // Player
        System.out.println("Il tuo eroe è "+ theHero[herogen].name);

        // Monster
        System.out.println("Il mostro che affronterai in combattimento è "+ theMonsters[yell].name);
        // Interruzione per lettura 2:

        System.out.println(" --- Quando sei pronto premi 1! --- ");
        Scanner charlie = new Scanner(System.in);
        int end2 = charlie.nextInt();
        if (end2 == 1) System.out.println(" --- AVVIO BATTAGLIA! --- ");
        if (end2 < 1 ) System.out.println("Brutto!"); //da compilare meglio l' annullamento!

        // Battaglia tra personaggi

        int value = 1;

        boolean mistic = true;

        while(mistic)
        {

            Random generator = new Random();
            System.out.println("------------");
            // Monster
            System.out.println("--- MOSTRO ---");
            System.out.println("Il tuo avversario è "+ theMonsters[yell].name+" (Atk: "+theMonsters[yell].attack()+" - Dif: "+theMonsters[yell].defence()+" - HP: "+theMonsters[yell].healt()+")");

            // Player
            System.out.println("--- EROE ---");
            System.out.println("Il tuo eroe è "+ theHero[herogen].name+" (Atk: "+theHero[herogen].attack()+" - Dif: "+theHero[herogen].defence()+" - HP: "+theHero[herogen].healt()+")");

            System.out.println("------------");
            boolean attacker = generator.nextBoolean();
            if (attacker) {
                System.out.println(theHero[herogen].name+" sferra un attacco massiccio!");
                int dice = generator.nextInt(6) + 1 + generator.nextInt(6) + 1;
                int attackValue = theHero[herogen].attack() + dice;
                System.out.println("Il tuo attacco di "+theHero[herogen].attack()+" danneggia il mostro! ");
                System.out.println("Danni Critici aggiuntivi al bersaglio di "+dice);
                if (attackValue > theMonsters[yell].defence()) {
                    System.out.println("L'Attacco di"+theHero[herogen].name+" è stato un successo! Abbiamo inflitto danni");
                    int restmonster1 = theMonsters[yell].healt() - theHero[herogen].attack();

                    if (restmonster1 >= 0){
                        System.out.println("Il mostro è MORTO!!!!");
                    }

                    System.out.println("Vita rimanente all mostro: " + restmonster1);
                } else {
                    System.out.println("Il tuo attacco non ha avuto successo! ");
                }
            }else {
                System.out.println(theMonsters[yell].name+" ti sta attaccando!");
                int dice = generator.nextInt(6) + 1 + generator.nextInt(6) + 1;
                int attackValue = theMonsters[yell].attack() + dice;
                System.out.println("Critico: " + dice);
                System.out.println("Attacco del mostro: " + theMonsters[yell].attack());
                if (attackValue > theHero[herogen].defence()) {
                    System.out.println("L' attacco del mostro ha avuto SUCCESSO!");
                    int resthero1 = theHero[herogen].healt() - theMonsters[yell].attack();
                    System.out.println("Vita rimanente all' eroe: " + resthero1);
                } else {
                    System.out.println("l' attacco del mostro è fallito!");
                }

            }
            System.out.println("------------");
            // REPEAT CONFIRM
            System.out.println(" --- Per riprovare premi 1 altrimenti per uscire premi 2! --- ");
            Scanner delta = new Scanner(System.in);
            int ws = delta.nextInt();
            if (ws == 2){mistic = false;
            }

        }

        // Valutazione con punteggio 1/10

        boolean GG = true;

        System.out.println(" VALUTA L' APPLICAZIONE: ");

        System.out.println("Ti è piaciuto il gioco? Valutalo da 1 a 10 ");
        Scanner sc1 = new Scanner(System.in);
        int review = sc1.nextInt();
            System.out.println("Grazie della valutazione!");
            System.out.println(" ---------------- ");
            System.out.println(" - CHIUSURA APPLICAZIONE - ");
    }
}
