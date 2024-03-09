public class Pyramid extends Shape implements Volume {

	private double baseEdgeLength;
	private double slantHeight;

	public double getBaseEdgeLength() {
		return baseEdgeLength;
	}

	public void setBaseEdgeLength(double baseEdgeLength) {
		this.baseEdgeLength = baseEdgeLength;
	}

	public double getSlantHeight() {
		return slantHeight;
	}

	public void setSlantHeight(double slantHeight) {
		this.slantHeight = slantHeight;
	}

	// Calculate Volume
	public double calculateVolume() {
		return (1.0 / 3.0) * Math.pow(baseEdgeLength, 2) * slantHeight;
	}

	// Calculate Area
	public double calculateArea() {
		return Math.pow(baseEdgeLength, 2) + 2 * baseEdgeLength * slantHeight;
	}

	// Calculate Perimeter
	public double calculatePerimeter() {
		return 0.0;
	}

}
