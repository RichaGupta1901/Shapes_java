public class Sphere extends Shape implements Volume {

	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	// Calculate Volume
	public double calculateVolume() {
		return 4 / 3 * Math.PI * Math.pow(radius, 3);
	}

	// Calculate Area
	public double calculateArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}

	// Calculate Perimeter
	public double calculatePerimeter() {
		return 0.0;
	}
}
