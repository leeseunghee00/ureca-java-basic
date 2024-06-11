package chapter05.section06;

import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int length = input.length();

		// 방법 #1 문자열 -> char 배열 (메모리 낭비)
		// char[] chArr = new char[length];
		//
		// for (int i = 0; i < length; i++) {
		// 	chArr[i] = input.charAt(i);
		// }

		// 방법 #2 문자열 -> char 배열 (추천)
		char[] chArr = input.toCharArray();
		for (int i = 0; i < length; i++) {
			System.out.print(chArr[i]);
		}
	}
}
