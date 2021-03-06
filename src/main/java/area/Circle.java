package area;

public class Circle extends Shape {
	
	final private double Pi = 3.14159;
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Pi * Math.pow(radius, 2);
	}
}
