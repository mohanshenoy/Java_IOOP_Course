import java.io.IOException;
public class ThrowsExample {
    static void readFile() throws IOException {
        // throws keyword is used to declare that readFile() may throw an IOException
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}