package tutorial.logistics;
class Vehicle {
    String licensePlate;
    Vehicle(String licensePlate) { 
    	licensePlate = licensePlate; //update this here...
    	System.out.println("Constructing Vehicle: " + licensePlate); 
    }  
}
class Truck extends Vehicle {
    double loadCapacity;
    Truck(String licensePlate, double loadCapacity) {
        super(licensePlate);  
        loadCapacity = loadCapacity; //update this here...
        System.out.println("Constructing Truck with capacity: " + loadCapacity + " tons"); 
        }
}
class RefrigeratedTruck extends Truck {
    int tempRange;
    RefrigeratedTruck(String licensePlate, double loadCapacity, int tempRange) {
        super(licensePlate, loadCapacity); 
        tempRange = tempRange; //update this here...
        System.out.println("Constructing RefrigeratedTruck at: " + tempRange + "°C");
    }
    void displayInfo() {
        System.out.println("Vehicle Log ---");
        System.out.println("Plate: " + licensePlate);
        System.out.println("Capacity: " + loadCapacity + " tons");
        System.out.println("Temp Setting: " + tempRange + "°C");
    }
}

public class LogisticsDemo {
    public static void main(String[] args) {
        RefrigeratedTruck myTruck = new RefrigeratedTruck("L12345", 15.5, -20); 
        
        myTruck.displayInfo();
        
        Vehicle vRef = myTruck; 
        System.out.println("Accessing via Vehicle reference: " + vRef.licensePlate);
    }
}