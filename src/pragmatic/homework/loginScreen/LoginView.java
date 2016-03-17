package pragmatic.homework.loginScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JTextField userName;
	private JTextField passWord;
	private JLabel userNameLabel = new JLabel("Username");
	private JLabel passWordLabel = new JLabel("Password");
	private JTextField userNameField;
	private JPasswordField passWordField;
			
	public LoginView(){
		createUI();
	}
	
	private void createUI(){
		setTitle("LoginScreen");
		setSize(350, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		// username Field		
		userNameLabel.setBounds(10, 10, 80, 25);
		add(userNameLabel);
		//password field
		passWordLabel.setBounds(10, 40, 80, 25);
		add(passWordLabel);
	}
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
