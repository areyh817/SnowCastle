package SnowCastle;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class background extends JFrame {
	
	public static void main(String[] args) {
		
		// 새 창 띄우기
		JFrame frame = new JFrame("SnowCastle");
		frame.setSize(1920,1080);//프레임의 크기
		frame.setResizable(false);//창의 크기를 변경하지 못하게
		frame.setLocationRelativeTo(null);//창이 가운데 나오게
		frame.setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		
		
		// 처음 스플래쉬 화면 띄우기
		ImageIcon ii = new ImageIcon("../game/src/SnowCastle/winterBack1.png");
		JLabel jl = new JLabel(ii);
		jl.setSize(1920,1080);
		frame.add(jl);
		frame.setLayout(null);
		frame.setVisible(true);
		

	}
}


