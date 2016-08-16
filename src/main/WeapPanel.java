package main;

import javax.swing.*;
import java.awt.event.*;

public class WeapPanel extends JDialog {
    private JPanel contentPane;
    private JLabel titleName;
    private JLabel firstAbility;
    private JButton selectorButton;
    private JLabel iconHeader;
    private JLabel secondAbility;
    public WeapSelector father;

    public void setFather(WeapSelector father) {
        this.father = father;
    }

    public WeapSelector getFather() {
        return this.father;
    }

    public WeapPanel() {
        setContentPane(contentPane);
        setModal(true);
        selectorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                father.setSelectedWeapText(titleName.getText());
            }
        });
    }

    // Nome dell'arma
    public String getTitleNameText() {
        return titleName.getText();
    }

    public void setTitleNameText(String titleName) {
        this.titleName.setText(titleName);
    }


    // Abilità N°1
    public JLabel getFirstAbility() {
        return firstAbility;
    }

    public void setFirstAbility(String firstAbility) {
        this.firstAbility.setText(firstAbility);

    }

    // Abilità N°2
    public void setSecondAbility(String secondAbility) {
        this.secondAbility.setText(secondAbility);
    }

    public JLabel getSecondAbility() {
        return secondAbility;
    }

    // Icona dell'arma
    public JLabel getIconHeader() {
        return iconHeader;
    }

    public void setIconHeaderImage(Icon iconHeaderImage) {
        this.iconHeader.setIcon(iconHeaderImage);
    }

    // Pulsante di selezione
    public JButton getSelectorButton() {
        return selectorButton;
    }

    public void setSelectorButton(JButton selectorButton) {
        this.selectorButton = selectorButton;
    }

}
