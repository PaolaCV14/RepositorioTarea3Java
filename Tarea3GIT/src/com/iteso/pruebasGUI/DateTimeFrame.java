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

public class DateTimeFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDD;
	private JTextField txtMM;
	private JTextField txtYY;
	private JTextField txtHH;
	private JTextField txtMI;
	private JTextField txtSS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DateTimeFrame frame = new DateTimeFrame();
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
	public DateTimeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATE TIME");
		lblNewLabel.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 18));
		lblNewLabel.setBounds(74, 11, 87, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Día:");
		lblNewLabel_1.setBounds(41, 52, 48, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mes:");
		lblNewLabel_2.setBounds(41, 92, 48, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Año:");
		lblNewLabel_3.setBounds(41, 127, 48, 14);
		contentPane.add(lblNewLabel_3);
		
		txtDD = new JTextField();
		txtDD.setBounds(144, 49, 96, 20);
		contentPane.add(txtDD);
		txtDD.setColumns(10);
		
		txtMM = new JTextField();
		txtMM.setBounds(144, 89, 96, 20);
		contentPane.add(txtMM);
		txtMM.setColumns(10);
		
		txtYY = new JTextField();
		txtYY.setBounds(144, 124, 96, 20);
		contentPane.add(txtYY);
		txtYY.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Hora:");
		lblNewLabel_4.setBounds(41, 177, 48, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Minutos:");
		lblNewLabel_5.setBounds(41, 202, 60, 23);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Segundos:");
		lblNewLabel_6.setBounds(41, 239, 79, 17);
		contentPane.add(lblNewLabel_6);
		
		txtHH = new JTextField();
		txtHH.setBounds(144, 174, 96, 20);
		contentPane.add(txtHH);
		txtHH.setColumns(10);
		
		txtMI = new JTextField();
		txtMI.setBounds(144, 205, 96, 20);
		contentPane.add(txtMI);
		txtMI.setColumns(10);
		
		txtSS = new JTextField();
		txtSS.setBounds(144, 236, 96, 20);
		contentPane.add(txtSS);
		txtSS.setColumns(10);
		
		JLabel fyhLb = new JLabel("");
		fyhLb.setHorizontalAlignment(SwingConstants.CENTER);
		fyhLb.setBounds(10, 330, 263, 37);
		contentPane.add(fyhLb);

		JButton btnFYH = new JButton("Fechas y hora");
		btnFYH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int d, m, y, ss, mi, hh, f = 0;
			d = Integer.valueOf(txtDD.getText());
			m = Integer.valueOf(txtMM.getText());
			y = Integer.valueOf(txtYY.getText());
			ss = Integer.valueOf(txtSS.getText());
			mi = Integer.valueOf(txtMI.getText());
			hh = Integer.valueOf(txtHH.getText());
			
			DateTime d1 = new DateTime(d, m, y, ss, mi, hh, f);
			fyhLb.setText(String.valueOf(d1));
			}
		});
		btnFYH.setBounds(89, 296, 116, 23);
		contentPane.add(btnFYH);
		
			}

}
