package chapter02.section10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {

		// String str = "10z";		// 숫자가 아닌 값이 들어갈 경우 -> java.lang.NumberFormatException 발생
		String str1 = "10";
		int value1 = Integer.parseInt(str1);
		System.out.println(value1);

		String str2 = String.valueOf(value1);
		System.out.println(str2);
	}
}
