package chapter07.section08.example02;

public class Driver {

	public void drive(Vehicle vehicle) {
		System.out.println("drive Vehicle");
		vehicle.run();
	}

	public void drive(Bus bus) {
		System.out.println("drive Bus");
		bus.run();
	}
}
