package projects;
import java.util.Scanner;



public class ikiKuvveti {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        n = input.nextInt();
        for (int i = 1;i <= n; i*=2 ){
            System.out.println(i);

        }

    }
}
