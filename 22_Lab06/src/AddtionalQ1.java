/*
 * 4) Create a java class ServiceRequest with two String fields, namely, request (that represents a verbal complaint such as “Streetlights are not working”) and sr_date (that records the date on which the complaint was lodged). Assume any date is of the form DD-MMM-YEAR (E.g., 01-NOV-2016 or 15-AUG-2000). 
Create an array of service requests to store complaints lodged by citizens on different occasions. 
After displaying all the requests entered, list all the service requests in month-wise manner using displayByMonth(ServiceRequest[] sr), a static method defined inside the ServiceRequest class.
 */
class AddtionalQ1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
class ServiceRequest {
    String request;
    String sr_date; // Format: DD-MMM-YEAR

    // Constructor
    public ServiceRequest(String request, String sr_date) {
        this.request = request;
        this.sr_date = sr_date;
    }

    // Method to display a single request
    void display() {
        System.out.println("Date: " + sr_date + " | Request: " + request);
    }

    // Static method to list requests month-wise
    public static void displayByMonth(ServiceRequest[] sr) {
        String[] months = {
            "JAN", "FEB", "MAR", "APR", "MAY", "JUN", 
            "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"
        };

        System.out.println("\n--- Service Requests (Month-wise) ---");

        // Iterate through standard calendar months
        for (String month : months) {
            boolean monthHasData = false;
            
            // Check all requests for this specific month
            for (ServiceRequest s : sr) {
                // Parse the month from the date string (e.g., "15-AUG-2000" -> "AUG")
                String[] dateParts = s.sr_date.split("-");
                if (dateParts.length > 1 && dateParts[1].equalsIgnoreCase(month)) {
                    
                    // Print header only once per month if data exists
                    if (!monthHasData) {
                        System.out.println("\n[" + month + "]");
                        monthHasData = true;
                    }
                    s.display();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create an array of service requests
        ServiceRequest[] requests = new ServiceRequest[5];

        // Populate the array
        requests[0] = new ServiceRequest("Streetlights not working", "01-NOV-2016");
        requests[1] = new ServiceRequest("Water pipe leakage", "15-AUG-2000");
        requests[2] = new ServiceRequest("Garbage not collected", "05-NOV-2016");
        requests[3] = new ServiceRequest("Pothole on main road", "10-JAN-2023");
        requests[4] = new ServiceRequest("Broken park bench", "22-AUG-2000");

        // 1. Display all requests entered
        System.out.println("--- All Entered Requests ---");
        for (ServiceRequest s : requests) {
            s.display();
        }

        // 2. List requests month-wise
        ServiceRequest.displayByMonth(requests);
    }
}