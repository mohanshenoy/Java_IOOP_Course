class Vehicle {
    int passengers; // Number of passengers
    int fuelCap;    // Fuel capacity in gallons
    int mpg;        // Miles per gallon (fuel efficiency)
    // Method to calculate the maximum range of the vehicle
    int range() {
        return fuelCap * mpg; // Range = fuel capacity * miles per gallon
    }
    void displayDetails() {
        System.out.println("Number of Passengers: " + passengers);
        System.out.println("Fuel Capacity: " + fuelCap + " gallons");
        System.out.println("Miles per Gallon: " + mpg);
        System.out.println("Maximum Range: " + range() + " miles");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.passengers = 5;
        car.fuelCap = 15; 
        car.mpg = 20;    
        System.out.println("Vehicle Details:");
        car.displayDetails();
    }
}