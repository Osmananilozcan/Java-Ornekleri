// Scanner kütüphanesi
import java.util.Scanner;

public class IkiDegerArasindakilerinToplami {
    public static void main(String[] args) {
        
        // Scanner nesnesi oluşturuldu.
        Scanner veriAl = new Scanner (System.in);
        
        // Toplamı hesaplamak için değişken oluşturuyoruz.
        int toplam = 0;
        
        System.out.print("Küçük sayıyı giriniz: ");
        // Kullanıcıdan birinci veri alınıyor.
        int veri1 = veriAl.nextInt();
        
        System.out.print("Büyük sayıyı giriniz: ");
        // Kullanıcıdan ikinci veri alınıyor.
        int veri2 = veriAl.nextInt();
        
        for (int i = veri1; i <= veri2; i++) {
            toplam += i;
        }
        
        /** Girilen küçük sayıda dahil oluyor. Dahil olması istenmiyorsa 
         * for içindeki veri1 değerine +1 ekleyin.
         */
        System.out.println("Sayıların toplamı: " + toplam);
    }
}
