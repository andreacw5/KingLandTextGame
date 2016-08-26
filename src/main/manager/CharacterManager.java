package main.manager;

import main.model.character.hero.ArmoredSamurai;
import main.model.character.hero.GoldenKnight;
import main.model.character.hero.Hero;
import main.model.character.hero.RedKnight;
import main.model.character.monster.DarknessKnight;
import main.model.character.monster.Monster;
import main.model.character.monster.Ogre;
import main.model.character.monster.Thug;
import main.model.character.story.Executioner;
import main.model.character.story.KingVlad;
import main.model.character.story.StoryCharacter;

import java.util.ArrayList;
import java.util.List;

public class CharacterManager {

    public static final String ARMORED_SAMURAI = "armoredSamurai";
    public static final String GOLDEN_KNIGHT = "goldenKnight";
    public static final String RED_KNIGHT = "redKnight";
    public static final String DARKNESS_KNIGHT = "darknessKnight";
    public static final String OGRE = "ogre";
    public static final String THUG = "thug";
    public static final String EXECUTIONER = "executioner";
    public static final String KING_VLAD = "kingVlad";

    private List<Hero> heroList = new ArrayList<>();
    private List<Monster> monsterList = new ArrayList<>();
    private List<StoryCharacter> storyCList = new ArrayList<>();

    public CharacterManager() {
        heroList.add( new ArmoredSamurai() );
        heroList.add( new GoldenKnight() );
        heroList.add( new RedKnight() );
        monsterList.add( new DarknessKnight() );
        monsterList.add( new Ogre() );
        monsterList.add( new Thug() );
        storyCList.add(new KingVlad());
        storyCList.add(new Executioner());
    }

    public Monster getMonster(String name) {
        for (Monster character : monsterList) {
            if (character.getName().equals( name )) {
                character.reinit();
                return character;
            }
        }
        return null;
    }

    public Hero getHero(String name) {
        for (Hero character : heroList) {
            if (character.getName().equals( name )) {
                character.reinit();
                return character;
            }
        }
        return null;
    }

    public StoryCharacter getStoryCharacter(String name) {
        for (StoryCharacter storyC : storyCList) {
            if (storyC.getName().equals( name )) {
                return storyC;
            }
        }
        return null;
    }
}
