import java.util.Scanner;

public class AdditonalExcercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int num = input.nextInt(); // Storing input in a primitive int
        System.out.println("Multiplication Table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int product = num * i;
            System.out.println(num + " x " + i + " = " + product);
        }
        input.close();  
    }
}