import java.util.Random;

public class Monster {
    String name;

    public Monster(String name){
        this.name = name;
    }

    public int attack(){
        Random number = new Random();
        return number.nextInt(10)+1 + number.nextInt(10)+1;
    }

    public int defence(){
        Random number = new Random();
        return number.nextInt(9)+1 + number.nextInt(9)+1;
    }

    public int healt(){
        Random number = new Random();
        return number.nextInt(25)+1 + number.nextInt(25)+1;
    }

}