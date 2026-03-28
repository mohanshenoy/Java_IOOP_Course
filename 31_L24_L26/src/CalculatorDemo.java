

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("--- Classpath Demo ---");
        System.out.println("10 + 5 = " + calc.add(10, 5));
        System.out.println("10 / 2 = " + calc.divide(10, 2));
    }
}