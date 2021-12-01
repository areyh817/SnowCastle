package SnowCastle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class background extends JFrame {
	
	public static void main(String[] args) {

		
		JFrame frame = new JFrame();
		frame.setSize(1600,900);//프레임의 크기
		frame.setResizable(false);//창의 크기를 변경하지 못하게
		frame.setLocationRelativeTo(null);//창이 가운데 나오게
		frame.setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		
		// 처음 스플래쉬 화면 띄우기
		ImageIcon ii = new ImageIcon("../game/src/SnowCastle/startback.jpg");
		JLabel jl = new JLabel(ii);
		jl.setSize(1600, 900);
		frame.add(jl);
		frame.setLayout(null);
		frame.setVisible(true);


		JPanel main_pannel;
		JButton btnStart;
		ImageIcon img = new ImageIcon("../game/src/SnowCastle/startBtn.png");
		
		//ImageIcon에서 Image를 추출
		Image originImg = img.getImage(); 
		
		//추출된 Image의 크기를 조절하여 새로운 Image객체 생성
		Image changedImg= originImg.getScaledInstance(400, 180, Image.SCALE_SMOOTH );

		//새로운 Image로 ImageIcon객체를 생성
		ImageIcon startbtn = new ImageIcon(changedImg);
		
		
		
		main_pannel = new JPanel();		// 패널 객체화 /]
		btnStart = new JButton(startbtn);
		// 로그인 버튼
		btnStart.setBounds(580, 500, 400, 180); // 좌표, 가로, 세로 설정
		btnStart.setBorderPainted(false);
		btnStart.setContentAreaFilled(false);
		btnStart.setOpaque(false);
		btnStart.setVisible(true);
		
		jl.add(btnStart);
		
		

		

	}
}


