package chapter07.section10.example01;

public class SmartPhone extends Phone {

	SmartPhone (String owner) {
		super(owner);
	}

	@Override
	void turnOn() {
		System.out.println("SmartPhone 전원 ON");
	}

	void internetSearch() {
		System.out.println("internet search");
	}
}
