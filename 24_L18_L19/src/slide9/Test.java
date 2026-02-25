package slide9;
//Java program to show use of super with methods

//superclass Person
class Person {
	 void message(){
	     System.out.println("This is person class\n");
	 }
}
//Subclass Student
class Student extends Person {
	 void message(){
	     System.out.println("This is student class"); 
	 }
	 void display(){ 
	     message(); // will invoke current class message() 
	     super.message();  // will invoke parent class message() 
	 } 
} 
//Driver Program
class Test {
	 public static void main(String args[]){
	     Student s = new Student();
	     s.display(); // calling display() of Student
	 } 
}