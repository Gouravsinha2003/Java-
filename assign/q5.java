import java.util.Scanner;

public class q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the charracter:- ");
        char data = sc.next().charAt(0); // Use next().charAt(0) to read a single character

        if ((int) data >= 65 && (int) data <= 90 || (int) data >= 97 && (int) data <= 122) {
            System.out.println("The data is Alphabet");

        } else if ((int) data >= 48 && (int) data <= 57) {
            System.out.println("The data is Digit");
        } else {
            System.out.println("The data is Special Character");
        }
    }
}
