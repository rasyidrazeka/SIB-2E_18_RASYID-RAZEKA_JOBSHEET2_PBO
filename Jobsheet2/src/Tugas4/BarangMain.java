package Tugas4;
public class BarangMain {
    public static void main(String[] args){
        Barang brg = new Barang();
        brg.kode="brg01";
        brg.namaBarang="Lemari Kayu";
        brg.hargaDasar=500000;
        brg.diskon=10;
        brg.hitungHargaJual();
        brg.tampilData();
    }
}
