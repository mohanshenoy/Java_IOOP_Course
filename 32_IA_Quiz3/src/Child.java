final class MyClass { 
	final int x = 3; 	
	int getInt(){
		return x;
	}
}
public class Child extends MyClass { 
   int y = 4; 
   Child(int y){
	   this.y = y;
   }
   public static void main(String[] args) {
	   Child c = new Child(100);
	   int temp = c.getInt();  
	   System.out.println("value of temp is "+temp);
   }
}
//A) value of temp is 3 
//B) value of temp is 100 
//C) Compilation error ***
//D) value of temp is 4 


