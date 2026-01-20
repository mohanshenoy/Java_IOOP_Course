
public class SquareSum {

	public static void main(String[] args) {
		int sum = 0; // Variable to store the total sum
        for (int i = 1; i <= 20; i++) {
            sum += (i * i); // Add each square to the sum
        }
        System.out.println("The sum of the first 20 squares is: " + sum);

	}

}
