package section7;

public class methodoverloading {

	public static void main(String[] args) {
		System.out.println("area of rectangle: " + area(14.25d, 10.65d));
		System.out.println("area of square: " + area(5.0d));

	}

	public static double area(double length, double width) {
		return length * width;
	}

	public static double area(double side) {
		return side * side;
	}

	public static int area(int side) {
		return side * side;
	}

}
