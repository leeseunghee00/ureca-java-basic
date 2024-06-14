package chapter12.section03.example04;

public class MemberExample {

	public static void main(String[] args) {
		Member member1 = new Member("winder", "눈송이", 25);
		Member member2 = new Member("winder", "눈송이", 25);

		System.out.println(member1.id());
		System.out.println(member1.age());
		System.out.println(member1.name());
		System.out.println(member1.hashCode());
		System.out.println(member1.equals(member2));
	}
}
