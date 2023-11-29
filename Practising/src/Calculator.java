
//METHOD OVER LOADING ( OVERLOADING - COMPILETIME POLYMORPHISM )
//Method overloading is a feature in object-oriented programming that allows a class to have multiple methods with the same name but different parameters.

public class Calculator {
	
    // Method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }
}