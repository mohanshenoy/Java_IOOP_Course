import java.util.Scanner;

public class Excercise01_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total amount paid: ");
        double amountPaid = sc.nextDouble();
        double distance = 0;

        // Slab 1: First 5 km (Cost: 5 * 10 = 50 INR)
        if (amountPaid <= 50) {
            distance = amountPaid / 10;
        } 
        // Slab 2: Next 15 km (Cost: 15 * 8 = 120 INR. Total fare up to 170)
        else if (amountPaid <= 170) {
            distance = 5 + (amountPaid - 50) / 8;
        } 
        // Slab 3: Next 25 km (Cost: 25 * 5 = 125 INR. Total fare up to 295)
        else if (amountPaid <= 295) {
            distance = 5 + 15 + (amountPaid - 170) / 5;
        } 
        else { // Beyond the specified slabs
            distance = 5 + 15 + 25 + (amountPaid - 295) / 5;
        }

        System.out.println("The total distance traveled is: " + distance + " km");
        sc.close();
    }
}