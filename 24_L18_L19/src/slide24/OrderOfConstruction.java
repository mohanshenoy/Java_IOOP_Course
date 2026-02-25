package slide24;

//Demonstrate when constructors are executed.
//Create a super class.
class A {
 A() {
     System.out.println("Constructing A.");
 }
}
//Create a subclass by extending class A.
class B extends A {
 B() {
     System.out.println("Constructing B.");
 }
}
//Create another subclass by extending B.
class C extends B {
 C() {
     System.out.println("Constructing C.");
 }
}
class OrderOfConstruction {
 public static void main(String args[]) {
     C c = new C();
 }
}