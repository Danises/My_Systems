import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin implements ActionListener
{
    private static JLabel usernameLabel, passwordLabel, success, title;
    private static JButton enterButton, home_button;
    private static JPasswordField passwordText;
    private static JTextField userText;

    public void Admin_Account_only()
    {
        NewFrame admin_login = new NewFrame(); //Calling the Class to create a new frame
        admin_login.Create_newFrame();
        //------------------------------------------------- Label
        title = new JLabel("Administrator Log-in");
        title.setBounds(20,20,130,25);
        admin_login.panel.add(title);
        //------------------------------------------------- Username label and text box
        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(150,150,80,25);
        admin_login.panel.add(usernameLabel);

        userText = new JTextField();
        userText.setBounds(230,150,165,25);
        admin_login.panel.add(userText);
        //------------------------------------------------- Creating password label and text box
        //Using a password interface so it can't be seen while typing.
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(150,180,80,25);
        admin_login.panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(230,180,165,25);
        admin_login.panel.add(passwordText);
        //------------------------------------------------- Creating an enter button
        enterButton = new JButton("Enter");
        enterButton.setBounds(150,220,80,25);
        admin_login.panel.add(enterButton);
        enterButton.addActionListener(new Admin());
        //-------------------------------------------------
        //This Label will and button will appear only if the admin credentials are correct
        success = new JLabel("");
        success.setBounds(150,250,300,25);
        admin_login.panel.add(success);

        home_button = new JButton("Back");
        home_button.setBounds(400,410,140,25);
        home_button.addActionListener(new Admin());
        admin_login.panel.add(home_button);
    }
        //-------------------------------------------------
        //Method created by Action Listener
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==enterButton)
        {
            String user = userText.getText(); // Gets what the user inputted in
            String password = passwordText.getText();
            if ((user.equals("Admin")) && (password.equals("password")))
            {
                success.setText("Login successful!");
                Admin_System_Information info = new Admin_System_Information();
                info.Displaying_Data();
            }
        }
       if (e.getSource()==home_button)
       {
           Menu back= new Menu();
           back.Home_Page();
       }
    }
}