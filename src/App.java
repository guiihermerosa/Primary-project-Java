package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class App{
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // Create jFrame  
        JFrame janela = new JFrame();
        // Create jButton
           JLabel labelUsuario = new JLabel("Usuario");
          JButton botao = new JButton("Click me");
          JTextField textField = new JTextField();
          textField.setBounds(100, 200, 200, 30);
          botao.setBounds(100, 300, 200, 30);
          labelUsuario.setBounds(100, 150, 200, 30);
         
         botao.addActionListener(new ActionListener() {   
            @Override
            public void actionPerformed(ActionEvent e) {
              // TODO Auto-generated method stub
              System.out.println("Button clicked!");
              String usuario = textField.getText();
              System.out.println("Usuario: " + usuario);

              throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
             
              
          });

          janela.add(botao);
          janela.add(labelUsuario);
          janela.add(textField);
          janela.setLayout(null);
          //Cria Janela
          janela.setBounds(0 ,0, 400, 400);
          janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          janela.setVisible(true);
        
    }
}