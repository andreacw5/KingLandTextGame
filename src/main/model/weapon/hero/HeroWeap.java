package main.model.weapon.hero;

import main.model.weapon.Weapon;
import main.util.MessageUtils;

public abstract class HeroWeap extends Weapon{

    private String ability1;
    private String ability1Url;
    private String ability2;
    private String ability2Url;

    public HeroWeap(String name) {
        super(name, "/icon/Weap/"+ name + ".png");
        this.ability1 = MessageUtils.getLocalizedString(name+".ability1");
        this.ability2 = MessageUtils.getLocalizedString(name+".ability2");
        this.ability1Url = "/icon/40x40/NN.png";
        this.ability2Url = "/icon/40x40/NN.png";
    }

    public String getAbility1() {
        return ability1;
    }

    public void setAbility1(String ability1) {
        this.ability1 = ability1;
    }

    public String getAbility1Url() {
        return ability1Url;
    }

    public void setAbility1Url(String ability1Url) {
        this.ability1Url = ability1Url;
    }

    public String getAbility2() {
        return ability2;
    }

    public void setAbility2(String ability2) {
        this.ability2 = ability2;
    }

    public String getAbility2Url() {
        return ability2Url;
    }

    public void setAbility2Url(String ability2Url) {
        this.ability2Url = ability2Url;
    }

}
