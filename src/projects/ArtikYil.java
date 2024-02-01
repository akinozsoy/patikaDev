package projects;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yılı Giriniz :");
        int yil  = input.nextInt();
        if (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0))
        {
            System.out.println(yil + " artık yıldır.");
        }
        else
        {
            System.out.println(yil + " artık yıl değildir.");
        }

    }
}
