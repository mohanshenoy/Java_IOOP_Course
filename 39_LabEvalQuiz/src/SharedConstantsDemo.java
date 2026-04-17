interface SharedConstants {
	int NO = 100; 
	int YES = 101;
	int MAYBE = 102;
    int LATER = 103;
}
public class SharedConstantsDemo implements SharedConstants {
    int x;
    SharedConstantsDemo() {
        x = 1;
    }
    int fun() {
        if (x > 1)
            return NO;
        else
            return YES;
    }
    public static void main(String s[]) {
    	SharedConstantsDemo obj  = new SharedConstantsDemo();
    		System.out.println(obj.fun());
    }
}