package main.model;

import main.util.MessageUtils;

public abstract class Character implements CharacterFunctions {
    private String name;
    private String imageUrl;

    public Character(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return MessageUtils.getLocalizedString( this.getName() );
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
