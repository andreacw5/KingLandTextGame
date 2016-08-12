package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShowBattleEnemy extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JLabel warE2;
    private JLabel warE3;
    private JLabel warE4;
    private JLabel warE5;
    private JLabel warE6;
    private JLabel warE7;
    public static final int WIDTH=300;
    public static final int HEIGHT=WIDTH/12*9;
    public static final int SCALE=3;

    public ShowBattleEnemy() {
        setContentPane(contentPane);
        setModal(true);
        setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
        setMaximumSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setPreferredSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setResizable(false);
        setLocationRelativeTo(null);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
// add your code here
        dispose();
    }

    private void onCancel() {
// add your code here if necessary
        dispose();
    }

    public void setWarE2(String testo2){
        this.warE2.setText(testo2);
    }

    public void setWarE3(String testo3){
        this.warE3.setText(testo3);
    }

    public void setWarE4(String testo4){
        this.warE4.setText(testo4);
    }

    public void setWarE5(String testo5){
        this.warE5.setText(testo5);
    }

    public void setWarE6(String testo6){
        this.warE6.setText(testo6);
    }

    public void setWarE7(String testo7){
        this.warE7.setText(testo7);
    }

}
