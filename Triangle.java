// extend 3 side polygon to triangle and assigns base formulas for perimeter and area
public class Triangle implements Polygon {
	protected double a;
	protected double b;
	protected double c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double area() {
		// Law of cosines find angle between sides a and b
		double cosC = (a * a + b * b - c * c) / (2 * a * b);
		double sinC = Math.sqrt(1 - cosC * cosC);

		return 0.5 * a * b * sinC;
	}

	@Override
	public double perimeter() {
		return a+b+c;
	}

}
