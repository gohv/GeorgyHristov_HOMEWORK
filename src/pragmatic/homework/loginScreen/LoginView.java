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
	private JLabel userNameLabel;
	private JLabel passWordLabel;
	private JTextField userNameField;
	private JPasswordField passWordField;
			
	public void loginFrame(){
		createUI();
	}
	
	private void createUI(){
		setTitle("LoginScreen");
		setSize(3000, 1500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		// userName Text
		userNameLabel.setBounds(10, 10, 80, 25);;
		add(userNameLabel);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
