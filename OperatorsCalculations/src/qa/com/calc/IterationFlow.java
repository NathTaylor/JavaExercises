package qa.com.calc;

public class IterationFlow {

	public static int A;

	public static void main(String[] args) {
      iterationflow2();
	}

	public static void iterationflow1() {
		for (int A = 100; A <= 200; A++) {

			System.out.println(A);
		}
	}
	
	public static void iterationflow2() {
		for (int A = 100; A<= 200; A++) {
			if (A % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
}
