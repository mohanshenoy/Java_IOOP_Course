package MyPackage1;

class Y extends X {
    Y() {
        System.out.println("I am constructor from class Y:");
        System.out.println("n=" + n);
        
        // System.out.println("p=" + p); 
        // Error: p is a private member of X. Not accessible outside X.
        
        System.out.println("q=" + q); // Protected is accessible
        System.out.println("r=" + r); // Public is accessible
    }
}
// Save this as Y.java in MyPackage1 directory