package main.manager;

import main.model.Character;
import main.model.hero.ArmoredSamurai;
import main.model.hero.GoldenKnight;
import main.model.hero.Hero;
import main.model.hero.RedKnight;
import main.model.monster.DarknessKnight;
import main.model.monster.Monster;
import main.model.monster.Ogre;
import main.model.monster.Thug;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrea Zago on 24/08/2016.
 */
public class CharacterManager {

    public static final String ARMORED_SAMURAI = "armoredSamurai";
    public static final String GOLDEN_KNIGHT = "goldenKnight";
    public static final String RED_KNIGHT = "redKnight";
    public static final String DARKNESS_KNIGHT = "darknessKnight";
    public static final String OGRE = "ogre";
    public static final String THUG = "thug";

    private List<Hero> heroList = new ArrayList<>();
    private List<Monster> monsterList = new ArrayList<>();

    public CharacterManager() {
        heroList.add( new ArmoredSamurai() );
        heroList.add( new GoldenKnight() );
        heroList.add( new RedKnight() );
        monsterList.add( new DarknessKnight() );
        monsterList.add( new Ogre() );
        monsterList.add( new Thug() );
    }

    public Monster getMonster(String name) {
        for (Monster character : monsterList) {
            if (character.getName().equals( name )) {
                return character;
            }
        }
        return null;
    }

    public Hero getHero(String name) {
        for (Hero character : heroList) {
            if (character.getName().equals( name )) {
                return character;
            }
        }
        return null;
    }
}
