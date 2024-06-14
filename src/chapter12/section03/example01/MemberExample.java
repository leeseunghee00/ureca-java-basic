package chapter12.section03.example01;

public class MemberExample {

	public static void main(String[] args) {
		Member member1 = new Member("member1");
		Member member2 = new Member("member1");
		Member member3 = new Member("member3");

		// Object: Object.toString() 호출
		System.out.println(member1);
		System.out.println(member1);
		System.out.println(member3);

		// ==: 객체의 참조(주소, 번지) 값 비교
		System.out.println(member1 == member2);
		System.out.println(member2 == member3);

		// equals(): == 역할
		System.out.println(member1.equals(member2));
	}
}
