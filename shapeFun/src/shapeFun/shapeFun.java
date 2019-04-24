package shapeFun;

import java.util.ArrayList;

public class shapeFun {

	public static void main(String[] args) {
		ArrayList<Shape> shapeList = new ArrayList<> ();
		Shape myShape = new Shape(1, "SomeShape");
		Rectangle myRectangle = new Rectangle(2, "Rectangle 1");
		Square mySquare = new Square(3,"Square 1");
		
		shapeList.add(myShape);
		shapeList.add(myRectangle);
		shapeList.add(mySquare);
		
		System.out.println(myShape);
		System.out.println(myRectangle);
		System.out.println(mySquare);
		
		mySquare.setWidth(5);
		
		System.out.printf("Area of %s = %1.2f \n", mySquare.getName(), mySquare.area());
		
		for (Shape shape : shapeList) {
			System.out.println(shape);
		}
	}
}
