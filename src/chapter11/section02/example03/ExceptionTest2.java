package chapter11.section02.example03;

public class ExceptionTest2 {

	public static void main(String[] args) {
		String[] array = {"100", "200"};

		for (int i = 0; i <= array.length; i++) {
			try {
				String s = null;
				s.length();

				int value = Integer.parseInt(array[i]);
				System.out.println(value);
			} catch (Exception ex) {
				System.out.println("기타 예외 발생");
			}
			// catch (ArrayIndexOutOfBoundsException | NumberFormatException ex) {	// error: 위에 catch 되는 예외가 상위클래스이기 때문
			// 	ex.printStackTrace();
			// }
		}
	}
}
