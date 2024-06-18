package chapter13.section02.example02;

public class GenericExample {

	public static void main(String[] args) {
		Rentable<Home> homeAgency = new HomeAgency();
		Home home = homeAgency.rent();

		Rentable<Car> carAgency = new CarAgency();
		Car car = carAgency.rent();
	}
}
