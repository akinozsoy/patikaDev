
package projects;
import java.util.Scanner;
public class TriangleProject {
    public static void main(String[] args) {
        // Değişkenler
        int a,b,alan;
        double c;
        // Kullanıcıdan Verilerimizi Alalım
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz :");
        a = input.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = input.nextInt();
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : "+c);
        alan = a * b / 2;
        System.out.println("Üçgenin alanı :" +alan);




    }
}
