public class Slide35_1 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 2 and 10:");
        // Loop through each number in the range
        for (int i = 2; i <= 10; i++) {
            boolean isPrime = true;
            // Check if 'i' has any divisors other than 1 and itself
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // If no divisors were found, it's prime
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}