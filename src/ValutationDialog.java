import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ValutationDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JButton a1Button;
    private JButton a5Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a2Button;
    private JButton a7Button;
    public static final int WIDTH=300;
    public static final int HEIGHT=WIDTH/12*9;
    public static final int SCALE=3;

    public ValutationDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
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
        System.out.println("Show only on develop - exit");
        System.exit(0);
    }

    private void onCancel() {
// add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        ValutationDialog dialog = new ValutationDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
