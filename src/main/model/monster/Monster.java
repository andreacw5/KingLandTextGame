package main.model.monster;

import main.model.Character;

public abstract class Monster extends Character {

    public Monster(String name) {
        super( name, "/icon/Monster/" + name + ".png" );
    }

}