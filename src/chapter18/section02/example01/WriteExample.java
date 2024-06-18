package chapter18.section02.example01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {

		try	{
			OutputStream os = new FileOutputStream("test1.db");

			byte a = 10;
			byte b = 20;
			byte c = 30;

			os.write(a);
			os.write(b);
			os.write(c);

			os.flush();		// buffer 비우기
			os.close();		// memory 반납

		} catch (IOException ex) {
			System.out.println(ex);
		}

	}
}
