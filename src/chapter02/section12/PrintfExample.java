package chapter02.section12;

public class PrintfExample {

	public static void main(String[] args) {
		int value1 = 123;
		int value2 = 2024;

		// %10d : 앞 포함 10자리
		System.out.printf("상품의 가격: %10d, 생산일자: %d\n", value1, value2);
		// $-10d : 뒤 포함 10자리
		System.out.printf("상품의 가격: %-10d, 생산일자: %d\n", value1, value2);

		double pi = 3.141592;
		// %10.2f : 앞 포함 10자리 & 소숫점 둘째자리까지
		System.out.printf("현재 파이: %10.2f", pi);
	}
}
