import java.io.*;
import java.sql.SQLException;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            // Potential for IOException (file not found) or SQLException (database issues)
            processData("config.txt"); // modify to null and show
        } 
        // Using the pipe '|' to catch multiple exceptions in one block
        catch (IOException | SQLException e) {
            System.err.println("Critical error occurred: " + e.getMessage());
            // Note: In a multi-catch, the variable 'e' is implicitly final
        }
    }

    static void processData(String path) throws IOException, SQLException {
        // Simulated logic that could throw different checked exceptions
        if (path == null) throw new SQLException("Database connection failed");
        throw new IOException("File not accessible");
    }
}