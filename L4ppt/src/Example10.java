public class Example10 {
	public static void main(String[] args)  {
		//To add only the first 5 elements. 
		int nums[]={ 1,2,3,4,5,6,7,8,9},sum=0;
		for(int x : nums) {
		    System.out.println("Value is: " + x); 
		    sum += x; // stop the loop when 5 is obtained 
		    if(x == 5)
		         break; 
		} 
		System.out.println("Summation: " + sum); 
	}
}	
