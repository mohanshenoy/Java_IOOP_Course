package slide9;

class SubClass2 extends SuperClass{
	String subVar2;
	SubClass2(int a,String b) {
		superVar = a;
		this.subVar2 = b;
		System.out.println("[SubClass2] inside parameterised contructor (int String)");
	}
	void showVars() {
		System.out.println("[SubClass2] inside showVars method");
		System.out.println("superVar :"+superVar);
		System.out.println("subVar :"+subVar2);
	}
}