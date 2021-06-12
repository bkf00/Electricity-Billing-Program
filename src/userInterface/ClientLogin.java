package userInterface;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

import static code.CheckUserPass.checkPass;
import static code.CheckUserPass.checkUser;
import static code.Encrypting.toHex;
import static code.Encrypting.toPassword;

public class ClientLogin extends JFrame {

    private JPanel contentPane;
    private JTextField ClientCodeField;
    private JPasswordField ClientPass;

    public ClientLogin() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("Resources/Program_Icon.png"));
        setTitle("Client Login");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(650, 200, 700, 600);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton ClientCheckButton = new JButton("Check");
        ClientCheckButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String userid = toHex(ClientCodeField.getText());
                if (checkUser(toHex(ClientCodeField.getText())) == true) {
                    if (checkPass(toHex(ClientCodeField.getText()), toPassword((ClientPass.getText()))) == true) {
                        ClientHub jfrm13 = new ClientHub(toHex(ClientCodeField.getText()),toPassword((ClientPass.getText())));
                        jfrm13.setVisible(true);
                        setVisible(false);
                        setDefaultCloseOperation(EXIT_ON_CLOSE);
                        dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Password Incorrect", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    NewClient jfrm8 = new NewClient();
                    jfrm8.setVisible(true);
                    setVisible(false);
                    setDefaultCloseOperation(EXIT_ON_CLOSE);
                    dispose();
                }
            }
        });
        
        JButton btnNewButton = new JButton("Back to login");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		MenuLogin jfrm12 = new MenuLogin();
				jfrm12.setVisible(true);
				setVisible(false);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				dispose();
        	}
        });
        btnNewButton.setBounds(32, 519, 111, 21);
        contentPane.add(btnNewButton);
        ClientCheckButton.setBounds(295, 274, 89, 23);
        contentPane.add(ClientCheckButton);

        ClientCodeField = new JTextField();
        ClientCodeField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ClientCodeField.setHorizontalAlignment(SwingConstants.CENTER);
        ClientCodeField.setBounds(226, 149, 223, 36);
        contentPane.add(ClientCodeField);
        ClientCodeField.setColumns(10);

        ClientPass = new JPasswordField();
        ClientPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ClientPass.setHorizontalAlignment(SwingConstants.CENTER);
        ClientPass.setBounds(226, 275, 223, 36);
        contentPane.add(ClientPass);

        JLabel ClientPassLabel = new JLabel("Password:");
        ClientPassLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ClientPassLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ClientPassLabel.setBounds(226, 221, 223, 43);
        contentPane.add(ClientPassLabel);
        ClientCheckButton.setBounds(295, 444, 89, 23);
        contentPane.add(ClientCheckButton);

        JLabel ClientCodeLabel = new JLabel("Introduce your client code: ");
        ClientCodeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ClientCodeLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ClientCodeLabel.setBounds(226, 95, 223, 43);
        contentPane.add(ClientCodeLabel);

        JLabel ClientLoginBackgroundLabel = new JLabel("New label");
        ClientLoginBackgroundLabel.setIcon(new ImageIcon("Resources/Main_Menu_NoLogo(1).png"));
        ClientLoginBackgroundLabel.setBounds(0, 0, 694, 571);
        contentPane.add(ClientLoginBackgroundLabel);

    }
}
