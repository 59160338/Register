import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {
    private JTextField txtUsername;
    private JPasswordField pwdPassword;
    private JPasswordField pwdRepassword;
    private JButton btnREGISTER;
    private JButton btnCANCLE;
    private JPanel mainPanel;

    public Register() {
        btnREGISTER.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null,txtUsername.getText()
                        + " " + new String(pwdPassword.getPassword())+ " "+ new String(pwdRepassword.getPassword()));

            }
        });
        btnCANCLE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUsername.setText("");
                pwdPassword.setText("");
                pwdRepassword.setText("");
            }
        });
    }
    public  JPanel getMainPanel (){
        return  mainPanel;
    }
}

