
public class PreciseRethrowDemo {

	public static void main(String[] args) {
		PreciseRethrowDemo obj = new PreciseRethrowDemo();
		try {
			obj.processData();
		} catch (AgeException e) {
			System.out.println(e.getMessage());
		}

	}
	public void processData() throws AgeException { // More precise!
	    try {
	       throw new AgeException("AgeException is thrown");
	    } catch (Exception e) {
	        // You catch the general Exception for convenience (e.g., logging)
	        System.out.println("Logging error...");
	        throw e; // The compiler knows this is actually an AgeException
	    }
	}
}
