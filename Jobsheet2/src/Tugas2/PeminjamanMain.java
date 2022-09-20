package Tugas2;
public class PeminjamanMain {
    public static void main(String[] args){
        Peminjaman pnjm1 = new Peminjaman();
        pnjm1.id=0001;
        pnjm1.namaMember="Rasyid";
        pnjm1.namaGame="GTA V";
        pnjm1.lamaPinjam=2;
        pnjm1.harga=35000;
        pnjm1.hargaBayar();
        pnjm1.dataPeminjaman();
    }
}
