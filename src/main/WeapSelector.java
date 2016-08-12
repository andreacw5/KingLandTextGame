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
    public static final int WIDTH=300;
    public static final int HEIGHT=WIDTH/12*9;
    public static final int SCALE=3;

    public void setSelectedWeapText(String selectedWeaponText) {
        this.selectedWeap.setText("Hai selezionato:  "+selectedWeaponText);
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
        pan1.setIconHeaderImage(new ImageIcon(WeapSelector.this.getClass().getResource("/icon/40x40/" + wp1.getName()+ "_icon.png")));
        pan1.setFather(this);

        pan2.setTitleNameText(wp2.getName());
        pan2.setIconHeaderImage(new ImageIcon(WeapSelector.this.getClass().getResource("/icon/40x40/" + wp2.getName()+ "_icon.png")));
        pan2.setFather(this);

        pan3.setTitleNameText(wp3.getName());
        pan3.setIconHeaderImage(new ImageIcon(WeapSelector.this.getClass().getResource("/icon/40x40/" + wp2.getName()+ "_icon.png")));
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


    public static void main(String[] args) {
        ArrayList listOfWeapon = new ArrayList<Weapon>();
        listOfWeapon.add(new Weapon("attack", "1", "4"));
        listOfWeapon.add(new Weapon("defence", "2", "5"));
        listOfWeapon.add(new Weapon("defense", "3", "6"));
        WeapSelector dialog = new WeapSelector(listOfWeapon);
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

}
