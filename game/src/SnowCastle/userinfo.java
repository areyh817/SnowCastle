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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class userinfo extends JFrame implements ActionListener {
	
	JFrame frame = new JFrame("SnowCastle");
	public Label la = new Label();
	String name;
    Connection conn = null;
    PreparedStatement pstmt = null;
    
	public userinfo() {
		
		//JFrame frame = new JFrame("SnowCastle");
		frame.setSize(1920,1080);//프레임의 크기
		frame.setResizable(false);//창의 크기를 변경하지 못하게
		frame.setLocationRelativeTo(null);//창이 가운데 나오게
		frame.setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		
		ImageIcon ii = new ImageIcon("../game/src/SnowCastle/biginfo.png");
		JLabel jl = new JLabel(ii);
		jl.setSize(1920, 1080);
		frame.add(jl);
		frame.setLayout(null);
		frame.setVisible(true);
		
		Font font = new Font("Neo둥근모 Pro", Font.BOLD, 23);
		JPanel main_pannel;
		JButton btnStart;
		JLabel LogoImageBox;
		JTextField inputName;
		
		inputName = new JTextField(50);
		jl.add(inputName);
		inputName.setFont(font);
		inputName.setBorder(BorderFactory.createMatteBorder(3, 0, 3, 0, Color.WHITE));
		inputName.setBounds(665, 600, 548, 100);
		inputName.setText("");
		inputName.setOpaque(false);
		inputName.setEditable(true);

		
		ImageIcon img = new ImageIcon("../game/src/SnowCastle/startBtn.png");
		
		Image originImg = img.getImage(); 
		Image changedImg= originImg.getScaledInstance(300, 140, Image.SCALE_SMOOTH );
		ImageIcon startbtn = new ImageIcon(changedImg);
		
		main_pannel = new JPanel();		// 패널 객체화 
		btnStart = new JButton(startbtn);
		jl.add(btnStart);
		btnStart.setBounds(730, 750, 400, 180); // 좌표, 가로, 세로 설정
		btnStart.setBorderPainted(false);
		btnStart.setContentAreaFilled(false);
		btnStart.setOpaque(false);
		btnStart.setVisible(true);
		
		// 시작 버튼 클릭
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new scoreTest();
				name = inputName.getText();
				int score = 1050;
		        try{
		            Class.forName("com.mysql.jdbc.Driver");
		            String url = "jdbc:mysql://localhost:3308/snow";
		            conn = DriverManager.getConnection(url, "root", "2118");
		            String SQL = "insert into score values(?, ?)";
		            pstmt = conn.prepareStatement(SQL);
		            pstmt.setLong(1, score);
		            pstmt.setString(2, name);
		            pstmt.executeUpdate();
		            System.out.println("연결 성공");
		            System.out.println(name);

		        }
		        catch(ClassNotFoundException e1){
		            System.out.println("드라이버 로딩 실패");
		        }
		        catch(SQLException e1){
		            System.out.println("에러: " + e1);
		        }
		        finally{
		            try{
		                if( conn != null && !conn.isClosed()){
		                    conn.close();
		                }
		            }
		            catch( SQLException e1){
		                e1.printStackTrace();
		            }
		        }
			}
		});
	}
	
	public void gameDesc() {

	}
	
	public static void main(String[] args) {
		userinfo user = new userinfo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
