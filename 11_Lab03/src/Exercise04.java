
/*
 * Create a Die Java class with one integer instance variable called sideUp. 
 * Give it a getSideUp() method that returns the values of sideUp and 
 * a void roll() method that changes sideUpto a random value from 1 to 6.
 * Then create a DieDemo class with a method that creates two Die objects, rolls them, 
 * and prints the sum of the two sides up.
 */
public class Exercise04  {
	public static void main(String[] args) {
	}
}

class Die {
    private int sideUp;

    public Die() {
        rollIt();
    }

    public int getSideUp() {
        return this.sideUp;
    }

    public void rollIt() {
        this.sideUp = ((int) (Math.random() * 6)) + 1;
    }
}

class DieDemo {
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();

        die1.rollIt();
        System.out.println("Die 1 rolled: " + die1.getSideUp());

        die2.rollIt();        
        System.out.println("Die 2 rolled: " + die2.getSideUp());
        
        int sum = die1.getSideUp() + die2.getSideUp();
        System.out.println("The sum of the two sides is: " + sum);
    }
}