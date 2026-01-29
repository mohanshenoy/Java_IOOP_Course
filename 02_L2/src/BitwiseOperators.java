
public class BitwiseOperators {

	public static void main(String[] args) {
		
		int a = 5;  // 0101 in binary
		int b = 3;  // 0011 in binary

		System.out.println("Unary NOT of 5 is : "+~5);
			
		System.out.println();
		int and = a & b; // result: 1 (0001)
		System.out.println(a +"&"+b+" = "+and);
		System.out.println("("+a+"&=3) = " + (a &= 3) );

		System.out.println();
			
		a = 5;
		int or  = a | b; // result: 7 (0111)
		System.out.println(a +"|"+b+" = "+or);
		System.out.println("("+a+"|=3) = " + (a |= 3) );
			
		System.out.println();
			
		a = 5;
		int xor = a ^ b; // result: 6 (0110)
		System.out.println(a +"^"+b+" = "+xor);
		System.out.println("("+a+"^=3) = " + (a ^= 3) );
			
		System.out.println();
			
		a = 5;
		//0000 0101 (5) shifted left twice becomes 0001 0100 (20)
		System.out.println("("+a+"<<2) = " + (a << 2) );
		//5*(2^2) = 20
		System.out.println("("+a+"<<=2) = " + (a <<= 2) );
			
		System.out.println();
			
		a = 20;
		//0001 0100 (20) shifted right twice becomes 0000 0101 (5).
		System.out.println("("+a+">>2) = " + (a >> 2) );
		//20/(2^2) = 5
		System.out.println("("+a+">>=2) = " + (a >>= 2) );
			
		System.out.println();
			
		a = -1;
		//-1 Shift right zero fill) becomes 31
		System.out.println("("+a+">>>31) = " + (a >>> 31) );
		System.out.println("("+a+">>>=31) = " + (a >>>= 31) );
		//11111111 11111111 11111111 11111111
		//shift this pattern 31 places to the right, 
		//31 zeros are filled from the left, 
		//pushing all but the last bit out. 
		//This leaves you with the binary pattern 
		//00000000 00000000 00000000 00000001
		//updated
			
	}

}
