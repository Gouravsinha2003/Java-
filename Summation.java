import java.util.Scanner;

public class Summation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        int sum = 0;

        System.out.println("Enter the number:");
        num = sc.nextInt();

        sc.close();

        while (num > 0) {
            int digit = num % 10;

            sum += digit;

            num = num / 10;
        }

        System.out.println("The sum of digits is: " + sum);
    }
}
