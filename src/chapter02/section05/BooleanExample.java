package chapter02.section05;

public class BooleanExample {

	public static void main(String[] args) {
		boolean stop = true;

		if (stop) {
			System.out.println("Stop!");
		} else {
			System.out.println("Start!");
		}

		int x = 10;
		boolean result1 = (x == 20);
		boolean result2 = (x != 20);

		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
	}
}
