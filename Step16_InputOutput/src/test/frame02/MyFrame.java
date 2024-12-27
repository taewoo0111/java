package test.frame02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
		JButton sendBtn = new JButton("가져오기");
		
		topPanel.add(inputMsg);
		topPanel.add(sendBtn);
		add(topPanel, BorderLayout.NORTH);
		
		JTextArea ta = new JTextArea();
		add(ta, BorderLayout.CENTER);
		
		var sb = new StringBuilder();
		sendBtn.addActionListener((event) -> {
			String memo = inputMsg.getText();
			File f = new File(memo);
			try {
				var fr = new FileReader(f);
				var br = new BufferedReader(fr);
				while (true) {
					String line = br.readLine();
					if (line == null) {
						break;
					}
					ta.append(line);
					ta.append("\r\n");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		this.setVisible(true);
	}
}
