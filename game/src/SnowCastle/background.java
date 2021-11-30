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
		
		//ImageIcon���� Image�� ����
		Image originImg = startbtnImage.getImage(); 
		
		//����� Image�� ũ�⸦ �����Ͽ� ���ο� Image��ü ����
		Image changedImg= originImg.getScaledInstance(400, 180, Image.SCALE_SMOOTH );

		//���ο� Image�� ImageIcon��ü�� ����
		ImageIcon startbtn = new ImageIcon(changedImg);

		
		JLabel Background = new JLabel(new ImageIcon("../game/src/SnowCastle/winterBack1.png"));
		JButton jbutton = new JButton(startbtn);
		JFrame jframe = new JFrame();
		
		// ȭ�� �ػ� ���ϱ�
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


