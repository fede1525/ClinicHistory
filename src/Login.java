import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
class CreateLogin extends JFrame implements ActionListener{
    JButton b1;
    JPanel panel1;
    JLabel userLabel,passLabel;//Labels for username and password
    JTextField textField1,textField2;//Text fields for user and password input
    public CreateLogin(){
        userLabel.setText("Nombre de usuario");
        textField1 = new JTextField(20);

        passLabel.setText("Contraseña");
        textField2 = new JTextField(20);

        b1.setText("Entrar"); //"Login" button

        panel1 = new JPanel(new GridLayout(3,1));//Building the panel
        panel1.add(userLabel);
        panel1.add(textField1);
        panel1.add(passLabel);
        panel1.add(textField2);
        panel1.add(b1);

        add(panel1,BorderLayout.CENTER);

        b1.addActionListener(this);
        setTitle("Conectarse");
    }
    public void actionPerformed(ActionEvent ae){
        String userT = textField1.getText();
        String passT = textField2.getText();

        if(userT.equals("testusername")&&passT.equals("testpass")){
            Menu m = new Menu();



        }
        else{
            System.out.println("Ingrése nombre de usuario y contraseña validos"); /*Error message, invalid
            username/password */
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
