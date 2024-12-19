package test.main;

public class MainClass03 {
	// static method 안에서 쓰려면 class 도 static 이어야 한다!!!
	public static class Gura{
		public void say() {
			System.out.println("안녕! 나는 구라야~");
		}
	}
	
	public static void main(String[] args) {
		
		Gura g = new Gura();
		g.say();
		
		// 메소드 안에도 클래스 정의 가능!
		// 메소드 안의 클래스는 메소드 안쪽 영역에서만 사용 가능!
		// 메소드 안에 정의한 클래스 = Local Inner Class
		class Cat{
			public void say() {
				System.out.println("야옹!");
			}
		}
		
		// Local Inner Class 를 이용해서 객체 생성하고 사용
		Cat c= new Cat();
		c.say();
		
	}
}
