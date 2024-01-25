package projects;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "password123";

        System.out.println("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        if (!enteredPassword.equals(correctPassword)) {
            System.out.println("Incorrect password! Do you want to reset your password? (yes/no): ");
            String choice = scanner.nextLine();

            if ("yes".equalsIgnoreCase(choice)) {
                System.out.println("Enter your new password: ");
                String newPassword = scanner.nextLine();

                if (!newPassword.equals(enteredPassword) && !newPassword.equals(correctPassword)) {
                    System.out.println("Password created successfully!");
                } else {
                    System.out.println("Password creation failed, please enter a different password.");
                }
            } else {
                System.out.println("Password reset canceled.");
            }
        } else {
            System.out.println("Login successful!");
        }

        scanner.close();
    }
}

