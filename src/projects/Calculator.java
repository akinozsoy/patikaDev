package projects;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Sayıyı Giriniz : ");
        int n1 = scanner.nextInt();
        System.out.println("2.Sayıyı Giriniz :");
        int n2 = scanner.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiniz :");
        int select = scanner.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplama Sonucu: "+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma Sonucu : "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma Sonucu :"+(n1*n2));
                break;
            case 4:
                System.out.println("Bölme Sonucu : "+(n1/n2));
                break;
            default:
                System.out.println("Yanlış Seçim Yaptınız");
                break;

        }


    }
}
