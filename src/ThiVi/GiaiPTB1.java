package ThiVi;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.awt.event.ActionEvent;

public class GiaiPTB1 extends JFrame {

	private JPanel contentPane;
	
	private JTextField txtA;
	private JLabel lbB;
	private JTextField txtB;
	private JLabel lbkq;
	private JTextField txtkq;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaiPTB1 frame = new GiaiPTB1();
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
	public GiaiPTB1() {
		setFont(new Font("Dialog", Font.BOLD, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtA = new JTextField();
		txtA.setBounds(285, 100, 96, 19);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		JLabel lbA = new JLabel("Nhập A :");
		lbA.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbA.setBounds(129, 103, 75, 16);
		contentPane.add(lbA);
		
		lbB = new JLabel("Nhập B :");
		lbB.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbB.setBounds(129, 160, 70, 13);
		contentPane.add(lbB);
		
		txtB = new JTextField();
		txtB.setBounds(285, 158, 96, 19);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		lbkq = new JLabel("Kết Qủa X=");
		lbkq.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbkq.setBounds(129, 337, 96, 26);
		contentPane.add(lbkq);
		
		txtkq = new JTextField();
		txtkq.setBounds(285, 342, 96, 19);
		contentPane.add(txtkq);
		txtkq.setColumns(10);
		
		JButton btnGiai = new JButton("Tìm nghiệm");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtA.getText());
				int b = Integer.parseInt(txtB.getText());
				if(a==0 && b==0) {
					txtkq.setText("Kết quả: PT có vô số nghiệm" );
				}
				else if (a==0 && b!=0) {
					txtkq.setText("Kết quả: PT vô nghiệm " );
				}
				else {
					txtkq.setText("Kết quả: " +(-b/a));
				}
			}
		});
		btnGiai.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnGiai.setBounds(183, 239, 136, 41);
		contentPane.add(btnGiai);
		
		JLabel lblNewLabel = new JLabel("GIẢI PHƯƠNG TRÌNH BẬC NHẤT AX+B=0");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(57, 25, 446, 49);
		contentPane.add(lblNewLabel);
		
	}
}
