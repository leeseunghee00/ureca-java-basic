package chapter11.section02.example03;

public class ExceptionTest1 {

	public static void main(String[] args) {
		int[][] map = {{1, 2, 3}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		String[] array = {"100", "200"};

		for (int i = 0; i < array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);

				System.out.println(value);
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("index 오류");
			} catch (NumberFormatException ex) {
				System.out.println("숫자 문자열 오류");
			}
		}
	}
}
