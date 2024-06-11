package chapter02.section09;

public class StringConcatExample {

	public static void main(String[] args) {
		int result1 = 10 + 2 + 8;
		System.out.println(result1);

		String result2 = 10 + 2 + "8";	// 12 + "8" = "12" + "8" = "128"
		System.out.println(result2);

		String result3 = "10" + 2 + 8;	// "10" + 2 + 8 = "102" + "8" = "1028"
		System.out.println(result3);

		String result4 = "10" + (2 + 8);	// "10" + (2 + 8) = "10" + "10" = "1010"
		System.out.println(result4);
	}
}
