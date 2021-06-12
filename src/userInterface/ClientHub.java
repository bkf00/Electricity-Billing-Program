package userInterface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import static code.GetUserData.*;
import static code.KiloWattHours.kWhToPrice;

public class ClientHub extends JFrame {

    private JPanel contentPane;

    public ClientHub(String userid, String pass) {
        setIconImage(Toolkit.getDefaultToolkit().getImage("Resources/Program_Icon.png"));
        setTitle("Client Hub");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(650, 200, 700, 600);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

    
        JButton ClientHubExitButton = new JButton("Exit");
        ClientHubExitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
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
        btnNewButton.setBounds(30, 520, 110, 23);
        contentPane.add(btnNewButton);

        JLabel Pass = new JLabel(getPass(userid, pass));
        Pass.setBounds(116, 68, 46, 14);
        contentPane.add(Pass);

        JLabel PassLabel = new JLabel("Password: ");
        PassLabel.setBounds(30, 68, 68, 14);
        contentPane.add(PassLabel);

        JLabel Price = new JLabel(String.valueOf(kWhToPrice(getkWh(userid, pass)))+ " RON");
        Price.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Price.setBounds(116, 399, 535, 31);
        contentPane.add(Price);

        JLabel PriceLabel = new JLabel("Price: ");
        PriceLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        PriceLabel.setBounds(30, 399, 72, 31);
        contentPane.add(PriceLabel);

        JLabel Consumption = new JLabel(getkWh(userid, pass));
        Consumption.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Consumption.setBounds(116, 357, 535, 31);
        contentPane.add(Consumption);

        JLabel ConsumptionLabel = new JLabel("kWh: ");
        ConsumptionLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ConsumptionLabel.setBounds(30, 357, 72, 31);
        contentPane.add(ConsumptionLabel);

        JLabel BillingTitle = new JLabel("Billing Information:");
        BillingTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
        BillingTitle.setBounds(30, 315, 180, 31);
        contentPane.add(BillingTitle);

        JLabel Phone = new JLabel(getNumber(userid, pass));
        Phone.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Phone.setBounds(120, 222, 531, 31);
        contentPane.add(Phone);

        JLabel PhoneLabel = new JLabel("Telephone: ");
        PhoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        PhoneLabel.setBounds(30, 222, 80, 31);
        contentPane.add(PhoneLabel);

        JLabel Address = new JLabel(getAddress(userid, pass));
        Address.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Address.setBounds(120, 180, 531, 31);
        contentPane.add(Address);

        JLabel AddressLabel = new JLabel("Address: ");
        AddressLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        AddressLabel.setBounds(30, 180, 60, 31);
        contentPane.add(AddressLabel);

        JLabel Country = new JLabel(getCountry(userid, pass));
        Country.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Country.setBounds(120, 138, 531, 31);
        contentPane.add(Country);

        JLabel CountryTitleLabel = new JLabel("Country: ");
        CountryTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        CountryTitleLabel.setBounds(30, 138, 60, 31);
        contentPane.add(CountryTitleLabel);

        JLabel InformationTitle = new JLabel("Information: ");
        InformationTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
        InformationTitle.setBounds(30, 104, 95, 23);
        contentPane.add(InformationTitle);
        ClientHubExitButton.setBounds(299, 520, 89, 23);
        contentPane.add(ClientHubExitButton);

        JLabel NameLabel = new JLabel(getUserName(userid, pass));
        NameLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        NameLabel.setBounds(77, 37, 133, 31);
        contentPane.add(NameLabel);

        JLabel ClientHubTitleLabel = new JLabel("Hello, ");
        ClientHubTitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ClientHubTitleLabel.setBounds(30, 37, 46, 31);
        contentPane.add(ClientHubTitleLabel);

        JLabel ClientHubBackgroundLabel = new JLabel("New label");
        ClientHubBackgroundLabel.setIcon(new ImageIcon("Resources/Main_Menu_NoLogo(1).png"));
        ClientHubBackgroundLabel.setBounds(0, 0, 694, 571);
        contentPane.add(ClientHubBackgroundLabel);
    }
}