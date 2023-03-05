import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.util.Arrays;

public class Login implements ActionListener
{
    private static JLabel usernameLabel, passwordLabel,  title;//Log-in Windows
    private static JButton enterButton, home_button;
    private static JPasswordField passwordText;
    private static JTextField userText;
    private static String[] credentials_array;
    private static String[] credentials_array2;
    private static String[] credentials_array3;
    private static String[] credentials_array4;
    private static In_login inside = new In_login();

    public void Log_in()
    {
        NewFrame log_in_window = new NewFrame();
        log_in_window.Create_newFrame();

        title = new JLabel("Log-in Window");
        title.setBounds(20,20,130,25);
        log_in_window.panel.add(title);
        //------------------------------------------------- Username label and text box
        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(150,150,80,25);
        log_in_window.panel.add(usernameLabel);

        userText = new JTextField();
        userText.setBounds(230,150,165,25);
        log_in_window.panel.add(userText);
        //------------------------------------------------- Creating password label and text box
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(150,180,80,25);
        log_in_window.panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(230,180,165,25);
        log_in_window.panel.add(passwordText);
        //------------------------------------------------- Creating an enter button
        enterButton = new JButton("Enter");
        enterButton.setBounds(150,220,80,25);
        log_in_window.panel.add(enterButton);
        enterButton.addActionListener(new Login());

        home_button = new JButton("Back");
        home_button.setBounds(400,410,140,25);
        home_button.addActionListener(new Login());
        log_in_window.panel.add(home_button);
    }

    public static void Account_credentials1(String username, String password, String plan, String cost)
    {
        credentials_array = new String[]{username,password, plan, cost};
    }
    public static void Account_credentials2(String username, String password, String plan, String cost)
    {
        credentials_array2 = new String[]{username,password, plan, cost};
    }
    public static   void Account_credentials3(String username, String password, String plan, String cost)
    {
        credentials_array3 = new String[]{username,password, plan, cost};
    }
    public static void Account_credentials4(String username, String password, String plan, String cost)
    {
        credentials_array4 = new String[]{username,password, plan, cost};
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()== enterButton)
        {
            Signup_Interface receiving_credentials = new Signup_Interface();
            receiving_credentials.Passing_credentials();
            String user = userText.getText();
            String pass = passwordText.getText();
            if (user.equals(credentials_array[0]) && pass.equals(credentials_array[1]))
            {
                inside.In(credentials_array[0],credentials_array[2], credentials_array[3]);
            }
            if (user.equals(credentials_array2[0]) && pass.equals(credentials_array2[1]))
            {
                inside.In(credentials_array[0],credentials_array2[2], credentials_array2[3]);

            }
            if (user.equals(credentials_array3[0]) && pass.equals(credentials_array3[1]))
            {
                inside.In(credentials_array[0],credentials_array3[2],credentials_array3[3] );

            }
            if (user.equals(credentials_array4[0]) && pass.equals(credentials_array4[1]))
            {
                inside.In(credentials_array[0],credentials_array4[2], credentials_array4[3]);
            }
        }

        if (e.getSource()==home_button)
        {
            Menu back = new Menu();
            back.Home_Page();
        }
    }
}