
public class Slide43 {
    public static void main(String[] args) {
    	String st = "ict         dept    mit      manipal";
        String s[] = st.split(" +");
        for(int i=0;i<s.length;i++) {
          System.out.println(s[i]);
        }
    }
}
//This Java program demonstrates how to use the split() method with a 
//Regular Expression (Regex) to break a string into an array. 
//The specific regex " +" tells Java to split the string wherever 
//it finds one or more consecutive spaces.
