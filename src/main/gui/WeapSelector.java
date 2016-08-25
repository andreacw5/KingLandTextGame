package main.gui;

import main.model.weapon.Weapon;
import main.model.weapon.hero.HeroWeap;
import main.util.MessageUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeapSelector extends JDialog {
    private JPanel contentPane;
    private WeapPanel pan1;
    private WeapPanel pan2;
    private WeapPanel pan3;
    private JLabel selectedWeap;
    private JButton buttonOK;
    private JLabel infoWeap;
    private JLabel infoSelected;
    public static final int WIDTH=400;
    public static final int HEIGHT=WIDTH/12*9;
    public static final int SCALE=3;

    public Weapon getSelectedWeapon() {
        return selectedWeapon;
    }

    public void setSelectedWeapon(Weapon selectedWeapon) {
        this.selectedWeapon = selectedWeapon;
        this.selectedWeap.setText(this.selectedWeapon.getLocalizedName());
    }

    private Weapon selectedWeapon;

    public void setInfoWeap(String wel1){
        this.infoWeap.setText(wel1);
    }

    public void setInfoSelected(String v34){
        this.infoSelected.setText(v34);
    }

    public WeapSelector(HeroWeap[] heroWList) {
        HeroWeap wp1 = heroWList[0];
        HeroWeap wp2 = heroWList[1];
        HeroWeap wp3 = heroWList[2];

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        // Pannello SX
        pan1.setHeroWeapon( wp1 );
        pan1.setFather(this);

        // Pannello Centrale
        pan2.setHeroWeapon( wp2 );
        pan2.setFather(this);

        // Pannello DX
        pan3.setHeroWeapon( wp3 );
        pan3.setFather(this);

        setContentPane(contentPane);
        setModal(true);
        setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
        setMaximumSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setPreferredSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setResizable(false);
        setLocationRelativeTo(null);
        setInfoWeap( MessageUtils.getLocalizedString( "infoWeap"));
        setInfoSelected(MessageUtils.getLocalizedString( "infoSelected"));
        pack();
        setVisible(true);


    }

    private void onOK() {
// add your code here
        dispose();
    }

}
