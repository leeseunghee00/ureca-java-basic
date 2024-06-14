package chapter12.section04;

public class NanoTimeExample {

	public static void main(String[] args) {
		// 수행 시간 START
		long time1 = System.nanoTime();

		// 수행 코드
		int sum = 0;

		for (int i = 0; i < 1_000_000; i++) {
			sum	+= i;
		}

		// 수행 시간 END
		long time2 = System.nanoTime();

		System.out.println("sum: " + sum);
		System.out.println("nano time 기준 소요시간: " + (time2 - time1));
	}
}
