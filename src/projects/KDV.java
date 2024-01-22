package projects;
import java.util.Scanner; // KULLANICIDAN VERİ GİRİŞİ İÇİN KULLANILAN KÜTÜPHANE
public class KDV {
    public static void main(String[] args) {
       double tutar,kdvoran = 0.18,kdvTutar,kdvliTutar; // %18 KDV TUTARI OLARAK ALINDI
       Scanner input = new Scanner(System.in);// VERİ GİRİŞİ İÇİN ÇAĞIRILAN SCANNER KÜTÜPHANESİ
        System.out.print("Ücret Tutarınız giriniz :");
        tutar = input.nextDouble(); // İNPUT DEĞERİ 0.18 YANİ KDV ORANI %18 0LARAK GÖSTERİMİ
        kdvTutar = tutar * kdvoran; // kdvTutar MARILEN TUTAR VE KDV ORANI İLE ÇARPIMI
        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz Tutar : " +tutar);
        System.out.println("KDV Oranı  : " +kdvoran);
        System.out.println("KDV Tutarı  : " +kdvTutar);
        System.out.println("KDV'li Tutarı  : " +kdvliTutar);



    }
}
