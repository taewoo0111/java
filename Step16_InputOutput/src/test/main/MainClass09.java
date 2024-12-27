package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 *  memo.txt 파일에 저장된 문자열을 읽어와서 콘솔창에 출력하는 예제
 */
public class MainClass09 {
	public static void main(String[] args) {
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
				System.out.println(line);
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
