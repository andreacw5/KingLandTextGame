package main.model.character;

import main.model.armor.Armor;
import main.model.weapon.Weapon;
import main.util.MessageUtils;

import java.util.Random;

public abstract class Character implements CharacterFunctions {
    private String name;
    private String imageUrl;
    private Armor armor;
    private Weapon weapon;
    private int attack;
    private int defence;
    private int heath;

    @Override
    public int attack() {
        return attack;
    }

    @Override
    public int defence() {
        return defence;
    }

    @Override
    public int healt() {
        return heath;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Character(String name, String imageUrl) {
        Random n = new Random();
        this.name = name;
        this.imageUrl = imageUrl;
        this.defence =  n.nextInt(50);
        this.attack =  n.nextInt(50);
        this.heath =  n.nextInt(50);

    }

    public String getLocalizedName() {
        return MessageUtils.getLocalizedString( this.getName() );
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


}
