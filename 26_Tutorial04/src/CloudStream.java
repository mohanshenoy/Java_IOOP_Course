import java.util.Scanner;

class SubscriptionService {
	private String serviceName;
	private double monthlyBaseRate;
	private UserAccount[] users;
	private int userCount;
	private static final int MAX_USERS = 3;
	private static double TAX_PERCENTAGE;

    static {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Global Tax Percentage: ");
        TAX_PERCENTAGE = sc.nextDouble();
    }

    public SubscriptionService(String serviceName, double monthlyBaseRate) {
        this.serviceName = serviceName;
        this.monthlyBaseRate = monthlyBaseRate;
        this.users = new UserAccount[MAX_USERS];
        this.userCount = 0;
    }

    class UserAccount {
        private String userName;
        private String planType;
        private double finalBill;

        public UserAccount(String userName, String planType) {
            this.userName = userName;  
            this.planType = planType;
            
            double multiplier = 1.0;
            if (planType.equalsIgnoreCase("Premium")) {
                multiplier = 1.5;
            } else if (planType.equalsIgnoreCase("Ultra")) {
                multiplier = 2.0;
            }
            double planRate = multiplier * monthlyBaseRate;

            this.finalBill = planRate + (planRate * TAX_PERCENTAGE / 100);
        }

        public void displayAccountDetails() {
            System.out.println("User: " + userName + " | Plan: " + planType + " | Final Bill: " + finalBill);
        }

        @Override
        public String toString() { // Overriding Object class method
            return "Account Detail [Name=" + userName + ", Plan=" + planType + ", Bill=" + finalBill + "]";
        }
    }

    public void addUser(String name, String plan) {
        if (userCount < MAX_USERS) {
            users[userCount++] = new UserAccount(name, plan);
            System.out.println("User added successfully.");
        } else {
            System.out.println("System Limit Reached: Cannot add more users");
        }
    }
    
    public void calculateTotalRevenue() {
        double totalRevenue = 0;
        for (int i = 0; i < userCount; i++) {
            totalRevenue += users[i].finalBill;
        }
        System.out.println("Total Revenue for " + serviceName + ": " + totalRevenue);
    }
    
    public void searchUser(String name) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].userName.equalsIgnoreCase(name)) { // String class method
                System.out.println("Result: " + users[i].toString());
                return;
            }
        }
        System.out.println("User not found.");
    }

 
}

public class CloudStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Service Name: ");
        String sName = sc.nextLine();
        
        System.out.print("Enter Monthly Base Rate: ");
        double bRate = sc.nextDouble();

        SubscriptionService service = new SubscriptionService(sName, bRate);
        int choice;

        do {
            System.out.println("\n--- CloudStream Menu ---");
            System.out.println("1. Add User\n2. Search User\n3. View Total Revenue\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter User Name: ");
                    String uName = sc.nextLine();
                    
                    System.out.print("Enter Plan (Basic/Premium/Ultra): ");
                    String plan = sc.next();
                    
                    service.addUser(uName, plan);
                    break;
                case 2:
                    System.out.print("Enter User Name to Search: ");
                    service.searchUser(sc.next());
                    break;
                case 3:
                    service.calculateTotalRevenue();
                    break;
                case 4:
                    System.out.println("Exiting System...");
                    break;
                default:
                    System.out.println("Invalid Selection.");
            }
        } while (choice != 4);
        sc.close();
    }
}