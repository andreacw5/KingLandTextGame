package main.model.hero;

import main.model.Character;

public abstract class Hero extends Character{
    String name;
    String history;

    public Hero(String name, String imageUrl) {
        super( name, imageUrl );
    }


    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defence() {
        return 0;
    }

    @Override
    public int healt() {
        return 0;
    }

}