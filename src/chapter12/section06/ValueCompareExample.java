package chapter12.section06;

public class ValueCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;

		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));

		Integer obj3 = 100;
		Integer obj4 = 100;

		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));
	}
}
