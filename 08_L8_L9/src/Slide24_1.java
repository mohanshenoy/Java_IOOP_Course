public class Slide24_1 {
	
    public static void main(String[] args) {
    	Slide24_1 obj = new Slide24_1();
        
        
        obj = null;  // Making the object eligible for Garbage Collection
        
        
        System.gc();  // Suggesting the JVM to run Garbage Collector
        
        System.out.println("Main method finished.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called: Cleaning up resources.");
    }
}