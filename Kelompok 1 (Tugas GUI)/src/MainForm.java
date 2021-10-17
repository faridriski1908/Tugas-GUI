import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainForm {
    private JPanel rootPanel;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JTextField txt1;
    private JTextField txt2;
    private JTextField txt3;
    private JButton buttonHitung2D;
    private JRadioButton radioButtonPersegi;
    private JRadioButton radioButtonPersegiPanjang;
    private JRadioButton radioButtonSegitiga;
    private JRadioButton radioButtonLingkaran;
    private JLabel lblLuas;
    private JLabel lblKeliling;
    private JTextField txtLuas;
    private JTextField txtKeliling;
    private JRadioButton radioButtonJajargenjang;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lbl6;
    private JLabel lbl7;
    private JLabel lbl8;
    private JLabel lbl9;
    private JTextField txt4;
    private JTextField txt5;
    private JTextField txt6;
    private JTextField txt7;
    private JTextField txt8;
    private JTextField txt9;
    private JRadioButton radioButtonKubus;
    private JRadioButton radioButtonBalok;
    private JRadioButton radioButtonBola;
    private JRadioButton radioButtonKerucut;
    private JRadioButton radioButtonLimassegitiga;
    private JRadioButton radioButtonLimassegiempat;
    private JRadioButton radioButtonPrismasegitiga;
    private JTextField txt10;
    private JLabel lblvolume;
    private JLabel lblLuasPer;
    private JTextField txtVolumee;
    private JTextField txtLuaspermukaan;
    private JButton buttonHitung3D;
    private JLabel lbl10;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
