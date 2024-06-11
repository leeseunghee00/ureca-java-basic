package chapter02.section08;

public class CastingExample {

	public static void main(String[] args) {
		int var1 = 10000;
		byte var2 = (byte) var1;
		System.out.println(var2);

		int var3 = 65;
		char var4 = (char) var3;
		System.out.println(var4);

		double var5 = 3.141592;
		int var6 = (int) var5;
		System.out.println(var6);

		// 연산식에서 자동 타입 변환
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = 10 + 20;
		int b4 = b1 + b2;	// int 로 자동 형변환
	}
}
