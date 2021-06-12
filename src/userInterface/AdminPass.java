package userInterface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminPass extends JFrame {

	private JPanel contentPane;
	private JPasswordField AdminPassField;

	public AdminPass() {
		setTitle("Admin");
		setIconImage(Toolkit.getDefaultToolkit().getImage("Resources/Program_Icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 200, 700, 600);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton AdminLoginButton = new JButton("Login");
		AdminLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String adminpass = AdminPassField.getText();
				if(adminpass.equals("admin"))
				{
					Menu1 jfrm9 = new Menu1();
					jfrm9.setVisible(true);
			        setVisible(false);
			        setDefaultCloseOperation(EXIT_ON_CLOSE);
			        dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Password Incorrect", "Error", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		AdminLoginButton.setBounds(297, 274, 89, 23);
		contentPane.add(AdminLoginButton);
		
		AdminPassField = new JPasswordField();
		AdminPassField.setBounds(252, 219, 179, 20);
		contentPane.add(AdminPassField);
		
		JLabel AdminPasswordLabel = new JLabel("Password:");
		AdminPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		AdminPasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AdminPasswordLabel.setBounds(252, 138, 179, 42);
		contentPane.add(AdminPasswordLabel);
		
		JLabel AdminPassBackgroundLabel = new JLabel("New label");
		AdminPassBackgroundLabel.setIcon(new ImageIcon("Resources/Main_Menu_NoLogo(1).png"));
		AdminPassBackgroundLabel.setBounds(0, 0, 694, 571);
		contentPane.add(AdminPassBackgroundLabel);
	}
}
