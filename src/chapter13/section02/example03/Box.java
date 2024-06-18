package chapter13.section02.example03;

public class Box<T> {
	public T content;

	public boolean compare(Box<T> other) {
		return this.content.equals(other.content);
	}
}
