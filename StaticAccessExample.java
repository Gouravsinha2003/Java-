public class StaticAccessExample {
    static int staticVariable = 10;
    
    int instanceVariable = 20;
    
    static void staticMethod() {
        System.out.println("Inside static method");
        

        System.out.println("Static variable: " + staticVariable);
        
        StaticAccessExample instance = new StaticAccessExample();
        System.out.println("Instance variable through instance: " + instance.instanceVariable);
    }
    
    void instanceMethod() {
        System.out.println("Inside instance method");
        
        System.out.println("Static variable: " + staticVariable);
        
        System.out.println("Instance variable: " + instanceVariable);
    }
    
    public static void main(String[] args) {
        staticMethod();
        
        StaticAccessExample obj = new StaticAccessExample();
        obj.instanceMethod();
    }
}
