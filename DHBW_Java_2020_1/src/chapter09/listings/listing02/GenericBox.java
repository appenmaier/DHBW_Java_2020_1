package chapter09.listings.listing02;

public class GenericBox<T> {

	private T content;

	public void set(T content) {
		this.content = content;
	}

	public T get() {
		return content;
	}

}
