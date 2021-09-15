package qa.com.calc;

public class UniqueSum {

	public static void main(String[] args) {
		uniqueSum(5,5,3);

	}

	public static int uniqueSum(int num1, int num2, int num3) {
		if (num1 == num2 | num1 == num3) {
			return 0;
			if (num2 == num3) {
				return 0;
			} else {
				return (num1 + num2 + num3);
			  }
			}
		}
	}
}
