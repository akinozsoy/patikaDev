package Giris;

public class SwitchCase {
    public static void main(String[] args) {
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Bügün Pazartesi");
                break;
            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.println("Bugün Çarşamba");
                break;
            default:
                System.out.println("Hatalı Giriş yaptınız");
        }

    }
}
