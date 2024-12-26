package test.mypac;

public class WowException extends RuntimeException {  // RuntimeException 클래스를 상속받아서 만든다.
	// 생성자의 매개 변수로 예외 메세지를 전달받기					그냥 Exception 을 상속받으면 예외처리를 해줘야 한다!!!
	public WowException(String msg) {
		// 부모 생성자에 전달하기
		super(msg);
	}
}
