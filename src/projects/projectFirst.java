package projects;
import java.util.Scanner;
//Değişkenleri Oluştur


public class projectFirst {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input =new Scanner(System.in);
        System.out.println("Matematik Notunuz :");
        mat = input.nextInt();
        System.out.println("Fizik Notunuz :");
        fizik = input.nextInt();
        System.out.println("Kimya Notunuz :");
        kimya = input.nextInt();
        System.out.println("Türkçe Notunuz :");
        turkce = input.nextInt();
        System.out.println("Tarih Notunuz :");
        tarih = input.nextInt();
        System.out.println("Müzik Notunuz :");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println(sonuc);

        boolean sonuc1 = (sonuc >=60.0);
        String ustTur = sonuc1 ? "Geçti :" : "Kaldı";
        System.out.println("Ortalamanız : " + sonuc + ustTur);
    }
    /**
     *
     * @AUTHOR Akın Özsoy
     * **/
}
