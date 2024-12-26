package test.mypac;

public class Quiz {
	public static void run() throws InterruptedException {
		for (int i=1; i<11; i++) {
			Thread.sleep(1000);
			System.out.println(i + "초");
		}
	}
}
