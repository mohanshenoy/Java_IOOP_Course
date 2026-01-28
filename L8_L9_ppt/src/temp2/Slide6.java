package temp2;

public class Slide6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//Returning an object
class Test {
	 int a;
	 void SetVal(int i) {
	     a = i;
	 }
	 Test incrByTen(int n) {
	     Test temp = new Test();
	     temp.a = a + n; // ob1.a+n
	     return temp;
	 }
}

class TestRetObect {
 public static void main(String args[]) {
     Test ob1 = new Test();
     Test ob2;
     ob1.SetVal(2);
     ob2 = ob1.incrByTen(10); // ob2.a: 12
     System.out.println("ob1.a: " + ob1.a);
     System.out.println("ob2.a: " + ob2.a);
 }
}
