package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArmorSelector extends JDialog {
    private JPanel contentPane;
    private JButton buttonSt1;
    private JLabel showHeroAttack;
    private JButton buttonSt2;
    private JLabel armorSt2;
    private JLabel armorSt1;
    private JLabel armorSt3;
    private JButton buttonSt3;
    private WeapPanel weapPanel1;
    public static final int WIDTH=300;
    public static final int HEIGHT=WIDTH/12*9;
    public static final int SCALE=3;

    public ArmorSelector() {
        setContentPane(contentPane);
        setModal(true);
        setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
        setMaximumSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setPreferredSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setResizable(false);
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(buttonSt1);

        buttonSt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
// add your code here
        dispose();
    }

    public static void main(String[] args) {
        ArmorSelector dialog = new ArmorSelector();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
