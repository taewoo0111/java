package test.frame01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	public MyFrame() {
		this.setTitle("나의 메모장 프레임");
		this.setBounds(200, 200, 500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.YELLOW);
		
		JTextField inputMsg = new JTextField(10);
		JButton sendBtn = new JButton("추가하기");
		
		topPanel.add(inputMsg);
		topPanel.add(sendBtn);
		add(topPanel, BorderLayout.NORTH);
		
		JTextArea ta = new JTextArea();
		add(ta, BorderLayout.CENTER);
		
		sendBtn.addActionListener((event) -> {
			String text = inputMsg.getText();
			File f = new File("/Users/ktw2000111/Desktop/playground/myFolder/memo.txt");
			try {
				if(!f.exists()) {
				f.createNewFile();
				System.out.println("memo.txt 파일을 만들었습니다.");
				}
				// new FileWriter(File 객체, append mode 여부)
				var fw = new FileWriter(f, true);
				fw.append(text);
				fw.append("\r\n"); // 개행기호
				fw.flush(); // 실제 출력
				fw.close(); // 마무리
				ta.append(text);
				System.out.println("memo.txt 파일에 문자열을 추가했습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		this.setVisible(true);
	}
}
