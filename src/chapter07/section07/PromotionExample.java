package chapter07.section07;

public class PromotionExample {

	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new C();
		B b3 = new D();
		// B b4 = new A();	// 자식이 부모를 품을 수 없다.

		C c1 = new D();
	}
}

class A {}

class B extends A {}

class C extends B {}

class D extends C {}
