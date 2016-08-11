package main;

import java.util.Random;

public class Hero{
    String name;

    public Hero(String name){
        this.name = name;
    }

    public int attack(){
        Random number = new Random();
        return number.nextInt(11)+1 + number.nextInt(11)+1;
    }

    public int defence(){
        Random number = new Random();
        return number.nextInt(10)+1 + number.nextInt(10)+1;
    }

    public int healt(){
        Random number = new Random();
        return number.nextInt(30)+1 + number.nextInt(30)+1;
    }
}