package slide21;

class Calculator {
    void calculateSquare(int number) {
        class Square {
            int getSquare() {
                return number * number;
            }
        }
        Square square = new Square();
        System.out.println("Square of " + number + " is: " + square.getSquare());
    }
}
public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.calculateSquare(5);
    }
}