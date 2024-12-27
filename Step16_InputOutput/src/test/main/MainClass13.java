package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass13 {
	public static void main(String[] args) {
		/*
		 *  try-with-resources 문법
		 *  null 체크와 close() 호출이 자동화됨
		 */
		try (
			var fis = new FileInputStream("/Users/ktw2000111/Desktop/playground/myFolder/1.jpg");
			var fos = new FileOutputStream("/Users/ktw2000111/Desktop/playground/myFolder/copied.jpg");
		){
			byte[] buffer = new byte[1024];
			while (true) {
				int readedCount = fis.read(buffer); 
				System.out.println(readedCount + " byte를 읽었습니다.");
				if ( readedCount == -1) break;
				fos.write(buffer, 0, readedCount); 
			}
			System.out.println("파일을 카피했습니다");
		} catch (Exception e) { 
			e.printStackTrace();
		} 
	}
}
