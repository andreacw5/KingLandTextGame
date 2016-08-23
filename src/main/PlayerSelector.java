package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PlayerSelector extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel selectedPlayer;
    private JLabel infoSelected;
    private JLabel infoPlayer;
    private PlayerPanel play2;
    private PlayerPanel play1;
    private PlayerPanel play3;
    public static final int WIDTH=400;
    public static final int HEIGHT=WIDTH/12*9;
    public static final int SCALE=3;

    public void setSelectedPlayer(String selectedPlayerText) {
        this.selectedPlayer.setText(selectedPlayerText);
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

    public PlayerSelector(ArrayList<Player> listOfHero) {
        Player gen1 = listOfHero.get(0);
        Player gen2 = listOfHero.get(1);
        Player gen3 = listOfHero.get(2);


        setContentPane( contentPane );
        setModal( true );

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        //play1.setIconPlayer(new ImageIcon(PlayerSelector.this.getClass().getResource("/icon/Armor/Metal_icon.png")));
        play1.setPlayerName(gen1.getName());
        play1.setShowHeroAttack(gen1.getAttackPlayer());
        play1.setShowHeroDefence(gen1.getDefencePlayer());
        play1.setShowHeroHealt(gen1.getHealtPlayer());
        play1.setSon(this);

        //play2.setIconPlayer(new ImageIcon(PlayerSelector.this.getClass().getResource("/icon/Armor/Metal_icon.png")));
        play2.setPlayerName(gen2.getName());
        play2.setShowHeroAttack(gen2.getAttackPlayer());
        play2.setShowHeroDefence(gen2.getDefencePlayer());
        play2.setShowHeroHealt(gen2.getHealtPlayer());
        play2.setSon(this);

        //play3.setIconPlayer(new ImageIcon(PlayerSelector.this.getClass().getResource("/icon/Armor/Metal_icon.png")));
        play3.setPlayerName(gen3.getName());
        play3.setShowHeroAttack(gen3.getAttackPlayer());
        play3.setShowHeroDefence(gen3.getDefencePlayer());
        play3.setShowHeroHealt(gen3.getHealtPlayer());
        play3.setSon(this);

        setContentPane(contentPane);
        setModal(true);
        setMinimumSize(new Dimension( WIDTH * SCALE, HEIGHT * SCALE ));
        setMaximumSize(new Dimension( WIDTH * SCALE, HEIGHT * SCALE ));
        setPreferredSize(new Dimension( WIDTH * SCALE, HEIGHT * SCALE ));
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private void onOK() {
// add your code here
        dispose();
    }

}
