package area;

public class Square {

	private double side;
	
	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double getAreaSquare() {
		return Math.pow(side, 2);
	}
}
