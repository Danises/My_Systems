import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Account_created implements ActionListener
{
    private static JLabel message, message2;
    private static JButton home_page;
    public void Account_frame()
    {
        NewFrame account = new NewFrame();
        account.Create_newFrame();

        message = new JLabel("Your account has been created successfully!"); //Please log-in to access your account
        message.setBounds(160,100,300,40);
        account.panel.add(message);

        message2 = new JLabel("Please log-in to access your account");
        message2.setBounds(160,120,300,40);
        account.panel.add(message2);

        home_page = new JButton("Home Page");
        home_page.setBounds(230,170,100,50);
        home_page.addActionListener(new Account_created());
        account.panel.add(home_page);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Menu menu = new Menu();
        menu.Home_Page();
    }
}
