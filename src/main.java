import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        Register registerPanel = new Register();
        frame.setContentPane(registerPanel.getMainPanel());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500,500));
        frame.setVisible(true);


    }
}
