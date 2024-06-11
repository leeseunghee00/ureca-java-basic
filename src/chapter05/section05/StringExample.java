package chapter05.section05;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		// length(): 문자열 길이
		System.out.println(str1.length());

		// charAt(): 특정 문자
		System.out.println(str2.charAt(4));

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		for (int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(i));
		}
		System.out.println();

		// replace(): 문자열 대체
		String str3 = "Hello, Java";
		String returnStr = str3.replace("ll","LL");
		System.out.println(returnStr);

		// indexOf(): 특정 문자 위치
		String str4 = "abcdefghigk";
		int idx = str4.indexOf('c');
		System.out.println(idx);

		idx = str4.indexOf("def");
		System.out.println(idx);

		if (idx == -1) {
			System.out.println("찾지 못했습니다.");
		}

		// contains(): 존재 유무
		boolean result = str3.contains("def");
		System.out.println(result);
	}
}
