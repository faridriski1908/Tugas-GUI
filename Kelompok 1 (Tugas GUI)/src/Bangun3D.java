public class Bangun3D {
    public int volumekubus(int sisi){
        int hasil = sisi * sisi * sisi;
        return hasil;
    }
    public int luasPerkubus(int sisi){
        int hasil = 6 * (sisi * sisi);
        return hasil;
    }

    public int volumebalok(int panjang, int lebar, int tinggi){
        int hasil = panjang * lebar * tinggi;
        return  hasil;
    }
    public int luasPerbalok(int panjang, int lebar, int tinggi){
        int hasil = (panjang * lebar) + (panjang * tinggi) + (lebar * tinggi);
        return hasil;
    }

    public float volumebola(float jari){
        float phi = (float) 3.14;
        float hasil = (float) 4/3 * phi * (jari * jari * jari);
        return hasil;
    }
    public float luasPerbola(float jari){
        float phi = (float) 3.14;
        float hasil = 4 * phi * (jari * jari);
        return hasil;
    }
}
