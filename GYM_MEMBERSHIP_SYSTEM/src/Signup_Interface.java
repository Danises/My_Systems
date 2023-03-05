import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Signup_Interface implements ActionListener
{
    private static JLabel usernameLabel, passwordLabel, title;
    private static JButton enterButton, clear;
    private static JPasswordField passwordText;
    private static JTextField userText;
    private static String mem_cost,mem_plan, membership, user, password,user2,pass2,user3,pass3, user4,pass4;
    private int count = 0;
    private static Account_created account = new Account_created();
    //-------------------------------------------------
    public void Member(String membership_plan)
    {
        membership = membership_plan;
    }
    //-------------------------------------------------
    public void SignUp_Interface()
    {
        NewFrame my_interface = new NewFrame();
        my_interface.Create_newFrame();
        title = new JLabel(membership);
        title.setBounds(20,20,130,25);
        my_interface.panel.add(title);
        //------------------------------------------------- Username label and text box
        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(150,150,80,25);
        my_interface.panel.add(usernameLabel);

        userText = new JTextField();
        userText.setBounds(230,150,165,25);
        my_interface.panel.add(userText);
        //------------------------------------------------- Creating password label and text box
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(150,180,80,25);
        my_interface.panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(230,180,165,25);
        my_interface.panel.add(passwordText);
        //------------------------------------------------- Creating an enter button
        enterButton = new JButton("Enter");
        enterButton.setBounds(150,220,70,25);
        my_interface.panel.add(enterButton);
        enterButton.addActionListener(new Signup_Interface());

        clear= new JButton("Clear");
        clear.setBounds(230,220,70,25);
        my_interface.panel.add(clear);
        clear.addActionListener(new Signup_Interface());
    }
    //-------------------------------------------------

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == clear)
        {
            userText.setText("");
            passwordText.setText("");
        }
        if (e.getSource() == enterButton)
        {
            count++;
            System.out.println(count );

            if ((count == 1 || count == 2 || count == 3 || count == 4) && userText.getText().equals("") && passwordText.getText().equals(""))
            {
                System.out.println("nothing inputted");
            }

            else if (count==1) //Pending to solve, each time a new member data is inputted, save it in order to the assigned array
            {
                user = userText.getText();
                password = passwordText.getText();
                account.Account_frame();
            }
            else if (count==2)
            {
                user2 = userText.getText();
                pass2 = passwordText.getText();
                account.Account_frame();
            }
            else if (count==3)
            {
                user3 = userText.getText();
                pass3 = passwordText.getText();
                account.Account_frame();
            }
            else if (count==4)
            {
                user4 = userText.getText();
                pass4 = passwordText.getText();
                account.Account_frame();
            }
        }
    }
    public void getting_plan(String plan, String cost)
    {
        mem_plan = plan;
        mem_cost = cost;
    }
    //-------------------------------------------------
    public void Passing_array()
    {
        //Passing the user and password to an array list
        //By calling the Constructor
        Admin_System_Information admin_array = new Admin_System_Information();

        admin_array.My_array(user, password);

        admin_array.My_array1(user2,pass2);

        admin_array.My_array2(user3,pass3);

        admin_array.My_array3(user4,pass4);
    }
    //-------------------------------------------------
    public void Passing_credentials()
    {
        Login entering = new Login();
        entering.Account_credentials1(user,password, mem_plan, mem_cost);

        entering.Account_credentials2(user2,pass2,mem_plan, mem_cost );

        entering.Account_credentials3(user3,pass3,mem_plan, mem_cost);

        entering.Account_credentials4(user4,pass4,mem_plan, mem_cost);
    }
}


