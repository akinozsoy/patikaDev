package Giris;

public class Kosullar {
    public static void main(String[] args) {
        int a = 10, b = 10, c ;
        c = (a == b) ? 2:3;

        boolean kosul1 = (a < b);
        boolean kosul2 = (a > c);
        boolean sonuc = kosul1 || kosul2;
        System.out.println(kosul1);
        System.out.println(kosul2);
        System.out.println(!sonuc);
        System.out.println(c);
        boolean x = true, y = false;
        System.out.println((x && y) || (x || y));



    }
}
