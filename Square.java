public class Square extends Shape {
	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	// Calculate Area
	public double calculateArea() {
		return side * side;
	}

	// Calculate Perimeter
	public double calculatePerimeter() {
		return 4 * (side);
	}
}
