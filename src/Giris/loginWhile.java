package Giris;
import java.util.Scanner;

public class loginWhile {
    public static void main(String[] args) {
        int passw0rd;
        boolean isPassw0rdSucces = false;
        Scanner scanner = new Scanner(System.in);

       while (!isPassw0rdSucces){
           System.out.println("Şifre Giriniz :");
           passw0rd = scanner.nextInt();
            if (passw0rd == 123){
                System.out.println("Doğru");
                isPassw0rdSucces = true;

            }
            else {
                System.out.println("Yanlış");

            }

        }


    }
}
