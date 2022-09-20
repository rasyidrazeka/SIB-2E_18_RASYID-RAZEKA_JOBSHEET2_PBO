package Tugas2;
public class Peminjaman {
    public int id, harga, lamaPinjam;
    public String namaMember, namaGame;
    
    public void hargaBayar(){
        harga = lamaPinjam*harga;
    }
    public void dataPeminjaman(){
        System.out.println("ID : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Lama Pinjam : " + lamaPinjam + " hari");
        System.out.println("Harga Bayar : Rp " + harga);
    }
}