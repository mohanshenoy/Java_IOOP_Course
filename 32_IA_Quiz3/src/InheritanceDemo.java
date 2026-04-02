class A { 
	long ltemp;
	A() { 
		System.out.print("A"); 
	} 
	A(short stemp){
		ltemp = stemp;
	}
}
class B extends A { 
	B() { 
		System.out.print("B"); 
	} 
	B(int itemp){
		super.ltemp=itemp;
	}
}
class C extends B { 
	C() { 
		System.out.print("C"); 
	} 
	C(long ltemp){
		super.ltemp=ltemp;
	}
}
public class InheritanceDemo { 
	public static void main(String[] args) { 
		A c = new C(10L); 
		System.out.print(c.ltemp);
	} 
}
//A) ABC  
//B) ABC10  
//C) AB10 ***
//D) Compilation error 
