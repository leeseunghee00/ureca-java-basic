package chapter12.section07;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// Math.random()
		Random random = new Random(3);	// seed: 3이 포함된 값 랜덤 추출

		// java.utils.Random 객체
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(3));	// bound: 1~3 사이의 값
		}
	}
}
