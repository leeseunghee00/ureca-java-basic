package chapter18.section10;

import java.io.Serializable;

public class Member implements Serializable {

	private static final long serialVersionUID = 2L;
	private final String id;
	private final String name;
	private final String ssn;

	public Member(String id, String name, String ssn) {
		this.id = id;
		this.name = name;
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Member [id= " + id + ", name= " + name + ", ssn= " + ssn + "]";
	}
}
