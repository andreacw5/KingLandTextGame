package main.gui;

import main.model.armor.Armor;
import main.util.MessageUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArmorSelector extends JDialog implements WindowConstants{
    private JPanel contentPane;
    private JLabel infoArmor;
    private JButton buttonOK;
    private JLabel selectedArmor;
    private JLabel infoSelected;
    private ArmoPanel far1;
    private ArmoPanel far2;
    private ArmoPanel far3;
    public static final int WIDTH=400;
    public static final int HEIGHT=WIDTH/12*9;
    public static final int SCALE=3;

    public Armor getCurrentArmor() {
        return currentArmor;
    }

    public void setCurrentArmor(Armor currentArmor) {
        this.currentArmor = currentArmor;
        buttonOK.setEnabled(true);
        this.selectedArmor.setText(currentArmor.getLocalizedName());
    }

    private Armor currentArmor;

    public void setInfoArmor(String wel1){
        this.infoArmor.setText(wel1);
    }

    public void setInfoSelected(String v34){
        this.infoSelected.setText(v34);
    }

    public ArmorSelector(Armor[] armorList) {
        buttonOK.setEnabled(false);
        Armor ar1 = armorList[0];
        Armor ar2 = armorList[1];
        Armor ar3 = armorList[2];

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        far1.setHeroArmor(ar1);
        far1.setMother(this);

        far2.setHeroArmor(ar2);
        far2.setMother(this);

        far3.setHeroArmor(ar3);
        far3.setMother(this);

        setContentPane(contentPane);
        setModal(true);
        setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
        setMaximumSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setPreferredSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setResizable(false);
        setLocationRelativeTo(null);
        setInfoArmor( MessageUtils.getLocalizedString( "infoArmor"));
        setInfoSelected(MessageUtils.getLocalizedString( "infoSelected"));
        pack();
        setIconImage(null);
        setTitle("King Land - The RoleplayGame");
        setVisible(true);

    }

    private void onOK() {
// add your code here
        dispose();
    }

}
