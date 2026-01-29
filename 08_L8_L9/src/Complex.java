 public class Complex {
    double real;
    double imaginary;

    public Complex(double r, double i) {
        this.real = r;
        this.imaginary = i;
    }

    public void display() {
        System.out.println(real + " + i" + imaginary);
    }

   public static void main(String[] args) {
        Complex c1 = new Complex(5.5, 4.0);
        c1.display();
    }
}