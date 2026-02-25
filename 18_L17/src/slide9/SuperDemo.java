package slide9;

class SuperClass {
	int superVar; //change to private and show
	
	SuperClass(){
		System.out.println("[SuperClass] inside default contructor");
	}
	SuperClass(int a) { 
		this.superVar = a;
		System.out.println("[SuperClass] inside parameterised contructor(int)");
	}
	SuperClass(String s){
		System.out.println("Value of s is "+s);
		System.out.println("[SuperClass] inside parameterised contructor(String)");
	}
}

class SubClass extends SuperClass{
	int subVar;
	SubClass(int a,int b) {
		super(b);
		//superVar = b;
		this.subVar = a;
		System.out.println("[SubClass] inside parameterised contructor(int int)");
	}
	SubClass(String s) {
		super(s);
		System.out.println("[SubClass] inside parameterised contructor(String)");
	}
	void showVars() {
		System.out.println("[SubClass] inside showVars method");
		System.out.println("superVar :"+superVar);
		System.out.println("subVar :"+subVar);
	}
}

public class SuperDemo {
	public static void main(String[] args) {
		
		SubClass subClass = new SubClass(1,2);
		subClass.showVars();
		
		System.out.println("");
		subClass = new SubClass("Hello");
		subClass.showVars();
		
		System.out.println("");
		SubClass2 subClass2 = new SubClass2(1,"hello");
		subClass.showVars();
	}
}