package chapter12.section07;

public class MathExample {

	public static void main(String[] args) {
		// min, max, abs
		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println(Math.min(a, b));
		System.out.println(Math.max(a, Math.max(b, c)));

		int x1 = 20;
		int y1 = 100;
		int x2 = 50;
		int y2 = 100;

		// 맨하턴 거리 공식
		int distance = Math.abs(y2 - y1) + Math.abs(x2 - x1);

		System.out.println(distance);

	}
}
