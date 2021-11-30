package SnowCastle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class background extends JFrame {
	
	public static void main(String[] args) {
		
		String imgPath = "../game/src/SnowCastle/startBtn.png";
		
		ImageIcon startbtnImage = new ImageIcon(imgPath);
		
		//ImageIcon에서 Image를 추출
		Image originImg = startbtnImage.getImage(); 
		
		//추출된 Image의 크기를 조절하여 새로운 Image객체 생성
		Image changedImg= originImg.getScaledInstance(400, 180, Image.SCALE_SMOOTH );

		//새로운 Image로 ImageIcon객체를 생성
		ImageIcon startbtn = new ImageIcon(changedImg);

		
		JLabel Background = new JLabel(new ImageIcon("../game/src/SnowCastle/winterBack1.png"));
		JButton jbutton = new JButton(startbtn);
		JFrame jframe = new JFrame();
		
		// 화면 해상도 구하기
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		
		jframe.add(Background);
		jframe.setSize(res.width, res.height);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(null);
		
		jbutton.setBounds(200, 200, 500, 150);
		jbutton.setSize(400, 180);
		jframe.add(jbutton);
		

	}
}


