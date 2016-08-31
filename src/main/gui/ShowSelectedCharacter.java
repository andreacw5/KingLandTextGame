package main.gui;

import main.model.character.Character;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShowSelectedCharacter extends JDialog implements WindowConstants{
    private JPanel contentPane;
    private JButton buttonOK;

    public ShowPlayerPanel getHero() {
        return hero;
    }

    public void setHero(ShowPlayerPanel hero) {
        this.hero = hero;
    }

    public ShowPlayerPanel getEnemy() {
        return enemy;
    }

    public void setEnemy(ShowPlayerPanel enemy) {
        this.enemy = enemy;
    }

    private ShowPlayerPanel hero;
    private ShowPlayerPanel enemy;
    private JLabel yourHero;
    private JLabel yourEnemy;
    private JButton buttonCancel;
    private static final int WIDTH=400;
    private static final int HEIGHT=WIDTH/12*9;
    private static final int SCALE=3;

    public String getYourHero() {
        return yourHero.getText();
    }

    public void setYourHero(String text1) {
        this.yourHero.setText(text1);
    }

    public String getYourEnemy() {
        return yourEnemy.getText();
    }

    public void setYourEnemy(String text2) {
        this.yourEnemy.setText(text2);
    }

    public ShowSelectedCharacter() {
        setContentPane(contentPane);
        setModal(true);
        setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
        setMaximumSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setPreferredSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(null);
        setTitle("King Land - The RoleplayGame");



        buttonOK.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        } );

        buttonCancel.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        } );

        // call onCancel() when cross is clicked
        setDefaultCloseOperation( DO_NOTHING_ON_CLOSE );
        addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        } );

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke( KeyEvent.VK_ESCAPE, 0 ), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT );
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public ShowSelectedCharacter(Character leftCharacter, Character rightCharacter){
        setContentPane(contentPane);
        setModal(true);
        setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
        setMaximumSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setPreferredSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setResizable(false);
        setLocationRelativeTo(null);

        buttonOK.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        } );

        // call onCancel() when cross is clicked
        setDefaultCloseOperation( DO_NOTHING_ON_CLOSE );
        addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        } );

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke( KeyEvent.VK_ESCAPE, 0 ), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT );
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        // Pannello SX
        hero.init( leftCharacter );

        // Pannello DX
        enemy.init( rightCharacter );

        pack();
        setVisible(true);

    }

}
