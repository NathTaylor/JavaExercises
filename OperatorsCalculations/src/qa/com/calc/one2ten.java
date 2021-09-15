package qa.com.calc;

public class one2ten {

	public static void main(String[] args) {
		onebyone();

	}

	public static void onetoten() {
		for (int i = 0; i < 11; i++) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			System.out.println(5);
			System.out.println(6);
			System.out.println(7);
			System.out.println(8);
			System.out.println(9);
			System.out.println(10);

		}
	}

	public static void onebyone() {
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < i; j++)
				System.out.println(i);
		}
	}
}
