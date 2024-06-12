package chapter06.section11.example01;

public class Korean {
	final String nation = "korea";
	final String ssn;	// 오류 해결: ssn 를 갖는 생성자 생성
	String name;

	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
