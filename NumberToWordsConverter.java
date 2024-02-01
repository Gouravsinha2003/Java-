import java.util.Scanner;

public class NumberToWordsConverter {
    private static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    private static final String[] teens = {
            "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1 to 999): ");
        int number = scanner.nextInt();

        if (number < 1 || number > 999) {
            System.out.println("Please enter a number between 1 and 999.");
        } else {
            String result = convertToWords(number);

            System.out.println("Number in words: " + result);
        }

        scanner.close();
    }

    private static String convertToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        if (num < 10) {
            return units[num];
        } else if (num < 20) {
            return teens[num - 10];
        } else if (num < 100) {
            return tens[num / 10] + ((num % 10 != 0) ? " " + units[num % 10] : "");
        } else {
            return units[num / 100] + " Hundred" + ((num % 100 != 0) ? " and " + convertToWords(num % 100) : "");
        }
    }
}