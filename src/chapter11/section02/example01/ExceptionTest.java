package chapter11.section02.example01;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("예외 테스트");

		 try {
			printLength("java");

			String s = null;

			printLength(s);
		 } catch (NullPointerException npe) {
			 System.out.println(npe.getMessage());
		 } finally {
			 System.out.println("finally block");
		 }
	}

	public static void printLength(String data) {
		int length = data.length();

		System.out.println("문자수: " + length);
	}
}
