package chapter13.section02.example03;

public class GenericExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		Box<String> box2 = new Box<>();

		box1.content = "100";
		box2.content = "200";

		System.out.println(box1.compare(box2));

		Box<Integer> box3 = new Box<>();
		Box<Integer> box4 = new Box<>();

		box3.content = 100;
		box4.content = 200;

		System.out.println(box3.compare(box4));

		Box<MyClass> box5 = new Box<>();
		Box<MyClass> box6 = new Box<>();

		box5.content.str = "즐거운 금요일~~";
		box6.content.str = "안 즐거운 월요일~~";

		System.out.println(box5.compare(box6));
	}
}
