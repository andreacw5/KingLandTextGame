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
    private WeapSelector father;

    public void setFather(WeapSelector father) {
        this.father = father;
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

    public String getTitleNameText() {
        return titleName.getText();
    }

    public void setTitleNameText(String titleName) {
        this.titleName.setText(titleName);
    }

    public JLabel getSecondAbility() {
        return secondAbility;
    }

    public void setSecondAbility(JLabel secondAbility) {
        this.secondAbility = secondAbility;
    }

    public JLabel getIconHeader() {
        return iconHeader;
    }

    public void setIconHeaderImage(Icon iconHeaderImage) {
        this.iconHeader.setIcon(iconHeaderImage);
    }

    public JButton getSelectorButton() {
        return selectorButton;
    }

    public void setSelectorButton(JButton selectorButton) {
        this.selectorButton = selectorButton;
    }

    public JLabel getFirstAbility() {
        return firstAbility;
    }

    public void setFirstAbility(JLabel firstAbility) {
        this.firstAbility = firstAbility;
    }

}
