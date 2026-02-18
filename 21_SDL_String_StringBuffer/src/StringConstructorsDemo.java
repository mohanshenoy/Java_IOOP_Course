
public class StringConstructorsDemo {
    public static void main(String[] args) {


    	char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String s1 = new String(charArray);
        System.out.println("Created String using char array: " + s1);

        // Extracts 'e', 'l', 'l' starting at index 1
        String s2 = new String(charArray, 1, 3);
        System.out.println("Created String using subset of char array: " + s2);

        String s3 = new String(s1);
        System.out.println("Created String using another String : " + s3);

        s3 = new String("World");
        System.out.println("Created String using another String : " + s3);
        
        // ASCII values: 65='A', 66='B', 67='C', 68='D', 69='E'
        byte[] byteArray = {65, 66, 67, 68, 69};
        String s4 = new String(byteArray);
        System.out.println("Created String using byte Array(ASCII) : " + s4);

        // Extracts 'A', 'B' starting at index 0
        String s5 = new String(byteArray, 0, 2);
        System.out.println("Created String using subset of byte Array(ASCII) : " + s5);
    }
}