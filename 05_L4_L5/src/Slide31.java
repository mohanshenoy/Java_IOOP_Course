public class Slide31 {

    public static void main(String[] args) {
    	int x=0, y=0;
    	boolean running = true;
    	for(int i = 0; i < 10; i++) {
    	    while (running) {
    	        if (x < y)
    	            break;
    	        //..
    	    }
    	    System.out.println("After while");
    	}
    	System.out.println("After for");
    }
}