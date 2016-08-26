package main.model.armor;

import main.util.MessageUtils;

public class Armor implements ArmorFunctions {
    private String name;
    private String imageUrl;


    public Armor(String name) {
        this.name = name;
        this.imageUrl = "/icon/Armor/"+name+".png";

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
