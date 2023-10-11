package com.iteso.pruebasGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class DateFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDay;
	private JTextField txtMonth;
	private JTextField txtYear;
	private JTextField txtFormat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DateFrame frame = new DateFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	
	
	}

	/**
	 * Create the frame.
	 */
	public DateFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATE");
		lblNewLabel.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 18));
		lblNewLabel.setBounds(133, 11, 45, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Día");
		lblNewLabel_1.setBounds(58, 85, 48, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mes:");
		lblNewLabel_2.setBounds(58, 136, 48, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Año:");
		lblNewLabel_3.setBounds(58, 185, 48, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lbDate = new JLabel("");
		lbDate.setHorizontalAlignment(SwingConstants.CENTER);
		lbDate.setBounds(66, 333, 162, 25);
		contentPane.add(lbDate);
		
		JButton btnNewButton = new JButton("Fecha");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int d, m, y, f;
				if(txtDay.getText()!= null) {
					System.out.println(txtDay.getText());
				
					d = Integer.valueOf(txtDay.getText());	}
				else {d = 1;}
				m = Integer.valueOf(txtMonth.getText());
				y = Integer.valueOf(txtYear.getText());
				f = Integer.valueOf(txtFormat.getText());
				Date d1 = new Date(d, m, y, f);
				
				lbDate.setText(String.valueOf(d1));
			}
		});
		btnNewButton.setBounds(104, 294, 89, 23);
		contentPane.add(btnNewButton);
		
		txtDay = new JTextField();
		txtDay.setBounds(159, 82, 96, 20);
		contentPane.add(txtDay);
		txtDay.setColumns(10);
		
		txtMonth = new JTextField();
		txtMonth.setBounds(159, 133, 96, 20);
		contentPane.add(txtMonth);
		txtMonth.setColumns(10);
		
		txtYear = new JTextField();
		txtYear.setBounds(159, 182, 96, 20);
		contentPane.add(txtYear);
		txtYear.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Format:");
		lblNewLabel_4.setBounds(58, 232, 48, 14);
		contentPane.add(lblNewLabel_4);
		
		txtFormat = new JTextField();
		txtFormat.setBounds(159, 229, 96, 20);
		contentPane.add(txtFormat);
		txtFormat.setColumns(10);
		
		
	}
}
