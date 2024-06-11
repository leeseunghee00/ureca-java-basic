package chapter04.section03;

public class SwitchExample1 {

	public static void main(String[] args) {
		// 정수
		int num = 1;

		switch (num) {
			case 1:
				System.out.println("1번");
				break;
			case 2:
				System.out.println("2번");
				break;
			case 3:
				System.out.println("3번");
				break;
			default:
				System.out.println("default 번");
				break;
		}

		// 문자열
		String str = "1";

		switch (str) {
			case "1":
				System.out.println("1번");
				break;
			case "2":
				System.out.println("2번");
				break;
			case "3":
				System.out.println("3번");
				break;
			default:
				System.out.println("default 번");
				break;
		}

		// 문자
		char ch = 'B';

		switch (ch) {
			case 65:
				System.out.println("A");
				break;
			case 66:
				System.out.println("B");
				break;
			case 'C':
				System.out.println("C");
				break;
			default:
				System.out.println("default 번");
				break;
		}
	}
}
