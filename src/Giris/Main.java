package Giris;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java 101 \n Patikası");
        System.out.println("Başlıyoruz");


        /*YORUM SATIRI
        * @author Akın Özsoy, 2023
        *
        *
        * */
        // Yorum satırı

        String vStr = "Java 101 Patikası";
        System.out.println(vStr);
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("A sayısını giriniz : ");
        a = input.nextInt();
        System.out.println("Sayınız : " + a);
        System.out.println("Bir değer giriniz : ");
        double b = input.nextDouble();
        System.out.println(b);


    }
}
