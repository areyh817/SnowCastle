package SnowCastle;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class insert extends JFrame implements ActionListener {
	
	JFrame frame = new JFrame("점수보이기");
	public Label la = new Label();
	String name;
	int score;
	
	public insert() {
		
		//JFrame frame = new JFrame("SnowCastle");
		frame.setSize(1600,900);//프레임의 크기
		frame.setResizable(false);//창의 크기를 변경하지 못하게
		frame.setLocationRelativeTo(null);//창이 가운데 나오게
		frame.setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		
		ImageIcon ii = new ImageIcon("../game/src/SnowCastle/winterBack1.png");
		JLabel jl = new JLabel(ii);
		jl.setSize(1600, 900);
		frame.add(jl);
		frame.setLayout(null);
		frame.setVisible(true);
		
		Font font = new Font("Neo둥근모 Pro", Font.BOLD, 23);
		JPanel main_pannel;
		JButton btnStart;
		
		main_pannel = new JPanel();		// 패널 객체화 
	}
	public static void main(String[] args) {
		insert intet = new insert();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
