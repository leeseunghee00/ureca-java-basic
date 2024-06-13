package chapter07.section05.sub;

import chapter07.section05.Parent;

public class SubChild extends Parent {

	public static void main(String[] args) {
		Parent parent = new Parent();

		parent.m2();
		// parent.m3();
	}

	public void m5() {
		m1();
		m3();
		// m4();
	}
}
