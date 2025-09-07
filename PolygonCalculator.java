
//output UI for user
import java.util.Scanner;
public class PolygonCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Polygon p = null;
		// scanner use
		System.out.println(
				"Choose a Polygon: 1. Rectangle, 2. Square, 3. Pentagon, 4. Hexaogn, 5. Octagon, 6. Triangle, 7. Isosceles Triangle, 8. Equilatral Triangle, 9. Quadrilateral");
		int response = in.nextInt();
		// calling all different types of shapes once chosen from first response to
		// calculate perimeter and area
		switch (response) {
		case 1:
			System.out.print("Enter a length and width:");
			p = new Rectangle(in.nextDouble(), in.nextDouble());
			break;
		case 2:
			System.out.print("Enter a side:");
			p = new Sqaure(in.nextDouble());
			break;
		case 3:
			System.out.print("Enter a side:");
			p = new Pentagon(in.nextDouble());
			break;

		case 4:
			System.out.print("Enter a side:");
			p = new Hexagon(in.nextDouble());
			break;
		case 5:
			System.out.print("Enter a side:");
			p = new Octagon(in.nextDouble());
			break;
		case 6:
			System.out.print("Enter sides a, b, c: ");
			p = new Triangle(in.nextDouble(), in.nextDouble(), in.nextDouble());
			break;
		case 7:
			System.out.print("Enter the values for the equal side and base: ");
			p = new IsoscelesTriangle(in.nextDouble(), in.nextDouble());
			break;
		case 8:
			System.out.print("Enter side: ");
			p = new EquilateralTriangle(in.nextDouble());
			break;
		case 9:
			System.out.print("Enter sides a, b, c, and d:");
			p = new Quadrilateral(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			break;
		default:
			System.out.println("Invalid, respond again");
		}
		// throws area and perimeter
		if (p != null) {
			System.out.printf("Perimeter: %.2f%n", p.perimeter());
			System.out.printf("Area: %.2f%n", p.area());
		}

		in.close();
	}

}
