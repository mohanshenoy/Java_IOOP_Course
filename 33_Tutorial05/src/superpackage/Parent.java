package superpackage;

public class Parent extends GrandParent{
	int commonVariable=2;
	int parentVariable=22;
	
	Parent(){}
	
	void commonMethod() {
		System.out.println("I am inside the [ParentClass] commonMethod.....");
	}
}
