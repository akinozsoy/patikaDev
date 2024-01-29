package projects;
import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM üzerinden giriniz :");
        mesafe = input.nextInt();
        System.out.println("Yaşınızı Giriniz");
        yas = input.nextInt();
        System.out.println("Yolculuk Tipini Giriniz(1 - Tek Yön, 2 - Gidiş-Geliş");
        yolculukTipi = input.nextInt();
        double fiyat = mesafe * 0.10;
        double yasIndirimi = 0;
        if (yas < 12 ){
            yasIndirimi = fiyat * 0.50;
        } else if (yas >= 12 && yas <= 24) {
            yasIndirimi = fiyat * 0.10;
        } else if (yas >65) {
            yasIndirimi = fiyat * 0.30;
        }
        double yasIndirimiIleToplam = fiyat - yasIndirimi;
        double toplamUcret;
        if(yolculukTipi == 2){
            toplamUcret = yasIndirimiIleToplam * 0.80 * 2;

        }else {
            toplamUcret = yasIndirimiIleToplam;
        }
        System.out.println("Toplam Fiyat :" + toplamUcret);

    }
}
