import java.util.Scanner;

class RideService {
	String serviceName;
	private double baseFarePerKm;
	private static int MAX_RIDES=2;
	Booking[] bookings;
	private int tripCount;
	private static int SURGE_MULTIPLIER;
	
	RideService(String serviceName,double baseFarePerKm ){
		this.serviceName = serviceName;
		this.baseFarePerKm = baseFarePerKm;
		this.bookings = new Booking[MAX_RIDES];
		this.tripCount=0;
	}
	void createBooking(String passengerName, double distanceKm) {
		if(tripCount < MAX_RIDES) {
			Booking bookingObj = new Booking(passengerName, distanceKm);
			bookings[tripCount++] = bookingObj;
			bookingObj.displayRideDetails();
			System.out.println("Created Booking successfully...");
		}else {
			System.out.println("Service Busy: Driver Limit Reached");
		}
	}
	void calculateTotalEarnings() {
		double totalAmountCollected=0;
		for (int i = 0; i < tripCount; i++) {
			totalAmountCollected += bookings[i].amountPaid;
		}
		System.out.println("Total Earnings earned:"+totalAmountCollected);
	}
	void searchPassenger(String passengerName) {
		for (int i = 0; i < tripCount; i++) {
			if(bookings[i].passengerName.equalsIgnoreCase(passengerName)){
				System.out.println("Found Passenger !...");
				System.out.println(bookings[i].toString());
				return;
			}
		}
		System.out.println("Passenger by name: "+ passengerName +" not found!");
	}
	static {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter SURGE_MULTIPLIER");
		int iSurgeMultiplier = sc.nextInt();
		sc.nextLine();
		SURGE_MULTIPLIER  = iSurgeMultiplier;
	}
	class Booking {
		private String passengerName;
		private double distanceKm;
		private double amountPaid;
		
		Booking(String passengerName, double distanceKm){
			this.passengerName = passengerName;
			this.distanceKm = distanceKm;
			this.amountPaid = distanceKm * baseFarePerKm * SURGE_MULTIPLIER;
		}
		
		void displayRideDetails() {
			System.out.println("passengerName : "+passengerName);
			System.out.println("distanceKm : "+distanceKm);
		}

		@Override
		public String toString() {
			return "[Passenger Name=" + passengerName + 
					", Distance(in KMs)=" + distanceKm +
					", Amount Paid="+amountPaid+"]";
		}
	}
}

public class RideSystem{
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter serviceName");
		String serviceName = sc.nextLine();

		System.out.println("Enter baseFarePerKm");
		double baseFarePerKm = sc.nextDouble();
		sc.nextLine();

    	RideService rideServiceObj = new RideService(serviceName,baseFarePerKm);
    	int choice;
    	do {
			System.out.println("Enter your choice*******************");
			System.out.println("1. Book a Ride \n2. Search Passenger \n3. View Total Earnings \n4. Exit");
			System.out.println("Enter your choice*******************");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) { 
			case 1:
				System.out.println("Enter passengerName");
				String passengerName = sc.nextLine();
				
				System.out.println("Enter distanceKm");
				double distanceKm = sc.nextDouble();
				sc.nextLine();
				
				rideServiceObj.createBooking(passengerName, distanceKm);
				break;
			case 2:
				System.out.println("Enter passenger name");
				String passengerName1 = sc.nextLine();
				rideServiceObj.searchPassenger(passengerName1);
				break;
			case 3:
				rideServiceObj.calculateTotalEarnings();
				break;
			case 4:
				System.out.println("Exiting system...");
				break;
			default:
				System.out.println("Invalid choice...");
		}
		}while (choice !=4);
    	sc.close();
    	
    }
	
}
