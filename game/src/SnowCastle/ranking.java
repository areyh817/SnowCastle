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
    Statement stmt = null; // SQL ���� �����ͺ��̽��� ���������� ��ü 
    ResultSet rs = null;
	JTextArea txtResult = new JTextArea();
	JTextField txt = new JTextField();
	Font font = new Font("����������", Font.BOLD, 28);

	
	public ranking() {
		
		//JFrame frame = new JFrame("SnowCastle");
		frame.setSize(1920,1080);//�������� ũ��
		frame.setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
		frame.setLocationRelativeTo(null);//â�� ��� ������
		frame.setLayout(null);//���̾ƿ��� ������� ���������ϰ� ����.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame�� ���������� ����ǰ�
		
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
		
		main_pannel = new JPanel();		// �г� ��üȭ 
		btnStart = new JButton(startbtn);
		jl.add(btnStart);
		btnStart.setBounds(760, 820, 400, 180); // ��ǥ, ����, ���� ����
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
            System.out.println("���� ����");
            
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
            System.out.println("����̹� �ε� ����");
        }
        catch(SQLException e1){
            System.out.println("����: " + e1);
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
		
		// ���� ��ư Ŭ��
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
