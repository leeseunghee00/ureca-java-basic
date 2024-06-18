package chapter16.section02.example01;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();

		person.action(() -> {
			System.out.println("출근!");
			System.out.println("코딩!");
		});

		person.action(() -> {
			System.out.println("퇴근!");
			System.out.println("코딩!");
		});

		person.action(() -> System.out.println("얏호!"));
	}
}
