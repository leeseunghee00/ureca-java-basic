package chapter06.section13.example03.package1;

public class B {

	public void method1() {
		A a = new A();

		a.field1 = 2;
		a.field2 = 3;
		// a.field3 = 4;	// private

		a.method1();
		a.method2();
		// a.method3();		// private
	}
}
