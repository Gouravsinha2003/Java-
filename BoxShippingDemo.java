import java.util.Scanner;

class Box {
    private double width;
    private double height;
    private double depth;

    // Constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    private double weight;

    // Constructor
    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    // Method to find cost for shipping
    public double calculateShippingCost(double distance, double costPerKm) {
        double volume = calculateVolume();
        return distance * volume * costPerKm;
    }
}

public class BoxShippingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the box: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the box: ");
        double height = scanner.nextDouble();

        System.out.print("Enter the depth of the box: ");
        double depth = scanner.nextDouble();

        System.out.print("Enter the weight of the box: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter the distance for shipping (in km): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the cost per km for shipping: ");
        double costPerKm = scanner.nextDouble();

        scanner.close();

        BoxWeight boxWeight = new BoxWeight(width, height, depth, weight);

        // Calculate and display the volume of the box
        double volume = boxWeight.calculateVolume();
        System.out.println("Volume of the box: " + volume);

        // Calculate and display the cost for shipping
        double shippingCost = boxWeight.calculateShippingCost(distance, costPerKm);
        System.out.println("Cost for shipping: $" + shippingCost);
    }
}
