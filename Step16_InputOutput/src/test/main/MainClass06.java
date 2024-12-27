package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		// 콘솔창에 출력할 수 있는 객체의 참조값 얻어내기
		PrintStream ps = System.out;
		// PrintStream 객체의 참조값을 부모 type 변수에 담기
		// OutputStream 도 1byte 처리 스트림이다. (한글 처리 불가)
		OutputStream os = ps;
		var osw = new OutputStreamWriter(os);
		// OutputStreamWriter 를 BufferedWriter 의 생성자에 저낟ㄹ해서 객체 생성
		var bw = new BufferedWriter(osw);
		/*
		 * window 의 개행기호: \r\n
		 * linux, mac os 의 개행기호: \n
		 */
		try {
			bw.write("하나");
			bw.newLine(); // 운영체제에 맞는 개행기호를 자동으로 출력해주는 메소드
			bw.write("두울");
			bw.newLine();
			bw.write("세엣");
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
