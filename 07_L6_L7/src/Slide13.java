
public class Slide13 {
    public static void main(String[] args) {
        StackMachine myStack = new StackMachine();
        // The compiler selects the method based on the data type
        myStack.push(10);      // Situational choice: Integer routine
        myStack.push(10.5);    // Situational choice: Floating-point routine
        myStack.push('A');     // Situational choice: Character routine
    }
}

class StackMachine {
    // Shared method name: push
    void push(int data) {
        System.out.println("Storing integer " + data + " in the int stack.");
    }
    void push(double data) {
        System.out.println("Storing float " + data + " in the floating-point stack.");
    }
    void push(char data) {
        System.out.println("Storing character '" + data + "' in the character stack.");
    }
}
