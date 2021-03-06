// Scanner kütüphanesi.
import java.util.Scanner;

public class GirilenSayininRakamlariToplami {
    public static void main(String[] args) {
        int sonuc = 0;
        
        // Scanner nesnesi oluşturuluyor.
        Scanner veriAl = new Scanner(System.in);
        
        // Kullanıcıdan sayı alınıyor.
        int veri1 = veriAl.nextInt();
        
        while (veri1 > 0) {
        
            // Mod ile son rakamı sonuc değişkenine ekliyoruz.
            sonuc += (veri1 % 10);
            
            /** 10'a bölerek son rakamı virgül sonrasına atıyoruz.
             * int değerlerde virgülden sonrasını almadığı için otomatikman
             * son rakam siliniyor ve tekrar modu alınarak aynı işlem
             * uygulanıyor.
             */
            veri1 = veri1 / 10;
        }
        
        // sonuc değişkeni ekrana yazdırılıyor.
        System.out.println("Girdiğiniz sayının rakamları toplamı: " + sonuc);
    }
}
