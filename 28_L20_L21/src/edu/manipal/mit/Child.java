package edu.manipal.mit;

public class Child extends Parent {
	int c1;
	
	Child(){
		System.out.println("inside Child default constructor");
	}
	Child(int c1){
		super(c1);
		this.c1 = c1;
		System.out.println("inside Child parameterised constructor");
	}
	int myMethod() {
		System.out.println("inside myMethod of Child");
		return c1*c1;
	}
	
	byte returnTheNumber(byte a){
		return a;
	}
	
	int add(int A, int B) {
		return A + B;
	}
}
