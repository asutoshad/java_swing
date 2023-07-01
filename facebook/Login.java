package facebook;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField emailTxt;
	private JPasswordField passwordTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Facebook");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\coola\\Downloads\\icons8-facebook-48.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Facebook");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(351, 27, 144, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(69, 85, 102, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setBounds(208, 131, 102, 36);
		contentPane.add(lblNewLabel_2);
		
		emailTxt = new JTextField();
		emailTxt.setFont(new Font("Tahoma", Font.BOLD, 18));
		emailTxt.setBounds(320, 131, 364, 42);
		contentPane.add(emailTxt);
		emailTxt.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(187, 231, 121, 36);
		contentPane.add(lblNewLabel_3);
		
		passwordTxt = new JPasswordField();
		passwordTxt.setFont(new Font("Tahoma", Font.BOLD, 18));
		passwordTxt.setBounds(320, 231, 364, 42);
		contentPane.add(passwordTxt);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "Hello");
				//login form validation
				
				
				if(emailTxt.getText().isBlank()) {
					JOptionPane.showMessageDialog(emailTxt, "email is required !!");
					return;
				}
				if(passwordTxt.getText().isBlank()) {
					JOptionPane.showMessageDialog(passwordTxt, "password is required !!");
					return;
				}
				
				
				
				String psw = passwordTxt.getText();
				String em = emailTxt.getText();
				if(em.equals("hari@gmail.com") && psw.equals("123")) {
					
					JOptionPane.showMessageDialog(null, "Login Success");
					new Home().setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Login Failed");
				}
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(443, 331, 144, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Create New Account");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Register().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_1.setForeground(new Color(0, 0, 255));
		btnNewButton_1.setBounds(597, 332, 203, 42);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("create new account");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Register().setVisible(true);
			}
		});
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setBounds(75, 331, 203, 42);
		contentPane.add(lblNewLabel_4);
		
		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		cancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cancel.setForeground(Color.BLUE);
		cancel.setBounds(288, 331, 111, 42);
		contentPane.add(cancel);
	}

}
