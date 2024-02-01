import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for 5 subjects
        System.out.println("Enter marks for 5 subjects:");

        System.out.print("Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Subject 3: ");
        int subject3 = scanner.nextInt();

        System.out.print("Subject 4: ");
        int subject4 = scanner.nextInt();

        System.out.print("Subject 5: ");
        int subject5 = scanner.nextInt();

        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

        double averageMarks = totalMarks / 5.0;

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        char grade = calculateGrade(averageMarks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    private static char calculateGrade(double averageMarks) {
        if (averageMarks >= 90) {
            return 'O';
        } else if (averageMarks >= 80) {
            return 'A';
        } else if (averageMarks >= 70) {
            return 'B';
        } else if (averageMarks >= 60) {
            return 'C';
        } else {
            return 'F';
        }
    }
}
    