package main;

public class Armor {

    private String nameA;
    private String ability1A;
    private String ability2A;

    public Armor(String nameA, String ability1A, String ability2A) {
        this.nameA = nameA;
        this.ability1A = ability1A;
        this.ability2A = ability2A;
    }

    public String getNameA() {
        return nameA;
    }

    public void setNameA(String nameA) {
        this.nameA = nameA;
    }

    public String getAbility1A() {
        return ability1A;
    }

    public void setAbility1A(String ability1A) {
        this.ability1A = ability1A;
    }

    public String getAbility2A() {
        return ability2A;
    }

    public void setAbility2A(String ability2A) {
        this.ability2A = ability2A;
    }

}
