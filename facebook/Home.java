package facebook;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 839, 480);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Open");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Register().setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Setting");
		mnNewMenu.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Momo");
		mnNewMenu.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Veg");
		mnNewMenu_2.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Sadeko");
		mnNewMenu_3.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Banana");
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		JMenuBar menuBar_1 = new JMenuBar();
		mnNewMenu.add(menuBar_1);
		
		JMenu mnNewMenu_4 = new JMenu("Shortcuts");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Save ");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mntmNewMenuItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_4.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Back ");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Register().setVisible(true);
				dispose();
			}
		});
		mntmNewMenuItem_5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_4.add(mntmNewMenuItem_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setBounds(368, 24, 124, 31);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome");
		lblNewLabel_1.setBounds(83, 107, 151, 51);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 28));
		lblNewLabel_1.setForeground(Color.BLUE);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Logout Successfully");
				new Register().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(648, 111, 133, 51);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome to Facebook home page.");
		lblNewLabel_2.setBounds(323, 308, 303, 73);
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 297, 794, 31);
		contentPane.add(separator);
	}
}
