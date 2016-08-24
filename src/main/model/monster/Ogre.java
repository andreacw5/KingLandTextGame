package main.model.monster;

import main.util.MessageUtils;

/**
 * Created by Andrea Zago on 24/08/2016.
 */
public class Ogre extends Monster{

    public Ogre(String name, String imageUrl) {
        super( name, imageUrl );
    }

    @Override
    public String getName() {
        return MessageUtils.getLocalizedString("monster1");
    }

}
