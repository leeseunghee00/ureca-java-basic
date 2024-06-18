package chapter16.section05.example01;

public class MethodReferenceExample {

	public static void main(String[] args) {
		/* static method */
		Person person = new Person();

		person.action((x, y) -> Computer.staticMethod(x, y));
		person.action(Computer::staticMethod);	// static method
		// person.action(Computer::instanceMethod);	// method

		/* instance method */
		Computer computer = new Computer();

		person.action((x, y) -> computer.instanceMethod(x, y));
		person.action(computer::instanceMethod);
	}
}
