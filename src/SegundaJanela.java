import javax.swing.*;

public class SegundaJanela extends JFrame {

    public SegundaJanela(String nomeUsuario) {
        setTitle("Segunda Janela");
        setSize(300, 200);
        setLayout(null);

        JLabel label = new JLabel("Olá, " + nomeUsuario + "! Esta é a segunda janela.");
        label.setBounds(20, 50, 250, 30);
        add(label);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
