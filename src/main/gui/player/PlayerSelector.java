package main.gui.player;

import main.model.character.hero.Hero;
import main.util.MessageUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlayerSelector extends JDialog implements WindowConstants{
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel selectedPlayer;
    private JLabel infoSelected;
    private JLabel infoPlayer;
    private PlayerPanel play2;
    private PlayerPanel play1;
    private PlayerPanel play3;
    private Hero selectedHero;
    private static final int WIDTH=400;
    private static final int HEIGHT=WIDTH/12*9;
    private static final int SCALE=3;


    public Hero getSelectedHero() {
        return selectedHero;
    }

    public void setSelectedHero(Hero selectedHero) {
        this.selectedHero = selectedHero;
        buttonOK.setEnabled(true);
        this.selectedPlayer.setText(selectedHero.getLocalizedName());
    }

    public String getSelectedPlayerText() {
        return this.selectedPlayer.getText();
    }

    public void setInfoPlayer(String wel1){
        this.infoPlayer.setText(wel1);
    }


    public void setInfoSelected(String v34){
        this.infoSelected.setText(v34);
    }

    public PlayerSelector(Hero[] listOfHero) {
        buttonOK.setEnabled(false);
        Hero hero1 = listOfHero[0];
        Hero hero2 = listOfHero[1];
        Hero hero3 = listOfHero[2];

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        setContentPane( contentPane );
        setModal( true );

        play1.setHero( hero1 );
        play1.setSon(this);

        play2.setHero( hero2 );
        play2.setSon(this);

        play3.setHero( hero3 );
        play3.setSon(this);

        setContentPane(contentPane);
        setModal(true);
        setMinimumSize(new Dimension( WIDTH * SCALE, HEIGHT * SCALE ));
        setMaximumSize(new Dimension( WIDTH * SCALE, HEIGHT * SCALE ));
        setPreferredSize(new Dimension( WIDTH * SCALE, HEIGHT * SCALE ));
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(null);
        setTitle("King Land - The RoleplayGame");
        setInfoPlayer( MessageUtils.getLocalizedString( "infoPlayer"));
        setInfoSelected(MessageUtils.getLocalizedString( "infoSelected"));
        pack();
        setVisible(true);
    }

    private void onOK() {
// add your code here
        dispose();
    }

}
