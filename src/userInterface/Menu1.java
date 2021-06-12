package userInterface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Component;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import static code.AddKwh.AddRandomKwh;

public class Menu1 extends JFrame {

	private JPanel contentPane;

	public Menu1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Resources/Program_Icon.png"));
		setTitle("Electricity Billing Program");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(650, 200, 700, 600);
		setResizable(false);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		Component horizontalStrut = Box.createHorizontalStrut(647);
		menuBar.add(horizontalStrut);

		JMenu mnNewMenu = new JMenu("Help");
		menuBar.add(mnNewMenu);
		JMenuItem mntmNewMenuItem = new JMenuItem("Contact Page");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Contact Us\n\nxxxxxxxxx@gmail.com\n0729xxxxxx", "Contact Information", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);;

		JButton btnNewButton = new JButton("Back to Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuLogin jfrm12 = new MenuLogin();
				jfrm12.setVisible(true);
				setVisible(false);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				dispose();
			}
		});
		btnNewButton.setBounds(32, 471, 124, 23);
		contentPane.add(btnNewButton);

		JLabel MainTitleLabel = new JLabel("Billing Database");
		MainTitleLabel.setBackground(Color.WHITE);
		MainTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		MainTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		MainTitleLabel.setForeground(new Color(147, 112, 219));
		MainTitleLabel.setBounds(182, 11, 329, 61);
		contentPane.add(MainTitleLabel);

		JButton MainExitButton = new JButton("Exit");
		MainExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		MainExitButton.setBounds(308, 465, 89, 35);
		contentPane.add(MainExitButton);

		JButton AddButton = new JButton("");
		AddButton.setIcon(new ImageIcon("Resources/Button_AddkWh(2).png"));
		AddButton.setBackground(new Color(255, 255, 255));
		AddButton.setSelectedIcon(null);
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddRandomKwh();
			}
		});
		AddButton.setBounds(196, 183, 300, 150);
		contentPane.add(AddButton);

		JLabel MainBackgoundLabel = new JLabel("New label");
		MainBackgoundLabel.setIcon(new ImageIcon("Resources/Main_Menu_(1).png"));
		MainBackgoundLabel.setBounds(0, 0, 694, 549);
		contentPane.add(MainBackgoundLabel);

	}
}