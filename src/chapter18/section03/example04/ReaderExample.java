package chapter18.section03.example04;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) throws Exception {
		// 문자
		Reader reader = new FileReader("test.txt");

		// while (true) {
		// 	int data = reader.read();
		//
		// 	if (data == -1) {
		// 		break;
		// 	}
		//
		// 	System.out.println((char) data);	// 숫자 (문자의 정수 표현) 대신 문자로 표현하기 위한 Casting
		// }

		char[] data = new char[100];
		int num = reader.read(data);

		for (int i = 0; i < num; i++) { {
			System.out.println(data[i]);
		}
		}
	}
}
