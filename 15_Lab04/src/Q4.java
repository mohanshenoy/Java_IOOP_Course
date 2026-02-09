
/**
 * Create a java class called Counter that contains a static data member 
 * to count the number of Counter objects being created. 
 * Also define a static member function called showCount() 
 * which displays the number of objects created at any given point of time. 
 * Illustrate this. 
 * 
 */
class Counter {
    private static int count = 0;
    public Counter() {
        count++;
    }
    public static void showCount() {
        System.out.println("Total Counter objects created: " + count);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Counter.showCount();

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4;
        c4 = new Counter();
        Counter.showCount();

        Counter c5 = new Counter();
        Counter.showCount();
    }
}
