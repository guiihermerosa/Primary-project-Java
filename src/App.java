

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class App {

    public static void main(String[] args) {
        criarJanela();
    }

    private static void criarJanela() {
        // Criação da janela
        JFrame janela = new JFrame("Minha Primeira Janela");

        // Componentes da interface
        JLabel labelUsuario = new JLabel("Usuário:");
        JTextField campoUsuario = new JTextField();
        JButton botaoEnviar = new JButton("Clique aqui");
        JLabel labelResultado = new JLabel("");

        // Posicionamento dos componentes
        labelUsuario.setBounds(50, 50, 100, 30);
        campoUsuario.setBounds(150, 50, 180, 30);
        botaoEnviar.setBounds(150, 100, 180, 30);
        labelResultado.setBounds(150, 140, 180, 30);

        // Ação do botão
        botaoEnviar.addActionListener(e -> {
            String usuario = campoUsuario.getText();
             if (!usuario.isEmpty()) {
                labelResultado.setText("Bem-vindo, " + usuario + "!");
                // Abre a nova janela
                new SegundaJanela(usuario);
            } else {
                labelResultado.setText("Digite seu nome!");
            }
        });

        // Adiciona os componentes na janela
        janela.add(labelUsuario);
        janela.add(campoUsuario);
        janela.add(botaoEnviar);
        janela.add(labelResultado);

        // Configurações da janela
        janela.setLayout(null);
        janela.setSize(400, 250);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null); // Centraliza a janela na tela
        janela.setVisible(true);
    }
}
