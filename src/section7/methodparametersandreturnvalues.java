package section7;

public class methodparametersandreturnvalues {

	public static void main(String[] args) {
		System.out.println("area of rectangle with length = 5.4" + "and width 3.2:" + arearectangle(5.4, 3.2));
//double area = arearectangle(5.4, 3.2);
//system.out.println(area);
	}

	public static double arearectangle(double length, double width) {
		return length * width;
	}

}
