package chapter18.section10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("member.data");
		ObjectOutputStream oos = new ObjectOutputStream(os);

		Member member1 = new Member("id", "홍길동", "111111-2222222");

		oos.writeObject(member1);

		oos.flush();
		oos.close();
		os.close();

		InputStream is = new FileInputStream("member.data");
		ObjectInputStream ois = new ObjectInputStream(is);

		Member member2 = (Member) ois.readObject();

		System.out.println(member2);

		ois.close();
	}
}
