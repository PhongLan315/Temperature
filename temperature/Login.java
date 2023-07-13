package temperature;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener{
    private static JLabel userLabel, success, pasLabel;
    private static JTextField userText;
    private static JPasswordField pasText;
    private static JButton btn;
    Login(){
        JFrame frame = new JFrame("Login Form");
        JPanel panel = new JPanel();
        frame.setSize(350  , 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);        
        
        panel.setLayout(null);
        

        //label user
        userLabel = new JLabel("User");
        userLabel.setBounds(20, 20, 80, 25);
        panel.add(userLabel);
        
        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        //lable pass
        pasLabel = new JLabel("Password");
        pasLabel.setBounds(20, 50, 80, 25);
        panel.add(pasLabel);

        pasText = new JPasswordField();
        pasText.setBounds(100, 50, 165, 25);
        panel.add(pasText);

        //button
         btn = new JButton("Login");
        btn.setBounds(10, 80, 80, 25);
        btn.addActionListener(new Login());
        panel.add(btn);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = pasText.getText();
        if (user.equals("admin") && password.equals("1")) {
            success.setText("Login successful!");
        }else{
            success.setText("Login Fail !");
        }
    }
}
