package main.model.character.monster;

import main.model.character.Character;

public abstract class Monster extends Character {

    public Monster(String name) {
        super( name, "/icon/Monster/" + name + ".png" );
    }

}