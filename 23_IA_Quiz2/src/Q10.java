
public class Q10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
class Test3 { 
    static int x = 10; 
    int y = 20; 
} 
class Main3 { 
    public static void main(String args[]) { 
        Test3 t1 = new Test3(); 
        Test3 t2 = new Test3(); 
        t1.x = 88; 
        t1.y = 99; 
        System.out.println(t2.x + t2.y); 
    } 
} 