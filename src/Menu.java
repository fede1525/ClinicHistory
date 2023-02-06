import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
public class Menu extends JFrame implements ActionListener{
    JButton b1,b2,b3;
    JPanel pan1;

    public Menu(){
        b1.setText("Ingresar un nuevo paciente");
        b2.setText("Buscar un paciente");
        b3.setText("Mostrar lista de pacientes");

        pan1 = new JPanel(new GridLayout(3,1));
        pan1.add(b1);
        pan1.add(b2);
        pan1.add(b3);

        add(pan1,BorderLayout.CENTER);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setTitle("Menu principal");
    }
    public void ActionPerformed(ActionEvent ae){
        //AGREGAR SALTO A CADA OPCION DEL MENU

    }
    public class MainMenu{
        public static void main(String[] args) {
            try{
                Menu men = new Menu();
                men.setSize(300,100);
                men.setVisible(true);
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
}
