package test.main;

import test.mypac.HandPhone;

public class MainClass01 {
	public static void main(String[] args) {
		
		HandPhone p1 = new HandPhone();
		p1.call(); // 부모 클래스에 정의된 메소드도 사용 가능
		p1.mobileCall();
		p1.takePictures();
		
	}
}
