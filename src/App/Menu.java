package App;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

import Data.Rectangle;
import Data.Triangle;
import Data.Circle;

public class Menu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		int option = 0;
		final String ERRMSG = "Wrong value!";
		final String TODO = "TODO";
		final String EXITMSG = "Good bye!";
		boolean exit = false;
		double a;
		double h;
		double r;

		do {
			try {
				System.out.println("Choose option");
				System.out.println("1 - Calculate rectangle perimeter");
				System.out.println("2 - Calculate rectangle area");
				System.out.println("3 - Calculate triangle perimeter");
				System.out.println("4 - Calculate triangle area");
				System.out.println("5 - Calculate circle perimeter");
				System.out.println("6 - Calculate circle area");
				System.out.println("7 - Exit");

				option = input.nextInt();

				switch (option) {
				case 1:
					System.out.println("Value of rectangle side: ");
					a = input.nextDouble();
					Rectangle rectanglePerimeter = new Rectangle(a);
					System.out.println("Rectangle perimeter is: " + rectanglePerimeter.calculatePerimeter());
					input.nextLine();
					break;
				case 2:
					System.out.println("Value of rectangle side: ");
					a = input.nextDouble();
					Rectangle rectangleArea = new Rectangle(a);
					System.out.println("Rectangle area is: " + rectangleArea.calculateArea());
					input.nextLine();
					break;
				case 3:
					System.out.println("Value of triangle side: ");
					a = input.nextDouble();
					System.out.println("Value of triangle height: ");
					h = input.nextDouble();
					Triangle trianglePerimeter = new Triangle(a,h);
					System.out.println("Value of Triangle Perimeter is: " + trianglePerimeter.calculatePerimeter());
					input.nextLine();
					break;
				case 4:
					System.out.println("Value of triangle side: ");
					a = input.nextDouble();
					System.out.println("Value of triangle height: ");
					h = input.nextDouble();
					Triangle triangleArea = new Triangle(a,h);
					System.out.println("Value of Triangle Perimeter is: " + triangleArea.calculateArea());
					input.nextLine();
					break;
				case 5:
					System.out.println("Value of circle radius: ");
					r = input.nextDouble();
					Circle circlePerimeter = new Circle(r);
					System.out.println("Circle perimeter is: " + circlePerimeter.calculatePerimeter());
					input.nextLine();
					break;
				case 6:
					System.out.println("Value of circle radius: ");
					r = input.nextDouble();
					Circle circleArea = new Circle(r);
					System.out.println("Circle area is: " + circleArea.calculateArea());
					input.nextLine();
					break;
				case 7:
					System.out.println(EXITMSG);
					exit = true;
					break;
				default:
					System.err.println(ERRMSG);
				}
			} catch (InputMismatchException ex) {
				System.err.println("Only whole numbers allowed! Program terminated");
				exit = true;
			}
		} while (exit == false);

		input.close();
	}

}
