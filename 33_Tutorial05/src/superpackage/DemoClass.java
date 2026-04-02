package superpackage;

public class DemoClass {
	public static void main(String[] args) {
//		GrandParent gp  = new GrandParent();
//		gp.commonMethod();
//		System.out.println(gp.commonVariable);
//		System.out.println(gp.grandParentVariable);
						
//		Parent p  = new Parent();
//		p.commonMethod();
//		System.out.println(p.commonVariable);
//		System.out.println(p.parentVariable);
		
//		Son s  = new Son();
//		s.commonMethod();
//		System.out.println(s.commonVariable);
//		System.out.println(s.sonVariable);		
//		s.sonsMethod();
		
		GrandParent sonObject  = new Son();
		//sonObject.commonMethod();
		System.out.println(sonObject.commonVariable);
		System.out.println(((Parent)sonObject).commonVariable);
		System.out.println(((Son)sonObject).commonVariable);
		
		//System.out.println(sonObject.sonVariable);
		//System.out.println(sonObject.grandParentVariable);	
		//sonObject.sonsMethod();
		
		
	}		


}
