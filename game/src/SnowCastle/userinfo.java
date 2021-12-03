package SnowCastle;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class userinfo extends JFrame implements ActionListener {
	
	JFrame frame = new JFrame("SnowCastle");
	public Label la = new Label();
	
	public userinfo() {
		
		//JFrame frame = new JFrame("SnowCastle");
		frame.setSize(1600,900);//�������� ũ��
		frame.setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
		frame.setLocationRelativeTo(null);//â�� ��� ������
		frame.setLayout(null);//���̾ƿ��� ������� ���������ϰ� ����.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame�� ���������� ����ǰ�
		
		ImageIcon ii = new ImageIcon("../game/src/SnowCastle/usernameadd.png");
		JLabel jl = new JLabel(ii);
		jl.setSize(1600, 900);
		frame.add(jl);
		frame.setLayout(null);
		frame.setVisible(true);
		
		Font font = new Font("Neo�ձٸ� Pro", Font.BOLD, 23);
		JPanel main_pannel;
		JButton btnStart;
		JLabel LogoImageBox;
		JTextField inputName;
		
		inputName = new JTextField(50);
		jl.add(inputName);
		inputName.setFont(font);
		inputName.setBorder(BorderFactory.createMatteBorder(3, 0, 3, 0, Color.WHITE));
		inputName.setBounds(530, 500, 548, 100);
		inputName.setText("");
		inputName.setOpaque(false);
		inputName.setEditable(true);

		
		ImageIcon img = new ImageIcon("../game/src/SnowCastle/startBtn.png");
		
		Image originImg = img.getImage(); 
		Image changedImg= originImg.getScaledInstance(300, 140, Image.SCALE_SMOOTH );
		ImageIcon startbtn = new ImageIcon(changedImg);
		
		main_pannel = new JPanel();		// �г� ��üȭ 
		btnStart = new JButton(startbtn);
		jl.add(btnStart);
		btnStart.setBounds(578, 650, 400, 180); // ��ǥ, ����, ���� ����
		btnStart.setBorderPainted(false);
		btnStart.setContentAreaFilled(false);
		btnStart.setOpaque(false);
		btnStart.setVisible(true);
		
		// ���� ��ư Ŭ��
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new game();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.setVisible(false);
		setVisible(true);
		gameDesc();
	}
	
	public void gameDesc() {

	}
	
	public static void main(String[] args) {
		userinfo user = new userinfo();
	}

}
