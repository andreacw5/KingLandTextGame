package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShowBattle extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel war2;
    private JLabel war3;
    private JLabel war4;
    private JLabel war5;
    private JLabel war6;
    private JLabel war7;
    private JButton buttonCancel;
    public static final int WIDTH=300;
    public static final int HEIGHT=WIDTH/12*9;
    public static final int SCALE=3;


    public ShowBattle() {
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

    public void setWar2(String testo2){
        this.war2.setText(testo2);
    }

    public void setWar3(String testo3){
        this.war3.setText(testo3);
    }

    public void setWar4(String testo4){
        this.war4.setText(testo4);
    }

    public void setWar5(String testo5){
        this.war5.setText(testo5);
    }

    public void setWar6(String testo6){
        this.war6.setText(testo6);
    }

    public void setWar7(String testo7){
        this.war7.setText(testo7);
    }

}
