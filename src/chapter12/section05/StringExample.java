package chapter12.section05;

import java.util.StringTokenizer;

public class StringExample {

	public static void main(String[] args) {

		/* StringBuilder */
		StringBuilder sb = new StringBuilder();

		// old style
		// sb.append("Hello ");
		// sb.append("World ");
		// sb.append("AAA");

		// current style
		sb.append("Hello ").append("World ").append("ABC");

		System.out.println(sb);

		// 반복문
		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < 10; i++) {
			String str = i + " ";
			ans.append(str);
		}

		System.out.println(ans);

		/* StringTokenizer */
		String str = "고길동, 이길동, 홍길동";
		StringTokenizer st = new StringTokenizer(str, ", ");

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

		int N = 5;
		String input = "1 2 3 4 5";
		StringTokenizer st2 = new StringTokenizer(input);

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st2.nextToken());
			System.out.println(num);
		}
	}
}
