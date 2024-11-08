package chapter02.section07;

public class PromotionExample {

	public static void main(String[] args) {
		byte b1 = 10;
		int i1 = b1;	// 자동 형변환: byte -> int
		System.out.println(i1);

		char c1 = '가';
		int i2 =c1;		// 자동 형변환: char -> int
		System.out.println(i2);

		int i3 = 100;
		long l1 = i3;	// 자동 형변환: int -> long
		System.out.println(l1);

		float f1 = 100.0F;
		double d1 = f1;	// 자동 형변환: float -> double
		System.out.println(d1);

		float f2 = i3;	// 자동 형변환: int -> float
		System.out.println(f2);
	}
}
