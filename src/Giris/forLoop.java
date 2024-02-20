package Giris;
import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        for(int sayac = 3; sayac <= 10; sayac+= 2){
            System.out.println(sayac);
        }
        int sum = 0;
        for (int i = 0, j = 0; i < 5 || j < 5; ++i, j = i + 1) {
            sum += i;
        }
        System.out.println(sum);
    }
}
