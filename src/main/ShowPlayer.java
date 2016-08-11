package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowPlayer extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel show3;
    private JLabel show2;
    private JLabel show1;
    private JLabel show5;
    private JLabel show4;
    public static final int WIDTH=300;
    public static final int HEIGHT=WIDTH/12*9;
    public static final int SCALE=3;

    public ShowPlayer() {
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
    }

    private void onOK() {
// add your code here
        dispose();
    }

    public void setShow1(String testo1){
        this.show1.setText(testo1);
    }

    public void setShow2(String testo2){
        this.show2.setText(testo2);
    }

    public void setShow3(String testo3){
        this.show3.setText(testo3);
    }

    public void setShow4(String testo4){
        this.show4.setText(testo4);
    }

    public void setShow5(String testo5){
        this.show5.setText(testo5);
    }

}
