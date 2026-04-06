class RethrowExample2 {
    static void divide() {
        try {
            int result = 10 / 0; // causes ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("divide() caught: " + e);
            throw e; // rethrowing the same exception
        }
    }
    public static void main(String[] args) {
        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println("main caught: " + e);
        }
    }
}