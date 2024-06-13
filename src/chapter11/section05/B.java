package chapter11.section05;

import java.io.FileNotFoundException;

public class B {

	public void mb() {
		C c = new C();

		try {
			c.mc();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			// throw new IOException();
		}
	}
}
