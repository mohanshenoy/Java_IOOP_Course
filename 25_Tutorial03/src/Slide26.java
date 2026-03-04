public class Slide26 {
    public static void main(String[] args) {
        String str = "malayalam language";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Occurrence of 'a': " + count);
        checkPosition();
    }
    static void checkPosition() {
    	String str = "mitmanipal";
        char thirdChar = str.charAt(2); // Index 2 is the 3rd character
        System.out.println("Character at 3rd position is: " + thirdChar);
    }
}
