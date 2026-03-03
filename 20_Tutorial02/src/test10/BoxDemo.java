package test10;

public class BoxDemo {

	public static void main(String[] args) {
		
		Box box1 = null;
        //Using Static Validation before creation
        if (Box.validate(10, 10, 10)) {
            box1 = new Box(10, 10, 10);
            System.out.println("box1 volume is "+ box1.volume());

            //Using Static Nested Class logic
            Box.ShippingCalculator.maxBoxesInContainer(box1.volume());
            
            //remove static from the method and check
            //Box.ShippingCalculator shippingCalculator = new Box.ShippingCalculator();
            //shippingCalculator.maxBoxesInContainer(box1.volume());
        
            System.out.println("");
            
            //Create the Inner Object using the Outer Object
            // Syntax: outerObject.new InnerClass()
            Box.LabelPrinter printer = box1.new LabelPrinter("RED");
            
            printer.printLabel();
            
        }
        
        
        

	}
}
