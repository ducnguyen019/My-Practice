package Generic;

public class MyGenericClass<T> {
	T obj;

	MyGenericClass(T obj) {
		this.obj = obj;
	}

	public void displayObjectDetails() {
		System.out.println("The type of Object: " + obj.getClass().getName());
	}

	public T getObject() {
		return obj;
	}
}
