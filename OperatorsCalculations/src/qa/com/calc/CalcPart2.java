package qa.com.calc;

public class CalcPart2 {

	public static void main(String[] args) {
		myDivide(6.0, 5.0);

	}

	public static void myDivide(double myDoub1, double myDoub2) {
		if (myDoub1 > myDoub2) {
			System.out.println("The Division Cannot Be Performed");
		} else {
			System.out.println(myDoub1 / myDoub2);
		}
	}

}
