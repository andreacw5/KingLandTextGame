package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class WeapSelector extends JDialog {
    private JPanel contentPane;
    private WeapPanel pan1;
    private WeapPanel pan2;
    private WeapPanel pan3;
    private JLabel selectedWeap;
    private JButton buttonOK;
    private JLabel infoWeap;
    private JLabel infoSelected;
    public static final int WIDTH=300;
    public static final int HEIGHT=WIDTH/12*9;
    public static final int SCALE=3;


    public void setSelectedWeapText(String selectedWeaponText) {
        this.selectedWeap.setText(selectedWeaponText);
    }

    public String getSelectedWeapText() {
        return this.selectedWeap.getText();
    }

    public void setInfoWeap(String wel1){
        this.infoWeap.setText(wel1);
    }

    public void setInfoSelected(String v34){
        this.infoSelected.setText(v34);
    }

    public WeapSelector(ArrayList<Weapon> listOfWeapon) {
        Weapon wp1 = listOfWeapon.get(0);
        Weapon wp2 = listOfWeapon.get(1);
        Weapon wp3 = listOfWeapon.get(2);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        pan1.setTitleNameText(wp1.getName());
        pan1.setFirstAbility(wp1.getAbility1());
        pan1.setSecondAbility(wp1.getAbility2());
        pan1.setIconHeaderImage(new ImageIcon(WeapSelector.this.getClass().getResource("/icon/Weap/Mace_icon.png")));
        pan1.setFather(this);

        pan2.setTitleNameText(wp2.getName());
        pan2.setFirstAbility(wp2.getAbility1());
        pan2.setSecondAbility(wp2.getAbility2());
        pan2.setIconHeaderImage(new ImageIcon(WeapSelector.this.getClass().getResource("/icon/Weap/Sword_icon.png")));
        pan2.setFather(this);

        pan3.setTitleNameText(wp3.getName());
        pan3.setFirstAbility(wp3.getAbility1());
        pan3.setSecondAbility(wp3.getAbility2());
        pan3.setIconHeaderImage(new ImageIcon(WeapSelector.this.getClass().getResource("/icon/Weap/Crossbow_icon.png")));
        pan3.setFather(this);

        setContentPane(contentPane);
        setModal(true);
        setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
        setMaximumSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setPreferredSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setResizable(false);
        setLocationRelativeTo(null);

    }

    private void onOK() {
// add your code here
        dispose();
    }

}
