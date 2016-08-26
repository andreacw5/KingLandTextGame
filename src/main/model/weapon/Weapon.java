package main.model.weapon;

import main.util.MessageUtils;

public abstract class Weapon implements WeaponFunctions{
    private String name;
    private String imageUrl;


    @Override
    public String ability1() {
        return "null";
    }

    @Override
    public String ability2() {
        return "null";
    }

    public Weapon(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;

    }

    public String getLocalizedName() {
        return MessageUtils.getLocalizedString( this.getName() );
    }

    public String getName() {
        return name;
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
