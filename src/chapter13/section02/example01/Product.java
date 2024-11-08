package chapter13.section02.example01;

public class Product<K, M> {

	private K kind;
	private M model;

	public Product() {
	}

	public K getKind() {
		return this.kind;
	}

	public void setKind(K kind) {
		this.kind = kind;
	}

	public M getModel() {
		return this.model;
	}

	public void setModel(M model) {
		this.model = model;
	}
}
