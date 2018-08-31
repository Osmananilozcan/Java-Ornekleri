// Scanner kütüphanesi.
import java.util.Scanner;

public class GirilenSayiIcindekiEnBuyukveEnKucukRakamiBulma {
    public static void main(String[] args) {
        // Değişkenler tanımlanıyor.
        int max = 0;
        int min = 10;
        
        System.out.print("Sayı giriniz: ");
        
        // Scanner nesnesi oluşturuluyor.
        Scanner veriAl = new Scanner(System.in);
        
        // Kullanıcıdan sayıyı String tipinde alacağız.
        String sayi = veriAl.next();
        
        // Alınan değerin harflerini tek tek diziye atıyoruz.
        String[] rakamlar = sayi.split("");
        
        for (int i = 0; i < rakamlar.length; i++) {
            if (Integer.parseInt(rakamlar[i]) > max) {
                max = Integer.parseInt(rakamlar[i]);
            } else if (Integer.parseInt(rakamlar[i]) < min) {
                min = Integer.parseInt(rakamlar[i]);
            }
        }
        
        System.out.println("En büyük rakam: " + max);
        System.out.println("En küçük rakam: " + min);
    }
}
