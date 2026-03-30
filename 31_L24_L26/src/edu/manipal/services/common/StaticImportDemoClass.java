package edu.manipal.services.common;

public class StaticImportDemoClass {
	public static int staticIntVar=10;
	public int publicIntVar=20;
	
	public static void myStaticMethod() {
		System.out.println("inside myStaticMethod....");
	}
	public void myNonStaticMethod() {
		System.out.println("inside myNonStaticMethod....");
	}
}
