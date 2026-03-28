package MyPackage1;
class A { // class with default protection
    A() { // default constructor with default access
        X x = new X(); // create an object of class X

        System.out.println("Same package constructor ....");
        
        // Default variable is accessible in the same package
        System.out.println("n from A" + x.n);  

        // System.out.println("p from A" + x.p); // Error: p is private in X
        
        // Protected is accessible in same package
        System.out.println("q from A" + x.q); 
        
        // OK: public
        System.out.println("r from A" + x.r); 
    }
}