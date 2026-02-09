package MyPackage;

class OuterClass4 {
    private String outerClassMessage = "from Outer Class";

    static void outerClassStaticMethod() {
    		System.out.println("inside outerClassStaticMethod...");
    }
    void outerClassMethod() {
    		System.out.println("inside outerClassMethod...");
    }
    
    protected class InnerClass {
    		private String innerClassMessage = "Hello!";
        void display() {
            // Accessing private member of OuterClass
            System.out.println(innerClassMessage + " " + outerClassMessage);
            
            //Can access static method of OuterClass directly
            outerClassStaticMethod();
            
            //Can access method of OuterClass directly
            outerClassMethod();
        }
    }

}
public class MemberProtectedInnerClassDemo3 {
    public static void main(String[] args) {
        OuterClass4 outer = new OuterClass4();
        // Creating an instance of InnerClass requires an instance of OuterClass
        OuterClass4.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
