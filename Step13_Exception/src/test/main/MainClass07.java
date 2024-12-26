package test.main;

import java.util.Random;

import test.mypac.WowException;

public class MainClass07 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int ranNum = ran.nextInt(10);
		// 여기서 발생하는 Exception 은 JVM(자바가상머신) 이 직접처리한다.
		if(ranNum == 7) {
			throw new WowException("행운의 7이다!");
		}
		System.out.println(ranNum + " 숫자가 나왔습니다.");
	}
}
