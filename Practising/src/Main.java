// Example interface
interface Printable {
    void print(); // Abstract method

    default void display() {
        System.out.println("Default display method");
    }

    static void staticMethod() {
        System.out.println("Static method in interface");
    }
}

// Class implementing the interface
class MyClass implements Printable {
    @Override
    public void print() {
        System.out.println("Printing from MyClass");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.print();       // Calls the overridden print method
        obj.display();     // Calls the default display method
        Printable.staticMethod(); // Calls the static method in the interface
    }
}
