package projects;
import java.util.Scanner;

public class IndexCalculator {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu giriniz(metre cinsinden) :");
        double height = scanner.nextDouble();
        System.out.println("Lütfen Kilonuzu giriniz(kg cinsinden) :");
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Vücut Kitle İndeksiniz : "+bmi);

    }
}
