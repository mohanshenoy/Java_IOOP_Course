
public class Slide54 {
    public static void main(String[] args) {
    	String s1 =  "Manipal Institute of Technology";
    	String s2 =  "National Institute of  Technology Karnataka";
    	if(s1.regionMatches(true,8,s2,9,9))	
    	  System.out.println("region matches");
    	else
    	  System.out.println("region doesn't matches");

    }
}
