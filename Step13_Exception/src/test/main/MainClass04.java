package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		try {
			Thread.sleep(1000*5); // 스레드를 일정시간 지연시키기(mili second 단위로 숫자 전달)
		} catch (InterruptedException e) { // 반드시 오류를 잡아줘야 한다.
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
