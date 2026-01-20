
public class Exercise01 {

	public static void main(String[] args) {
		int x=9,y=9,carry;
		while(y!=0){
			carry=x&y;
			x=x^y;
			y=carry<<1;
		}
		System.out.println("The sum is "+x);
	}
}
