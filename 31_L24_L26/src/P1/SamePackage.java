package P1;

class SamePackage {
    SamePackage() {
        Protection p = new Protection(); // instance
        System.out.println("same package constructor");
        System.out.println("n = " + p.n);

        // System.out.println("n_pri = " + p.n_pri); 
        // Error: n_pri is private to Protection

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}