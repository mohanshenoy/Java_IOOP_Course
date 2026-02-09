
/*
 * Define a class Mixer to merge two sorted integer arrays in ascending order with the following instance variables and methods:
 * instance variables:
 * int arr[]	//to store the elements of an array
 * Methods:
 * void accept() // to accept the elements of the array in ascending order without any duplicates
 * Mixer mix(Mixer A) // to merge the current object array elements with the parameterized array elements and return the resultant object
 * void display()	// to display the elements of the array Define the main() method to test the class.
 */
import java.util.Scanner;

public class Exercise03  {
	public static void main(String[] args) {
	}
}

class Mixer {
    int[] arr;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter " + n + " elements in ascending order (no duplicates):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public Mixer mixIt(Mixer A) {
        Mixer res = new Mixer();
        int n1 = this.arr.length;
        int n2 = A.arr.length;
        res.arr = new int[n1 + n2];

        // Copy first array
        for (int i = 0; i < n1; i++) {
            res.arr[i] = this.arr[i];
        }
        // Copy second array
        for (int j = 0; j < n2; j++) {
            res.arr[n1 + j] = A.arr[j];
        }
        int[] data = res.arr;
        
        // Use Bubble Sorting 
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return res;
    }

    void display() {
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Mixer m1 = new Mixer();
        Mixer m2 = new Mixer();

        System.out.println("For First Mixer:");
        m1.accept();
        System.out.println("For Second Mixer:");
        m2.accept();

        Mixer m3 = m1.mixIt(m2);
        System.out.print("Merged Sorted Array: ");
        m3.display();
    }
}