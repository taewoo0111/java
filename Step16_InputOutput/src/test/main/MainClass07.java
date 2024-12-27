package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("main() 메소드가 \"시작\" 되었습니다.");
		System.out.println("main() 메소드가 \\시작\\ 되었습니다.");
		
		// 파일에 저장할 문자열
		String msg = "나는 java의 신이다!";
		
		// memo.txt 파일을 만들기 위한 File 객체 생성
		File f = new File("/Users/ktw2000111/Desktop/playground/myFolder/memo.txt");
		try {
			if(!f.exists()) {
			f.createNewFile();
			System.out.println("memo.txt 파일을 만들었습니다.");
			}
			// new FileWriter(File 객체, append mode 여부)
			var fw = new FileWriter(f, true);
			fw.append(msg);
			fw.append("\r\n"); // 개행기호
			fw.flush(); // 실제 출력
			fw.close(); // 마무리
			System.out.println("memo.txt 파일에 문자열을 기록했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
