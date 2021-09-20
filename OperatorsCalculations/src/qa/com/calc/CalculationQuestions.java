package qa.com.calc;

public class CalculationQuestions {

	public static void main(String[] args) {
		System.out.println(mySum(2, 5));
		System.out.println(myTimes(2, 5));
		System.out.println(mySubtract(2, 5));
		System.out.println(myDivide(2.0, 5.0));
	}

	public static int mySum(int myInt1, int myInt2) {
		return (myInt1 + myInt2);

	}

	public static int myTimes(int myInt1, int myInt2) {
		return (myInt1 * myInt2);
	}

	public static int mySubtract(int myInt1, int myInt2) {
		return (myInt1 - myInt2);
	}

	public static double myDivide(double myDoub1, double myDoub2) {
		return(myDoub1/myDoub2);
    }
}