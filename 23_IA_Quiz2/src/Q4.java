
public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

class MyClass1 {  
	int a;  
	MyClass1(int x) {  
		a = x;  
	}  
} 
class MyClassClient1 { 
    static void swap(MyClass1 x, MyClass1 y) { 
    	MyClass1 temp = x; 
        x = y; 
        y = temp; 
    } 
    public static void main(String args[]) { 
    	MyClass1 o1 = new MyClass1(1); 
    	MyClass1 o2 = new MyClass1(2); 
        swap(o1, o2); 
        System.out.println(o1.a + " " + o2.a); 
    } 
} 
