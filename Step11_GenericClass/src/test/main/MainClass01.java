package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		
		// Generic 클래스를 Apple 로 지정해서 객체 사용
		FruitBox<Apple> box1 = new FruitBox<Apple>();
		box1.pack(new Apple());
		Apple a1 = box1.unpack();
		
		FruitBox<Orange> box2 = new FruitBox<Orange>();
		box2.pack(new Orange());
		Orange o1 = box2.unpack();
				
		FruitBox<Melon> box3 = new FruitBox<>(); //<> 괄호 안에 빈 칸도 가능
		box3.pack(new Melon());
		Melon m1 = box3.unpack();
			
	}
}
