public class OrderController {
    private OrderService service = new OrderService();

    public void handlePostRequest(String userInput) {
        try {
            service.processOrder(userInput);
            System.out.println("200 OK: Order Created");
        } catch (Exception e) {
            // Final catch block to prevent app crash and inform the user
            logError(e);
            showUserFriendlyErrorMessage("Order failed due to a system error. Please try later.");
        }
    }

    private void logError(Exception e) {
        System.err.println("Logging for Devs: " + e.getMessage() + " Cause: " + e.getCause());
    }

    private void showUserFriendlyErrorMessage(String msg) {
        System.out.println("500 Internal Server Error, Contact Adminstrator: " + msg);
    }
}