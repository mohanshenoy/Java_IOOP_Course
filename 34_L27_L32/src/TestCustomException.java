// Class that uses the custom exception
public class TestCustomException {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("age is not valid to vote");
        } else {
            System.out.println("welcome to vote");
        }
    }
    public static void main(String[] args) {
        try {
            // Test with an invalid age
            validate(13);
        } catch (InvalidAgeException e) {
            System.err.println("Caught the exception: " + e.getMessage());
        }
        try {
            // Test with a valid age
            validate(21);
        } catch (InvalidAgeException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        
        System.out.println("Rest of the code...");
    }
}