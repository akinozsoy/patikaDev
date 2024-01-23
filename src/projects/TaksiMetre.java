package projects;
import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20,startPrice = 10,total;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM Cinsinden giriniz : ");
        km = input.nextInt();
        total = (perKm * km);
        total +=startPrice;
        total =(total<20) ? 20 : total;
        System.out.println("Ücretiniz : " +total);
        //



    }
}

