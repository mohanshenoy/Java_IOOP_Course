
class AppConfig {
    // Grouping Database constants
    public static class Database {
        public static final String URL = "jdbc:mysql://localhost:3306/db";
        public static final String USER = "admin";
    }

    // Grouping API constants
    public static class API {
        public static final String KEY = "12345-ABCDE";
        public static final String TIMEOUT = "5000";
    }
}


public class AppConfigDemo {
	public static void main(String[] args) {
		// Usage: Clear and readable
		String dbUrl = AppConfig.Database.URL;
		System.out.println(dbUrl);
		String apiKey = AppConfig.API.KEY;
		System.out.println(apiKey);
	}
}
