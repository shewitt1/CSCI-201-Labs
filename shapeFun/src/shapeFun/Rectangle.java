package shapeFun;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(int id, String name) {
		super(id, name);
		setLength(0);
		setWidth(0);
		
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double area() {
		return length * width;
	}
	
}
