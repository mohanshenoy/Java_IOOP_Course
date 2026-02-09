import java.util.Arrays;


/**
 * Define a java class IntArr which hosts an array of integers. Provide the following methods: 
 * A default constructor. 
 * A parameterized constructor which initializes the array of the object. 
 * A method called display to display the array contents. 
 * A method called search to search for an element in the array. 
 * A method called compare which compares 2 IntArr objects for equality. 
 */
class IntArr {
    private int[] arr;
    public IntArr() {
        this.arr = new int[0];
    }
    public IntArr(int[] inputArr) {
        this.arr = inputArr;
    }
    public void display() {
    	for (int arrayElement : arr) {
    		System.out.println("Array Contents: " + arrayElement);
		}
    }
    public void search(int val) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                System.out.println("Element " + val + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Element " + val + " not found.");
    }

    public boolean compareNew(IntArr other) {
        return Arrays.equals(this.arr, other.arr);
    }
    
    public boolean compare(IntArr other) {
        if (this.arr.length != other.arr.length) {
            return false;
        }
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] != other.arr[i]) {
                return false;  
            }
        }
        return true;
    }
    
}

public class AdditonalQ1 {
    public static void main(String[] args) {
        IntArr obj1 = new IntArr(new int[]{10, 20, 30});
        obj1.display();
        obj1.search(20);

        IntArr obj2 = new IntArr(new int[]{10, 20,30});
        System.out.println("Are objects equal? " + obj1.compare(obj2));
    }
}