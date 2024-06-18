package chapter18.section03.example03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("image.png");
		OutputStream os = new FileOutputStream("image-copy.png");

		// byte[] data = new byte[1024];
		//
		// while (true) {
		// 	int num = is.read(data);
		//
		// 	if (num == -1) {
		// 		break;
		// 	}
		//
		// 	os.write(data, 0, num);
		// }

		is.transferTo(os);	// 지정한 경로(os)에 파일을 저장한다. (주석처리 부분을 한방에 해결)

		os.flush();
		os.close();
		is.close();

	}
}
