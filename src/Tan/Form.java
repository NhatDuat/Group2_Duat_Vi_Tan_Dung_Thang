package Tan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form extends JFrame {

	private JPanel contentPane;
	private JTextField txtb;
	private JLabel lblNewLabel;
	private JTextField txta;
	private JTextField txtkq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
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
	public Form() {
		setFont(new Font("Dialog", Font.BOLD, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Nhập a:");
		lblNewLabel.setBounds(24, 13, 49, 14);
		contentPane.add(lblNewLabel);
		
		txta = new JTextField();
		txta.setBounds(102, 10, 96, 20);
		txta.setColumns(10);
		contentPane.add(txta);
		
		JLabel lblNewLabel_1 = new JLabel("nhập b");
		lblNewLabel_1.setBounds(24, 40, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		txtb = new JTextField();
		txtb.setBounds(102, 37, 96, 20);
		contentPane.add(txtb);
		txtb.setColumns(10);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txta.getText());
				int b = Integer.parseInt(txtb.getText());
				txtkq.setText("Kết quả: " + (a+b));
			}
		});
		btnCong.setBounds(24, 91, 89, 23);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txta.getText());
				int b = Integer.parseInt(txtb.getText());
				txtkq.setText("Kết quả: " + (a-b));
			}
			
		});
		btnTru.setBounds(147, 91, 89, 23);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân ");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txta.getText());
				int b = Integer.parseInt(txtb.getText());
				txtkq.setText("Kết quả: " + (a*b));
			}
		});
		btnNhan.setBounds(262, 91, 89, 23);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txta.getText());
				int b = Integer.parseInt(txtb.getText());
				txtkq.setText("Kết quả: " + (a/b));
			}
		});
		btnChia.setBounds(400, 91, 89, 23);
		contentPane.add(btnChia);
		
		txtkq = new JTextField();
		txtkq.setBounds(255, 10, 96, 20);
		contentPane.add(txtkq);
		txtkq.setColumns(10);
	}
}
