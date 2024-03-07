class Employee {
    private int employeeId;
    private String name;
    private double salary;

    // Constructors
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(int employeeId, String name, double salary, String department) {
        super(employeeId, name, salary);
        this.department = department;
    }

    // Getter and setter method for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Display method (overrides the base class displayDetails method)
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

class Clerk extends Employee {
    private String section;

    // Constructor
    public Clerk(int employeeId, String name, double salary, String section) {
        super(employeeId, name, salary);
        this.section = section;
    }

    // Getter and setter method for section
    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    // Display method (overrides the base class displayDetails method)
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Section: " + section);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Manager manager = new Manager(101, "John Manager", 60000, "Engineering");
        Clerk clerk = new Clerk(201, "Alice Clerk", 35000, "HR");

        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println("\nClerk Details:");
        clerk.displayDetails();
    }
}
