package slide24;

final class MyClass { // class final, prevents inheritance
    final int x = 3; // variable final, read only 
    public static final double PI = 3.14159;
    final double getPI() { // method final, can not be overridden
        return PI;
    }
}