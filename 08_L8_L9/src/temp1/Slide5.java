package temp1;

public class Slide5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//Returning an object
class Test {
 int a;
 Test(int i) {
     a = i;
 }
 Test incrByTen() {
     Test temp = new Test(a + 10);
     return temp;
 }
}

class TestRetObect {
 public static void main(String args[]) {
     Test ob1 = new Test(2); // ob1.a: 2
     Test ob2;
     ob2 = ob1.incrByTen(); // ob2.a: 12
     System.out.println("ob1.a: " + ob1.a);
     System.out.println("ob2.a: " + ob2.a);
     ob2 = ob2.incrByTen(); // ob2.a: 22
     System.out.println("ob2.a after second increase: " + ob2.a);
 }
}