package P2;
// Demo package p2. both ways of import (class/all class) is possible
import P2.Protection2;
import P2.*;

// Instantiate the various classes in p2.
public class Demo_P2 {
    public static void main(String args[]) {
        Protection2 ob1 = new Protection2();
        OtherPackage ob2 = new OtherPackage();
    }
}