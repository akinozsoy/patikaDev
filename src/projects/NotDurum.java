package projects;
import java.util.Scanner;

public class NotDurum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PASSING_GRADE = 55;

        String[] subjects = {"Mathematics", "Physics", "Turkish", "Chemistry", "Music"};

        int totalGrade = 0;
        int validSubjectsCount = 0;

        for (String subject : subjects) {
            System.out.println("Enter the grade for " + subject + ": ");
            int grade = scanner.nextInt();

            if (grade >= 0 && grade <= 100) {
                totalGrade += grade;
                validSubjectsCount++;
            }
        }

        double averageGrade = (double) totalGrade / validSubjectsCount;

        System.out.println("Average grade: " + averageGrade);

        if (averageGrade >= 55) {
            System.out.println("You passed the grade!");
        } else {
            System.out.println("You failed the grade!");
        }

        scanner.close();
    }
}