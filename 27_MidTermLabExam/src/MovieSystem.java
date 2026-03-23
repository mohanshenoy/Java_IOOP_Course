import java.util.Scanner;
class Movie {
    private String movieName;
    private double basePrice;
    private Ticket[] tickets;
    private int ticketCount;
    private static final int MAX_SEATS = 2; 
    private static double PLATFORM_FEE;
    static {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Platform Fee: ");
        PLATFORM_FEE = sc.nextDouble();
    }
    public Movie(String movieName, double basePrice) {
        this.movieName = movieName;
        this.basePrice = basePrice;
        this.tickets = new Ticket[MAX_SEATS];
        this.ticketCount = 0;
    }
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + 
				", basePrice=" + basePrice
				+ ", ticketCount=" + ticketCount 
				+ ", MAX_SEATS=" + MAX_SEATS 
				+ ", PLATFORM_FEE=" + PLATFORM_FEE + "]";
	}
	class Ticket {
        private String customerName;
        private String seatCategory;
        private double finalCost;
        public Ticket(String customerName, String seatCategory) {
            this.customerName = customerName;  
            this.seatCategory = seatCategory;
            double multiplier = 0;
            if (seatCategory.equalsIgnoreCase("VIP")) multiplier = 0.50;
            else if (seatCategory.equalsIgnoreCase("Gold")) multiplier = 0.25;
            this.finalCost = basePrice + (basePrice * multiplier) + PLATFORM_FEE;
        }
		public String toString() {
			return "Ticket [customerName=" + customerName + ", seatCategory=" + seatCategory + ", finalCost="
					+ finalCost + "]";
		}
    }
    public void bookTicket(String name, String category) {
        if (ticketCount < MAX_SEATS) {
        	Ticket ticket = new Ticket(name, category);
            tickets[ticketCount++] = ticket;
            System.out.println("Ticket Booked Successfully!");
            System.out.println(ticket.toString());
        } else {
            System.out.println("All tickets Sold Out: Capacity Reached");
        }
    }
    public void showTotalRevenue() {
        double total = 0;
        for (int i = 0; i < ticketCount; i++) {
            total += tickets[i].finalCost;
        }
        System.out.println("Total Earnings for " + movieName + ": " + total);
    }
    public void displayAllTickets() {
    	System.out.println("*****Movie details*****");
    	System.out.println(this.toString());
        for (int i = 0; i <ticketCount ; i++) {
        	System.out.println(tickets[i].toString());
        }
    }    
    
}
public class MovieSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        String cName = sc.nextLine();
        System.out.print("Enter Base Price: ");
        double bPrice = sc.nextDouble();
        Movie movie = new Movie(cName, bPrice);
        int choice;
        do {
            System.out.println("<<<<<<<<<< Movie Menu >>>>>>>>>>");
            System.out.println("Enter choice: (1) Book Ticket (2) Total Revenue (3) Display All Tickets (4) Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Customer Name: "); String name = sc.next();
                    System.out.print("Category (VIP/Gold/Silver): "); String cat = sc.next();
                    movie.bookTicket(name, cat);
                    break;
                case 2:
                	movie.showTotalRevenue();
                    break;
                case 3:
                	movie.displayAllTickets();
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice..");
            }
        } while (choice != 4);
    }
}