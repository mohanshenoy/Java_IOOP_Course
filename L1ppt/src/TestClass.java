
//public class TestClass {
//	public static void main(String[] args) {
//		STUDENT student = new STUDENT();
//		student.assign("mohan");
//		System.out.println("hello");
//	}	
//}
class TestClass1 {

	String sName;
	double[] marksArray;
	double avg;
	double total;
	
	public void assign(String sName) {
		this.sName = sName;
//		this.marksArray = marksArray;
		this.avg = avg;
	}
	public static void main(String[] args) {
		TestClass1 student = new TestClass1();
		student.assign("mohan");
		System.out.println("hello");
	}
}
