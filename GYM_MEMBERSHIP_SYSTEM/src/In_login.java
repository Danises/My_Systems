import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class In_login implements ActionListener
{
    private static NewFrame open = new NewFrame();
    private static JLabel user, image_label, cost_l;
    private static JButton home_button;
    private static ImageIcon image;
    public void In(String name, String membership, String cost)
    {
        open.Create_newFrame();
        user = new JLabel("Welcome " + name + " you have the " + membership);
        user.setBounds(30,20,300,25);
        open.panel.add(user);
        cost_l = new JLabel("The monthly cost will be $" + cost);
        cost_l.setBounds(30,40,300,25);
        open.panel.add(cost_l);

        image = new ImageIcon(getClass().getResource("fitness.jpg")); //delete and replace image later
        image_label = new JLabel(image);
        image_label.setBounds(160,100,280,280);
        open.panel.add(image_label);

        home_button = new JButton("Home Page");
        home_button.setBounds(400,410,140,25);
        home_button.addActionListener(new In_login());
        open.panel.add(home_button);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Menu back = new Menu();
        back.Home_Page();
    }
}
