


public class Tutorial16 {
    public static void main(String[] args) {
    	byte b = 10;
    	short s = 20;
    	var result1 = b + s;
    	System.out.println(result1);
    	System.out.println(((Object)result1).getClass().getSimpleName());
    	
    	int i = 5;
    	double d = 2.0f;
    	var result2 = i / d;
    	System.out.println(result2);
    	System.out.println(((Object)result2).getClass().getSimpleName());
    	
    	
    	long x = 10;
    	float y = 5.0f;
    	//which of the following lines gives compilation error
    	//float result3 = x + y;
    	//double result4 = x + y;
    	//long result4 = x + y;
//    	var result4 = x + y;
//    	System.out.println(result4);
//    	System.out.println(((Object)result4).getClass().getSimpleName());
    	
    	char c = 'A';  
    	int i1 = 23;
    	System.out.println(c + i1);
    	
    }
}




