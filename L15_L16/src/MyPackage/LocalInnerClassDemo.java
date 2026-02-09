package MyPackage;

class OuterClass2 {
    void runMethod() {
    	
        // Local variable (must be final or effectively final to be used in the inner class)
        int localData = 99;
        
        // Local Inner Class defined inside the method
        class LocalInner {
            void print() {
            	 	//localData = 100; // I canNOT update the value
                System.out.println("Local data: " + localData);
            }
        }
        // We must instantiate and use it HERE, inside THIS method only
        LocalInner local = new LocalInner();
        local.print();
    }
}
public class LocalInnerClassDemo {
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        outer.runMethod();
    }
}
