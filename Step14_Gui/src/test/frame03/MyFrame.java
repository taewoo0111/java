package test.frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		// 프레임 제목 설정
		this.setTitle("나의 프레임");
		// 프레임의 위치와 크기 설정 setBounds(x, y, width, height)
		this.setBounds(100, 100, 500, 500);
		// 종료 버튼을 눌렀을 때 프로세스 전체가 종료되도록 하기
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 레이아웃 매니저 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		
		// 프레임의 레이아웃 매니저 설정
		setLayout(layout);
		
		// JButton 생성
		JButton countBtn = new JButton("0");
		// 프레임의 add() 메소드 호출하면서 JButton 객체의 참조값을 전달하면 프레임에 버튼이 배치된다.
		add(countBtn);
		
		// 버튼에 전달할 ActionListenr 인터페이스 type
		ActionListener listener = new ActionListener() {
			int num = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				num++;
				System.out.println("버튼을 눌렀네?");
//				1번.				
//				String info = String.format("%d번째 누름", num);
//				countBtn.setText(info);;
//				2번. 
				countBtn.setText(Integer.toString(num));
			}	
		};
		countBtn.addActionListener(listener);
		
		// 화면상에 실제 보이도록 한다.
		setVisible(true);	
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}
