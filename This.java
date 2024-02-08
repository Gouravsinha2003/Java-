public class This {
    private int x;
    private int y;

    public This(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void displayValues() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static void main(String[] args) {
        This myObject = new This(10, 20);

        myObject.displayValues();
    }
}
