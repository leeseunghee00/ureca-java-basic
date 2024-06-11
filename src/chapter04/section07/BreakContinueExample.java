package chapter04.section07;

public class BreakContinueExample {

	public static void main(String[] args) {
		// #1 5일때 종료
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}

			System.out.println(i);
		}

		// #2 5일때 넘어가기
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

		// #3 5일때 빈 줄 만들기
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 5) {
					continue;
				}
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
	}
}
