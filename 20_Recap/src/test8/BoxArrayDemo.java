package test8;

public class BoxArrayDemo {
    public static void main(String[] args) {
        
        //ARRAY OF OBJECTS DECLARATION ---
        Box[] warehouse = new Box[4];

        //INITIALIZATION ---
        warehouse[0] = new Box(10, 10, 10, "Standard Box");
        warehouse[1] = new Box(20, 20, 5,  "Flat Pack");
        warehouse[2] = new Box(5, 5, 5,    "Tiny Gift Box");
        warehouse[3] = new Box(50, 10, 10, "Heavy Duty Container");

        System.out.println("----------------Iterating Array ----------------");
        double totalVolume = 0;
        for (Box currentBox : warehouse) { // Iterate through the array
            if (currentBox != null) {
                System.out.println(currentBox.toString()); 
                totalVolume += currentBox.volume();
            }
        }
        System.out.println("Total Warehouse Volume: " + totalVolume);
        
        System.out.println("");
        
        System.out.println("-----------------String Manipulation (Search)-----------------");
        String searchKey = "heavy";
        for (Box b : warehouse) {
            if (b.label.toLowerCase().contains(searchKey.toLowerCase())) {
                System.out.print("Found Match: " + b.label);
                System.out.println(", Its dimensions: " + b.width + "x" + b.height);
            }
        }

        System.out.println("");
        
        System.out.println("-----------------Array Logic (Find Largest)-----------------");
        Box largestBox = warehouse[0]; // Assume first is largest
        for (int i = 1; i < warehouse.length; i++) {
            if (warehouse[i].volume() > largestBox.volume()) {
                largestBox = warehouse[i];
            }
        }
        System.out.println("Largest Box is: " + largestBox.label + " (" + largestBox.volume() + ")");
    }
}