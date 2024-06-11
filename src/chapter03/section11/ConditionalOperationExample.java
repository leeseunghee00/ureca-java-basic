package chapter03.section11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// 90 초과 : A
		// 81 ~ 90 : B
		// 나머지 : C

		int score = 95;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');

		System.out.println(grade);
	}
}
