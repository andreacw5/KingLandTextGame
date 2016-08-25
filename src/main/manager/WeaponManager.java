package main.manager;

import main.model.weapon.hero.Alabard;
import main.model.weapon.Weapon;
import main.model.weapon.hero.Hammer;
import main.model.weapon.hero.HeroWeap;
import main.model.weapon.hero.Sword;
import main.model.weapon.monster.Axe;
import main.model.weapon.monster.Mace;
import main.model.weapon.monster.MonsterWeap;

import java.util.ArrayList;
import java.util.List;

public class WeaponManager {

    public static final String ALABARD_WEAPON = "alabardWeap";
    public static final String HAMMER_WEAPON = "hammerWeapon";
    public static final String SWORD_WEAPON = "swordWeap";
    public static final String AXE_WEAPON = "axeWeap";
    public static final String MACE_WEAPON = "maceWeap";

    private List<HeroWeap> heroWList = new ArrayList<>();
    private List<MonsterWeap> monsterWList = new ArrayList<>();

    public WeaponManager(){
        heroWList.add(new Alabard());
        heroWList.add(new Hammer());
        heroWList.add(new Sword());
        monsterWList.add(new Axe());
        monsterWList.add(new Mace());
    }

    public HeroWeap getHeroWeapon(String name){
        for (HeroWeap weapon : heroWList){
            if (weapon.getName().equals(name)){
                return weapon;
            }
        }
        return null;
    }

    public Weapon getMonsterWeapon(String name){
        for (MonsterWeap weapon : monsterWList){
            if (weapon.getName().equals(name)){
                return weapon;
            }
        }
        return null;
    }


}
