/** Hayvan sınıfı extends ile kalıtılıyor. Böylece Hayvan sınıfı metodlarına
 * Hayvan sınıfından nesne oluşturmaya gerek kalmadan kullanabiliyoruz.
 */
public class Surungen extends Hayvan{
    public static void main(String[] args) {
        Surungen s = new Surungen();
        s.nefesAl();
    }
}
