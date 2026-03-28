package P2;

class OtherPackage {
    OtherPackage() {
        // Creating object of Protection class (of p1 package) in another package p2
        P1.Protection p = new P1.Protection();
        System.out.println("other package constructor");

        // System.out.println("n = " + p.n);
        // Error: n has default access; not accessible outside p1

        // System.out.println("n_pri = " + p.n_pri);
        // Error: n_pri is private to Protection

        // System.out.println("n_pro = " + p.n_pro);
        // Error: n_pro is protected; not accessible here because 
        // OtherPackage is NOT a subclass of Protection.

        System.out.println("n_pub = " + p.n_pub); // OK: public is accessible
    }
}