package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass12 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/ktw2000111/Desktop/playground/myFolder/1.jpg");
			fos = new FileOutputStream("/Users/ktw2000111/Desktop/playground/myFolder/copied.jpg");
			// byte 알갱이 여러개을 한번에 담을 배열 미리 준비
			byte[] buffer = new byte[1024];
			// 반복문 돌면서
			while (true) {
				// byte[] 배열을 전달해서 byte 알갱이를 한 번에 1024개씩 읽어들인다.
				int readedCount = fis.read(buffer); // 읽어드린 개수가 리턴된다.
				System.out.println(readedCount + " byte를 읽었습니다.");
				if ( readedCount == -1) break;
				// byte[] 배열에 저장된 byte 알갱이를 0번 인덱스로부터 읽은 갯수만큼만 출력하기
				fos.write(buffer, 0, readedCount); // 0번 인덱스부터 readedCount 한 만큼까지 출력!
			}
			System.out.println("파일을 카피했습니다");
		} catch (Exception e) { 
			e.printStackTrace();
		} finally {
			try {
				if(fos != null)fos.close();
				if(fis != null)fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
