package main.model.monster;

import main.util.MessageUtils;

/**
 * Created by Andrea Zago on 24/08/2016.
 */
public class Thug extends Monster{

    public Thug(String name, String imageUrl) {
        super( name, imageUrl );
    }

    @Override
    public String getName() {
        return MessageUtils.getLocalizedString("monster2");
    }

}
