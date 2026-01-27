
public class Slide33_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

class Complex {
    double real;
    double imaginary;

    public Complex(double r, double i) {
        this.real = r;
        this.imaginary = i;
    }

    public void display() {
        System.out.println(real + " + i" + imaginary);
    }
}

class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(5.5, 4.0);
        c1.display();
    }
}