public class Cylinder extends Shape implements Volume {
	private double radius;
	private double height;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// Calculate Volume
	public double calculateVolume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}

	// Calculate Area
	public double calculateArea() {
		return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
	}

	// Calculate Perimeter
	public double calculatePerimeter() {
		return 0.0;
	}
}
