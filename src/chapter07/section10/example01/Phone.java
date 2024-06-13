package chapter07.section10.example01;

public abstract class Phone {

	String owner;

	Phone (String owner) {
		this.owner = owner;
	}

	abstract void turnOn();

	void turnOff() {
		System.out.println("전원 OFF");
	}
}
