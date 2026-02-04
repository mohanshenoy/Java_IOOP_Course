
/**
 * Write a Java program to manage an inventory of products.
 * Each product should have a name, id, and quantity.
 * Implement methods to add a product, display all products,
 * and find a product by id.
 */

class Product {
    String name;
    int id;
    int quantity;
    Product(String name, int id, int quantity) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }
    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id + ", Quantity: " + quantity);
    }
}

public class InventoryManagement {
    static Product[] products = new Product[3];
    static int productCount = 0;
    public static void main(String[] args) {
        
    	addProduct("Laptop", 101, 50);
        addProduct("Phone", 102, 100);
        addProduct("Tablet", 103, 30);
        
        System.out.println("All products:");
        displayAllProducts();
        
        System.out.println("\nProduct with ID 102:");
        findProductById(102);
    }

    static void addProduct(String name, int id, int quantity) {
        if (productCount < products.length) {
            products[productCount++] = new Product(name, id, quantity);
        } else {
            System.out.println("Product array is full.");
        }
    }

    static void displayAllProducts() {
        for (Product product : products) {
            product.displayInfo();
        }
    }

    static void findProductById(int id) {
        for (Product product : products) {
            if (product.id == id) {
                product.displayInfo();
                return;
            }
        }
        System.out.println("Product with ID " + id + " not found.");
    }
}