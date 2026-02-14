package animals;

public class ShapeDemo {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.rotate();
		circle.playSound();

		System.out.println("");
		
		Square square = new Square();
		square.rotate();
		square.playSound();

		System.out.println("");
		
		Triangle triangle = new Triangle();
		triangle.rotate();
		triangle.playSound();
		
		System.out.println("");
		
		Amoeba amoeba = new Amoeba();
		amoeba.rotate();
		amoeba.playSound();		
		
	}

}
