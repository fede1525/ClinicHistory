import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
class CreateLogin extends JFrame implements ActionListener{
    JButton b1;
    JPanel panel1;
    JLabel userLabel,passLabel;//Labels for username and password
    JTextField textField1; // Text field for username input
    JPasswordField passField; //Password field for input
    public CreateLogin(){ //Login screen
        userLabel.setText("Nombre de usuario");
        textField1 = new JTextField(20);

        passLabel.setText("Contraseña");
        passField = new JPasswordField(20);

        b1.setText("Entrar"); //"Login" button

        panel1 = new JPanel(new GridLayout(3,1));//Building the panel
        panel1.add(userLabel);
        panel1.add(textField1);
        panel1.add(passLabel);
        panel1.add(passField);
        panel1.add(b1);

        add(panel1,BorderLayout.CENTER);

        b1.addActionListener(this);
        setTitle("Conectarse");
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String userT = textField1.getText();
        String passT = passField.getText();

        if(userT.equals("testusername")&&passT.equals("testpass")){


        }
        else{
            if(!userT.equals("testusername")){
                JOptionPane.showMessageDialog(null,"El nombre de usuario es incorrecto");
            }else{
                if(!passT.equals("")){
                    JOptionPane.showMessageDialog(null,"La contraseña es incorrecta");
                }
            }
        }
    }
}
public class Login{
    public static void main(String[] args) {//Login Main
        try{
            CreateLogin login = new CreateLogin();
            login.setSize(300,100);
            login.setVisible(true);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());//Exception handling
        }
    }
}
