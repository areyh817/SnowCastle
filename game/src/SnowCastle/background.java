package SnowCastle;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class background extends JFrame {
	
	public static void main(String[] args) {
		
		// �� â ����
		JFrame frame = new JFrame("SnowCastle");
		frame.setSize(1920,1080);//�������� ũ��
		frame.setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
		frame.setLocationRelativeTo(null);//â�� ��� ������
		frame.setLayout(null);//���̾ƿ��� ������� ���������ϰ� ����.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame�� ���������� ����ǰ�
		
		
		// ó�� ���÷��� ȭ�� ����
		ImageIcon ii = new ImageIcon("../game/src/SnowCastle/winterBack1.png");
		JLabel jl = new JLabel(ii);
		jl.setSize(1920,1080);
		frame.add(jl);
		frame.setLayout(null);
		frame.setVisible(true);
		

	}
}


