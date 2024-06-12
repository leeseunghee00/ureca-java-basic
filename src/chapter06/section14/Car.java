package chapter06.section14;

public class Car {

	private int speed;
	private boolean stop;

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		if (speed <= 0) {
			this.speed = 0;
			setStop(true);
		} else {
			this.speed = speed;
			setStop(false);
		}
	}

	public boolean isStop() {
		return this.stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
