package edu.manipal.mit;

public class Parent {
	int p1;
	
	Parent(){
		System.out.println("inside Parent default constructor");
	}
	Parent(int p1){
		this.p1 = p1;
		System.out.println("inside Parent parameterised constructor");
	}
	
	int myMethod() {
		System.out.println("inside myMethod of Parent");
		return p1;
	}
	double myMethod(int i) {
		System.out.println("inside myMethod(int i) of Parent");
		return p1;
	}
	
	byte returnTheNumber(byte a){
		return a;
	}
	
	int add(int A, int B) {
		return A + B;
	}
}
