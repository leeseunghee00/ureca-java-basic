package chapter08.section08;

public class Test {

	public static void main(String[] args) {

		RemoteControl rc = new SmartTelevision();

		rc.turnOff();
		rc.turnOn();

		Searchable sch = new SmartTelevision();

		sch.search("channel");
	}
}
