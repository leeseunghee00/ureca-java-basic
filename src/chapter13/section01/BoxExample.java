package chapter13.section01;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		Box<Integer> box2 = new Box<>();

		box1.content = "Hello";
		box2.content = 3;

		System.out.println(box1.content);
		System.out.println(box2.content);
	}
}
