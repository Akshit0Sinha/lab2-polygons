//general umbrella term for all types of shapes in total, 3 or 4+ sides
public abstract class RegularPolygon implements Polygon {
	protected int noSides;
	protected double sideLength;

	public RegularPolygon(int noSides, double sideLength) {
		this.noSides = noSides;
		this.sideLength = sideLength;
	}

	@Override
	public double area() {
		return noSides * sideLength * sideLength / (4 * Math.tan(Math.PI / noSides));
	}

	@Override
	public double perimeter() {
		return noSides * sideLength;
	}
}
