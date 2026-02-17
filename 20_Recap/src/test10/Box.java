package test10;

class Box {
	private double width;
	private double height;
	private double depth;
	
    // STATIC METHOD: Called without creating an object
    static boolean validate(double width, double height, double depth) {
        if (width <= 0 || height <= 0 || depth <= 0) {
            System.out.println("Error: Dimensions must be positive.");
            return false;
        }
        return true;
    }
 
	double volume() {
		return (this.width*this.height*this.depth);
	}
	

	Box(double width, double height, double depth){
		if (validate(width, height, depth)) {
			this.width = width;
			this.height = height;
			this.depth = depth;	
		}
	}


	// STATIC NESTED CLASS: A helper that doesn't need a specific Box instance
    static class ShippingCalculator {
        static double containerVolume = 10000.0;
        static void maxBoxesInContainer(double boxVolume) {
            int capacity = (int) (containerVolume / boxVolume);
            System.out.println(
            		"Shipping: You can fit " + 
            		capacity + 
            		" of these boxes in a standard container."
            );
        }
    }
   // STATIC NESTED CLASS: A helper that doesn't need a specific Box instance
    
    // NON-STATIC INNER CLASS: NEEDS a specific Box instance to exist.
    class LabelPrinter {
        String stickerColor;
        LabelPrinter(String color) {
            this.stickerColor = color;
        }
        void printLabel() {
            System.out.println("--- PRINTING LABEL ---");
            System.out.println("Size: " + width + "x" + height + "x" + depth);
            System.out.println("Sticker: " + stickerColor);
            System.out.println("----------------------");
        }
    }
    // NON-STATIC INNER CLASS: NEEDS a specific Box instance to exist.
	
}
