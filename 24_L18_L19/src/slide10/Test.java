package slide10;

//Java Code to show use of
//super keyword with constructor

//superclass Person
class Person {
	 Person(){
	     System.out.println("Person class Constructor");
	 }
}
//subclass Student extending the Person 
class Student extends Person {
	 Student(){
	     super(); //calls super class constructor
	     System.out.println("Student class Constructor");
	 }
} 
//Driver Program
class Test {
	 public static void main(String[] args){
	     Student s = new Student();
	 }
}