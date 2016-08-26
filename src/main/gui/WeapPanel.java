package main.gui;

import main.model.weapon.hero.HeroWeap;

import javax.swing.*;
import java.awt.event.*;

public class WeapPanel extends JDialog {
    private JPanel contentPane;
    private JLabel titleName;
    private JLabel firstAbility;
    private JButton selectorButton;
    private JLabel iconHeader;
    private JLabel secondAbility;
    private JLabel iconSecondAbilityA;
    private JLabel iconFirstAbilityA;
    public WeapSelector father;
    private HeroWeap heroWeap;

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
                father.setSelectedWeapon(heroWeap);
            }
        });
    }

    public HeroWeap getHeroWeapon(){return heroWeap;}

    public void setHeroWeapon(HeroWeap heroWeap){
        this.heroWeap = heroWeap;
        this.iconHeader.setIcon(new ImageIcon( WeapPanel.class.getResource( heroWeap.getImageUrl())));
        this.titleName.setText(heroWeap.getLocalizedName());
        this.firstAbility.setText(heroWeap.getAbility1());
        this.secondAbility.setText(heroWeap.getAbility2());
        this.iconFirstAbilityA.setIcon( new ImageIcon( WeapPanel.class.getResource( heroWeap.getAbility1Url() ) ) );
        this.iconSecondAbilityA.setIcon( new ImageIcon( WeapPanel.class.getResource( heroWeap.getAbility2Url() ) ) );


    }

}
