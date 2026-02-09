class ThisConstructor {
    ThisConstructor() {
        this(5);
        System.out.println("Default constructor");
    }
    ThisConstructor(int x) {
        System.out.println("Parameterized constructor: " + x);
    }
    public static void main(String[] args) {
        new ThisConstructor();
    }
}