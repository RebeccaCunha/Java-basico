
import javax.swing.*; // Import necessário para o Swing.
import java.awt.event.*; // Import necessário para ActionListener.

public class OlaMundoSwing {

    public static void main(String[] args) {
        // Criando a janela (frame).
        JFrame frame = new JFrame("Minha Primeira Janela"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao fechar a janela.
        frame.setSize(400, 300); // Define o tamanho da janela.

        // Criando a label com uma mensagem.
        JLabel label = new JLabel("Aqui vai aparecer a mensagem", SwingConstants.CENTER); 
        label.setBounds(50, 50, 300, 30); // Define a posição e tamanho da label.

        // Criando um botão.
        JButton button = new JButton("Clique aqui!");
        button.setBounds(150, 150, 100, 30); // Define a posição e tamanho do botão.

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Olá, Mundo!"); // Altera o texto da label ao clicar no botão.
            }
        });
        
        // Adicionando componentes à janela.
        frame.setLayout(null); // Usando layout nulo para posicionamento manual.
        frame.add(label);
        frame.add(button);

        // Exibindo a janela.
        frame.setVisible(true); // Tornando a janela visível.
    }
}
