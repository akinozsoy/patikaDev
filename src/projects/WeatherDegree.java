package projects;
import java.util.Scanner;

public class WeatherDegree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklık giriniz: ");
        int sicaklik = scanner.nextInt();

        String etkinlik = sicaklik < 5 ? "Kayak yapmayı düşünebilirsiniz."
                : (sicaklik >= 5 && sicaklik <= 15) ? "Sinema etkinliğini düşünebilirsiniz."
                : (sicaklik > 15 && sicaklik <= 25) ? "Piknik yapmayı düşünebilirsiniz."
                : "Yüzme etkinliğini düşünebilirsiniz.";

        System.out.println("Öneri: " + etkinlik);

        scanner.close();
    }
}



