public class Circle extends Shape {
	private double radius;

	// Setter for Radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Getter for Radius
	public double getRadius() {
		return radius;
	}

	// Calculate Area
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	// Calculate Perimeter
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
}
