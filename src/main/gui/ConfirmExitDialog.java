package main.gui;

import main.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConfirmExitDialog extends JDialog implements WindowConstants{
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JLabel exitGame;
    private Main mainContainer;
    private static final int WIDTH=400;
    private static final int HEIGHT=WIDTH/12*9;
    private static final int SCALE=3;


    public ConfirmExitDialog(Main mainContainer) {
        this.mainContainer = mainContainer;
        setContentPane(contentPane);
        setModal(true);
        setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        setResizable(false);
        setIconImage(null);
        setTitle("King Land - The RoleplayGame");
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

        mainContainer.setMistic(false);
    }

    private void onCancel() {
// add your code here if necessary
        dispose();
    }

}
