class Cat {}
class Food {}

class Dog {
    // Overloaded method 
    void smell(Cat target) {
        System.out.println("Bark! The dog is chasing the cat!");
    }

    // Overloaded method 
    void smell(Food target) {
        System.out.println("Slurp! The dog is salivating at its bowl.");
    }
}

public class Slide14 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat neighborCat = new Cat();
        Food fish = new Food();

        // The "one interface" (smell) used for different situations
        myDog.smell(neighborCat); // Triggers the chase
        myDog.smell(fish);      // Triggers salivation
    }
}