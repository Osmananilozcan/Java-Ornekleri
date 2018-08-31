// JOptionPane kütüphanesi
import javax.swing.JOptionPane;

public class JOPtionPaneShowMessageDialogKullanimi {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı alıyoruz.
        String sayi = JOptionPane.showInputDialog("Bir sayı giriniz");
        
        // Alınan sayıyı bilgilendirme ekranıyla gösteriyoruz.
        JOptionPane.showMessageDialog(null, sayi, "Girilen Sayı", JOptionPane.OK_OPTION);
    }
}
