package pragmatic.homework.loginScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.sun.imageio.plugins.jpeg.JPEG;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JButton loginButton = new JButton("LOGIN");
	private JLabel userNameLabel = new JLabel("Username");
	private JLabel passWordLabel = new JLabel("Password");
	private JTextField userNameField = new JTextField();
	private JPasswordField passWordField = new JPasswordField();

	public LoginView() {
		createUI();
	}

	private void createUI() {
		setTitle("LoginScreen");
		setSize(350, 155);
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
		userNameField.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				updateButton();

			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				updateButton();

			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				updateButton();

			}
		});
		getContentPane().add(userNameField);
		// password input field
		passWordField.setBounds(100, 40, 160, 25);
		passWordField.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				updateButton();
				
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				updateButton();
				
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				updateButton();
				
			}
		});
		getContentPane().add(passWordField);

		// button login
		loginButton.setBounds(10, 80, 300, 25);
		add(loginButton);
		loginButton.addActionListener(this);
		updateButton();
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
	JOptionPane pane = new JOptionPane();
		pane.showMessageDialog(null, "Success!", "Log In: ", JOptionPane.INFORMATION_MESSAGE);

	}

	private void updateButton() {
		String firstText = userNameField.getText();
		if (firstText == null || firstText.length() <= 0) {
			loginButton.setEnabled(false);
			return;
		}

		@SuppressWarnings("deprecation")
		String secondText = passWordField.getText();
		if (secondText == null || secondText.length() <= 0) {
			loginButton.setEnabled(false);
			return;
		}
		loginButton.setEnabled(true);
	}

}
