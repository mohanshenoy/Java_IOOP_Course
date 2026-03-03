
public class Slide50 {
    public static void main(String[] args) {
    	String s="mit manipal";
    	int count=0;
    	char c[] = s.toCharArray();
    	for(int i=0;i<c.length;i++) {
    	    if(c[i] == 'a') {
              count++;
    	    }  	
    	}
    	System.out.println("count "+count);
    }
}
