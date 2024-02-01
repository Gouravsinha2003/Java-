import java.util.Scanner;

public class Basic_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = 0.0;
        double num2 = 0.0;
        double result = 0.0;

        int choice = 0;

        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Square Root");
        System.out.println("5. Cube Root");

        System.out.println("Enter your choice:");
        choice = sc.nextInt();

        switch (choice) {
            case 1: 
                System.out.println("Enter the first number:");
                num1 = sc.nextDouble();
                System.out.println("Enter the second number:");
                num2 = sc.nextDouble();

                result = num1 + num2;

                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case 2: 
                System.out.println("Enter the first number:");
                num1 = sc.nextDouble();
                System.out.println("Enter the second number:");
                num2 = sc.nextDouble();

                result = num1 - num2;

                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case 3: 
                System.out.println("Enter the first number:");
                num1 = sc.nextDouble();
                System.out.println("Enter the second number:");
                num2 = sc.nextDouble();

                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    result = num1 / num2;

                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;

            case 4: 
                System.out.println("Enter the number:");
                num1 = sc.nextDouble();

                if (num1 < 0) {
                    System.out.println("Cannot find square root of a negative number");
                } else {
                    result = Math.sqrt(num1);

                    System.out.println("Square root of " + num1 + " = " + result);
                }
                break;

            case 5: 
                System.out.println("Enter the number:");
                num1 = sc.nextDouble();

                result = Math.cbrt(num1);

                System.out.println("Cube root of " + num1 + " = " + result);
                break;


            default: 
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        sc.close();
    }
}
