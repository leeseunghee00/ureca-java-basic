package chapter06.section06;

public class MyClass {
	/* field */
	int n;
	int n2 = 10;
	String s;
	String s2 = new String("Hello");

	/* constructor */
	public MyClass() {}

	public MyClass(int n) {
		this.n = n;
	}

	public MyClass(int n, int n2, String s, String s2) {
		this.n = n;
		this.n2 = n2;
		this.s = s;
		this.s2 = s2;
	}

	/* method */
	public void m1() {
		System.out.println(this.n + this.n2);
	}

	public void m1(String message) {
		if (message.equals("quit")){
			return;
		}

		System.out.println(message + this.s2);
	}

	public boolean m2() {
		return this.n > 4;
	}
}
