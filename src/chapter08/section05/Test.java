package chapter08.section05;

public class Test {

	public static void main(String[] args) {
		RemoteControl rc = new Television();

		rc.turnOn();
		rc.setVolume(-10);

		rc = new Audio();

		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();

		rc.setMute(true);
		rc.setMute(false);
	}
}
