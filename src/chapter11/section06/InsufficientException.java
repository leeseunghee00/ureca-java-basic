package chapter11.section06;

/* 사용자 정의 예외처리 */
public class InsufficientException extends Exception {

	public InsufficientException() {
	}

	public InsufficientException(String message) {
		super(message);
	}
}
