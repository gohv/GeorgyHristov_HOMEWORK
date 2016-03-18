package pragmatic.homework.loginScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JButton loginButton = new JButton("login");
	private JLabel userNameLabel = new JLabel("Username");
	private JLabel passWordLabel = new JLabel("Password");
	private JTextField userNameField = new JTextField();
	private JPasswordField passWordField = new JPasswordField();

	public LoginView() {
		createUI();
	}

	private void createUI() {
		setTitle("LoginScreen");
		setSize(350, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		// username Field
		userNameLabel.setBounds(10, 10, 80, 25);
		add(userNameLabel);
		// password field
		passWordLabel.setBounds(10, 40, 80, 25);
		add(passWordLabel);
		// username input field
		userNameField.setBounds(100, 10, 160, 25);
		add(userNameField);
		// password input field
		passWordField.setBounds(100, 40, 160, 25);
		add(passWordField);
		// button login
		loginButton.setBounds(10, 80, 300, 25);
		add(loginButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
