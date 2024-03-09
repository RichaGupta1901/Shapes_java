public class Rectangle extends Shape {

	private double length;
	private double breadth;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	// Calculate Area
	public double calculateArea() {
		return length * breadth;
	}

	// Calculate Perimeter
	public double calculatePerimeter() {
		return 2 * (length + breadth);
	}

}
