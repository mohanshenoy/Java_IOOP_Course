import java.io.IOException;

public class Example7 {
	public static void main(String[] args) throws IOException {
		char ch;
		do {
			System.out.println("press a key followed by ENTER");
			ch = (char)System.in.read();
			System.out.println(ch);
		} while( ch!='x');
		
	}
}
