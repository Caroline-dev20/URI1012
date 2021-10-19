package area;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		double a = key.nextDouble();
		double b = key.nextDouble();
		double c = key.nextDouble();
		
		key.close();
		
		Triangle t1 = new Triangle(a, c);
		System.out.printf("TRIANGULO: %.3f%n",t1.getAreaTriangle());
		
		Circle c1 = new Circle(c);	
		System.out.printf("CIRCULO: %.3f%n",c1.getAreaCircle());
		
		Trapezium trap = new Trapezium(a, b, c);	
		System.out.printf("TRAPEZIO: %.3f%n",trap.getAreaTrapeze());
		
		Square s1 = new Square(b);
		System.out.printf("QUADRADO: %.3f%n",s1.getAreaSquare());
		
		Rectangle r1 = new Rectangle(a, b);
		System.out.printf("RETANGULO: %.3f%n",r1.getAreaRectangle());		
	
	}		
}


