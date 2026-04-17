class Person {
	 void message(){
	     System.out.println("This is person class");
	 }
}
class Student extends Person {
	 void message(){
	     System.out.println("This is student class"); 
	 }
	 void display(){ 
	     message(); 
	     super.message();
	 } 
} 
public class PersonDemo {
	 public static void main(String args[]){
		 Person s = new Student();
	     s.display();
	 } 
}