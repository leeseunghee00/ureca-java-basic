package chapter02.section02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;		// int 값
		long var2 = 20L;	// L = long
		// long var3 = 10000000000;		// int 로 간주함 -> 에러 발생
		long var4 = 10_000_000_000L;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
