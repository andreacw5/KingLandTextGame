package main.model.monster;

import main.model.Character;

public abstract class Monster extends Character {

    public Monster(String name, String imageUrl) {
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