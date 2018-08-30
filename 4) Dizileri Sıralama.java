// Bu kütüphane eklenmeden kod çalışmaz.
import java.util.Arrays;

public class DizileriSiralama {
    public static void main(String[] args) {
        int[] dizi = {1, 2345, 54535, 26457, 13279};
        // dizi sıralandı.
        Arrays.sort (dizi);
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }
}
