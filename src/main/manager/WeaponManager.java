package main.manager;

import main.model.weapon.Alabard;
import main.model.weapon.Hammer;
import main.model.weapon.Sword;
import main.model.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

public class WeaponManager {

    public static final String ALABARD_WEAPON = "alabardWeap";
    public static final String HAMMER_WEAPON = "hammerWeapon";
    public static final String SWORD_WEAPON = "swordWeap";

    private List<Weapon> weaponList = new ArrayList<>( );

    public WeaponManager(){
        weaponList.add(new Alabard(
                "Hammer",
                "Hammer",
                "Hammer",
                "Hammer",
                "Hammer",
                "Hammer"));
        weaponList.add(new Alabard(
                "Hammer",
                "Hammer",
                "Hammer",
                "Hammer",
                "Hammer",
                "Hammer"));
        weaponList.add(new Alabard(
                "Hammer",
                "Hammer",
                "Hammer",
                "Hammer",
                "Hammer",
                "Hammer"));
    }

    public Weapon getWeapon(String name){
        for (Weapon weapon : weaponList){
            if (weapon.getName().equals(name)){
                return weapon;
            }
        }
        return null;
    }



}
