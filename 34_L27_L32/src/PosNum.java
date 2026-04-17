// Definition of the custom exception
//class NegaNumExcep1 extends Exception {
//    public NegaNumExcep1(String message) {
//        super(message);
//    }
//}

// Use custom exception
public class PosNum {
    
    // Method to process a positive number
    public void processNumber(int number) throws NegaNumExcep {
        if (number < 0) {
            // Throw custom exception if the number is negative and it 
            // will be caught in calling program
            throw new NegaNumExcep("Provided number " + number + " is negative.");
        }
        System.out.println("Processing the positive number: " + number);
    }

    public static void main(String[] args) {
        PosNum posNum = new PosNum();
        try {
            // Test with a negative number to trigger the exception
            posNum.processNumber(-5);
        } catch (NegaNumExcep e) {
            System.err.println("Caught Exception: " + e.getMessage());
        }

        try {
            // Test with a valid positive number
            posNum.processNumber(10);
        } catch (NegaNumExcep e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}