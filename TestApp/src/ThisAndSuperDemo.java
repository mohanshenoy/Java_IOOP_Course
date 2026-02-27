class Parent  {
	private int i;
	Parent(){
		this.i = 0;
		System.out.println("Parent Default Constructor called.....");
	}
	Parent(int  i){
		this.i = i;
		System.out.println("Parent Parameterised Constructor(int) called.....");
	}
	int getI() {
		return i;
	}
}
class Child extends Parent{
	private int j;
	Child(){
		this(10);
		this.j = 20;
		System.out.println("Child Default Constructor called.....");
		
	}
	Child(int  i, int j){
		super(i);
		this.j = j;
		System.out.println("Child Parameterised Constructor(int, int) called.....");
	}
	Child(int j){
		this.j= j;
		System.out.println("Child Parameterised Constructor(int) called.....");
	}
	
	int getJ(){
		return j;
	}
}
public class ThisAndSuperDemo {

	public static void main(String[] args) {
		//Child childObject = new Child();
		//System.out.println("Value of childObject.getI() is "+childObject.getI());
		//System.out.println("Value of childObject.getJ() is "+childObject.getJ());
		
		//System.out.println();
		
		Child childObject = new Child();
		//childObject = new Child(10,20);
		System.out.println("Value of childObject.getI() is "+childObject.getI());
		System.out.println("Value of childObject.getJ() is "+childObject.getJ());

	}

}
