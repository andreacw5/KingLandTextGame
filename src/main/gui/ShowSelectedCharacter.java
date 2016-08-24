package main.gui;

import main.model.Character;
import main.model.hero.ArmoredSamurai;
import main.model.hero.Hero;
import main.model.monster.DarknessKnight;
import main.model.monster.Monster;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ShowSelectedCharacter extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private ShowPlayerPanel hero;
    private ShowPlayerPanel enemy;
    private JButton buttonCancel;
    public static final int WIDTH=400;
    public static final int HEIGHT=WIDTH/12*9;
    public static final int SCALE=3;

    public ShowSelectedCharacter() {
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

    }

}
