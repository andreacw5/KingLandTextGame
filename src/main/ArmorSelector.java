package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ArmorSelector extends JDialog {
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

    public void setSelectedArmor(String selectedArmorText) {
        this.selectedArmor.setText(selectedArmorText);
    }

    public String getSelectedArmorText() {
        return this.selectedArmor.getText();
    }

    public void setInfoArmor(String wel1){
        this.infoArmor.setText(wel1);
    }

    public void setInfoSelected(String v34){
        this.infoSelected.setText(v34);
    }

    public ArmorSelector(ArrayList<Armor> listOfArmor) {
        Armor ar1 = listOfArmor.get(0);
        Armor ar2 = listOfArmor.get(1);
        Armor ar3 = listOfArmor.get(2);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        far1.setTitleNameA(ar1.getNameA());
        far1.setFirstAbilityA(ar1.getAbility1A());
        far1.setSecondAbilityA(ar1.getAbility2A());
        far1.setIconHeaderA(new ImageIcon(ArmorSelector.this.getClass().getResource("/icon/Weap/Mace_icon.png")));
        far1.setMother(this);

        far2.setTitleNameA(ar2.getNameA());
        far2.setFirstAbilityA(ar2.getAbility1A());
        far2.setSecondAbilityA(ar2.getAbility2A());
        far2.setIconHeaderA(new ImageIcon(ArmorSelector.this.getClass().getResource("/icon/Weap/Mace_icon.png")));
        far2.setMother(this);

        far3.setTitleNameA(ar3.getNameA());
        far3.setFirstAbilityA(ar3.getAbility1A());
        far3.setSecondAbilityA(ar3.getAbility2A());
        far3.setIconHeaderA(new ImageIcon(ArmorSelector.this.getClass().getResource("/icon/Weap/Mace_icon.png")));
        far3.setMother(this);

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
