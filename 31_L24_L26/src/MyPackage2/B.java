// Save this as B.java in MyPackage2 directory
package MyPackage2;
class B { // class with default protection
    B() { // default constructor with default access
        MyPackage1.X x = new MyPackage1.X(); // create an object of class X
        
        System.out.println("I am constructor from class B of MyPackage2");

        // System.out.println("n from B of myPackage2" + x.n); 
        // Error: n is default; not accessible in this package

        // System.out.println("p from B of myPackage2" + x.p); 
        // Error: p is private in X

        // System.out.println("q from B of myPackage2" + x.q); 
        // Error: q is protected; not accessible here since B is not a subclass of X

        System.out.println("r from B of myPackage2" + x.r); // OK: public
    }
}