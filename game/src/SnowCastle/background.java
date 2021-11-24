package SnowCastle;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class background extends JFrame {
	
	public static void main(String[] args){
		
		JFrame f = new JFrame("SnowCastle");
		f.setSize(1600, 900);
		f.setVisible(true);
		f.setResizable(false);//창의 크기를 변경하지 못하게
		f.setLocationRelativeTo(null);//창이 가운데 나오게
		
		// 스윙에서 창 닫기 싱행 정의
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ImageIcon image = new ImageIcon("../src/image/back.png");
		// 주석해보기
		f.getContentPane().setBackground(Color.black);
		/*JLabel jla = new JLabel(image);
		jla.setSize(1600, 900);
		f.add(jla);*/
		//jla.setVisible(true);
	}
}