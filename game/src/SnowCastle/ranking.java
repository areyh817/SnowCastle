package SnowCastle;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

public class ranking extends JFrame implements ActionListener {
	
	JFrame frame = new JFrame("SnowCastle");
	public Label la = new Label();
	JLabel j1 = new JLabel();
    Connection conn = null;
    PreparedStatement pstmt = null;
    Statement stmt = null; // SQL 문을 데이터베이스에 보내기위한 객체 
    ResultSet rs = null;
	JTextArea txtResult = new JTextArea();
	JTextField txt = new JTextField();
	Font font = new Font("나눔스퀘어", Font.BOLD, 28);

	
	public ranking() {
		
		//JFrame frame = new JFrame("SnowCastle");
		frame.setSize(1920,1080);//프레임의 크기
		frame.setResizable(false);//창의 크기를 변경하지 못하게
		frame.setLocationRelativeTo(null);//창이 가운데 나오게
		frame.setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		
		ImageIcon ii = new ImageIcon("../game/src/SnowCastle/bigranking.png");
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
		
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3308/snow";
            conn = DriverManager.getConnection(url, "root", "2118");
            String SQL = "SELECT * FROM score order by score desc";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);
            System.out.println("연결 성공");
            
            while (rs.next()) { 
            	String name = rs.getString("name"); 
            	int score = rs.getInt("score");
            	System.out.println(name + " " + score); 
				jl.add(txtResult);
				txtResult.setVisible(true);
				txtResult.setBounds(850, 400, 400, 900);
				txtResult.setOpaque(false);
				Color color = new Color(0, 1, 245);
				txtResult.setForeground(color);
				txtResult.setFont(font);
				String str = rs.getString("name") + "\t" + rs.getInt("score")+"\n";  
				txtResult.append(str); 

            }

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
	}
	
	public void gameDesc() {

	}
	
	public static void main(String[] args) {
		ranking q = new ranking();
	}

}
