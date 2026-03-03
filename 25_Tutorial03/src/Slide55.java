
public class Slide55 {
    public static void main(String[] args) {
    	String input = "aeioxxxxaaaauxxxxx";
        boolean[] found = new boolean[5]; // [a, e, i, o, u]
        int uniqueCount = 0;
        int result = -1;

        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            int index = "aeiou".indexOf(c);

            if (index != -1 && !found[index]) {
                found[index] = true;
                uniqueCount++;
            }

            if (uniqueCount == 5) {
                result = i + 1;
                break;
            }
        }

        if (result != -1) {
            System.out.println("characters compared " + result);
        } else {
            System.out.println("Not all vowels are present.");
        }

    }
}
//Write a java code snippet to check whether all vowels are 
//present in a given string.  

//If all vowels are present display the minimum  number of characters 
//compared in order to find all vowels. 

//Example: if input string is “"aeioxxxxaaaauxxxxx" then 
//display message “characters compared 12” 