import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDAO {
    public void saveOrder(String data) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // 1. Establish Connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "pass");
            
            // 2. Prepare Statement
            pstmt = conn.prepareStatement("INSERT INTO orders (details) VALUES (?)");
            pstmt.setString(1, data);
            
            // 3. Execute
            pstmt.executeUpdate();
            
        } catch (SQLException e) {
            // Log and re-throw so the Service layer knows it failed
            throw e; 
        } finally {
            // 4. Manual Resource Cleanup (The 'Old School' Way)
            try {
                if (pstmt != null) pstmt.close();
            } catch (SQLException e) {
                /* Log or ignore closing errors */
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                /* Log or ignore closing errors */
            }
        }
    }
}