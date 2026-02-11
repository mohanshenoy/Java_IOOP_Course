package slide9;

class SubClass2 extends SuperClass{
	String subVar2;
	SubClass2(int superVar,String subVar2) {
		super(superVar);  
		this.subVar2 = subVar2;
	}
	void showVars() {
		System.out.println("superVar :"+superVar);
		System.out.println("subVar :"+subVar2);
	}
}