package testpackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Login extends JFrame {

	JPanel pnlmain;

	JLabel lblWelcomerMsg = new JLabel("Welcome to xyz Systems Login :"); // to be added to the panel
	JLabel lblUserName = new JLabel("User Name : ");
	JLabel lblPassword = new JLabel("Password : ");
	JTextField txtuserName = new JTextField();
	JTextField txtpassword = new JTextField();
	JButton login = new JButton("Login");

	public Login() {
		this.setSize(500, 500);
		formatComponents();
		intitalize();
	}

	private void formatComponents() {
		// header MSG

		txtpassword.setColumns(10);
		txtuserName.setColumns(10);
		lblWelcomerMsg.setForeground(Color.black);
		lblWelcomerMsg.setFont(Font.getFont("Arial"));

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtuserName.getText().equals("admin") && txtpassword.getText().equals("123")) {
					JOptionPane.showMessageDialog(login, "Loggen in", "Login Message", 1);
				} else {
					JOptionPane.showMessageDialog(login, "Loggen in error ", "Login error Message", 1);
				}
			}
		}); // Action Listner 's Object
	}

	private void intitalize() {
		this.setLayout(new FlowLayout());
		pnlmain = new JPanel();
		pnlmain.setLayout(new FlowLayout());
		pnlmain.setBackground(Color.GREEN);
		pnlmain.setSize(this.getHeight() - 50, this.getWidth() - 50);
		pnlmain.add(this.lblWelcomerMsg);
		pnlmain.add(this.lblUserName);
		pnlmain.add(this.txtuserName);
		pnlmain.add(this.lblPassword);
		pnlmain.add(this.txtpassword);
		pnlmain.add(login);

		this.add(pnlmain);
	}

	public static void main(String[] args) {
		Login login = new Login();
		login.setVisible(true);
	}
}
