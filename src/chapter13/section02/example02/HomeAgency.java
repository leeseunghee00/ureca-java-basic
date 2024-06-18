package chapter13.section02.example02;

public class HomeAgency implements Rentable<Home> {

	@Override
	public Home rent() {
		return new Home();
	}
}
