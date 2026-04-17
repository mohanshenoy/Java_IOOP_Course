import java.sql.SQLException;

public class SaveOrderException extends Exception {

	public SaveOrderException(String message, SQLException e) {
		super(message);
	}


}
