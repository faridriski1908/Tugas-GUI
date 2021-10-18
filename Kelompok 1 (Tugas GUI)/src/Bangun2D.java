public class Bangun2D {

    public int kelPersegi(int sisi){
        int hasil = 4 * sisi;
        return hasil;
    }
	
    public int luasPersegi(int sisi) {
        int hasil = sisi * sisi;
        return hasil;
    }

    public int kelPersegiPanjang(int panjang, int lebar){
        int hasil = (2 * panjang) + (2 * lebar);
        return hasil;
    }
	
    public int luasPersegiPanjang(int panjang, int lebar) {
        int hasil = panjang * lebar;
        return hasil;
    }

    public int kelSegitiga(int alas){
        int hasil = 3 * alas;
        return hasil;
    }
	
    public int luasSegitiga(int alas, int tinggi) {
        int hasil = alas * tinggi / 2;
        return hasil;
    }

    public double kelLingkaran(double jari){
        double phi = 3.14;
        double hasil = phi * (2 * jari);
        return hasil;
    }
	
    public double luasLingkaran(double jari) {
        double phi = 3.14;
        double hasil = phi * jari * jari;
        return hasil;
    }

    public int kelJajargenjang(int alas, int sisiMiring){
        int hasil = 2 * (alas + sisiMiring);
        return hasil;
    }
	
    public int luasJajargenjang(int alas, int tinggi) {
        int hasil = alas * tinggi;
        return hasil;
    }
}
