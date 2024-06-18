package chapter18.section02.example01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {

		try	{
			InputStream is = new FileInputStream("test1.db");

			/* 읽을 갯수를 알고 있는 경우 */
			byte a = (byte) is.read();
			byte b = (byte) is.read();
			byte c = (byte) is.read();

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);

			/* 읽을 갯수를 모르는 경우 */
			while (true) {
				int data = is.read();

				if (data == -1)
					break;

				System.out.println(data);
			}

			is.close();

		} catch (IOException ex) {
			System.out.println(ex);
		}

	}
}
