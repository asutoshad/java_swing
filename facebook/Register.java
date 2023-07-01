package facebook;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTxt;
	private JTextField emailTxt;
	private JPasswordField passwordTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\coola\\Downloads\\icons8-facebook-48.png"));
		setBackground(Color.WHITE);
		setForeground(Color.WHITE);
		setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		setTitle("Facebook");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Facebook");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(398, 29, 208, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Register");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(133, 65, 97, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name ");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(149, 164, 65, 28);
		contentPane.add(lblNewLabel_2);
		
		usernameTxt = new JTextField();
		usernameTxt.setFont(new Font("Tahoma", Font.BOLD, 18));
		usernameTxt.setBounds(369, 158, 150, 41);
		contentPane.add(usernameTxt);
		usernameTxt.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setBounds(151, 227, 79, 36);
		contentPane.add(lblNewLabel_3);
		
		emailTxt = new JTextField();
		emailTxt.setFont(new Font("Tahoma", Font.BOLD, 18));
		emailTxt.setBounds(369, 227, 150, 36);
		contentPane.add(emailTxt);
		emailTxt.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(133, 294, 97, 36);
		contentPane.add(lblNewLabel_4);
		
		passwordTxt = new JPasswordField();
		passwordTxt.setBounds(369, 294, 150, 36);
		contentPane.add(passwordTxt);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//JOptionPane.showMessageDialog(null, "Hello");
				//login form validation
				if(usernameTxt.getText().isBlank()) {
					JOptionPane.showMessageDialog(usernameTxt, "Username is required !!");
					return;
				}
				
				if(emailTxt.getText().isBlank()) {
					JOptionPane.showMessageDialog(emailTxt, "email is required !!");
					return;
				}
				if(passwordTxt.getText().isBlank()) {
					JOptionPane.showMessageDialog(passwordTxt, "password is required !!");
					return;
				}
				
				
				String un = usernameTxt.getText();
				String psw = passwordTxt.getText();
				String em = emailTxt.getText();
				if(un.equals("hari") && em.equals("hari@gmail.com") && psw.equals("123")) {
					
					JOptionPane.showMessageDialog(null, "Login Success");
					new Home().setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Login Failed");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(265, 357, 97, 47);
		contentPane.add(btnNewButton);
		
		JButton resetTxt = new JButton("Reset");
		resetTxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usernameTxt.setText("");
				emailTxt.setText("");
				passwordTxt.setText("");
			}
		});
		resetTxt.setForeground(Color.BLUE);
		resetTxt.setFont(new Font("Tahoma", Font.BOLD, 18));
		resetTxt.setBounds(572, 359, 114, 47);
		contentPane.add(resetTxt);
		
		JLabel lblNewLabel_5 = new JLabel("Already have Account ? login");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Login().setVisible(true);
				dispose();
			}
		});
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setBounds(572, 97, 227, 28);
		contentPane.add(lblNewLabel_5);
	}
}
