
class Pizza {
    private final String size;
    private final boolean extraCheese;

    // Private constructor forces use of the Builder
    private Pizza(Builder builder) {
        this.size = builder.size;
        this.extraCheese = builder.extraCheese;
    }

//this is not possible
//    void updatePizza() {
//    		this.size = "small";
//    		this.extraCheese= false;
//    }
    
    @Override
	public String toString() {
		return "Pizza [size=" + size + ", extraCheese=" + extraCheese + "]";
	}


	public static class Builder {
        private String size;
        private boolean extraCheese;

        // Methods return 'this' to allow chaining
        public Builder size(String size) { 
            this.size = size; 
            return this; 
        }
        public Builder extraCheese(boolean cheese) { 
            this.extraCheese = cheese; 
            return this; 
        }
        
        public Pizza build() { 
            return new Pizza(this); 
        }
    }
}


public class PizzaDemo {

	public static void main(String[] args) {
		Pizza myLunch = new Pizza.Builder()
			    					.size("Large")
			    					.extraCheese(true)
			    					.build();
		System.out.println(myLunch.toString());
	}

}
