package chapter12.section03.example02;

public class StudentExample {

	public static void main(String[] args) {
		Student student1 = new Student(1, "고길동");
		Student student2 = new Student();

		student2.setNo(2);
		student2.setName("홍길동");

		System.out.println(student1);
		System.out.println(student2);
	}
}
