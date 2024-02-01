
import java.util.Scanner;

public class PrintASCII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number or character: ");
        String userInput = scanner.nextLine();

        // Check if the input is a single character
        if (userInput.length() == 1) {
            char character = userInput.charAt(0);
            int asciiValue = (int) character;
            System.out.println("ASCII value of '" + character + "': " + asciiValue);
        } else {
            // Check if the input is a number
            try {
                int number = Integer.parseInt(userInput);
                System.out.println("ASCII value of " + number + ": " + (char) number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a single character or a number.");
            }
        }

        scanner.close();
    }
}
