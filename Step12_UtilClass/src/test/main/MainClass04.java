package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass04 {
	
	public static void main(String[] args) {
		
		// Car type 을 저장할 수 있는 ArrayList 객체 생성하고 참조값을 List 인터페이스 type 지역변수 cars 에 담기
		List<Car> cars = new ArrayList<>();
		// Car 객체를 3개 생성하고 List 객체에 담기
		Car car1 = new Car("쏘나타");
		Car car2 = new Car("아반떼");
		Car car3 = new Car("그렌져");
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		
		// 일반 for 문을 사용해서 호출
		for(int i =0; i<cars.size(); i++) {
			Car tmp = cars.get(i);
			tmp.drive();	
		}
		// 확장 for 문을 사용해서 호출
		for(Car tmp: cars) {
			tmp.drive();
		}
		// ArrayList 객체의 forEach() 메소드를 이용해서 모두 호출
		cars.forEach((car)->{
			car.drive();
		});
	}
}
