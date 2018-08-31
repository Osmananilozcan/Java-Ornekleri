public class DizileriKopyalamaBirinciYontem {
    public static void main(String[] args) {
        int[] dizi1 = {1, 2, 3, 4, 5};
        int[] dizi2 = new int[dizi1.length];
        
        for (int i = 0; i < dizi1.length; i++){
            dizi2[i] = dizi1[i];
            System.out.println(dizi2[i]);
        }
        
        /**
        for (int i = 0; i < dizi2.length; i++) {
            System.out.println(dizi2[i]);
        }
        */
    }
}
