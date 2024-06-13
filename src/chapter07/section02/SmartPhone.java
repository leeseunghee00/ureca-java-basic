package chapter07.section02;

public class SmartPhone extends Phone{

	public boolean wifi;

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
