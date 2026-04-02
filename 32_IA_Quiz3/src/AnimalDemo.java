

class Animal {
    void makeNoise() { System.out.print("Animal making noise, "); }
    void eat() { System.out.print("Animal eating, "); }
    void sleep() { System.out.print("Animal sleeping, "); }
    void roam() { System.out.print("Animal roaming, "); }
}
class Canine extends Animal {
    void roam() { System.out.print("Canine roaming, "); }
}
class Wolf extends Canine {
    void makeNoise() { System.out.print("Wolf making noise, "); }
    void eat() { System.out.print("Wolf eating, "); }
}
public class AnimalDemo {
    public static void main(String[] args) {
        Wolf w = new Wolf();
        w.makeNoise();
        w.roam();
        w.eat();
        w.sleep();
    }
}
//A) Wolf making noise, Canine roaming, Wolf eating, Animal sleeping,***
//B) Animal making noise, Animal roaming, Animal eating, Animal sleeping,
//C) Wolf making noise, Animal roaming, Wolf eating, Animal sleeping,
//D) Wolf making noise, Wolf roaming, Wolf eating, Wolf sleeping,

