package main.model.hero;

import main.util.MessageUtils;

/**
 * Created by Andrea Zago on 24/08/2016.
 */
public class ArmoredSamurai extends Hero{

    public ArmoredSamurai(String name, String imageUrl) {
        super( name, imageUrl );
    }

    @Override
    public String getName() {
        return MessageUtils.getLocalizedString("hero2");
    }

}
