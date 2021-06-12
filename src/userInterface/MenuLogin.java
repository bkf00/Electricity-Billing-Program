package userInterface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class MenuLogin extends JFrame {

	private JPanel contentPane;

	public MenuLogin() {
		setTitle("Welcome!");
		setIconImage(Toolkit.getDefaultToolkit().getImage("Resources/Program_Icon.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(650, 200, 700, 600);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton LoginUserButton = new JButton("");
		LoginUserButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientLogin jfrm3 = new ClientLogin();
				jfrm3.setVisible(true);
		        setVisible(false);
		        setDefaultCloseOperation(EXIT_ON_CLOSE);
		        dispose();
			}
		});
		
		JButton ProfileExit = new JButton("Exit");
		ProfileExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		ProfileExit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ProfileExit.setBounds(295, 498, 98, 46);
		contentPane.add(ProfileExit);
		LoginUserButton.setIcon(new ImageIcon("Resources/Button_Client(2).png"));
		LoginUserButton.setBounds(363, 263, 200, 120);
		contentPane.add(LoginUserButton);
		
		JButton LoginAdminButton = new JButton("");
		LoginAdminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPass jfrm11 = new AdminPass();
				jfrm11.setVisible(true);
		        setVisible(false);
		        setDefaultCloseOperation(EXIT_ON_CLOSE);
		        dispose();
			}
		});
		LoginAdminButton.setIcon(new ImageIcon("Resources/Button_Admin(2).png"));
		LoginAdminButton.setBounds(126, 263, 200, 120);
		contentPane.add(LoginAdminButton);
		
		JLabel LoginTitleLabel = new JLabel("WELCOME!");
		LoginTitleLabel.setForeground(new Color(147, 112, 219));
		LoginTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 44));
		LoginTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		LoginTitleLabel.setBounds(209, 40, 274, 71);
		contentPane.add(LoginTitleLabel);
		
		JLabel LoginBackgroundLabel = new JLabel("New label");
		LoginBackgroundLabel.setIcon(new ImageIcon("Resources/Main_Menu_NoLogo(1).png"));
		LoginBackgroundLabel.setBounds(0, 0, 694, 571);
		contentPane.add(LoginBackgroundLabel);
	}
}
