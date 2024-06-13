package chapter08.section05;

public class Television implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV 를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}

		System.out.println("현재 TV 볼륨은 " + this.volume);
	}

	@Override
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("재정의 무음 처리");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("재정의 무음 해제");
		}
	}
}
