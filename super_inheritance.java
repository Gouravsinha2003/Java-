class One {
    int a, b;

    One(int a, int b) {
        this.a = a;
        this.b = b;
        int c = a + b;
        System.out.println("Sum in class One: " + c);
    }
}

class Two extends One {
    Two(int a, int b) {
        super(a, b);
        int c = a - b;
        System.out.println("Difference in class Two: " + c);
    }
}

public class super_inheritance {
    public static void main(String[] args) {
        Two obj = new Two(10, 5);
    }
}