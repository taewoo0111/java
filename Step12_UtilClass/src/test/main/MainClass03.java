package test.main;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClass03 {
	public static void main(String[] args) {
		// 인사말을 담을 ArrayList 객체를 생성해서 참조값을 greets 지역변수에 저장
		ArrayList<String> greets = new ArrayList<>();
		// greets 에 들어 있는 참조값을 이용해서 인사말 3개를 임의로 담기
		greets.add("안녕하세요?");
		greets.add("Hi");
		greets.add("Hello");
		
		// 확장 for 문을 이용해서 모든 인사말을 콘솔창에 순서대로 출력
		for (String greet : greets) {
			System.out.println(greet);
		}
		
		System.out.println("---------------");
		
		//////
		Consumer<String> con = new Consumer<String>() { //	Consumer 는 interface!!!!
			
			@Override
			public void accept(String t) {
				// 매개 변수에 전달되는 item 을 가지고 어떤 작업을 할지 여기에 coding 하면 된다.
				System.out.println(t);
			}
		};
		/*
		 * ArrayList 객체에 forEach() 메소드를 호출하면서 Consumer type 객체를 전달하면
		 * 전달된 객체의 accept() 메소드를 호출하면서
		 * ArrayList 객체에 저장된 item 을 순서대로 매개변수에 전달해 준다.
		 */
		greets.forEach(con); // forEach 와 Consumer 는 세트이다.!!!!!
		
		System.out.println("---------------");
		
		//////
		Consumer<String> con2 = (String t)->{
			System.out.println(t);
		};
		greets.forEach(con2);
		
		System.out.println("---------------");
		
		//////
		greets.forEach((String t)->{
			System.out.println(t);
		});		
	}
}
