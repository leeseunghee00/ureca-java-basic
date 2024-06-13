package chapter09.section07.example01;

public class Car {

	// field
	private Tire tire1 = new Tire();

	// 익명 자식 객체
	private Tire tire2 = new Tire() {

		@Override
		public void roll() {
			System.out.println("익명 타이어가 굴러갑니다.");
		}
	};

	public void run() {
		tire1.roll();
		tire2.roll();
	}
}
