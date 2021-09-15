package qa.com.calc;

public class BoolFlow {

	public static void main(String[] args) {
		boolflow(5, 6, true);
	}

	public static void boolflow(int int1, int int2, boolean myBool) {
		if (myBool) {
			System.out.println(int1 + int2);
		} else {
			System.out.println(int1 * int2);
		}
	}

}
