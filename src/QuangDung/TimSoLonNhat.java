package QuangDung;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TimSoLonNhat extends JFrame {

	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;
	private JTextField txtd;
	private JTextField txtkq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimSoLonNhat frame = new TimSoLonNhat();
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
	public TimSoLonNhat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbla = new JLabel("Nhập A");
		lbla.setBounds(145, 13, 45, 13);
		contentPane.add(lbla);
		
		txta = new JTextField();
		txta.setBounds(195, 10, 96, 19);
		contentPane.add(txta);
		txta.setColumns(10);
		
		JLabel lblb = new JLabel("Nhập B");
		lblb.setBounds(145, 39, 45, 13);
		contentPane.add(lblb);
		
		txtb = new JTextField();
		txtb.setColumns(10);
		txtb.setBounds(195, 36, 96, 19);
		contentPane.add(txtb);
		
		JLabel lblc = new JLabel("Nhập C");
		lblc.setBounds(145, 70, 45, 13);
		contentPane.add(lblc);
		
		txtc = new JTextField();
		txtc.setColumns(10);
		txtc.setBounds(195, 67, 96, 19);
		contentPane.add(txtc);
		
		JLabel lbld = new JLabel("Nhập D");
		lbld.setBounds(145, 101, 45, 13);
		contentPane.add(lbld);
		
		txtd = new JTextField();
		txtd.setColumns(10);
		txtd.setBounds(195, 98, 96, 19);
		contentPane.add(txtd);
		
		JLabel lblkq = new JLabel("Số lớn nhất là:");
		lblkq.setBounds(40, 187, 78, 13);
		contentPane.add(lblkq);
		
		txtkq = new JTextField();
		txtkq.setColumns(10);
		txtkq.setBounds(139, 184, 152, 19);
		contentPane.add(txtkq);
		
		JButton btnkq = new JButton("Kết quả");
		btnkq.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int a, b, c, d;
				 a = Integer.parseInt(txta.getText());
				 b = Integer.parseInt(txtb.getText());
				 c = Integer.parseInt(txtc.getText());
				 d = Integer.parseInt(txtd.getText());
				 
				 if (a >= b && a >= c && a >= d)
		                txtkq.setText("ket qua la "+a);
		            else if (b >= a && b >= c && b >= d)
		                txtkq.setText("ket qua la "+b);
		            else if (c >= a && c >= b && c >= d)
		            	txtkq.setText("ket qua la "+c);
		            else
		            	txtkq.setText("ket qua la "+d);
			}
		});
		btnkq.setBounds(21, 137, 85, 21);
		contentPane.add(btnkq);
	}
}