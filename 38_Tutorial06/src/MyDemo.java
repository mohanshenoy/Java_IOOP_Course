class ClassA {
	void myMethod(int i ) {
		System.out.println("inside ClassA.myMethod()...."+i);
	}
	int myMethod(int i , int j) {
		System.out.println("inside ClassA.myMethod(int i , int j)...."+i + " and "+j);
		return (i+j);
	}
}

class ClassB extends ClassA {
	void myMethod(int i ) {
		System.out.println("inside ClassB.myMethod()...."+i);
	}
}

public class MyDemo {
	public static void main(String[] args) {
		ClassA obj = new ClassB();
		obj.myMethod(1);
	}
}