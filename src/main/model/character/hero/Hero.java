package main.model.character.hero;

import main.model.character.Character;
import main.util.MessageUtils;

import java.util.Random;

public abstract class Hero extends Character {

    private String history;

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public Hero(String name) {
        super( name, "/icon/Hero/" + name + ".png" );
        this.history = MessageUtils.getLocalizedString( name + ".story" );
    }

}