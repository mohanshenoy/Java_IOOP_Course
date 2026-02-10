package slide11;

class Outer {
	
    static class StaticNested { //change to private, protected and show
        void display() {
            System.out.println("Inside static nested class");
        }
    }
    
}
public class Main {
    public static void main(String[] args) {
        
    		// Direct instantiation using the Outer class name
        Outer.StaticNested obj = new Outer.StaticNested(); 
        obj.display();
    }
}