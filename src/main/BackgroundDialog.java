package main;

import javax.swing.*;
import java.awt.*;

public class BackgroundDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    public static final int WIDTH=300;
    public static final int HEIGHT=WIDTH/12*9;
    public static final int SCALE=3;

    public BackgroundDialog() {
        setContentPane(contentPane);
        setModal(true);
        setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
        setMaximumSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setPreferredSize(new Dimension (WIDTH*SCALE,HEIGHT*SCALE));
        setResizable(false);
    }

    public static void main(String[] args) {
        BackgroundDialog dialog = new BackgroundDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
