import java.util.Scanner;

class Shape {
    double length;
    double width;

    Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating the first object of Shape
        System.out.println("Enter the length and width of the first shape:");
        double length1 = scanner.nextDouble();
        double width1 = scanner.nextDouble();
        Shape shape1 = new Shape(length1, width1);

        // Creating the second object of Shape
        System.out.println("Enter the length and width of the second shape:");
        double length2 = scanner.nextDouble();
        double width2 = scanner.nextDouble();
        Shape shape2 = new Shape(length2, width2);
        double area1 = shape1.calculateArea();
        double perimeter1 = shape1.calculatePerimeter();
        System.out.println("Area of the first shape: " + area1);
        System.out.println("Perimeter of the first shape: " + perimeter1);

        double area2 = shape2.calculateArea();
        double perimeter2 = shape2.calculatePerimeter();
        System.out.println("Area of the second shape: " + area2);
        System.out.println("Perimeter of the second shape: " + perimeter2);

        scanner.close();
    }
}