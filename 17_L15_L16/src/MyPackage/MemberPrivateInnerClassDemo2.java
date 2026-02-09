package MyPackage;

class OuterClass3 {
    private String outerClassMessage = "from Outer Class";

    static void outerClassStaticMethod() {
    		System.out.println("inside outerClassStaticMethod...");
    }
    void outerClassMethod() {
    		System.out.println("inside outerClassMethod...");
    }
    
    private class InnerClass {
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
public class MemberPrivateInnerClassDemo2 {
    public static void main(String[] args) {
        OuterClass3 outer = new OuterClass3();
        // Creating an instance of InnerClass requires an instance of OuterClass
        //OuterClass3.InnerClass inner = outer.new InnerClass();
        //inner.display();
    }
}
