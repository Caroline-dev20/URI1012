package area;

public class Rectangle {

	private double base;
	private double height;
	
	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeigth() {
		return height;
	}
	public void setHeigth(double heigth) {
		this.height = heigth;
	}
	
	public double getAreaRectangle() {
		return base * height;
	}
}
