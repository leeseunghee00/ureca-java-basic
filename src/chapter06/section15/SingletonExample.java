package chapter06.section15;

public class SingletonExample {

	public static void main(String[] args) {

		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();

		System.out.println(st1 == st2);
	}
}
