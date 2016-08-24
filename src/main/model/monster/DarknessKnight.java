package main.model.monster;

import main.util.MessageUtils;

public class DarknessKnight extends Monster{

    public DarknessKnight(String name, String imageUrl) {
        super( name, imageUrl );
    }

    @Override
    public String getName() {
        return MessageUtils.getLocalizedString("monster0");
    }

}
