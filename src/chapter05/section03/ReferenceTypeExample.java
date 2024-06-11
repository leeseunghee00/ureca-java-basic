package chapter05.section03;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		System.out.println(num1 == num2);	// false

		// new: 힙 영역이 새로 생성된다
		String str1 = new String("Hello");
		String str2 = new String("Hello");

		System.out.println(str1 == str2);	// false
		System.out.println(str1.equals(str2));	// true

		// literal string
		String str3 = "Hello";
		String str4 = "Hello";

		System.out.println(str3 == str4);	// true
	}
}
