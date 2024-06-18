package chapter16.section02.example02;

public class ButtonExample {

	public static void main(String[] args) {
		Button btnOk = new Button();

		btnOk.setClickListener(() -> System.out.println("OK Button Click!"));
		btnOk.click();

		Button btnCancel = new Button();

 		btnCancel.setClickListener(() -> System.out.println("Cancel Button Click!"));
		btnCancel.click();
	}
}
