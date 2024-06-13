package chapter07.section02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		Phone phone = new Phone();

		phone.model = "galaxy";
		System.out.println(phone.model);

		SmartPhone smartPhone = new SmartPhone();

		smartPhone.model = "galaxy";
		System.out.println(smartPhone.model);

		smartPhone.bell();
		smartPhone.receiveVoice("Hello!!");
		smartPhone.setWifi(true);

		System.out.println(smartPhone.wifi);
		smartPhone.internet();
	}
}
