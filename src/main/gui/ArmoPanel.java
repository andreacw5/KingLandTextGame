package main.gui;

import javax.swing.*;
import java.awt.event.*;

public class ArmoPanel extends JDialog {
    private JPanel contentPane;
    private JLabel iconHeaderA;
    private JLabel titleNameA;
    private JLabel firstAbilityA;
    private JLabel secondAbilityA;
    private JButton selectorButtonA;
    private JLabel iconFirstAbility;
    private JLabel IconSecondAbility;
    public ArmorSelector mother;

    public void setMother(ArmorSelector mother) {
        this.mother = mother;
    }

    public ArmorSelector getMother() {
        return this.mother;
    }

    public ArmoPanel() {
        setContentPane(contentPane);
        setModal(true);

        selectorButtonA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mother.setSelectedArmor(titleNameA.getText());
            }
        });

    }

    public JLabel getIconHeaderA() {
        return iconHeaderA;
    }

    public void setIconHeaderA(Icon iconHeaderA) {
        this.iconHeaderA.setIcon(iconHeaderA);
    }

    public JLabel getTitleNameA() {
        return titleNameA;
    }

    public void setTitleNameA(String titleNameA) {
        this.titleNameA.setText(titleNameA);
    }

    public JLabel getFirstAbilityA() {
        return firstAbilityA;
    }

    public void setFirstAbilityA(String firstAbilityA) {
        this.firstAbilityA.setText(firstAbilityA);
    }

    public JLabel getSecondAbilityA() {
        return secondAbilityA;
    }

    public JLabel getIconFirstAbility() {
        return iconFirstAbility;
    }

    public void setIconFirstAbility(Icon iconFirstAbility) {
        this.iconFirstAbility.setIcon(iconFirstAbility);
    }

    public void setSecondAbilityA(String secondAbilityA) {
        this.secondAbilityA.setText(secondAbilityA);
    }

    public JButton getSelectorButtonA() {
        return selectorButtonA;
    }

    public JLabel getIconSecondAbility() {
        return IconSecondAbility;
    }

    public void setIconSecondAbility(Icon IconSecondAbility) {
        this.IconSecondAbility.setIcon(IconSecondAbility);
    }

    public void setSelectorButtonA(JButton selectorButtonA) {
        this.selectorButtonA = selectorButtonA;
    }
}
