package chapter12.section03.example02;

import java.util.Objects;

public class Student {
	private int no;
	private String name;

	public Student() {
	}

	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Override	// Collections API 를 목적에 맞게 사용하기 위해선 Overriding 하자
	public int hashCode() {
		return Objects.hash(no, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Student student = (Student) obj;

		return Objects.equals(name, student.name) && no == student.no;
	}

	@Override
	public String toString() {
		return "Student [no= " + no + ", name=" + name + "]";
	}
}
