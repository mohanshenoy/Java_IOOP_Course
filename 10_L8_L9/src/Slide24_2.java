


public class Slide24_2 implements AutoCloseable {
	
    public void doWork() {
        System.out.println("Performing task...");
    }

    @Override
    public void close() {
        System.out.println("Resource closed automatically.");
    }

    public static void main(String[] args) {
        try (Slide24_2 resource = new Slide24_2()) {
            resource.doWork();
        } // close() is called automatically here
    }
}