// Random sınıfının kütüphanesi
import java.util.Random;

public class DizidenRastgeleElemanSecme {
    public static void main(String[] args) {
    
        // Elle istediğimiz isimleri yazıyoruz.
        String[] isimlerDizi = {"Osman", "Anıl", "Zafer", "Musa", "Furkan", "Tahir", "Uğur", "Samet"};
        
        // Rastgele bir sayı için nesne oluşturuyoruz.
        Random rastgele = new Random();
        
        // isimlerDizi'nin uzunluğunda bir rastgele sayı üretmesini sağlıyoruz.
        int kacinciEleman = rastgele.nextInt(isimlerDizi.length);
        
        // Üretilen sayıyı dizinin indis değerine verip yazdırıyoruz.
        System.out.println("Rastgele seçilen isim: " + isimlerDizi[kacinciEleman]);
    }
}
