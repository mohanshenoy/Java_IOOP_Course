package tutorial.payment;
interface PaymentMethod {
    void processPayment(double amount); 
    void validateDetails();
}

class CreditCard implements PaymentMethod {
    private final String API_KEY = "CC-9988";  
    public void processPayment(double amt) { 
    	System.out.println("Paid INR." + amt + " via Card."); 
    } 
    public void validateDetails() {
        System.out.println("Validating Card using API Key: " + API_KEY);
    }
}

class CryptoWallet implements PaymentMethod {
	private final String WALLET_ADDRESS = "0xABC123";
	
    public void processPayment(double amt) { 
    	System.out.println("Transferred " + amt + " BTC."); 
    }
    public void validateDetails() {
        System.out.println("Verifying Blockchain Address: " + WALLET_ADDRESS);
    }
}

public class PaymentSystemDemo {
    public static void main(String[] args) {
        PaymentMethod ref; 

        ref = new CreditCard(); 
        ref.validateDetails(); 
        ref.processPayment(250.0);

        System.out.println("Switching Payment Method ---");

        ref = new CryptoWallet(); 
        ref.validateDetails(); 
        ref.processPayment(0.005);
        
        //ref.apiKey would cause a compiler error because 
        //the interface reference only knows about interface methods.
    }
}