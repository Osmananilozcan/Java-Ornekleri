public class SinifB extends SinifA{
    /**
     *  Türetilen sınıftaki metod bize yetmez ve üstüne daha da özellik eklemek
     * gerekiyorsa, metodları Override ederiz. Böylece metod üzerinde
     * özelleştirmeler yapabiliriz.
     * 
     *  alt+insert -> Override yaptığımızda, SinifA'yı extends ettiğimiz için
     * SınıfA'da bulunan metod gözüküyor.
     */
    @Override
    public String metod() {
        return ad + sayi + ad; //To change body of generated methods, choose Tools | Templates.
    }
}
