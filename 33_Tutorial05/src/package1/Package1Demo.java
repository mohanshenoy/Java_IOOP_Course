package package1;

public class Package1Demo {

	public static void main(String[] args) {
		System.out.println("--------A a = new A()----------");
		A a = new A();
		System.out.println("value of a from A is :"+a.a);
		a.aMethod();
		
		System.out.println("--------B b = new B()---------");
		B b = new B();
		System.out.println("value of a from B is :"+b.a);
		System.out.println("value of b from B is :"+b.b);
		b.bMethod();
		b.aMethod();
		
		System.out.println("--------A a1 = new B()---------");
		A a1 = new B();
		System.out.println(a1.a);
		//System.out.println(a1.b);
		//a1.bMethod();
		a1.aMethod();
		
		System.out.println("--------A a11 = new C()---------");
		A a11 = new C();
		System.out.println(a11.a);
		a11.aMethod();
		
		System.out.println(((B)a11).a);
		System.out.println(((B)a11).b);
		
		System.out.println(((C)a11).a);
		System.out.println(((C)a11).b);
		System.out.println(((C)a11).c);
		
		System.out.println("--------B b11 = new C()---------");
		B b11 = new C();
		System.out.println(b11.a);
		System.out.println(b11.b);
		b11.aMethod();
		
		System.out.println("--------C c = new C()---------");
		C c = new C();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		c.aMethod();	
		c.bMethod();	
		c.cMethod();	

		System.out.println(((B)c).a);
		System.out.println(((B)c).b);
		
		System.out.println(((A)c).a);
		
		
	}

}
