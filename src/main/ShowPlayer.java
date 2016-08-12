package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowPlayer extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel showMonsterTitle;
    private JLabel showHeroTitle;
    private JLabel showMonsterAttack;
    private JLabel showHeroAttack;
    private JLabel showHeroName;
    private JLabel showHeroWeap;
    private JLabel showHeroArmor;
    private JLabel showMonsterName;
    private JLabel showMonsterWeap;
    private JLabel showMonsterArmor;
    private JLabel showHeroDefence;
    private JLabel showHeroHealt;
    private JLabel showMonsterDefence;
    private JLabel showMonsterHealt;
    public static final int WIDTH=300;
    public static final int HEIGHT=WIDTH/12*9;
    public static final int SCALE=3;

    public ShowPlayer() {
        setContentPane(contentPane);
        setModal(true);
        setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
        setMaximumSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setPreferredSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setResizable(false);
        setLocationRelativeTo(null);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
// add your code here
        dispose();
    }

    /**
     * Sezione Eroe
     */

    public void setShowHeroTitle(String testo1){
        this.showHeroTitle.setText(testo1);
    }

    // Nome eroe
    public void setShowHeroName(String testo2){
        this.showHeroName.setText(testo2);
    }

    // Arma eroe
    public void setShowHeroWeap(String testo3){
        this.showHeroWeap.setText(testo3);
    }

    // Armatura eroe
    public void setShowHeroArmor(String testo4){
        this.showHeroArmor.setText(testo4);
    }

    // Attacco eroe
    public void setShowHeroAttack(String testo5){
        this.showHeroAttack.setText(testo5);
    }

    // Difesa eroe
    public void setShowHeroDefence(String testo6){
        this.showHeroDefence.setText(testo6);
    }

    // Vita eroe
    public void setShowHeroHealt(String testo7){
        this.showHeroHealt.setText(testo7);
    }

    /**
     * Sezione Mostro
     */

    public void setShowMonsterTitle(String testo15){
        this.showMonsterTitle.setText(testo15);
    }

    // Nome mostro
    public void setShowMonsterName(String testo8){
        this.showMonsterName.setText(testo8);
    }

    // Arma mostro
    public void setShowMonsterWeap(String testo9){
        this.showMonsterWeap.setText(testo9);
    }

    // Armatura mostro
    public void setShowMonsterArmor(String testo10){
        this.showMonsterArmor.setText(testo10);
    }

    // Attacco mostro
    public void setShowMonsterAttack(String testo11){
        this.showMonsterAttack.setText(testo11);
    }

    // Difesa mostro
    public void setShowMonsterDefence(String testo12){
        this.showMonsterDefence.setText(testo12);
    }

    // Vita mostro
    public void setShowMonsterHealt(String testo13){
        this.showMonsterHealt.setText(testo13);
    }

}
