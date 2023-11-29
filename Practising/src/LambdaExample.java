
// Traditional approach using an interface
interface MyInterface {
    void myMethod();
}

public class LambdaExample {
    public static void main(String[] args) {
        // Using anonymous class
        MyInterface myInterface1 = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("Hello from anonymous class!");
            }
        };
        
        // Using lambda expression
        MyInterface myInterface2 = () -> System.out.println("Hello from lambda expression!");
        
        // Calling methods
        myInterface1.myMethod();
        myInterface2.myMethod();
    }
}
