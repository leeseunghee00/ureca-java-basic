package chapter03.section01;

public class IncDecOperationExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;

		// x++;
		// ++x;
		// System.out.println("x: " + x);		// 12
		// System.out.println("x: " + x++);	// 12
		// System.out.println("x: " + ++x);	// 14

		if (++x == 10 && ++y == 10) {
			System.out.println("1");
			System.out.printf("x = %d, y = %d", x, y);
		} else {
			System.out.println("2");
			System.out.printf("x = %d, y = %d", x, y);
		}
	}
}
