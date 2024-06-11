package chapter02.section13;

// 컴파일러가 자동으로 해주는 작업 #1 java.lang.package
// 그 외 작업 #2 import 패키지
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수값 입력: ");
		int input = sc.nextInt();

		System.out.println(input);
	}
}
