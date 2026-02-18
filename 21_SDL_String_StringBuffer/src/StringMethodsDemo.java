import java.util.Locale;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Java Programming";
        System.out.println("str: " + str);
        
        // charAt(int index), 
        // Returns the character at index 5 ('P')
        char ch = str.charAt(5);
        System.out.println("charAt(5): " + ch);

        // codePointAt(int index)
        // Returns Unicode value of 'J' at index 0 (74)
        int unicode = str.codePointAt(0);
        System.out.println("codePointAt(0): " + unicode);

        // compareTo(String anotherString)
        // Returns negative because "Apple" comes before "Banana" lexicographically
        int compare1 = "Apple".compareTo("Banana"); 
        System.out.println("compareTo: " + compare1);

        compare1 = "Cat".compareTo("Apple"); 
        System.out.println("compareTo: " + compare1);
        
        // compareToIgnoreCase(String str)
        // Returns 0 because contents are same ignoring case
        int compare2 = "java".compareToIgnoreCase("JAVA");
        System.out.println("compareToIgnoreCase: " + compare2);

        // concat(String str)
        // Appends string to the end
        String combined = str.concat(" 101");
        System.out.println("concat: " + combined);

        // contains(CharSequence s)
        // Checks if "Gram" is part of the string
        boolean hasGram = str.contains("Gram"); 
        System.out.println("contains 'Gram': " + hasGram);
        
        // endsWith(String suffix)
        // Checks if the string ends with "ming"
        boolean ends = str.endsWith("ming");
        System.out.println("endsWith 'ming': " + ends);

        // equals(Object anObject)
        // Compares content strictly (case-sensitive)
        boolean isEqual = str.equals("java programming");
        System.out.println("equals 'java programming': " + isEqual); // false

        // equalsIgnoreCase(String anotherString)
        // Compares content ignoring case differences
        boolean isEqualIgnore = str.equalsIgnoreCase("JAVA PROGRAMMING");
        System.out.println("equalsIgnoreCase: " + isEqualIgnore); // true

        double price = 1234.567;
        // format(Locale l, String format, Object... args)
        // Returns a formatted string using the specified locale
        // Example: Formatting a float to 2 decimal places for US region        
        // US Locale: Uses dot (.) for decimal
        String usFormat = String.format(Locale.US, "Total: %.2f", price);
        System.out.println("US: " + usFormat); // Output: Total: 1234.57

        // German Locale: Uses comma (,) for decimal
        String deFormat = String.format(Locale.GERMANY, "Total: %.2f", price);
        System.out.println("Germany: " + deFormat); // Output: Total: 1234,57
        
        
        str = "Hello World";

        // getBytes()
        // Converts string to byte array (ASCII values: H=72, e=101...)
        byte[] bytes = str.getBytes();
        System.out.println("getBytes length: " + bytes.length);

        // getChars(srcBegin, srcEnd, dst, dstBegin)
        // Copies "World" (index 6 to 11) into a new char array starting at index 0
        char[] targetArray = new char[5];
        str.getChars(6, 11, targetArray, 0); 
        System.out.println("getChars result: " + new String(targetArray));

        // indexOf(int ch)
        // Finds first 'o' at index 4
        int firstO = str.indexOf('o');
        System.out.println("indexOf 'o': " + firstO);

        // isEmpty()
        // Checks length. str is not empty (false). "" is empty (true).
        System.out.println("isEmpty: " + str.isEmpty());

        // lastIndexOf(int ch)
        // Finds last 'o' at index 7 (in "World")
        int lastO = str.lastIndexOf('o');
        System.out.println("lastIndexOf 'o': " + lastO);
        
        
    }
}