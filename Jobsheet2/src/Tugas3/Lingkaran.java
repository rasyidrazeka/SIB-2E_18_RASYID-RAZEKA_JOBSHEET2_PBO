package Tugas3;
public class Lingkaran {
    public double phi=3.14;
    public double r;
    public double luas;
    public double keliling;
    
    public double hitungLuas(){
        luas=phi*r*r;
        return luas;
    }
    public double hitungKeliling(){
        keliling = 2*phi*r;
        return keliling;
    }
    public void printStatus(){
        System.out.println("Jari-Jari : " + r);
        System.out.println("Luas Lingkaran : " + luas);
        System.out.println("Keliling Lingkaran : " + keliling);
    }
}