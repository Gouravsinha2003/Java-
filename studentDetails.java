// Student class definition
class Student {
    // Instance variables
    String name;
    int age;
    double grade;

    // Constructor to initialize the student object
    public Student(String n, int a, double g) {
        name = n;
        age = a;
        grade = g;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

// Main class
public class studentDetails {
    public static void main(String[] args) {
        System.out.println("Student Details:\n");

        // Creating student objects
        // Edit these names
        Student student1 = new Student("Gourav", 20, 75.6);

        student1.displayDetails();
    }
}