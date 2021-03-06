package SnowCastle;

import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Question extends JFrame implements ActionListener {
	
	JFrame frame = new JFrame("SnowCastle");
	public Label la = new Label();
	
	public Question() {
		
		//JFrame frame = new JFrame("SnowCastle");
		frame.setSize(1920,1080);//프레임의 크기
		frame.setResizable(false);//창의 크기를 변경하지 못하게
		frame.setLocationRelativeTo(null);//창이 가운데 나오게
		frame.setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		
		ImageIcon ii = new ImageIcon("../game/src/SnowCastle/bigdesc.png");
		JLabel jl = new JLabel(ii);
		jl.setSize(1920, 1080);
		frame.add(jl);
		frame.setLayout(null);
		frame.setVisible(true);
		
		JPanel main_pannel;
		JButton btnStart;
		JLabel LogoImageBox;
		
		ImageIcon img = new ImageIcon("../game/src/SnowCastle/startBtn.png");
		
		Image originImg = img.getImage(); 
		Image changedImg= originImg.getScaledInstance(300, 150, Image.SCALE_SMOOTH );
		ImageIcon startbtn = new ImageIcon(changedImg);
		
		main_pannel = new JPanel();		// 패널 객체화 
		btnStart = new JButton(startbtn);
		jl.add(btnStart);
		btnStart.setBounds(760, 820, 400, 180); // 좌표, 가로, 세로 설정
		btnStart.setBorderPainted(false);
		btnStart.setContentAreaFilled(false);
		btnStart.setOpaque(false);
		btnStart.setVisible(true);
		
		
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
		
		// 시작 버튼 클릭
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
		Question q = new Question();
	}

}
