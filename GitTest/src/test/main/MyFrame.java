package test.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//생성자
	public MyFrame(String title) {
		super(title);
		//setBounds(x,y,width,height)
		setBounds(100,100,300,400);
		//프레임의 레이아웃 법칙 지정
		setLayout(new BorderLayout());
		//프레임을 닫았을때 process 종료 되도록
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//프레임이 화면에 보이도록 설정
		setVisible(true);
		
	}
	//main 메소드
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
}
