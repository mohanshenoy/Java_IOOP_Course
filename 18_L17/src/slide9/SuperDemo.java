package slide9;

class SuperClass {
	int superVar; //change to private and show
	
	// add default constructor and show 
	
	SuperClass(int superVar) { // remove this code and show 
		this.superVar = superVar;
	}
}

class SubClass extends SuperClass{
	int subVar;
	SubClass(int superVar,int subVar) {
		super(superVar); // explain the need of this 'super' here
		this.subVar = subVar;
	}
	void showVars() {
		System.out.println("superVar :"+superVar);
		System.out.println("subVar :"+subVar);
	}
}

public class SuperDemo {
	public static void main(String[] args) {
		SubClass subClass = new SubClass(1,2);
		subClass.showVars();
		
		System.out.println("");
		
		//show SubClass
		SubClass2 subClass2 = new SubClass2(1,"hello");
		subClass2.showVars();
	}
}