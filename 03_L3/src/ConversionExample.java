/*
 * 	byte 		8  		-128 to +127
	short 		16		-32,768 to 32,767
	int 		32		-2,147,483,648 to 2,147,483,647 
	long 		64		-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 
	float 		32		-3.4×10^38 to  +3.4×10^38.
	double 		64		-1.8×10^308 to +1.8×10^308
	char 		16		0 to 65,535 ( uses unicode)
 */
public class ConversionExample {

	public static void main(String[] args) {
		
		//byte btemp =10;
		//int itemp = btemp;
		
		//int itemp = 10;
		//long ltemp = itemp;
		
		//double dtemp = 30.0;
		//byte temp = dtemp;
		
		
		
		
		//double dtemp = 3;
		//System.out.println(dtemp);

		//float ftemp = 3;
		//System.out.println(ftemp);	
		
		//byte btemp = (byte) 128;
		//System.out.println(btemp);	

		
		//byte btemp = 127;
		
		//int x = 127;
		//byte btemp = x;
		
		//byte btemp = 128;
		
		//short stemp = 32767;
		//stemp = 32768;
		
		//int itemp  = 2147483647;
		//itemp = 2147483648;
		
		//long ltemp = 9223372036854775807;
		//long ltemp = 9223372036854775807L;
		
		int  n=386;
		byte b;

		b = (byte)n;
		System.out.println(b);




	}

}
