package SnowCastle;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class background extends JFrame {
	
	public static void main(String[] args){
		
		JFrame f = new JFrame("SnowCastle");
		f.setSize(1600, 900);
		f.setVisible(true);
		f.setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
		f.setLocationRelativeTo(null);//â�� ��� ������
		
		// �������� â �ݱ� ���� ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ImageIcon image = new ImageIcon("../src/image/back.png");
		// �ּ��غ���
		f.getContentPane().setBackground(Color.black);
		/*JLabel jla = new JLabel(image);
		jla.setSize(1600, 900);
		f.add(jla);*/
		//jla.setVisible(true);
	}
}