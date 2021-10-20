package area;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		double a = key.nextDouble();
		double b = key.nextDouble();
		double c = key.nextDouble();
		
		key.close();
		
		Shape [] shapes = {new Triangle(a, c),new Circle(c),new Trapezium(a, b, c),new Square(b),new Rectangle(a, b)};
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.printf("AREA: %.3f%n",shapes[i].getArea());
		}
	}		
}


