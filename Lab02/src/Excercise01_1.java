
public class Excercise01_1 {
    public static void main(String[] args) {
        double distance = 5.0;  
        double totalFare = 0;

        if (distance <= 5) {
            totalFare = distance * 10;
        } else if (distance <= 20) {
            totalFare = (5 * 10) + ((distance - 5) * 8);
        } else if (distance <= 45) {
            totalFare = (5 * 10) + (15 * 8) + ((distance - 20) * 5);
        } else {
            totalFare = (5 * 10) + (15 * 8) + (25 * 5) + ((distance - 45) * 5);
        }

        System.out.println("Total distance traveled: " + distance + " km");
        System.out.println("Total fare to be paid: INR " + totalFare);
    }
}