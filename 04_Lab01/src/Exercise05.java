

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: "); int n = sc.nextInt();
        System.out.println();
        
        String[] names = new String[n];
        double[] prices = new double[n];
        int[] stocks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("*****Product " + (i + 1) + " details:*******");
            System.out.println();
            
            System.out.print("Enter Product name"); 
            names[i] = sc.next();
            System.out.println();
            
            System.out.print("Enter Product price"); 
            prices[i] = sc.nextDouble();
            System.out.println();
            
            System.out.print("Enter Product number of stock"); 
            stocks[i] = sc.nextInt();
            System.out.println();
            
        }

        double totalBill = 0;
        boolean check = true;
        while(check) {
            System.out.print("Enter name of product to buy OR enter 'checkout' or enter 'exit' to close");
            String productNameEntered = sc.next();
            System.out.println();

            
            if(productNameEntered.equalsIgnoreCase("checkout")) {
            	System.out.println("Total Bill: " + totalBill);
            }
            if(productNameEntered.equalsIgnoreCase("exit")) {
            		System.out.println("exiting....");
            		break;
            }
            for (int i = 0; i < names.length; i++) {
                if(productNameEntered.equalsIgnoreCase(names[i])) {
                    System.out.print("Enter quantity: "); 
                    int qtyEntered = sc.nextInt();
                    System.out.println();
                    
                    if (qtyEntered <= stocks[i]) {
                        totalBill += prices[i] * qtyEntered;
                        stocks[i] -= qtyEntered;
                    } else {
                        System.out.println("Insufficient stock!");
                    }
                }else {
                		continue;
                }
            }
        }
        
    }
}