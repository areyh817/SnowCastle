package SnowCastle;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class background extends JFrame {
	
	public static void main(String[] args){
		
		JFrame f = new JFrame("SnowCastle");
		f.setSize(1600, 900);
		f.setVisible(true);
		
		// ½ºÀ®¿¡¼­ Ã¢ ´Ý±â ½ÌÇà Á¤ÀÇ
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon imgicon = new ImageIcon("./image/back.png");
		JLabel jla = new JLabel(imgicon);
		jla.setSize(1600, 900);
		jla.setVisible(true);
	}
}