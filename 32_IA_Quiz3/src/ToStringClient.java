class A1 {
    int x = 5;
    public String toString() { 
    	return "A1:" + x; 
    }
}
class B1 extends A1 {
    int x = 10;
    public String toString() { 
    	return "B1:" + x + "-" + super.toString(); 
    }
}
public class ToStringClient {
    public static void main(String[] args) {
        A1 obj = new B1();
        System.out.print(obj);
    }
}
//A) B1:10-A1:10  
//B) B1:10-A1:5 ***   
//C) A1:5-B1:10  
//D) Compilation error 
