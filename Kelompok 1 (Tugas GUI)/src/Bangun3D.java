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

    public float volumekerucut(float jari, float tinggi){
        float phi = (float) 3.14;
        float hasil = (float) 1/3 * phi * jari * jari * tinggi;
        return hasil;
    }
    public float luasPerkerucut(float jari, float sisiMiring){
        float phi = (float) 3.14;
        float hasil = phi * jari * (jari + sisiMiring);
        return  hasil;
    }

    public float volumeLimassegitiga(float alas, float tinggiAlas, float tinggi){
        float luasAlas = (float) 1/2 * alas * tinggiAlas;
        float hasil = (float) 1/3 * luasAlas * tinggi;
        return hasil;
    }
    public float luasPerlimassegitiga(float alas, float tinggiAlas, float segitiga1, float segitiga2, float segitiga3){
        float luasAlas = (float) 1/2 * alas * tinggiAlas;
        float hasil = luasAlas + segitiga1 + segitiga2 +segitiga3;
        return  hasil;
    }

    public float volumeLimassegiempat(float alasSisi, float tinggi){
        float luasAlas = alasSisi * alasSisi;
        float hasil = (float) 1/3 * luasAlas * tinggi;
        return  hasil;
    }
    public float luasPerlimassegiempat(float alasSisi, float segitiga1, float segitiga2, float segitiga3){
        float luasAlas = alasSisi * alasSisi;
        float hasil = luasAlas * segitiga1 * segitiga2 * segitiga3;
        return hasil;
    }

    public float volumePrismasegitiga(float alas, float alasTinggi, float tinggi){
        float luasAlas = (float) 1/2 * alas * alasTinggi;
        float hasil = luasAlas * tinggi;
        return  hasil;
    }
    public float luasPerPrismasegitiga(float alas, float alasTinggi, float alasSisimiring, float tinggi){
        float luasAlas = (float) 1/2 * alas * alasTinggi;
        float kelilingAlas = alas + alasSisimiring + alasTinggi;
        float hasil = (2 * luasAlas) + (kelilingAlas * tinggi);
        return  hasil;
    }
}