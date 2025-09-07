
//output UI for user
import java.util.Scanner;
public class PolygonCalculator {

	private static double getDouble(Scanner in) {
		while (true) {
			if (in.hasNextDouble()) {
				return in.nextDouble();
			} else {
				System.out.println("Invalid input. Please enter a number:");
				in.next(); // consume invalid token
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Polygon p = null;
		int response = -1;

		// scanner use
		while (true) {
			System.out.println("Choose a Polygon:\n" + "1. Rectangle\n2. Square\n3. Pentagon\n4. Hexagon\n5. Octagon\n"
					+ "6. Triangle\n7. Isosceles Triangle\n8. Equilateral Triangle\n9. Quadrilateral");
			if (in.hasNextInt()) {
				response = in.nextInt();
				if (response >= 1 && response <= 9) {
					break;
				} else {
					System.out.println("Invalid number. Please enter 1-9.");
				}
			} else {
				System.out.println("Invalid input. Please enter a number.");
				in.next();
			}
		}
		double side1 = 0, side2 = 0, side3 = 0, side4 = 0;

		// calling all different types of shapes once chosen from first response to
		// calculate perimeter and area
		switch (response) {
		case 1:
			// Rectangle
			System.out.println("Enter length and width:");
			side1 = getDouble(in);
			side2 = getDouble(in);
			p = new Rectangle(side1, side2);
			break;

		case 2:
			// Square
			System.out.println("Enter side:");
			side1 = getDouble(in);
			p = new Sqaure(side1);
			break;

		case 3:
			// Pentagon
			System.out.println("Enter side:");
			side1 = getDouble(in);
			p = new Pentagon(side1);
			break;

		case 4:
			// Hexagon
			System.out.println("Enter side:");
			side1 = getDouble(in);
			p = new Hexagon(side1);
			break;

		case 5:
			// Octagon
			System.out.println("Enter side:");
			side1 = getDouble(in);
			p = new Octagon(side1);
			break;

		case 6:
			// Triangle
			System.out.println("Enter sides a, b, c:");
			side1 = getDouble(in);
			side2 = getDouble(in);
			side3 = getDouble(in);
			p = new Triangle(side1, side2, side3);
			break;

		case 7:
			// Isosceles Triangle
			System.out.println("Enter equal side and base:");
			side1 = getDouble(in);
			side2 = getDouble(in);
			p = new IsoscelesTriangle(side1, side2);
			break;

		case 8:
			// Equilateral Triangle
			System.out.println("Enter side:");
			side1 = getDouble(in);
			p = new EquilateralTriangle(side1);
			break;

		case 9:
			// Quadrilateral
			System.out.println("Enter sides a, b, c, d:");
			side1 = getDouble(in);
			side2 = getDouble(in);
			side3 = getDouble(in);
			side4 = getDouble(in);
			p = new Quadrilateral(side1, side2, side3, side4);
			break;
		}

		// throws area and perimeter
		if (p != null) {
			System.out.printf("Perimeter: %.2f%n", p.perimeter());
			// for quadrilateral exception
			try {
				System.out.printf("Area: %.2f%n", p.area());
			} catch (UnsupportedOperationException e) {
				System.out.println(e.getMessage());
			}
		}

		in.close();
	}

}
