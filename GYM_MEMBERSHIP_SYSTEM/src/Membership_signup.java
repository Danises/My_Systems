import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Membership_signup implements ActionListener
{
    private static JLabel membership1, membership2, membership3,m1,m2,m3,m4, m11,m22,m33,m44,m111,m222,m333,m444;
    private static JButton b_membership1, b_membership2, b_membership3, home_button;
    private static String plan;
    private static Signup_Interface mem = new Signup_Interface();
    public void Memberships_and_signup()
    {
        NewFrame mem_signup = new NewFrame();
        mem_signup.Create_newFrame();
        //-------------------------------------------------
        membership1 = new JLabel("Simple Membership Description:");
        membership1.setBounds(30,20,300,25);
        mem_signup.panel.add(membership1);

        b_membership1 = new JButton("Select and sign-up");
        b_membership1.setBounds(400,20,140,25);
        b_membership1.addActionListener(new Membership_signup());
        mem_signup.panel.add(b_membership1);

        //Description of the Simple Membership

        m1 = new JLabel("- Access to all machines available only");
        m1.setBounds(30,40,300,25);
        mem_signup.panel.add(m1);
        m2 = new JLabel("- No Guests allowed");
        m2.setBounds(30,60,300,25);
        mem_signup.panel.add(m2);
        m3 = new JLabel("- No access to other Gym installations");
        m3.setBounds(30,80,300,25);
        mem_signup.panel.add(m3);
        m4 = new JLabel("- Monthly Cost is $10");
        m4.setBounds(30,100,300,25);
        mem_signup.panel.add(m4);
        //-------------------------------------------------
        membership2 = new JLabel("Pro Membership Description:");
        membership2.setBounds(30,160,300,25);
        mem_signup.panel.add(membership2);

        b_membership2 = new JButton("Select and sign-up");
        b_membership2.setBounds(400,160,140,25);
        b_membership2.addActionListener(new Membership_signup());
        mem_signup.panel.add(b_membership2);

        // Description of the Pro membership
        m11 = new JLabel("- Access to all machines available");
        m11.setBounds(30,180,300,25);
        mem_signup.panel.add(m11);
        m22 = new JLabel("- 1 Guest allowed");
        m22.setBounds(30,200,300,25);
        mem_signup.panel.add(m22);
        m33 = new JLabel("- Access to all installations");
        m33.setBounds(30,220,300,25);
        mem_signup.panel.add(m33);
        m44 = new JLabel("- Monthly Cost is $25");
        m44.setBounds(30,240,300,25);
        mem_signup.panel.add(m44);

        //-------------------------------------------------
        membership3 = new JLabel("VIP Membership Description:");
        membership3.setBounds(30,300,300,25);
        mem_signup.panel.add(membership3);

        b_membership3 = new JButton("Select and sign-up");
        b_membership3.setBounds(400,300,140,25);
        b_membership3.addActionListener(new Membership_signup());
        mem_signup.panel.add(b_membership3);

        //Description of the VIP Membership
        m111 = new JLabel("- Access to all machines available");
        m111.setBounds(30,320,300,25);
        mem_signup.panel.add(m111);
        m222 = new JLabel("- Up to 3 guests allowed");
        m222.setBounds(30,340,300,25);
        mem_signup.panel.add(m222);
        m333 = new JLabel("- Access to all installations");
        m333.setBounds(30,360,300,25);
        mem_signup.panel.add(m333);
        m444 = new JLabel("- Monthly Cost is $50");
        m444.setBounds(30,380,300,25);
        mem_signup.panel.add(m444);

        //Implementing new "return to home" button.

        home_button = new JButton("Back");
        home_button.setBounds(400,410,140,25);
        home_button.addActionListener(new Membership_signup());
        mem_signup.panel.add(home_button);

    }

    public void Opening_Same_Window()
    {
        mem.SignUp_Interface();
    }
        //-------------------------------------------------
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b_membership1)
        {
            mem.Member("Simple Membership"); //Naming each label
            mem.SignUp_Interface();
            plan = "Simple Membership";
            mem.getting_plan(plan,"10");
         }
        if (e.getSource() == b_membership2)
        {
            mem.Member("Pro Membership");
            mem.SignUp_Interface();
            plan = "Pro Membership";
            mem.getting_plan(plan,"25");
        }
        if (e.getSource() == b_membership3)
        {
            mem.Member("VIP Membership");
            mem.SignUp_Interface();
            plan = "VIP Membership";
            mem.getting_plan(plan,"50");
        }
        if (e.getSource() == home_button)
        {
            Menu back_to_menu = new Menu();
            back_to_menu.Home_Page();
        }
    }
}