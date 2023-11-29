
//METHOD OVERIDING ( OVERRIDING - RUNTIME POLYMORPHISM )
//Method overriding is a feature in object-oriented programming that allows a subclass to provide a specific implementation for a method that is already defined in its superclass. 
//The overridden method in the subclass has the same signature (method name, return type, and parameters) as the method in the superclass. This allows the subclass to provide its own implementation of the method,
//thereby customizing or extending the behavior inherited from the superclass.

class Animal_1 {
    // Method in the superclass
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}
 
// Subclass
class Dog extends Animal_1 {
    // Override the makeSound method in the subclass
    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }
 
    // New method specific to Dog class
    public void fetch() {
        System.out.println("Fetching the ball");
    }
}
 
public class Animal {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog();
 
        // Call the overridden method
        myDog.makeSound();  // This will print "Bark! Bark!"
 
        // Call the method from the superclass
        // (Note that the overridden method in the subclass is called)
        Animal_1 myAnimal = myDog;
        myAnimal.makeSound();  // This will also print "Bark! Bark!"
 
        // Call the unique method of the Dog class
        myDog.fetch();  // This will print "Fetching the ball"
    }
}
