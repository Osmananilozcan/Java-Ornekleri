public class Yapicilar {
    public Yapicilar(){
        System.out.println("Boş constructor");
    }
    
    public Yapicilar(String ad, String soyad) {
        System.out.println("Hoşgeldiniz " + ad + " " + soyad);
    }
    
    public Yapicilar (int sayi1, int sayi2) {
        System.out.println(sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
    }
}
