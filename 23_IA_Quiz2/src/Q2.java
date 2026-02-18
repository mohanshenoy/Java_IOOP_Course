
public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class MyClass { 
    int x; 
} 
class Main { 
    public static void main(String args[]) { 
        MyClass mc1 = new MyClass(); 
        mc1.x = 10; 
        MyClass mc2 = mc1; 
        mc2.x = 20; 
        System.out.println(mc1.x); 
    } 
} 
