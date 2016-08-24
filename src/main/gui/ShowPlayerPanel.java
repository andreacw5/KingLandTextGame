package main.gui;

import main.model.Character;

import javax.swing.*;

public class ShowPlayerPanel extends JDialog {
    private JPanel contentPane;
    private JLabel iconSelectedImage;
    private JLabel showSelectedName;
    private JLabel showSelectedHP;
    private JLabel showSelectedAttack;
    private JLabel showSelectedDefence;
    private JLabel showSelectedWeap;
    private JLabel showSelectedArmor;

    public ShowPlayerPanel() {
        setContentPane( contentPane );
        setModal( true );
    }

    public void init(Character caracther) {
        this.setIconSelectedImage(caracther.getImageUrl());
        this.setShowSelectedName(caracther.getName());
        this.setShowSelectedWeap("");
        this.setShowSelectedArmor("");
        this.setShowSelectedAttack("");
        this.setShowSelectedDefence("");
        this.setShowSelectedHP("");
    }


    private void onOK() {
        // add your code here
        dispose();
    }

    // Icona del Character
    public String getSelectedImage() {
        return iconSelectedImage.getText();
    }

    public void setIconSelectedImage(String iconSelectedImage) {
        this.iconSelectedImage.setText(iconSelectedImage);
    }

    // Nome del Character
    public String getShowSelectedName() {
        return showSelectedName.getText();
    }

    public void setShowSelectedName(String showSelectedName) {
        this.showSelectedName.setText(showSelectedName);
    }

    // Arma del Character
    public String getShowSelectedWeap() {
        return showSelectedWeap.getText();
    }

    public void setShowSelectedWeap(String showSelectedWeap) {
        this.showSelectedWeap.setText(showSelectedWeap);
    }

    // Armatura del Character
    public String getShowSelectedArmor() {
        return showSelectedArmor.getText();
    }

    public void setShowSelectedArmor(String showSelectedArmor) {
        this.showSelectedArmor.setText(showSelectedArmor);
    }

    // Attacco del Character
    public String getShowSelectedAttack() {
        return showSelectedAttack.getText();
    }

    public void setShowSelectedAttack(String showSelectedAttack) {
        this.showSelectedAttack.setText(showSelectedAttack);
    }

    // Difesa del Character
    public String getShowSelectedDefence() {
        return showSelectedDefence.getText();
    }

    public void setShowSelectedDefence(String showSelectedDefence) {
        this.showSelectedDefence.setText(showSelectedDefence);
    }

    // HP del Character
    public String getShowSelectedHP() {
        return showSelectedHP.getText();
    }

    public void setShowSelectedHP(String showSelectedHP) {
        this.showSelectedHP.setText(showSelectedHP);
    }
}
