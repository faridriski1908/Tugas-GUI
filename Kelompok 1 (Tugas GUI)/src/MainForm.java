import javax.swing.*;
import java.awt.event.*;

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

    public MainForm() {
        //=============Button Hitung2D ketika di klik akan menjalankan program di bawah ini=============
        buttonHitung2D.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bangun2D bangun2D = new Bangun2D();

                if (radioButtonPersegi.isSelected()){
                    //menampilkan error message ketika input dikosongkan
                    if (txt1.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Masukkan angka tidak boleh kosong", "Peringatan Error", JOptionPane.ERROR_MESSAGE);
                        txtKeliling.setText("");
                        txtLuas.setText("");
                    }
                    //==================================================

                    int sisi = Integer.parseInt(txt1.getText());

                    txtKeliling.setText(Integer.toString(bangun2D.kelPersegi(sisi)));
                    txtLuas.setText(Integer.toString(bangun2D.luasPersegi(sisi)));
                }

                if (radioButtonPersegiPanjang.isSelected()){
                    //menampilkan error message ketika input dikosongkan
                    if (txt1.getText().isEmpty() || txt2.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Masukkan angka tidak boleh kosong", "Peringatan Error", JOptionPane.ERROR_MESSAGE);
                        txtKeliling.setText("");
                        txtLuas.setText("");
                    }
                    //==================================================

                    int panjang = Integer.parseInt(txt1.getText());
                    int lebar = Integer.parseInt(txt2.getText());


                    txtKeliling.setText(Integer.toString(bangun2D.kelPersegiPanjang(panjang, lebar)));
                    txtLuas.setText(Integer.toString(bangun2D.luasPersegiPanjang(panjang, lebar)));
                }

                if (radioButtonSegitiga.isSelected()){
                    //menampilkan error message ketika input dikosongkan
                    if (txt1.getText().isEmpty() || txt2.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Masukkan angka tidak boleh kosong", "Peringatan Error", JOptionPane.ERROR_MESSAGE);
                        txtKeliling.setText("");
                        txtLuas.setText("");
                    }
                    //==================================================

                    int alas = Integer.parseInt(txt1.getText());
                    int tinggi = Integer.parseInt(txt2.getText());


                    txtKeliling.setText(Integer.toString(bangun2D.kelSegitiga(alas)));
                    txtLuas.setText(Integer.toString(bangun2D.luasSegitiga(alas, tinggi)));
                }

                if (radioButtonLingkaran.isSelected()){
                    //menampilkan error message ketika input dikosongkan
                    if (txt1.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Masukkan angka tidak boleh kosong", "Peringatan Error", JOptionPane.ERROR_MESSAGE);
                        txtKeliling.setText("");
                        txtLuas.setText("");
                    }
                    //==================================================

                    double jari = Double.parseDouble(txt1.getText());

                    txtKeliling.setText(Double.toString(bangun2D.kelLingkaran(jari)));
                    txtLuas.setText(Double.toString(bangun2D.luasLingkaran(jari)));
                }

                if (radioButtonJajargenjang.isSelected()) {
                    //menampilkan error message ketika input dikosongkan
                    if (txt1.getText().isEmpty() || txt2.getText().isEmpty() || txt3.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Masukkan angka tidak boleh kosong", "Peringatan Error", JOptionPane.ERROR_MESSAGE);
                        txtKeliling.setText("");
                        txtLuas.setText("");
                    }
                    //==================================================

                    int alas = Integer.parseInt(txt1.getText());
                    int tinggi = Integer.parseInt(txt2.getText());
                    int sisiMiring = Integer.parseInt(txt3.getText());

                    txtKeliling.setText(Integer.toString(bangun2D.kelJajargenjang(alas, sisiMiring)));
                    txtLuas.setText(Integer.toString(bangun2D.luasJajargenjang(alas, tinggi)));
                }
            }
        });
        //============= END =============

        //============= Ketika user mengklik pilihan radio button Bangun 2D akan menjalankan koding di bawah ini=============
        radioButtonPersegi.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl1.setText("Sisi");

                lbl2.setVisible(false);
                lbl2.setVisible(false);
                lbl3.setVisible(false);
                txt2.setVisible(false);
                txt3.setVisible(false);

                txtKeliling.setText("");
                txtLuas.setText("");
            }
        });
        radioButtonPersegiPanjang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl1.setText("Panjang");
                lbl2.setText("Lebar");

                lbl2.setVisible(true);
                lbl3.setVisible(false);
                txt2.setVisible(true);
                txt3.setVisible(false);

                txtKeliling.setText("");
                txtLuas.setText("");
            }
        });
        radioButtonSegitiga.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl1.setText("Alas");
                lbl2.setText("Tinggi");

                lbl2.setVisible(true);
                lbl3.setVisible(false);
                txt2.setVisible(true);
                txt3.setVisible(false);

                txtKeliling.setText("");
                txtLuas.setText("");
            }
        });
        radioButtonLingkaran.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl1.setText("Jari-Jari");

                lbl2.setVisible(false);
                lbl3.setVisible(false);
                txt2.setVisible(false);
                txt3.setVisible(false);

                txtKeliling.setText("");
                txtLuas.setText("");
            }
        });
        radioButtonJajargenjang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl1.setText("Alas");
                lbl2.setText("Tinggi");
                lbl3.setText("Sisi Miring");

                lbl2.setVisible(true);
                lbl3.setVisible(true);
                txt2.setVisible(true);
                txt3.setVisible(true);

                txtKeliling.setText("");
                txtLuas.setText("");
            }
        });
        //============= END =============

        public static void main(String[] args) {
            JFrame frame = new JFrame("MainForm");
            frame.setContentPane(new MainForm().rootPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }