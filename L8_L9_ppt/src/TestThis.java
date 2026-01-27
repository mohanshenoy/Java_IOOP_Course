class TestThis {
    void method1() {
        System.out.println("Method 1");
        this.method2();
    }
    void method2() {
        System.out.println("Method 2");
    }
    public static void main(String[] args) {
        TestThis obj = new TestThis();
        obj.method1();
    }
}