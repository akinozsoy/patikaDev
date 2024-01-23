
package projects;
import java.util.Scanner;
public class TriangleProject {
    public static void main(String[] args) {
        // Değişkenler
        int a,b;
        double c;
        // Kullanıcıdan Verilerimizi Alalım
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz :");
        a = input.nextInt();
        System.out.println("2. Kenarı Giriniz : ");
        b = input.nextInt();
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : "+ c );
    }
}
