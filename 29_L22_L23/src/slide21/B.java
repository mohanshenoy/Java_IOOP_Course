package slide21;
// A nested interface example.

// This class contains a member interface.
class A {
    // this is a nested interface
    public interface NestedIF { //can be default, public, private, or protected
        boolean isNotNegative(int x);
    }
}

// B implements the nested interface.
public class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}