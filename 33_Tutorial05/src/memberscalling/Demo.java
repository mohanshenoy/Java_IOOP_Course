package memberscalling;

public class Demo {

	public static void main(String[] args) {
		A a = new A();
		//System.out.println(a.a);
		//System.out.println(a.a1);
		//System.out.println(a.commnonVar);
		//a.methodA();
		
		//System.out.println(".............................");
		
		C c  = new C();
		//System.out.println(c.a);
		//System.out.println(c.a1);
		//System.out.println(c.commnonVar);
		
		//System.out.println(c.b);
		//System.out.println(c.b1);
		
		//System.out.println(c.c);
		//System.out.println(c.c1);
		//c.methodA();
		//c.methodB();
		//c.methodC();
		
		//System.out.println(".............................");
		
		A ac = new C();
		//System.out.println(ac.a);
		//System.out.println(ac.a1);
		//System.out.println(ac.commnonVar);
		
		//System.out.println(ac.b);
		//System.out.println(ac.b1);
		//System.out.println(((B)ac).b);--
		//System.out.println(((B)ac).b1);--
		
		//System.out.println(ac.c);
		//System.out.println(ac.c1);
		//System.out.println(((C)ac).c);--
		//System.out.println(((C)ac).c1);--
		
		//ac.methodA();--
		//ac.methodB();
		//ac.methodC();
		//System.out.println(".............................");
		
		B bc = new C();
		//System.out.println(bc.a);
		//System.out.println(bc.a1);
		//System.out.println(bc.commnonVar);
		
		//System.out.println(bc.b);
		//System.out.println(bc.b1);
		
		//System.out.println(((B)bc).b);
		//System.out.println(((B)bc).b1);
		//System.out.println(((B)bc).commnonVar);
		
		//System.out.println(bc.c);
		//System.out.println(bc.c1);
		//System.out.println(((C)bc).c);--
		//System.out.println(((C)bc).c1);--
		//System.out.println(((C)bc).commnonVar);--
						
		//bc.methodA();
		//bc.methodB();
		//bc.methodC();		
		
		A a3 = new C();
		C c3 = (C)a3;
		System.out.println(c3.a);
		System.out.println(c3.a1);
		System.out.println(c3.commnonVar);

	}

}
