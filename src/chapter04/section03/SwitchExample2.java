package chapter04.section03;

public class SwitchExample2 {

	// lambda 처럼 화살표를 사용해서 구현
	public static void main(String[] args) {
		char ch = 'B';

		switch (ch) {
			case 65 -> System.out.println("A");
			case 66 -> System.out.println("B");
			case 'C'-> System.out.println("C");
		}
	}
}
