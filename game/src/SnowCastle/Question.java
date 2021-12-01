package SnowCastle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Question extends JFrame implements ActionListener {
	
	JFrame jframe = new JFrame("SnowCastle");
	
	public Question() {
		jframe.setSize(1600,900);//프레임의 크기
		jframe.setResizable(false);//창의 크기를 변경하지 못하게
		jframe.setLocationRelativeTo(null);//창이 가운데 나오게
		jframe.setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
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
