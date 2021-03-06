// Scanner kütüphanesi
import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        System.out.print("Sayıyı giriniz: ");
        
        // Scanner nesnesi oluşturuluyor.
        Scanner veriAl = new Scanner(System.in);
        
        int sayi = veriAl.nextInt();
        
        // En küçük asal sayı 2 olduğu için 2 verdik.
        int sayac = 0, bolen = 2;
        
        while(true){
            /** sayi ile bolen eşit olana kadar bolen sürekli arttırılıyor.
             * bolen ile sayi eşit olduğu zaman while döngüsünden çıkılıyor.
             * Asal bir sayı girildiyse birinci if'in içine hiç bir zaman 
             * girmiyor. Bu yüzden sayaç 0 oluyor. Sayaç 0 olduğunda ise asal
             * yazdırıyor.
             * 
             * Asal olmayan bir sayı girseydik mesela 6. bolen 2'den başlıyor
             * ve 6, 2'ye bölünebildiği için sayaç artacak. break komutu ile
             * döngüden çıkacak ve sayaç 0'dan büyük olduğu için asal değil
             * yazdıracak.
             */
            if (sayi % bolen == 0) {
                sayac++;
                break;
            }
            bolen++;
            if (bolen == sayi) {
                break;
            }
        }
        if (sayac == 0) {
            System.out.println("Girilen sayı asal");
        } else {
            System.out.println("Girilen sayı asal değil");
        }
    }
    /** Denemelik asal sayılar
    2 	3 	5 	7 	11 	13 	17 	19 	23 	29
    31 	37 	41 	43 	47 	53 	59 	61 	67 	71
    73 	79 	83 	89 	97 	101 	103 	107 	109 	113
    127 131 	137 	139 	149 	151 	157 	163 	167
    */
}
