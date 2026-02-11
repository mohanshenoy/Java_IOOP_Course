/*
 * Implement a ShoppingCart java class that contains an inner class Item. 
 * The Item class should have fields like itemName, quantity, and price. 
 * The ShoppingCart class should provide methods to add items, calculate the total price, and display the cart contents. 
 */
public class Q3 {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart(3);
		cart.addItem("Laptop", 1, 50000.00);
        cart.addItem("Mouse", 2, 500.00);
        cart.addItem("Keyboard", 1, 1000.00); 
        cart.displayCart();
        System.out.println("Total Amount : "+cart.calculateTotal());
	}
}

class ShoppingCart {
    private Item[] items;
    private int itemCount;
    public ShoppingCart(int capacity) {
        this.items = new Item[capacity];
        this.itemCount = 0;
    }
    private class Item {
        String itemName;
        int quantity;
        double price;
        Item(String itemName, int quantity, double price) {
            this.itemName = itemName;
            this.quantity = quantity;
            this.price = price;
        }
    }
    public void addItem(String name, int qty, double price) {
        if (itemCount < items.length) {
            items[itemCount++] = new Item(name, qty, price);
        } else {
            System.out.println("Cart is full!");
        }
    }
    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].price * items[i].quantity;
        }
        return total;
    }
    public void displayCart() {
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i].itemName + " x" + items[i].quantity + " @ INR." + items[i].price);
        }
    }
}
