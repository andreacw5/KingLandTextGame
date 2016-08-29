package main.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShowUniqueBattle extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JLabel dialog1;
    private JLabel dialog2;
    private JLabel dialog3;
    private JLabel dialog4;
    private JLabel dialog5;
    private JLabel dialog6;
    private JLabel iconShow;
    private JLabel TitleBattle;
    public static final int WIDTH=400;
    public static final int HEIGHT=WIDTH/12*9;
    public static final int SCALE=3;


    public ShowUniqueBattle() {
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

                // Uscita dall'applicazione
                System.out.println("Bypass.Exit.System");
                System.out.println("System.Stop.No.Error");
                System.exit(0);
            }
        } );

        // call onCancel() when cross is clicked
        setDefaultCloseOperation( DO_NOTHING_ON_CLOSE );
        addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();

                // Uscita dall'applicazione
                System.out.println("Bypass.Exit.System");
                System.out.println("System.Stop.No.Error");
                System.exit(0);
            }
        } );

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();

                // Uscita dall'applicazione
                System.out.println("Bypass.Exit.System");
                System.out.println("System.Stop.No.Error");
                System.exit(0);
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
        // Uscita dall'applicazione
        System.out.println("Bypass.Exit.System");
        System.out.println("System.Stop.No.Error");
        System.exit(0);
    }

    public JLabel getIconShow() {
        return iconShow;
    }

    public void setIconShow(ImageIcon iconShow) {
        this.iconShow.setIcon(iconShow);
    }

    public JLabel getTitleBattle() {
        return TitleBattle;
    }

    public void setTitleBattle(String titleBattle) {
        this.TitleBattle.setText( titleBattle );
    }

    public JLabel getDialog1() {
        return dialog1;
    }

    public void setDialog1(String dialog1) {
        this.dialog1.setText( dialog1 );
    }

    public JLabel getDialog2() {
        return dialog2;
    }

    public void setDialog2(String dialog2) {
        this.dialog2.setText( dialog2 );
    }

    public JLabel getDialog3() {
        return dialog3;
    }

    public void setDialog3(String dialog3) {
        this.dialog3.setText( dialog3 );
    }

    public JLabel getDialog4() {
        return dialog4;
    }

    public void setDialog4(String dialog4) {
        this.dialog4.setText( dialog4 );
    }

    public JLabel getDialog5() {
        return dialog5;
    }

    public void setDialog5(String dialog5) {
        this.dialog5.setText( dialog5 );
    }

    public JLabel getDialog6() {
        return dialog6;
    }

    public void setDialog6(String dialog6) {
        this.dialog6.setText(dialog6);
    }
}
