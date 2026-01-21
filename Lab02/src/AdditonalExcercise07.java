public class AdditonalExcercise07 {
    public static void main(String[] args) {
        double x = 1.5708; // Equivalent to PI/2 (should output approx 1.0)
        double sum = 0;
        int terms = 10;

        for (int i = 0; i < terms; i++) {
            // Determine the exponent: 1, 3, 5, 7...
            int exponent = 2 * i + 1;
            
            // Calculate Power (x^exponent)
            double power = 1;
            for (int j = 1; j <= exponent; j++) {
                power *= x;
            }

            // Calculate Factorial (exponent!)
            long fact = 1;
            for (int j = 1; j <= exponent; j++) {
                fact *= j;
            }

            // Alternating sign: i=0 is +, i=1 is -, i=2 is +
            if (i % 2 == 0) {
                sum += power / fact;
            } else {
                sum -= power / fact;
            }
        }
        System.out.println("Sin(" + x + ") is approximately: " + sum);
    }
}