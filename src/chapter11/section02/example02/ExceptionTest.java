package chapter11.section02.example02;

import java.io.IOException;

public class ExceptionTest {

	// public static void main(String[] args) throws ClassNotFoundException{
	//
	// 	/* #1 main 이 jvm 에게 예외처리를 던짐 */
	// 	Class.forName("java.lang.String");
	// }

	public static void main(String[] args) {

		/* #2 try-catch-finally */
		try {
			Class.forName("java.lang.Object");
		} catch (ClassNotFoundException ex) {
			System.out.println("class 를 찾을 수 없습니다.");
		} finally {
			System.out.println("finally");
		}
	}

	public static void myMethod() throws IOException {
		// IO 처리 중 예외 발생 시 예외 처리
	}
}
