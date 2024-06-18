package chapter18.section08;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class DataInputOutputExample2 {

	public static void main(String[] args) throws Exception {
		try	(
			InputStream is = new FileInputStream("primitive.db");
			DataInputStream dis = new DataInputStream(is);
		) {
			for (int i = 0; i < 2; i++) {
				System.out.println(dis.readUTF());
				System.out.println(dis.readDouble());
				System.out.println(dis.readInt());
				System.out.println();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
