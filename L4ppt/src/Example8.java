public class Example8 {
	public static void main(String[] args)  {
		int  a[] = {10,20,30};

//	    for (int i = 0; i < a.length; i++) {
//			a[i] = 20;
//		}
//	    for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
	    
	    for(int b : a){
    	b = 10;
		System.out.println(b);
	    }
	    for(int b : a){
			System.out.println(b);
		}
	    
	    String s[]= {"anil","sunil","rahul"};
	    for(String b : s){
	   		System.out.println(b);
	    }

	    
	}
}
