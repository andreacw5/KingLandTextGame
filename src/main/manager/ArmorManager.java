package main.manager;

import main.model.armor.Armor;
import main.model.armor.hero.FireArm;
import main.model.armor.hero.KruneArm;
import main.model.armor.hero.MarkartArm;

import java.util.ArrayList;
import java.util.List;

public class ArmorManager {

    public static final String FIRE_ARMOR = "fireArm";
    public static final String KRUNE_ARMOR = "kruneArm";
    public static final String MARKART_ARMOR = "markartArm";

    private List<Armor> armorList = new ArrayList<>();

    public ArmorManager(){
        armorList.add(new FireArm());
        armorList.add(new KruneArm());
        armorList.add(new MarkartArm());

    }

    public Armor getArmor(String name) {
        for (Armor armor : armorList) {
            if (armor.getName().equals( name )) {
                return armor;
            }
        }
        return null;
    }

}
