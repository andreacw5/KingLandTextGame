package main.gui;

import main.model.hero.Hero;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerPanel extends JDialog {
    private JPanel contentPane;
    private JLabel playerName;
    private JLabel iconPlayer;
    private JButton selectorButtonP;
    private JLabel playerHistory;
    public PlayerSelector son;
    private Hero hero;

    public void setSon(PlayerSelector son) {
        this.son = son;
    }

    public PlayerSelector getSon() {
        return this.son;
    }

    public PlayerPanel() {
        setContentPane( contentPane );
        setModal( true );
        selectorButtonP.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                son.setSelectedHero( getHero() );
            }
        } );

    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
        this.iconPlayer.setIcon( new ImageIcon( PlayerPanel.class.getResource( hero.getImageUrl() ) ) );
        this.playerName.setText( hero.getLocalizedName() );
        this.playerHistory.setText( hero.getHistory() );
    }
}
