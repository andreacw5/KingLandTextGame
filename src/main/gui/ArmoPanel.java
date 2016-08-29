package main.gui;

import main.model.armor.Armor;

import javax.swing.*;
import java.awt.event.*;

public class ArmoPanel extends JDialog {
    private JPanel contentPane;
    private JLabel iconHeaderA;
    private JLabel titleNameA;
    private JButton selectorButtonA;
    public ArmorSelector mother;
    private Armor heroArmor;

    public void setMother(ArmorSelector mother) {
        this.mother = mother;
    }

    public ArmorSelector getMother() {
        return this.mother;
    }

    public ArmoPanel() {
        setContentPane(contentPane);
        setModal(true);
        setIconImage(null);
        setTitle("King Land - The RoleplayGame");

        selectorButtonA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mother.setCurrentArmor(heroArmor);
            }
        });


    }

    public Armor getHeroArmor(){return heroArmor;}

    public void setHeroArmor(Armor heroArmor){
        this.heroArmor = heroArmor;
        this.iconHeaderA.setIcon(new ImageIcon( ArmoPanel.class.getResource( heroArmor.getImageUrl() ) ) );
        this.titleNameA.setText(heroArmor.getLocalizedName());

    }

}
