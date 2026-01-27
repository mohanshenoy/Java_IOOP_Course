package temp4;

public class Slide8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Test {
    int a, b; // member variables
    // pass values
    void SetVal(int i, int j) {
        a = i;
        b = j;
    }
    // pass an object
    void TestObject(Test inObj) {
        inObj.a = inObj.a + 10;
        inObj.b = inObj.b - 10;
        // Any changes made to inObj inside the method 
        //directly affect the original object passed to it.
    }
}

class CallByRef {
    public static void main(String args[]) {
        Test ob = new Test();
        ob.SetVal(15, 20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.TestObject(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
