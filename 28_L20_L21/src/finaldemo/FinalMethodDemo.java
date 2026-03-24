package finaldemo;
class Parent {
    final void show(int i) {
       System.out.println("This is a final method.");
   }
}
public class FinalMethodDemo extends Parent{
    final void show() {
       System.out.println("This is a final method.");
   }
}