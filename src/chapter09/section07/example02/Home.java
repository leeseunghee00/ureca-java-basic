package chapter09.section07.example02;

public class Home {

	private RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("익명 인터페이스 turn ON");
		}
	};

	public void use() {
		rc.turnOn();
	}

	public void use2(RemoteControl rc) {
		rc.turnOn();
	}
}
