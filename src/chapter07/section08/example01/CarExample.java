package chapter07.section08.example01;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		// car.tire = new HankookTire();
		car.tire = new KumhoTire();

		car.run();
	}
}
