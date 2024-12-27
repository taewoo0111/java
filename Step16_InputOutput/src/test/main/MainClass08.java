package test.main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 *  memo.txt 파일에 저장된 문자열을 읽어와서 콘솔창에 출력하는 예제
 */
public class MainClass08 {
	public static void main(String[] args) {
		File f = new File("/Users/ktw2000111/Desktop/playground/myFolder/memo.txt");
		try {
			// 파일로부터 문자열을 읽어들일 수 있는 객체 생성
			var fr = new FileReader(f);
			while(true) {
				// 문자의 코드값을 읽어들인다.
				int code = fr.read();
				// 만일 더이상 읽을게 없다면
				if (code == -1) { // read 메소드를 보면 더 이상 읽을게 없으면 -1을 출력한다고 써져 있다.
					break; // 반복문 탈출
				}
				// 코드를 문자로 변환
				char ch = (char)code;
				System.out.print(ch);
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
