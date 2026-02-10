package slide6;

class Outer {
    int outer_x = 100;


    void show_y() {
        // This will cause a compile-time error
        //System.out.println(y); // Error: cannot find symbol 'y'
    }
    
    class Inner {
        int y = 10; // Cannot be used outside the class Inner
        void display() {
            // Accessing outer class variable is allowed
            System.out.println(outer_x);
        }
    }
}