package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		InputStream kbd = System.in;
		var isr = new InputStreamReader(kbd);
		// BufferedReader 의 생성자로 InputStreamReader 객체를 전달해서 객체 생성
		var br = new BufferedReader(isr);
		System.out.println("입력: ");
		try {
			// 문자열 1줄 읽어들이기
			String line = br.readLine();
			System.out.println("line: " + line);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
