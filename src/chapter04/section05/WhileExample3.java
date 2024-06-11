package chapter04.section05;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		int speed = 0;

		do {
			System.out.println("------------------------");
			System.out.println("1: 증속 | 2: 감속 | 3. 중지");
			System.out.print("선택: ");

			int num = sc.nextInt();

			if (num == 1) {
				speed++;
				System.out.println("현재 속도: " + speed);
			} else if (num == 2) {
				speed--;
				System.out.println("현재 속도: " + speed);
			} else if (num == 3) {
				run = false;
			}
		} while (run);

		System.out.println("종료");
	}
}
