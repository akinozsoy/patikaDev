package Giris;

public class ifElse {
    public static void main(String[] args) {
        int a = 10 , b = 20 , c = 30;
        int x = 10 , y = 20 , z = 50;
        //boolean compare = a == b;
        boolean compare = a == x && a == b && x == b;
        boolean compare2 = a == x || c == b || x == c;
        String str = compare ? "eşittir " : "Eşit Değildir";
        System.out.println(compare);
        System.out.println(str);

        if (compare) {
            System.out.println("A sayısı :" +a);
            System.out.println("Eşittir");
        }
        else if(compare == compare2){
            System.out.println("Eşit Değildir");
        }
        else{
            System.out.println("null");
        }


    }
}
