package chapter16.section05.example01;

public class Person {

	public void action(Calculable calculable) {
		double result = calculable.calc(10, 4);

		System.out.println(result);
	}
}
