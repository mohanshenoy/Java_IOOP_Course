package slide19;

abstract class MyClass {
	int a;
	int b;
	MyClass(int a , int b){
		this.a = a;
		this.b = b;
	}
}

public class MyDemoClass {
	public static void main(String[] args) {
		MyClass obj = new MyClass(1,2);
	}
}
