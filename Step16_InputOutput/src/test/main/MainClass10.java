package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 *  memo.txt 파일에 저장된 문자열을 읽어와서 콘솔창에 출력하는 예제
 */
public class MainClass10 {
	public static void main(String[] args) {
		
		// 문자열을 누적시킨 다음 한 번에 누적된 문자열을 얻어낼 수 있는 방법
		var sb = new StringBuilder();
		
		File f = new File("/Users/ktw2000111/Desktop/playground/myFolder/memo.txt");
		try {
			// 파일로부터 문자열을 읽어들일 수 있는 객체 생성
			var fr = new FileReader(f);
			// 문자열을 줄단위로 읽어들일 수 있는 객체
			var br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				sb.append(line);
				sb.append("\r\n");
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		// StringBuilder 객체에 누적된 문자열을 한번에 출력하기
		String result = sb.toString();
		System.out.println(result);
		System.out.println(sb); //StringBuilder 객체는 toString() 메서드를 오버라이드하고 있습니다. 
								//이 메서드는 StringBuilder 객체의 내용을 String 형태로 반환합니다.
	}
}
