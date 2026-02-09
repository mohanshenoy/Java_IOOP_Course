
public class Tutorial03 {
	
	 public static void main(String[] args) {
		 
		 int x = 127;
		 byte y = (byte) x;
		 System.out.println(y);
	     
		 x = 130;
		 y = (byte) x;
		 System.out.println(y);
	     
	     x = -130;
	     y = (byte) x;
	     System.out.println(y);

	     float f = 9.99f;
	     int i = (int) f;
	     System.out.println(i);
	        
	     f = -5.8f;
	     i = (int) f;
	     System.out.println(i);
	        
	     long bigNumber = 256L;  
	     int result = (int) bigNumber;
	     System.out.println(result);
	 }
}
