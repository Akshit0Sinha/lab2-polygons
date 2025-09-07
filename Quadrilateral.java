//general defintion for 4 sides shapes for perimeter and area from base definition of Polygon
public class Quadrilateral implements Polygon {
	protected double a;
	protected double b;
	protected double c;
	protected double d;

	public Quadrilateral(double a, double b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	// we define other types of quadrilaterals that will be required, so no need to
	// address logic to general quadrilateral area formula
	public double area() {
		return 0;
	}

	@Override
	public double perimeter() {
		return a + b + c + d;
	}

}
