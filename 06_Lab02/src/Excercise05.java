public class Excercise05 {
    public static void main(String[] args) {
        int number = 5;  
        long result = findFactorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }

    static long findFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        else { // Recursive Step: n! = n * (n-1)!
            return n * findFactorial(n - 1);
        }
    }
}