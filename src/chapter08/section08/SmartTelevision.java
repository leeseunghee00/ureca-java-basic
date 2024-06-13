package chapter08.section08;

public class SmartTelevision implements RemoteControl, Searchable{

	@Override
	public void turnOn() {
		System.out.println("turn on");
	}

	@Override
	public void turnOff() {
		System.out.println("turn off");
	}

	@Override
	public void search(String url) {
		System.out.println(url);
	}
}
