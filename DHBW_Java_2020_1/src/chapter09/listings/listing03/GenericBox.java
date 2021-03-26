package chapter09.listings.listing03;

public class GenericBox<T> {

	private T content;

	public void set(T content) {
		this.content = content;
	}

	public T get() {
		return content;
	}

}
