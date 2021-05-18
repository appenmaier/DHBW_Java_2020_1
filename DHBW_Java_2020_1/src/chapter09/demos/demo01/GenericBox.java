package chapter09.demos.demo01;

/**
 * Generische Box
 * 
 * @author Daniel Appenmaier
 *
 */
public class GenericBox<T> {

	/*
	 * Attribute
	 */
	private T content;

	/*
	 * Methoden
	 */
	public GenericBox() {
	}

	public void setContent(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}

}
