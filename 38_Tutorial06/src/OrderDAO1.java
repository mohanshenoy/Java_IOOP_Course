import java.sql.*;

public class OrderDAO1 {
    public void saveOrder(String data) throws SQLException {
        // No framework: using standard JDBC
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "pass")) {
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO orders (details) VALUES (?)");
            pstmt.setString(1, data);
            pstmt.executeUpdate();
        } 
        // SQLException is thrown here if the DB is down or SQL is invalid
    }
}