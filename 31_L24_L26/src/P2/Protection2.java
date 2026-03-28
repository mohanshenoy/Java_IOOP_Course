package P2;

class Protection2 extends P1.Protection {
    Protection2() {
        System.out.println("derived other package constructor");

        // System.out.println("n = " + n);
        // Error: n has default access; not accessible in a different package

        // System.out.println("n_pri = " + n_pri);
        // Error: n_pri is private to Protection

        System.out.println("n_pro = " + n_pro); // Accessible because Protection2 is a subclass
        System.out.println("n_pub = " + n_pub); // Accessible because it is public
    }
}