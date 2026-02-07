class Car {
    String brand;
    String color;
    int speed;

    // Constructor to initialize the Car object
    Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Color: " + color);
        System.out.println("Car Speed: " + speed + " km/h");
    }

    void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " accelerated to " + speed + " km/h.");
    }

    void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(brand + " slowed down to " + speed + " km/h.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red", 120);
        Car car2 = new Car("Honda", "Blue", 100);

        // Display details and actions for car1
        System.out.println("Details of Car 1:");
        car1.displayDetails();
        car1.accelerate(20);
        car1.brake(50);

        // Display details and actions for car2
        System.out.println("\nDetails of Car 2:");
        car2.displayDetails();
        car2.accelerate(30);
        car2.brake(70);
    }
}