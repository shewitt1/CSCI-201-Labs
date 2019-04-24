package shapeFun;

public class Square extends Rectangle{

	public Square(int id, String name) {
		super(id, name);
		setWidth(0);
		setLength(0);
	}

	public void setWidth(double width) {
		super.setWidth(width);
		super.setLength(width);
	}
	
	public void setLength(double length) {
		super.setWidth(length);
		super.setLength(length);
	}
}
