package chapter13.section02.example03;

import java.util.Objects;

public class MyClass {
	String str;

	@Override
	public int hashCode() {
		return Objects.hash(str);
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
