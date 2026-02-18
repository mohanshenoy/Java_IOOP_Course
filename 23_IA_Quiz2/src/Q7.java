
public class Q7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class Box2 { 
	int size; 
	Box2(int s) { 
		size = s; 
	} 
}
class Main2 { 
    public static void main(String args[]) { 
		Box2[] b = new Box2[2]; 
		b[0] = new Box2(5); 
		Box2[] c = b;   
		c[0].size = 10; 
		b[1] = new Box2(20); 
		c = new Box2[2];
		c[1] = new Box2(30); 
		System.out.println(b[0].size + " " + b[1].size);
    } 
} 