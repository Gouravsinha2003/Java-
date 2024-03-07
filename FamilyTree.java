class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Parent extends Person {
    private String gender;

    public Parent(String name, int age, String gender) {
        super(name, age);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}

class Child extends Person {
    private String grade;

    public Child(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}

public class FamilyTree {
    public static void main(String[] args) {
        // Creating family members
        Parent grandparent1 = new Parent("Grandpa", 75, "Male");
        Parent grandparent2 = new Parent("Grandma", 70, "Female");

        Parent parent1 = new Parent("Dad", 45, "Male");
        Parent parent2 = new Parent("Mom", 40, "Female");

        Child child1 = new Child("John", 20, "College");
        Child child2 = new Child("Jane", 15, "High School");

        // Displaying family tree
        System.out.println("Family Tree:");
        System.out.println("Grandparents:");
        System.out.println("  " + grandparent1.getName() + " (" + grandparent1.getGender() + "), Age: " + grandparent1.getAge());
        System.out.println("  " + grandparent2.getName() + " (" + grandparent2.getGender() + "), Age: " + grandparent2.getAge());

        System.out.println("\nParents:");
        System.out.println("  " + parent1.getName() + " (" + parent1.getGender() + "), Age: " + parent1.getAge());
        System.out.println("  " + parent2.getName() + " (" + parent2.getGender() + "), Age: " + parent2.getAge());

        System.out.println("\nChildren:");
        System.out.println("  " + child1.getName() + ", Age: " + child1.getAge() + ", Grade: " + child1.getGrade());
        System.out.println("  " + child2.getName() + ", Age: " + child2.getAge() + ", Grade: " + child2.getGrade());
    }
}