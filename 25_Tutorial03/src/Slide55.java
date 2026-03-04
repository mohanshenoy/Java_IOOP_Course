
public class Slide55 {
    public static void main(String[] args) {
    	String input = "aeioxxxxaaaauxxxxx";
        boolean[] found = new boolean[5]; // 0:a, 1:e, 2:i, 3:o, 4:u
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            int index = "aeiou".indexOf(c);

            if (index != -1 && !found[index]) {
                found[index] = true;
                count++;
            }

            if (count == 5) {
                System.out.println("characters compared " + (i + 1));
                System.exit(0); //return;
            }
        }
        System.out.println("Not all vowels are present.");
    }
}
//Write a java code snippet to check whether all vowels are 
//present in a given string.  

//If all vowels are present display the minimum  number of characters 
//compared in order to find all vowels. 

//Example: if input string is “"aeioxxxxaaaauxxxxx" then 
//display message “characters compared 12” 