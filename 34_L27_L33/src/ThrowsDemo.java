// Use throws.
public class ThrowsDemo {
    public static char prompt(String str) throws java.io.IOException { 
    	// Notice the throws clause.
        System.out.print(str + ": ");
        return (char) System.in.read();
    }
    public static void main(String args[]) {
        char ch;
        try {
            // Since prompt() might throw an exception, 
            // a call to it must be enclosed within a try block.
            ch = prompt("Enter a letter");
        }
        catch(java.io.IOException exc) {
            System.out.println("I/O exception occurred.");
            ch = 'X';
        }
        System.out.println("You pressed " + ch);
    }
}