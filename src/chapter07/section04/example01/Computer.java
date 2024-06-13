package chapter07.section04.example01;

public class Computer extends Calculator{

	@Override	// 컴파일러에게 알리는 역할
	public double areaCircle(double r) {
		System.out.println("Calculator areaCircle()");

		return Math.PI * r * r;
	}
}
