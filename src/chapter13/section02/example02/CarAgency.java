package chapter13.section02.example02;

public class CarAgency implements Rentable<Car>{

	@Override
	public Car rent() {
		return new Car();
	}
}
