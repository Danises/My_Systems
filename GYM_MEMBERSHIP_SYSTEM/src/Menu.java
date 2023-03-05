import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Menu implements ActionListener
{
    private static JButton login,signup,admin;
    private static JLabel home_page_label;
    public void Home_Page()
    {
        NewFrame home_page = new NewFrame();
        home_page.Create_newFrame();

        home_page_label = new JLabel("Home Page");
        home_page_label.setBounds(20,20, 100,25);
        home_page.panel.add(home_page_label);


        //Creating Login, Signup or Admin buttons
        login = new JButton("Log-In");
        login.setBounds(160,150,280,25);
        login.addActionListener(new Menu());
        home_page.panel.add(login);
        //-------------------------------------------------
        signup = new JButton("View Membership Plans & Create Account");
        signup.setBounds(160,190,280,25);
        signup.addActionListener(new Menu());
        home_page.panel.add(signup);
        //-------------------------------------------------
        admin = new JButton("Admin-Login");
        admin.setBounds(160,230,280,25);
        admin.addActionListener(new Menu());
        home_page.panel.add(admin);
    }
        //-------------------------------------------------
        //Method created by Action Listener
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //If the button is pressed, then it will open the correct window.
        if (e.getSource() == login)
        {
            Login login_page = new Login();
            login_page.Log_in();
        }

        if (e.getSource() == signup)
        {
            Membership_signup membership_page = new Membership_signup();
            membership_page.Memberships_and_signup();
        }
        if (e.getSource() == admin)
        {
            Admin admin_account = new Admin();
            admin_account.Admin_Account_only();
        }
    }
}
