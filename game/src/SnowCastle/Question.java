package SnowCastle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Question extends JFrame implements ActionListener {
	
	JFrame jframe = new JFrame("SnowCastle");
	
	public Question() {
		jframe.setSize(1600,900);//�������� ũ��
		jframe.setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
		jframe.setLocationRelativeTo(null);//â�� ��� ������
		jframe.setLayout(null);//���̾ƿ��� ������� ���������ϰ� ����.
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame�� ���������� ����ǰ�
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jframe.setVisible(false);
		setVisible(true);
		gameDesc();
	}
	
	public void gameDesc() {
		ImageIcon ii = new ImageIcon("../game/src/SnowCastle/gamedesc.png");
		JLabel jl = new JLabel(ii);
		jl.setSize(1600, 900);
		
	}

}
