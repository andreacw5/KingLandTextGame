package main.model.weapon;

public abstract class Weapon {
    private String name;
    private String imageUrl;
    private String ability1;
    private String ability1Url;
    private String ability2;
    private String ability2Url;

    public Weapon(String name,String imageUrl, String ability1, String ability1Url, String ability2, String ability2Url) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.ability1 = ability1;
        this.ability1Url = ability1Url;
        this.ability2 = ability2;
        this.ability2Url = ability2Url;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
