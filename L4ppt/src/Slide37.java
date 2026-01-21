
public class Slide37 {
	public static void main(String[] args) {
		mylabel: 
			for (int i = 0; i < 2; i++) {
		    	for (int j = 0; j < 2; j++) {
		    		if (i == j)
		    			continue mylabel;
		    		System.out.println("hello");
		    	}
			}
	}
}
