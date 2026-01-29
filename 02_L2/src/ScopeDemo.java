
public class ScopeDemo {

	public static void main(String[] args) {
		int x=2;// known to all code in main
		if(x==2) {   //starts new scope
			int y=3; // y is created and known only  //to this scope
			System.out.println("value of x is "+ x); // 2  
			System.out.println("value of y is "+ y); //    3
		}
		//y=7; // error because it got destroyed
		x=5; //ok
	}

}
