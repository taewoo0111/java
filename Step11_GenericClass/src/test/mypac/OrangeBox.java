package test.mypac;

public class OrangeBox {

	private Orange item;
	
	public void pack(Orange item) {
		this.item = item;
	}
	
	public Orange unPack() { // Orange 는 여기서 반환 데이터 타입!이다 
		return item;
	}
}
