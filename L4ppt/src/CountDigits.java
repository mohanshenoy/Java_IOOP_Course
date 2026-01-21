public class CountDigits {
    public static void main(String[] args) {
        int number = 12345;
        int count = 0;
        if (number == 0) { // Special case for zero
            count = 1;
        } else {
            // Handle negative numbers by taking absolute value
            int temp = Math.abs(number);
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
        }
        System.out.println("Number of digits in " + number + " is: " + count);
    }
}