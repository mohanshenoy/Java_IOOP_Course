
public class Slide28 {
    public static void main(String[] args) {
		String s = "abcabcabc";
		System.out.println(s.indexOf('a',3));
	    System.out.println(s.indexOf('c',3));
	    System.out.println(s.lastIndexOf('c',2));
	    System.out.println(s.lastIndexOf('c',7));
    }
}
//s.indexOf('a', 3): Starts at index 3 ('a') and looks forward. 
//It finds 'a' immediately at index 3.

//s.indexOf('c', 3): Starts at index 3 ('a') and looks forward. 
//The first 'c' it hits is at index 5.

//s.lastIndexOf('c', 2): Starts at index 2 ('c') and searches backward toward index 0. 
//It finds 'c' at index 2.

//s.lastIndexOf('c', 7): Starts at index 7 ('b') and searches backward. 
//The first 'c' it encounters is at index 5.
