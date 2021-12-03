package SnowCastle;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.ArrayList;



import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextField;



public class Car {

	public static void main(String[] args) {

		Custom c = new Custom();

	}

}



class Custom extends JFrame {



	private JTextField field, field2, field3;

	private JLabel label, label2, label3, label4;

	private JPanel panel;

	private JButton button, button2;

	private ArrayList<String> list = new ArrayList<String>();

	private ActionListener ml = new ml();

	String color, speed, mileage;



	public Custom() {

		this.setTitle("두번째");

		this.setSize(300, 400);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		field = new JTextField(5);

		field2 = new JTextField(5);

		field3 = new JTextField(5);

		label = new JLabel("모든 자동차 내용 출력");

		label2 = new JLabel("색상");

		label3 = new JLabel("속도");

		label4 = new JLabel("주행거리");

		panel = new JPanel();

		button = new JButton("입력");

		button2 = new JButton("출력");



		field.setText("");

		field2.setText("");

		field3.setText("");

		button.addActionListener(ml);

		button2.addActionListener(ml);



		panel.add(label2);

		panel.add(field);

		panel.add(label3);

		panel.add(field2);

		panel.add(label4);

		panel.add(field3);

		panel.add(button);

		panel.add(button2);

		panel.add(label);



		this.add(panel);

		this.setVisible(true);



	}



	class ml implements ActionListener {



		@Override

		public void actionPerformed(ActionEvent e) {

			// TODO Auto-generated method stub



			if (e.getSource() == button) {

				color = String.valueOf(field.getText());
				speed = String.valueOf(field2.getText());
				mileage = String.valueOf(field3.getText());



				list.add(color);

				list.add(speed);

				list.add(mileage);

			} else if (e.getSource() == button2) {

				for (String c : list)

					label.setText(list.toString());

			}

		}

	}

}