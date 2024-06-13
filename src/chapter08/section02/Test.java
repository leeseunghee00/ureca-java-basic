package chapter08.section02;

public class Test {

	public static void main(String[] args) {
		RemoteControl rc = getRemoteControl("audio");
		rc.turnOn();

		RemoteControl rc2 = getRemoteControl("tv");
		rc2.turnOn();
	}

	public static RemoteControl getRemoteControl(String clsf) {
		if (clsf.equals("audio")) {
			return new Audio();
		} else if (clsf.equals("tv")) {
			return new Television();
		}

		return null;
	}
}
