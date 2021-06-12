package userInterface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static code.Appending.writing;
import static code.Encrypting.toHex;
import static code.Encrypting.toPassword;

public class NewClient extends JFrame {

	private JPanel contentPane;
	private JTextField NewNameField;
	private JTextField NewIDField;
	private JPasswordField NewPassField;
	private JTextField NewCountryField;
	private JTextField NewAddressField;
	private JTextField NewPhoneField;

	public NewClient() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Resources/Program_Icon.png"));
		setTitle("New Client");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(650, 200, 700, 600);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton NewClientAddButton = new JButton("Add");
		NewClientAddButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				writing(NewIDField.getText(),NewNameField.getText(),NewPassField.getText(),NewCountryField.getText(),NewAddressField.getText(),NewPhoneField.getText(),"0");
				ClientHub jfrm13 = new ClientHub(toHex(NewIDField.getText()),toPassword(NewPassField.getText()));
				jfrm13.setVisible(true);
				setVisible(false);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				dispose();

			}
		});
		
		JButton btnNewButton = new JButton("Back to login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuLogin jfrm12 = new MenuLogin();
				jfrm12.setVisible(true);
				setVisible(false);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				dispose();
			}
		});
		btnNewButton.setBounds(429, 513, 113, 21);
		contentPane.add(btnNewButton);
		NewClientAddButton.setBounds(566, 512, 89, 23);
		contentPane.add(NewClientAddButton);
		
		NewPhoneField = new JTextField();
		NewPhoneField.setBounds(42, 477, 212, 20);
		contentPane.add(NewPhoneField);
		NewPhoneField.setColumns(10);
		
		NewAddressField = new JTextField();
		NewAddressField.setBounds(42, 401, 212, 20);
		contentPane.add(NewAddressField);
		NewAddressField.setColumns(10);
		
		NewCountryField = new JTextField();
		NewCountryField.setBounds(42, 325, 212, 20);
		contentPane.add(NewCountryField);
		NewCountryField.setColumns(10);
		
		NewPassField = new JPasswordField();
		NewPassField.setBounds(42, 252, 212, 20);
		contentPane.add(NewPassField);
		
		NewIDField = new JTextField();
		NewIDField.setBounds(42, 183, 212, 20);
		contentPane.add(NewIDField);
		NewIDField.setColumns(10);
		
		NewNameField = new JTextField();
		NewNameField.setBounds(42, 114, 212, 20);
		contentPane.add(NewNameField);
		NewNameField.setColumns(10);
		
		JLabel NewPhoneLabel = new JLabel("Telephone: [eg. 0729xxxxxx]");
		NewPhoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		NewPhoneLabel.setBounds(32, 452, 623, 23);
		contentPane.add(NewPhoneLabel);
		
		JLabel NewAddressLabel = new JLabel("Address: [City + Street + Number]");
		NewAddressLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		NewAddressLabel.setBounds(32, 376, 623, 23);
		contentPane.add(NewAddressLabel);
		
		JLabel NewCountryLabel = new JLabel("Country: ");
		NewCountryLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		NewCountryLabel.setBounds(32, 300, 623, 23);
		contentPane.add(NewCountryLabel);
		
		JLabel NewPassLabel = new JLabel("Password: ");
		NewPassLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		NewPassLabel.setBounds(32, 227, 623, 23);
		contentPane.add(NewPassLabel);
		
		JLabel NewIDLabel = new JLabel("Client ID: [It will be used to login into the application]");
		NewIDLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		NewIDLabel.setBounds(32, 158, 623, 20);
		contentPane.add(NewIDLabel);
		
		JLabel NewNameLabel = new JLabel("Your full name: [Last Name + First Name]");
		NewNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		NewNameLabel.setBounds(32, 89, 623, 20);
		contentPane.add(NewNameLabel);
		
		JLabel NewClientTitleLabel = new JLabel("You do not have an account yet, please introduce the required data:");
		NewClientTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		NewClientTitleLabel.setBounds(32, 24, 623, 33);
		contentPane.add(NewClientTitleLabel);
		
		JLabel NewClientBackgroundLabel = new JLabel("New label");
		NewClientBackgroundLabel.setIcon(new ImageIcon("Resources/Main_Menu_NoLogo(1).png"));
		NewClientBackgroundLabel.setBounds(0, 0, 694, 571);
		contentPane.add(NewClientBackgroundLabel);
	}
}
