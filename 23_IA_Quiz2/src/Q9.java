
public class Q9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
class BlockTest { 
    static {  
		System.out.print("A");  
	} 
    {  
		System.out.print("B");  
	} 
    BlockTest() {  
		System.out.print("C");  
	} 
    public static void main(String args[]) { 
        System.out.print("D"); 
        new BlockTest(); 
    } 
} 