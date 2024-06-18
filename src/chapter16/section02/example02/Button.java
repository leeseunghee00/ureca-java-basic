package chapter16.section02.example02;

public class Button {

	// Button 안에서만 쓰이는 interface
	@FunctionalInterface
	public static interface ClickListener {

		void onClick();		// public abstract 생략됨
	}

	// field
	private ClickListener clickListener;

	// method
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	public void click() {
		this.clickListener.onClick();
	}
}
