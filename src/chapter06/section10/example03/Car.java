package chapter06.section10.example03;

public class Car {
	int speed;

	void run() {
		System.out.println(speed + "로 달린다.");
	}

	/* static block */
	static void simulate() {
		System.out.println("simulate");
	}

	public static void main(String[] args) {
		Car car = new Car();

		car.run();
		Car.simulate();
	}
}
