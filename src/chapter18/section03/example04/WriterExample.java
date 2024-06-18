package chapter18.section03.example04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) throws Exception {
		// 문자
		Writer writer = new FileWriter("test.txt");

		// char 단일 문자
		char a = 'A';
		char b = 'B';
		char c = 'C';

		writer.write(a);
		writer.write(b);
		writer.write(c);

		// char 배열
		char[] array = {'D', 'E', 'F'};

		writer.write(array);

		// 문자열
		writer.write("G");

		writer.flush();
		writer.close();
	}
}
