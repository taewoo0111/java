package test.mypac;

// Generic 클래스는 여러 개 있을 수도 있다.
public class Pair<K, V> { 

	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getkey() {
		return key;
	}
	
	public V getvalue() {
		return value;
	}
}
