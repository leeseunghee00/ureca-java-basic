package chapter07.section04.example00;

public class Parent {

	public B m1() {
		return new B();
	}

	public void m2() throws RuntimeException{
	}
}

// ※ 재정의를 하면, 부모보다 더 넓은 예외를 사용할 수 없다.
class Child extends Parent{
	// @Override
	// public void m2() throws Exception{
	// }
}

// ※ 접근제한자를 부모보다 높일 순 없다.
// class Chid extends Parent{
// 	B m1() {
// 		return new B();
// 	}
// }

// class Child extends Parent{
// 	@Override
// 	public A m2() {
// 		return new A();
// 	}
// }
