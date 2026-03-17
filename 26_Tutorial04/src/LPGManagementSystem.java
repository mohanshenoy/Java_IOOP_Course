import java.util.Scanner;

class LPGCarrier {
	private String shipName;
	private double baseStorageFee;
	private Container[] containers;
	private int containerCount;
	private static final int MAX_CONTAINERS = 2;
	private static double PORT_SURCHARGE_PERCENTAGE;

    static {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Port Surcharge Percentage: ");
        PORT_SURCHARGE_PERCENTAGE = sc.nextDouble();
    }

    public LPGCarrier(String shipName, double baseStorageFee) {
        this.shipName = shipName;
        this.baseStorageFee = baseStorageFee;
        this.containers = new Container[MAX_CONTAINERS];
        this.containerCount = 0;
    }

    class Container {
        private String containerID;
        private String gasType;
        private double storageCost;

        public Container(String containerID, String gasType) {
            this.containerID = containerID;
            this.gasType = gasType;
            
            double multiplier = 1.0;
            if (gasType.equalsIgnoreCase("Butane")) multiplier = 1.2;
            else if (gasType.equalsIgnoreCase("Mixed")) multiplier = 1.5;

            double cargoRate = multiplier * baseStorageFee;
            this.storageCost = cargoRate + (cargoRate * PORT_SURCHARGE_PERCENTAGE / 100);
        }

        @Override
        public String toString() {
            return "ID: " + containerID + " | Gas: " + gasType + " | Cost: " + storageCost;
        }
    }

    public void loadContainer(String id, String type) {
        if (containerCount < MAX_CONTAINERS) {
            containers[containerCount++] = new Container(id, type);
            System.out.println("Container " + id + " loaded successfully.");
        } else {
            System.out.println("Ship Capacity Full: Cannot load more cargo");
        }
    }
    
    public void calculateTotalCharterValue() {
        double total = 0;
        for (int i = 0; i < containerCount; i++) {
            total += containers[i].storageCost;
        }
        System.out.println("Total Charter Value for " + shipName + ": " + total);
    }
    
    public void searchContainer(String id) {
        for (int i = 0; i < containerCount; i++) {
            if (containers[i].containerID.equalsIgnoreCase(id)) {
                System.out.println("Result: " + containers[i].toString());
                return;
            }
        }
        System.out.println("Container ID not found.");
    }
}

public class LPGManagementSystem {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Ship Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Base Storage Fee: ");
        double fee = sc.nextDouble();

        LPGCarrier myShip = new LPGCarrier(name, fee);
        int choice;

        do {
            System.out.println("\n--- LPG Logistics Menu ---");
            System.out.println("1. Load Container\n2. Search Container\n3. Total Value\n4. Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Container ID: "); String id = sc.nextLine();
                    System.out.print("Gas Type (Propane/Butane/Mixed): "); String type = sc.next();
                    myShip.loadContainer(id, type);
                    break;
                case 2:
                    System.out.print("Enter ID to search: ");
                    myShip.searchContainer(sc.next());
                    break;
                case 3:
                    myShip.calculateTotalCharterValue();
                    break;
            }
        } while (choice != 4);
        sc.close();
    }
}