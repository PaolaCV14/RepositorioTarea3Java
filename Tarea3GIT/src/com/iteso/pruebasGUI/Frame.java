package com.iteso.pruebasGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;

public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initialize();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
		
			
	private static void initialize() {
		Frame frame = new Frame();
		frame.setVisible(true);
		
		
	}
	
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("YOUR CALENDAR");
		lblNewLabel.setFont(new Font("Bodoni MT Poster Compressed", Font.BOLD, 30));
		lblNewLabel.setBounds(187, 11, 141, 66);
		contentPane.add(lblNewLabel);
		
		JButton btnDate = new JButton("Date");
		btnDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DateFrame dateFrame = new DateFrame();
				setVisible(false);
				dispose();
				dateFrame.setVisible(true);
			}
		});
		btnDate.setBounds(197, 88, 99, 30);
		contentPane.add(btnDate);
		
		JButton btnTime = new JButton("Date Time");
		btnTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DateTimeFrame dateTimeFrame = new DateTimeFrame();
				setVisible(false);
				dispose();
				dateTimeFrame.setVisible(true);
			}
		});
		btnTime.setBounds(188, 153, 126, 30);
		contentPane.add(btnTime);
		
		JLabel imgLb = new JLabel("");
		
		Image img = new ImageIcon(this.getClass().getResource("/clndrpng.png")).getImage();
		imgLb.setIcon(new ImageIcon (img));
		imgLb.setBounds(415, 33, 157, 164);
		img.getScaledInstance(imgLb.getWidth(), imgLb.getHeight(), DO_NOTHING_ON_CLOSE);
		
		contentPane.add(imgLb);
	}
}
