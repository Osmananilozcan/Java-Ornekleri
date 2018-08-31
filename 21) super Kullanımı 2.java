public class AltSinif extends UstSinif{
    int x;
    public AltSinif(int i, int j) {
        /**
         * Sadece super() ile üst sınıfın yapıcısına ulaşılabiliyor. Ama burada
         * üst sınıfta tanımlanan bir değişkene ulaşıyoruz.
         * super.x = i; kodunda, bu sınıfta tanımladığımız x değişkenine değil.
         * UstSinif'ta tanımlanan x değişkenine erişiyor.
         */
        super.x = i;
        // Bu sınıftaki x değişkenine atıyor.
        x = j;
    }
    
    public static void main(String[] args) {
        AltSinif nesne = new AltSinif(3, 6);
    }
}
