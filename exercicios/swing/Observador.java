package swing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Exemplo de Observador");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 150);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null);

        JLabel label = new JLabel("Clique no botão para interagir:");
        JButton botao = new JButton("Clique Aqui");
        
        janela.add(label);
        janela.add(botao);

        botao.addActionListener(e -> {
            System.out.println("Botão foi clicado!");
            label.setText("Você clicou no botão!");
        });

        janela.setVisible(true);
    }
}
