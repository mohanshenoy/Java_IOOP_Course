/*
 * 2.	Design an interface called Series with the following methods 
 * i) getNext (returns the next number in series) 
 * ii) reset(to restart the series)
 * iii) setStart (to set the value from which the series should start)
 * Design a class named ByTwos that implements Series such that it 
 * generates a series of numbers, each two greater than the previous one.
 * Also design a class which will include the main method for 
 * referencing the interface.
 */
interface Series {
    int getNext();      
    void reset();       
    void setStart(int x); 
}

class ByTwos implements Series {
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();
        Series sRef = ob;

        System.out.println("Series starting at 0:");
        for(int i = 0; i < 5; i++) {
            System.out.println(sRef.getNext());
        }

        System.out.println("Resetting series...");
        sRef.reset();
        System.out.println("First value after reset: " + sRef.getNext());

        System.out.println("Setting start to 100:");
        sRef.setStart(100);
        for(int i = 0; i < 100; i++) {
            System.out.println(sRef.getNext());
        }
    }
}