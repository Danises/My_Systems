import javax.swing.*;
import java.util.Arrays;

public class Admin_System_Information
{
    private static String[] admin_array;
    private static String[] admin_array2;
    private static String[] admin_array3;
    private static String[] admin_array4;
    private static JLabel home_page_label;
    //-------------------------------------------------

    //This constructor should take all the information of new members
    public void My_array(String user, String password)
    {
        //Converts the variables into a String array.
        admin_array = new String[]{user,password};
    }
    public void My_array1(String user, String password)
    {
        admin_array2 = new String[]{user,password};
    }
    public void My_array2(String user, String password)
    {
        admin_array3 = new String[]{user,password};
    }
    public void My_array3(String user, String password)
    {
        admin_array4 = new String[]{user,password};
    }
    //-------------------------------------------------
    public void Displaying_Data()
    {
        NewFrame displaying = new NewFrame();
        displaying.Create_newFrame();

        home_page_label = new JLabel("Admin System Information: ");
        home_page_label.setBounds(20,20, 300,25);
        displaying.panel.add(home_page_label);

        Signup_Interface receiving_array = new Signup_Interface();
        receiving_array.Passing_array();

        //The array data is displayed on the Admin account

        JLabel label = new JLabel(Arrays.toString(admin_array));
        label.setBounds(200,120,300,25);
        displaying.panel.add(label);
        //---------------------------------------------------
        JLabel label2 = new JLabel(Arrays.toString(admin_array2));
        label2.setBounds(200,140,300,25);
        displaying.panel.add(label2);
        //---------------------------------------------------
        JLabel label3 = new JLabel(Arrays.toString(admin_array3));
        label3.setBounds(200,160,300,25);
        displaying.panel.add(label3);
        //---------------------------------------------------
        JLabel label4 = new JLabel(Arrays.toString(admin_array4));
        label4.setBounds(200,180,300,25);
        displaying.panel.add(label4);
    }
}
