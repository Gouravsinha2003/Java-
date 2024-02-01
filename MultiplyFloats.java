//import the Scanner class to take user input
import java.util.Scanner;

public class MultiplyFloats {

    public static void main(String[] args) {
        //create a Scanner object
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter two float numbers
        System.out.println("Enter two float numbers to multiply:");

        //read the first float number
        float num1 = sc.nextFloat();
 
        //read the second float number
        float num2 = sc.nextFloat();

        //multiply the two numbers and store the result
        float result = num1 * num2;

        //display the result
        System.out.println("The product of " + num1 + " and " + num2 + " is " + result);

        //close the Scanner object
        sc.close();
    }
}
