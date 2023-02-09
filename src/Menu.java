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
        pan1.setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setTitle("Menu principal");
    }
    @Override
    public void actionPerformed(ActionEvent a){
        if(a.getSource() == b1){
            //REDIRECT TO PATIENT INPUT
        }else{
            if(a.getSource() == b2){
                //REDIRECT TO PATIENT SEARCH
            }else{
                if(a.getSource() == b3){
                    //REDIRECT TO THE ENTIRE PATIENT LIST
                }
            }
        }
    }
    public class MainMenu{
        public static void main(String[] args) {
            try{
                Menu men1 = new Menu();
                men1.setSize(300,100);
                men1.setVisible(true);

            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
}
