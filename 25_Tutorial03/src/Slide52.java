
public class Slide52 {
    public static void main(String[] args) {
    	String s1 =  "Manipal Institute of Technology";
    	String s2 =  "National Institute of  Technology Karnataka";
    	if(s1.regionMatches(8,s2,9,9))
    	  System.out.println("region matches");
    	else
    	  System.out.println("region doesn't matches");

    }
}
//boolean regionMatches(int startIndex, String str2, int str2StartIndex, int numChars)
//startIndex specifies the index at which the region begins within the invoking String object. 
//The String being compared is specified by str2. 
//The index at which the comparison will start within str2 is specified by str2StartIndex. 
//The length of the substring being compared is passed in numChars