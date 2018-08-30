public class DortIslemMetodlari {
    int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
    
    int cikart(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }
    
    int carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }
    
    void bol(double sayi1, double sayi2) {
        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println("Bolme sonuc: " + sayi1 / sayi2);
        } else {
            System.out.println("0'dan büyük olmalı!");
        }
    }
}
