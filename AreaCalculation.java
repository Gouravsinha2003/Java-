import java.util.Scanner;

class Shape {
    public double findArea() {
        return 0.0;  // Default implementation, can be overridden by subclasses
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double findArea() {
        return side * side;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double findArea() {
        return length * width;
    }
}

public class AreaCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For Square
        System.out.print("Enter the side length of the square: ");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);
        System.out.println("Area of Square: " + square.findArea());

        // For Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
        System.out.println("Area of Rectangle: " + rectangle.findArea());

        scanner.close();
    }
}

