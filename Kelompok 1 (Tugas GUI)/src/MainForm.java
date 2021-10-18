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
		
		        //=============Button Hitung3D ketika di klik akan menjalankan program di bawah ini=============
        buttonHitung3D.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bangun3D bangun3D = new Bangun3D();

                if (radioButtonKubus.isSelected()){
                    //menampilkan error message ketika input dikosongkan
                    if (txt4.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Masukkan angka tidak boleh kosong", "Peringatan Error", JOptionPane.ERROR_MESSAGE);
                        txtVolumee.setText("");
                        txtLuaspermukaan.setText("");
                    }
                    //==================================================

                    int sisi = Integer.parseInt(txt4.getText());

                    txtVolumee.setText(Integer.toString(bangun3D.volumekubus(sisi)));
                    txtLuaspermukaan.setText(Integer.toString(bangun3D.luasPerkubus(sisi)));
                }

                if (radioButtonBalok.isSelected()){
                    //menampilkan error message ketika input dikosongkan
                    if (txt4.getText().isEmpty() || txt5.getText().isEmpty() || txt6.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Masukkan angka tidak boleh kosong", "Peringatan Error", JOptionPane.ERROR_MESSAGE);
                        txtVolumee.setText("");
                        txtLuaspermukaan.setText("");
                    }
                    //==================================================

                    int panjang = Integer.parseInt(txt4.getText());
                    int lebar = Integer.parseInt(txt5.getText());
                    int tinggi = Integer.parseInt(txt6.getText());

                    txtVolumee.setText(Integer.toString(bangun3D.volumebalok(panjang, lebar, tinggi)));
                    txtLuaspermukaan.setText(Integer.toString(bangun3D.luasPerbalok(panjang, lebar, tinggi)));
                }

                if (radioButtonBola.isSelected()){
                    //menampilkan error message ketika input dikosongkan
                    if (txt4.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Masukkan angka tidak boleh kosong", "Peringatan Error", JOptionPane.ERROR_MESSAGE);
                        txtVolumee.setText("");
                        txtLuaspermukaan.setText("");
                    }
                    //==================================================

                    float jari = Float.parseFloat(txt4.getText());

                    txtVolumee.setText(Float.toString(Float.parseFloat(String.format("%.2f",bangun3D.volumebola(jari)))));
                    txtLuaspermukaan.setText(Float.toString(Float.parseFloat(String.format("%.2f", bangun3D.luasPerbola(jari)))));
                }

                if (radioButtonKerucut.isSelected()){
                    //menampilkan error message ketika input dikosongkan
                    if (txt4.getText().isEmpty() || txt5.getText().isEmpty() || txt6.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Masukkan angka tidak boleh kosong", "Peringatan Error", JOptionPane.ERROR_MESSAGE);
                        txtVolumee.setText("");
                        txtLuaspermukaan.setText("");
                    }
                    //==================================================

                    float jari = Float.parseFloat(txt4.getText());
                    float tinggi = Float.parseFloat(txt5.getText());
                    float sisiMiring = Float.parseFloat(txt6.getText());

                    txtVolumee.setText(Float.toString(Float.parseFloat(String.format("%.2f", bangun3D.volumekerucut(jari, tinggi)))));
                    txtLuaspermukaan.setText(Float.toString(Float.parseFloat(String.format("%.2f", bangun3D.luasPerkerucut(jari, sisiMiring)))));
                }

                if (radioButtonLimassegitiga.isSelected()){
                    //menampilkan error message ketika input dikosongkan
                    if (txt4.getText().isEmpty() || txt5.getText().isEmpty() || txt6.getText().isEmpty() || txt7.getText().isEmpty() || txt8.getText().isEmpty() || txt9.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Masukkan angka tidak boleh kosong", "Peringatan Error", JOptionPane.ERROR_MESSAGE);
                        txtVolumee.setText("");
                        txtLuaspermukaan.setText("");
                    }
                    //==================================================

                    float tinggi = Float.parseFloat(txt4.getText());
                    float alas = Float.parseFloat(txt5.getText());
                    float tinggiAlas = Float.parseFloat(txt6.getText());
                    float segitiga1 = Float.parseFloat(txt7.getText());
                    float segitiga2 = Float.parseFloat(txt8.getText());
                    float segitiga3 = Float.parseFloat(txt9.getText());

                    txtVolumee.setText(Float.toString(Float.parseFloat(String.format("%.2f", bangun3D.volumeLimassegitiga(alas, tinggiAlas, tinggi)))));
                    txtLuaspermukaan.setText(Float.toString(Float.parseFloat(String.format("%.2f", bangun3D.luasPerlimassegitiga(alas, tinggiAlas, segitiga1, segitiga2, segitiga3)))));
                }

                if (radioButtonLimassegiempat.isSelected()){
                    //menampilkan error message ketika input dikosongkan
                    if (txt4.getText().isEmpty() || txt5.getText().isEmpty() || txt6.getText().isEmpty() || txt7.getText().isEmpty() || txt8.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Masukkan angka tidak boleh kosong", "Peringatan Error", JOptionPane.ERROR_MESSAGE);
                        txtVolumee.setText("");
                        txtLuaspermukaan.setText("");
                    }
                    //==================================================

                    float tinggi = Float.parseFloat(txt4.getText());
                    float alasSisi = Float.parseFloat(txt5.getText());
                    float segitiga1 = Float.parseFloat(txt6.getText());
                    float segitiga2 = Float.parseFloat(txt7.getText());
                    float segitiga3 = Float.parseFloat(txt8.getText());

                    txtVolumee.setText(Float.toString(Float.parseFloat(String.format("%.2f", bangun3D.volumeLimassegiempat(alasSisi, tinggi)))));
                    txtLuaspermukaan.setText(Float.toString(Float.parseFloat(String.format("%.2f", bangun3D.luasPerlimassegiempat(alasSisi, segitiga1, segitiga2, segitiga3)))));
                }

                if (radioButtonPrismasegitiga.isSelected()){
                    if (txt4.getText().isEmpty() || txt5.getText().isEmpty() || txt6.getText().isEmpty() || txt7.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Masukkan angka tidak boleh kosong", "Peringatan Error", JOptionPane.ERROR_MESSAGE);
                        txtVolumee.setText("");
                        txtLuaspermukaan.setText("");
                    }
                    //==================================================

                    float tinggi = Float.parseFloat(txt4.getText());
                    float alas = Float.parseFloat(txt5.getText());
                    float alasTinggi = Float.parseFloat(txt6.getText());
                    float alasSisimiring = Float.parseFloat(txt7.getText());

                    txtVolumee.setText(Float.toString(Float.parseFloat(String.format("%.2f", bangun3D.volumePrismasegitiga(alas, alasTinggi, tinggi)))));
                    txtLuaspermukaan.setText(Float.toString(Float.parseFloat(String.format("%.2f", bangun3D.luasPerPrismasegitiga(alas, alasTinggi, alasSisimiring, tinggi)))));

                }
            }
        });
        //============= END =============

        //============= Ketika user mengklik pilihan radio button di Bangun 3D akan menjalankan koding di bawah ini=============
        radioButtonKubus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl4.setText("Sisi");

                lbl5.setVisible(false);
                lbl6.setVisible(false);
                lbl7.setVisible(false);
                lbl8.setVisible(false);
                lbl9.setVisible(false);
                lbl10.setVisible(false);

                txt4.setVisible(true);
                txt5.setVisible(false);
                txt6.setVisible(false);
                txt7.setVisible(false);
                txt8.setVisible(false);
                txt9.setVisible(false);
                txt10.setVisible(false);

                txtLuaspermukaan.setText("");
                txtVolumee.setText("");
            }
        });
        radioButtonBalok.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl4.setText("Panjang");
                lbl5.setText("Lebar");
                lbl6.setText("Tinggi");

                lbl5.setVisible(true);
                lbl6.setVisible(true);
                lbl7.setVisible(false);
                lbl8.setVisible(false);
                lbl9.setVisible(false);
                lbl10.setVisible(false);
                txt5.setVisible(true);
                txt6.setVisible(true);
                txt7.setVisible(false);
                txt8.setVisible(false);
                txt9.setVisible(false);
                txt10.setVisible(false);

                txtVolumee.setText("");
                txtLuaspermukaan.setText("");
            }
        });
        radioButtonBola.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl4.setText("Jari-Jari");

                lbl5.setVisible(false);
                lbl6.setVisible(false);
                lbl7.setVisible(false);
                lbl8.setVisible(false);
                lbl9.setVisible(false);
                lbl10.setVisible(false);
                txt5.setVisible(false);
                txt6.setVisible(false);
                txt7.setVisible(false);
                txt8.setVisible(false);
                txt9.setVisible(false);
                txt10.setVisible(false);

                txtVolumee.setText("");
                txtLuaspermukaan.setText("");
            }
        });
        radioButtonKerucut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl4.setText("Jari-Jari");
                lbl5.setText("Tinggi");
                lbl6.setText("Sisi Miring");

                lbl5.setVisible(true);
                lbl6.setVisible(true);
                lbl7.setVisible(false);
                lbl8.setVisible(false);
                lbl9.setVisible(false);
                lbl10.setVisible(false);
                txt5.setVisible(true);
                txt6.setVisible(true);
                txt7.setVisible(false);
                txt8.setVisible(false);
                txt9.setVisible(false);
                txt10.setVisible(false);

                txtVolumee.setText("");
                txtLuaspermukaan.setText("");
            }
        });
        radioButtonLimassegitiga.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl4.setText("Tinggi");
                lbl5.setText("Alas");
                lbl6.setText("Tinggi Alas");
                lbl7.setText("Segitiga 1");
                lbl8.setText("Segitiga 2");
                lbl9.setText("Segitiga 3");

                lbl5.setVisible(true);
                lbl6.setVisible(true);
                lbl7.setVisible(true);
                lbl8.setVisible(true);
                lbl9.setVisible(true);
                lbl10.setVisible(false);
                txt5.setVisible(true);
                txt6.setVisible(true);
                txt7.setVisible(true);
                txt8.setVisible(true);
                txt9.setVisible(true);
                txt10.setVisible(false);

                txtVolumee.setText("");
                txtLuaspermukaan.setText("");
            }
        });
        radioButtonLimassegiempat.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl4.setText("Tinggi");
                lbl5.setText("Alas Sisi");
                lbl6.setText("Segitiga 1");
                lbl7.setText("Segitiga 2");
                lbl8.setText("Segitiga 3");

                lbl5.setVisible(true);
                lbl6.setVisible(true);
                lbl7.setVisible(true);
                lbl8.setVisible(true);
                lbl9.setVisible(false);
                lbl10.setVisible(false);
                txt5.setVisible(true);
                txt6.setVisible(true);
                txt7.setVisible(true);
                txt8.setVisible(true);
                txt9.setVisible(false);
                txt10.setVisible(false);

                txtVolumee.setText("");
                txtLuaspermukaan.setText("");
            }
        });
        radioButtonPrismasegitiga.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl4.setText("Tinggi Prisma");
                lbl5.setText("Alas");
                lbl6.setText("Tinggi Alas");
                lbl7.setText("Sisi Miring Alas");

                lbl5.setVisible(true);
                lbl6.setVisible(true);
                lbl7.setVisible(true);
                lbl8.setVisible(false);
                lbl9.setVisible(false);
                lbl10.setVisible(false);
                txt5.setVisible(true);
                txt6.setVisible(true);
                txt7.setVisible(true);
                txt8.setVisible(false);
                txt9.setVisible(false);
                txt10.setVisible(false);

                txtVolumee.setText("");
                txtLuaspermukaan.setText("");
            }
        });
		//============= END =============
	}

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}