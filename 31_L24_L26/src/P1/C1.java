package P1;

public class C1 {
    private int a1;
    int a2; // Default
    protected int a3;
    public int a4;
}

class C2 {
    // a1 not accessible (private to C1)
    // a2, a3, a4 // accessible (same package)
}

class C3 extends C1 {
    // a1 not accessible (private to C1)
    // a2, a3, a4 // accessible (subclass/same package)
}