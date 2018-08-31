// Scanner kütüphanesi
import java.util.Scanner;

public class ScannerIleKullanicidanVeriAlma {
    public static void main(String[] args) {
        // Nesne oluşturuldu.
        Scanner veriAl = new Scanner (System.in);
        
        // Kullanıcıdan veriler alınıyor.
        int veri1 = veriAl.nextInt();
        int veri2 = veriAl.nextInt();
        
        // Kullanıcıdan alınan veriler ekrana yazdırılıyor.
        System.out.println("Girilen değerler: " + veri1 + ", " + veri2);
    }
}
