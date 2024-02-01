class Calculator {
    private double result;

    public Calculator() {
        this.result = 0.0;
    }

    public double getResult() {
        return result;
    }

    public void add(double operand) {
        result += operand;
    }

    public void subtract(double operand) {
        result -= operand;
    }

    public void multiply(double operand) {
        result *= operand;
    }

    public void divide(double operand) {
        if (operand != 0) {
            result /= operand;
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }
}

public class CalculatorProgram {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test the calculator
        double operand1 = 10.0;
        double operand2 = 5.0;

        // Addition
        calculator.add(operand1);
        System.out.println("Result after addition: " + calculator.getResult());

        // Subtraction
        calculator.subtract(operand2);
        System.out.println("Result after subtraction: " + calculator.getResult());

        // Multiplication
        calculator.multiply(operand1);
        System.out.println("Result after multiplication: " + calculator.getResult());

        // Division
        calculator.divide(operand2);
        System.out.println("Result after division: " + calculator.getResult());
    }
}

