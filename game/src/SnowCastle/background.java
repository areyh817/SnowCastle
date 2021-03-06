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

		frame.setSize(1920,1080);//프레임의 크기
		frame.setResizable(false);//창의 크기를 변경하지 못하게
		frame.setLocationRelativeTo(null);//창이 가운데 나오게
		frame.setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		
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
		
		//ImageIcon에서 Image를 추출
		Image originImg = img.getImage(); 
		Image logoOriginImg = logoimg.getImage();
		Image QoriginImg = Queimg.getImage();
		Image ranoriginImg = Ranimg.getImage();
		
		//추출된 Image의 크기를 조절하여 새로운 Image객체 생성
		Image changedImg= originImg.getScaledInstance(350, 165, Image.SCALE_SMOOTH );
		Image changedlogoImg = logoOriginImg.getScaledInstance(950, 250, Image.SCALE_SMOOTH);
		Image changedQimg = QoriginImg.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		Image chagedRanimg = ranoriginImg.getScaledInstance(330, 180, Image.SCALE_SMOOTH);
		
		//새로운 Image로 ImageIcon객체를 생성
		ImageIcon startbtn = new ImageIcon(changedImg);
		ImageIcon mainLogo = new ImageIcon(changedlogoImg);
		ImageIcon question = new ImageIcon(changedQimg);
		ImageIcon ranking = new ImageIcon(chagedRanimg);
		
		
		main_pannel = new JPanel();		// 패널 객체화 
		btnStart = new JButton(startbtn);
		LogoImageBox = new JLabel(mainLogo);
		QuestionBox = new JButton(question);
		btnRanking = new JButton(ranking);
		
		// 패널에 갖다 붙이기
		jl.add(LogoImageBox);
		jl.add(btnStart);
		jl.add(QuestionBox);
		jl.add(btnRanking);
		
		// 게임 시작 버튼
		btnStart.setBounds(530, 710, 400, 180); // 좌표, 가로, 세로 설정
		btnStart.setBorderPainted(false);
		btnStart.setContentAreaFilled(false);
		btnStart.setOpaque(false);
		btnStart.setVisible(true);
		
		// 로고
		LogoImageBox.setBounds(440, 230, 1000, 250);
		
		// ? 버튼
		QuestionBox.setBounds(1700, -90, 300, 300);
		QuestionBox.setBorderPainted(false);
		QuestionBox.setContentAreaFilled(false);
		QuestionBox.setOpaque(false);
		QuestionBox.setVisible(true);
		
		// 랭킹 버튼
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
	            	btnStart.setBorderPainted(false); // 테두리 보이게
	            } else {
	            	btnStart.setBorderPainted(false); // 테두리 안보이게
	            }
	        }
	    });
		
		QuestionBox.getModel().addChangeListener(new ChangeListener() {
	        @Override
	        public void stateChanged(ChangeEvent e) {
	            ButtonModel model = (ButtonModel) e.getSource();
	            if (model.isRollover()) {
	            	btnStart.setBorderPainted(false); // 테두리 보이게
	            } else {
	            	btnStart.setBorderPainted(false); // 테두리 안보이게
	            }
	        }
	    });
		
		// 시작 버튼 클릭
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new userinfo();
			}
		});
		
		// Question 버튼 클릭
		QuestionBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Question();
			}
		});
		
		// ranking 버튼 클릭
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


