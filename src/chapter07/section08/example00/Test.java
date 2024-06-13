package chapter07.section08.example00;

public class Test {

	public static void main(String[] args) {
		// test #1
		// A a = new D();
		// a.m();
		//
		// B b = new B();
		// b.m();

		// test #2
		// A a = new A();
		// B b = new B();
		// C c = new C();
		// D d = new D();
		//
		// System.out.println(d instanceof A);
		// System.out.println(d instanceof B);
		// System.out.println(d instanceof C);
		// System.out.println(d instanceof D);

		// test #3
		// A a = getInstance();
		//
		// System.out.println(a instanceof A);
		// System.out.println(a instanceof B);
		// System.out.println(a instanceof C);
		// System.out.println(a instanceof D);

		// test #4
		A a = getInstance();

		if (a instanceof A){
			System.out.println("A");	// A
		} else if (a instanceof B) {
			System.out.println("B");
		} else if (a instanceof C) {
			System.out.println("C");
		} else if (a instanceof D) {
			System.out.println("D");
		}
	}

	public static A getInstance() {
		return new D();
	}
}

class A {
	public void m() {
		System.out.println("A m()");
	}

	public void m(int n) {
		System.out.println("A m(int n)");
	}
}

class B extends A {
	public void m() {
		System.out.println("B m()");
	}
}

class C extends B {
	public void m(int n) {
		System.out.println("C m(int n)");
	}
}

class D extends C {
	public void m() {
		System.out.println("D m()");
	}
}
