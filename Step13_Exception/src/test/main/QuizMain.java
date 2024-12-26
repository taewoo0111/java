package test.main;

import test.mypac.Quiz;

/*
 * run 했을 때
 * 1초
 * ...
 * 10초 까지만 출력하고 종료되는 프로그래밍 해보기
 * hint -> Thread.sleep(1000);
 */

public class QuizMain {
	public static void main(String[] args) throws InterruptedException {
		Quiz.run();
	}
}
