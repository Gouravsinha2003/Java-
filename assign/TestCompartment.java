import java.util.Random;

// Abstract class Compartment
abstract class Compartment {
    // Abstract method notice
    public abstract String notice();
}

// Derived class FirstClass from Compartment
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "This is a First Class compartment.";
    }
}

// Derived class Ladies from Compartment
class Ladies extends Compartment {
    @Override
    public String notice() {
        return "This is a Ladies compartment.";
    }
}

// Derived class General from Compartment
class General extends Compartment {
    @Override
    public String notice() {
        return "This is a General compartment.";
    }
}

// Derived class Luggage from Compartment
class Luggage extends Compartment {
    @Override
    public String notice() {
        return "This is a Luggage compartment.";
    }
}

// TestCompartment class
public class TestCompartment {
    public static void main(String[] args) {
        // Declare an array of Compartment of size 10
        Compartment[] compartments = new Compartment[10];

        // Create compartments randomly
        for (int i = 0; i < compartments.length; i++) {
            int randomType = new Random().nextInt(4) + 1; // Random number in the range 1 to 4

            switch (randomType) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        // Check the polymorphic behavior of the notice method
        for (Compartment compartment : compartments) {
            System.out.println(compartment.notice());
        }
    }
}
