package main.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public PlayerPanel(){
        setContentPane( contentPane );
        setModal( true );
        selectorButtonP.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                son.setSelectedPlayer(playerName.getText());
            }
        });

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

}
