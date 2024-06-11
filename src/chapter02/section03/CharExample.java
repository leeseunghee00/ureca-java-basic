package chapter02.section03;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;	// unicode

		// byte b1 = 65;
		// char c3 = b1;	// type error

		char c3 = '가';
		char c4 = 44032;
		char c나 = '나';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c나);
	}
}
