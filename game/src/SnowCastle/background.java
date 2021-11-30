package SnowCastle;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class background extends JFrame {
	
    JScrollPane scrollPane;
    ImageIcon icon;
    
    public background() {

	    // �����ڿ� ico ȣ�� �ϰ� �̹��� ��� ����...(����η� �ȵɰ�� ������ ����)
    	ImageIcon ii = new ImageIcon(this.getClass().getResource("winter_back.png"));
	
	   // ��׶��� �̹��� ������ �޼ҵ忡 �̸����� Ŭ������ ����
	    JPanel panel = new JPanel() {
	        public void paintComponent(Graphics g) {
	            //  Approach 1: Dispaly image at at full size
	            g.drawImage(icon.getImage(), 0, 0, null);
	            //  Approach 2: Scale image to size of component
	            // Dimension d = getSize();
	            // g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
	            // Approach 3: Fix the image position in the scroll pane
	            // Point p = scrollPane.getViewport().getViewPosition();
	            // g.drawImage(icon.getImage(), p.x, p.y, null);
	            setOpaque(false);
	            super.paintComponent(g);
	        }
	    };
	    //JButton button = new JButton("Hello");
	    //panel.add(button);
	    scrollPane = new JScrollPane(panel);
	    setContentPane(scrollPane);
	}
	
	public static void main(String[] args) {
		background frame = new background();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(1920, 1080);
	    frame.setVisible(true);
	}
}


