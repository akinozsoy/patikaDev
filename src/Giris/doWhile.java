package Giris;
import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass;
        boolean askPassw0rd = true;
        do {
            System.out.println("Şifre Giriniz :");
            pass = scanner.nextInt();
            if (pass == 123){
                askPassw0rd = false;
            }
            else {
                System.out.println("Yanlış");
            }

        }while (askPassw0rd);

    }
}
