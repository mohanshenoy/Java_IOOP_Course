package temp9;

public class Slide19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class Complex {
    double re, im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex(Complex c) {
        System.out.println("Copy constructor called");
        re = c.re;
        im = c.im;
    }

    public void display() {
        System.out.println(re + " + " + im + "i");
    }
}

class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(c1); // Following involves a copy constructor call
        c2.display(); // same value as c1

        Complex c3 = c2; // Does not invoke copy constructor
        c3.re = 100;
        c3.display();
        c2.display();
        c1.display();
    }
}