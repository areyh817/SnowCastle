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
	
	JFrame frame = new JFrame("�������̱�");
	public Label la = new Label();
	String name;
	int score;
	
	public insert() {
		
		//JFrame frame = new JFrame("SnowCastle");
		frame.setSize(1600,900);//�������� ũ��
		frame.setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
		frame.setLocationRelativeTo(null);//â�� ��� ������
		frame.setLayout(null);//���̾ƿ��� ������� ���������ϰ� ����.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame�� ���������� ����ǰ�
		
		ImageIcon ii = new ImageIcon("../game/src/SnowCastle/winterBack1.png");
		JLabel jl = new JLabel(ii);
		jl.setSize(1600, 900);
		frame.add(jl);
		frame.setLayout(null);
		frame.setVisible(true);
		
		Font font = new Font("Neo�ձٸ� Pro", Font.BOLD, 23);
		JPanel main_pannel;
		JButton btnStart;
		
		main_pannel = new JPanel();		// �г� ��üȭ 
	}
	public static void main(String[] args) {
		insert intet = new insert();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
