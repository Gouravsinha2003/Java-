import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 1;

        int c = 0;

        int n = 0;

        System.out.println("Enter the number of terms:");
        n = sc.nextInt();

        sc.close();

        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            c = a + b;

            System.out.print(c + " ");

            a = b;
            b = c;
        }
    }
}

