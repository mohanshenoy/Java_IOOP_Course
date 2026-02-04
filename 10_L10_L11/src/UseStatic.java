public class UseStatic {
    static int a = 3;
    static int b;
    int temp = 10;

    static {
        System.out.println("Static block initialized.");
        b = a * 4;
        //int temp= 10;
        //System.out.println("value of temp "+temp);		
        //int temp1=20;
        //System.out.println("value of temp1 "+temp1);
    }
    static {
    	System.out.println("Inside 2nd Static block...."); 
    	b = b + 12;
    }
    static {
    	System.out.println("Inside 3rd Static block...."); 
    	b = b + 12;
    }
    
    static void meth(int x) {
    	
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
//        int x = 10;
//        {
//        	int x = 10;
//        }      
        //static int xx= 0;
    }
    public static void main(String[] args) {
        meth(42);
        System.out.println("");
        UseStatic obj = new UseStatic();
        obj.meth(42);
    }
}