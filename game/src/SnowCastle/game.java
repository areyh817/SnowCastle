package SnowCastle;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class game extends JFrame implements ActionListener {
	
		JFrame jframe = new JFrame("SnowCastle");
		
		public game() {
			jframe.setSize(1600,900);//�������� ũ��
			jframe.setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
			jframe.setLocationRelativeTo(null);//â�� ��� ������
			jframe.setLayout(null);//���̾ƿ��� ������� ���������ϰ� ����.
			jframe.setVisible(true);
			jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame�� ���������� ����ǰ�
		}

		/*public game(JFrame frame) {
			jframe = frame;
			jframe.setSize(1600,900);//�������� ũ��
			jframe.setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
			jframe.setLocationRelativeTo(null);//â�� ��� ������
			jframe.setLayout(null);//���̾ƿ��� ������� ���������ϰ� ����.
			jframe.setVisible(true);
			jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame�� ���������� ����ǰ�
		}*/
		
		public void actionPerformed(ActionEvent ae) {
			// TODO Auto-generated method stub4
			jframe.setVisible(false);
			setVisible(true);
		}
		
	
		
	

}
