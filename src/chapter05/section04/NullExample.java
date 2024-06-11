package chapter05.section04;

public class NullExample {

	// NullPointerException (RuntimeException)
	public static void main(String[] args) {
		String str1 = null;
		System.out.println(str1);
		// System.out.println(str1.length());	// NPE (컴파일 때 확인하지 않음)

		String str2 = new String("Hello");
		System.out.println(str2);
		System.out.println(str2.length());
	}
}
