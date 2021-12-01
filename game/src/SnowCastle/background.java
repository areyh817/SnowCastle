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
		frame.setSize(1600,900);//�������� ũ��
		frame.setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
		frame.setLocationRelativeTo(null);//â�� ��� ������
		frame.setLayout(null);//���̾ƿ��� ������� ���������ϰ� ����.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame�� ���������� ����ǰ�
		
		// ó�� ���÷��� ȭ�� ����
		ImageIcon ii = new ImageIcon("../game/src/SnowCastle/startback.jpg");
		JLabel jl = new JLabel(ii);
		jl.setSize(1600, 900);
		frame.add(jl);
		frame.setLayout(null);
		frame.setVisible(true);


		JPanel main_pannel;
		JButton btnStart;
		ImageIcon img = new ImageIcon("../game/src/SnowCastle/startBtn.png");
		
		//ImageIcon���� Image�� ����
		Image originImg = img.getImage(); 
		
		//����� Image�� ũ�⸦ �����Ͽ� ���ο� Image��ü ����
		Image changedImg= originImg.getScaledInstance(400, 180, Image.SCALE_SMOOTH );

		//���ο� Image�� ImageIcon��ü�� ����
		ImageIcon startbtn = new ImageIcon(changedImg);
		
		
		
		main_pannel = new JPanel();		// �г� ��üȭ /]
		btnStart = new JButton(startbtn);
		// �α��� ��ư
		btnStart.setBounds(580, 500, 400, 180); // ��ǥ, ����, ���� ����
		btnStart.setBorderPainted(false);
		btnStart.setContentAreaFilled(false);
		btnStart.setOpaque(false);
		btnStart.setVisible(true);
		
		jl.add(btnStart);
		
		

		

	}
}


