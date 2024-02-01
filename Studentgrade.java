import java.util.Scanner;

public class Studentgrade {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int[] marks = new int[5];

        
        int total = 0;

        
        double percentage = 0.0;

        
        char grade = ' ';

        
        System.out.println("Enter the marks of 5 subjects:");

        
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        
        sc.close();

        
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }

        percentage = (total / 500.0) * 100;

        
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

