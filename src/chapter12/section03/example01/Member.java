package chapter12.section03.example01;

import java.util.Objects;

public class Member extends Object {

	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			// Member 로 강제 형변환
			Member member = (Member) obj;

			return Objects.equals(this.id, member.id);
		}

		return false;
	}
}
