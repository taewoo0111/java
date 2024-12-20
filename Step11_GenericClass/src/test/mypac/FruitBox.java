package test.mypac;

// 클래스 정의 시에 특정 type 을 전달받아서 사용하는 구조로 정의할 수 있다.
// 그러면 클래스를 Generic 클래스라고 한다.


public class FruitBox<T> { // <T> = 포괄클래스(Generic class)
	
	private T item;
	
	public void pack(T item) {
		this.item = item;
	}
	
	public T unpack() {
		return item;
	}
}
