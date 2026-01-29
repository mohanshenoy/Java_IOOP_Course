
public class Primitives {

	public static void main(String[] args) {

// few valid examples......................
		byte b1 = (byte) 128;
		System.out.println(b1);
		short sh = 100;
		
		int x1;
		x1 = 234;
		int z = x1;

		long l1 = 100;
		//long l2 = 3456789L;
		
		//float f = 32.5f;
		
		//double d = 3456.98;
		
		boolean isFun = true;
		
		boolean isActive;
		isActive = false;
		
		boolean powerOn;
		powerOn = isFun;
		
		char c = 'f';
		
		

// check if these are valid or not......................
		//int x = 34.5;		
		//boolean boo = x;  
		int g = 17;  
		int y = g;  
		y = y + 10;  
		short s;
		//s = y;  
		byte b = 3;  
		byte v = b;  
		short n = 12;  
		//v = n;  
		byte k = 127; 
		//byte k1 = 128; 
			
//Characters......................		
		char ch;
		ch='A';
		System.out.println(ch); //prints A
		ch++;
		System.out.println(ch); //prints B
		ch=90;
		System.out.println(ch); //prints Z
		
		/*
		In Java, the 0x prefix identifies a hexadecimal (base-16) literal. 
		While we usually count in base-10 (0-9), hexadecimal uses sixteen symbols: 
		0-9 and A-F. In my specific example, 0x0C95 represents a numeric value 
		that maps to a specific character in the Unicode table.

		Since a char in Java is a 16-bit unsigned integer, you can assign hex 
		values directly to represent symbols or letters. The value 0x0C95 specifically 
		corresponds to the character 'ಕ' from the Kannada script. 
		Using hex is often preferred over decimal for characters because it 
		aligns more cleanly with the 16-bit structure of Unicode.
		*/
		
		ch=0x0C95;
		System.out.println(ch);  
		ch=3221;
		System.out.println(ch);  
		//https://www.compart.com/en/unicode/U+0C95
		
		ch=0x0916;
		System.out.println(ch);  
		ch=2326;
		System.out.println(ch);  
		//https://www.unicode.org/charts/PDF/U0900.pdf
		
		
//Character Literals......................		
		char c1 = '\"';
		System.out.println(c1);  
		c1 = '\t';
		System.out.println(c1);  		
		c1 = 'h';
		System.out.println(c1);  			
		c1 = '\n';
		System.out.println(c1);  		
		c1 = '1';
		System.out.println(c1);  	
		
		
//String Literals......................		
	String s1;
	s1 = "abc";
	s1 = "abc\ndef";
	s1 = "";		
	System.out.println(s1);  		
		
		
		
		long x = 2147483647;  
		byte b11 =  (byte) x;
		System.out.println(b11);

		long x2 = 2143650L;
		byte b2 =  (byte) x2;
		System.out.println(b2);
		
		byte btemp =  (byte) 128;
		System.out.println(btemp);
		
		short stemp = (short) 32780;
		System.out.println(stemp);
		
		long ltemp = 2147483648L;
		System.out.println(ltemp);
		
		float ftemp = 34.5f;
		System.out.println(ftemp);

		int itemp = (int) 34.5;
		System.out.println(itemp);
		
	}

}
