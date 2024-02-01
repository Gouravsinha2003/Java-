import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series using recursive function:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }

        System.out.println("\nFibonacci series using non-recursive function:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNonRecursive(i) + " ");
        }

        scanner.close();                                                        
    }

    private static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    private static int fibonacciNonRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        int prev = 0, current = 1, next;

        for (int i = 2; i <= n; i++) {
            next = prev + current;
            prev = current;
            current = next;
        }

        return current;
    }
} 