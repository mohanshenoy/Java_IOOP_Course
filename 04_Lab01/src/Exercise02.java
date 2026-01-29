
import java.util.Scanner;


/**
 * 2.	Write a java program to add two numbers using the bitwise operator and check 
 * if the output is an even or odd number. [Hint: use left shift and right shift bitwise 
 * operators]. 
 */
public class Exercise02 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y,carry;
        
        System.out.print("Enter first number: ");
        int first= input.nextInt();
        x = first;
        
        System.out.print("Enter second number: ");
        int second= input.nextInt();
        y = second;

		while(y!=0){
			carry=x&y;
			x=x^y;
			y=carry<<1;
		}
		System.out.println(first + " + " + second +" ="+x);
	}
}
