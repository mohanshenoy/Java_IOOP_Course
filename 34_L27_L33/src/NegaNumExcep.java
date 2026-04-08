// Define the Custom Exception
public class NegaNumExcep extends Exception {
      // Default constructor with a default error message
    public NegaNumExcep() {
        super("Negative numbers are not allowed.");
    }

    // Constructor that accepts a custom error message
    public NegaNumExcep(String message) {
        super(message);
    }
}
