package one.two;

import one.Class11;

public class Class33 extends Class11{
	Class33(){
		System.out.println(this.i);

		Class11 c11 = new Class11();
		//System.out.println(c11.i);	
	}
	public static void main(String[] args) {
		Class33 c33 = new Class33();
		System.out.println(c33.i);
	}
}
