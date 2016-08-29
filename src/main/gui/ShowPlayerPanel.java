package main.gui;

import main.manager.BattleManager;
import main.model.character.Character;

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
    private Character insieme;
    private ArmorSelector rr;

    public ShowPlayerPanel() {
        setContentPane( contentPane );
        setModal( true );
        setIconImage(null);
        setTitle("King Land - The RoleplayGame");
    }

    public void init(Character character) {
        this.insieme = character;
        this.setIconSelectedImage(new ImageIcon( Character.class.getResource(character.getImageUrl())));
        this.setShowSelectedName(character.getLocalizedName());
        this.setShowSelectedWeap(character.getWeapon().getLocalizedName());
        this.setShowSelectedArmor(character.getArmor().getLocalizedName());
        this.setShowSelectedAttack(String.valueOf(character.getAttack()));
        this.setShowSelectedDefence(String.valueOf(character.getDefence()));
        this.setShowSelectedHP(String.valueOf(character.getHeath()));
    }


    private void onOK() {
        // add your code here
        dispose();
    }

    // Icona del Character
    public void getSelectedImage(ImageIcon iconSelectedImage) {
        this.iconSelectedImage.setIcon(iconSelectedImage);
    }

    public void setIconSelectedImage(ImageIcon iconSelectedImage) {
        this.iconSelectedImage.setIcon(iconSelectedImage);
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
