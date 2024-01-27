package projects;
import java.util.Scanner;


public class BurcBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğum Gününüzü Giriniz : ");
        int day = scanner.nextInt();
        System.out.println("Doğduğunuz Ayınızı Giriniz :");
        int month = scanner.nextInt();
        if ((day == 21) && (month == 3) || (day == 20) && (month == 4)){
            System.out.println("Koç Burcu");
        } else if ((day == 21)&&(month == 4) || (day == 21)&&(month == 5)) {
            System.out.println("Boğa Borcu");

        }else if ((day == 22)&&(month == 5) || (day == 22)&&(month == 6)) {
            System.out.println("İkizler Burcu");

        }else if ((day == 23)&&(month == 6) || (day == 22)&&(month == 7)) {
            System.out.println("Yengeç Burcu");

        }else if ((day == 23)&&(month == 7) || (day == 22)&&(month == 8)) {
            System.out.println("Aslan Burcu");

        }else if ((day == 23)&&(month == 8) || (day == 22)&&(month == 9)) {
            System.out.println("Başak Burcu");

        }else if ((day == 23) && (month == 9) || (day == 22)&&(month == 10)) {
            System.out.println("Terazi Burcu");

        }else if ((day == 23) && (month == 9) || (day == 21)&&(month == 10)) {
            System.out.println("Akrep Burcu");

        }else if ((day == 22) && (month == 10) || (day == 21)&&(month == 11)) {
            System.out.println("Yay Burcu");

        }else if ((day == 22) && (month == 11) || (day == 21)&&(month == 12)) {
            System.out.println("Oğlak Burcu");

        }else if ((day == 22) && (month == 1) || (day == 19)&&(month == 2)) {
            System.out.println("Kova Burcu");
        }else if ((day == 20) && (month == 2 ) || (day == 20)&&(month == 3)) {
            System.out.println("Balık Burcu");
        }

        }
    }

