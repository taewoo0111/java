package test.main;

import java.util.Scanner;
import test.auto.Car;
import test.auto.Engine;
import test.mypac.Phone;

/*
 * java 에서 사용하는 모든 data 는 Object type 변수나 필드에 담을 수 있다.
 */
public class MainClass07 {
	public static void main(String[] args) {
		Object a = 10; // Wrapper 클래스로 변경되어 저장
		Object b = true; // Wrapper 클래스로 변경되어 저장
		Object c = 'a'; // Wrapper 클래스로 변경되어 저장
		Object d = "abcd";
		Object e = new Phone();
		Object f = new Scanner(System.in);
		Object g = new Car(new Engine());
		
		// Object 배열은 어떤 type 이던지 다 담을 수 있다.
		Object[] objs = new Object[5];
		objs[0] = 10;
		objs[1] = true;
		objs[2] = "kim";
		objs[3] = new Phone();
		objs[4] = new Scanner(System.in);
		
		// 지역변수 e 에 저장된 참조값을 이용해서 전화 걸기
		((Phone)e).call();
		
		// objs 배열의 3 번방에 있는 참조값을 이용해서 전화 걸기
		((Phone)objs[3]).call();
		
	}
}
