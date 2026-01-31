// Define the Length class
class Length {
    private int feet;
    private int inch;
    public Length(int feet, int inch) {
        // Normalize the length: 12 inches = 1 feet
        this.feet = feet + (inch / 12);
        this.inch = inch % 12;
    }

    public void display() {
        System.out.println(feet + " feet " + inch + " inches");
    }

    public static Length addLength(Length l1, Length l2) {
        int totalFeet = l1.feet + l2.feet;
        int totalInch = l1.inch + l2.inch;
        Length obj = new Length(totalFeet, totalInch);
        // Return a new Length object with the normalized values
        return obj;
    }
}

// Main class to demonstrate the Length class
public class Main {
    public static void main(String[] args) {
        // Create two Length objects
        Length length1 = new Length(5, 9); // 5 feet 9 inches
        Length length2 = new Length(3, 11); // 3 feet 11 inches
        
        // Display the lengths
        System.out.println("Length 1:");
        length1.display();
        System.out.println("Length 2:");
        length2.display();

        Length result = length1.addLength(length1, length2);
        System.out.println("Total Length:");
        result.display();
    }
}