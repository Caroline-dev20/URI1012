package area;

public class Trapezium {

	private double lBase;
	private double sBase;
	private double height;
	
	public Trapezium(double lBase, double sBase, double height) {
		this.lBase = lBase;
		this.sBase = sBase;
		this.height = height;
	}
	
	public double getlBase() {
		return lBase;
	}
	public void setlBase(double lBase) {
		this.lBase = lBase;
	}
	public double getsBase() {
		return sBase;
	}
	public void setsBase(double sBase) {
		this.sBase = sBase;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getAreaTrapeze() {
		return ((lBase + sBase)*height)/2;
	}
	
	
}
