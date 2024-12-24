package test.main;

public class MainClass05 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main 메소드가 시작되었습니다.");
		
		Thread.sleep(1000*5);
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
