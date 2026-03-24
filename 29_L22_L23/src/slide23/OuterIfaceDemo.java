package slide23;

interface MyOuterIface {
	int A = 10;
	interface MyInnerIface{
		int B = 20;
		int myMethod(int c);
	}
}
public class OuterIfaceDemo implements MyOuterIface.MyInnerIface {
	public int  myMethod(int c) {
		return (B + c); // can i add A ?
		
	}
	public static void main(String arg[]) {
		OuterIfaceDemo obj = new OuterIfaceDemo();
		int result = obj.myMethod(30);
		System.out.println(result);
	}
}
