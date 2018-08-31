public class OgrenciKayit {
    public static void main(String[] args) {
        Ogrenci osman = new Ogrenci();
        osman.setAd("Osman Anıl");
        osman.setSoyad("Özcan");
        osman.setBolum("Bilgisayar Programcılığı");
        osman.setNumara(2016123456);
        
        System.out.println(osman.getAd() + " " + osman.getSoyad() + " " + osman.getBolum() + " " + osman.getNumara());
    }
}
