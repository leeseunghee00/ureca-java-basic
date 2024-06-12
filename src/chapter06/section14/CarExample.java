package chapter06.section14;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		car.setSpeed(-10);
		System.out.println("car.stop: " + car.isStop());
		System.out.println("car.speed: " + car.getSpeed());
	}
}
