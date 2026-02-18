
public class StringBufferConstructorsDemo {
    public static void main(String[] args) {
        
        // StringBuffer()
        // Creates an empty buffer with default capacity of 16 characters
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Empty Constructor:");
        System.out.println("Content: \"" + sb1 + "\"");
        System.out.println("Capacity: " + sb1.capacity()); // 16
        System.out.println("Length: " + sb1.length());  

        System.out.println("");
        
        // StringBuffer(int size)
        // Creates an empty buffer with a specific capacity (e.g., 50)
        StringBuffer sb2 = new StringBuffer(50);
        System.out.println("Capacity Constructor (50):");
        System.out.println("Content: \"" + sb2 + "\"");
        System.out.println("Capacity: " + sb2.capacity()); // 50
        System.out.println("Length: " + sb2.length());  

        System.out.println("");
        
        // StringBuffer(String str)
        // Creates a buffer with the string content + 16 extra characters for modifications
        String str = "Hello";
        StringBuffer sb3 = new StringBuffer(str);
        System.out.println("String Constructor (\"Hello\"):");
        System.out.println("Content: \"" + sb3 + "\"");
        System.out.println("Capacity: " + sb3.capacity()); // 5 (length) + 16 = 21
        System.out.println("Length: " + sb3.length());  

        System.out.println("");
        
		char[] chars = { 'a', 'b', 'c' };
		String s = new String(chars);
		sb3 = new StringBuffer(s);
        System.out.println("CharSequence");
	    System.out.println("Content: \"" + sb3 + "\"");
	    System.out.println("Capacity: " + sb3.capacity()); // 5 (length) + 16 = 21
        System.out.println("Length: " + sb3.length());  

	    System.out.println("");
	    
        // StringBuffer(CharSequence chars)
        // Creates a buffer from a CharSequence (like StringBuilder or String)
        CharSequence cs = new StringBuilder("World");
        StringBuffer sb4 = new StringBuffer(cs);
        System.out.println("CharSequence Constructor (\"World\"):");
        System.out.println("Content: \"" + sb4 + "\"");
        System.out.println("Capacity: " + sb4.capacity()); // 5 (length) + 16 = 21
        System.out.println("Length: " + sb4.length());  
    }
}
