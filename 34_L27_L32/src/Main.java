class Main {
    static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid age");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(-5);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
// Output: Invalid age