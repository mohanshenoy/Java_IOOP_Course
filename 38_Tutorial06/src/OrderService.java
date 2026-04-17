import java.sql.SQLException;

public class OrderService {
    private OrderDAO dao = new OrderDAO();

    public void processOrder(String data) throws SaveOrderException {
        try {
            dao.saveOrder(data);
        } catch (SQLException e) {
            // Wrapping technical error into a Business Exception
            throw new SaveOrderException("Business Logic Failed: Could not save order", e);
        }
    }
}