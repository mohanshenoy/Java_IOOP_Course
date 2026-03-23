package finaldemo;
class Parent {
    final void show() {
       System.out.println("This is a final method.");
   }
}
public class FinalMethod extends Parent{
    final void show() {
       System.out.println("This is a final method.");
   }
}