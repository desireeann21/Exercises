package JavaGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JavaGui implements ActionListener {
	
	private static JLabel userLabel1;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton loginButton;
	private static JLabel success;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("My First Swing Example");
		JPanel panel = new JPanel();
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		//JLabel label = new JLabel();
		
		userLabel1 = new JLabel("Username: ");
		userLabel1.setBounds(10,20,80,25);
        panel.add(userLabel1);
		
        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);
		
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);
        
        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);
        
        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(new JavaGui());
        panel.add(loginButton);
        
        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user +", " + password);
		
		if(user.equals("Alex") && password.equals("des"))
		{
			success.setText("Login successffully");
		}
		else
		{
			success.setText("Access Denied");
		}
	}

}
