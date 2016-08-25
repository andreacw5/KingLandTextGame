package main.model.weapon.monster;

import main.model.weapon.Weapon;

public abstract class MonsterWeap extends Weapon{

    public MonsterWeap(String name) {
        super(name, "/icon/Weap/"+ name + ".png");
    }


}
