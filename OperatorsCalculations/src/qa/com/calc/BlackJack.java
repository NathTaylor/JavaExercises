package qa.com.calc;

public class BlackJack {
	public static void main(String[] args) {
		System.out.println(jackBlack(22, 23));
	}

	public static int jackBlack(int num1, int num2) {
		if (num1 > 21 && num2 > 21) {
			return 0;
		} else {
			if (num1 > num2) {
				if (num1 > 21) {
					return num2;
				} else {
					return num1;
				}
			} else {
				if (num2 > num1) {
					return num1;
				} else {
					return num2;
				}
			}
		}
	}
}