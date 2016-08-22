package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoadingScreen extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    public static final int WIDTH=400;
    public static final int HEIGHT=WIDTH/12*9;
    public static final int SCALE=3;

    public LoadingScreen() {
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
                // Uscita dall'applicazione
                System.out.println("Bypass.Exit.System");
                System.out.println("System.Stop.No.Error");
                System.exit(0);

            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
                // Uscita dall'applicazione
                System.out.println("Bypass.Exit.System");
                System.out.println("System.Stop.No.Error");
                System.exit(0);
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

}
