package chapter18.section02.example02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {

		try	{
			InputStream is = new FileInputStream("test2.db");

			/* 읽을 갯수를 모르는 경우 */
			byte[] data = new byte[100];

			// 방법 #1
			// while (true) {
			// 	int num = is.read(data);
			//
			// 	if (num == -1)
			// 		break;
			//
			// 	for (int i = 0; i < num; i++) {
			// 		System.out.println(data[i]);
			// 	}
			// }

			// 방법 #2
			int num = is.read(data);

			for (int i = 0; i < num; i++) {
				System.out.println(data[i]);
			}

			is.close();

		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		}

	}
}
