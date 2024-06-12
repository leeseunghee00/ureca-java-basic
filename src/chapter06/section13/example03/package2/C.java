package chapter06.section13.example03.package2;

import chapter06.section13.example03.package1.A;

public class C {

	public void method1() {
		chapter06.section13.example03.package1.A a = new A();

		a.field1 = 2;
		// a.field2 = 3;	// default
		// a.field3 = 4;	// private

		a.method1();
		// a.method2();		// default
		// a.method3();		// private
	}
}
