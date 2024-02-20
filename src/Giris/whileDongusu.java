package Giris;

public class whileDongusu {
    public static void main(String[] args) {
        int left = 100 , right = 200;
        int i = 1;
        int k;
        System.out.println("Program Başladı");
        while (i <= 5){
            System.out.println(i);
        k = 1;
        while (k <= 10){
            System.out.print(k + ",");
            k++;
        }
        System.out.println();
        i++;
        }

        System.out.println("Program Bitti");

        while (++left < --right);
        System.out.println(left);
    }

}
