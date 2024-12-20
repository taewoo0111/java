package test.mypac;

public class AppleBox {
	
	private Apple item;
	
	public void pack(Apple item) {
		this.item = item;
	}
	
	public Apple unPack() {
		return item;
	}
}
