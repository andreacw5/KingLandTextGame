package main;

import javax.swing.*;

public class PlayerPanel extends JDialog {
    private JPanel contentPane;
    private JLabel playerName;
    private JLabel iconPlayer;
    private JLabel showHeroHealt;
    private JLabel showHeroAttack;
    private JLabel showHeroDefence;
    private JButton selectorButtonP;
    private JLabel playerHistory;
    public PlayerSelector son;

    public void setSon(PlayerSelector son) {
        this.son = son;
    }

    public PlayerSelector getSon() {
        return this.son;
    }

    // Nome dell'eroe
    public String getPlayerName() {
        return playerName.getText();
    }

    public void setPlayerName(String playerName) {
        this.playerName.setText(playerName);
    }

    // Storia dell'eroe
    public String getPlayerHistory() {
        return playerHistory.getText();
    }

    public void setPlayerHistory(String playerHistory) {
        this.playerHistory.setText(playerHistory);
    }

    public JButton getSelectorButtonP() {
        return selectorButtonP;
    }

    public void setSelectorButtonP(JButton selectorButtonP) {
        this.selectorButtonP = selectorButtonP;
    }

    // Hero Attack
    public String getShowHeroAttack() {
        return showHeroAttack.getText();
    }

    public void setShowHeroAttack(String showHeroAttack) {
        this.showHeroAttack.setText(showHeroAttack);
    }

    // Hero Defence
    public String getShowHeroDefence() {
        return showHeroDefence.getText();
    }

    public void setShowHeroDefence(String showHeroDefence) {
        this.showHeroDefence.setText(showHeroDefence);
    }

    // Hero Healt
    public String getShowHeroHealt() {
        return showHeroHealt.getText();
    }

    public void setShowHeroHealt(String showHeroHealt) {
        this.showHeroHealt.setText(showHeroHealt);
    }

    // Icona Player
    public JLabel getIconPlayer() {
        return iconPlayer;
    }

    public void setIconPlayer(Icon iconPlayer) {
        this.iconPlayer.setIcon(iconPlayer);
    }


    public PlayerPanel() {
        setContentPane( contentPane );
        setModal( true );

    }
}
