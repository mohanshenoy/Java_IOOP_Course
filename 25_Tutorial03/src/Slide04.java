
public class Slide04 {

	public static void main(String[] args) {
		String  s = new String("mit");
		System.out.println(s.toCharArray());
		
        char ch1[] = {'a','b','c'};
        String s1 = new String(ch1);
        System.out.println(s1);
        
        char ch2[] = {'a','b','c','d','e','f'};
        String s2 = new String(ch2 , 2, 3);                        
        System.out.println(s2);
	}

}
