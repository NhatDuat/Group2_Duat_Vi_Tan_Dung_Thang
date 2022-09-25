package Thang;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckSNTO extends JFrame {

	private JPanel contentPane;
	private JTextField txtn;
	private JTextField txtkq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckSNTO frame = new CheckSNTO();
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
	public CheckSNTO() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtn = new JTextField();
		txtn.setBounds(157, 49, 237, 20);
		contentPane.add(txtn);
		txtn.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nhập n: ");
		lblNewLabel.setBounds(80, 52, 49, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnCheck = new JButton("Kiểm tra");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtn.getText());
				if(n <= 1) {
					txtkq.setText(n + " không phải là số nguyên tố");
				}
				for(int i =2 ; i <=n/2 ; i++) {
					if(n%i ==0 ) {
						txtkq.setText(n + " không phải là số nguyên tố");
					}else {
						txtkq.setText(n + " là số nguyên tố");
					}
				}
				
			}
		});
		btnCheck.setBounds(40, 95, 89, 23);
		contentPane.add(btnCheck);
		
		txtkq = new JTextField();
		txtkq.setBounds(157, 96, 237, 20);
		contentPane.add(txtkq);
		txtkq.setColumns(10);
	}
}
