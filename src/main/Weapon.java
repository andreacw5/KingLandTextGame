package main;

public class Weapon {

    private String name;
    private String ability1;
    private String ability2;

    public Weapon(String name, String ability1, String ability2) {
        this.name = name;
        this.ability1 = ability1;
        this.ability2 = ability2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbility1() {
        return ability1;
    }

    public void setAbility1(String ability1) {
        this.ability1 = ability1;
    }

    public String getAbility2() {
        return ability2;
    }

    public void setAbility2(String ability2) {
        this.ability2 = ability2;
    }

}
