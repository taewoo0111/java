package test.auto;
/*
 *  - 접근 지정자 접근범위
 *  
 *  public : 어디에서나 접근 가능 
<<<<<<< HEAD
<<<<<<< HEAD
 *  protected : 동일한 package 혹은 상속관계에서 자식에서 접근 가능 다른 package 는 불가!!!!
=======
 *  protected : 동일한 package 혹은 상속관계에서 자식에서 접근 가능 
>>>>>>> 2f983f3 (a)
=======
 *  protected : 동일한 package 혹은 상속관계에서 자식에서 접근 가능 
>>>>>>> branch 'master' of https://github.com/taewoo0111/java.git
 *  default(작성 안한 경우) : 동일한 package 안에서만 접근 가능
 *  private : 동일한 클래스 혹은 동일한 객체 안에서만 접근가능 
 *  
 *  - 접근 지정자를 붙이는 위치
 *  
 *  1. 클래스를 선언 할때 (import 가능여부를 결정한다)
 *  2. 생성자 (객체 생성 가능여부를 결정한다)
 *  3. 필드 (필드 참조 가능 여부를 결정한다)
 *  4. 메소드 (메소드 호출 가능 여부를 결정한다)
 *  
 *  클래스는 default 와 public 두가지의 접근 지정자만 지정 가능하다
 *  접근 지정자를 생략한것이 default 접근 지정자다 
 */
public class Car {
	
	protected Engine engine; // 필드가 protected 이면 상속관계에서는 참조 가능!!!!!
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		if (this.engine == null) {
			System.out.println("Engine 이 없어서 달릴 수가 없어요!");
			return;
		}
		System.out.println("달려요~");
	}
}
