import java.util.Scanner;
class Warehouse {
    private String location;
    private int totalCapacity;
    private Item[] items;
    private int itemCount;
    private static double SURCHARGE_RATE;
    static {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial System Surcharge Rate (%): ");
        SURCHARGE_RATE = sc.nextDouble();
    }
    public Warehouse(String location, int totalCapacity) {
        this.location = location;
        this.totalCapacity = totalCapacity;
        this.items = new Item[totalCapacity];
        this.itemCount = 0;
    }
	public String toString() {
		return "Warehouse [location=" + location + 
				", totalCapacity=" + totalCapacity + 
				", itemCount=" + itemCount +
				", SURCHARGE_RATE=" + SURCHARGE_RATE + "]";
	}
	static class Item {
        private String itemName;
        private double price;
        public Item(String itemName, double price) {
            this.itemName = itemName;  
            this.price = price;
        }
		public String toString() {
			return "Item [itemName=" + itemName + ", price=" + price + "]";
		}

    }
    public void addItem(String name, double price) {
        if (itemCount < totalCapacity) {
        	Item item = new Item(name, price);
            items[itemCount++] = item;
            System.out.println("Item added successfully.");
            System.out.println(item.toString());
        } else {
            System.out.println("Warehouse Overflow: Capacity Reached");
        }
    }
    public void displayAllItems() {
    	System.out.println("*****Warehouse details*****");
    	System.out.println(this.toString());
    	for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i].toString());
        }
    }
    public void calculateTotalValue() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].price;
        }
        double finalValue = total + (total * SURCHARGE_RATE / 100);
        System.out.println("Total Inventory Value (with " + SURCHARGE_RATE + "% surcharge): " + finalValue);
    }
}
public class WarehouseSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Warehouse Location: ");
        String loc = sc.nextLine();
        System.out.print("Enter Warehouse Capacity: ");
        int cap = sc.nextInt();
        Warehouse myWarehouse = new Warehouse(loc, cap);
        int choice;
        do {
            System.out.println("<<<<<<<<<< Warehouse Menu >>>>>>>>>>");
            System.out.println("Enter choice: (1) Add Item (2) Total Valuation (3) Display All Items (4) Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Item Name: ");
                    String name = sc.next();
                    System.out.print("Item Price: ");
                    double price = sc.nextDouble();
                    myWarehouse.addItem(name, price);
                    break;
                case 2:
                    myWarehouse.calculateTotalValue();
                    break;
                case 3:
                    myWarehouse.displayAllItems();
                    break;               
                case 4:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}