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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class background extends JFrame implements ActionListener {
	JFrame frame = new JFrame("SnowCastle");
	public background(){

		frame.setSize(1920,1080);//�������� ũ��
		frame.setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
		frame.setLocationRelativeTo(null);//â�� ��� ������
		frame.setLayout(null);//���̾ƿ��� ������� ���������ϰ� ����.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame�� ���������� ����ǰ�
		
		ImageIcon ii = new ImageIcon("../game/src/SnowCastle/startback.jpg");
		JLabel jl = new JLabel(ii);
		jl.setSize(1920, 1080);
		frame.add(jl);
		frame.setLayout(null);
		frame.setVisible(true);


		JPanel main_pannel;
		JButton btnStart, QuestionBox, btnRanking;
		JLabel LogoImageBox;
		ImageIcon img = new ImageIcon("../game/src/SnowCastle/startBtn.png");
		ImageIcon logoimg = new ImageIcon("../game/src/SnowCastle/logo.png");
		ImageIcon Queimg = new ImageIcon("../game/src/SnowCastle/Q.png");
		ImageIcon Ranimg = new ImageIcon("../game/src/SnowCastle/ranimg.png");
		
		//ImageIcon���� Image�� ����
		Image originImg = img.getImage(); 
		Image logoOriginImg = logoimg.getImage();
		Image QoriginImg = Queimg.getImage();
		Image ranoriginImg = Ranimg.getImage();
		
		//����� Image�� ũ�⸦ �����Ͽ� ���ο� Image��ü ����
		Image changedImg= originImg.getScaledInstance(350, 165, Image.SCALE_SMOOTH );
		Image changedlogoImg = logoOriginImg.getScaledInstance(950, 250, Image.SCALE_SMOOTH);
		Image changedQimg = QoriginImg.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		Image chagedRanimg = ranoriginImg.getScaledInstance(330, 180, Image.SCALE_SMOOTH);
		
		//���ο� Image�� ImageIcon��ü�� ����
		ImageIcon startbtn = new ImageIcon(changedImg);
		ImageIcon mainLogo = new ImageIcon(changedlogoImg);
		ImageIcon question = new ImageIcon(changedQimg);
		ImageIcon ranking = new ImageIcon(chagedRanimg);
		
		
		main_pannel = new JPanel();		// �г� ��üȭ 
		btnStart = new JButton(startbtn);
		LogoImageBox = new JLabel(mainLogo);
		QuestionBox = new JButton(question);
		btnRanking = new JButton(ranking);
		
		// �гο� ���� ���̱�
		jl.add(LogoImageBox);
		jl.add(btnStart);
		jl.add(QuestionBox);
		jl.add(btnRanking);
		
		// ���� ���� ��ư
		btnStart.setBounds(530, 710, 400, 180); // ��ǥ, ����, ���� ����
		btnStart.setBorderPainted(false);
		btnStart.setContentAreaFilled(false);
		btnStart.setOpaque(false);
		btnStart.setVisible(true);
		
		// �ΰ�
		LogoImageBox.setBounds(440, 230, 1000, 250);
		
		// ? ��ư
		QuestionBox.setBounds(1700, -90, 300, 300);
		QuestionBox.setBorderPainted(false);
		QuestionBox.setContentAreaFilled(false);
		QuestionBox.setOpaque(false);
		QuestionBox.setVisible(true);
		
		// ��ŷ ��ư
		btnRanking.setBounds(920, 700, 400, 180);
		btnRanking.setBorderPainted(false);
		btnRanking.setContentAreaFilled(false);
		btnRanking.setOpaque(false);
		btnRanking.setVisible(true);
		
		btnStart.getModel().addChangeListener(new ChangeListener() {
	        @Override
	        public void stateChanged(ChangeEvent e) {
	            ButtonModel model = (ButtonModel) e.getSource();
	            if (model.isRollover()) {
	            	btnStart.setBorderPainted(false); // �׵θ� ���̰�
	            } else {
	            	btnStart.setBorderPainted(false); // �׵θ� �Ⱥ��̰�
	            }
	        }
	    });
		
		QuestionBox.getModel().addChangeListener(new ChangeListener() {
	        @Override
	        public void stateChanged(ChangeEvent e) {
	            ButtonModel model = (ButtonModel) e.getSource();
	            if (model.isRollover()) {
	            	btnStart.setBorderPainted(false); // �׵θ� ���̰�
	            } else {
	            	btnStart.setBorderPainted(false); // �׵θ� �Ⱥ��̰�
	            }
	        }
	    });
		
		// ���� ��ư Ŭ��
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new userinfo();
			}
		});
		
		// Question ��ư Ŭ��
		QuestionBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Question();
			}
		});
		
		// ranking ��ư Ŭ��
		btnRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new ranking();
			}
		});
	
	

}

	
	public static void main(String[] args) {

		background back = new background();
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.setVisible(false);
		setVisible(true);
		
	}
}


