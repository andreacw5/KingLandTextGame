package main.model.character.story;

import main.model.character.Character;

public abstract class StoryCharacter extends Character {

    public StoryCharacter(String name) {
        super( name, "/icon/StoryPR/" + name + ".png" );
    }

}