package projects;
import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double armut_fiyat = 2.14;
        final double elma_fiyat = 3.67;
        final double domates_fiyat = 3.67;
        final double muz_fiyat = 0.95;
        final double patlican_fiyat = 5.0;

        System.out.print("Armut Kaç Kilo :");
        double armutFiyat = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo :");
        double elmaFiyat = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo :");
        double domatesFiyat = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo :");
        double muzFiyat = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo :");
        double patlicanFiyat = scanner.nextDouble();


        double totalAmount = (
                armutFiyat * armut_fiyat) +
                (elmaFiyat * elma_fiyat) +
                (domatesFiyat * domates_fiyat)+
                (muzFiyat + muz_fiyat) +
                (patlicanFiyat + patlican_fiyat);

        System.out.println("Toplam Fiyat :"+totalAmount);
        scanner.close();










    }
}
