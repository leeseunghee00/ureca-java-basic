package chapter07.section03;

public class SmartPhone extends Phone {

	public boolean wifi;
	public String color = "blue";

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public void internet() {
		System.out.println("인터넷에 연결합니다.");

		// 부모 먼저
		System.out.println(super.model);
		System.out.println(super.color);

		// 자식 먼저
		System.out.println(this.model);
		System.out.println(this.color);
	}

	public SmartPhone() {
	}

	public SmartPhone(boolean wifi) {
		super();
		this.wifi = wifi;
	}

	public SmartPhone(String model, String color, boolean wifi) {
		super(model, color);
		this.wifi = wifi;
	}
}
