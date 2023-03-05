import javax.swing.*;
import java.awt.*;

//Everytime this class is called, it will open up a new empty Frame/Window
public class NewFrame
{
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    public void Create_newFrame()
    {
        frame.setSize(600,500);
        //-------------------------------------------------
        // I programmed this so that the screen is always displayed in the middle.
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension size = toolkit.getScreenSize();
        frame.setLocation(size.width/2 - frame.getWidth()/2, size.height/2 - frame.getHeight()/2);
        //-------------------------------------------------
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setTitle("GYM MEMBERSHIP SYSTEM");
        panel.setLayout(null);
        frame.setVisible(true);
    }
}