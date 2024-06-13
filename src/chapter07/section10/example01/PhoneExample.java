package chapter07.section10.example01;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone("홍길동");		// 추상클래스는 객체 선언 X

		SmartPhone smartPhone = new SmartPhone("고길동");

		smartPhone.turnOn();
		smartPhone.internetSearch();
	}
}
