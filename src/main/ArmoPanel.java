/**package main;

import javax.swing.*;
import java.awt.event.*;

public class ArmoPanel extends JDialog {
    private JPanel contentPane;
    private JLabel iconHeaderA;
    private JLabel titleNameA;
    private JLabel firstAbilityA;
    private JLabel secondAbilityA;
    private JButton selectorButtonA;
    public ArmorSelector fatherA;

    public ArmoPanel() {
        setContentPane(contentPane);
        setModal(true);

        selectorButtonA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //fatherA.setSelectedArmorText.(titleNameA.getText());
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
        this.titleNameA.getText();
    }

    public JLabel getFirstAbilityA() {
        return firstAbilityA;
    }

    public void setFirstAbilityA(String firstAbilityA) {
        this.firstAbilityA.getText();
    }

    public JLabel getSecondAbilityA() {
        return secondAbilityA;
    }

    public void setSecondAbilityA(String secondAbilityA) {
        this.secondAbilityA.getText();
    }

    public JButton getSelectorButtonA() {
        return selectorButtonA;
    }

    public void setSelectorButtonA(JButton selectorButtonA) {
        this.selectorButtonA = selectorButtonA;
    }
}

 */