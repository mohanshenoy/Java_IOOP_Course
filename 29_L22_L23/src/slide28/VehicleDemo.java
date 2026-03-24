package slide28;
interface Vehicle {
    void numberOfSeats();
    void numberOfWheels();
}
class Car implements Vehicle {
    public void numberOfSeats() {
        System.out.println("A Car has 5 seats.");
    }
    public void numberOfWheels() {
        System.out.println("A Car has 4 wheels.");
    }
}
class Bike implements Vehicle {
    public void numberOfSeats() {
        System.out.println("A Bike has 2 seats.");
    }
    public void numberOfWheels() {
        System.out.println("A Bike has 2 wheels.");
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.numberOfSeats();
        myCar.numberOfWheels();

        System.out.println("--------------------");

        myBike.numberOfSeats();
        myBike.numberOfWheels();
    }
}