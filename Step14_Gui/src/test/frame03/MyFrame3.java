package test.frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame3 extends JFrame implements ActionListener{
	
	int count;
	JButton countBtn; // 필드로 만들었다.
	
	public MyFrame3() {
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
		this.countBtn = new JButton("0"); // actionPerformed 메소드에서 countBtn 값을 불러와야 하므로 위에 필드로 생성하고 변수를 담음.
		// 프레임의 add() 메소드 호출하면서 JButton 객체의 참조값을 전달하면 프레임에 버튼이 배치된다.
		add(countBtn);
		
		// MyFrame3 클래스는 implements ActionListenr 인터페이스를 구현해서 this 전달 가능
		countBtn.addActionListener(this);
		
		// 화면상에 실제 보이도록 한다.
		setVisible(true);	
	}
	public static void main(String[] args) {
		new MyFrame3();
	}
	@Override
	public void actionPerformed(ActionEvent e) { // 이 메소드 안에서 countBtn 값을 불러오려면 필드로 담아야 한다.
		// TODO Auto-generated method stub		 
		System.out.println("버튼누르기");
		count++;
		countBtn.setText(Integer.toString(count));
	}
}
