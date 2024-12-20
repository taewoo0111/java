package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		// 상수를 만들 때는 final 이라는 예약어를 type 선언 앞에 붙인다.
		// 관례상 상수를 만들 때는 모두 대문자로 표기한다.
		final int MY_ID = 999;
		
		// 어떤 type 이든 상관없이 상수로 만들 수 있다.
		final String MY_NAME = "김태우";
		
		System.out.println(MY_ID);
		System.out.println(MY_NAME);
		
	}
}
