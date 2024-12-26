package test.frame03;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame{
	
	public MyFrame2(String title) {
		super(title);
		
		// this.setBounds(100, 100, 300, 300);
		// this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		/*
		 *  type 추론이 가능하다면 지역변수의 type 대신 var 로 선언할 수 있다.
		 *  java 10 에서 추가된 문법, 실무에서는 1.8 버전을 쓰는 곳이 많기 때문에 주의
		 *  지역변수에만 사용가능, 필드는 불가능
		 *  인터페이스 type 추론 불가능
		 *  null 로 초기화 불가!
		 */
		var startBtn = new JButton("작업시작");
		add(startBtn);
		
		var startBtn2 = new JButton("작업시작2");
		add(startBtn2);
		
		startBtn.addActionListener((e) -> {
			System.out.println("10초 걸리는 작업을 시작합니다.");
			try {
				Thread.sleep(1000*10);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("작업이 종료되었습니다.");
		});
		
		startBtn2.addActionListener((e) -> {
			new Thread(() -> {
				System.out.println("10초 걸리는 작업을 시작합니다.");
				try {
					Thread.sleep(1000*10);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("작업이 종료되었습니다.");
				}).start();
		});
	}
	
	// run 했을 때 실행의 흐름이 시작되는 메인 메소드
	public static void main(String[] args) {
		var frame = new MyFrame2("나의 프레임");
		// MyFrame 객체 안에서 this. 으로 호출되었떤 메소드를 객체 외부에서는 참조값에 . 찍어서 호출 가능
		frame.setBounds(100, 100, 300, 300); // 12번째 줄 대신 쓸 수 있다.
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE); // 13번째 줄 대신 쓸 수 있다.
		frame.setVisible(true);
	}
}
