package main;

public class Player {

    private String name;
    private String attackPlayer;
    private String defencePlayer;
    private String healtPlayer;
    private boolean playerAlive;
    private int armySend;
    private String history;

    public Player(String name, String attackPlayer, String defencePlayer, String healtPlayer, String history){
        this.name = name;
        this.attackPlayer = attackPlayer;
        this.defencePlayer = defencePlayer;
        this.healtPlayer = healtPlayer;
        this.history = history;

    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttackPlayer() {
        return attackPlayer;
    }

    public void setAttackPlayer(String attackPlayer) {
        this.attackPlayer = attackPlayer;
    }

    public String getDefencePlayer() {
        return defencePlayer;
    }

    public void setDefencePlayer(String defencePlayer) {
        this.defencePlayer = defencePlayer;
    }

    public String getHealtPlayer() {
        return healtPlayer;
    }

    public void setHealtPlayer(String healtPlayer) {
        this.healtPlayer = healtPlayer;
    }

    public boolean isPlayerAlive() {
        return playerAlive;
    }

    public void setPlayerAlive(boolean playerAlive) {
        this.playerAlive = playerAlive;
    }

    public int getArmySend() {
        return armySend;
    }

    public void setArmySend(int armySend) {
        this.armySend = armySend;
    }
}
