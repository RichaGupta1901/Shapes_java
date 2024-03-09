//abstract class for Shape
public abstract class Shape {

	// Non-abstract method
	void showShape(String shape) {
		System.out.println("Shape: " + shape);
	}

	// Abstract methods for area and perimeter
	public abstract double calculateArea();

	public abstract double calculatePerimeter();
}
