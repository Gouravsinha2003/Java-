import java.util.Scanner;

public class MultiplyMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers to multiply. Press * to stop.");

        int count = 0;
        double[] numbers = new double[100]; 
        while (true) {
            System.out.print("Enter the number: ");
            String input = scanner.next();

            if (input.equals("*")) {
                break;
            }

            try {
                double num = Double.parseDouble(input);
                numbers[count++] = num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or * to stop.");
            }
        }

        scanner.close();

        multiply(numbers, count);
    }

    public static void multiply(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Method for Two numbers called - (Result): " + result);
    }

    public static void multiply(double num1, double num2, double num3) {
        double result = num1 * num2 * num3;
        System.out.println("Method for Three numbers called - (Result): " + result);
    }

    public static void multiply(double[] numbers, int count) {
        if (count == 2) {
            multiply(numbers[0], numbers[1]);
        } else if (count == 3) {
            multiply(numbers[0], numbers[1], numbers[2]);
        } else {
            double result = 1.0;
            for (int i = 0; i < count; i++) {
                result *= numbers[i];
            }
            System.out.println("Method for multiple numbers called - (Result): " + result);
        }
    }
}
