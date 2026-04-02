package superpackage;

public class Son extends Parent{
	int commonVariable=3;
	int sonVariable=33;
	
	Son(){}

	void commonMethod() {
		System.out.println("I am inside the [SonClass] commonMethod.....");
	}

	void sonsMethod() {
		System.out.println("I am inside the [SonClass] sonsMethod.....");

	}
}
